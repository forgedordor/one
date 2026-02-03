package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aobb extends fcyz implements fdat {
    int a;
    final /* synthetic */ anty b;
    final /* synthetic */ efwo c;
    final /* synthetic */ anue d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aobb(fcxy fcxyVar, anty antyVar, efwo efwoVar, anue anueVar) {
        super(2, fcxyVar);
        this.b = antyVar;
        this.c = efwoVar;
        this.d = anueVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aobb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            anty antyVar = this.b;
            final efwo efwoVar = this.c;
            final boolean z = true;
            final antf antfVar = (antf) antyVar;
            eiju eijuVarI = antfVar.f(ekgb.r(this.d)).b().i(new eooz() { // from class: ansc
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj2) {
                    ekgb ekgbVarG = ((ekgp) obj2).values().g();
                    z.booleanValue();
                    return antfVar.x(efwoVar, ekgbVarG, true);
                }
            }, antfVar.b);
            this.a = 1;
            obj = fdxs.c(eijuVarI, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        return Boolean.valueOf(((ekgp) obj).size() == 1);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        aobb aobbVar = new aobb(fcxyVar, this.b, this.c, this.d);
        aobbVar.e = obj;
        return aobbVar;
    }
}
