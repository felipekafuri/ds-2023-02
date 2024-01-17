# Problema, Necessidade ou Demanda:

> docker run --name mysql -e MYSQL_ROOT_PASSWORD=docker -p 3306:3306 -d mysql:latest

Com a crescente digitalização de recursos educacionais e de entretenimento, as bibliotecas precisam de sistemas eficientes para gerenciar conteúdo digital. Isso inclui o gerenciamento de e-books, jornais, revistas, vídeos educativos e outros recursos multimídia. Além disso, esses sistemas devem permitir o acesso fácil e organizado para usuários e administradores.

# Proposta de Solução:
O software proposto é um sistema de gerenciamento para bibliotecas digitais. Ele oferecerá funcionalidades como o cadastro de novos itens digitais, pesquisa e filtragem de conteúdo, gerenciamento de usuários (incluindo empréstimos e devoluções digitais), e relatórios analíticos para administradores. A interface será projetada para ser acessível e amigável tanto para administradores quanto para usuários finais.


# Requisitos Funcionais (Empréstimo e Devolução)
- Cadastro de Empréstimos: Permitir o registro de empréstimos de itens digitais.
- Limitação de Empréstimos: Limitar a quantidade de itens que um usuário pode emprestar simultaneamente.
- Prazo de Empréstimo: Definir e aplicar prazos para empréstimos.
- Renovação de Empréstimos: Permitir a renovação de empréstimos dentro de critérios pré-estabelecidos.
- Registro de Devoluções: Registrar a devolução de itens emprestados.
- Notificações de Atraso: Enviar notificações automáticas para usuários com empréstimos atrasados.
- Histórico de Empréstimos: Manter um registro histórico de todos os empréstimos e devoluções.
- Bloqueio de Usuário por Atraso: Bloquear temporariamente usuários com histórico de atrasos frequentes.
- Busca de Itens Emprestados: Implementar uma funcionalidade de busca para localizar rapidamente itens emprestados.
- Alertas para Disponibilidade de Itens Reservados: Implementar um sistema de alertas que notifica os usuários quando um item digital previamente reservado por eles se torna disponível para empréstimo.

# Requisitos Não Funcionais
- Segurança: Assegurar a proteção de dados de usuários e do catálogo da biblioteca.
- Desempenho: O sistema deve responder rapidamente às solicitações de empréstimo e devolução.
- Escalabilidade: Capacidade de lidar com um aumento no número de usuários e itens digitais.
- Usabilidade: Interface intuitiva e fácil de usar para diferentes tipos de usuários.
- Manutenibilidade: Facilidade de manutenção e atualização do sistema.
- Testabilidade: Capacidade de testar facilmente as funcionalidades implementadas.
- Conformidade com os Padrões de Design: Aplicação dos padrões de design (Factory, Singleton, Command, etc.) na arquitetura do sistema.
- Internacionalização: Suporte para múltiplos idiomas na interface.
- Compatibilidade com Diferentes Dispositivos: Funcionar eficientemente em diferentes dispositivos (desktop, tablets, smartphones).
- Documentação Técnica: Fornecer documentação detalhada para desenvolvedores e usuários finais.


### Links
- [Doc de arquitetura]([https://docs.google.com/document/d/1lbej-p9UwFjNndhZcRkEye2EfPrtlHe8XWrRrlGMwLo/edit](https://docs.google.com/document/d/1lbej-p9UwFjNndhZcRkEye2EfPrtlHe8XWrRrlGMwLo/edit?usp=sharing)https://docs.google.com/document/d/1lbej-p9UwFjNndhZcRkEye2EfPrtlHe8XWrRrlGMwLo/edit?usp=sharing)
- [Diagrama]([https://app.diagrams.net/#G1Kbltmq4Ouoxw7Qi3bg0odwno_gs07dez](https://app.diagrams.net/?src=about#G1Kbltmq4Ouoxw7Qi3bg0odwno_gs07dez)https://app.diagrams.net/?src=about#G1Kbltmq4Ouoxw7Qi3bg0odwno_gs07dez)
