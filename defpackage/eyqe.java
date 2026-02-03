package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eyqe extends evsf implements evui {
    public eyqe() {
        super(eyqf.a);
    }

    public final void a(eypt eyptVar) {
        copyOnWrite();
        eyqf eyqfVar = (eyqf) this.instance;
        eyqf eyqfVar2 = eyqf.a;
        eyptVar.getClass();
        evtg evtgVar = eyqfVar.b;
        if (!evtgVar.c()) {
            eyqfVar.b = evsn.mutableCopy(evtgVar);
        }
        eyqfVar.b.add(eyptVar);
    }
}
