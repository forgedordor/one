package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgwk extends fgzh {
    private static final long serialVersionUID = 8544304287274216443L;
    private int a;
    private byte[] b;
    private byte[] c;

    @Override // defpackage.fgzh
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.a);
        stringBuffer.append(" ");
        stringBuffer.append(h(this.b, false));
        stringBuffer.append(" ");
        stringBuffer.append(h(this.c, true));
        return stringBuffer.toString();
    }

    @Override // defpackage.fgzh
    public final fgzh b() {
        return new fgwk();
    }

    @Override // defpackage.fgzh
    public final void c(fgxc fgxcVar) {
        this.a = fgxcVar.c();
        this.b = fgxcVar.j();
        this.c = fgxcVar.h();
    }

    @Override // defpackage.fgzh
    public final void d(fgxe fgxeVar, fgww fgwwVar, boolean z) {
        fgxeVar.g(this.a);
        fgxeVar.c(this.b);
        fgxeVar.a(this.c);
    }
}
