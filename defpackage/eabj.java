package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eabj extends evsf implements evui {
    public eabj() {
        super(eabk.a);
    }

    public final void a(String str, eabe eabeVar) {
        str.getClass();
        eabeVar.getClass();
        copyOnWrite();
        eabk eabkVar = (eabk) this.instance;
        eabk eabkVar2 = eabk.a;
        evub evubVar = eabkVar.b;
        if (!evubVar.b) {
            eabkVar.b = evubVar.a();
        }
        eabkVar.b.put(str, eabeVar);
    }
}
