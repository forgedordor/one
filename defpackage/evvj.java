package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evvj extends evsf implements evui {
    public evvj() {
        super(evvl.a);
    }

    public final void a(String str, evwg evwgVar) {
        evwgVar.getClass();
        copyOnWrite();
        evvl evvlVar = (evvl) this.instance;
        evvl evvlVar2 = evvl.a;
        evub evubVar = evvlVar.b;
        if (!evubVar.b) {
            evvlVar.b = evubVar.a();
        }
        evvlVar.b.put(str, evwgVar);
    }
}
