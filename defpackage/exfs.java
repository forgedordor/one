package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exfs extends evsf implements evui {
    public exfs() {
        super(exft.a);
    }

    public final void a(int i) {
        copyOnWrite();
        exft exftVar = (exft) this.instance;
        exft exftVar2 = exft.a;
        evsx evsxVar = exftVar.d;
        if (!evsxVar.c()) {
            exftVar.d = evsn.mutableCopy(evsxVar);
        }
        exftVar.d.h(i - 2);
    }
}
