package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bacf {
    public static final cczv a = cdag.p(183258758);
    private static final cqce h = cqce.g("Bugle", "CursorQueryData");
    protected final Uri b;
    protected final String[] c;
    protected final String d;
    protected final String[] e;
    protected final String f;
    protected ContentResolver g;
    private final CancellationSignal i;

    public bacf(Context context, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        this(context, uri, strArr, str, strArr2, str2, null);
    }

    private static void c(fcsu fcsuVar, Exception exc) {
        if (fcsuVar != null) {
            ((cden) fcsuVar.b()).b(exc);
        }
    }

    public final Cursor a() {
        return b(null);
    }

    public final Cursor b(fcsu fcsuVar) {
        cqaz.h();
        Uri uri = Uri.EMPTY;
        Uri uri2 = this.b;
        if (uri.equals(uri2)) {
            return null;
        }
        try {
            return this.g.query(uri2, this.c, this.d, this.e, this.f, this.i);
        } catch (SQLiteException e) {
            h.s("ContentResolver query is failed", e);
            c(fcsuVar, e);
            return null;
        } catch (IllegalArgumentException e2) {
            h.s("ContentResolver query is failed", e2);
            c(fcsuVar, e2);
            return null;
        } catch (SecurityException e3) {
            h.s("ContentResolver query is failed", e3);
            if (!((Boolean) a.e()).booleanValue() || (!TextUtils.equals(Build.MODEL, "meizu note9") && !TextUtils.equals(Build.DEVICE, "meizunote9") && !TextUtils.equals(Build.PRODUCT, "meizu_note9"))) {
                throw e3;
            }
            c(fcsuVar, e3);
            return null;
        }
    }

    public bacf(Context context, Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
        this.b = uri;
        this.c = strArr;
        this.d = str;
        this.e = strArr2;
        this.f = str2;
        this.g = context.getContentResolver();
        this.i = cancellationSignal;
    }
}
