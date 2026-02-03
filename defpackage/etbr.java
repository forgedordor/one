package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class etbr extends esyv {
    @Override // defpackage.esyv
    public final /* bridge */ /* synthetic */ Object a(etdb etdbVar) throws IOException, NumberFormatException {
        long j;
        if (etdbVar.t() == 9) {
            etdbVar.p();
            return null;
        }
        try {
            int iB = etdbVar.c;
            if (iB == 0) {
                iB = etdbVar.b();
            }
            if (iB == 15) {
                etdbVar.c = 0;
                int[] iArr = etdbVar.h;
                int i = etdbVar.g - 1;
                iArr[i] = iArr[i] + 1;
                j = etdbVar.d;
            } else {
                if (iB == 16) {
                    char[] cArr = etdbVar.a;
                    int i2 = etdbVar.b;
                    int i3 = etdbVar.e;
                    etdbVar.f = new String(cArr, i2, i3);
                    etdbVar.b = i2 + i3;
                } else {
                    if (iB != 8 && iB != 9 && iB != 10) {
                        throw etdbVar.d("a long");
                    }
                    if (iB == 10) {
                        etdbVar.f = etdbVar.k();
                    } else {
                        etdbVar.f = etdbVar.i(iB == 8 ? '\'' : '\"');
                    }
                    try {
                        long j2 = Long.parseLong(etdbVar.f);
                        etdbVar.c = 0;
                        int[] iArr2 = etdbVar.h;
                        int i4 = etdbVar.g - 1;
                        iArr2[i4] = iArr2[i4] + 1;
                        j = j2;
                    } catch (NumberFormatException unused) {
                    }
                }
                etdbVar.c = 11;
                double d = Double.parseDouble(etdbVar.f);
                long j3 = (long) d;
                if (j3 != d) {
                    throw new NumberFormatException("Expected a long but was " + etdbVar.f + etdbVar.g());
                }
                etdbVar.f = null;
                etdbVar.c = 0;
                int[] iArr3 = etdbVar.h;
                int i5 = etdbVar.g - 1;
                iArr3[i5] = iArr3[i5] + 1;
                j = j3;
            }
            return Long.valueOf(j);
        } catch (NumberFormatException e) {
            throw new esyr(e);
        }
    }

    @Override // defpackage.esyv
    public final /* bridge */ /* synthetic */ void b(etdd etddVar, Object obj) throws IOException {
        Number number = (Number) obj;
        if (number == null) {
            etddVar.j();
        } else {
            etddVar.k(number.longValue());
        }
    }
}
