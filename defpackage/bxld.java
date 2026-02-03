package defpackage;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes7.dex */
public abstract class bxld extends ContentProvider {

    /* compiled from: PG */
    public interface a {
        bxfu bH();
    }

    public static bxfu c(Context context) {
        return ((a) ehli.a(context, a.class)).bH();
    }

    protected abstract File a(String str, String str2);

    protected final bxfu b() {
        return c(getContext());
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        String path = uri.getPath();
        return (cqmr.h(path) && a(path, b().g(uri)).delete()) ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str) {
        String path = uri.getPath();
        if (cqmr.h(path)) {
            return ParcelFileDescriptor.open(a(path, b().g(uri)), cqmr.a(str));
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
