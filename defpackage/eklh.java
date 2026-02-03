package defpackage;

import java.lang.ref.ReferenceQueue;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eklh extends ekkn {
    public final ReferenceQueue g;
    public final ReferenceQueue h;

    public eklh(eklm eklmVar, int i) {
        super(eklmVar, i);
        this.g = new ReferenceQueue();
        this.h = new ReferenceQueue();
    }

    @Override // defpackage.ekkn
    public final void g() {
        n(this.g);
    }

    @Override // defpackage.ekkn
    public final void h() {
        e(this.g);
        f(this.h);
    }
}
