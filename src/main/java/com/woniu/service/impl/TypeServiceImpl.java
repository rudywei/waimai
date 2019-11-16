package com.woniu.service.impl;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.woniu.dao.TypeMapper;
import com.woniu.domain.Type;
import com.woniu.service.ITypeService;
@Service
public class TypeServiceImpl implements ITypeService{
@Autowired
private TypeMapper mapper;

	@Transactional
	@Override
	public void save(Type t) {
		// TODO Auto-generated method stub
		
		mapper.insertSelective(t);
	}

	@Transactional
	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		mapper.deleteByPrimaryKey(id);
	}

	@Transactional
	@Override
	public void update(Type t) {
		// TODO Auto-generated method stub
		mapper.updateByPrimaryKeySelective(t);
	}

	@Transactional(readOnly = true)
	@Override
	public Type findOne(Integer id) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(id);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Type> findAll(Integer currentPage, Integer pageSize) {
		// TODO Auto-generated method stub
		
		return mapper.selectByExample(null, new RowBounds(currentPage, pageSize));
	}
	
	@Transactional(readOnly = true)
	@Override
	public Integer findCount() {
		// TODO Auto-generated method stub
		return mapper.selectByExample(null).size();
	}

	@Override
	public List<Type> findAllType() {
		// TODO Auto-generated method stub
		return mapper.selectByExample(null);
	}

}
