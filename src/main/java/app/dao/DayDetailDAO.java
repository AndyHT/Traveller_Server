package app.dao;

import app.entity.DayDetailEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by jixiang on 2016/6/19.
 */

@Transactional
@Component
public interface DayDetailDAO extends CrudRepository<DayDetailEntity,String> {
    public List<DayDetailEntity> findByPlanId(String id);

    @Query("SELECT de FROM DayDetailEntity de WHERE de.planId = :id")
    public List<DayDetailEntity> findAllByPlanId(@Param("id") String id);

    public DayDetailEntity findById(String id);
}
