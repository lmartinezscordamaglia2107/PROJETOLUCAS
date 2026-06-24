# 📦 E-Commerce CRUD - Android

![Kotlin](https://img.shields.io/badge/Kotlin-1.9.x-7F52FF?style=for-the-badge&logo=kotlin&logoColor=white)
![Android Studio](https://img.shields.io/badge/Android_Studio-2026+-3DDC84?style=for-the-badge&logo=android-studio&logoColor=white)
![Architecture](https://img.shields.io/badge/Architecture-MVVM_Clean-blue?style=for-the-badge)

Este projeto consiste em um sistema de catálogo para E-commerce focado em operações completas de **CRUD** (Create, Read, Update, Delete) de produtos. A aplicação foi desenvolvida nativamente para a plataforma Android utilizando **Kotlin**, adotando o padrão de arquitetura MVVM, Clean Architecture e persistência local de dados com segurança de threads.

---

## 🏛️ Arquitetura e Boas Práticas

O projeto segue os princípios de separação de conceitos através da divisão em camadas isoladas:

* **Domain:** Contém os modelos de dados puros e as interfaces dos repositórios, totalmente livre de frameworks e dependências externas.
* **Data:** Responsável pela infraestrutura de dados. Divide-se em `local` (persistência com Room Database) e `remote` (configuração de rede com Retrofit para consumo de APIs).
* **Presentation:** Camada de interface de usuário (UI) estruturada com `ViewModel`, `View Binding` para eliminação do `findViewById`, e `RecyclerView` com `ListAdapter` para renderização de listas de alta performance.

---

## 📁 Estrutura de Pacotes

```text
com.exemplo.ecommerce
│
├── data
│   ├── local
│   │   ├── ProductDao.kt
│   │   └── AppDatabase.kt
│   ├── remote
│   │   ├── ProductApiService.kt
│   │   └── RetrofitClient.kt
│   └── repository
│       └── ProductRepositoryImpl.kt
│
├── domain
│   ├── model
│   │   └── Product.kt
│   └── repository
│       └── ProductRepository.kt
│
└── presentation
    ├── viewmodel
    │   └── ProductViewModel.kt
    └── view
        ├── ProductAdapter.kt
        └── MainActivity.kt
