# Spring Boot / Ionic - Back-End

## Sinopse

Back-end aplicativo para venda de produtos (PDV). Veja também o [Front-end](https://github.com/diegobiazin/spring-boot-ionic-frontend).

Projeto utilizando boas práticas de Engenharia de Software tais como desenvolvimento em camadas (DDD) e tratamento de exceções.
Implementação de autenticação e geracao do token JWT, envio de e-mails, comunicação com Amazon S3.

## Tecnologias e Frameworks
* Java
* Spring Boot

## Estrutura de camadas 
![alt text](https://s3-sa-east-1.amazonaws.com/biazin-curso-spring-ionic/padrao-camadas-ddd.png)

```sh
\---com
    \---diegobiazin
        \---cursomc
            |   CursomcApplication.java
            |
            +---config
            |       DevConfig.java
            |       JacksonConfig.java
            |       ProdConfig.java
            |       S3Config.java
            |       SecurityConfig.java
            |       TestConfig.java
            |
            +---domain
            |   |   Categoria.java
            |   |   Cidade.java
            |   |   Cliente.java
            |   |   Endereco.java
            |   |   Estado.java
            |   |   ItemPedido.java
            |   |   ItemPedidoPK.java
            |   |   Pagamento.java
            |   |   PagamentoComBoleto.java
            |   |   PagamentoComCartao.java
            |   |   Pedido.java
            |   |   Produto.java
            |   |
            |   \---enums
            |           EstadoPagamento.java
            |           Perfil.java
            |           TipoCliente.java
            |
            +---DTO
            |       CategoriaDTO.java
            |       CidadeDTO.java
            |       ClienteDTO.java
            |       ClienteNewDTO.java
            |       CredenciaisDTO.java
            |       EmailDTO.java
            |       EstadoDTO.java
            |       ProdutoDTO.java
            |
            +---filters
            |       HeaderExposureFilter.java
            |
            +---repositories
            |       CategoriaRepository.java
            |       CidadeRepository.java
            |       ClienteRepository.java
            |       EnderecoRepository.java
            |       EstadoRepository.java
            |       ItemPedidoRepository.java
            |       PagamentoRepository.java
            |       PedidoRepository.java
            |       ProdutoRepository.java
            |
            +---resources
            |   |   AuthResource.java
            |   |   CategoriaResource.java
            |   |   ClienteResource.java
            |   |   EstadoResource.java
            |   |   PedidoResource.java
            |   |   ProdutoResource.java
            |   |
            |   +---exceptions
            |   |       FieldMessage.java
            |   |       ResourceExceptionHandler.java
            |   |       StandardError.java
            |   |       ValidationError.java
            |   |
            |   \---Utils
            |           URL.java
            |
            +---security
            |       JWTAuthenticationFilter.java
            |       JWTAuthorizationFilter.java
            |       JWTUtil.java
            |       UserSS.java
            |
            \---services
                |   AbstractEmailService.java
                |   AuthService.java
                |   BoletoService.java
                |   CategoriaService.java
                |   CidadeService.java
                |   ClienteService.java
                |   DBService.java
                |   EmailService.java
                |   EstadoService.java
                |   ImageService.java
                |   MockEmailService.java
                |   PedidoService.java
                |   ProdutoService.java
                |   S3Service.java
                |   SmtpEmailService.java
                |   UserDetailsServiceImpl.java
                |   UserService.java
                |
                +---exceptions
                |       AuthorizationException.java
                |       DataIntegrityException.java
                |       FileException.java
                |       ObjectNotFoundException.java
                |
                \---validations
                    |   ClienteInsert.java
                    |   ClienteInsertValidator.java
                    |   ClienteUpdate.java
                    |   ClienteUpdateValidator.java
                    |
                    \---utils
                            BR.java
```

## Autor

* **[Diego Biazin](https://github.com/diegobiazin)** - *Projeto Spring Boot / Ionic - Back-End* 
