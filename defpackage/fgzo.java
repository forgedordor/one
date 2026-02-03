package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgzo extends fgzh {
    private static final long serialVersionUID = 1049740098229303931L;
    public long a;
    public long b;
    private fgyu c;
    private fgyu d;
    private long e;
    private long k;
    private long l;

    public fgzo() {
    }

    @Override // defpackage.fgzh
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.c);
        stringBuffer.append(" ");
        stringBuffer.append(this.d);
        if (fgyz.a("multiline")) {
            stringBuffer.append(" (\n\t\t\t\t\t");
            stringBuffer.append(this.a);
            stringBuffer.append("\t; serial\n\t\t\t\t\t");
            stringBuffer.append(this.e);
            stringBuffer.append("\t; refresh\n\t\t\t\t\t");
            stringBuffer.append(this.k);
            stringBuffer.append("\t; retry\n\t\t\t\t\t");
            stringBuffer.append(this.l);
            stringBuffer.append("\t; expire\n\t\t\t\t\t");
            stringBuffer.append(this.b);
            stringBuffer.append(" )\t; minimum");
        } else {
            stringBuffer.append(" ");
            stringBuffer.append(this.a);
            stringBuffer.append(" ");
            stringBuffer.append(this.e);
            stringBuffer.append(" ");
            stringBuffer.append(this.k);
            stringBuffer.append(" ");
            stringBuffer.append(this.l);
            stringBuffer.append(" ");
            stringBuffer.append(this.b);
        }
        return stringBuffer.toString();
    }

    @Override // defpackage.fgzh
    public final fgzh b() {
        return new fgzo();
    }

    @Override // defpackage.fgzh
    public final void c(fgxc fgxcVar) {
        this.c = new fgyu(fgxcVar);
        this.d = new fgyu(fgxcVar);
        this.a = fgxcVar.e();
        this.e = fgxcVar.e();
        this.k = fgxcVar.e();
        this.l = fgxcVar.e();
        this.b = fgxcVar.e();
    }

    @Override // defpackage.fgzh
    public final void d(fgxe fgxeVar, fgww fgwwVar, boolean z) {
        this.c.h(fgxeVar, fgwwVar, z);
        this.d.h(fgxeVar, fgwwVar, z);
        fgxeVar.f(this.a);
        fgxeVar.f(this.e);
        fgxeVar.f(this.k);
        fgxeVar.f(this.l);
        fgxeVar.f(this.b);
    }

    public fgzo(fgyu fgyuVar, int i, fgyu fgyuVar2, fgyu fgyuVar3) {
        super(fgyuVar, i);
        p(fgyuVar2);
        this.c = fgyuVar2;
        p(fgyuVar3);
        this.d = fgyuVar3;
        this.a = 0L;
        this.e = 0L;
        this.k = 0L;
        this.l = 0L;
        this.b = 0L;
    }
}
