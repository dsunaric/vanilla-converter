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

## Supported Elements

### Tasks

| Element              | Supported |
|------------------------|-----------|
| Service Task          | ✅        |
| Send Task            | ✅        |
| User Task            | ❌        |
| Business Rule Task   | ✅        |
| Script Task         | ❌        |
| Receive Task        | ✅        |
| Manual Task         | ✅        |
| Task Markers        | ❌        |

### Gateways

| Element              | Supported |
|------------------------|-----------|
| Exclusive GW                       | ✅   |
| Conditional / default sequence flows | ✅   |
| Parallel GW                        | ✅   |
| Inclusive GW                       | ✅   |
| Event based GW                     | ❌   |

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
| Call activity                      | ❌   |
| Event subprocess                   | ✅   |
| Transaction Subprocess             | ❎   |

### Events

|Type | Start       |  |  | Intermediate |  |  |  | End |  
|----|----|----|----|----|----|----|----|----|  
|                | Normal       | Event Sub Process | Event Sub Process Non-interrupt | Catch  | Boundary | Boundary Non-interrupt | Throw  | Normal |  
| **None**           | ✅           | -                 |  -                            | -     |  -     | -                    | -     | ✅       |  
| **Message**        | ❌           | ❌                | ❌                           | ❌     | ❌       | ❌               | ❌     |-      |  
| **Timer**          | ✅           | ✅                | ✅                           | ✅     | ✅       | ✅               | -     |-      |  
| **Conditional**    | ❎          | ❎               | ❎                          | ❎    | ❎      | ❎               |-      | -       |  
| **Link**           |  -            | -                |  -                             | ❌     | -        | -               | ❌      |-        |  
| **Signal**         | ✅           | ✅                | ✅                           | ✅     | ✅       | ✅               | ✅     | ✅     |  
| **Error**          | -             | ✅                | -                              | -     |  ✅        | -               | -       | ✅     |  
| **Escalation**     | -             | ❌                | ❌                           | -       | ❌       | ❌               | ❌     | ❌     |  
| **Termination**    | -             | -                  | -                           |   -     |  -        | -                   | -       | ✅     |  
| **Compensation**   |-              | ❎               | -                              | -    | ❌         | -               | -       | ❌     |  
| **Cancel**         |-              | -                |   -                            | -    |  ❎        |   -                | -      | ❎    |  
| **Multiple**       | ❎          | ❎               | ❎                          | ❎    | ❎      | ❎               | ❎    | ❎    |  
| **Multiple Parallel** | ❎        | ❎               | ❎                          | ❎    | ❎      | ❎              | ❎    | ❎    |  

✅ → Done 

❌ → To Do 

❎ →  Not Supported Yet by Camunda 8

## Usage

This application transforms BPMN files by mapping their contents using custom logic. To use the application, follow these steps:

### Requirements
TODO

### Running the Application
To run the application, pass the path to a BPMN file as a command-line argument.

#### Example Usage:

1. **From the command line:**
```
java -jar vanilla-transfomer.jar /path/to/your/file.bpmn
```

This will read the BPMN file from the specified path, transform it, and save the transformed file in the same location with a `-transformed` suffix.

2. **If the file path is missing or invalid:**
The application will log an error message and exit.

#### Parameters:

- **filePath** (required): The path to the BPMN file you want to transform.

The transformed file will be saved with the same name as the original BPMN file but with the `-transformed` suffix added to the filename.

### Example Output:

For an input file `process.bpmn`, the transformed file will be saved as `process-transformed.bpmn`.
See [examples](https://github.com/dsunaric/vanilla-converter/tree/main/src/main/resources/bpmn-examples) for mapping examples

### Logging

Logs are generated to track the process. Look out for any error messages or transformation details in the console output.

## Mapping Table
| Element              | Camunda 7                                      | Camunda 8                                                                                        |
|----------------------|------------------------------------------------|--------------------------------------------------------------------------------------------------|
| \<bpmn:definitions\> | modeler:executionPlatform="Camunda Platform"   | modeler:executionPlatform="Camunda Cloud"                                                        |
| \<bpmn:definitions\> | modeler:executionPlatformVersion="7.21.0"      | modeler:executionPlatformVersion="8.6.0"                                                         |
| \<bpmn:process\>     | no mapping                                     | no mapping                                                                                       |
| \<bpmn:serviceTask\> | Attribute: camunda:delegateExpression="${exp}" | \<bpmn:extensionElements\><br/><zeebe:taskDefinition type="exp" /><br/></bpmn:extensionElements> |
|                      |                                                |                                                                                                  |
