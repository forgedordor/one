package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cihp extends fcyz implements fdat {
    /* synthetic */ Object a;
    final /* synthetic */ boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cihp(boolean z, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = z;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cihp) c((cihw) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        cihv cihvVar = (cihv) ((cihw) this.a).toBuilder();
        cihvVar.getClass();
        cihvVar.copyOnWrite();
        cihw cihwVar = (cihw) cihvVar.instance;
        cihwVar.b |= 1;
        cihwVar.c = this.b;
        return cihx.a(cihvVar);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cihp cihpVar = new cihp(this.b, fcxyVar);
        cihpVar.a = obj;
        return cihpVar;
    }
}
