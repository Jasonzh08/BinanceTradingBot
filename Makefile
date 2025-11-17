.PHONY: setup lint lint-fix typecheck test start

setup:
	mvn -B clean verify

lint:
	mvn -B spotless:check

lint-fix:
	mvn -B spotless:apply

typecheck:
	mvn -B -DskipTests compile

test:
	mvn -B test

start:
	mvn -B exec:java -Dexec.mainClass=app.App
