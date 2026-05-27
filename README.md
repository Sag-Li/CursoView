# CursoView

Aplicativo Android desenvolvido em Kotlin e Jetpack Compose para cadastro e visualização de cursos técnicos.

## Status do Projeto

 Em andamento

## Funcionalidades Implementadas:

### Interface Principal:

- Tela principal da aplicação
- Cabeçalho informativo
- Layout desenvolvido com Jetpack Compose

### Cadastro de Curso:

Campos disponíveis:

- Nome completo do curso
- Nome breve
- Categoria
- Carga horária
- Descrição

### Pré-visualização Dinâmica:

Os dados digitados pelo usuário são exibidos em tempo real em um cartão de pré-visualização, permitindo acompanhar o resultado do cadastro antes da validação.

### Área de Status:

Exibição de mensagens orientando o usuário durante o preenchimento do formulário.

## Estrutura do Projeto:

```text
com.sagli.cursoview

├── components
│   ├── CourseForm.kt
│   ├── CoursePreviewCard.kt
│   ├── HeaderSection.kt
│   └── StatusCard.kt
│
├── model
│   └── CourseUiState.kt
│
├── screens
│   └── CourseScreen.kt
│
├── ui.theme
│
└── MainActivity.kt
```

## Tecnologias Utilizadas:

- Kotlin
- Android Studio
- Jetpack Compose

## Funcionalidades Planejadas:

- Validação dos campos
- Botão de limpar formulário
- Carregamento de exemplo
- Indicadores visuais de validação
- Recursos de acessibilidade
- Compatibilidade com TalkBack
- Melhorias visuais da interface
