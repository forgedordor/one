package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exnf extends evsf implements evui {
    public exnf() {
        super(exng.a);
    }

    public final void a(String str) {
        copyOnWrite();
        exng exngVar = (exng) this.instance;
        exng exngVar2 = exng.a;
        evtg evtgVar = exngVar.f;
        if (!evtgVar.c()) {
            exngVar.f = evsn.mutableCopy(evtgVar);
        }
        exngVar.f.add(str);
    }
}
