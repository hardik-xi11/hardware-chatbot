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
//        List<String> projectUrls = List.of();
//
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
