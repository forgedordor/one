package defpackage;

import java.io.ByteArrayOutputStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgyo extends fgzh {
    private static final fhav a = new fhav();
    private static final long serialVersionUID = -7123504635968932855L;
    private int b;
    private int c;
    private int d;
    private byte[] e;
    private byte[] k;
    private fhah l;

    @Override // defpackage.fgzh
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.b);
        stringBuffer.append(' ');
        stringBuffer.append(this.c);
        stringBuffer.append(' ');
        stringBuffer.append(this.d);
        stringBuffer.append(' ');
        byte[] bArr = this.e;
        if (bArr == null) {
            stringBuffer.append('-');
        } else {
            stringBuffer.append(fhau.a(bArr));
        }
        stringBuffer.append(' ');
        fhav fhavVar = a;
        byte[] bArr2 = this.k;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i = 0; i < (bArr2.length + 4) / 5; i++) {
            short[] sArr = new short[5];
            int i2 = 5;
            for (int i3 = 0; i3 < 5; i3++) {
                int i4 = (i * 5) + i3;
                if (i4 < bArr2.length) {
                    sArr[i3] = (short) (bArr2[i4] & 255);
                } else {
                    sArr[i3] = 0;
                    i2--;
                }
            }
            int i5 = i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? -1 : 0 : 1 : 3 : 4 : 6;
            short s = sArr[0];
            short s2 = sArr[1];
            short s3 = sArr[2];
            int i6 = ((s2 & 1) << 4) | ((s3 >> 4) & 15);
            int i7 = s3 & 15;
            short s4 = sArr[3];
            short s5 = sArr[4];
            int[] iArr = {(s >> 3) & 31, ((s & 7) << 2) | ((s2 >> 6) & 3), (s2 >> 1) & 31, i6, (i7 + i7) | (1 & (s4 >> 7)), (s4 >> 2) & 31, ((s4 & 3) << 3) | ((s5 >> 5) & 7), s5 & 31};
            for (int i8 = 0; i8 < 8 - i5; i8++) {
                byteArrayOutputStream.write(fhavVar.a.charAt(iArr[i8]));
            }
        }
        stringBuffer.append(new String(byteArrayOutputStream.toByteArray()));
        if (!this.l.b()) {
            stringBuffer.append(' ');
            stringBuffer.append(this.l.toString());
        }
        return stringBuffer.toString();
    }

    @Override // defpackage.fgzh
    public final fgzh b() {
        return new fgyo();
    }

    @Override // defpackage.fgzh
    public final void c(fgxc fgxcVar) throws fhao {
        this.b = fgxcVar.c();
        this.c = fgxcVar.c();
        this.d = fgxcVar.b();
        int iC = fgxcVar.c();
        if (iC > 0) {
            this.e = fgxcVar.i(iC);
        } else {
            this.e = null;
        }
        this.k = fgxcVar.i(fgxcVar.c());
        this.l = new fhah(fgxcVar);
    }

    @Override // defpackage.fgzh
    public final void d(fgxe fgxeVar, fgww fgwwVar, boolean z) {
        fgxeVar.g(this.b);
        fgxeVar.g(this.c);
        fgxeVar.d(this.d);
        byte[] bArr = this.e;
        if (bArr != null) {
            fgxeVar.g(bArr.length);
            fgxeVar.a(this.e);
        } else {
            fgxeVar.g(0);
        }
        fgxeVar.g(this.k.length);
        fgxeVar.a(this.k);
        this.l.a(fgxeVar);
    }
}
