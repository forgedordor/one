package defpackage;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feku implements fekj {
    private static final String[] a = {"_id", "class"};
    private final fekp b = new fekp();

    private static final ContentValues c(ComponentName componentName, int i, boolean z) {
        ContentValues contentValues = new ContentValues();
        if (z) {
            contentValues.put("package", componentName.getPackageName());
            contentValues.put("class", componentName.getClassName());
        }
        contentValues.put("badgecount", Integer.valueOf(i));
        return contentValues;
    }

    @Override // defpackage.fekj
    public final List a() {
        return Arrays.asList("com.sec.android.app.launcher", "com.sec.android.app.twlauncher");
    }

    @Override // defpackage.fekj
    public final void b(Context context, ComponentName componentName, int i) throws Throwable {
        Throwable th;
        Cursor cursorQuery;
        if (felc.a(context, new Intent("android.intent.action.BADGE_COUNT_UPDATE"))) {
            this.b.b(context, componentName, i);
            return;
        }
        Uri uri = Uri.parse("content://com.sec.badge/apps?notify=true");
        ContentResolver contentResolver = context.getContentResolver();
        try {
            cursorQuery = contentResolver.query(uri, a, "package=?", new String[]{componentName.getPackageName()}, null);
            if (cursorQuery != null) {
                try {
                    String className = componentName.getClassName();
                    boolean zEquals = false;
                    while (cursorQuery.moveToNext()) {
                        contentResolver.update(uri, c(componentName, i, false), "_id=?", new String[]{String.valueOf(cursorQuery.getInt(0))});
                        zEquals |= className.equals(cursorQuery.getString(cursorQuery.getColumnIndex("class")));
                    }
                    if (!zEquals) {
                        contentResolver.insert(uri, c(componentName, i, true));
                    }
                } catch (Throwable th2) {
                    th = th2;
                    feld.a(cursorQuery);
                    throw th;
                }
            }
            feld.a(cursorQuery);
        } catch (Throwable th3) {
            th = th3;
            cursorQuery = null;
        }
    }
}
