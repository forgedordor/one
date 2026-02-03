package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class csmv extends fcyz implements fdat {
    /* synthetic */ Object a;
    final /* synthetic */ efwo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csmv(efwo efwoVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = efwoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((csmv) c((csmo) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        csmn csmnVar = (csmn) ((csmo) this.a).toBuilder();
        csmnVar.getClass();
        int iA = this.b.a();
        csmnVar.copyOnWrite();
        csmo csmoVar = (csmo) csmnVar.instance;
        csmoVar.b |= 1;
        csmoVar.c = iA;
        return csmp.a(csmnVar);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        csmv csmvVar = new csmv(this.b, fcxyVar);
        csmvVar.a = obj;
        return csmvVar;
    }
}
