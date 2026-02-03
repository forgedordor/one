package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgvi extends evsf implements evui {
    public fgvi() {
        super(fgvj.a);
    }

    public final void a(evqs evqsVar) {
        copyOnWrite();
        fgvj fgvjVar = (fgvj) this.instance;
        fgvj fgvjVar2 = fgvj.a;
        evqsVar.getClass();
        evtg evtgVar = fgvjVar.b;
        if (!evtgVar.c()) {
            fgvjVar.b = evsn.mutableCopy(evtgVar);
        }
        fgvjVar.b.add(evqsVar);
    }
}
