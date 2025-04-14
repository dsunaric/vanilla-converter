# Case Study: Vodafone Germany 

In a project, business processes were modeled, orchestrated, and migrated to a modern infrastructure using Camunda 7, enabling an improved customer journey and faster time-to-market for new products. The migration was carried out step by step without interrupting ongoing operations. 
Details about the project can be found [here](https://phactum.at/wp-content/uploads/2022/06/Vodafone_DE.pdf).

---

## 2. Process Landscape

This project orchestrates processes for a wide range of customer use cases, such as ordering new products and modifying or extending mobile phone tariffs.
Currently, the software runs 26 Camunda 7 BPMN processes in production, featuring the following bpmn elements:

- **Start Events:** x
- **End Events:** x
- **Intermediate Events:** x
- **User Tasks:** x
- **Service Tasks:** x
- **Receive Tasks:** x
- **Send Tasks:** x
- **Boundary Events (interrupting):** x
- **Boundary Events (non-interrupting):** x
- **Call Activities:** x
- **Parallel Gateways:** x
- **Exclusive Gateways:** x
- **Multi Instance Task Marker:** x

---

## 3. Mapping and Conversion Details

Using the [Vanilla Converter](https://github.com/dsunaric/vanilla-converter), the following mappings were applied for trasnforming the the Camunda 7 BPMN models into a Camunda 8-compatible format:

| ****                                   | **Occurrences** | **no manual post-processing needed** | **details** |
|----------------------------------------|-----------------|--------------------------------------|-------------|
| **Start Events**                       | x               |                                      |             |
| **End Events**                         | x               |                                      |             |
| **Intermediate Events**                | x               |                                      |             |
| **User Tasks**                         | x               |                                      |             |
| **Service Tasks**                      | x               |                                      |             |
| **Receive Tasks**                      | x               |                                      |             |
| **Send Tasks**                         | x               |                                      |             |
| **Boundary Events (interrupting)**     | x               |                                      |             |
| **Boundary Events (non-interrupting)** | x               |                                      |             |
| **Call Activities**                    | x               |                                      |             |
| **Parallel Gateways**                  | x               |                                      |             |
| **Exclusive Gateways**                 | x               |                                      |             |
| **Multi Instance Task Marker**         | x               |                                      |             |

---

