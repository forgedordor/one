package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cgyo extends fcyz implements fdap {
    final /* synthetic */ cgzi a;
    final /* synthetic */ chbd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgyo(cgzi cgziVar, chbd chbdVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.a = cgziVar;
        this.b = chbdVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        cgzi cgziVar = this.a;
        chbd chbdVar = this.b;
        cgxy cgxyVar = chbdVar.b;
        cgxv cgxvVarF = cgziVar.f(cgxyVar);
        if (cgxvVarF == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Object objQ = cgziVar.q(cgzi.r(cgxvVarF, cgxyVar), chbdVar.c, cgxyVar);
        if (true == (objQ instanceof fctj)) {
            objQ = null;
        }
        cgyi cgyiVar = objQ != null ? new cgyi(cgxvVarF, objQ) : null;
        return cgyiVar == null ? auvw.m(cgziVar.i, null, new cgyk(cgziVar, chbdVar, null), 3) : auvw.m(cgziVar.h, cgziVar.g, new cgyt(cgziVar, cgyiVar, chbdVar, null), 2);
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new cgyo(this.a, this.b, (fcxy) obj).b(fctx.a);
    }
}
