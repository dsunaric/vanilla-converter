# Camunda 7 to Camunda 8 Migration Case Study: ELMO

This case study showcases the migration of a Camunda 7 process model from the [ELMO](https://github.com/stephanpelikan/elmo) project to Camunda 8.

**ELMO** (Electro Mobile) is a software system designed to coordinate regional social transport services utilizing electric vehicles.  
For more information, visit the [ELMO project repository](https://github.com/stephanpelikan/elmo).

---
## Project Domains and Process Overview

The project defines processes across three main domains:

- **Passenger Service**  
  Includes processes for managing taxi ride bookings and the entire ride lifecycle.  
  *(7 processes)*

- **Car Sharing**  
  Covers the usage of vehicles for car-sharing purposes.  
  *(2 processes)*

- **Members**  
  Handles the onboarding of new members.  
  *(1 process)*

### BPMN Elements Across All Processes

The combined processes include the following BPMN elements:

- **Start Events:** 20
- **End Events:** 34
- **Service Tasks:** 16
- **Intermediate Catch Events:** 26
- **Intermediate Throw Events:** 10
- **User Tasks:** 5
- **Send Tasks:** 29
- **Boundary Events:** 15
- **Call Activity:** 7
- **Subprocesses:** 10
- **Multi Instance Task Marker:** 2
- **Exclusive Gateways:** 18
- **Parallel Gateways:** 5
- **Event Based Gateways:** 5
- **Messages:** 19

---

## Mapping and Conversion Details

The [Vanilla Converter](https://github.com/dsunaric/vanilla-converter) was used to transform the Camunda 7 BPMN models into a format compatible with Camunda 8.

Below are the transformation logs for each domain linked:
- [Passenger Service](/src/main/resources/examples/elmo/processes/passenger-service/transformation.log)
- [Car Sharing](/src/main/resources/examples/elmo/processes/car-sharing/transformation.log)
- [Members](/src/main/resources/examples/elmo/processes/members/transformation.log)

### Outcome

| Camunda 7 Process                                                                                                | Transformed Camunda 8 Model                                                                                                              | BPMN Errors | BPMN Warnings | TODOs in log after conversion* | Optional TODOs in log* | Actual needed Manual TODOs after conversion                                                                                                           |
|------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------|-------------|---------------|--------------------------------|------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------|
| [car-in-use.bpmn](/src/main/resources/examples/elmo/processes/car-sharing/car-in-use.bpmn)                       | [car-in-use-transformed.bpmn](/src/main/resources/examples/elmo/processes/car-sharing/car-in-use-transformed.bpmn)                       | 0           | 0             | 7                              | 11                     | 2 TODOs: <br>- Add Correlation Key for Messages with ids *Message_3utn1jd*; *Message_31cihhe*                                                             |
| [reservation-lifecycle.bpmn](/src/main/resources/examples/elmo/processes/car-sharing/reservation-lifecycle.bpmn) | [reservation-lifecycle-transformed.bpmn](/src/main/resources/examples/elmo/processes/car-sharing/reservation-lifecycle-transformed.bpmn) | 0           | 0             | 9                              | 16                     | 5 TODOs: <br>- Add Correlation Key for Messages with ids: *Message_2upsvno*; *Message_0l87vd6*; *Message_0edrp1a*; *Message_31cihhe*; *Message_3utn1jd*         |
| [member-onboarding.bpmn](/src/main/resources/examples/elmo/processes/members/member-onboarding.bpmn)             | [member-onboarding-transformed.bpmn](/src/main/resources/examples/elmo/processes/members/member-onboarding-transformed.bpmn)             | 0           | 0             | 2                              | 14                     | 3 TODOs: <br>- Add Correlation Key for Message with id: *Message_0pngawu*                                              |
| [claim-reminder.bpmn](/src/main/resources/examples/elmo/processes/passanger-service/claim-reminder.bpmn)         | [claim-reminder-transformed.bpmn](/src/main/resources/examples/elmo/processes/passanger-service/claim-reminder-transformed.bpmn)         | 0           | 0             | 0                              | 2                      | no TODOs                                                                                                                                              |
| [passenger-service.bpmn](/src/main/resources/examples/elmo/processes/passanger-service/passenger-service.bpmn)   | [passenger-service-transformed.bpmn](/src/main/resources/examples/elmo/processes/passanger-service/passenger-service-transformed.bpmn)      | 0           | 0             | 1                              | 5                      | no TODOs                                                                                                                                              |
| [shift-due.bpmn](/src/main/resources/examples/elmo/processes/passanger-service/shift-due.bpmn)                   | [shift-due-transformed.bpmn](/src/main/resources/examples/elmo/processes/passanger-service/shift-due-transformed.bpmn)              | 0           | 0             | 2                              | 3                      | 1 TODO: <br>- Add Correlation Key for Message Event with id *Message_1p05uj9*                                                                         |
| [shift-lifecycle.bpmn](/src/main/resources/examples/elmo/processes/passanger-service/shift-lifecycle.bpmn)       | [shift-lifecycle-transformed.bpmn](/src/main/resources/examples/elmo/processes/passanger-service/shift-lifecycle-transformed.bpmn)        | 0           | 0             | 4                              | 4                      | 2 TODOs : <br>- Add Correlation Key for Messages with ids: *Message_0ljdvdq*; *Message_3vbm2e7*                                                       |
| [swap-needed.bpmn](/src/main/resources/examples/elmo/processes/passanger-service/swap-needed.bpmn)               | [swap-needed-transformed.bpmn](/src/main/resources/examples/elmo/processes/passanger-service/swap-needed-transformed.bpmn)            | 0           | 0             | 2                              | 15                     | 2 TODOs: <br>- Add Correlation Key for Messages with ids: *Message_3krmm48*; *Message_0c7s35t*;                                                       |
| [swap-requested.bpmn](/src/main/resources/examples/elmo/processes/passanger-service/swap-requested.bpmn)         | [swap-requested-transformed.bpmn](/src/main/resources/examples/elmo/processes/passanger-service/swap-requested-transformed.bpmn)         | 0           | 0             | 5                              | 12                     | 5 TODOs: <br>- Add Correlation Key for Messages with ids: *Message_2on357h*; *Message_2gg8vbt*; *Message_2u3ucgo*; *Message_3psc8n5*; *Message_0839j2v* |
| [wait-for-the-start.bpmn](/src/main/resources/examples/elmo/processes/passanger-service/wait-for-the-start.bpmn) | [wait-for-the-start-transformed.bpmn](/src/main/resources/examples/elmo/processes/passanger-service/wait-for-the-start-transformed.bpmn)     | 0           | 0             | 6                              | 13                     | 4 TODOs: <br>- Add Correlation Key for Messages with ids: *Message_3t1psi9*; *Message_15lr0tu*; *Message_395da9l*; *Message_0h8i2td*                  |

* provided in the transformation.log files

### ⚠️ Limitations

#### Message Subscription Correlation Key
When using Camunda 8 Message Receive Events, a correlation key must be set for the specified message. 
In this case study, the BPMN models often define messages that are not actually used within the process.
As a result, the transformation suggests setting a correlation key for all defined messages.
However, in practice, it is sufficient to set the correlation key only for the messages that are actually used.

---

