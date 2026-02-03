package defpackage;

import java.util.concurrent.CountDownLatch;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class defz implements dega {
    public final CountDownLatch a = new CountDownLatch(1);

    @Override // defpackage.deey
    public final void a() {
        this.a.countDown();
    }

    @Override // defpackage.defe
    public final void d(Exception exc) {
        this.a.countDown();
    }

    @Override // defpackage.defh
    public final void e(Object obj) {
        this.a.countDown();
    }
}
