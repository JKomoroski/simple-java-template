# Simple Java Template

### Requirements
- [Install SDKMAN](https://sdkman.io/install/)
- Install Java 25
  - `sdk install java 25.0.1-amzn`
  - `sdk use java 25.0.1-amzn`
- [Install JPM](https://github.com/codejive/java-jpm)
  - `sdk install jbang`
  - `jbang app install jpm@codejive`

### Usage
1. `jpm install`
2. `./SimpleTableExport.java` 
   - `./SimpleTableExport.java [args...]`
3. Add new dependencies with [JPM](https://github.com/codejive/java-jpm)
   - `jpm clean` to remove dependencies in the `deps` folder
   - SimpleJavaTemplate.java contains example code using dependencies

### References
- JEP 330: Launch Single-File Source-Code Programs
- JEP 458: Launch Multi-File Source-Code Programs
- JEP 477: Instance Main Methods and Implicit Classes
- https://www.youtube.com/watch?v=04wFgshWMdA
- https://horstmann.com/presentations/2025/javaone/#(1)
