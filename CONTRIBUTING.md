# Contributing

When contributing to this repository, please first discuss the change you wish to make via discussions, pull request, discord, or any other method with the owners of this repository before making a change.

## Styleguide

### Java Style Guide

- **Naming Conventions**: Use descriptive names for classes, methods, and variables. Avoid abbreviations and acronyms unless they're well known.
    - **Packages**: 
      - Use lowercase and separate words with dots, e.g. `com.layux.core`.
      - Don't use plurals, e.g. `com.layux.utils` instead of `com.layux.util`.
      - Prefer using a single word, e.g. `com.layux.core` instead of `com.layux.coreutils`.
      - Only use alphabetic characters and avoid using underscores, e.g. `com.layux.core.usecase` instead of `com.layux.core.use_case`.
    - **Classes/Interfaces**: Use UpperCamelCase and prefer nouns, e.g. `Customer`, `ItemManager`.
    - **Methods**: Use lowerCamelCase and make them verbs, e.g. `calculateTotal()`, `setAge()`.
    - **Variables**: Use lowerCamelCase, e.g. `totalCount`, `maxValue`.
    - **Constants**: Use UPPER_SNAKE_CASE, e.g. `MAX_SIZE`.
- **Braces:** Use the K&R style. The opening brace is on the same line as the statement and the closing brace is on its own line aligned with the opening statement.
- **Indentation:** Use 4 spaces for indentation, not tabs.
- **Comments**: Use Javadoc for API comments (i.e., `/** ... */`). For inline comments, use `// ...`.
- **Line Length**: Try to limit lines to 80 characters for readability.
- **Imports**:
    - Avoid wildcard imports unless necessary.
    - Separate groups of imports with a single blank line (java, javax, org, com, etc.).
    - Order imports alphabetically within each group.
    - Place all static imports after non-static imports.
- **Annotations**: Annotations for classes, methods, or constructors should be on separate lines.
- **Visibility Modifiers:** Always specify the visibility: `public`, `private`, or `protected`.
- **Variable Declarations**: Declare each variable on its own line and initialize it with a value on the same line if possible.

### Kotlin Style Guide

The following rules are just an extension of the Java style guide with some Kotlin-specific rules, so please refer to it for any rules not mentioned here.

- **Colon**: There should be a space before a colon where it separates a type from a superclass or interfaces, and no space where it separates a type from an instance.
- **Type inference**: Favor using Kotlin's type inference, but consider specifying the type if it improves code readability.
- **Function declarations**: If a function signature doesn't fit on a single line, indent each subsequent parameter with a 4-space indent.
- **Lambda expressions:** If the lambda has only one parameter and its type is inferable, prefer using the name it rather than declaring the parameter explicitly.
- **Extensions**: Prefer extension functions over utility classes.
- **Null Safety**: Make use of Kotlin's null safety features. Prefer using ? for nullable types and !! only when you're certain the value is non-null.
- **Visibility Modifiers**: Use the least permissive modifier possible just like in Java, however you don't need to specify public as it's the default.
- **Data Classes**: Use data classes to represent data models rather than using POJOs.
- **Companion Objects**: Use companion objects to store constants and factory methods.
- **Object Expressions**: Use object expressions to create anonymous objects that are only needed locally and not reused.
- **String Templates**: Use string templates instead of string concatenation.
- **Semicolons**: Don't use semicolons, unless you want to have multiple statements on the same line.

### Branching

* For each issue/ticket, create a new branch from `develop` with a descriptive name prefixed with [gitflow style](https://www.atlassian.com/git/tutorials/comparing-workflows/gitflow-workflow) (e.g. `feature/add-geckolib-dependency`).
* When the issue/ticket is resolved, create a pull request to merge the branch into `develop`.
* Once the pull request is approved, merge the branch into `develop`.
* Once `develop` is ready for release, create a pull request to merge the branch into `main` and tag the commit with the version number.

### Git Commit Messages

* Follow the [Conventional Commits](https://www.conventionalcommits.org/en/v1.0.0/) specification.
* Use the present tense ("Add feature" not "Added feature")
* Use the imperative mood ("Move cursor to..." not "Moves cursor to...")
* Limit the first line to 72 characters or fewer

### Versioning

This project uses [Semantic Versioning](https://semver.org/), please ensure to follow the versioning scheme when creating releases.

## Pull Request Process

1. Ensure any install or build dependencies are removed before the end of the layer when doing a
   build.
2. Update the README.md with details of changes to the interface, this includes new environment
   variables, exposed ports, useful file locations and container parameters.
3. Increase the version numbers in any examples files and the README.md to the new version that this
   Pull Request would represent. The versioning scheme we use is [SemVer](http://semver.org/).
4. You may merge the Pull Request in once you have the sign-off of two other developers, or if you
   do not have permission to do that, you may request the second reviewer to merge it for you.

## Best practices

We have a few best practices that we follow when developing this project, please follow them when contributing.

* [SOLID principles](https://www.educative.io/answers/what-are-the-solid-principles-in-java)
* [Clean architecture](https://blog.cleancoder.com/uncle-bob/2012/08/13/the-clean-architecture.html)
* [Domain-driven design](https://en.wikipedia.org/wiki/Domain-driven_design)
* [DRY principle](https://en.wikipedia.org/wiki/Don%27t_repeat_yourself)
* [KISS principle](https://en.wikipedia.org/wiki/KISS_principle)
* [YAGNI principle](https://en.wikipedia.org/wiki/You_aren%27t_gonna_need_it)

## Code of Conduct

Please note we have a code of conduct, please follow it in all your interactions with the project.

### Our Pledge

In the interest of fostering an open and welcoming environment, we as
contributors and maintainers pledge to making participation in our project and
our community a harassment-free experience for everyone, regardless of age, body
size, disability, ethnicity, gender identity and expression, level of experience,
nationality, personal appearance, race, religion, or sexual identity and
orientation.

### Our Standards

Examples of behavior that contributes to creating a positive environment
include:

* Using welcoming and inclusive language
* Being respectful of differing viewpoints and experiences
* Gracefully accepting constructive criticism
* Focusing on what is best for the community
* Showing empathy towards other community members

Examples of unacceptable behavior by participants include:

* The use of sexualized language or imagery and unwelcome sexual attention or
  advances
* Trolling, insulting/derogatory comments, and personal or political attacks
* Public or private harassment
* Publishing others' private information, such as a physical or electronic
  address, without explicit permission
* Other conduct which could reasonably be considered inappropriate in a
  professional setting

### Our Responsibilities

Project maintainers are responsible for clarifying the standards of acceptable
behavior and are expected to take appropriate and fair corrective action in
response to any instances of unacceptable behavior.

Project maintainers have the right and responsibility to remove, edit, or
reject comments, commits, code, wiki edits, issues, and other contributions
that are not aligned to this Code of Conduct, or to ban temporarily or
permanently any contributor for other behaviors that they deem inappropriate,
threatening, offensive, or harmful.

### Scope

This Code of Conduct applies both within project spaces and in public spaces
when an individual is representing the project or its community. Examples of
representing a project or community include using an official project e-mail
address, posting via an official social media account, or acting as an appointed
representative at an online or offline event. Representation of a project may be
further defined and clarified by project maintainers.

### Enforcement

Instances of abusive, harassing, or otherwise unacceptable behavior may be
reported by contacting the project team at [contact@layux.io]. All
complaints will be reviewed and investigated and will result in a response that
is deemed necessary and appropriate to the circumstances. The project team is
obligated to maintain confidentiality with regard to the reporter of an incident.
Further details of specific enforcement policies may be posted separately.

Project maintainers who do not follow or enforce the Code of Conduct in good
faith may face temporary or permanent repercussions as determined by other
members of the project's leadership.

### Attribution

This Code of Conduct is adapted from the [Contributor Covenant][homepage], version 1.4,
available at [http://contributor-covenant.org/version/1/4][version]

[homepage]: http://contributor-covenant.org
[version]: http://contributor-covenant.org/version/1/4/
