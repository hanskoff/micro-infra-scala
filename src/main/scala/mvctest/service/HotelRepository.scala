package mvctest.service

import java.lang.Long

import mvctest.domain.Hotel
import org.springframework.data.jpa.repository.JpaRepository

trait HotelRepository extends JpaRepository[Hotel, Long]