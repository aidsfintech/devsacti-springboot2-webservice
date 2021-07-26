# AWS & 스프링부트 기반 게시판 구현 학습 프로젝트

## 개발환경

빌드툴 및 프레임워크 : gradle 4.x , springboot 2.x

프론트엔드 : mustache(클라이언트 템플릿 엔진), jquery and ajax of javascript

백엔드 : java Controller , JPA와 h2, datagrip과 RDS

테스트 : junit

서버 배포 관련 : AWS ec2(Iaas), MySQL of AWS RDS, 쉘스크립트

## 개요

 web layer, service layer, Repository layer(또는 dto,dao)의 스피링 웹 구조에 따라서 게시판형태의 IT서비스 구현
  스프링 시큐리티를 바탕으로, 구글과 네이버의 OpenAPI를 활용한 Oauth 및 소셜로그인 구현
