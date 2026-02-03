package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yzp extends fcyz implements fdat {
    /* synthetic */ boolean a;
    final /* synthetic */ zaa b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yzp(zaa zaaVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = zaaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((yzp) c(bool, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return this.a ? this.b.n.e() : new fdui(new yzo(null));
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        yzp yzpVar = new yzp(this.b, fcxyVar);
        yzpVar.a = ((Boolean) obj).booleanValue();
        return yzpVar;
    }
}
