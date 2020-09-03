package com.laptrinhjavaweb.dao.impl;

import java.util.List;

import com.laptrinhjavaweb.dao.INewDAO;
import com.laptrinhjavaweb.mapper.NewMapper;
import com.laptrinhjavaweb.model.NewModel;
import com.laptrinhjavaweb.paging.Pageble;

public class NewDAO extends AbstractDAO<NewModel> implements INewDAO {

	@Override
	public List<NewModel> findByCategoryId(Long categoryId) {
		
		String sql = "SELECT * FROM news WHERE categoryid = ?";
		return query(sql, new NewMapper(), categoryId);
	}

	@Override
	public Long save(NewModel news) {

		String sql = "INSERT INTO news(title, shortdescription, content, categoryid) VALUES(?, ?, ?, ?)";	
			
		return insert(sql, news.getTitle(), news.getShortDescription(), news.getContent(), news.getCategoryId());
	}

	@Override
	public NewModel findOne(Long id) {
		
		String sql = "SELECT * FROM news WHERE id = ?";
		List<NewModel> news = query(sql, new NewMapper(), id);
		
		return news.isEmpty() ? null : news.get(0);
	}

	@Override
	public void update(NewModel updatenews) {

		String sql = "UPDATE news SET title = ?, thumbnail = ?, shortdescription = ?, "
				+ "content = ?, categoryid = ?, createddate = ?, createdby = ?, "
				+ "modifieddate = ?, modifiedby = ? WHERE id = ?";
	
		update(sql, updatenews.getTitle(), updatenews.getThumbnail(), 
				updatenews.getShortDescription(), updatenews.getContent(), updatenews.getCategoryId(),
				updatenews.getCreatedDate(), updatenews.getCreatedBy(), updatenews.getModifiedDate(), 
				updatenews.getModifiedBy(), updatenews.getId());
	}

	@Override
	public void delete(long id) {

		String sql = "DELETE * FROM news WHERE id = ?";
		
		update(sql, id);
	}

	@Override
	public List<NewModel> findAll(Pageble pageble) {
		
		StringBuilder sql = new StringBuilder("SELECT * FROM news");
		if (pageble.getSorter() != null) {
			sql.append(" ORDER BY "+pageble.getSorter().getSortName()+" "+pageble.getSorter().getSortBy()+"");
		}
		if (pageble.getOffset() != null && pageble.getLimit() != null) {
			sql.append(" LIMIT "+pageble.getOffset()+", "+pageble.getLimit()+"");
		}
		return query(sql.toString(), new NewMapper());
	}

	@Override
	public int getTotalItems() {
		
		String sql = "SELECT count(*) FROM news";
		
		return count(sql);
	}
}
