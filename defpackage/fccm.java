package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fccm implements Runnable {
    final /* synthetic */ InputStream a;
    final /* synthetic */ fccv b;

    public fccm(fccv fccvVar, InputStream inputStream) {
        this.a = inputStream;
        this.b = fccvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.f.n(this.a);
    }
}
