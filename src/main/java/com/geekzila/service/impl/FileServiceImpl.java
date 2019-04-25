package com.geekzila.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.geekzila.model.File;
import com.geekzila.service.FileService;

public class FileServiceImpl implements FileService {

	public List<File> files = new ArrayList<File>();

	public FileServiceImpl() {
		files.add(new File("doc", 10));
		files.add(new File("pdf", 45));
	}

	public void add(File file) {
		files.add(file);
	}

	public List<File> findAll() {
		return files;
	}

	public File get(String name, Integer page) {
		for (File file : files) {
			if (file.getName().equals(name) && file.getPage().equals(page)) {
				return file;
			}
		}
		return null;
	}

	public void delete(String name, Integer page) {
		File fileFromDb = get(name, page);
		files.remove(fileFromDb);
	}

	public File update(File file) {
		for (File fileFromDb : files) {
			if (fileFromDb.getName() == file.getName() && fileFromDb.getPage() == file.getPage()) {
				int indexFile = files.indexOf(fileFromDb);
				files.set(indexFile, file);
			}
		}
		return file;
	}
}
