package com.desugar

import androidx.test.ext.junit.runners.AndroidJUnit4
import io.opentelemetry.semconv.incubating.ServiceIncubatingAttributes.SERVICE_NAME
import org.junit.Assert.assertNotNull
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun desugaringWorksOnDebug() {
        assertNotNull(SERVICE_NAME)
    }
}