package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cajv implements cajw {
    public static final cajv a = new cajv();

    private cajv() {
    }

    @Override // defpackage.cajw
    public final Object a(Exception exc, cajn cajnVar, fcxy fcxyVar) {
        if (!(exc instanceof cpza)) {
            return cpyz.RETRY;
        }
        cpyz cpyzVar = ((cpza) exc).b;
        cpyzVar.getClass();
        return cpyzVar;
    }

    @Override // defpackage.cajw
    public final Object b(boolean z, cajn cajnVar, fcxy fcxyVar) {
        return fctx.a;
    }

    @Override // defpackage.cajw
    public final Object c(cpvs cpvsVar) {
        return fctx.a;
    }
}
