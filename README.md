# AcmeStore
Synthesized GitHub project for testing BiCo

Store for CD, DVD, Book articles


# Ground truth

## Issues

| Introducing Commit | Fix Commit | Type | Priority | Github Issue |
| ------ | ------ | ------ | ------ | ------ |
| 5de615507d5ab9909c6e418376b87502f0688eb9 | 6de5173cf6a91b638381669c013121b59ac94255 | bug | major | [#1](https://github.com/papagei9/AcmeStore/issues/1) |
| - | 267c6ebb927e12c10aa5d777acc0409b19210ec3 | feature | trivial | [#2](https://github.com/papagei9/AcmeStore/issues/2) |
| - | 131d40ce7961785bcf17e1480af7558e87374e41 | improvement | minor | [#3](https://github.com/papagei9/AcmeStore/issues/3) |
| 463091a2257fb4e3ab7b12a41cea84053d3cb709 | bea14e6c2d0263932f626972aedb67287b4516e1 | bug | blocker | [#4](https://github.com/papagei9/AcmeStore/issues/4) |
| 267c6ebb927e12c10aa5d777acc0409b19210ec3 | 00a6ce533e96e956b05e1b3b1249a1b1d74b25ed | bug | major | [#5](https://github.com/papagei9/AcmeStore/issues/5) |
| - | 088382ba8eb73b9c6dcff3f9ddb8276c866aa5fa | improvement | minor | [#6](https://github.com/papagei9/AcmeStore/issues/6) |
| - | abbaf768592f5b2bcb4b61b7ec3c4f5890831049 | improvement | major | [#7](https://github.com/papagei9/AcmeStore/issues/7) |
| - | c7c5f4bb49a1de1715da9e933a3331cc4a6836a8 | improvement | minor | [#8](https://github.com/papagei9/AcmeStore/issues/8) |
| 088382ba8eb73b9c6dcff3f9ddb8276c866aa5fa | 08e461a49ff2e7649ce2a337c3a740413613db61 | bug | major | [#9](https://github.com/papagei9/AcmeStore/issues/9) |
| c7c5f4bb49a1de1715da9e933a3331cc4a6836a8 | 15c4843dbc7263489ac1a1ec15728ef1e967e0e3 | bug | minor | [#10](https://github.com/papagei9/AcmeStore/issues/10) |
| - | 4ee76ac608c07d3c77cd283546e658bf3ea91adc | feature | minor | [#11](https://github.com/papagei9/AcmeStore/issues/11) |
| - | 7b993ef69f73f0cea351c4e5df93154ed6c86b0d | improvement | major | [#12](https://github.com/papagei9/AcmeStore/issues/12) |
| - | 9fcf637d46f11bd6556f2bfc49b598dccefd45fb | refactor | major | [#13](https://github.com/papagei9/AcmeStore/issues/13) |

## Source metrics

- CBO (Coupling between objects): Counts the number of dependencies a class has. The tools checks for any type used in the entire class (field declaration, method return types, variable declarations, etc). It ignores dependencies to Java itself (e.g. java.lang.String).
- DIT (Depth Inheritance Tree): It counts the number of "fathers" a class has. All classes have DIT at least 1 (everyone inherits java.lang.Object). In order to make it happen, classes must exist in the project (i.e. if a class depends upon X which relies in a jar/dependency file, and X depends upon other classes, DIT is counted as 2).
- NOC (Number of Children): Counts the number of children a class has.
- NOF (Number of fields): Counts the number of fields in a class, no matter its modifiers.
- NOPF (Number of public fields): Counts only the public fields.
- NOSF: Counts only the static fields.
- NOM (Number of methods): Counts the number of methods, no matter its modifiers.
- NOPM (Number of public methods): Counts only the public methods.
- NOSM (Number of static methods): Counts only the static methods.
- NOSI (Number of static invocations): Counts the number of invocations to static methods. It can only count the ones that can be resolved by the JDT.
- RFC (Response for a Class): Counts the number of unique method invocations in a class. As invocations are resolved via static analysis, this implementation fails when a method has overloads with same number of parameters, but different types.
- WMC (Weight Method Class) or McCabe's complexity. It counts the number of branch instructions in a class.
- LOC (Lines of code): It counts the lines of count, ignoring empty lines.
- LCOM (Lack of Cohesion of Methods): Calculates LCOM metric
- NOCB (Number of catch blocks): calculates NOCB metric
- NONC (Number of Null checks): calculates NONC metric
- NONA (Number of Null assignments): calculates NONA metric
- NOMWMOP: (Number of methods with more than one parameter): calculates NOMWMOP metric

Commit: ac964792db4e999edf2df1fd7521c0d968f005cc

| Path | ClassName | Type | CBO | DIT | LCOM | LOC | NOC | NOCB | NOF | NOM | NOMWMOP | NONA | NONC | NOPF | NOPM | NOSF | NOSI | NOSM | RFC | WMC |
| - | - | - | - | - | - | - | - | - | - | - | - | - | - | - | - | - | - | - | - | - |
| /src/Store.java | Store | class | 4 | 1 | 4 | 36 | 0 | 1 | 2 | 5 | 0 | 1 | 1 | 2 | 4 | 1 | 2 | 1 | 8 | 8 |
| /src/fixtures/Books.java | fixtures.Books | class | 3 | 1 | 0 | 18 | 0 | 0 | 0 | 1 | 0 | 0 | 0 | 0 | 1 | 0 | 0 | 0 | 1 | 1 |
| /src/fixtures/CDs.java | fixtures.CDs | class | 3 | 1 | 0 | 18 | 0 | 0 | 0 | 1 | 0 | 0 | 0 | 0 | 1 | 0 | 0 | 0 | 1 | 1 |
| /src/fixtures/DVDs.java | fixtures.DVDs | class | 3 | 1 | 0 | 18 | 0 | 0 | 0 | 1 | 0 | 0 | 0 | 0 | 1 | 0 | 0 | 0 | 1 | 1 |
| /src/fixtures/Customers.java | fixtures.Customers | class | 1 | 1 | 0 | 16 | 0 | 0 | 0 | 1 | 0 | 0 | 0 | 0 | 1 | 0 | 0 | 0 | 1 | 1 |
| /src/fixtures/IFixture.java | fixtures.IFixture | interface | 1 | 1 | 0 | 6 | 0 | 0 | 0 | 1 | 0 | 0 | 0 | 0 | 1 | 0 | 0 | 0 | 0 | 1 |  
| /src/model/Article.java | model.Article | class | 1 | 1 | 25 | 45 | 3 | 0 | 4 | 10 | 1 | 0 | 0 | 0 | 10 | 0 | 0 | 0 | 0 | 10 |
| /src/model/Book.java | model.Book | class | 1 | 2 | 0 | 30 | 0 | 0 | 2 | 7 | 1 | 0 | 0 | 0 | 7 | 0 | 0 | 0 | 1 | 7 |
| /src/model/CD.java | model.CD | class | 1 | 2 | 0 | 23 | 0 | 0 | 1 | 5 | 1 | 0 | 0 | 0 | 5 | 0 | 0 | 0 | 1 | 5 |
| /src/model/DVD.java | model.DVD | class | 1 | 2 | 3 | 13 | 0 | 0 | 0 | 3 | 1 | 0 | 0 | 0 | 3 | 0 | 0 | 0 | 0 | 3 |
| /src/model/Customer.java | model.Customer | class | 0 | 1 | 26 | 51 | 0 | 0 | 5 | 13 | 1 | 0 | 0 | 0 | 13 | 0 | 0 | 0 | 0 | 13 |
| /src/model/IArticle.java | model.IArticle | interface | 0 | 1 | 28 | 11 | 0 | 0 | 0 | 8 | 0 | 0 | 0 | 0 | 8 | 0 | 0 | 0 | 0 | 8 |
| /src/model/Order.java | model.Order | class | 2 | 1 | 4 | 33 | 0 | 0 | 2 | 8 | 0 | 0 | 0 | 0 | 8 | 0 | 0 | 0 | 3 | 9 |

## Change metrics

Commit: ac964792db4e999edf2df1fd7521c0d968f005cc

| Path | Revisions | Refactorings | Bugfixes | Authors | LOC+ | LOC- | MaxLOC+ | MaxLOC- | AvgLOC+ | AvgLOC- | CodeChurn | MaxCodeChurn | AvgCodeChurn | MaxChangeset | AvgChangeset | WeightedAge | Age(Weeks) | FirstCommit | LastCommit |
| - | - | - | - | - | - | - | - | - | - | - | - | - | - | - | - | - | - | - | - |
| /src/Store.java | 5 | 0 | 1 | 1 | 50 | 3 | 22 | 2 | 10 | 0.6 | 53 | 23 | 10.6 | 8 | 2.4 | 0 | 0 | 13.6.2017 9:00 | 13.6.2017 16:20 |
| /src/fixtures/Books.java | 2 | 0 | 0 | 1 | 30 | 3 | 27 | 3 | 15 | 1.5 | 33 | 27 | 16.5 | 8 | 5 | 0 | 0 | 13.6.2017 9:34 | 13.6.2017 10:08 |
| /src/fixtures/CDs.java | 1 | 0 | 0 | 1 | 28 | 0 | 28 | 0 | 28 | 0 | 28 | 28 | 28 | 8 | 8 | 0 | 0 | 13.6.2017 9:34 | 13.6.2017 9:34 |
| /src/fixtures/DVDs.java | 1 | 0 | 0 | 1 | 27 | 0 | 27 | 0 | 27 | 0 | 27 | 27 | 27 | 8 | 8 | 0 | 0 | 13.6.2017 9:34 | 13.6.2017 9:34 |
| /src/fixtures/Customers.java | 2 | 0 | 1 | 1 | 26 | 1 | 26 | 1 | 13 | 0.5 | 27 | 26 | 13.5 | 1 | 1 | 0 | 0 | 13.6.2017 9:54 | 13.6.2017 9:55 |
| /src/fixtures/IFixture.java | 1 | 0 | 0 | 1 | 9 | 0 | 9 | 0 | 9 | 0 | 9 | 9 | 9 | 8 | 8 | 0 | 0 | 13.6.2017 9:34 | 13.6.2017 9:34 |
| /src/model/Article.java | 1 | 1 | 0 | 1 | 57 | 0 | 57 | 0 | 57 | 0 | 57 | 57 | 57 | 4 | 4 | 0 | 0 | 13.6.2017 16:07 | 13.6.2017 16:07 |
| /src/model/Book.jva | 9 | 1 | 1 | 1 | 97 | 56 | 32 | 49 | 10.777777 | 6.222222 | 153 | 54 | 17 | 8 | 3.666666 | 0 | 0 | 13.6.2017 8:44 | 13.6.2017 16:07 |
| /src/model/CD.java | 9 | 1 | 2 | 1 | 85 | 55 | 38 | 50 | 9.444444 | 6.111111 | 140 | 55 | 15.555555 | 8 | 3.666666 | 0 | 0 | 13.6.2017 8:38 | 13.6.2017 16:07 |
| /src/model/DVD.java | 7 | 1 | 0 | 1 | 72 | 55 | 33 | 50 | 10.285714 | 7.857142 | 127 | 55 | 18.142857 | 8 | 4.285714 | 0 | 0 | 13.6.2017 8:40 | 13.6.2017 16:07 |
| /src/model/Customer.java | 4 | 0 | 0 | 1 | 68 | 5 | 32 | 2 | 17 | 1.25 | 73 | 32 | 18.25 | 5 | 2.25 | 0 | 0 | 13.6.2017 9:43 | 13.6.2017 10:02 |
| /src/model/IArticle.java | 4 | 0 | 0 | 1 | 21 | 4 | 11 | 3 | 5.25 | 1 | 25 | 11 | 6.25 | 4 | 3.5 | 0 | 0 | 13.6.2017 8:38 | 13.6.2017 9:36 |
| /src/model/Order.java | 2 | 0 | 0 | 1 | 45 | 0 | 40 | 0 | 22.5 | 0 | 45 | 40 | 22.5 | 5 | 3.5 | 0 | 0 | 13.6.2017 9:43 | 13.6.2017 | 10:02 |

## SZZ

n: no
y: yes

**/src/Store.java**

| Commit | Bugs | Bugfix | Deleted |
| - | - | - | - |
| 463091a2257fb4e3ab7b12a41cea84053d3cb709 | 1 | n | n |
| 854e27c7e2edbf4886dc2541743e8c9119392b5c | 1 | n | n |
| bea14e6c2d0263932f626972aedb67287b4516e1 | 0 | y | n |
| a100580cbd16bace6aa3bafc95aa1ea495632818 | 0 | n | n |
| ac964792db4e999edf2df1fd7521c0d968f005cc | 0 | n | n |

**/src/fixtures/Books.java**

| Commit | Bugs | Bugfix | Deleted |
| - | - | - | - |
| a100580cbd16bace6aa3bafc95aa1ea495632818 | 0 | n | n |
| 7b993ef69f73f0cea351c4e5df93154ed6c86b0d | 0 | n | n |

**/src/fixtures/CDs.java**

| Commit | Bugs | Bugfix | Deleted |
| - | - | - | - |
| a100580cbd16bace6aa3bafc95aa1ea495632818 | 0 | n | n |

**/src/fixtures/DVDs.java**

| Commit | Bugs | Bugfix | Deleted |
| - | - | - | - |
| a100580cbd16bace6aa3bafc95aa1ea495632818 | 0 | n | n |

**/src/fixtures/Customers.java**

| Commit | Bugs | Bugfix | Deleted |
| - | - | - | - |
| c7c5f4bb49a1de1715da9e933a3331cc4a6836a8 | 1 | n | n |
| 15c4843dbc7263489ac1a1ec15728ef1e967e0e3 | 0 | y | n |

 **/src/fixtures/IFixture.java**
 
| Commit | Bugs | Bugfix | Deleted |
| - | - | - | - |
| a100580cbd16bace6aa3bafc95aa1ea495632818 | 0 | n | n |

**/src/model/Article.javas**
 
| Commit | Bugs | Bugfix | Deleted |
| - | - | - | - |
| 9fcf637d46f11bd6556f2bfc49b598dccefd45fb | 0 | n | n |

**/src/model/Book.java**

| Commit | Bugs | Bugfix | Deleted |
| - | - | - | - |
| 7652bc0fcc45850b9155b37c012e339802728a82 | 0 | n | n |
| 267c6ebb927e12c10aa5d777acc0409b19210ec3 | 0 | n | n |
| 131d40ce7961785bcf17e1480af7558e87374e41 | 0 | n | n |
| a100580cbd16bace6aa3bafc95aa1ea495632818 | 0 | n | n |
| 088382ba8eb73b9c6dcff3f9ddb8276c866aa5fa | 1 | n | n |
| 08e461a49ff2e7649ce2a337c3a740413613db61 | 0 | y | n |
| 4ee76ac608c07d3c77cd283546e658bf3ea91adc | 0 | n | n |
| 7b993ef69f73f0cea351c4e5df93154ed6c86b0d | 0 | n | n |
| 9fcf637d46f11bd6556f2bfc49b598dccefd45fb | 0 | n | n |

**/src/model/CD.java**

| Commit | Bugs | Bugfix | Deleted |
| - | - | - | - |
| 5de615507d5ab9909c6e418376b87502f0688eb9 | 1 | n | n |
| 267c6ebb927e12c10aa5d777acc0409b19210ec3 | 2 | n | n |
| 6de5173cf6a91b638381669c013121b59ac94255 | 1 | y | n |
| 131d40ce7961785bcf17e1480af7558e87374e41 | 1 | n | n |
| 00a6ce533e96e956b05e1b3b1249a1b1d74b25ed | 0 | y | n |
| a100580cbd16bace6aa3bafc95aa1ea495632818 | 0 | n | n |
| 088382ba8eb73b9c6dcff3f9ddb8276c866aa5fa | 0 | n | n |
| 4ee76ac608c07d3c77cd283546e658bf3ea91adc | 0 | n | n |
| 9fcf637d46f11bd6556f2bfc49b598dccefd45fb | 0 | n | n |

**/src/model/DVD.java**

| Commit | Bugs | Bugfix | Deleted |
| - | - | - | - |
| 5acbc10a0c2700b5555963b5790bd8b440b0bcf4 | 0 | n | n |
| 267c6ebb927e12c10aa5d777acc0409b19210ec3 | 0 | n | n |
| 131d40ce7961785bcf17e1480af7558e87374e41 | 0 | n | n |
| a100580cbd16bace6aa3bafc95aa1ea495632818 | 0 | n | n |
| 088382ba8eb73b9c6dcff3f9ddb8276c866aa5fa | 0 | n | n |
| 4ee76ac608c07d3c77cd283546e658bf3ea91adc | 0 | n | n |
| 9fcf637d46f11bd6556f2bfc49b598dccefd45fb | 0 | n | n |

**/src/model/Customer.java**

| Commit | Bugs | Bugfix | Deleted |
| - | - | - | - |
| abbaf768592f5b2bcb4b61b7ec3c4f5890831049 | 0 | n | n |
| 212657a6779a6ad0648fb55b4659d82e9f119c71 | 0 | n | n |
| 4ee76ac608c07d3c77cd283546e658bf3ea91adc | 0 | n | n |

**/src/model/IArticle.java**

| Commit | Bugs | Bugfix | Deleted |
| - | - | - | - |
| 5de615507d5ab9909c6e418376b87502f0688eb9 | 0 | n | n |
| 267c6ebb927e12c10aa5d777acc0409b19210ec3 | 0 | n | n |
| 131d40ce7961785bcf17e1480af7558e87374e41 | 0 | n | n |
| 088382ba8eb73b9c6dcff3f9ddb8276c866aa5fa | 0 | n | n |

**/src/model/Order.java**

| Commit | Bugs | Bugfix | Deleted |
| - | - | - | - |
| 5f0f919e3945c1251b8d562c4d510ca1523a6ce0 | 0 | n | n |
| 4ee76ac608c07d3c77cd283546e658bf3ea91adc | 0 | n | n |