package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dghu extends fcyz implements fdat {
    int a;
    final /* synthetic */ dgia b;
    final /* synthetic */ dggn c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dghu(fcxy fcxyVar, dgia dgiaVar, dggn dggnVar) {
        super(2, fcxyVar);
        this.b = dgiaVar;
        this.c = dggnVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dghu) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dgia dgiaVar = this.b;
            this.a = 1;
            if (dgiaVar.s(this) == fcylVar) {
                return fcylVar;
            }
        }
        return fdct.b(this.b.f(this.c));
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dghu dghuVar = new dghu(fcxyVar, this.b, this.c);
        dghuVar.d = obj;
        return dghuVar;
    }
}
