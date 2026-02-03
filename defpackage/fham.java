package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fham extends fgzh {
    private static final long serialVersionUID = 7955422413971804232L;
    private int a;
    private int b;
    private byte[] c = new byte[0];

    @Override // defpackage.fgzh
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append(this.a);
        stringBuffer2.append(" ");
        stringBuffer.append(stringBuffer2.toString());
        StringBuffer stringBuffer3 = new StringBuffer();
        stringBuffer3.append(this.b);
        stringBuffer3.append(" ");
        stringBuffer.append(stringBuffer3.toString());
        stringBuffer.append(h(this.c, true));
        return stringBuffer.toString();
    }

    @Override // defpackage.fgzh
    public final fgzh b() {
        return new fham();
    }

    @Override // defpackage.fgzh
    public final void c(fgxc fgxcVar) {
        this.a = fgxcVar.b();
        this.b = fgxcVar.b();
        this.c = fgxcVar.h();
    }

    @Override // defpackage.fgzh
    public final void d(fgxe fgxeVar, fgww fgwwVar, boolean z) {
        fgxeVar.d(this.a);
        fgxeVar.d(this.b);
        fgxeVar.a(this.c);
    }
}
