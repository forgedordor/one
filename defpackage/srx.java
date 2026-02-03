package defpackage;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteConstraintException;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import java.io.File;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class srx {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/attachment/ScopedStorageAttachmentSaver");
    public final Context b;
    public final cqmt c;
    private final bxfu d;

    public srx(Context context, cqmt cqmtVar, bxfu bxfuVar) {
        this.b = context;
        this.c = cqmtVar;
        this.d = bxfuVar;
    }

    public static Uri a(String str) {
        int i = Build.VERSION.SDK_INT;
        boolean zM = le.m(str);
        String str2 = i >= 29 ? "external_primary" : "external";
        return zM ? MediaStore.Images.Media.getContentUri(str2) : le.z(str) ? MediaStore.Video.Media.getContentUri(str2) : le.f(str) ? MediaStore.Audio.Media.getContentUri(str2) : MediaStore.Files.getContentUri(str2);
    }

    private static boolean d(String str) {
        return str != null && str.endsWith("/*");
    }

    public final String b(String str) {
        if (le.m(str)) {
            return new File(Environment.DIRECTORY_PICTURES, this.b.getResources().getString(R.string.app_name)).getPath();
        }
        if (le.z(str)) {
            return new File(Environment.DIRECTORY_MOVIES, this.b.getResources().getString(R.string.app_name)).getPath();
        }
        if (!le.f(str)) {
            return Environment.DIRECTORY_DOWNLOADS;
        }
        return new File(Environment.DIRECTORY_MUSIC, this.b.getResources().getString(R.string.app_name)).getPath();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.String, java.lang.String[]] */
    public final void c(List list) {
        String strG;
        ContentResolver contentResolver;
        ContentValues contentValues;
        String str;
        ?? r5;
        Uri uri;
        Uri uriInsert;
        ContentResolver contentResolver2 = this.b.getContentResolver();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sru sruVar = (sru) it.next();
            String strSubstring = sruVar.b;
            if (TextUtils.isEmpty(le.d(strSubstring)) || d(strSubstring)) {
                Uri uri2 = sruVar.a;
                String type = contentResolver2.getType(uri2);
                if (TextUtils.isEmpty(type) || d(type)) {
                    bxfu bxfuVar = this.d;
                    if (bxfuVar.j(uri2) && (strG = bxfuVar.g(uri2)) != null) {
                        if (d(strSubstring)) {
                            strSubstring = strSubstring.substring(0, strSubstring.length() - 1);
                        }
                        if (strSubstring.endsWith("/")) {
                            String strConcat = String.valueOf(strSubstring).concat(strG);
                            if (!TextUtils.isEmpty(le.d(strConcat))) {
                                strSubstring = strConcat;
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(type) && !d(type)) {
                    strSubstring = type;
                }
            }
            Uri uriA = a(strSubstring);
            ContentValues contentValues2 = new ContentValues();
            String strD = sruVar.e;
            if (strD == null && (strD = cqmr.d(sruVar.d)) == null) {
                strD = this.c.b(strSubstring);
            }
            contentValues2.put("_display_name", strD);
            contentValues2.put("mime_type", strSubstring);
            Iterator it2 = it;
            if (Build.VERSION.SDK_INT >= 29) {
                contentValues2.put("relative_path", b(strSubstring));
                contentValues2.put("is_pending", (Integer) 1);
            }
            try {
                uriInsert = contentResolver2.insert(uriA, contentValues2);
                contentResolver = contentResolver2;
                uri = uriA;
                contentValues = contentValues2;
                str = "is_pending";
                r5 = 0;
            } catch (Exception e) {
                ekrw ekrwVarI = a.i();
                ekrwVarI.X(eksq.a, "BugleStorage");
                contentResolver = contentResolver2;
                contentValues = contentValues2;
                str = "is_pending";
                r5 = 0;
                ((ekrd) ((ekrd) ekrwVarI).h("com/google/android/apps/messaging/attachment/ScopedStorageAttachmentSaver", "saveMediaAttachments", 76, "ScopedStorageAttachmentSaver.java")).K("Error when inserting display name: %s of type: %s with relative path: %s into: %s Exception: %s", contentValues2.get("_display_name"), contentValues2.get("mime_type"), Build.VERSION.SDK_INT >= 29 ? contentValues2.get("relative_path") : "Pre Q, no relative path", uriA, e.getMessage());
                uri = uriA;
                uriInsert = null;
            }
            if (uriInsert != null) {
                sruVar.c = uriInsert;
                Context context = this.b;
                cqmz.k(context, sruVar.a, uriInsert);
                if (Build.VERSION.SDK_INT >= 29) {
                    contentValues.clear();
                    contentValues.put(str, (Integer) 0);
                    try {
                        context.getContentResolver().update(uriInsert, contentValues, r5, r5);
                    } catch (SQLiteConstraintException | IllegalStateException e2) {
                        ekrw ekrwVarI2 = a.i();
                        ekrwVarI2.X(eksq.a, "BugleStorage");
                        ((ekrd) ((ekrd) ekrwVarI2).h("com/google/android/apps/messaging/attachment/ScopedStorageAttachmentSaver", "saveMediaAttachments", 98, "ScopedStorageAttachmentSaver.java")).D("Error when trying to set pending state of: %s Exception: %s", uri, e2.getMessage());
                    }
                }
            }
            it = it2;
            contentResolver2 = contentResolver;
        }
    }
}
