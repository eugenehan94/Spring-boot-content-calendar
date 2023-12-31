package com.springBootReview.contentcalendar;

import com.springBootReview.contentcalendar.config.ContentCalendarProperties;
import com.springBootReview.contentcalendar.model.Content;
import com.springBootReview.contentcalendar.model.Status;
import com.springBootReview.contentcalendar.model.Type;
import com.springBootReview.contentcalendar.repository.ContentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
@EnableConfigurationProperties(ContentCalendarProperties.class)
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(ContentRepository repository) {
		return args -> {
			// insert some data into the database
			Content content = new Content(null, "Hello Chat GPT", "All about Chat GPT",
					Status.IDEA, Type.VIDEO,
					LocalDateTime.now(), null, "");
			repository.save(content);

		};
	}

}
