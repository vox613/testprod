package com.stc21.boot.auction.service;

import com.stc21.boot.auction.dto.CategoryDto;
import com.stc21.boot.auction.entity.Category;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
    List<Category> findAll();
    List<CategoryDto> getAllCategories();
    List<CategoryDto> getAllSorted(Sort sort);
    List<CategoryDto> getAllSortedEvenDeleted(Sort sort);
    CategoryDto convertToDto(Category category);
    Optional<Category> getById(long id);

    void setDeletedTo(long id, boolean newValue);
    Category save(CategoryDto categoryDto);
}
