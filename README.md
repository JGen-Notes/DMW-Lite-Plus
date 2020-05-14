# DMW-Lite-Plus
The Data Model Widgets (DMW) is a model-based development environment allowing designing compact abstract units of logic accessing variety databases.

The DMW Project provides tools to define a model and logic abstracting from the possible physical implementations. Therefore, it should be possible to generate physical implementation on multiple target software platforms. This document provides a description of how to achieve. This is still provisional and volatile version and subject to change in the future.

The proposed solution incorporates the development of a language (or rather two interacting languages)  allowing to declare model part of the solution and express an access logic. The DMW Project uses Xtext Framework for the development of both languages using Domain-Specific Languages (DSL) approach. The project also includes the development of all required instrumentation, like fully functioning editors and generators. We refer to such language as the DMW Language in the rest of the document.

The declarative part of the DMW Language dedicated to the modeling part allows to describe the data model and define a target implementation platforms only at the present time.  The procedural part of the DMW Language allows describing how to access and consolidate data to fulfill a request from the user.  Both parts of the DMW Language follows commonly accepted object-oriented approach used in many modern programming languages.

As mentioned earlier, the DMW Language uses Xtext framework and written in Java, and as such is using Eclipse Modeling Framework as internal implementation of the meta-metamodel.

Currently, the proposed DMW solution mostly supports the development of the server-side of processing.

The generation process is the essential part of the DMW development environment. You can envisage purpose written generators targetting different programming languages, a different implementation of SQL and non-SQL databases, and target operating systems. Current efforts focus on Java and Swift programming languages, with the emphasis on Swift. Databases of choice are MySQL, SQLite, PostgreSQL, and MongoDB. Any future generator will use created ad-hoc syntax tree created automatically from the contents of a bunch of files created by the developers and containing fragments written using the DWM Language.

Current plans are that generated Swift source code will run on Linux and macOS machines wrapped using Kitura or Vapor server solutions.

http://www.jgen.eu/dmw-language-reference/

