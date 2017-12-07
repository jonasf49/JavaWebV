var cursoModulo = angular.module('cursoModulo',[]);

cursoModulo.controller("cursoController", function($scope) {
	$scope.professores = [
	    {codigo:1, nome:'Neri Neitzke',email:'videoaulaneri@gmail.com',fone:'54 3329 5400'},
		{codigo:2, nome:'Lisiane Neitzke',email:'lisiane@informaticon.com',fone:'54 3329 1111'},
		{codigo:3, nome:'Gustavo Neitzke',email:'gustavo@gmail.com',fone:'54 3329 6789'},
		{codigo:4, nome:'Giulia Neitzke',email:'Giulia@gmail.com',fone:'54 6666 6789'}
	];

	$scope.cursos = [
	    {codigo:1, nome:'Java para Web',diashorarios:'Segundas e quartas, 19 hrs', professor:{codigo:1, nome:'Neri Neitzke',email:'videoaulaneri@gmail.com',fone:'54 3329 5400'}},
		{codigo:2, nome:'Delphi',diashorarios:'Terças e Quintas, 20 hrs',professor:{codigo:2, nome:'Lisiane Neitzke',email:'lisiane@informaticon.com',fone:'54 3329 1111'}},
		{codigo:3, nome:'PHP',diashorarios:'Sábados, 9 hrs',professor:{codigo:3, nome:'Gustavo Neitzke',email:'gustavo@gmail.com',fone:'54 3329 6789'}},
		{codigo:4, nome:'Arduino',diashorarios:'Sextas, 7 hrs',professor:{codigo:4, nome:'Giulia Neitzke',email:'Giulia@gmail.com',fone:'54 6666 6789'}}
	];

	$scope.selecionacurso = function(cursoSelecionado) {
		$scope.curso = cursoSelecionado;
	}

	$scope.limparCampos = function() {
		$scope.curso = "";
	}

	$scope.salvar = function() {
        $scope.cursos.push($scope.curso);
        $scope.limparCampos();
	}

	$scope.excluir = function() {
		$scope.cursos.splice($scope.cursos.indexOf($scope.curso),1);
	    $scope.limparCampos();
	}
});





