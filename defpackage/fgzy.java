package defpackage;

import java.util.Date;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgzy extends fgzh {
    private static final long serialVersionUID = 8828458121926391756L;
    private fgyu a;
    private Date b;
    private Date c;
    private int d;
    private int e;
    private byte[] k;
    private byte[] l;

    @Override // defpackage.fgzh
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.a);
        stringBuffer.append(" ");
        if (fgyz.a("multiline")) {
            stringBuffer.append("(\n\t");
        }
        stringBuffer.append(fgxm.a(this.b));
        stringBuffer.append(" ");
        stringBuffer.append(fgxm.a(this.c));
        stringBuffer.append(" ");
        int i = this.d;
        stringBuffer.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? Integer.toString(i) : "DELETE" : "RESOLVERASSIGNED" : "GSSAPI" : "DIFFIEHELLMAN" : "SERVERASSIGNED");
        stringBuffer.append(" ");
        stringBuffer.append(fgzg.a(this.e));
        if (fgyz.a("multiline")) {
            stringBuffer.append("\n");
            byte[] bArr = this.k;
            if (bArr != null) {
                stringBuffer.append(fhaw.b(bArr, false));
                stringBuffer.append("\n");
            }
            byte[] bArr2 = this.l;
            if (bArr2 != null) {
                stringBuffer.append(fhaw.b(bArr2, false));
            }
            stringBuffer.append(" )");
        } else {
            stringBuffer.append(" ");
            byte[] bArr3 = this.k;
            if (bArr3 != null) {
                stringBuffer.append(fhaw.a(bArr3));
                stringBuffer.append(" ");
            }
            byte[] bArr4 = this.l;
            if (bArr4 != null) {
                stringBuffer.append(fhaw.a(bArr4));
            }
        }
        return stringBuffer.toString();
    }

    @Override // defpackage.fgzh
    public final fgzh b() {
        return new fgzy();
    }

    @Override // defpackage.fgzh
    public final void c(fgxc fgxcVar) throws fhao {
        this.a = new fgyu(fgxcVar);
        this.b = new Date(fgxcVar.e() * 1000);
        this.c = new Date(fgxcVar.e() * 1000);
        this.d = fgxcVar.b();
        this.e = fgxcVar.b();
        int iB = fgxcVar.b();
        if (iB > 0) {
            this.k = fgxcVar.i(iB);
        } else {
            this.k = null;
        }
        int iB2 = fgxcVar.b();
        if (iB2 > 0) {
            this.l = fgxcVar.i(iB2);
        } else {
            this.l = null;
        }
    }

    @Override // defpackage.fgzh
    public final void d(fgxe fgxeVar, fgww fgwwVar, boolean z) {
        this.a.h(fgxeVar, null, z);
        fgxeVar.f(this.b.getTime() / 1000);
        fgxeVar.f(this.c.getTime() / 1000);
        fgxeVar.d(this.d);
        fgxeVar.d(this.e);
        byte[] bArr = this.k;
        if (bArr != null) {
            fgxeVar.d(bArr.length);
            fgxeVar.a(this.k);
        } else {
            fgxeVar.d(0);
        }
        byte[] bArr2 = this.l;
        if (bArr2 == null) {
            fgxeVar.d(0);
        } else {
            fgxeVar.d(bArr2.length);
            fgxeVar.a(this.l);
        }
    }
}
