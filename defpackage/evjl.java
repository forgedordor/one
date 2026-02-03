package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evjl extends evsf implements evui {
    public evjl() {
        super(evjm.a);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        evjm evjmVar = (evjm) this.instance;
        evjm evjmVar2 = evjm.a;
        evjmVar.a();
        evpz.addAll(iterable, evjmVar.b);
    }
}
