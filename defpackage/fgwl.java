package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgwl extends fgzh {
    private static final long serialVersionUID = 4763014646517016835L;
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
        if (this.d != null) {
            if (fgyz.a("multiline")) {
                stringBuffer.append(" (\n");
                stringBuffer.append(fhaw.b(this.d, true));
            } else {
                stringBuffer.append(" ");
                stringBuffer.append(fhaw.a(this.d));
            }
        }
        return stringBuffer.toString();
    }

    @Override // defpackage.fgzh
    public final fgzh b() {
        return new fgwl();
    }

    @Override // defpackage.fgzh
    public final void c(fgxc fgxcVar) {
        this.a = fgxcVar.b();
        this.b = fgxcVar.b();
        this.c = fgxcVar.c();
        this.d = fgxcVar.h();
    }

    @Override // defpackage.fgzh
    public final void d(fgxe fgxeVar, fgww fgwwVar, boolean z) {
        fgxeVar.d(this.a);
        fgxeVar.d(this.b);
        fgxeVar.g(this.c);
        fgxeVar.a(this.d);
    }
}
