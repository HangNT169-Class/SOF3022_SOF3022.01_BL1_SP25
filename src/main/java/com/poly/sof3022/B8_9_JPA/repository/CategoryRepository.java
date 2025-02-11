package com.poly.sof3022.B8_9_JPA.repository;

import com.poly.sof3022.B8_9_JPA.entity.Category1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
// extends JpaRepository hoac CRUDRepository
// TS1: Doi tuong can thuc hien cac cau truy van => Ten class
// TS2: Kieu du lieu cua khoa chinh => Chi nhan kieu Object khong nhan kieu nguyen thuy
public interface CategoryRepository extends JpaRepository<Category1, Long> {
    // CRUD 1 bang => KHONG CAN PHAI VIET(JPA ho tro ham co san)
    // custom sql tu viet truy van tuy truong hop
    // 1. Query creation : Truy van bang menh de query: => Truy van bang doi tuong (class)
    // 2. Raw SQL:

    // C1: Truy van bang menh de => ten dai. Ten ham phu thuoc vao dieu kien truy van
    // Tra ve 1 doi tuong => category/findBy
    // Tra ve 1 list => categorys/findAllBy
    Category1 findCategory1ByIdOrCategoryCode(Long id, String categoryCode);

    // C2: Raw SQL: dat ten ham tuy y
    // 2.1: JPQL: JPA Query Language <=> HQL : Hibernate Query Language : Truy van tren thuc the (class)
    // Khong co:  select * from table

    @Query("SELECT cate FROM Category1 cate WHERE cate.id = ?2 AND cate.categoryName = ?1")
    Category1 timKiem1(String categoryName, Long id);

    // 2.2: Native query: Truy van tren bang (table trong SQL)
    // SELECT * FROM table
    @Query(value = "SELECT * FROM category WHERE id = ?2 AND category_name =?1", nativeQuery = true)
    Category1 timKiem2(String categoryName, Long id);

    // Phan trang: Page, Pageable
}
