package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gvs {
    public final kio a;
    public final hgn b;

    public gvs(gvt gvtVar, kio kioVar, fdap fdapVar, fdap fdapVar2) {
        this.a = kioVar;
        this.b = new hgn(gvtVar, fdapVar2, new fdae() { // from class: gvq
            @Override // defpackage.fdae
            public final Object invoke() {
                return Float.valueOf(this.a.a.en(125.0f));
            }
        }, new fdae() { // from class: gvr
            @Override // defpackage.fdae
            public final Object invoke() {
                return hfm.a;
            }
        }, fdapVar);
    }

    public final gvt a() {
        return (gvt) this.b.h();
    }
}
