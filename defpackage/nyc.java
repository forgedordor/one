package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nyc {
    private final List a;

    public nyc(List list) {
        this.a = list;
    }

    private final List c(nzp nzpVar) {
        String str;
        int i;
        List listSingletonList;
        mfr mfrVar = new mfr(nzpVar.e);
        List arrayList = this.a;
        while (mfrVar.a() > 0) {
            int iJ = mfrVar.j();
            int iJ2 = mfrVar.b + mfrVar.j();
            if (iJ == 134) {
                arrayList = new ArrayList();
                int iJ3 = mfrVar.j() & 31;
                for (int i2 = 0; i2 < iJ3; i2++) {
                    String strY = mfrVar.y(3);
                    int iJ4 = mfrVar.j();
                    boolean z = (iJ4 & 128) != 0;
                    if (z) {
                        i = iJ4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte bJ = (byte) mfrVar.j();
                    mfrVar.L(1);
                    if (z) {
                        int i3 = bJ & 64;
                        byte[] bArr = mek.a;
                        listSingletonList = Collections.singletonList(i3 != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        listSingletonList = null;
                    }
                    mat matVar = new mat();
                    matVar.c(str);
                    matVar.d = strY;
                    matVar.J = i;
                    matVar.p = listSingletonList;
                    arrayList.add(new mau(matVar));
                }
            }
            mfrVar.K(iJ2);
        }
        return arrayList;
    }

    public final nzh a(nzp nzpVar) {
        return new nzh(c(nzpVar));
    }

    public final nzu b(nzp nzpVar) {
        return new nzu(c(nzpVar));
    }

    public nyc() {
        this((byte[]) null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public nyc(byte[] bArr) {
        this(ekoe.a);
        int i = ekgb.d;
    }
}
