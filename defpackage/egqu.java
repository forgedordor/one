package defpackage;

import android.os.CancellationSignal;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egqu extends fcyz implements fdat {
    int a;
    final /* synthetic */ fcyh b;
    final /* synthetic */ fdap c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public egqu(fcyh fcyhVar, fdap fdapVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fcyhVar;
        this.c = fdapVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((egqu) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        fcyf fcyfVar = ((fdjx) this.d).hE().get(fdlr.c);
        fcyfVar.getClass();
        fdlt fdltVar = new fdlt((fdlr) fcyfVar);
        final CancellationSignal cancellationSignal = new CancellationSignal();
        fdltVar.hK(new fdap() { // from class: egqs
            @Override // defpackage.fdap
            public final Object invoke(Object obj2) {
                cancellationSignal.cancel();
                return fctx.a;
            }
        });
        fcyh fcyhVar = this.b;
        fdap fdapVar = this.c;
        fcyh fcyhVarA = eicg.a(fcyhVar);
        egqt egqtVar = new egqt(null, fdapVar, cancellationSignal, fdltVar);
        this.a = 1;
        Object objA = fdin.a(fcyhVarA, egqtVar, this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        egqu egquVar = new egqu(this.b, this.c, fcxyVar);
        egquVar.d = obj;
        return egquVar;
    }
}
