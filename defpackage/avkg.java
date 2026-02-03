package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class avkg extends fcyz implements fdat {
    Object a;
    Object b;
    int c;
    final /* synthetic */ avki d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avkg(avki avkiVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.d = avkiVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((avkg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        egsh egshVar;
        Object obj2;
        fcyl fcylVar = fcyl.a;
        int i = this.c;
        if (i == 0) {
            fctl.b(obj);
            avki avkiVar = this.d;
            avkf avkfVar = avki.a;
            pzy pzyVar = pzy.d;
            Object objB = avkiVar.g.b();
            objB.getClass();
            egsh egshVar2 = avkiVar.e;
            this.a = egshVar2;
            this.b = pzyVar;
            this.c = 1;
            Object objB2 = avkfVar.b((cmfo) objB, this);
            if (objB2 != fcylVar) {
                egshVar = egshVar2;
                obj = objB2;
                obj2 = pzyVar;
            }
        }
        if (i != 1) {
            fctl.b(obj);
            return obj;
        }
        obj2 = this.b;
        Object obj3 = this.a;
        fctl.b(obj);
        egshVar = obj3;
        ListenableFuture listenableFutureC = egshVar.c(avkf.f((pzy) obj2, (String) obj));
        this.a = null;
        this.b = null;
        this.c = 2;
        Object objC = fdxs.c(listenableFutureC, this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new avkg(this.d, fcxyVar);
    }
}
