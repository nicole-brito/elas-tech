def menor_populacao(paises_populacao) 
    menor_pais = nil
    menor_pop = nil
  
    paises_populacao.each do |pais, populacao|
      if populacao.nil? || (menor_pop.nil? || populacao < menor_pop)
        menor_pais = pais
        menor_pop = populacao
      end
    end
  
    menor_pais
  end
  
  paises_populacao = [
    ["Brasil", 212627933],
    ["China", 1444215177],
    ["India", 1380004385],
    ["Estados Unidos", 338000000],
    ["Vaticano", 825]
  ]
  
  pais_menor_populacao = menor_populacao(paises_populacao)
  
  puts "País com menor população: #{pais_menor_populacao}"
  