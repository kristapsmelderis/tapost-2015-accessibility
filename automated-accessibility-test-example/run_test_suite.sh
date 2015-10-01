#!/bin/bash
sbt -Dbrowser=firefox -Denvironment=local 'test-only uk.gov.hmrc.integration.suites.RunTestSuite'