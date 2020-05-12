package integrationtests.get;

import com.springboot.testrunner.ZerocodeSpringBootRunner;
import org.jsmart.zerocode.core.domain.Scenario;
import org.jsmart.zerocode.core.domain.TargetEnv;
import org.junit.Test;
import org.junit.runner.RunWith;

@TargetEnv("application_host.properties")
@RunWith(ZerocodeSpringBootRunner.class)
public class VerifyGetFeature {

    @Test
    @Scenario("integration_tests/get/get_new_customer_by_id_test.json")
    public void test_getNewCustomerDetailsById() throws Exception {
    }

    @Test
    @Scenario("integration_tests/get/get_updated_customer_by_id_test.json")
    public void test_getUpdatedCustomerDetailsById() throws Exception {
    }

}
