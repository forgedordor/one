package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
abstract class fhai extends fgzh {
    private static final long serialVersionUID = -8315884183112502995L;
    protected int a;
    protected fgyu b;

    protected fhai() {
    }

    @Override // defpackage.fgzh
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.a);
        stringBuffer.append(" ");
        stringBuffer.append(this.b);
        return stringBuffer.toString();
    }

    @Override // defpackage.fgzh
    public final void c(fgxc fgxcVar) {
        this.a = fgxcVar.b();
        this.b = new fgyu(fgxcVar);
    }

    @Override // defpackage.fgzh
    public void d(fgxe fgxeVar, fgww fgwwVar, boolean z) {
        fgxeVar.d(this.a);
        this.b.h(fgxeVar, null, z);
    }
}
