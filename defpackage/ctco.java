package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctco extends fcyz implements fdat {
    int a;
    final /* synthetic */ ctdg b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctco(fcxy fcxyVar, ctdg ctdgVar) {
        super(2, fcxyVar);
        this.b = ctdgVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctco) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        try {
        } catch (egdj unused) {
            ctdg ctdgVar = this.b;
            this.a = 3;
            if (ctdgVar.m(this) != fcylVar) {
            }
        }
        if (i == 0) {
            fctl.b(obj);
            ctdg ctdgVar2 = this.b;
            this.a = 1;
            obj = ctdgVar2.a.c(this);
            if (obj != fcylVar) {
            }
            return fcylVar;
        }
        if (i != 1) {
            if (i != 2) {
                fctl.b(obj);
                return null;
            }
            fctl.b(obj);
            return (efwo) obj;
        }
        fctl.b(obj);
        ctcl ctclVar = (ctcl) obj;
        if ((ctclVar.b & 1) != 0) {
            ListenableFuture listenableFutureA = ((egir) this.b.c.b()).a(ctclVar.c);
            this.a = 2;
            obj = fdxs.c(listenableFutureA, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
            return (efwo) obj;
        }
        return null;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ctco ctcoVar = new ctco(fcxyVar, this.b);
        ctcoVar.c = obj;
        return ctcoVar;
    }
}
