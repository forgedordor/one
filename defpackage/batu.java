package defpackage;

import android.content.ContentUris;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class batu {
    public static final String[] c;
    public static final String[] d;
    private static final String[] f;
    private static final String[] g;
    private final cqxl i;
    public static final Uri a = MediaStore.Files.getContentUri("external");
    public static final Uri b = MediaStore.Files.getContentUri("external");
    public static final String e = e(bats.a, new Integer[]{1});
    private static final String h = e(bats.c, new Integer[]{1, 3});

    static {
        String[] strArr = {"_id", "_data", "width", "height", "orientation", "mime_type", "date_modified"};
        c = strArr;
        String[] strArr2 = {"_id", "width", "height", "orientation", "mime_type", "date_modified"};
        d = strArr2;
        f = (String[]) eknr.b(strArr, new String[]{"duration"}, String.class);
        g = (String[]) eknr.b(strArr2, new String[]{"duration"}, String.class);
    }

    public batu(cqxl cqxlVar) {
        this.i = cqxlVar;
    }

    public static Uri a() {
        return ((Boolean) batt.a.e()).booleanValue() ? b : a;
    }

    public static Uri b(Cursor cursor) {
        if (((Boolean) batt.a.e()).booleanValue()) {
            return ContentUris.withAppendedId(b, cursor.getLong(cursor.getColumnIndexOrThrow("_id")));
        }
        String string = cursor.getString(cursor.getColumnIndexOrThrow("_data"));
        ekrg ekrgVar = cqmz.a;
        if (string == null) {
            return null;
        }
        return Uri.fromFile(new File(string));
    }

    private static String e(String[] strArr, Integer[] numArr) {
        return "mime_type IN ('" + new ejwc("','").f(strArr) + "') AND media_type IN (" + ejwc.d(',').f(numArr) + ")";
    }

    public final String c() {
        return this.i.a() ? h : e;
    }

    public final String[] d() {
        return ((Boolean) batt.a.e()).booleanValue() ? this.i.a() ? g : d : this.i.a() ? f : c;
    }
}
