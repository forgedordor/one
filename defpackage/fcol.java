package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes6.dex */
abstract class fcol implements Runnable {
    final /* synthetic */ fcom b;

    public fcol(fcom fcomVar) {
        this.b = fcomVar;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        try {
            if (this.b.f == null) {
                throw new IOException("Unable to perform write due to unavailable sink.");
            }
            a();
        } catch (Exception e) {
            this.b.c.a(e);
        }
    }
}
