package defpackage;

import java.lang.ref.ReferenceQueue;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekkx extends ekkn {
    public final ReferenceQueue g;

    public ekkx(eklm eklmVar, int i) {
        super(eklmVar, i);
        this.g = new ReferenceQueue();
    }

    @Override // defpackage.ekkn
    public final void g() {
        n(this.g);
    }

    @Override // defpackage.ekkn
    public final void h() {
        f(this.g);
    }
}
