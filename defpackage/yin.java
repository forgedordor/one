package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yin implements fdpm {
    final /* synthetic */ yip a;

    public yin(yip yipVar) {
        this.a = yipVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fdpm
    public final /* bridge */ /* synthetic */ Object fO(Object obj, fcxy fcxyVar) {
        ekqh it = ((ekgb) obj).iterator();
        it.getClass();
        while (it.hasNext()) {
            anec anecVar = (anec) it.next();
            yip yipVar = this.a;
            yipVar.b.J(anecVar.a);
        }
        return fctx.a;
    }
}
