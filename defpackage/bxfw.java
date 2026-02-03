package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public abstract class bxfw extends babv implements bxgk, bxgq {
    private bxgq a;

    public bxfw(bxgq bxgqVar) {
        this.a = bxgqVar;
    }

    @Override // defpackage.bxgq
    public final void fU(bxgk bxgkVar) {
        bxgq bxgqVar;
        if (!i() || (bxgqVar = this.a) == null) {
            return;
        }
        bxgqVar.fU(bxgkVar);
    }

    @Override // defpackage.bxgq
    public final void fV(bxgk bxgkVar, bxgz bxgzVar, boolean z) {
        bxgq bxgqVar;
        if (!i() || (bxgqVar = this.a) == null) {
            return;
        }
        bxgqVar.fV(bxgkVar, bxgzVar, z);
    }

    @Override // defpackage.babu
    protected final void h() {
        this.a = null;
    }
}
