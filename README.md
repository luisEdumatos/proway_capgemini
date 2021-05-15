<h1>Desafio de Programação Academia Capgemini - ProWay</h1>
<h3>Sistema de cadastro e visualização de anuncios</h3> 

<p>Este sistema permite que o usuário visualize anúncios já cadastrados de forma geral, ou utilizando filtros por intervalo de tempo e nome de cliente. O sistema também permite o cadastro de novos anuncios.</p>

<h2>📋 Pré-requisitos</h2>

<p>Para utilizar o sistema, você deverá possuir a versão JAVA JDK 11</p>
<p>Se você está utilizando o Windows 10, recomendo a instalação do JDK seguindo o vídeo do canal DevSuperior, apresentado pelo professor Nélio Alves.</p>

<p>Segue o link:  https://www.youtube.com/watch?v=laC0fiI-IOM </p>

<p>Depois, instale uma IDE de sua preferencia. Recomendo a instalação do Eclipse 2020-12 4.18</p>
<p>Para isso, basta baixar o pacote do Eclipse na versão informada. Acesse o link abaixo e faça download do pacote Eclipse IDE for Enterprise Java Developers</p>
<p>Link para download: https://www.eclipse.org/downloads/packages/release/2020-12/r </p>

<p>Após descompactar e executar o Eclipse, crie um WorkSpace no local de sua preferencia</p>

<p>Caso não possua o Git instalado, favor instalar e configurar o mesmo na sua estação de trabalho</p>
<p>Caso tenha dúvidas de como realizar essas tarefas, há algumas dicas importantes explicadas neste link: https://www.hostinger.com.br/tutoriais/tutorial-do-git-basics-introducao</p>

<h2>🚀 Como iniciar</h2>

<p>Após configurar o ambiente, você deverá baixar o projeto para o seu WorkSpace</p>
<p>Na pasta do seu WorkSpace (Ex: C:\Users\luis.matos\eclipse-workspace) clique com o botão direito do mouse e execute "Git Bash Here" </p>
<p>Agora execute o comando git clone https://github.com/luisEdumatos/proway_capgemini.git</p>

<p>Pronto! Os arquivos do projeto agora estarão em sua máquina e você poderá abrir o projeto no Eclipse ou em sua IDE de preferencia</p>

<h2>⚙️ Como executar</h2>

<p>Ao abrir o projeto, expanda o pacote "application" e execute a classe "Main.java"</p>

<p>A partir daí, o projeto será executado no Console de sua IDE. Siga as instruções no menu do sistema apresentado no Console para poder executar as funcionalidades do mesmo</p>

![image](https://user-images.githubusercontent.com/32941370/118370645-04be8180-b57f-11eb-9d2e-06a67ad7c940.png)
![image](https://user-images.githubusercontent.com/32941370/118370662-20c22300-b57f-11eb-88c1-e4cea3b1a634.png)

<h2>🛠️ Explicando o funcionamento do sistema</h2>

<p>Conforme a imagem anterior, o sistema inicia apresentando um menu com opções para "Exibir anuncios", "Filtrar anuncios por intervalo de tempo ou por nome de Cliente" e "Cadastrar anuncios"</p>

<p>Para facilitar os testes do sistema por parte de quem irá utilizar, foi feito um "banco de dados" utilizando a leitura de arquivos. Este "banco de dados" está no arquivo "bd.txt" que fica na pasta raiz do sistma</p>
<p>Sua função é simplesmente carregar alguns anuncios para que o usuário possa já de inicio utilizar algumas funções do sistema sem precisar ficar cadastrando manualmente os anúncios</p>
<p>Caso você queira incluir opções neste "banco de dados", basta abrir o arquivo e colocar as informações de acordo com o padrão já incluido (Nome anuncio, Cliente, Data inicio e Data fim (No padrão "dd/MM/yyyy") e o valor investido por dia). Veja o modelo do arquivo: </p>

![image](https://user-images.githubusercontent.com/32941370/118370932-6a5f3d80-b580-11eb-96ba-83546e437f03.png)

<p>Ao finalizar a execução do sistema, caso você tenha cadastrado novos anuncios, os mesmos serão salvos no "banco de dados" bd.txt </p>
<p>Portanto, quando executar novamente, os anuncios que você cadastrou na ultima execução estarão prontos para serem consultados</p>

<h4>(1) - Exibir todos anúncios</h4>
<p>Essa opção exibe na tela todos os anuncios cadastrados e suas informações. </p>

![image](https://user-images.githubusercontent.com/32941370/118372279-3fc4b300-b587-11eb-9357-7de317507157.png)

<h4>(2) - Filtrar anuncios por intervalo de tempo</h4>
<p>Nesta opção, será exibido os anuncios onde a data de INICIO do anuncio esteja dentro do período que foi digitado pelo usuário. Exemplo:</p>

![image](https://user-images.githubusercontent.com/32941370/118372633-173db880-b589-11eb-9f6b-019e208e9c4f.png)

<h4>(3) - Filtrar anuncios por nome do cliente</h4>
<p>Nesta opção, será exibido os anuncios onde o nome digitado esteja em pelo menos alguma parte do nome de cliente cadastrado. Exemplo: </p>

![image](https://user-images.githubusercontent.com/32941370/118372507-50c1f400-b588-11eb-82fb-abef301931e1.png)

<h4>(4) - Cadastro de anuncios</h4>
<p>Nesta opção, o usuário será enviado ao menu de cadastro de anuncios. Exemplo: </p>

![image](https://user-images.githubusercontent.com/32941370/118372555-aa2a2300-b588-11eb-93c3-dd3a7c45d9fc.png)



