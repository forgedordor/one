package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjzi extends evsf implements evui {
    public cjzi() {
        super(cjzm.a);
    }

    public final void a(String str, dfir dfirVar) {
        copyOnWrite();
        cjzm cjzmVar = (cjzm) this.instance;
        cjzm cjzmVar2 = cjzm.a;
        evub evubVar = cjzmVar.b;
        if (!evubVar.b) {
            cjzmVar.b = evubVar.a();
        }
        cjzmVar.b.put(str, dfirVar);
    }

    public final void b(String str, boolean z) {
        copyOnWrite();
        cjzm cjzmVar = (cjzm) this.instance;
        cjzm cjzmVar2 = cjzm.a;
        evub evubVar = cjzmVar.c;
        if (!evubVar.b) {
            cjzmVar.c = evubVar.a();
        }
        cjzmVar.c.put(str, Boolean.valueOf(z));
    }
}
