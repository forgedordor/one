package defpackage;

import java.io.UnsupportedEncodingException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgwu extends fgxh {
    public long a;
    public long b;
    public byte[] c;
    public byte[] d;

    public fgwu() {
        super(20732);
    }

    @Override // defpackage.fgxh
    public final String a() {
        try {
            StringBuffer stringBuffer = new StringBuffer("{task ");
            stringBuffer.append(this.a);
            stringBuffer.append("/");
            stringBuffer.append(this.b);
            stringBuffer.append(" ");
            stringBuffer.append(new String(this.c, "UTF-8"));
            stringBuffer.append("/");
            stringBuffer.append(new String(this.d, "UTF-8"));
            stringBuffer.append("}");
            return stringBuffer.toString();
        } catch (UnsupportedEncodingException unused) {
            StringBuffer stringBuffer2 = new StringBuffer("{task ");
            stringBuffer2.append(this.a);
            stringBuffer2.append("/");
            stringBuffer2.append(this.b);
            stringBuffer2.append("}");
            return stringBuffer2.toString();
        }
    }

    @Override // defpackage.fgxh
    public final void b(fgxc fgxcVar) {
        this.a = fgxcVar.e();
        this.b = fgxcVar.e();
        this.c = fgxcVar.i(fgxcVar.c());
        this.d = fgxcVar.i(fgxcVar.c());
    }

    @Override // defpackage.fgxh
    public final void c(fgxe fgxeVar) {
        fgxeVar.f(this.a);
        fgxeVar.f(this.b);
        fgxeVar.g(this.c.length);
        fgxeVar.a(this.c);
        fgxeVar.g(this.d.length);
        fgxeVar.a(this.d);
    }
}
