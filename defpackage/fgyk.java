package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgyk extends fgzh {
    private static final long serialVersionUID = 5191232392044947002L;
    public int a;
    public int b;
    public fgyu c;
    private byte[] d;
    private byte[] e;
    private byte[] k;

    @Override // defpackage.fgzh
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.a);
        stringBuffer.append(" ");
        stringBuffer.append(this.b);
        stringBuffer.append(" ");
        stringBuffer.append(h(this.d, true));
        stringBuffer.append(" ");
        stringBuffer.append(h(this.e, true));
        stringBuffer.append(" ");
        stringBuffer.append(h(this.k, true));
        stringBuffer.append(" ");
        stringBuffer.append(this.c);
        return stringBuffer.toString();
    }

    @Override // defpackage.fgzh
    public final fgzh b() {
        return new fgyk();
    }

    @Override // defpackage.fgzh
    public final void c(fgxc fgxcVar) {
        this.a = fgxcVar.b();
        this.b = fgxcVar.b();
        this.d = fgxcVar.j();
        this.e = fgxcVar.j();
        this.k = fgxcVar.j();
        this.c = new fgyu(fgxcVar);
    }

    @Override // defpackage.fgzh
    public final void d(fgxe fgxeVar, fgww fgwwVar, boolean z) {
        fgxeVar.d(this.a);
        fgxeVar.d(this.b);
        fgxeVar.c(this.d);
        fgxeVar.c(this.e);
        fgxeVar.c(this.k);
        this.c.h(fgxeVar, null, z);
    }

    @Override // defpackage.fgzh
    public final fgyu hU() {
        return this.c;
    }
}
