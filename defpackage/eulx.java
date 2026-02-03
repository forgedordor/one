package defpackage;

import android.os.ParcelFileDescriptor;
import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class eulx implements Closeable {
    public abstract ParcelFileDescriptor a();

    public abstract ParcelFileDescriptor b();

    public abstract ParcelFileDescriptor c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        elee eleeVar = new elee();
        try {
            eleeVar.a(c());
            eleeVar.a(a());
            eleeVar.a(b());
            eleeVar.a(d());
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

    public abstract ParcelFileDescriptor d();

    public abstract String e();
}
