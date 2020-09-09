package com.epicgames.ue4;

import com.anonymous.DinoHunt.OBBDownloaderService;
import com.anonymous.DinoHunt.DownloaderActivity;


public class DownloadShim
{
	public static OBBDownloaderService DownloaderService;
	public static DownloaderActivity DownloadActivity;
	public static Class<DownloaderActivity> GetDownloaderType() { return DownloaderActivity.class; }
}

