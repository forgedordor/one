package defpackage;

import android.os.ParcelFileDescriptor;
import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class euij implements Closeable {
    public abstract ParcelFileDescriptor a();

    public abstract ParcelFileDescriptor b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        elee eleeVar = new elee();
        try {
            eleeVar.a(b());
            eleeVar.a(a());
            eleeVar.close();
        } catch (Throwable th) {
            try {
                eleeVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
