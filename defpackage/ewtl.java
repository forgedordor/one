package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewtl extends evsf implements evui {
    public ewtl() {
        super(ewtm.a);
    }

    public final void a(int i) {
        copyOnWrite();
        ewtm ewtmVar = (ewtm) this.instance;
        ewtm ewtmVar2 = ewtm.a;
        evsx evsxVar = ewtmVar.b;
        if (!evsxVar.c()) {
            ewtmVar.b = evsn.mutableCopy(evsxVar);
        }
        ewtmVar.b.h(i);
    }
}
