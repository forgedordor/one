package org.chromium.base;

import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.storage.StorageManager;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Log;
import defpackage.ffxu;
import defpackage.ffyc;
import defpackage.ffyj;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class PathUtils {
    static {
        new AtomicBoolean();
    }

    private PathUtils() {
    }

    private static String[] a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            if (file != null && !TextUtils.isEmpty(file.getAbsolutePath())) {
                arrayList.add(file.getAbsolutePath());
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static String[] getAllPrivateDownloadsDirectories() {
        List arrayList = new ArrayList();
        ffyj ffyjVarB = ffyj.b();
        try {
            File[] externalFilesDirs = ffxu.a.getExternalFilesDirs(Environment.DIRECTORY_DOWNLOADS);
            if (externalFilesDirs != null) {
                arrayList = Arrays.asList(externalFilesDirs);
            }
            ffyjVarB.close();
            return a(arrayList);
        } catch (Throwable th) {
            try {
                ffyjVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static String getCacheDirectory() {
        throw null;
    }

    public static String getDataDirectory() {
        throw null;
    }

    public static String getDownloadsDirectory() {
        String path;
        ffyj ffyjVarA = ffyj.a();
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                List arrayList = new ArrayList();
                ffyj ffyjVarB = ffyj.b();
                try {
                    File[] externalFilesDirs = ffxu.a.getExternalFilesDirs(Environment.DIRECTORY_DOWNLOADS);
                    if (externalFilesDirs != null) {
                        arrayList = Arrays.asList(externalFilesDirs);
                    }
                    ffyjVarB.close();
                    String[] strArrA = a(arrayList);
                    path = strArrA.length == 0 ? "" : strArrA[0];
                } finally {
                }
            } else {
                path = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath();
            }
            ffyjVarA.close();
            return path;
        } catch (Throwable th) {
            try {
                ffyjVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static String[] getExternalDownloadVolumesNames() {
        ArrayList arrayList = new ArrayList();
        for (String str : MediaStore.getExternalVolumeNames(ffxu.a)) {
            if (!TextUtils.isEmpty(str) && !str.contains("external_primary")) {
                StorageManager storageManager = (StorageManager) ffxu.a.getSystemService(StorageManager.class);
                Uri contentUri = MediaStore.Files.getContentUri(str);
                try {
                    File directory = storageManager.getStorageVolume(contentUri).getDirectory();
                    File file = new File(directory, Environment.DIRECTORY_DOWNLOADS);
                    if (!file.isDirectory()) {
                        Log.w(ffyc.a("PathUtils"), String.format(Locale.US, "Download dir missing: %s, parent dir:%s, isDirectory:%s", file.getAbsolutePath(), directory.getAbsolutePath(), Boolean.valueOf(directory.isDirectory())));
                    }
                    arrayList.add(file);
                } catch (Exception e) {
                    ffyc.d("PathUtils", "Failed to get storage volume for uri: ".concat(String.valueOf(String.valueOf(contentUri))), e);
                }
            }
        }
        return a(arrayList);
    }

    public static String getExternalStorageDirectory() {
        return Environment.getExternalStorageDirectory().getAbsolutePath();
    }

    private static String getNativeLibraryDirectory() {
        ApplicationInfo applicationInfo = ffxu.a.getApplicationInfo();
        return ((applicationInfo.flags & 128) != 0 || (applicationInfo.flags & 1) == 0) ? applicationInfo.nativeLibraryDir : "/system/lib/";
    }

    public static String getThumbnailCacheDirectory() {
        throw null;
    }
}
