package org.rest.test.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.rest.sec.client.AuthenticationClientRESTIntegrationTest;
import org.rest.sec.client.UserClientRESTIntegrationTest;

@RunWith(Suite.class)
@SuiteClasses({ UserClientRESTIntegrationTest.class, AuthenticationClientRESTIntegrationTest.class })
public final class IntegrationClientRESTTestSuite {
    //
}
