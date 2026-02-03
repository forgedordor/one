package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class caec extends evsf implements evui {
    public caec() {
        super(caei.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(Iterable iterable) {
        copyOnWrite();
        caei caeiVar = (caei) this.instance;
        evsy evsyVar = caei.a;
        evsx evsxVar = caeiVar.g;
        if (!evsxVar.c()) {
            caeiVar.g = evsn.mutableCopy(evsxVar);
        }
        ekqh it = ((ekgb) iterable).iterator();
        while (it.hasNext()) {
            caeiVar.g.h(((caeg) it.next()).m);
        }
    }
}
