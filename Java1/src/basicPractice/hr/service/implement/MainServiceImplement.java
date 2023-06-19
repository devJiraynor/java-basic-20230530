package basicPractice.hr.service.implement;

import basicPractice.hr.dto.GetEmployeeListResponseDto;
import basicPractice.hr.dto.GetEmployeeResponseDto;
import basicPractice.hr.dto.PatchEmployeeRequestDto;
import basicPractice.hr.dto.PostEmployeeRequestDto;
import basicPractice.hr.entity.EmployeeEntity;
import basicPractice.hr.repository.EmployeeRepository;
import basicPractice.hr.service.MainService;

public class MainServiceImplement implements MainService {

	private final EmployeeRepository employeeRepository;
	
	public MainServiceImplement(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	
	@Override
	public boolean postEmployee(PostEmployeeRequestDto dto) {
		// 입력한 데이터를 저장소에 저장
		EmployeeEntity employeeEntity = new EmployeeEntity(dto);
		boolean result = employeeRepository.save(employeeEntity);
		return result;
	}

	@Override
	public GetEmployeeListResponseDto[] getEmployeeList() {
		EmployeeEntity[] employeeEntityList = employeeRepository.findAll();
		
		GetEmployeeListResponseDto[] result = new GetEmployeeListResponseDto[5];
		for (int index = 0; index < result.length; index++) {
			
			EmployeeEntity employeeEntity = employeeEntityList[index];
			
			GetEmployeeListResponseDto item = new GetEmployeeListResponseDto();
			item.setEmployeeNumber(employeeEntity.getEmployeeNumber());
			item.setName(employeeEntity.getName());
			item.setEmail(employeeEntity.getEmail());
			item.setAddress(employeeEntity.getAddress());
			item.setBirth(employeeEntity.getBirth());
			item.setDepartment(employeeEntity.getDepartment());
			
			result[index] = item;
		}
		
		return result;
	}

	@Override
	public GetEmployeeResponseDto getEmployee(String employeeNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean patchEmployee(PatchEmployeeRequestDto dto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployee(String employeeNumber) {
		// TODO Auto-generated method stub
		return false;
	}

}
