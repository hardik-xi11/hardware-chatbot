//package com.hardik.hardware.service;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.ai.reader.tika.TikaDocumentReader;
//import org.springframework.ai.transformer.splitter.TokenTextSplitter;
//import org.springframework.ai.vectorstore.VectorStore;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//import org.springframework.ai.document.Document;
//
//import java.util.List;
//
//
//@Component
//public class IngestionService implements CommandLineRunner {
//
//    private static final Logger log = LoggerFactory.getLogger(IngestionService.class);
//    private final VectorStore vectorStore;
//
//    public IngestionService(VectorStore vectorStore) {
//        this.vectorStore = vectorStore;
//    }
//
//    @Override
//    public void run(String... args) {
//        List<String> projectUrls = List.of(
//                "https://randomnerdtutorials.com/car-plate-recognition-system-with-raspberry-pi-and-node-red/",
//                "https://randomnerdtutorials.com/node-red-send-messages-whatsapp/",
//                "https://randomnerdtutorials.com/micropython-bh1750-esp32-esp8266/",
//                "https://randomnerdtutorials.com/micropython-esp32-bluetooth-low-energy-ble/",
//                "https://randomnerdtutorials.com/micropython-esp32-neo-6m-gps/",
//                "https://randomnerdtutorials.com/raspberry-pi-motion-email-python/",
//                "https://www.instructables.com/MakerKid-Easy-Kit-Mini-Piano/",
//                "https://www.instructables.com/ESP8266-Buzzer-Piano-Play-Jingle-Bells-Using-Code/",
//                "https://www.instructables.com/How-to-Make-Pulse-Rate-Monitor-Using-Arduino/",
//                "https://www.instructables.com/Animatronic-Arm-an-Arduino-Project/",
//                "https://www.instructables.com/Servo-Shoulder-Support-Partial-Exoskeleton",
//                "https://www.hackster.io/sologithu/controlling-devices-with-gesture-detection-wearable-750074",
//                "https://randomnerdtutorials.com/esp32-neo-m8n-gps-logger-google-earth/",
//                "https://randomnerdtutorials.com/esp32-esp8266-run-daily-task/",
//                "https://www.instructables.com/Raspberry-Pi-Cat-TV/"
//        );
//        for (String url : projectUrls) {
//            TikaDocumentReader reader = new TikaDocumentReader(url);
//            List<Document> docs = reader.get();
//            TokenTextSplitter splitter = new TokenTextSplitter();
//            vectorStore.accept(splitter.apply(docs));
//            log.info("{} has been read", url);
//        }
//    }
//
//}
