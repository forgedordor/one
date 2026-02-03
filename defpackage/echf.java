package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class echf implements ecer {
    private boolean a = false;

    static {
        new AtomicInteger();
    }

    @Override // defpackage.ecer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final File a(eceq eceqVar) throws IOException {
        if (this.a) {
            if (eceqVar.b()) {
                throw new ecgh("Short circuit would skip transforms.");
            }
            return eceqVar.b.d(eceqVar.f);
        }
        ecgf ecgfVar = new ecgf(new echh().a(eceqVar));
        try {
            Closeable closeable = ecgfVar.a;
            if (!(closeable instanceof ecfq)) {
                throw new IOException("Not convertible and fallback to pipe is disabled.");
            }
            File fileC = ((ecfq) closeable).c();
            ecgfVar.close();
            return fileC;
        } catch (Throwable th) {
            try {
                ecgfVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void c() {
        this.a = true;
    }
}
