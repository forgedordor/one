package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tia extends fcyz implements fdat {
    final /* synthetic */ tib a;
    final /* synthetic */ String b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tia(fcxy fcxyVar, tib tibVar, String str) {
        super(2, fcxyVar);
        this.a = tibVar;
        this.b = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((tia) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return Boolean.valueOf(this.a.b.b(cpim.a(false, this.b, false, false, null, 3, 2, 0, 316)) != null);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        tia tiaVar = new tia(fcxyVar, this.a, this.b);
        tiaVar.c = obj;
        return tiaVar;
    }
}
