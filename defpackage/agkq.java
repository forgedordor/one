package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agkq extends fcyz implements fdat {
    int a;
    final /* synthetic */ agkr b;
    final /* synthetic */ ejha c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agkq(agkr agkrVar, ejha ejhaVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = agkrVar;
        this.c = ejhaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((agkq) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fcyh fcyhVarB = auus.b(((ejly) this.b.a.b()).c(this.c), (fdjx) this.d);
            this.a = 1;
            obj = ((fdme) fcyhVarB).hJ(this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        evrr evrrVarA = evrr.a();
        ezgw ezgwVar = (ezgw) evsn.parseFrom(ezgw.a, (InputStream) obj, evrrVarA);
        ezgwVar.getClass();
        return ezgwVar;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        agkq agkqVar = new agkq(this.b, this.c, fcxyVar);
        agkqVar.d = obj;
        return agkqVar;
    }
}
