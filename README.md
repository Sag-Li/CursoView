<h1 align="center">📚 CursoView</h1>

<p align="center">
<strong>Aplicativo Android desenvolvido em Kotlin com Jetpack Compose para cadastro, visualização e validação de cursos.</strong>
</p>

---

## Sobre o Projeto:

O projeto foi desenvolvido com o objetivo de aplicar conceitos de desenvolvimento Android moderno utilizando **Kotlin** e **Jetpack Compose**, focando em organização de componentes, validação de formulários, experiência do usuário e boas práticas de programação.

A aplicação permite cadastrar cursos, validar informações preenchidas e visualizar os dados em tempo real através de uma interface dinâmica.

---

# Funcionalidades:

## Cadastro Visual de Cursos:

* Nome completo do curso
* Nome breve
* Categoria
* Carga horária
* Descrição curta

## Pré-visualização Dinâmica:

* Atualização automática dos dados digitados
* Exibição em tempo real no card de preview

## Sistema de Validação:

* Campos obrigatórios
* Tamanho mínimo de texto
* Validação numérica da carga horária
* Bloqueio de valores inválidos
* Feedback visual de status

## Melhorias de UX:

* Scroll vertical
* Contador de caracteres
* Limite máximo de descrição
* Teclado numérico para carga horária

---

# Estrutura do Projeto:

| Camada        | Responsabilidade                       |
| ------------- | -------------------------------------- |
| 📦 components | Componentes reutilizáveis da interface |
| 🖥️ screens   | Estrutura principal da tela            |
| 📄 model      | Modelos e estados da aplicação         |
| ✅ validation  | Regras de validação                    |

---

# Componentes Desenvolvidos:

* HeaderSection
* CourseForm
* ActionButtons
* CoursePreviewCard
* StatusCard

---

# Conceitos Aplicados:

* Programação Orientada a Objetos
* Componentização
* State Management
* Validação de formulários
* Organização em camadas
* Material Design 3
* Responsividade básica
* UX/UI básica
* Scroll vertical
* Feedback em tempo real

---

# Validações Implementadas:

* Nome completo obrigatório
* Nome completo mínimo de 10 caracteres
* Nome breve obrigatório
* Nome breve mínimo de 3 caracteres
* Categoria obrigatória
* Categoria sem números
* Carga horária obrigatória
* Apenas números na carga horária
* Carga horária maior que zero
* Descrição obrigatória
* Limite máximo de caracteres
* Descrição mínima de 15 caracteres

---

# Checklist de Implementação:

* [x] Estrutura inicial do projeto
* [x] Organização em componentes
* [x] Formulário funcional
* [x] Gerenciamento de estados
* [x] Pré-visualização dinâmica
* [x] Sistema de validação
* [x] Feedback visual
* [x] Scroll vertical
* [x] Contador de caracteres
* [x] Limite de caracteres
* [x] Card de preview
* [x] Integração com GitHub
* [x] README documentado

---

# Tecnologias Utilizadas:

* Kotlin
* Jetpack Compose
* Android Studio
* Git
* GitHub

---
