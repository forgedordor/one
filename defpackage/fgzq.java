package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgzq extends fgzh {
    private static final long serialVersionUID = -3886460132387522052L;
    public int a;
    public int b;
    public int c;
    public fgyu d;

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
        StringBuffer stringBuffer4 = new StringBuffer();
        stringBuffer4.append(this.c);
        stringBuffer4.append(" ");
        stringBuffer.append(stringBuffer4.toString());
        stringBuffer.append(this.d);
        return stringBuffer.toString();
    }

    @Override // defpackage.fgzh
    public final fgzh b() {
        return new fgzq();
    }

    @Override // defpackage.fgzh
    public final void c(fgxc fgxcVar) {
        this.a = fgxcVar.b();
        this.b = fgxcVar.b();
        this.c = fgxcVar.b();
        this.d = new fgyu(fgxcVar);
    }

    @Override // defpackage.fgzh
    public final void d(fgxe fgxeVar, fgww fgwwVar, boolean z) {
        fgxeVar.d(this.a);
        fgxeVar.d(this.b);
        fgxeVar.d(this.c);
        this.d.h(fgxeVar, null, z);
    }

    @Override // defpackage.fgzh
    public final fgyu hU() {
        return this.d;
    }
}
