package com.geekzila.file;

import java.util.List;

import com.geekzila.model.File;
import com.geekzila.service.FileService;
import com.geekzila.service.impl.FileServiceImpl;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		FileService fileService = new FileServiceImpl();
		List<File> files = fileService.findAll();
		{
			for (int i = 0; i < files.size(); i++) {
				File file = files.get(i);
				System.out.println("Name:" + file.getName() + " Page:" + file.getPage());
			}
		}
		File docx = new File("docx", 15);
		fileService.add(docx);
		System.out.println("New name:" + docx.getName() + " and page:" + docx.getPage());

		fileService.delete("pdf", 45);

		for (int i = 0; i < files.size(); i++) {
			File file = files.get(i);
			System.out.println("Name:" + file.getName() + " Page:" + file.getPage());
			System.out.println("Let's update");
		}

		File doc = fileService.get("doc", 10);
		doc.setName("word");
		doc.setPage(22);

		for (int i = 0; i < files.size(); i++) {
			File file = files.get(i);
			System.out.println("Name:" + file.getName() + " Page:" + file.getPage());
		}

	}
}