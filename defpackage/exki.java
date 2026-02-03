package defpackage;

import android.util.Log;
import com.google.research.xeno.effect.AssetDownloader;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exki implements AssetDownloader {
    private final ExecutorService a;

    public exki() {
        int iMax = Math.max(10, 1);
        eosw eoswVar = new eosw();
        eoswVar.d("xeno-http-asset-downloader-thread-%d");
        this.a = Executors.newFixedThreadPool(iMax, eosw.b(eoswVar));
    }

    @Override // com.google.research.xeno.effect.AssetDownloader
    public final void downloadAsset(final String str, final AssetDownloader.DownloadCallback downloadCallback) {
        try {
            this.a.execute(new Runnable() { // from class: exkh
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    Throwable th;
                    FileOutputStream fileOutputStream;
                    File fileCreateTempFile;
                    BufferedInputStream bufferedInputStream;
                    String str2 = str;
                    AssetDownloader.DownloadCallback downloadCallback2 = downloadCallback;
                    try {
                        Log.d("xno.HttpAssetDownloader", a.v(str2, "Starting download of asset at URL: "));
                        try {
                            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str2).openConnection();
                            httpURLConnection.connect();
                            int responseCode = httpURLConnection.getResponseCode();
                            if (httpURLConnection.getResponseCode() != 200) {
                                throw new IOException(String.format("Bad Http status code: %d", Integer.valueOf(responseCode)));
                            }
                            fileCreateTempFile = File.createTempFile("XenoHttpAssetDownloaderTmpFile", null);
                            try {
                                bufferedInputStream = new BufferedInputStream(httpURLConnection.getInputStream(), 8192);
                                try {
                                    fileOutputStream = new FileOutputStream(fileCreateTempFile.getPath());
                                    try {
                                        byte[] bArr = new byte[8192];
                                        while (true) {
                                            int i = bufferedInputStream.read(bArr);
                                            if (i == -1) {
                                                try {
                                                    fileOutputStream.close();
                                                    bufferedInputStream.close();
                                                    Log.d("xno.HttpAssetDownloader", "Finished download of asset at URL: " + str2 + " to location: " + String.valueOf(fileCreateTempFile));
                                                    downloadCallback2.onCompletion(fileCreateTempFile.getPath(), null);
                                                    return;
                                                } finally {
                                                    if (fileCreateTempFile != null) {
                                                        Log.d("xno.HttpAssetDownloader", "Deleting temp file following unsuccessful download of asset at URL: ".concat(String.valueOf(str2)));
                                                        fileCreateTempFile.delete();
                                                    }
                                                }
                                            }
                                            fileOutputStream.write(bArr, 0, i);
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        if (fileOutputStream != null) {
                                            try {
                                                fileOutputStream.close();
                                            } catch (Throwable th3) {
                                                if (fileCreateTempFile != null) {
                                                    Log.d("xno.HttpAssetDownloader", "Deleting temp file following unsuccessful download of asset at URL: ".concat(String.valueOf(str2)));
                                                    fileCreateTempFile.delete();
                                                }
                                                throw th3;
                                            }
                                        }
                                        if (bufferedInputStream != null) {
                                            bufferedInputStream.close();
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    fileOutputStream = null;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                fileOutputStream = null;
                                bufferedInputStream = null;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            fileOutputStream = null;
                            fileCreateTempFile = null;
                            bufferedInputStream = null;
                        }
                    } catch (Exception e) {
                        Log.d("xno.HttpAssetDownloader", "Failure while downloading asset at URL: ".concat(String.valueOf(str2)));
                        downloadCallback2.onCompletion(null, e.getMessage());
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
            downloadCallback.onCompletion(null, "Asset downloader has been released");
        }
    }
}
