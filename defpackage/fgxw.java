package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
abstract class fgxw extends fgzh {
    private static final long serialVersionUID = 3469321722693285454L;
    protected int a;
    protected int b;
    protected int c;
    protected byte[] d;
    protected int e = -1;

    protected fgxw() {
    }

    @Override // defpackage.fgzh
    public final String a() {
        int i;
        int length;
        int i2;
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
                stringBuffer.append(" ; key_tag = ");
                int i3 = this.e;
                if (i3 < 0) {
                    fgxe fgxeVar = new fgxe();
                    int i4 = 0;
                    d(fgxeVar, null, false);
                    byte[] bArrH = fgxeVar.h();
                    if (this.c == 1) {
                        int length2 = bArrH.length;
                        int i5 = bArrH[length2 - 3] & 255;
                        i2 = bArrH[length2 - 2] & 255;
                        i = i5 << 8;
                    } else {
                        i = 0;
                        while (true) {
                            length = bArrH.length;
                            if (i4 >= length - 1) {
                                break;
                            }
                            i += ((bArrH[i4] & 255) << 8) + (bArrH[i4 + 1] & 255);
                            i4 += 2;
                        }
                        if (i4 < length) {
                            i += (bArrH[i4] & 255) << 8;
                        }
                        i2 = (char) (i >> 16);
                    }
                    i3 = (char) (i + i2);
                    this.e = i3;
                }
                stringBuffer.append(i3);
            } else {
                stringBuffer.append(" ");
                stringBuffer.append(fhaw.a(this.d));
            }
        }
        return stringBuffer.toString();
    }

    @Override // defpackage.fgzh
    public final void c(fgxc fgxcVar) {
        this.a = fgxcVar.b();
        this.b = fgxcVar.c();
        this.c = fgxcVar.c();
        if (fgxcVar.d() > 0) {
            this.d = fgxcVar.h();
        }
    }

    @Override // defpackage.fgzh
    public final void d(fgxe fgxeVar, fgww fgwwVar, boolean z) {
        fgxeVar.d(this.a);
        fgxeVar.g(this.b);
        fgxeVar.g(this.c);
        byte[] bArr = this.d;
        if (bArr != null) {
            fgxeVar.a(bArr);
        }
    }
}
