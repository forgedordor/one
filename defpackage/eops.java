package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eops {
    public final eopm a = new eopm();
    public final ekgb b;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ eops(Iterable iterable) {
        this.b = ekgb.j(iterable);
        ekqh it = ((ekgb) iterable).iterator();
        while (it.hasNext()) {
            eopy eopyVar = (eopy) it.next();
            eopm eopmVar = this.a;
            eorz eorzVar = eopy.a;
            eopyVar.i(eopmVar);
        }
    }
}
