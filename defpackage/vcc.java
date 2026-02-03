package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vcc extends fcyz implements fdat {
    int a;
    final /* synthetic */ vce b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vcc(fcxy fcxyVar, vce vceVar) {
        super(2, fcxyVar);
        this.b = vceVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((vcc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        vce vceVar = this.b;
        ejly ejlyVar = (ejly) vceVar.a.b();
        ejgz ejgzVar = (ejgz) ejha.a.createBuilder();
        ejgzVar.getClass();
        ejhb ejhbVar = (ejhb) ejhc.a.createBuilder();
        ejhbVar.getClass();
        Object objB = vceVar.b.b();
        objB.getClass();
        ejhd.b((String) objB, ejhbVar);
        Object objB2 = vceVar.c.b();
        objB2.getClass();
        ejhd.c((String) objB2, ejhbVar);
        ejgy.b(ejhd.a(ejhbVar), ejgzVar);
        eopy eopyVarB = ejlyVar.b(ejgy.a(ejgzVar));
        final vca vcaVar = vca.a;
        eoqt eoqtVarG = eopyVarB.e(new eopo() { // from class: vbz
            @Override // defpackage.eopo
            public final /* synthetic */ Object a(eopt eoptVar, Object obj2) {
                return vcaVar.a(eoptVar, obj2);
            }
        }, (Executor) vceVar.e.b()).g();
        final vcb vcbVar = new vcb(vceVar);
        ListenableFuture listenableFutureF = eooh.f(eoqtVarG, IOException.class, new ejvr() { // from class: vby
            @Override // defpackage.ejvr
            public final /* synthetic */ Object apply(Object obj2) {
                return vcbVar.invoke(obj2);
            }
        }, (Executor) vceVar.d.b());
        this.a = 1;
        Object objC = fdxs.c(listenableFutureF, this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        vcc vccVar = new vcc(fcxyVar, this.b);
        vccVar.c = obj;
        return vccVar;
    }
}
