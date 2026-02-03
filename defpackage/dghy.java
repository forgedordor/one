package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dghy extends fcyz implements fdat {
    int a;
    final /* synthetic */ dgia b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dghy(fcxy fcxyVar, dgia dgiaVar) {
        super(2, fcxyVar);
        this.b = dgiaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dghy) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2 = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dgia dgiaVar = this.b;
            this.a = 1;
            Object objA = fdin.a(eicg.a(dgiaVar.d), new dghz(null, dgiaVar), this);
            if (objA != obj2) {
                objA = fctx.a;
            }
            if (objA == obj2) {
                return obj2;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dghy dghyVar = new dghy(fcxyVar, this.b);
        dghyVar.c = obj;
        return dghyVar;
    }
}
