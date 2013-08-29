package org.ralasafe.entitle;

import java.io.OutputStream;
import java.util.Collection;

import org.ralasafe.EntityExistException;

public interface BackupManager {
	public Backup addBackup(Backup backup) throws EntityExistException;

	public void updateBackup(Backup backup);

	public Collection getBackups();
	
	public Backup getBackup(int id);

	public void exportBackup(int id, OutputStream out);
}
