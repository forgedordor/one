package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class doeg implements fdpm {
    final /* synthetic */ doem a;

    public doeg(doem doemVar) {
        this.a = doemVar;
    }

    @Override // defpackage.fdpm
    public final /* bridge */ /* synthetic */ Object fO(Object obj, fcxy fcxyVar) {
        dnes dnesVar = (dnes) fdey.f((fdev) obj);
        epiv epivVar = dnesVar != null ? (epiv) dnesVar.a : null;
        doem doemVar = this.a;
        if (doemVar.bD() != null) {
            doemVar.q(epivVar);
        } else {
            doemVar.e = epivVar;
        }
        doemVar.bL();
        return fctx.a;
    }
}
