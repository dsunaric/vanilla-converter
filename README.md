# Vanilla-Converter

## Project Overview
In the field of business process automation, BPMN has established itself as the standard. Many companies automate their processes using workflow management systems like Activiti or Camunda BPM. These systems enable direct control and execution of processes using BPMN diagrams.

Although BPMN is a widely accepted standard, many tools use their own formats, which are heavily based on BPMN. With the announced end-of-life for Camunda 7 in 2030, many customers are already transitioning to Camunda 8. Open-source solutions such as [VanillaBP](https://github.com/vanillabp) facilitate this migration by making the underlying workflow engine interchangeable following the principles of hexagonal architecture.

The main challenge is that Camunda 7 and Camunda 8 use different BPMN formats. This requires significant manual effort to convert process models from one format to another.

### Goal
The objective of this project is to develop a CLI application that automates the transformation of Camunda 7 models into Camunda 8 models, enabling a smooth transition between these versions.

## Timeline
- **Project Start:** November 1, 2024
- **Project Completion:** End of February 2025

## Expected Outcome
The result of this project will be a CLI application that converts Camunda 7 models into Camunda 8 models. After project completion, the software will be integrated into VanillaBP to enhance it as a comprehensive tool for migrating from Camunda 7 to Camunda 8.

The source code will be made available as an open-source project on GitHub.

## Mapping Table
| Element            | Camunda 7                                      | Camunda 8 |
|--------------------|------------------------------------------------|--------------|
| <bpmn:definitions> | modeler:executionPlatform="Camunda Platform"   |modeler:executionPlatform="Camunda Cloud"|
| <bpmn:definitions> | modeler:executionPlatformVersion="7.21.0"      |modeler:executionPlatformVersion="8.6.0"|
| <bpmn:process>     | no mapping                                     |no mapping  |
| <bpmn:serviceTask> | Attribute: camunda:delegateExpression="${exp}" |<bpmn:extensionElements><zeebe:taskDefinition type="exp" /></bpmn:extensionElements>  |