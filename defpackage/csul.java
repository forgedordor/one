package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csul extends evsf implements evui {
    public csul() {
        super(csup.a);
    }

    public final void a(String str, String str2) {
        str.getClass();
        copyOnWrite();
        csup csupVar = (csup) this.instance;
        csup csupVar2 = csup.a;
        evub evubVar = csupVar.d;
        if (!evubVar.b) {
            csupVar.d = evubVar.a();
        }
        csupVar.d.put(str, str2);
    }

    public final void b(String str, csuk csukVar) {
        csukVar.getClass();
        copyOnWrite();
        csup csupVar = (csup) this.instance;
        csup csupVar2 = csup.a;
        evub evubVar = csupVar.e;
        if (!evubVar.b) {
            csupVar.e = evubVar.a();
        }
        csupVar.e.put(str, csukVar);
    }
}
