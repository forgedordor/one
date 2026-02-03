package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class crfu extends fcyz implements fdat {
    int a;
    final /* synthetic */ crgd b;
    final /* synthetic */ List c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crfu(crgd crgdVar, List list, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = crgdVar;
        this.c = list;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((crfu) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        try {
            if (this.a != 0) {
                fctl.b(obj);
            } else {
                fctl.b(obj);
                crgd crgdVar = this.b;
                List list = this.c;
                this.a = 1;
                obj = crgdVar.f(list, this);
                if (obj == fcylVar) {
                    return fcylVar;
                }
            }
            return (crbg) obj;
        } catch (Throwable th) {
            crgd crgdVar2 = this.b;
            cqbd cqbdVarE = crgdVar2.n.e();
            cqbdVarE.I("Error while generating smart suggestions");
            cqbdVarE.s(th);
            auvh.h(((cden) crgdVar2.j.b()).b(th));
            crap crapVar = new crap();
            crapVar.b(ezac.EXCEPTION_THROWN);
            return crapVar.a();
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new crfu(this.b, this.c, fcxyVar);
    }
}
