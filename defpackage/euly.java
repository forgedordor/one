package defpackage;

import android.os.ParcelFileDescriptor;
import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class euly implements Closeable {
    public abstract ParcelFileDescriptor a();

    public abstract ParcelFileDescriptor b();

    public abstract ParcelFileDescriptor c();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        elee eleeVar = new elee();
        try {
            ekqh it = e().iterator();
            while (it.hasNext()) {
                eleeVar.a((eulx) it.next());
            }
            eleeVar.a(a());
            eleeVar.a(d());
            eleeVar.a(b());
            eleeVar.a(c());
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

    public abstract ekgb e();
}
