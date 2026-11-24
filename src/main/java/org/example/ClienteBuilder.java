package org.example;

public class ClienteBuilder {

    private Cliente cliente;

    public ClienteBuilder() {
        cliente = new Cliente();
    }

    public Cliente build() {
        if (cliente.getCodigo() == 0) {
            throw new IllegalArgumentException("Código inválido");
        }
        if (cliente.getNome().equals("")) {
            throw new IllegalArgumentException("Nome inválido");
        }
        return cliente;
    }

    public ClienteBuilder setCodigo(int codigo) {
        cliente.setCodigo(codigo);
        return this;
    }

    public ClienteBuilder setNome(String nome) {
        cliente.setNome(nome);
        return this;
    }

    public ClienteBuilder setCpf(String cpf) {
        cliente.setCpf(cpf);
        return this;
    }

    public ClienteBuilder setEmail(String email) {
        cliente.setEmail(email);
        return this;
    }

    public ClienteBuilder setCelular(String celular) {
        cliente.setCelular(celular);
        return this;
    }

    public ClienteBuilder setEnderecoLogradouro(String enderecoLogradouro) {
        cliente.setEnderecoLogradouro(enderecoLogradouro);
        return this;
    }

    public ClienteBuilder setEnderecoNumero(int enderecoNumero) {
        cliente.setEnderecoNumero(enderecoNumero);
        return this;
    }

    public ClienteBuilder setEnderecoCidade(String enderecoCidade) {
        cliente.setEnderecoCidade(enderecoCidade);
        return this;
    }

}