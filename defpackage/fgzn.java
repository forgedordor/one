package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgzn extends fgzh {
    private static final long serialVersionUID = 1640247915216425235L;
    private int a;
    private int b;
    private int c;
    private byte[] d;

    @Override // defpackage.fgzh
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.a);
        stringBuffer.append(" ");
        stringBuffer.append(this.b);
        stringBuffer.append(" ");
        stringBuffer.append(this.c);
        stringBuffer.append(" ");
        stringBuffer.append(fhau.a(this.d));
        return stringBuffer.toString();
    }

    @Override // defpackage.fgzh
    public final fgzh b() {
        return new fgzn();
    }

    @Override // defpackage.fgzh
    public final void c(fgxc fgxcVar) {
        this.a = fgxcVar.c();
        this.b = fgxcVar.c();
        this.c = fgxcVar.c();
        this.d = fgxcVar.h();
    }

    @Override // defpackage.fgzh
    public final void d(fgxe fgxeVar, fgww fgwwVar, boolean z) {
        fgxeVar.g(this.a);
        fgxeVar.g(this.b);
        fgxeVar.g(this.c);
        fgxeVar.a(this.d);
    }
}
