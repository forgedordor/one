package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqnc extends evsf implements evui {
    public eqnc() {
        super(eqnd.a);
    }

    public final void a(String str) {
        copyOnWrite();
        eqnd eqndVar = (eqnd) this.instance;
        eqnd eqndVar2 = eqnd.a;
        eqndVar.a();
        eqndVar.h.add(str);
    }

    public final void b(String str, String str2) {
        str2.getClass();
        copyOnWrite();
        eqnd eqndVar = (eqnd) this.instance;
        eqnd eqndVar2 = eqnd.a;
        evub evubVar = eqndVar.g;
        if (!evubVar.b) {
            eqndVar.g = evubVar.a();
        }
        eqndVar.g.put(str, str2);
    }
}
