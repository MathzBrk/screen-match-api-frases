Screen Match: Api de Frases de Filmes e Séries
Este projeto consiste em uma aplicação chamada Screen Match, que tem como objetivo fornecer frases aleatórias de filmes e séries. O sistema foi desenvolvido utilizando o Spring Boot e conecta-se a um banco de dados PostgreSQL para armazenar as informações.

Descrição do Desafio
O desafio proposto consistiu em criar uma API que retorna frases icônicas de filmes e séries, incluindo detalhes como:

Título: O nome do filme ou série.
Frase: A citação marcante.
Personagem: O personagem que disse a frase.
Poster: A URL da imagem do pôster do filme ou série.
A API deve ser acessada através do endpoint /series/frases, que retorna uma frase aleatória ao ser chamada.

Estrutura do Projeto
Model
Frase: Representa a entidade que armazena os detalhes de uma frase, incluindo titulo, frase, personagem e poster.
Repository
FraseRepository: Interface que estende JpaRepository e contém métodos para acessar o banco de dados, incluindo a consulta de uma frase aleatória.
Service
FraseService: Classe de serviço que encapsula a lógica de negócios e fornece métodos para obter uma frase.
Controller
FraseController: Controlador que define o endpoint da API e lida com as requisições HTTP.
DTO
FraseDTO: Objeto de transferência de dados utilizado para representar as informações da frase que serão enviadas ao cliente.
