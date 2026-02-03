package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqjt extends evsf implements evui {
    public eqjt() {
        super(eqjv.a);
    }

    public final void a(String str, evqs evqsVar) {
        copyOnWrite();
        eqjv eqjvVar = (eqjv) this.instance;
        eqjv eqjvVar2 = eqjv.a;
        evub evubVar = eqjvVar.g;
        if (!evubVar.b) {
            eqjvVar.g = evubVar.a();
        }
        eqjvVar.g.put(str, evqsVar);
    }
}
