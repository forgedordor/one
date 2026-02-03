package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgyf extends fgzh {
    private static final long serialVersionUID = -3962147172340353796L;
    private fgyu a;
    private fgyu b;

    @Override // defpackage.fgzh
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.a);
        stringBuffer.append(" ");
        stringBuffer.append(this.b);
        return stringBuffer.toString();
    }

    @Override // defpackage.fgzh
    public final fgzh b() {
        return new fgyf();
    }

    @Override // defpackage.fgzh
    public final void c(fgxc fgxcVar) {
        this.a = new fgyu(fgxcVar);
        this.b = new fgyu(fgxcVar);
    }

    @Override // defpackage.fgzh
    public final void d(fgxe fgxeVar, fgww fgwwVar, boolean z) {
        this.a.h(fgxeVar, null, z);
        this.b.h(fgxeVar, null, z);
    }
}
