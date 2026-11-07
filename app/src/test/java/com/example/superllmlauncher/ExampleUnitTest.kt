package com.example.superllmlauncher

import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class ExampleUnitTest {
    @Test
    fun targetUrl_isValidFormat() {
        assertEquals("https://yutajapan2026-llm-test.hf.space/", TARGET_URL)
        assertTrue(TARGET_URL.startsWith("https://"))
    }
}