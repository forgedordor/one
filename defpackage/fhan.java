package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhan extends fgzh {
    private static final long serialVersionUID = -9104259763909119805L;
    private byte[] a;
    private int b;
    private int[] c;

    @Override // defpackage.fgzh
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(fgwj.c(this.a));
        stringBuffer.append(" ");
        stringBuffer.append(this.b);
        for (int i = 0; i < this.c.length; i++) {
            StringBuffer stringBuffer2 = new StringBuffer(" ");
            stringBuffer2.append(this.c[i]);
            stringBuffer.append(stringBuffer2.toString());
        }
        return stringBuffer.toString();
    }

    @Override // defpackage.fgzh
    public final fgzh b() {
        return new fhan();
    }

    @Override // defpackage.fgzh
    public final void c(fgxc fgxcVar) {
        this.a = fgxcVar.i(4);
        this.b = fgxcVar.c();
        byte[] bArrH = fgxcVar.h();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < bArrH.length; i++) {
            for (int i2 = 0; i2 < 8; i2++) {
                if ((bArrH[i] & 255 & (1 << (7 - i2))) != 0) {
                    arrayList.add(new Integer((i * 8) + i2));
                }
            }
        }
        this.c = new int[arrayList.size()];
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            this.c[i3] = ((Integer) arrayList.get(i3)).intValue();
        }
    }

    @Override // defpackage.fgzh
    public final void d(fgxe fgxeVar, fgww fgwwVar, boolean z) {
        fgxeVar.a(this.a);
        fgxeVar.g(this.b);
        byte[] bArr = new byte[(this.c[r6.length - 1] / 8) + 1];
        int i = 0;
        while (true) {
            int[] iArr = this.c;
            if (i >= iArr.length) {
                fgxeVar.a(bArr);
                return;
            }
            int i2 = iArr[i];
            int i3 = i2 / 8;
            bArr[i3] = (byte) ((1 << (7 - (i2 % 8))) | bArr[i3]);
            i++;
        }
    }
}
