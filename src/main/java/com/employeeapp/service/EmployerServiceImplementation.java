package com.employeeapp.service;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.employeeapp.entities.Employer;
import com.employeeapp.repository.EmployerRepository;

@Service
@Transactional
public class EmployerServiceImplementation implements EmployerService{
	@Autowired
	private  EmployerRepository repo;
	
	@Override
	public List<Employer> getAll() {
		return repo.findAll();
	}

	@Override
	public Optional<Employer> findEmployerByName(String employerName) {
		return repo.findByemployerName(employerName);
	}

	@Override
	public Optional<Employer> findEmployerById(Long employerId) {
		return repo.findByemployerId(employerId);
	}
}