#!/bin/bash
sbt -Dbrowser=firefox -Denvironment=local 'test-only implementation.suites.RunTestSuite'