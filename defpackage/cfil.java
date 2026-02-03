package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfil extends fcyz implements fdat {
    int a;
    final /* synthetic */ cfik b;
    final /* synthetic */ ezol c;
    final /* synthetic */ Object d;
    final /* synthetic */ fdap e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfil(fcxy fcxyVar, cfik cfikVar, ezol ezolVar, Object obj, fdap fdapVar) {
        super(2, fcxyVar);
        this.b = cfikVar;
        this.c = ezolVar;
        this.d = obj;
        this.e = fdapVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cfil) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cfik cfikVar = this.b;
            ezol ezolVar = this.c;
            Object obj2 = this.d;
            fdap fdapVar = this.e;
            this.a = 1;
            obj = fdin.a(eicg.a(cfikVar.b), new cfim(null, cfikVar, obj2, ezolVar, fdapVar), this);
            if (obj != fcylVar) {
            }
        }
        if (i != 1) {
            return obj;
        }
        this.a = 2;
        Object objC = fdxs.c((ListenableFuture) obj, this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cfil cfilVar = new cfil(fcxyVar, this.b, this.c, this.d, this.e);
        cfilVar.f = obj;
        return cfilVar;
    }
}
