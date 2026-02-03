package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bxlf extends bxld {
    public static final cvw a = new cvw();

    public static Uri d(String str, Context context) {
        return c(context).b(str);
    }

    public static Uri e(Context context, Uri uri) {
        return !TextUtils.equals(uri.getAuthority(), bxlg.a(context)) ? uri : uri.buildUpon().authority(bxlg.b(context)).build();
    }

    public static Uri f(Uri uri, Context context) {
        return c(context).k(uri);
    }

    public static Uri g(InputStream inputStream, Context context) {
        return cqmz.d(context, inputStream, c(context).b(null));
    }

    public static File h(Uri uri, Context context) {
        return c(context).e(uri);
    }

    public static void i(Context context, Uri uri) {
        c(context).h(context, uri);
    }

    public static boolean j(Uri uri, Context context) {
        return c(context).j(uri);
    }

    @Override // defpackage.bxld
    protected File a(String str, String str2) {
        return b().f(str, str2);
    }

    @Override // defpackage.bxld, android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        String str3;
        if (strArr == null || strArr.length <= 0 || !TextUtils.equals(strArr[0], "_display_name") || !b().j(uri)) {
            return null;
        }
        cvw cvwVar = a;
        synchronized (cvwVar) {
            str3 = (String) cvwVar.get(uri);
        }
        if (TextUtils.isEmpty(str3)) {
            return null;
        }
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{"_display_name"});
        matrixCursor.newRow().add(str3);
        return matrixCursor;
    }
}
