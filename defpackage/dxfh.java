package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dxfh extends fcyz implements fdat {
    int a;
    final /* synthetic */ dxfi b;
    final /* synthetic */ evjz c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxfh(dxfi dxfiVar, evjz evjzVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dxfiVar;
        this.c = evjzVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dxfh) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        dxfi dxfiVar = this.b;
        int iF = dxfiVar.c.f();
        if (iF == 1) {
            ListenableFuture listenableFuture = eorv.a;
            this.a = 1;
            Object objC = fdxs.c(listenableFuture, this);
            if (objC != fcylVar) {
                return objC;
            }
        } else {
            if (iF == 3) {
                return fctx.a;
            }
            dxnl dxnlVar = dxfiVar.a;
            evjz evjzVar = this.c;
            dxha dxhaVarA = dxpg.a(dxfiVar.b);
            this.a = 2;
            Object objC2 = dxnlVar.c(evjzVar, dxhaVarA, this);
            if (objC2 != fcylVar) {
                return objC2;
            }
        }
        return fcylVar;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dxfh(this.b, this.c, fcxyVar);
    }
}
