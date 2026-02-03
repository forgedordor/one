package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emcw extends evsf implements evui {
    public emcw() {
        super(emcx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(Iterable iterable) {
        copyOnWrite();
        emcx emcxVar = (emcx) this.instance;
        emcx emcxVar2 = emcx.a;
        evsx evsxVar = emcxVar.m;
        if (!evsxVar.c()) {
            emcxVar.m = evsn.mutableCopy(evsxVar);
        }
        ekqh it = ((ekgb) iterable).iterator();
        while (it.hasNext()) {
            emcxVar.m.h(((emcg) it.next()).e);
        }
    }
}
