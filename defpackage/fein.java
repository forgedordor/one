package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fein extends evsf implements evui {
    public fein() {
        super(feio.a);
    }

    public final void a(int i) {
        copyOnWrite();
        feio feioVar = (feio) this.instance;
        feio feioVar2 = feio.a;
        evsx evsxVar = feioVar.c;
        if (!evsxVar.c()) {
            feioVar.c = evsn.mutableCopy(evsxVar);
        }
        feioVar.c.h(i);
    }

    public final void b(int i) {
        copyOnWrite();
        feio feioVar = (feio) this.instance;
        feio feioVar2 = feio.a;
        evsx evsxVar = feioVar.b;
        if (!evsxVar.c()) {
            feioVar.b = evsn.mutableCopy(evsxVar);
        }
        feioVar.b.h(i);
    }
}
