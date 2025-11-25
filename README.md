# Simple Java Template

### Requirements
- [JPM](https://github.com/codejive/java-jpm)
  - [Install SDKMAN](https://sdkman.io/install/)
  - `sdk install jbang`
  - `jbang app install jpm@codejive`
- Java 25
  - `sdk install java 25.0.1-amzn`

### Usage
1. `jpm install`
2. `./SimpleTableExport.java`
    - Starts in interactive mode
3. `./SimpleTableExport.java [outputFile] [tableName] [attribute1] [attribute2] ...`
    - Runs without interactive mode

### References
- JEP 330: Launch Single-File Source-Code Programs
- JEP 458: Launch Multi-File Source-Code Programs
- JEP 477: Instance Main Methods and Implicit Classes
- https://www.youtube.com/watch?v=04wFgshWMdA
- https://horstmann.com/presentations/2025/javaone/#(1)
