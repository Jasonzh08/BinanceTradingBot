# Binance Trading Bot

A Java-based Binance futures trading bot. This repository now includes a small, self-contained example to make the project immediately buildable, testable, and runnable with Java 17+.

## Requirements
- JDK 17 or later
- Maven 3.8+
- Binance and Telegram credentials (only needed if you intend to run the full bot logic)

## Setup
Use the provided scripts to install dependencies, format code, and run a smoke test:

```bash
make setup
```

This runs a full Maven build (including tests) and ensures code formatting is applied.

## Useful scripts
- `make lint` — check formatting via Spotless.
- `make lint-fix` — apply formatting fixes.
- `make typecheck` — compile the project without running tests.
- `make test` — run the JUnit 5 test suite.
- `make start` — run the minimal sample app (`app.App`) which prints a demo calculation.

> If you prefer raw Maven commands, see the `Makefile` for the exact invocations.

## Running the sample app
The sample app demonstrates the project wiring and provides a quick health check:

```bash
make start
# Output: "Sample calculator result: 5"
```

## Project structure
- `src/main/java/app` — minimal demo application (`App`) and utility (`SampleCalculator`).
- `src/main/java` — existing trading bot implementation (strategy, data, and helper packages).
- `src/test/java/app` — JUnit 5 tests for the sample calculator.
- `pom.xml` — Maven build configuration (Java 17, JUnit 5, Spotless, Exec plugin).
- `Makefile` — developer shortcuts for common workflows.
- `.editorconfig` — shared editor settings.

## Configuration for the trading bot
To connect to Binance and Telegram when running the full bot logic, update `src/main/java/data/Config.java` with your API keys:

```java
public static String API_KEY = "<Your binance api key>";
public static String SECRET_KEY = "<Your binance secret key>";
public static String TELEGRAM_API_TOKEN= "<Your telegram bot api token>";
public static String TELEGRAM_CHAT_ID = "<Your telegram group chat id>";
```

Then launch the legacy entrypoint if desired:

```bash
mvn -B exec:java -Dexec.mainClass=Main
```

## Common issues
- **Java version errors**: Ensure `JAVA_HOME` points to JDK 17+; the build enforces this requirement.
- **Dependency downloads blocked**: Check network/proxy settings; Maven must reach the Central repository.
- **Formatting failures**: Run `make lint-fix` to apply the expected Google Java Format style.

## Contributing
Please keep pull requests small and focused. Run `make lint` and `make test` before submitting changes.
