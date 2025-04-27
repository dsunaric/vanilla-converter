# Vanilla-Converter

## Project Overview
In the field of business process automation, BPMN has established itself as the standard. Many companies automate their processes using workflow management systems like Activiti or Camunda BPM. These systems enable direct control and execution of processes using BPMN diagrams.

Although BPMN is a widely accepted standard, many tools use their own formats, which are heavily based on BPMN. With the announced end-of-life for Camunda 7 in 2030, many customers are already transitioning to Camunda 8. Open-source solutions such as [VanillaBP](https://github.com/vanillabp) facilitate this migration by making the underlying workflow engine interchangeable following the principles of hexagonal architecture.

The main challenge is that Camunda 7 and Camunda 8 use different BPMN formats. This requires significant manual effort to convert process models from one format to another.

### Goal
The objective of this project is to develop a CLI application that automates the transformation of Camunda 7 models into Camunda 8 models, enabling a smooth transition between these versions.

## Timeline
- **Project Start:** November 1, 2024
- **Project Completion:** End of March 2025

## Expected Outcome
The result of this project will be a CLI application that converts Camunda 7 models into Camunda 8 models. After project completion, the software will be integrated into VanillaBP to enhance it as a comprehensive tool for migrating from Camunda 7 to Camunda 8.

The source code will be made available as an open-source project on GitHub.

## Open Issues

- [ ] Outgoing Flows from Inclusive Gateways need to have a true-condition in C8 but none in C7
- [ ] Mapping for Process-Id in Call Activities
- [ ] Mapping for Message Catch Events equivalent to Receive Tasks
- [ ] Mapping for Message Throw Events equivalent to Send Tasks

## Examples 

- [Taxiride Blueprint](src/main/resources/examples/taxiride-blueprint): A qualitative Analysis using the the converter on the [TaxiRide Blueprint Project](https://github.com/phactum/taxiride-blueprint) 
- [ELMO](src/main/resources/examples/elmo): A quantitive performance analysis using the converter on the [ELMO Project](https://github.com/stephanpelikan/elmo)
- [BPMN Examples](src/main/resources/examples/bpmn-examples): Some BPMN example Mappings 

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
|------------------------|-----------|
| Multi Instance Parallel            | ✅   |
| Multi Instance Sequential          | ✅   |
| Ad-Hoc                             | ❌   |
| Compensation                       | ❌   |
| Loop                               | ❎  |

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

### Requirements
TODO

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
See [examples](https://github.com/dsunaric/vanilla-converter/tree/main/src/main/resources/bpmn-examples) for mapping examples

### Logging

Logs are generated to track the process. Look out for any error messages or transformation details in the console output.

## Mapping Table

### Top Level Elements
| BPMN Element        | Camunda 7 Element                            | Description                                          | Camunda7XMLRepresentation                                                                                                                                                                                                                                                                        | Mappedto(C8)                                                                                                                                                                                                                                                                                          |
|---------------------|----------------------------------------------|------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Definitions         | Definitions modeler:executionPlatform        | Modeler Execution Platform                           | modeler:executionPlatform="Camunda Platform"                                                                                                                                                                                                                                                     | modeler:executionPlatform="Camunda Cloud"                                                                                                                                                                                                                                                             |
| Definitions         | Definitions modeler:executionPlatformVersion | Modeler Execution Platform Version                   | modeler:executionPlatformVersion="7.21.0"                                                                                                                                                                                                                                                        | modeler:executionPlatformVersion="8.6.0"                                                                                                                                                                                                                                                              |
| Process             | Delegate Expression                          | no mapping                              | \<bpmn:process isExecutable="true" name="Service Task" id="Process-ID">                                                                                                                                                                                                                           | \<bpmn:process isExecutable="true" name="Service Task" id="Process-ID">                                                                                                                                                                                                                                |

### Tasks

| BPMN Element        | Camunda 7 Element                | Description                                          | Camunda7XMLRepresentation                                                                                                                                                                                                                                                                                                                                             | Mappedto(C8)                                                                                                                                                                                                        |
|---------------------|----------------------------------|------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Service Task        | Delegate Expression              | Java Bean implementing the JavaDelegate Interface    | `<bpmn:serviceTask id="Service-Task-2" name="DelegateExpression" camunda:delegateExpression="${SomeDelegateExpression}"></bpmn:serviceTask>`                                                                                                                                                                                                                           | `<bpmn:serviceTaskname="DelegateExpression" id="Service-Task-2">\<bpmn:extensionElements><zeebe:taskDefinitiontype="SomeDelegateExpression"/></bpmn:extensionElements></bpmn:serviceTask>`                           |
| Service Task        | Expression                       | The method of a Java Bean                            | `<bpmn:serviceTask id="Service-Task-1" name="Expression" camunda:expression="${SomeExpression}">...</bpmn:serviceTask>`                                                                                                                                                                                                                                                | `<bpmn:serviceTaskname="Expression" id="Service-Task-1" camunda:expression="${SomeExpression}">\<bpmn:extensionElements><zeebe:taskDefinitiontype="SomeExpression"/></bpmn:extensionElements>...</bpmn:serviceTask>` |
| Service Task        | Java Class                       | A Java Class implementing the JavaDelegate interface | `<bpmn:serviceTask id="Service-Task-3" name="Class" camunda:class="org.camunda.bpm.MyJavaDelegate">...</bpmn:serviceTask>`                                                                                                                                                                                                                                             | `<bpmn:serviceTask id="Activity_1km4t22" name="Task">\<bpmn:extensionElements><zeebe:taskDefinitiontype="asd"/></bpmn:extensionElements>...</bpmn:serviceTask>`                                                      |
| Send Task           | Delegate Expression              | Java Bean implementing the JavaDelegate Interface    | `<sendTask id="beanService" name="MyBeanServiceTask" camunda:delegateExpression="${myDelegateBean}"/>`                                                                                                                                                                                                                                                                 | `<bpmn:sendTask id="Activity_1km4t22" name="Task">\<bpmn:extensionElements><zeebe:taskDefinitiontype="asd"/></bpmn:extensionElements></bpmn:serviceTask>`                                                            |
| Send Task           | Expression                       | The method of a Java Bean                            | `<sendTask id="expressionService" name="MyExpressionServiceTask" camunda:expression="${myBean.doWork()}"/>`                                                                                                                                                                                                                                                            | `<bpmn:sendTask id="Activity_1km4t22" name="Task">\<bpmn:extensionElements><zeebe:taskDefinitiontype="asd"/></bpmn:extensionElements></bpmn:serviceTask>`                                                            |
| Send Task           | Java Class                       | A Java Class implementing the JavaDelegate interface | `<sendTask id="javaService" name="MyJavaServiceTask" camunda:class="org.camunda.bpm.MyJavaDelegate"/>`                                                                                                                                                                                                                                                                 | `<bpmn:sendTask id="Activity_1km4t22" name="Task">\<bpmn:extensionElements><zeebe:taskDefinitiontype="asd"/></bpmn:extensionElements></bpmn:serviceTask>`                                                            |
| Business Rule Task  | Delegate Expression              | Java Bean implementing the JavaDelegate Interface    | `<sendTask id="beanService" name="MyBeanServiceTask" camunda:delegateExpression="${myDelegateBean}"/>`                                                                                                                                                                                                                                                                 | `<bpmn:sendTask id="Activity_1km4t22" name="Task">\<bpmn:extensionElements><zeebe:taskDefinitiontype="asd"/></bpmn:extensionElements></bpmn:serviceTask>`                                                            |
| Business Rule Task  | Expression                       | The method of a Java Bean                            | `<sendTask id="expressionService" name="MyExpressionServiceTask" camunda:expression="${myBean.doWork()}"/>`                                                                                                                                                                                                                                                            | `<bpmn:sendTask id="ID" name="Task">\<bpmn:extensionElements><zeebe:taskDefinitiontype="asd"/></bpmn:extensionElements></bpmn:serviceTask>`                                                                          |
| Business Rule Task  | Java Class                       | A Java Class implementing the JavaDelegate interface | `<sendTask id="javaService" name="MyJavaServiceTask" camunda:class="org.camunda.bpm.MyJavaDelegate"/>`                                                                                                                                                                                                                                                                 | `<bpmn:sendTask id="ID" name="Task">\<bpmn:extensionElements><zeebe:taskDefinitiontype="asd"/></bpmn:extensionElements></bpmn:serviceTask> `                                                                         |
| Business Rule Task  | DMN                              | DMN decision Document                                | `<bpmn:businessRuleTask id="ID" name="Task" camunda:resultVariable="result" camunda:decisionRef="test" camunda:decisionRefTenantId="tenant"/>`                                                                                                                                                                                                                         | `<bpmn:businessRuleTask id="ID" name="Task">\<bpmn:extensionElements><zeebe:calledDecisiondecisionId="test"resultVariable="result"/></bpmn:extensionElements>`                                                       |
| Receive Task        | Receive Task                     | no mapping                                           | `<bpmn:receiveTask id="ID" name="Task"messageRef="Message_1f3rn3s"/>`                                                                                                                                                                                                                                                                                                  | `<bpmn:receiveTask id="ID" name="Task"messageRef="Message_1ms80d0"></bpmn:receiveTask>`                                                                                                                              |
| Receive Task        | Message                          | no mapping                                           | `<bpmn:message id="Message_1f3rn3s" name="Message_1f3rn3s"/>`                                                                                                                                                                                                                                                                                                         | `<bpmn:messageid="Message_1ms80d0" name="Message_1ms80d0">\<bpmn:extensionElements><zeebe:subscriptioncorrelationKey="=correlationkey"/></bpmn:extensionElements></bpmn:message>`                                    |
| Manual task         | Manual Task                      | no mapping                                           | `<bpmn:manualTask id="Task1" name="ManualTask"></bpmn:manualTask>`                                                                                                                                                                                                                                                                                                     | `<bpmn:manualTask id="Task1" name="ReceiveTask">\</bpmn:manualTask>`                                                                                                                                                 |
| Multi-instance Task    | MultiInstanceLoopCharacteristics | Executes the task multiple times for a collection | `<bpmn:serviceTask camunda:delegateExpression="\${cancelRideOfferOfDriver}"><bpmn:multiInstanceLoopCharacteristics camunda:asyncBefore="true" camunda:collection="\${unselectedOffers}" camunda:elementVariable="\${unselectedOffer}" /></bpmn:serviceTask>`                                                                                                          | `<bpmn:serviceTask>\<bpmn:extensionElements>\<zeebe:loopCharacteristics inputCollection="= unselectedOffers" inputElement="CancelNotRequiredRide" />\</bpmn:extensionElements>\</bpmn:serviceTask>`                 |
| Call Activity       | Call Activity                    | Calls another process as a subprocess                 | `<bpmn:callActivity id="CallActivity_DocumentConfirmationSubprocess" name="Create Documents and Confirmation" calledElement="Process_EECCDocumentWorkflow" camunda:calledElementBinding="deployment"><bpmn:extensionElements><camunda:in businessKey="#{execution.processBusinessKey}" /><camunda:out variables="all" /></bpmn:extensionElements></bpmn:callActivity>` | `<bpmn:callActivity id="CallActivity_DocumentConfirmationSubprocess" name="Create Documents and Confirmation" calledElement="Process_EECCDocumentWorkflow"><bpmn:extensionElements><zeebe:calledElement processId="Process_EECCDocumentWorkflow" propagateAllChildVariables="true" propagateAllParentVariables="false" bindingType="deployment" /></bpmn:extensionElements></bpmn:callActivity>` |
| User Task           | User Task using Form-Ref         | Represents a task performed by a user      | `<bpmn:userTask id="Activity_08uz7wh" name="Camunda Forms" camunda:formRef="FORM-ID" camunda:formRefBinding="latest"></bpmn:userTask>`                                      | `<bpmn:userTask id="Activity_1xo12iu" name="Camunda Form"><bpmn:extensionElements><zeebe:userTask /><zeebe:formDefinition formId="FORM-ID" /></bpmn:extensionElements></bpmn:userTask>`   |
| User Task           | User Task using Form-Key         | Represents a task performed by a user      | `<bpmn:userTask id="Activity_0lz3mn5" name="Embedded or external task form" camunda:formKey="FORM-ID"></bpmn:userTask>`                                       | `<bpmn:userTask id="Activity_1xo12iu" name="Camunda Form"><bpmn:extensionElements><zeebe:userTask /><zeebe:formDefinition formId="FORM-ID" /></bpmn:extensionElements></bpmn:userTask>`   |

### Gateways & Sequence Flows

| BPMN Element              | Camunda 7 Element                            | Description                | Camunda7XMLRepresentation                                                                                                                                                                                     | Mappedto(C8)                                                                                                                                                                                                                  |
|---------------------------|----------------------------------------------|----------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Exclusive Gateway         | exclusiveGateway                             | no mapping                 | `<bpmn:exclusiveGateway id="Gateway_025xtrc">\<bpmn:outgoing>Flow_1w6kevx</bpmn:outgoing></bpmn:exclusiveGateway>                                                                                             | \<bpmn:exclusiveGateway id="Gateway_025xtrc">\<bpmn:outgoing>Flow_1w6kevx</bpmn:outgoing></bpmn:exclusiveGateway>                      |
| Conditional Sequence Flow | sequenceFlow                                 | mapping fo feel expression | `<bpmn:sequenceFlow id="Flow_0c1f5x0" sourceRef="Gateway_025xtrc"targetRef="Event_0dezcp0">\<bpmn:conditionExpressionxsi:type="bpmn:tFormalExpression">${false}</bpmn:conditionExpression></bpmn:sequenceFlow> | \<bpmn:sequenceFlow id="Flow_1x27att"sourceRef="Gateway_13007ix"targetRef="Event_0dezcp0">\<bpmn:conditionExpressionxsi:type="bpmn:tFormalExpression">=true</bpmn:conditionExpression></bpmn:sequenceFlow>                    |
| Default Sequence Flow     | defaultFlow                                  | no mapping                 | `<bpmn:exclusiveGateway id="Gateway_025xtrc" default="Flow_1w6kevx">\<bpmn:outgoing>Flow_1w6kevx</bpmn:outgoing></bpmn:exclusiveGateway>                                                                      | \<bpmn:exclusiveGateway id="Gateway_025xtrc"default="Flow_1w6kevx">\<bpmn:outgoing>Flow_1w6kevx</bpmn:outgoing></bpmn:exclusiveGateway> |
| Paralell Gateway          | paralellGateway                              | no mapping                 | `<bpmn:parallelGateway id="Gateway_025xtrc">\</bpmn:parallelGateway>                                                                                                                                          | \<bpmn:parallelGateway id="Gateway_025xtrc">\<bpmn:outgoing>Flow_1w6kevx</bpmn:outgoing></bpmn:parallelGateway>                        |
| Inclusive Gateway         | inclusiveGateway                              | no mapping                 | `<bpmn:inclusiveGateway default="Flow_07zt34w" id="Gateway_1ad2mvj">...</bpmn:inclusiveGateway>                                                                                                               | \<bpmn:inclusiveGateway default="Flow_07zt34w" id="Gateway_1ad2mvj">...</bpmn:inclusiveGateway>                                                                                                                               |

### Events

| BPMN Element      | Camunda 7 Element                            | Description                                          | Camunda7XMLRepresentation                                                                                                                                                                                                                                                                              | Mapped to(C8)                                                                                                                                                                                                                                                                                      |
|-------------------|----------------------------------------------|------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Timer Event       | StratEvent Cycle                             | no mapping                                           | `<bpmn:startEvent id="Event_02id3ly" name="start">\<bpmn:timerEventDefinition id="TimerEventDefinition_0o1b0mn">\<bpmn:timeCycle xsi:type="bpmn:tFormalExpression">R/P1D</bpmn:timeCycle></bpmn:timerEventDefinition></bpmn:startEvent>`                                                               | `<bpmn:startEventid="StartEvent_1" name="start">\<bpmn:timerEventDefinitionid="TimerEventDefinition_1v6cylr">\<bpmn:timeCyclexsi:type="bpmn:tFormalExpression">R/P1D</bpmn:timeCycle></bpmn:timerEventDefinition></bpmn:startEvent>`                                                                |
| Timer Event       | Date                                         | no mapping                                           | `<bpmn:intermediateCatchEvent id="Event_15ba9d8" name="date">\<bpmn:timerEventDefinition id="TimerEventDefinition_0uwwwmc">\<bpmn:timeDate xsi:type="bpmn:tFormalExpression">2025-05-11T12:13:14Z</bpmn:timeDate></bpmn:timerEventDefinition>`                                                         | `<bpmn:intermediateCatchEventid="Event_0nzjwls" name="date">\<bpmn:timerEventDefinitionid="TimerEventDefinition_0cre0bc">\<bpmn:timeDatexsi:type="bpmn:tFormalExpression">2025-05-11T12:13:14Z</bpmn:timeDate></bpmn:timerEventDefinition> `                                                        |
| Timer Event       | Duration                                     | no mapping                                           | `<bpmn:intermediateCatchEvent id="Event_0apzg04" name="duration">\<bpmn:timerEventDefinition id="TimerEventDefinition_0i1neg9">\<bpmn:timeDuration xsi:type="bpmn:tFormalExpression">P10D</bpmn:timeDuration></bpmn:timerEventDefinition></bpmn:intermediateCatchEvent>`                               | `<bpmn:intermediateCatchEventid="Event_1t3w0pq" name="duration">\<bpmn:timerEventDefinitionid="TimerEventDefinition_0fqrug3">\<bpmn:timeDurationxsi:type="bpmn:tFormalExpression">P10D</bpmn:timeDuration></bpmn:timerEventDefinition></bpmn:intermediateCatchEvent>  `                             |
| Timer Event       | BoundaryEvents non.-interrupting             | no mapping                                           | `<bpmn:boundaryEvent id="Event-ID" name="boundarynon-interrupting" cancelActivity="false" attachedToRef="Task-ID">\<bpmn:timerEventDefinition id="TimerEventDefinition-ID">\<bpmn:timeCycle xsi:type="bpmn:tFormalExpression">R/P1D</bpmn:timeCycle></bpmn:timerEventDefinition></bpmn:boundaryEvent>` | `<bpmn:boundaryEventid="Event-ID" name="boundarynon-interrupting"cancelActivity="false"attachedToRef="Activity-ID">\<bpmn:timerEventDefinitionid="TimerEventDefinition_0998e4m">\<bpmn:timeCyclexsi:type="bpmn:tFormalExpression">R/P1D</bpmn:timeCycle></bpmn:timerEventDefinition></bpmn:boundaryEvent>` |
| Timer Event       | BoundaryEvents interrupting                  | no mapping                                           | `<bpmn:boundaryEvent id="Event-ID" name="boundaryinterrupting" attachedToRef="Activity-ID">\<bpmn:timerEventDefinition id="TimerEventDefinition_1xp8s1f">\<bpmn:timeDate xsi:type="bpmn:tFormalExpression">2025-05-11T13:13:14Z</bpmn:timeDate></bpmn:timerEventDefinition></bpmn:boundaryEvent>`      | `<bpmn:boundaryEventid="Event_0co98t5" name="boundaryinterrupting"attachedToRef="Activity_1v4oarw">\<bpmn:timerEventDefinitionid="TimerEventDefinition_10a3826">\<bpmn:timeDatexsi:type="bpmn:tFormalExpression">2025-05-11T13:13:14Z</bpmn:timeDate></bpmn:timerEventDefinition></bpmn:boundaryEvent>` |
| Error Event       | Error End Event                              | no mapping                                           | `<bpmn:endEvent id="Event_1jklu7j">\<bpmn:errorEventDefinition id="ErrorEventDefinition_1vyfmxs" errorRef="Error_1juaxir"/></bpmn:endEvent>`                                                                                                                                                           | `<bpmn:endEventid="Event_129pjc8">\<bpmn:errorEventDefinitionid="ErrorEventDefinition_10ixguk"errorRef="Error_03raddb"/></bpmn:endEvent>`                                                                                                                                                           |
| Error Event       | ErrorDefinition                              | msg not mapped                                       | `<bpmn:error id="Error_1juaxir" name="Error_3fdsro8"errorCode="TEST" camunda:errorMessage="msg"/>`                                                                                                                                                                                                     | `<bpmn:errorid="Error_03raddb" name="Error_0v6bd9m"errorCode="TEST"/>`                                                                                                                                                                                                                              |
| Terminate Event   | Terminate End Event                          | no mapping                                           | `<bpmn:terminateEventDefinition id="TerminateEventDefinition_0zmeyum"/>`                                                                                                                                                                                                                               | `<bpmn:terminateEventDefinitionid="TerminateEventDefinition_0zmeyum"/>`                                                                                                                                                                                                                             |
| Embedded SubProcess | subProcess                                   | no mapping                                           | `<bpmn:subProcess id="Activity_0ga5y3z" name="embeddedsubprocess"></bpmn:subProcess> `                                                                                                                                                                                                                 | `<bpmn:subProcessid="Activity_0ga5y3z" name="embeddedsubprocess"></bpmn:subProcess> `                                                                                                                                                                                                               |
| Event Subprocess  | subProcess                                   | no mapping                                           | `<bpmn:subProcess id="Activity_0m90aac" name="eventsubprocess" triggeredByEvent="true">\<bpmn:startEvent id="Event_1yx1h83">\<bpmn:errorEventDefinition id="ErrorEventDefinition_1fr4x3m"/></bpmn:startEvent></bpmn:subProcess>`                                                                       | `<bpmn:subProcessid="Activity_0m90aac" name="eventsubprocess"triggeredByEvent="true">\<bpmn:startEventid="Event_1yx1h83">\<bpmn:errorEventDefinitionid="ErrorEventDefinition_1fr4x3m"/></bpmn:startEvent></bpmn:subProcess>`                                                                         |
| Signal Event      | Signal Start Event                           | no mapping                                           | `<bpmn:startEvent id="StartEvent_1" name="signalstartevent">\<bpmn:signalEventDefinition id="SignalEventDefinition_07ouece" signalRef="Signal_15hfc4f"/></bpmn:startEvent>`                                                                                                                            | `<bpmn:startEventid="StartEvent_1" name="signalstartevent">\<bpmn:signalEventDefinitionid="SignalEventDefinition_07ouece"signalRef="Signal_15hfc4f"/></bpmn:startEvent>`                                                                                                                             |
| Signal Event       | Signal Definition                            | no mapping                                           | `<bpmn:signal id="Signal_1ntahfj" name="Signal_1ntahfj"/>`                                                                                                                                                                                                                                             | `<bpmn:signalid="Signal_1ntahfj" name="Signal_1ntahfj"/>`                                                                                                                                                                                                                                            |
| Signal Event      | Signal End Event                             | no mapping                                           | `<bpmn:endEvent id="Event_1xdaf3s" name="signalendevent">\<bpmn:signalEventDefinition id="SignalEventDefinition_1jknmle"/></bpmn:endEvent>`                                                                                                                                                             | `<bpmn:endEventid="Event_1xdaf3s" name="signalendevent">\<bpmn:signalEventDefinitionid="SignalEventDefinition_1jknmle"/></bpmn:endEvent>`                                                                                                                                                            |
| Signal Event      | Signal intermediateCatchEvent                | no mapping                                           | `<bpmn:intermediateCatchEvent id="Event_03jy10k" name="signalintermediatecatch event">\<bpmn:signalEventDefinition id="SignalEventDefinition_14oh641" signalRef="Signal_15hfc4f"/></bpmn:intermediateCatchEvent>`                                                                                       | `<bpmn:intermediateCatchEventid="Event_0jsftdl" name="signalintermediatecatchevent">\<bpmn:signalEventDefinitionid="SignalEventDefinition_1d95ug2"signalRef="Signal_1ntahfj"/></bpmn:intermediateCatchEvent>`                                                                                        |
| Signal Event       | Signal intermediateThrowEvent                | no mapping                                           | `<bpmn:intermediateThrowEvent id="Event_13m1361" name="signalintermediatethrowevent">\<bpmn:signalEventDefinition id="SignalEventDefinition_1w6562n" signalRef="Signal_1ntahfj"/></bpmn:intermediateThrowEvent>`                                                                                        | `<bpmn:intermediateThrowEventid="Event_13m1361" name="signalintermediatethrowevent">\<bpmn:signalEventDefinitionid="SignalEventDefinition_1w6562n"signalRef="Signal_1ntahfj"/></bpmn:intermediateThrowEvent>`                                                                                        |
