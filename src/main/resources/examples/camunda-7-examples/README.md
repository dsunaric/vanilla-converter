# Camunda 7 Example Case Studies

This case study is based on process models from the official Camunda 7 Platform examples repository:  
🔗 https://github.com/camunda/camunda-bpm-examples

## Overview

A total of **40 process models** were selected from the repository and converted using the **Vanilla Converter**. The evaluation aimed to assess the converter’s ability to transform real-world Camunda 7 BPMN models into valid Camunda 8 models.

### Summary

- **Number of Processes:** 40
- **Total BPMN Elements Mapped:** 413
- **Manual TODOs Discovered:** 35
- **Successfully Mapped Processes (No Warnings or Errors):** 39

## Notes on the one Unsuccessful Mapping

One process could not be fully mapped due to a **Conditional Boundary Event**, which is currently **not supported in Camunda 8**.

- In this case, the conditional event was replaced with a **none event**, which is **not allowed as a boundary event** in Camunda 8.
- This substitution was chosen as the closest possible mapping, although it results in a model that is not valid for execution in Camunda 8.
