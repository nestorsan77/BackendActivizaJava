package com.activiza.backendActiviza.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.activiza.backendActiviza.model.Cliente;
import com.activiza.backendActiviza.model.Entrenador;
import com.activiza.backendActiviza.model.EntrenadorDTO;
import com.activiza.backendActiviza.model.Publicacion;
import com.activiza.backendActiviza.model.Rutina;
import com.activiza.backendActiviza.model.Usuario;
import com.activiza.backendActiviza.repository.ClienteRepository;
import com.activiza.backendActiviza.repository.EntrenadorRepository;
import com.activiza.backendActiviza.repository.PublicacionRepository;
import com.activiza.backendActiviza.repository.RutinaRepository;
import com.activiza.backendActiviza.repository.UsuarioRepository;

@Service
public class EntrenadorService implements EntrenadorRepository{

	@Autowired
	private EntrenadorRepository entrenadorRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private RutinaRepository rutinaRepository;

    @Autowired
    private PublicacionRepository publicacionRepository;

    @Autowired
    private ClienteRepository clienteRepository;
    
    public Entrenador createEntrenador(EntrenadorDTO entrenadorDTO) {
        Entrenador entrenador = new Entrenador();

        // Establecer el Usuario
        Usuario usuario = usuarioRepository.findById(entrenadorDTO.getUserId())
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
        entrenador.setUser(usuario);

        // Establecer las Rutinas
        List<Rutina> rutinas = rutinaRepository.findAllById(entrenadorDTO.getRutinaIds());
        entrenador.setRutinas(rutinas);

        // Establecer las Publicaciones
        List<Publicacion> publicaciones = publicacionRepository.findAllById(entrenadorDTO.getPublicacionIds());
        entrenador.setPublicaciones(publicaciones);

        // Establecer los Clientes
        List<Cliente> clientes = clienteRepository.findAllById(entrenadorDTO.getClienteIds());
        entrenador.setClientes(clientes);

        // Guardar el Entrenador en la base de datos
        return entrenadorRepository.save(entrenador);
    }
	
	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Entrenador> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Entrenador> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<Entrenador> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Entrenador getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Entrenador getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Entrenador getReferenceById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Entrenador> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Entrenador> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Entrenador> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Entrenador> findAll() {
		return entrenadorRepository.findAll();
	}

	@Override
	public List<Entrenador> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Entrenador> S save(S entity) {
		return entrenadorRepository.save(entity);
	}

	@Override
	public Optional<Entrenador> findById(Long id) {
		// TODO Auto-generated method stub
		return entrenadorRepository.findById(id);
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Entrenador entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Entrenador> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Entrenador> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Entrenador> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Entrenador> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public <S extends Entrenador> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Entrenador> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Entrenador> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <S extends Entrenador, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		// TODO Auto-generated method stub
		return null;
	}

}
