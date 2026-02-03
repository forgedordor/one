package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgvo extends evsf implements evui {
    public fgvo() {
        super(fgvq.a);
    }

    public final void a(String str, fgvn fgvnVar) {
        fgvnVar.getClass();
        copyOnWrite();
        fgvq fgvqVar = (fgvq) this.instance;
        fgvq fgvqVar2 = fgvq.a;
        evub evubVar = fgvqVar.b;
        if (!evubVar.b) {
            fgvqVar.b = evubVar.a();
        }
        fgvqVar.b.put(str, fgvnVar);
    }
}
