package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class azui extends dqqf implements aztp {
    @Deprecated
    public azui(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, azup azupVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, azut.a, dqwjVar, dqtmVar, azupVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new azrz();
    }

    public final int c() {
        return getInt(cO(13, azut.a));
    }

    public final int e() {
        return getInt(cO(14, azut.a));
    }

    public final int f() {
        return getInt(cO(15, azut.a));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        axcm[] axcmVarArr;
        int i;
        boolean[] zArrE;
        boolean[] zArrE2;
        int[] iArrA;
        long[] jArr;
        boolean[] zArrE3;
        boolean[] zArr;
        int[] iArrA2;
        int[] iArr;
        boolean[] zArr2;
        String[] strArr;
        String[] strArr2;
        int[] iArrA3;
        int[] iArr2;
        int[] iArrA4;
        int[] iArr3;
        int[] iArr4;
        String[] strArr3;
        String[] strArr4;
        boolean[] zArr3;
        long[] jArr2;
        cpyi[] cpyiVarArr;
        cpyi[] cpyiVarArr2;
        cpyi[] cpyiVarArr3;
        dqwl dqwlVar = dqthVar.a;
        long[] jArrDC = dC(getString(dqthVar.h + 1));
        int length = jArrDC.length;
        if (length == 0 || (length == 1 && jArrDC[0] == -1)) {
            int i2 = ekgb.d;
            return ekoe.a;
        }
        HashSet hashSet = new HashSet();
        dqtm dqtmVar = this.d;
        boolean zDj = dj(0);
        boolean z = dqtmVar.b;
        long[] jArrC = zDj ? z ? dqru.C(null, dt(getString(cO(0, azut.a)))) : new long[]{i()} : null;
        dqqf.dz(length, jArrC, new ejxr() { // from class: aztq
            @Override // defpackage.ejxr
            public final Object get() {
                return "_id:".concat(String.valueOf(this.a.getString(0)));
            }
        });
        if (!dj(1)) {
            axcmVarArr = null;
        } else if (z) {
            String[] strArrDu = du(getString(cO(1, azut.a)));
            int length2 = strArrDu.length;
            axcm[] axcmVarArr2 = new axcm[length2];
            for (int i3 = 0; i3 < length2; i3++) {
                axcmVarArr2[i3] = axcn.a(strArrDu[i3]);
            }
            axcmVarArr = (axcm[]) dqru.D(null, axcmVarArr2, new axcm[0]);
        } else {
            axcmVarArr = new axcm[]{j()};
        }
        dqqf.dA(length, axcmVarArr, new ejxr() { // from class: azuh
            @Override // defpackage.ejxr
            public final Object get() {
                return "my_identity_token_foreign_key:".concat(String.valueOf(this.a.getString(1)));
            }
        });
        String[] strArr5 = dj(2) ? z ? (String[]) dqru.D(null, du(getString(cO(2, azut.a))), new String[0]) : new String[]{q()} : null;
        dqqf.dA(length, strArr5, new ejxr() { // from class: aztr
            @Override // defpackage.ejxr
            public final Object get() {
                return "normalized_destination:".concat(String.valueOf(this.a.getString(2)));
            }
        });
        String[] strArr6 = dj(3) ? z ? (String[]) dqru.D(null, du(getString(cO(3, azut.a))), new String[0]) : new String[]{r()} : null;
        dqqf.dA(length, strArr6, new ejxr() { // from class: azts
            @Override // defpackage.ejxr
            public final Object get() {
                return "send_destination:".concat(String.valueOf(this.a.getString(3)));
            }
        });
        String[] strArr7 = dj(4) ? z ? (String[]) dqru.D(null, du(getString(cO(4, azut.a))), new String[0]) : new String[]{n()} : null;
        dqqf.dA(length, strArr7, new ejxr() { // from class: aztt
            @Override // defpackage.ejxr
            public final Object get() {
                return "display_destination:".concat(String.valueOf(this.a.getString(4)));
            }
        });
        String[] strArr8 = dj(5) ? z ? (String[]) dqru.D(null, du(getString(cO(5, azut.a))), new String[0]) : new String[]{o()} : null;
        dqqf.dA(length, strArr8, new ejxr() { // from class: aztu
            @Override // defpackage.ejxr
            public final Object get() {
                return "first_name:".concat(String.valueOf(this.a.getString(5)));
            }
        });
        String[] strArr9 = dj(6) ? z ? (String[]) dqru.D(null, du(getString(cO(6, azut.a))), new String[0]) : new String[]{p()} : null;
        dqqf.dA(length, strArr9, new ejxr() { // from class: aztv
            @Override // defpackage.ejxr
            public final Object get() {
                return "full_name:".concat(String.valueOf(this.a.getString(6)));
            }
        });
        if (!dj(7)) {
            i = 0;
            zArrE = null;
        } else if (z) {
            i = 0;
            zArrE = dqru.E(null, dv(getString(cO(7, azut.a))));
        } else {
            i = 0;
            zArrE = new boolean[]{t()};
        }
        dqqf.dB(length, zArrE, new ejxr() { // from class: aztw
            @Override // defpackage.ejxr
            public final Object get() {
                return "is_self:".concat(String.valueOf(this.a.getString(7)));
            }
        });
        if (!dj(8)) {
            zArrE2 = null;
        } else if (z) {
            zArrE2 = dqru.E(null, dv(getString(cO(8, azut.a))));
        } else {
            boolean[] zArr4 = new boolean[1];
            zArr4[i] = s();
            zArrE2 = zArr4;
        }
        dqqf.dB(length, zArrE2, new ejxr() { // from class: aztx
            @Override // defpackage.ejxr
            public final Object get() {
                return "blocked:".concat(String.valueOf(this.a.getString(8)));
            }
        });
        if (!dj(9)) {
            iArrA = null;
        } else if (z) {
            iArrA = dqru.A(null, ds(getString(cO(9, azut.a))));
        } else {
            iArrA = new int[1];
            iArrA[i] = h();
        }
        dqqf.dy(length, iArrA, new ejxr() { // from class: azty
            @Override // defpackage.ejxr
            public final Object get() {
                return "participant_type:".concat(String.valueOf(this.a.getString(9)));
            }
        });
        if (!dj(10)) {
            jArr = jArrDC;
            zArrE3 = null;
        } else if (z) {
            jArr = jArrDC;
            zArrE3 = dqru.E(null, dv(getString(cO(10, azut.a))));
        } else {
            jArr = jArrDC;
            zArrE3 = new boolean[1];
            zArrE3[i] = u();
        }
        dqqf.dB(length, zArrE3, new ejxr() { // from class: aztz
            @Override // defpackage.ejxr
            public final Object get() {
                return "is_spam:".concat(String.valueOf(this.a.getString(10)));
            }
        });
        if (!dj(11)) {
            zArr = zArrE3;
            iArrA2 = null;
        } else if (z) {
            zArr = zArrE3;
            iArrA2 = dqru.A(null, ds(getString(cO(11, azut.a))));
        } else {
            zArr = zArrE3;
            iArrA2 = new int[1];
            iArrA2[i] = g();
        }
        dqqf.dy(length, iArrA2, new ejxr() { // from class: azua
            @Override // defpackage.ejxr
            public final Object get() {
                return "is_spam_source:".concat(String.valueOf(this.a.getString(11)));
            }
        });
        if (!dj(12)) {
            iArr = iArrA2;
            zArr2 = zArrE2;
            strArr = null;
        } else if (z) {
            iArr = iArrA2;
            zArr2 = zArrE2;
            strArr = (String[]) dqru.D(null, du(getString(cO(12, azut.a))), new String[i]);
        } else {
            iArr = iArrA2;
            zArr2 = zArrE2;
            strArr = new String[1];
            strArr[i] = m();
        }
        dqqf.dA(length, strArr, new ejxr() { // from class: azub
            @Override // defpackage.ejxr
            public final Object get() {
                return "country_code:".concat(String.valueOf(this.a.getString(12)));
            }
        });
        int[] iArrA5 = dj(13) ? z ? dqru.A(null, ds(getString(cO(13, azut.a)))) : new int[]{c()} : null;
        dqqf.dy(length, iArrA5, new ejxr() { // from class: azuc
            @Override // defpackage.ejxr
            public final Object get() {
                return "color_palette_index:".concat(String.valueOf(this.a.getString(13)));
            }
        });
        if (!dj(14)) {
            strArr2 = strArr;
            iArrA3 = null;
        } else if (z) {
            strArr2 = strArr;
            iArrA3 = dqru.A(null, ds(getString(cO(14, azut.a))));
        } else {
            strArr2 = strArr;
            iArrA3 = new int[]{e()};
        }
        dqqf.dy(length, iArrA3, new ejxr() { // from class: azud
            @Override // defpackage.ejxr
            public final Object get() {
                return "color_type:".concat(String.valueOf(this.a.getString(14)));
            }
        });
        if (!dj(15)) {
            iArr2 = iArrA3;
            iArrA4 = null;
        } else if (z) {
            iArr2 = iArrA3;
            iArrA4 = dqru.A(null, ds(getString(cO(15, azut.a))));
        } else {
            iArr2 = iArrA3;
            iArrA4 = new int[]{f()};
        }
        dqqf.dy(length, iArrA4, new ejxr() { // from class: azue
            @Override // defpackage.ejxr
            public final Object get() {
                return "extended_color:".concat(String.valueOf(this.a.getString(15)));
            }
        });
        if (!dj(16)) {
            iArr3 = iArrA4;
            iArr4 = iArrA5;
            strArr3 = null;
        } else if (z) {
            iArr3 = iArrA4;
            iArr4 = iArrA5;
            strArr3 = (String[]) dqru.D(null, du(getString(cO(16, azut.a))), new String[0]);
        } else {
            iArr3 = iArrA4;
            iArr4 = iArrA5;
            strArr3 = new String[]{l()};
        }
        dqqf.dA(length, strArr3, new ejxr() { // from class: azuf
            @Override // defpackage.ejxr
            public final Object get() {
                return "cms_id:".concat(String.valueOf(this.a.getString(16)));
            }
        });
        if (dj(17)) {
            if (z) {
                int[] iArrDs = ds(getString(cO(17, azut.a)));
                cpyi[] cpyiVarArrValues = cpyi.values();
                int length3 = cpyiVarArrValues.length;
                strArr4 = strArr3;
                cpyi[] cpyiVarArr4 = new cpyi[iArrDs.length];
                zArr3 = zArrE;
                jArr2 = jArrC;
                for (int i4 = 0; i4 < iArrDs.length; i4++) {
                    int i5 = iArrDs[i4];
                    if (i5 >= length3) {
                        throw new IllegalStateException();
                    }
                    cpyiVarArr4[i4] = cpyiVarArrValues[i5];
                }
                cpyiVarArr3 = (cpyi[]) dqru.D(null, cpyiVarArr4, new cpyi[0]);
            } else {
                strArr4 = strArr3;
                zArr3 = zArrE;
                jArr2 = jArrC;
                cpyiVarArr3 = new cpyi[]{k()};
            }
            cpyiVarArr = cpyiVarArr3;
        } else {
            strArr4 = strArr3;
            zArr3 = zArrE;
            jArr2 = jArrC;
            cpyiVarArr = null;
        }
        dqqf.dA(length, cpyiVarArr, new ejxr() { // from class: azug
            @Override // defpackage.ejxr
            public final Object get() {
                return "cms_life_cycle:".concat(String.valueOf(this.a.getString(17)));
            }
        });
        ekfw ekfwVar = new ekfw();
        int i6 = 0;
        while (i6 < length) {
            long j = jArr[i6];
            if (j <= 0 || hashSet.contains(Long.valueOf(j))) {
                cpyiVarArr2 = cpyiVarArr;
            } else {
                hashSet.add(Long.valueOf(jArr[i6]));
                String[] strArr10 = azut.a;
                azsb azsbVar = new azsb();
                azsbVar.aF();
                azsbVar.aD();
                long j2 = jArr[i6];
                if (jArr2 != null) {
                    long j3 = jArr2[i6];
                    azsbVar.aE(0);
                    azsbVar.a = j3;
                }
                if (axcmVarArr != null) {
                    axcm axcmVar = axcmVarArr[i6];
                    int i7 = azsbVar.aB;
                    if (i7 < 110) {
                        dqru.x("my_identity_token_foreign_key", i7);
                    }
                    azsbVar.aE(1);
                    azsbVar.b = axcmVar;
                }
                if (strArr5 != null) {
                    String str = strArr5[i6];
                    azsbVar.aE(2);
                    azsbVar.c = str;
                }
                if (strArr6 != null) {
                    String str2 = strArr6[i6];
                    azsbVar.aE(3);
                    azsbVar.d = str2;
                }
                if (strArr7 != null) {
                    String str3 = strArr7[i6];
                    azsbVar.aE(4);
                    azsbVar.e = str3;
                }
                if (strArr8 != null) {
                    String str4 = strArr8[i6];
                    azsbVar.aE(5);
                    azsbVar.f = str4;
                }
                if (strArr9 != null) {
                    String str5 = strArr9[i6];
                    azsbVar.aE(6);
                    azsbVar.g = str5;
                }
                if (zArr3 != null) {
                    boolean z2 = zArr3[i6];
                    azsbVar.aE(7);
                    azsbVar.h = z2;
                }
                if (zArr2 != null) {
                    boolean z3 = zArr2[i6];
                    azsbVar.aE(8);
                    azsbVar.i = z3;
                }
                if (iArrA != null) {
                    int i8 = iArrA[i6];
                    azsbVar.aE(9);
                    azsbVar.j = i8;
                }
                if (zArr != null) {
                    boolean z4 = zArr[i6];
                    azsbVar.aE(10);
                    azsbVar.k = z4;
                }
                if (iArr != null) {
                    int i9 = iArr[i6];
                    azsbVar.aE(11);
                    azsbVar.l = i9;
                }
                if (strArr2 != null) {
                    String str6 = strArr2[i6];
                    azsbVar.aE(12);
                    azsbVar.m = str6;
                }
                if (iArr4 != null) {
                    int i10 = iArr4[i6];
                    azsbVar.aE(13);
                    azsbVar.n = i10;
                }
                if (iArr2 != null) {
                    int i11 = iArr2[i6];
                    azsbVar.aE(14);
                    azsbVar.o = i11;
                }
                if (iArr3 != null) {
                    int i12 = iArr3[i6];
                    azsbVar.aE(15);
                    azsbVar.p = i12;
                }
                if (strArr4 != null) {
                    String str7 = strArr4[i6];
                    azsbVar.aE(16);
                    azsbVar.q = str7;
                }
                if (cpyiVarArr != null) {
                    cpyi cpyiVar = cpyiVarArr[i6];
                    azsbVar.aE(17);
                    azsbVar.r = cpyiVar;
                }
                azrz azrzVar = new azrz();
                azrzVar.aD(azsbVar.aB());
                cpyiVarArr2 = cpyiVarArr;
                azrzVar.a = azsbVar.a;
                azrzVar.b = azsbVar.b;
                azrzVar.c = azsbVar.c;
                azrzVar.d = azsbVar.d;
                azrzVar.e = azsbVar.e;
                azrzVar.f = azsbVar.f;
                azrzVar.g = azsbVar.g;
                azrzVar.h = azsbVar.h;
                azrzVar.i = azsbVar.i;
                azrzVar.j = azsbVar.j;
                azrzVar.k = azsbVar.k;
                azrzVar.l = azsbVar.l;
                azrzVar.m = azsbVar.m;
                azrzVar.n = azsbVar.n;
                azrzVar.o = azsbVar.o;
                azrzVar.p = azsbVar.p;
                azrzVar.q = azsbVar.q;
                azrzVar.r = azsbVar.r;
                azrzVar.cM = azsbVar.aC();
                ekfwVar.h(azrzVar);
            }
            i6++;
            cpyiVarArr = cpyiVarArr2;
        }
        return ekfwVar.g();
    }

    public final int g() {
        return getInt(cO(11, azut.a));
    }

    public final int h() {
        return getInt(cO(9, azut.a));
    }

    public final long i() {
        return getLong(cO(0, azut.a));
    }

    public final axcm j() {
        return axcn.a(getString(cO(1, azut.a)));
    }

    public final cpyi k() {
        cpyi[] cpyiVarArrValues = cpyi.values();
        int i = getInt(cO(17, azut.a));
        if (i < cpyiVarArrValues.length) {
            return cpyiVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    public final String l() {
        return getString(cO(16, azut.a));
    }

    public final String m() {
        return getString(cO(12, azut.a));
    }

    public final String n() {
        return getString(cO(4, azut.a));
    }

    public final String o() {
        return getString(cO(5, azut.a));
    }

    public final String p() {
        return getString(cO(6, azut.a));
    }

    public final String q() {
        return getString(cO(2, azut.a));
    }

    public final String r() {
        return getString(cO(3, azut.a));
    }

    public final boolean s() {
        return getInt(cO(8, azut.a)) == 1;
    }

    public final boolean t() {
        return getInt(cO(7, azut.a)) == 1;
    }

    public final boolean u() {
        return getInt(cO(10, azut.a)) == 1;
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
