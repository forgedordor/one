package defpackage;

import java.util.Date;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhaa extends fgzh {
    private static final long serialVersionUID = -88820909016649306L;
    private fgyu a;
    private Date b;
    private int c;
    private byte[] d;
    private int e;
    private int k;
    private byte[] l;

    @Override // defpackage.fgzh
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.a);
        stringBuffer.append(" ");
        if (fgyz.a("multiline")) {
            stringBuffer.append("(\n\t");
        }
        stringBuffer.append(this.b.getTime() / 1000);
        stringBuffer.append(" ");
        stringBuffer.append(this.c);
        stringBuffer.append(" ");
        stringBuffer.append(this.d.length);
        if (fgyz.a("multiline")) {
            stringBuffer.append("\n");
            stringBuffer.append(fhaw.b(this.d, false));
        } else {
            stringBuffer.append(" ");
            stringBuffer.append(fhaw.a(this.d));
        }
        stringBuffer.append(" ");
        stringBuffer.append(fgzg.a(this.k));
        stringBuffer.append(" ");
        byte[] bArr = this.l;
        if (bArr == null) {
            stringBuffer.append(0);
        } else {
            stringBuffer.append(bArr.length);
            if (fgyz.a("multiline")) {
                stringBuffer.append("\n\n\n\t");
            } else {
                stringBuffer.append(" ");
            }
            if (this.k == 18) {
                byte[] bArr2 = this.l;
                if (bArr2.length != 6) {
                    stringBuffer.append("<invalid BADTIME other data>");
                } else {
                    int i = bArr2[0] & 255;
                    int i2 = bArr2[1] & 255;
                    int i3 = bArr2[2] & 255;
                    int i4 = bArr2[3] & 255;
                    int i5 = bArr2[4] & 255;
                    int i6 = bArr2[5] & 255;
                    stringBuffer.append("<server time: ");
                    stringBuffer.append(new Date(((i << 40) + (i2 << 32) + (i3 << 24) + (i4 << 16) + (i5 << 8) + i6) * 1000));
                    stringBuffer.append(">");
                }
            } else {
                stringBuffer.append("<");
                stringBuffer.append(fhaw.a(this.l));
                stringBuffer.append(">");
            }
        }
        if (fgyz.a("multiline")) {
            stringBuffer.append(" )");
        }
        return stringBuffer.toString();
    }

    @Override // defpackage.fgzh
    public final fgzh b() {
        return new fhaa();
    }

    @Override // defpackage.fgzh
    public final void c(fgxc fgxcVar) throws fhao {
        this.a = new fgyu(fgxcVar);
        this.b = new Date(((fgxcVar.b() << 32) + fgxcVar.e()) * 1000);
        this.c = fgxcVar.b();
        this.d = fgxcVar.i(fgxcVar.b());
        this.e = fgxcVar.b();
        this.k = fgxcVar.b();
        int iB = fgxcVar.b();
        if (iB > 0) {
            this.l = fgxcVar.i(iB);
        } else {
            this.l = null;
        }
    }

    @Override // defpackage.fgzh
    public final void d(fgxe fgxeVar, fgww fgwwVar, boolean z) {
        this.a.h(fgxeVar, null, z);
        long time = this.b.getTime() / 1000;
        fgxeVar.d((int) (time >> 32));
        fgxeVar.f(time & 4294967295L);
        fgxeVar.d(this.c);
        fgxeVar.d(this.d.length);
        fgxeVar.a(this.d);
        fgxeVar.d(this.e);
        fgxeVar.d(this.k);
        byte[] bArr = this.l;
        if (bArr == null) {
            fgxeVar.d(0);
        } else {
            fgxeVar.d(bArr.length);
            fgxeVar.a(this.l);
        }
    }
}
