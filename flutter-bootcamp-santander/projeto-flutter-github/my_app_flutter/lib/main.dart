import 'package:flutter/material.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Flutter Demo',
      theme: ThemeData(
        colorScheme: ColorScheme.fromSeed(seedColor: Colors.deepPurple),
        useMaterial3: true,
      ),
      home: const MyHomePage(title: 'Subindo Projeto Flutter no Github'),
    );
  }
}

class MyHomePage extends StatefulWidget {
  const MyHomePage({super.key, required this.title});

  final String title;

  @override
  State<MyHomePage> createState() => _MyHomePageState();
}

class _MyHomePageState extends State<MyHomePage> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        backgroundColor: Theme.of(context).colorScheme.inversePrimary,
        title: Text(widget.title),
      ),
      body: const Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: <Widget>[
            Text(
              'Desafio',
              style: TextStyle(color: Colors.red),
            ),
            Text(
              'Configurar o Ambiente',
              style: TextStyle(color: Colors.purple),
            ),
            Text(
              'Criar um Projeto',
              style: TextStyle(color: Colors.green),
            ),
            Text(
              'Alterar Textos e Cores',
              style: TextStyle(color: Colors.yellow),
            ),
            Text(
              'Subir para o Github',
              style: TextStyle(color: Colors.blue),
            ),
            Text(
              "Visual Studio Code\n",
              style: TextStyle(color: Color.fromARGB(255, 117, 30, 117)),
            ),
          ],
        ),
      ),
      // This trailing comma makes auto-formatting nicer for build methods.
    );
  }
}
