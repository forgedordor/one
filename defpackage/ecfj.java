package defpackage;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Pair;
import java.io.Closeable;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecfj {
    public static Pair a(final ParcelFileDescriptor parcelFileDescriptor) {
        return Pair.create(new Uri.Builder().scheme("fd").opaquePart(String.valueOf(parcelFileDescriptor.getFd())).build(), new Closeable() { // from class: ecfi
            @Override // java.io.Closeable, java.lang.AutoCloseable
            public final void close() throws IOException {
                parcelFileDescriptor.close();
            }
        });
    }
}
