package com.www.lab5.services;

import com.www.lab5.dtos.CompanyDto;
import com.www.lab5.enums.Country;
import com.www.lab5.models.Address;
import com.www.lab5.models.Company;
import com.www.lab5.repositories.AddressRepository;
import com.www.lab5.repositories.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyService {
    @Autowired
    private CompanyRepository companyRepository;
    @Autowired
    private AddressRepository addressRepository;

    public Company create(CompanyDto companyDto) {

//        Chuyển đổi giá trị quốc gia thành enum Country
        Country country;
        try {
            country = Country.fromString(companyDto.getCompanyCountry());
        } catch (IllegalArgumentException e) {
            // Xử lý trường hợp giá trị không hợp lệ
            // Ví dụ: trả về hoặc log một thông báo lỗi
            return null;
        }
//        khởi tạo address
        Address address = new Address(
                companyDto.getCompanyStreet(),
                companyDto.getCompanyCity(),
                country,
                companyDto.getCompanyNumber(),
                companyDto.getCompanyZipcode()
                );
//        khởi tạo company
        Company company = new Company(
                companyDto.getCompanyAbout(),
                companyDto.getCompanyEmail(),
                companyDto.getCompanyName(),
                companyDto.getCompanyPhone(),
                companyDto.getCompanyWebUrl(),
                address
        );

        return companyRepository.save(company);
    }

    public List<Company> findAll() {
        return companyRepository.findAll();
    }

    public Optional<Company> findById(Long id) {
        return companyRepository.findById(id);
    }

    public Company update(Company company) {
        return  companyRepository.save(company);
    }

}
