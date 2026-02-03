package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epjd extends evsf implements evui {
    public epjd() {
        super(epjf.a);
    }

    public final void a(String str, evqs evqsVar) {
        str.getClass();
        evqsVar.getClass();
        copyOnWrite();
        epjf epjfVar = (epjf) this.instance;
        epjf epjfVar2 = epjf.a;
        evub evubVar = epjfVar.b;
        if (!evubVar.b) {
            epjfVar.b = evubVar.a();
        }
        epjfVar.b.put(str, evqsVar);
    }
}
