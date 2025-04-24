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

Transformation logs for each domain are available below:

- [Passenger Service](/processes/passenger-service/transformation.log)
- [Car Sharing](/processes/car-sharing/transformation.log)
- [Members](/processes/members/transformation.log)

### Mapping




### ⚠️ Not Yet Mapped / Limitations

#### Usertasks

#### Message Events

#### Message Events

---

