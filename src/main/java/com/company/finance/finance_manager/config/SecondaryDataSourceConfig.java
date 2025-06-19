//package com.company.finance.finance_manager.config;
//
//import javax.sql.DataSource;
//
//import jakarta.persistence.EntityManagerFactory;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.orm.jpa.JpaTransactionManager;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//import org.springframework.transaction.PlatformTransactionManager;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//@Configuration
//@EnableTransactionManagement
////@EnableJpaRepositories
////        (
////        basePackages = "com.company.finance.finance_manager.secondaryRepo", // secondary repo package
////        entityManagerFactoryRef = "secondaryEntityManagerFactory",
////        transactionManagerRef = "secondaryTransactionManager"
////)
//public class SecondaryDataSourceConfig {
//
//    @Bean(name = "secondaryDataSource")
//    @ConfigurationProperties(prefix = "spring.secondary-datasource")
//    public DataSource secondaryDataSource() {
//        return DataSourceBuilder.create().build();
//    }
//
////    @Bean(name = "secondaryEntityManagerFactory")
////    public LocalContainerEntityManagerFactoryBean secondaryEntityManagerFactory(
////            @Qualifier("secondaryDataSource") DataSource dataSource,
////            EntityManagerFactoryBuilder builder
////    ) {
////        return builder
////                .dataSource(dataSource)
////                .packages("com.company.finance.finance_manager.entity") // your entity package
////                .persistenceUnit("secondary")
////                .build();
////    }
//
////    @Bean(name = "secondaryTransactionManager")
////    public PlatformTransactionManager secondaryTransactionManager(
////            @Qualifier("secondaryEntityManagerFactory") EntityManagerFactory factory
////    ) {
////        return new JpaTransactionManager(factory);
////    }
//}
