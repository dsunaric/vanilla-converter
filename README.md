# Vanilla-Converter

## Project Overview
In the field of business process automation, BPMN has established itself as the standard. Many companies automate their processes using workflow management systems like Activiti or Camunda BPM. These systems enable direct control and execution of processes using BPMN diagrams.

Although BPMN is a widely accepted standard, many tools use their own formats, which are heavily based on BPMN. With the announced end-of-life for Camunda 7 in 2030, many customers are already transitioning to Camunda 8. Open-source solutions such as [VanillaBP](https://github.com/vanillabp) facilitate this migration by making the underlying workflow engine interchangeable following the principles of hexagonal architecture.

The main challenge is that Camunda 7 and Camunda 8 use different BPMN formats. This requires significant manual effort to convert process models from one format to another.

### Goal
The objective of this project is to develop a CLI application that automates the transformation of Camunda 7 models into Camunda 8 models, enabling a smooth transition between these versions.

## Timeline
- **Project Start:** November 1, 2024
- **Project Completion:** June 2025

## Expected Outcome
The result of this project is a CLI application that converts Camunda 7 models into Camunda 8 models. After project completion, the software will be integrated into VanillaBP to enhance it as a comprehensive tool for migrating from Camunda 7 to Camunda 8.

The source code will be made available as an open-source project on GitHub.


## Examples

- [Taxiride Blueprint](src/main/resources/examples/taxiride-blueprint): A qualitative Analysis using the the converter on the [TaxiRide Blueprint Project](https://github.com/phactum/taxiride-blueprint)
- [ELMO](src/main/resources/examples/elmo): A quantitive performance analysis using the converter on the [ELMO Project](https://github.com/stephanpelikan/elmo)
- [BPMN Examples](src/main/resources/examples/bpmn-examples): Some BPMN example Mappings

## XML Schemas
As part of this project, XML Schemas were created to support both Camunda 7 and Camunda 8 BPMN models (including Zeebe-specific extensions).  
These schemas are available in the repository under:  
[vanilla-converter/src/main/resources/schema](https://github.com/dsunaric/vanilla-converter/tree/main/src/main/resources/schema)

They can be used for validation, tooling support, or integration into custom editors and IDEs.

## Supported Elements

### Tasks

| Element              | Supported |
|------------------------|-----------|
| Service Task          | ✅        |
| Send Task            | ✅        |
| User Task            | ✅        |
| Business Rule Task   | ✅        |
| Script Task         | ❌        |
| Receive Task        | ✅        |
| Manual Task         | ✅        |

### Gateways & Sequence Flows

| Element                              | Supported |
|--------------------------------------|-----------|
| Exclusive Gateway                         | ✅   |
| Conditional / default sequence flows | ✅   |
| Parallel Gateway                          | ✅   |
| Inclusive Gateway                         | ✅   |
| Event based Gateway                       | ✅   |
| Complex Gateway                      | ❎   |

### Task Markers

| Element              | Supported |
|------------------------|--------|
| Multi Instance Parallel            | ✅ |
| Multi Instance Sequential          | ✅ |
| Ad-Hoc                             | ❎ |
| Compensation                       | ✅ |
| Loop                               | ❎ |

### Subprocess

| Element              | Supported |
|------------------------|-----------|
| Embedded Subprocess                | ✅   |
| Call activity                      | ✅   |
| Event subprocess                   | ✅   |
| Transaction Subprocess             | ❎   |

### Events

|Type | Start       |  |  | Intermediate |  |  |  | End |  
|----|----|----|----|----|----|----|----|----|  
|                | Normal       | Event Sub Process | Event Sub Process Non-interrupt | Catch  | Boundary | Boundary Non-interrupt | Throw  | Normal |  
| **None**           | ✅           | -                 |  -                            | -     |  -     | -                    | -     | ✅       |  
| **Message**        | ✅           | ✅                | ✅                           | ✅     | ✅       | ✅              | ✅     |-      |  
| **Timer**          | ✅           | ✅                | ✅                           | ✅     | ✅       | ✅               | -     |-      |  
| **Conditional**    | ❎          | ❎               | ❎                          | ❎    | ❎      | ❎               |-      | -       |  
| **Link**           |  -            | -                |  -                             | ✅     | -        | -               | ✅      |-        |  
| **Signal**         | ✅           | ✅                | ✅                           | ✅     | ✅       | ✅               | ✅     | ✅     |  
| **Error**          | -             | ✅                | -                              | -     |  ✅        | -               | -       | ✅     |  
| **Escalation**     | -             | ✅                | ✅                           | -       | ✅       | ✅              | ✅     | ✅     |  
| **Termination**    | -             | -                  | -                           |   -     |  -        | -                   | -       | ✅     |  
| **Compensation**   |-              | ❎               | -                              | -    | ✅         | -               | -       | ✅     |  
| **Cancel**         |-              | -                |   -                            | -    |  ❎        |   -                | -      | ❎    |  
| **Multiple**       | ❎          | ❎               | ❎                          | ❎    | ❎      | ❎               | ❎    | ❎    |  
| **Multiple Parallel** | ❎        | ❎               | ❎                          | ❎    | ❎      | ❎              | ❎    | ❎    |  

✅ → Done

❌ → To Do

❎ →  Not Supported Yet by Camunda 8 - see [BPMN Coverage](https://docs.camunda.io/docs/8.7/components/modeler/bpmn/bpmn-coverage/)

## Usage

This application transforms BPMN files by mapping their contents using custom logic. To use the application, follow these steps:

## Requirements

To run or build the Vanilla Converter CLI application, ensure the following dependencies are installed:
- Runtime: **Java 17 or higher**  
  The application requires Java 17+ to run.

- Build Tool: **Apache Maven 3.6 or higher**  
  Maven is used for building the project and managing dependencies.


### Running the Application
To run the application, pass the path to a BPMN file as a command-line argument.

#### Example Usage:

1. **From the command line:**
   To transform a single Camunda 7 *.bpmn* file:
```
java -jar vanilla-transfomer.jar /path/to/your/file.bpmn
```

To transform a whole folder with Camunda 7 *.bpmn* files:
```
java -jar vanilla-transfomer.jar /path/to/your/files
```

This will read the BPMN file(s) from the specified path, transform it, and save the transformed file in the same location with a `-transformed` suffix.

2. **If the file path is missing or invalid:**
   The application will log an error message and exit.

#### Parameters:

- **filePath** (required): The path to the BPMN file(s) you want to transform.

The transformed file(s) will be saved with the same name as the original BPMN file(s) but with the `-transformed` suffix added to the filename.

### Example Output:

For an input file `process.bpmn`, the transformed file will be saved as `process-transformed.bpmn`.
See [examples](https://github.com/dsunaric/vanilla-converter/tree/main/src/main/resources/examples) for mapping examples

### Logging

Logs are generated to track the process. Look out for any error messages or transformation details in the console output.

## Mapping Table

### Definitions, Processes and Subprocesses
| BPMN Element        | Camunda 7 Element                            | Description                        | Camunda 7 XML Representation                                                                                                                                        | Mapped to Camunda 8 Element                                                                                                                                                                                                                                                                                          |
|---------------------|----------------------------------------------|------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Definitions         | Definitions modeler:executionPlatform        | Modeler Execution Platform         | `modeler:executionPlatform="Camunda Platform"`                                                                                                                      | `modeler:executionPlatform="Camunda Cloud"`                                                                                                                                                                                                                                                             |
| Definitions         | Definitions modeler:executionPlatformVersion | Modeler Execution Platform Version | `modeler:executionPlatformVersion="7.21.0"`                                                                                                                         | `modeler:executionPlatformVersion="8.6.0"`                                                                                                                                                                                                                                                              |
| Process             | Delegate Expression                          | No Mapping                         | `<bpmn:process isExecutable="true" name="Service Task" id="Process-ID">`                                                                                            | `<bpmn:process isExecutable="true" name="Service Task" id="Process-ID">`                                                                                                                                                                                                                                |
| Embedded SubProcess       | SubProcess                                        | No Mapping                           | `<bpmn:subProcess id="Activity_0ga5y3z" name="embeddedsubprocess"></bpmn:subProcess>`                                                                               | `<bpmn:subProcess id="Activity_0ga5y3z" name="embeddedsubprocess"></bpmn:subProcess`                                                                                                                                                                                                     |
| Event Subprocess          | SubProcess Trigered By Event                      | No Mapping                           | `<bpmn:subProcess id="Activity_0m90aac" name="eventsubprocess" triggeredByEvent="true"><bpmn:startEvent id="Event_1yx1h83">[…]</bpmn:startEvent></bpmn:subProcess>` | `<bpmn:subProcess id="Activity_0m90aac" name="eventsubprocess"triggeredByEvent="true"><bpmn:startEvent id="Event_1yx1h83"><bpmn:errorEventDefinition id="ErrorEventDefinition_1fr4x3m"/></bpmn:startEvent></bpmn:subProcess>`                                                             |

### Tasks

| BPMN Element        | Camunda 7 Element                | Description                                          | Camunda 7 XML Representation                                                                                                                                                                                                                                                                                                                                              | Mapped to Camunda 8 Element                                                                                                                                                                                                                            |
| ------------------ | ----------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Service Task       | Service Task using Delegate Expression    | Java Bean implementing the JavaDelegate Interface                                                                | `<bpmn:serviceTask id="Service-Task-2" name="DelegateExpression" camunda:delegateExpression="${SomeDelegateExpression}"></bpmn:serviceTask>\`                                                                                                                                                                                                                             | `<bpmn:serviceTask name="DelegateExpression" id="Service-Task-2"><bpmn:extensionElements><zeebe:taskDefinitiontype="SomeDelegateExpression"/></bpmn:extensionElements></bpmn:serviceTask>`                                                |
| Service Task       | Service Task using Expression             | The method of a Java Bean                                                                                        | `<bpmn:serviceTask id="Service-Task-1" name="Expression" camunda:expression="${SomeExpression}">...</bpmn:serviceTask>`                                                                                                                                                                                                                                                   | `<bpmn:serviceTask name="Expression" id="Service-Task-1"camunda:expression="${SomeExpression}"><bpmn:extensionElements><zeebe:taskDefinitiontype="SomeExpression"/></bpmn:extensionElements>...</bpmn:serviceTask>`                       |
| Service Task       | Service Task using Java Class             | A Java Class implementing the JavaDelegate interface                                                             | `<bpmn:serviceTask id="Service-Task-3" name="Class" camunda:class="org.camunda.bpm.MyJavaDelegate">...</bpmn:serviceTask>`                                                                                                                                                                                                                                                | `<bpmn:serviceTask id="Activity_1km4t22" name="Task"><bpmn:extensionElements><zeebe:taskDefinitiontype="asd"/></bpmn:extensionElements>...</bpmn:serviceTask>`                                                                            |
| Send Task          | Send Task using Delegate Expression       | Java Bean implementing the JavaDelegate Interface                                                                | `<sendTask id="beanService" name="MyBeanServiceTask" camunda:delegateExpression="${myDelegateBean}"/>`                                                                                                                                                                                                                                                                    | `<bpmn:sendTask id="Activity_1km4t22" name="Task"><bpmn:extensionElements><zeebe:taskDefinitiontype="asd"/></bpmn:extensionElements></bpmn:serviceTask>`                                                                                  |
| Send Task          | Send Task using Expression                | The method of a Java Bean                                                                                        | `<sendTask id="expressionService" name="MyExpressionServiceTask" camunda:expression="${myBean.doWork()}"/>`                                                                                                                                                                                                                                                               | `<bpmn:sendTask id="Activity_1km4t22" name="Task"><bpmn:extensionElements><zeebe:taskDefinitiontype="asd"/></bpmn:extensionElements></bpmn:serviceTask>`                                                                                  |
| Send Task          | Send Task using Java Class                | A Java Class implementing the JavaDelegate interface                                                             | `<sendTask id="javaService" name="MyJavaServiceTask" camunda:class="org.camunda.bpm.MyJavaDelegate"/>`                                                                                                                                                                                                                                                                    | `<bpmn:sendTask id="Activity_1km4t22" name="Task"><bpmn:extensionElements><zeebe:taskDefinitiontype="asd"/></bpmn:extensionElements></bpmn:serviceTask>`                                                                                  |
| Business Rule Task | Business Rule Task using Delegate Expression | Java Bean implementing the JavaDelegate Interface                                                                | `<sendTask id="beanService" name="MyBeanServiceTask" camunda:delegateExpression="${myDelegateBean}"/>`                                                                                                                                                                                                                                                                    | `<bpmn:sendTask id="Activity_1km4t22" name="Task"><bpmn:extensionElements><zeebe:taskDefinitiontype="asd"/></bpmn:extensionElements></bpmn:serviceTask>`                                                                                  |
| Business Rule Task | Business Rule Task using Expression       | The method of a Java Bean                                                                                        | `<sendTask id="expressionService" name="MyExpressionServiceTask "camunda:expression="${myBean.doWork()}"/>`                                                                                                                                                                                                                                                               | `<bpmn:sendTask id="ID" name="Task"><bpmn:extensionElements><zeebe:taskDefinitiontype="asd"/></bpmn:extensionElements></bpmn:serviceTask>`                                                                                                |
| Business Rule Task | Business Rule Task using Java Class       | A Java Class implementing the JavaDelegate interface                                                             | `<sendTask id="javaService" name="MyJavaServiceTask" camunda:class="org.camunda.bpm.MyJavaDelegate"/>`                                                                                                                                                                                                                                                                    | `<bpmn:sendTask id="ID" name="Task"><bpmn:extensionElements><zeebe:taskDefinitiontype="asd"/></bpmn:extensionElements></bpmn:serviceTask>`                                                                                                |
| Business Rule Task | Business Rule Task using a DMN            | Reference to a DMN decision Document                                                                             | `<bpmn:businessRuleTask id="ID" name="Task" camunda:resultVariable="result" camunda:decisionRef="test" camunda:decisionRefTenantid="tenant"/>`                                                                                                                                                                                                                            | `<bpmn:businessRuleTask id="ID" name="Task"><bpmn:extensionElements><zeebe:calledDecisiondecision id="test"resultVariable="result"/></bpmn:extensionElements>`                                                                            |
| Receive Task       | Receive Task                              | No Mapping                                                                                                       | `<bpmn:receiveTask id="ID" name="Task" messageRef="Message_1f3rn3s"/>`                                                                                                                                                                                                                                                                                                    | `<bpmn:receiveTask id="ID" name="Task" messageRef="Message_1f3rn3s"/>`                                                                                                                                                                    |
| User Task          | User Task using formRef                   | formRef is Mapped to zeebe:formDefinition formId                                                                 | `<bpmn:userTask id="Activity_08uz7wh" name="Camunda Forms" camunda:formRef="FORM-ID" camunda:formRefBinding="latest">`<br>`    </bpmn:userTask>`                                                                                                                                                                                                                            | `<bpmn:userTask id="Activity_1xo12iu" name="Camunda Form">`<br>`      <bpmn:extensionElements>`<br>`        <zeebe:userTask />`<br>`        <zeebe:formDefinition formid="FORM-ID" />`<br>`      </bpmn:extensionElements>`<br>`    </bpmn:userTask>` |
| User Task          | User Task using formKey                   | formKey is Mapped to zeebe:formDefinition formId                                                                 | `<bpmn:userTask id="Activity_0lz3mn5" name="Embedded or external task form" camunda:formKey="FORM-ID">`<br>`    </bpmn:userTask>`<br>``                                                                                                                                                                                                                                       | `<bpmn:userTask id="Activity_1xo12iu" name="Camunda Form">`<br>`      <bpmn:extensionElements>`<br>`        <zeebe:userTask />`<br>`        <zeebe:formDefinition formid="FORM-ID" />`<br>`      </bpmn:extensionElements>`<br>`    </bpmn:userTask>` |
| User Task          | UserTask using Generated Task Forms       | DEPRECATED Method - No Mapping implemented                                                                       | `<bpmn:userTask id="Activity_01mdtvn" name="Generated Task Form">`<br>`      <bpmn:extensionElements>`<br>`        <camunda:formData />`<br>`      </bpmn:extensionElements>`<br>`    </bpmn:userTask>`                                                                                                                                                                           | `<bpmn:userTask id="Activity_01mdtvn" name="Generated Task Form">`<br>`      <bpmn:extensionElements>`<br>`        <camunda:formData />`<br>`      </bpmn:extensionElements>`<br>`    </bpmn:userTask>`                                           |
| Manual Task        | Manual Task                               | No Mapping                                                                                                       | `<bpmn:manualTask id="Task1" name="ReceiveTask"></bpmn:manualTask>`                                                                                                                                                                                                                                                                                                       | `<bpmn:manualTask id="Task1" name="ReceiveTask"></bpmn:manualTask>`                                                                                                                                                                       |
| Call Activity      | Call Activity                             | calledElement is mapped to processId. Variable propagation is mapped from camunda:in to propagateAllChildVariables | `<bpmn:callActivity id="CallActivity_01mdtvn" name="CallActivity" camunda:asyncBefore="true" camunda:asyncAfter="true" calledElement="calledElement">`<br>`      <bpmn:extensionElements>`<br>`        <camunda:in variables="all" />`<br>`        <camunda:in businessKey="#{execution.processBusinessKey}" />`<br>`      </bpmn:extensionElements>`<br>`    </bpmn:callActivity>` | `<bpmn:callActivity id="TEST">`<br>`      <bpmn:extensionElements>`<br>`        <zeebe:calledElement processid="CalledElement" propagateAllChildVariables="true" />`<br>`      </bpmn:extensionElements>`<br>`    </bpmn:callActivity>`           |

### Gateways & Sequence Flows

| BPMN Element                              | Description                | Camunda 7 XML Representation   | Mapped to Camunda 8 Element |
|-------------------------------------------|--------------------|----------------------------|-----------------|
| Sequence Flow with a condition Expression | Mapping fo FEEL epression                                                                                 |`<bpmn:sequenceFlow id="Flow_0c1f5x0"sourceRef="Gateway_025xtrc"targetRef="Event_0dezcp0">`<br>`<bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${false}</bpmn:conditionExpression>`<br>`</bpmn:sequenceFlow>` | `<bpmn:sequenceFlow id="Flow_1x27att"sourceRef="Gateway_13007ix"targetRef="Event_0dezcp0">`<br>`<bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">=false</bpmn:conditionExpression>`<br>`</bpmn:sequenceFlow>` |
| Exclusive Gateway with a default Flow     | No Mapping                                                                                                | `<bpmn:exclusiveGateway id="Gateway_025xtrc" default="Flow_1w6kevx"></bpmn:exclusiveGateway>`                                                                                                                          | `<bpmn:exclusiveGateway id="Gateway_025xtrc" default="Flow_1w6kevx"></bpmn:exclusiveGateway>`                                                                                                                        |
| Event  Based Gateway                      | No Mapping                                                                                                | `<bpmn:eventBasedGateway id="Gateway_1c33bej"> </bpmn:eventBasedGateway>`                                                                                                                                              | `<bpmn:eventBasedGateway id="Gateway_1c33bej"> </bpmn:eventBasedGateway>`                                                                                                                                            |
| Paralell Gateway                          | No Mapping                                                                                                | `<bpmn:parallelGateway id="Gateway_025xtrc"></bpmn:parallelGateway>`                                                                                                                                                   | `<bpmn:parallelGateway id="Gateway_025xtrc"></bpmn:parallelGateway>`                                                                                                                                                 |
| Inclusive Gateway                         | No Mapping                                                                                                | `<bpmn:inclusiveGateway default="Flow_07zt34w" id="Gateway_1ad2mvj">...</bpmn:inclusiveGateway>`                                                                                                                       | `<bpmn:inclusiveGateway default="Flow_07zt34w" id="Gateway_1ad2mvj">...</bpmn:inclusiveGateway>`                                                                                                                     |
| Sequence Flows after an Inclusive Gateway | *not implemented*: Sequence flows with no expression after an exclusive Gateway need to be mapped to TRUE | `<bpmn:sequenceFlow id="Flow_0c1f5x0"sourceRef="Gateway_025xtrc"targetRef="Event_0dezcp0"></bpmn:sequenceFlow>`                                                                                                        | `<bpmn:sequenceFlow id="Flow_0c1f5x0"sourceRef="Gateway_025xtrc"targetRef="Event_0dezcp0">`<br>`<bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">=true</bpmn:conditionExpression>`<br>`</bpmn:sequenceFlow>`  |

### Events

| BPMN Element      | Camunda 7 Element                | Description                | Camunda 7 XML Representation                                                                                                                                                                |  Mapped to Camunda 8 Element                                                                                                                                                                                                                                                                                   |
|-------------------|----------------------------------|----------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Event              | End Event                                     | No Mapping                 | `<bpmn:endEvent id="Event_1ox7dw2">[…]</bpmn:endEvent> `                                                                                                                                    | `<bpmn:endEvent id="Event_1ox7dw2">[…]</bpmn:endEvent>`                                                                                                                                    |
| Event              | Start Event                                   | No Mapping                 | `<bpmn:startEvent id="StartEvent_1">[…] </bpmn:startEvent> `                                                                                                                                | `<bpmn:startEvent id="StartEvent_1">[…] </bpmn:startEvent>`                                                                                                                                |
| Event              | Intermediate Throw Event                      | No Mapping                 | `<bpmn:intermediateThrowEvent id="Event_1ia6n3u">[…]</bpmn:intermediateThrowEvent> `                                                                                                        | `<bpmn:intermediateThrowEvent id="Event_1ia6n3u">[…]</bpmn:intermediateThrowEvent>`                                                                                                        |
| Event              | Intermediate Catch Event                      | No Mapping                 | `<bpmn:intermediateCatchEvent id="Event_1jer9fu">[…]</bpmn:intermediateCatchEvent>`                                                                                                         | `<bpmn:intermediateCatchEvent id="Event_1jer9fu">[…]</bpmn:intermediateCatchEvent>`                                                                                                        |
| Event              | Boundary Event interrupting                   | No Mapping                 | `<bpmn:boundaryEvent id="Event_03jkqii" attachedToRef="Activity_01a0gds" >[...]</bpmn:boundaryEvent>`                                                                                       | `<bpmn:boundaryEvent id="Event_03jkqii" attachedToRef="Activity_01a0gds" >[...]</bpmn:boundaryEvent>`                                                                                      |
| Event              | Boundary Event non-interrupting               | No Mapping                 | `<bpmn:boundaryEvent id="Event_03jkqii" attachedToRef="Activity_01a0gds" cancelActivity="false">[...]</bpmn:boundaryEvent>`                                                                 | `<bpmn:boundaryEvent id="Event_03jkqii" attachedToRef="Activity_01a0gds" cancelActivity="false">[...]</bpmn:boundaryEvent> `                                                               |
| Timer Event        | Event Embedding TimerEventDefinition          | No Mapping                 | `<bpmn:startEvent id="Event_02id3ly" name="start"><bpmn:timerEventDefinition id="TimerEventDefinition_0o1b0mn">[…]</bpmn:timerEventDefinition></bpmn:startEvent>`                           | `<bpmn:startEvent id="Event_02id3ly" name="start"><bpmn:timerEventDefinition id="TimerEventDefinition_0o1b0mn">[…]</bpmn:timerEventDefinition></bpmn:startEvent>`                          |
| Timer Event        | Timer Event Definition                        | No Mapping                 | `<bpmn:timerEventDefinition id="TimerEventDefinition_0uwwwmc">[…]</bpmn:timerEventDefinition>`                                                                                              | `<bpmn:timerEventDefinition id="TimerEventDefinition_0uwwwmc">[…]</bpmn:timerEventDefinition>`                                                                                             |
| Timer Event        | TimeDuration Embedded in TimerEventDefinition | No Mapping                 | `<bpmn:timerEventDefinition id="TimerEventDefinition_0i1neg9"><bpmn:timeDuration xsi:type="bpmn:tFormalExpression">P10D</bpmn:timeDuration></bpmn:timerEventDefinition>`                    | `<bpmn:timerEventDefinition id="TimerEventDefinition_0i1neg9"><bpmn:timeDuration xsi:type="bpmn:tFormalExpression">P10D</bpmn:timeDuration></bpmn:timerEventDefinition>`                   |
| Timer Event        | TimeCycle Embedded in TimerEventDefinition    | No Mapping                 | `<bpmn:timerEventDefinition id="TimerEventDefinition-ID"><bpmn:timeCycle xsi:type="bpmn:tFormalExpression">R/P1D</bpmn:timeCycle></bpmn:timerEventDefinition>`                              | `<bpmn:timerEventDefinition id="TimerEventDefinition-ID"><bpmn:timeCycle xsi:type="bpmn:tFormalExpression">R/P1D</bpmn:timeCycle></bpmn:timerEventDefinition>`                             |
| Timer Event        | TimeDate Embedded in TimerEventDefinition     | No Mapping                 | `<bpmn:timerEventDefinition id="TimerEventDefinition_1xp8s1f"><bpmn:timeDate xsi:type="bpmn:tFormalExpression">2025-05-11T13:13:14Z</bpmn:timeDate></bpmn:timerEventDefinition>`            | `<bpmn:timerEventDefinition id="TimerEventDefinition_1xp8s1f"><bpmn:timeDate xsi:type="bpmn:tFormalExpression">2025-05-11T13:13:14Z</bpmn:timeDate></bpmn:timerEventDefinition>`           |
| Error Event        | Event Embedding ErrorEventDefiniton           | No Mapping                 | `<bpmn:startEvent id="Event_1jklu7j"><bpmn:errorEventDefinition id="ErrorEventDefinition_1vyfmxs"errorRef="Error_1juaxir"/></bpmn:startEvent>`                                              | `<bpmn:startEvent id="Event_1jklu7j"><bpmn:errorEventDefinition id="ErrorEventDefinition_1vyfmxs"errorRef="Error_1juaxir"/></bpmn:startEvent>`                                             |
| Error Event        | ErrorEventDefinition                          | No Mapping                 | `<bpmn:errorEventDefinition id="ErrorEventDefinition_1vyfmxs"errorRef="Error_1juaxir"/>`                                                                                                    | `<bpmn:errorEventDefinition id="ErrorEventDefinition_1vyfmxs"errorRef="Error_1juaxir"/>`                                                                                                   |
| Terminate Event    | Event Embedding TerminateEventDefiniton       | No Mapping                 | `<bpmn:startEvent id="Event_1jklu7j"><bpmn:terminateEventDefinition id="TerminateEventDefinition_0zmeyum"/></bpmn:startEvent>`                                                              | `<bpmn:startEvent id="Event_1jklu7j"><bpmn:terminateEventDefinition id="TerminateEventDefinition_0zmeyum"/></bpmn:startEvent>`                                                             |
| Terminate Event    | TerminateEventDefiniton                       | No Mapping                 | `<bpmn:terminateEventDefinition id="TerminateEventDefinition_0zmeyum"/>`                                                                                                                    | `<bpmn:terminateEventDefinition id="TerminateEventDefinition_0zmeyum"/>`                                                                                                                   |
| Signal Event       | Event Embedding SignalEventDefiniton          | No Mapping                 | `<bpmn:startEvent id="StartEvent_1" name="signalstartevent"><bpmn:signalEventDefinition id="SignalEventDefinition_07ouece"signalRef="Signal_15hfc4f"/></bpmn:startEvent>`                   | `<bpmn:startEvent id="StartEvent_1" name="signalstartevent"><bpmn:signalEventDefinition id="SignalEventDefinition_07ouece"signalRef="Signal_15hfc4f"/></bpmn:startEvent>`                  |
| Signal Event       | SignalEventDefiniton without signalRef        | No Mapping                 | `<bpmn:signalEventDefinition id="SignalEventDefinition_1jknmle"/>`                                                                                                                          | `<bpmn:signalEventDefinition id="SignalEventDefinition_1jknmle"/>`                                                                                                                         |
| Signal Event       | SignalEventDefiniton with signalRef           | No Mapping                 | `<bpmn:signalEventDefinition id="SignalEventDefinition_14oh641" signalRef="Signal_15hfc4f"/>`                                                                                               | `<bpmn:signalEventDefinition id="SignalEventDefinition_14oh641" signalRef="Signal_15hfc4f"/>`                                                                                              |
| Message Event      | Event Embedding MessageEventDefiniton         | No Mapping                 | `<bpmn:startEvent id="StartEvent_1" name="signalstartevent"><bpmn:messageEventDefinition id="MessageEventDefinition_10iff48" messageRef="Message_3m61ifb" /></bpmn:startEvent>`             | `<bpmn:startEvent id="StartEvent_1" name="signalstartevent"><bpmn:messageEventDefinition id="MessageEventDefinition_10iff48" messageRef="Message_3m61ifb" /></bpmn:startEvent>`            |
| Message Event      | MessageEventDefiniton                         | No Mapping                 | `<bpmn:messageEventDefinition id="MessageEventDefinition_10iff48" messageRef="Message_3m61ifb" />`                                                                                          | `<bpmn:messageEventDefinition id="MessageEventDefinition_10iff48" messageRef="Message_3m61ifb" />`                                                                                         |
| Escalation Event   | Event Embedding EscalationEventDefiniton      | No Mapping                 | `<bpmn:startEvent id="StartEvent_1" name="signalstartevent"><bpmn:escalationEventDefinition id="EscalationEventDefinition_0rvh49o" escalationRef="Escalation_3jdr0vo" /></bpmn:startEvent>` | `<bpmn:startEvent id="StartEvent_1" name="signalstartevent"><bpmn:escalationEventDefinition id="EscalationEventDefinition_0rvh49o" escalationRef="Escalation_3jdr0vo" /></bpmn:startEvent>` |
| Escalation Event   | escalationEventDefinition                     | No Mapping                 | `<bpmn:escalationEventDefinition id="EscalationEventDefinition_0rvh49o" escalationRef="Escalation_3jdr0vo" />`                                                                              | `<bpmn:escalationEventDefinition id="EscalationEventDefinition_0rvh49o" escalationRef="Escalation_3jdr0vo" />`                                                                             |
| Termination Event  | Event Embedding TeminationEventDefiniton      | No Mapping                 | `<bpmn:startEvent id="StartEvent_1" name="signalstartevent"> <bpmn:terminateEventDefinition id="TerminateEventDefinition_1613nxv" /></bpmn:startEvent>`                                     | `<bpmn:startEvent id="StartEvent_1" name="signalstartevent"> <bpmn:terminateEventDefinition id="TerminateEventDefinition_1613nxv" /></bpmn:startEvent>`                                    |
| Termination Event  |                                               | No Mapping                 | `<bpmn:terminateEventDefinition id="TerminateEventDefinition_1613nxv" />`                                                                                                                   | `<bpmn:terminateEventDefinition id="TerminateEventDefinition_1613nxv" />`                                                                                                                 |
| Link Event         | Event Embedding LinkEventDefiniton            | No Mapping                 | `<bpmn:startEvent id="StartEvent_1" name="signalstartevent"> <bpmn:linkEventDefinition id="LinkEventDefinition_197jgkh" name="test" /></bpmn:startEvent>`                                   | `<bpmn:startEvent id="StartEvent_1" name="signalstartevent"> <bpmn:linkEventDefinition id="LinkEventDefinition_197jgkh" name="test" /></bpmn:startEvent>`                                  |
| Link Event         | linkEventDefinition                           | No Mapping                 | `<bpmn:linkEventDefinition id="LinkEventDefinition_197jgkh" name="test" />`                                                                                                                 | `<bpmn:linkEventDefinition id="LinkEventDefinition_197jgkh" name="test" />`                                                                                                               |
| Compensation Event | Event Embedding CompensateEventDefiniton      | No Mapping                 | `<bpmn:startEvent id="StartEvent_1" name="signalstartevent"> <bpmn:compensateEventDefinition id="CompensateEventDefinition_13ie6wm" /></bpmn:startEvent>`                                   | `<bpmn:startEvent id="StartEvent_1" name="signalstartevent"> <bpmn:compensateEventDefinition id="CompensateEventDefinition_13ie6wm" /></bpmn:startEvent> `                                 |
| Compensation Event | CompensateEventDefinition                     | No Mapping                 | `<bpmn:compensateEventDefinition id="CompensateEventDefinition_13ie6wm" />`                                                                                                                 | `<bpmn:compensateEventDefinition id="CompensateEventDefinition_13ie6wm" />`                                                                                                                |

### Message, Signal, Escalation & Error Definition
| BPMN Element      | Camunda 7 Element            | Description                | Camunda 7 XML Representation                                                                      | Mapped to Camunda 8 Element                                                                                                                                                                            |
|-------------------|------------------------------|----------------------------|---------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Message            | Message                      | No Mapping                 | `<bpmn:message id="Message_1f3rn3s" name="Message_1f3rn3s"/>`                                     | `<bpmn:message id="Message_1ms80d0" name="Message_1ms80d0"><bpmn:extensionElements><zeebe:subscriptioncorrelationKey="=correlationkey"/></bpmn:extensionElements></bpmn:message> `      |
| Signal             | Signal                       | No Mapping                 | `<bpmn:signal id="Signal_1ntahfj" name="Signal_1ntahfj"/>`                                        | `<bpmn:signal id="Signal_1ntahfj" name="Signal_1ntahfj"/>`                                                                                                                              |
| Escalation         | Escalation                   | No Mapping                 | `<bpmn:escalation id="Escalation_10r9vlb" name="Escalation_10r9vlb" escalationCode="123" />`      | `<bpmn:escalation id="Escalation_10r9vlb" name="Escalation_10r9vlb" escalationCode="123" />`                                                                                            |
| Error              | Error                        | errorMessage is not mapped | `<bpmn:error id="Error_1juaxir" name="Error_3fdsro8"errorCode="TEST"camunda:errorMessage="msg"/>` | `<bpmn:error id="Error_03raddb" name="Error_0v6bd9m"errorCode="TEST"/>`                                                                                                                 |


### Task Markers
| BPMN Element      | Camunda 7 Element            | Description                | Camunda 7 XML Representation                                                                                                                                         |  Mapped to Camunda 8 Element                                                                                                                                                                            |
|-------------------|------------------------------|----------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Parallel Multi Instance   | MultiInstanceLoopCharacteristics embedded in Task | Mapped to zeebee:loopcharacteristics | `<bpmn:multiInstanceLoopCharacteristics camunda:asyncBefore="true" camunda:collection="${collection}" camunda:elementVariable="${element}"  isSequential="false" />` | `<bpmn:multiInstanceLoopCharacteristics isSequential=" false">    `<br>`   <bpmn:extensionElements>`<br>`          <zeebe:loopCharacteristics inputCollection="= collection" inputElement="element" />`<br>`        </bpmn:extensionElements>`<br>`      </bpmn:multiInstanceLoopCharacteristics>` |
| Sequencial Multi Instance | MultiInstanceLoopCharacteristics embedded in Task | Mapped to zeebee:loopcharacteristics | `<bpmn:multiInstanceLoopCharacteristics camunda:asyncBefore="true" camunda:collection="${collection}" camunda:elementVariable="${element}"  isSequential="true" />`  | `<bpmn:multiInstanceLoopCharacteristics isSequential=" true">    `<br>`   <bpmn:extensionElements>`<br>`          <zeebe:loopCharacteristics inputCollection="= collection" inputElement="element" />`<br>`        </bpmn:extensionElements>`<br>`      </bpmn:multiInstanceLoopCharacteristics>`  |
| Compensation Task Marker  |                                                   | No Mapping                           | `<bpmn:task id="Activity_0639xng" isForCompensation="true" />`                                                                                                       | `<bpmn:task id="Activity_0639xng" isForCompensation="true" />`                                                                                                                                                                                                                            |


## Limitations / Not Yet Implemented

### Inclusive Gateways
For outgoing flows of inclusive gateways that should always be taken, it was sufficient to leave the flow condition empty in Camunda 7.  
In Camunda 8, these flows must explicitly have `conditionExpression="true"`. This functionality is not yet implemented.

### Script Tasks
No mapping is yet implemented for Script Tasks

### Input & Output parameters
No mapping is yet implemented for Input and Output Parameters

### Message Correlation IDs
Message correlation in Camunda 8 requires a *CorrelationKey* for any message received by a receive event.  
This was not required when using Camunda 7.  
The *CorrelationKey* must be set manually in the Camunda 8 model after transformation.

### Expression Mapping in Service Tasks
In Camunda 7, there were several ways to define a service task: Java Class, External, Delegate Expression, Expression, and Connector.  
Camunda 8 combines all of these concepts and only lets you define a JobWorker.

Given a service task in Camunda 7, the transformer makes assumptions about how the JobType should be named in Camunda 8:
- Camunda 7 Expression: ```${SomeExpression}``` → Camunda 8 JobType: ```SomeExpression```
- Camunda 7 Delegate Expression: ```${SomeDelegateExpression}``` → Camunda 8 JobType: ```SomeDelegateExpression```
- Camunda 7 Java Class: ```${org.camunda.bpm.MyJavaDelegate}``` → Camunda 8 JobType: ```MyJavaDelegate```
- Camunda 7 External Topic: ```MyTopic``` → Camunda 8 JobType: ```MyTopic```

The type *Connector* requires manual mapping; during the transformation a placeholder is set as the Camunda 8 JobType.

### Timer Events
Timer events in Camunda 7 and 8 can be one of three types: Cycle, Date, or Duration.  
In both Camunda 7 and 8, Cycle, Date, and Duration must be defined in ISO 8601 format, either directly in the BPMN file or by using an expression that points to a variable containing the value.

In Camunda 7, it was also possible to call a Java bean and evaluate the Date, Cycle, or Duration at runtime, for example:
```xml
<timeCycle>#{myBean.getCycle()}</timeCycle>
```
This is no longer allowed in Camunda 8. In such cases, the output of the bean must be stored in a variable, which is then referenced in the expression, or the calculation must be reimplemented directly in FEEL within the expression.

### Task Markers
Camunda 8 does not support Ad-Hoc and Loop Task Markers, and therefore no transformation is applied for these elements.
The converter supports the transformation of Multi-Instance Task Markers, provided that the Camunda 7 model includes a defined input
collection and element variable. However, in practical Camunda 8 modeling, these values are typically provided via input parameters.
As such, manual adjustments may be necessary to align with best practices in Camunda 8.
