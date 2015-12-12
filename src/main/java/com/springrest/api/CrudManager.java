package com.springrest.api;

import java.io.Serializable;
import java.util.List;

public interface CrudManager<Entity extends Serializable, PrimaryKey extends Serializable> {

	/**
	 * * Add new record
	 *
	 * @param t
	 * @return object if successfully done otherwise return null
	 */
	public Entity addNew(Entity t);

	/**
	 * * Add list of records
	 *
	 * @param list
	 */
	public void addAll(List<Entity> list);

	/**
	 * * Update record with given data
	 *
	 * @param t
	 */
	public Entity update(Entity t);

	/**
	 * * remove given record
	 *
	 * @param t
	 */
	public void remove(Entity t);

	/**
	 * * remove by given ID/Code .
	 *
	 * @param id
	 *            which is must be unique
	 */
	public void removeBy(PrimaryKey id);

	/**
	 * * Find record with given id
	 *
	 * @param id
	 * @return record if found otherwise return null
	 */
	public Entity find(PrimaryKey id);

	/**
	 * * Find all records
	 *
	 */
	public List<Entity> findAll();

	/**
	 * * Find all record with paging
	 *
	 * @param pageSize
	 * @param index
	 * @return
	 */
	public List<Entity> findWithPaging(int page, int size);

	/**
	 * * Count total number of records
	 *
	 * @return
	 */
	public Long countRecord();
}
