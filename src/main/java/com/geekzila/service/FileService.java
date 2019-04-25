package com.geekzila.service;

import java.util.List;

import com.geekzila.model.File;

public interface FileService {

	public void add(File file);

	public List<File> findAll();

	public File get(String name, Integer page);

	public void delete(String name, Integer page);

	public File update(File file);

}
