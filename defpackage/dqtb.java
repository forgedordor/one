package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dqtb {
    protected final dqtc a;
    public dqyj b;

    public dqtb(String str, String str2) {
        dqoq dqoqVar = new dqoq();
        dqoqVar.b(false);
        dqoqVar.b = dqsb.a;
        this.a = dqoqVar;
        this.b = null;
        dqoqVar.a = str;
        dqoqVar.c = str2;
    }

    public abstract dqta b();

    public final int d() {
        return b().b();
    }

    public final void e() {
        this.a.b(true);
    }

    public final void f(String str) {
        ((dqoq) this.a).b = new dqsb(str);
    }
}
