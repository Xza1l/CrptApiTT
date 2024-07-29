package com.example.crptapitt;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@SpringBootTest
class CrptApiTtApplicationTests {


    @Test
    public void testCreateDocument() {
        CrptApi.Document document = new CrptApi.Document();
        // Заполните объект document данными для теста

        String signature = "example_signature";

        CrptApi crptApi = new CrptApi(TimeUnit.SECONDS, 5); // Пример ограничения на 5 запросов в секунду

        assertDoesNotThrow(() -> crptApi.createDocument(document, signature));
    }

}
