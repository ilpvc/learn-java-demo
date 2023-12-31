package com.example.demo.batchDemo;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.JobFactory;
import org.springframework.batch.core.configuration.support.ReferenceJobFactory;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.item.database.BeanPropertyItemSqlParameterSourceProvider;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.batch.item.database.builder.JdbcBatchItemWriterBuilder;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

/**
 * Description: 注释掉所有的bean ，防止影响启动
 *
 * @date:2023/7/10 13:24
 * @author: ilpvc
 */

//@Configuration
public class BatchConfig {
//    @Bean
//    public FlatFileItemReader<Person> reader(){
//        return new FlatFileItemReaderBuilder<Person>()
//                .name("personItemReader")
//                .resource(new ClassPathResource("sample-data.csv"))
//                .delimited()
//                .names(new String[]{"firstName","lastName"})
//                .fieldSetMapper(new BeanWrapperFieldSetMapper<Person>(){{
//                    setTargetType(Person.class);
//                }})
//                .build();
//    }
//
////    @Bean
//    public PersonItemProcessor processor() {
//        return new PersonItemProcessor();
//    }
//
////    @Bean
//    public JdbcBatchItemWriter<Person> writer(DataSource dataSource) {
//        return new JdbcBatchItemWriterBuilder<Person>()
//                .itemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<>())
//                .sql("INSERT INTO people (first_name, last_name) VALUES (:firstName, :lastName)")
//                .dataSource(dataSource)
//                .build();
//    }
//
//
////    @Bean
//    public Job importUserJob(JobRepository jobRepository,Step step1){
//        return new JobBuilder("importUserJob",jobRepository)
//                .incrementer(new RunIdIncrementer())
//                .flow(step1)
//                .end()
//                .build();
//    }


//    @Bean
//    public Step step1(JobRepository jobRepository,
//                      PlatformTransactionManager transactionManager,
//                      JdbcBatchItemWriter<Person> writer){
//        return new StepBuilder("step1", jobRepository)
//                .<Person, Person> chunk(10, transactionManager)
//                .reader(reader())
//                .processor(processor())
//                .writer(writer)
//                .build();
//    }


}
