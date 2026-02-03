package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezut extends evsf implements evui {
    public ezut() {
        super(ezuu.a);
    }

    public final void a(int i) {
        copyOnWrite();
        ezuu ezuuVar = (ezuu) this.instance;
        ezuu ezuuVar2 = ezuu.a;
        evsx evsxVar = ezuuVar.b;
        if (!evsxVar.c()) {
            ezuuVar.b = evsn.mutableCopy(evsxVar);
        }
        ezuuVar.b.h(i);
    }
}
