package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.core.content.FileProvider;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxmg extends FileProvider {
    @Override // androidx.core.content.FileProvider, android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException("RCS FileTransferProvider is not implemented.");
    }

    @Override // androidx.core.content.FileProvider, android.content.ContentProvider
    public final String getType(Uri uri) {
        throw new UnsupportedOperationException("RCS FileTransferProvider is not implemented.");
    }

    @Override // androidx.core.content.FileProvider, android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("RCS FileTransferProvider is not implemented.");
    }

    @Override // androidx.core.content.FileProvider, android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        throw new UnsupportedOperationException("RCS FileTransferProvider is not implemented.");
    }

    @Override // androidx.core.content.FileProvider, android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new UnsupportedOperationException("RCS FileTransferProvider is not implemented.");
    }

    @Override // androidx.core.content.FileProvider, android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("RCS FileTransferProvider is not implemented.");
    }
}
