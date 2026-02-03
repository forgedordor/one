package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgrv extends fgrs {
    public final fgte a;

    public fgrv(fgsl fgslVar, fgrh fgrhVar) {
        super(fgslVar, null, fgrhVar);
        this.a = new fgte();
    }

    @Override // defpackage.fgrs
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final fgrv d() {
        return (fgrv) super.d();
    }

    @Override // defpackage.fgry
    public final void hT(fgry fgryVar) {
        super.hT(fgryVar);
        this.a.remove(fgryVar);
    }
}
