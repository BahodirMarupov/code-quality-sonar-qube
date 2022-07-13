Code Quality Module Practical Task
Necessary Tools
Java Development Kit 11+
Apache Maven 3.6.0+
Git 2.24+
Docker
##Task
(1 star)
1. Run Sonarqube docker container
- Instruction: https://docs.sonarqube.org/latest/
2. Login to Sonarqube web interface
- default password: admin
3. Configure a new project with token
4. Analyse your pet project with SonarQube. Use generated token for it (you can get project from previous modules)
- Instruction: https://docs.sonarqube.org/latest/analysis/scan/sonarscanner-for-maven/
5. If there are any issues, correct it
6. Prepare .doc report with screenshot for every step
(2-3 stars)
7. Configure a new project with token
8. Create a new maven project with a few (10+) issues, e.x. :
- Don't use method reference
- Use switch operator. Define 'default' in the top of operator
- etc.
9. Analyse your project
10. Try to skip all issues with @SuppressWarnings
11. Prepare .doc report with screenshot for every step
(4 stars)
12. Remove @SuppressWarnings for project from previous section
13. Create a new Sonar java profile (copy it from default java profile)
14. Deactivate rules for issues from previous section
15. Link new profile to your project
16. Analyse your project
17. Prepare .doc report with screenshot for every step
(5 stars)
18. Create a new Quality Gate with:
- Duplicated code (> 10)
- Issues (> 20)
- Code smells (> 40)
- Bugs (> 35)
- Unit test succsess (< 40)
19. Link it to your project
16. Analyse your project
17. Prepare .doc report with screenshot for every step
References
•	Clean Code
•	Agile Software Development: Code Quality
•	11 Best Practices and Tools to Improve the Java Code Quality
•	S.O.L.I.D
