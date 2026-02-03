package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgzb extends fgzh {
    private static final long serialVersionUID = 1811540008806660667L;
    private int a;
    private fgyu b;
    private fgyu c;

    @Override // defpackage.fgzh
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.a);
        stringBuffer.append(" ");
        stringBuffer.append(this.b);
        stringBuffer.append(" ");
        stringBuffer.append(this.c);
        return stringBuffer.toString();
    }

    @Override // defpackage.fgzh
    public final fgzh b() {
        return new fgzb();
    }

    @Override // defpackage.fgzh
    public final void c(fgxc fgxcVar) {
        this.a = fgxcVar.b();
        this.b = new fgyu(fgxcVar);
        this.c = new fgyu(fgxcVar);
    }

    @Override // defpackage.fgzh
    public final void d(fgxe fgxeVar, fgww fgwwVar, boolean z) {
        fgxeVar.d(this.a);
        this.b.h(fgxeVar, null, z);
        this.c.h(fgxeVar, null, z);
    }
}
