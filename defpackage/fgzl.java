package defpackage;

import java.util.Date;

/* compiled from: PG */
/* loaded from: classes6.dex */
abstract class fgzl extends fgzh {
    private static final long serialVersionUID = -3738444391533812369L;
    protected int a;
    protected int b;
    protected int c;
    protected long d;
    protected Date e;
    protected Date k;
    protected int l;
    protected fgyu m;
    protected byte[] n;

    protected fgzl() {
    }

    @Override // defpackage.fgzh
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(fhag.a(this.a));
        stringBuffer.append(" ");
        stringBuffer.append(this.b);
        stringBuffer.append(" ");
        stringBuffer.append(this.c);
        stringBuffer.append(" ");
        stringBuffer.append(this.d);
        stringBuffer.append(" ");
        if (fgyz.a("multiline")) {
            stringBuffer.append("(\n\t");
        }
        stringBuffer.append(fgxm.a(this.e));
        stringBuffer.append(" ");
        stringBuffer.append(fgxm.a(this.k));
        stringBuffer.append(" ");
        stringBuffer.append(this.l);
        stringBuffer.append(" ");
        stringBuffer.append(this.m);
        if (fgyz.a("multiline")) {
            stringBuffer.append("\n");
            stringBuffer.append(fhaw.b(this.n, true));
        } else {
            stringBuffer.append(" ");
            stringBuffer.append(fhaw.a(this.n));
        }
        return stringBuffer.toString();
    }

    @Override // defpackage.fgzh
    public final void c(fgxc fgxcVar) {
        this.a = fgxcVar.b();
        this.b = fgxcVar.c();
        this.c = fgxcVar.c();
        this.d = fgxcVar.e();
        this.e = new Date(fgxcVar.e() * 1000);
        this.k = new Date(fgxcVar.e() * 1000);
        this.l = fgxcVar.b();
        this.m = new fgyu(fgxcVar);
        this.n = fgxcVar.h();
    }

    @Override // defpackage.fgzh
    public final void d(fgxe fgxeVar, fgww fgwwVar, boolean z) {
        fgxeVar.d(this.a);
        fgxeVar.g(this.b);
        fgxeVar.g(this.c);
        fgxeVar.f(this.d);
        fgxeVar.f(this.e.getTime() / 1000);
        fgxeVar.f(this.k.getTime() / 1000);
        fgxeVar.d(this.l);
        this.m.h(fgxeVar, null, z);
        fgxeVar.a(this.n);
    }
}
