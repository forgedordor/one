package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bugt extends dqqf implements bugi {
    @Deprecated
    public bugt(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, bugw bugwVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, bugy.a, dqwjVar, dqtmVar, bugwVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new bufj();
    }

    public final int c() {
        return getInt(cO(8, bugy.a));
    }

    public final int e() {
        return getInt(cO(3, bugy.a));
    }

    public final int f() {
        return getInt(cO(2, bugy.a));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        int i;
        long[] jArrC;
        int[] iArrA;
        long[] jArr;
        int[] iArr;
        int i2;
        long[] jArr2;
        HashSet hashSet;
        dqwl dqwlVar = dqthVar.a;
        long[] jArrDC = dC(getString(dqthVar.h + 1));
        int length = jArrDC.length;
        if (length == 0 || (length == 1 && jArrDC[0] == -1)) {
            int i3 = ekgb.d;
            return ekoe.a;
        }
        HashSet hashSet2 = new HashSet();
        dqtm dqtmVar = this.d;
        boolean zDj = dj(0);
        boolean z = dqtmVar.b;
        String[] strArr = null;
        long[] jArrC2 = zDj ? z ? dqru.C(null, dt(getString(cO(0, bugy.a)))) : new long[]{g()} : null;
        dqqf.dz(length, jArrC2, new ejxr() { // from class: bugj
            @Override // defpackage.ejxr
            public final Object get() {
                return "_id:".concat(String.valueOf(this.a.getString(0)));
            }
        });
        String[] strArr2 = dj(1) ? z ? (String[]) dqru.D(null, du(getString(cO(1, bugy.a))), new String[0]) : new String[]{m()} : null;
        dqqf.dA(length, strArr2, new ejxr() { // from class: bugk
            @Override // defpackage.ejxr
            public final Object get() {
                return "sticker_set_id:".concat(String.valueOf(this.a.getString(1)));
            }
        });
        int[] iArrA2 = dj(2) ? z ? dqru.A(null, ds(getString(cO(2, bugy.a)))) : new int[]{f()} : null;
        dqqf.dy(length, iArrA2, new ejxr() { // from class: bugl
            @Override // defpackage.ejxr
            public final Object get() {
                return "local_version:".concat(String.valueOf(this.a.getString(2)));
            }
        });
        int[] iArrA3 = dj(3) ? z ? dqru.A(null, ds(getString(cO(3, bugy.a)))) : new int[]{e()} : null;
        dqqf.dy(length, iArrA3, new ejxr() { // from class: bugm
            @Override // defpackage.ejxr
            public final Object get() {
                return "download_state:".concat(String.valueOf(this.a.getString(3)));
            }
        });
        String[] strArr3 = dj(4) ? z ? (String[]) dqru.D(null, du(getString(cO(4, bugy.a))), new String[0]) : new String[]{k()} : null;
        dqqf.dA(length, strArr3, new ejxr() { // from class: bugn
            @Override // defpackage.ejxr
            public final Object get() {
                return "icon_uri:".concat(String.valueOf(this.a.getString(4)));
            }
        });
        String[] strArr4 = dj(5) ? z ? (String[]) dqru.D(null, du(getString(cO(5, bugy.a))), new String[0]) : new String[]{j()} : null;
        dqqf.dA(length, strArr4, new ejxr() { // from class: bugo
            @Override // defpackage.ejxr
            public final Object get() {
                return "display_name:".concat(String.valueOf(this.a.getString(5)));
            }
        });
        String[] strArr5 = dj(6) ? z ? (String[]) dqru.D(null, du(getString(cO(6, bugy.a))), new String[0]) : new String[]{l()} : null;
        dqqf.dA(length, strArr5, new ejxr() { // from class: bugp
            @Override // defpackage.ejxr
            public final Object get() {
                return "preview_image_uri:".concat(String.valueOf(this.a.getString(6)));
            }
        });
        if (!dj(7)) {
            i = 0;
            jArrC = null;
        } else if (z) {
            i = 0;
            jArrC = dqru.C(null, dt(getString(cO(7, bugy.a))));
        } else {
            i = 0;
            jArrC = new long[]{h()};
        }
        dqqf.dz(length, jArrC, new ejxr() { // from class: bugq
            @Override // defpackage.ejxr
            public final Object get() {
                return "requested_timestamp:".concat(String.valueOf(this.a.getString(7)));
            }
        });
        if (!dj(8)) {
            iArrA = null;
        } else if (z) {
            iArrA = dqru.A(null, ds(getString(cO(8, bugy.a))));
        } else {
            int[] iArr2 = new int[1];
            iArr2[i] = c();
            iArrA = iArr2;
        }
        dqqf.dy(length, iArrA, new ejxr() { // from class: bugr
            @Override // defpackage.ejxr
            public final Object get() {
                return "display_order:".concat(String.valueOf(this.a.getString(8)));
            }
        });
        if (!dj(9)) {
            jArr = jArrDC;
        } else if (z) {
            jArr = jArrDC;
            strArr = (String[]) dqru.D(null, du(getString(cO(9, bugy.a))), new String[i]);
        } else {
            jArr = jArrDC;
            strArr = new String[1];
            strArr[i] = i();
        }
        dqqf.dA(length, strArr, new ejxr() { // from class: bugs
            @Override // defpackage.ejxr
            public final Object get() {
                return "author:".concat(String.valueOf(this.a.getString(9)));
            }
        });
        ekfw ekfwVar = new ekfw();
        int i4 = 0;
        while (i4 < length) {
            long j = jArr[i4];
            if (j <= 0 || hashSet2.contains(Long.valueOf(j))) {
                iArr = iArrA;
                i2 = length;
                jArr2 = jArrC;
                hashSet = hashSet2;
            } else {
                hashSet2.add(Long.valueOf(jArr[i4]));
                String[] strArr6 = bugy.a;
                bufl buflVar = new bufl();
                buflVar.aF();
                buflVar.aD();
                long j2 = jArr[i4];
                iArr = iArrA;
                i2 = length;
                if (jArrC2 != null) {
                    long j3 = jArrC2[i4];
                    buflVar.aE(0);
                    buflVar.a = j3;
                }
                if (strArr2 != null) {
                    String str = strArr2[i4];
                    buflVar.aE(1);
                    buflVar.b = str;
                }
                if (iArrA2 != null) {
                    int i5 = iArrA2[i4];
                    buflVar.aE(2);
                    buflVar.c = i5;
                }
                if (iArrA3 != null) {
                    int i6 = iArrA3[i4];
                    buflVar.aE(3);
                    buflVar.d = i6;
                }
                if (strArr3 != null) {
                    String str2 = strArr3[i4];
                    buflVar.aE(4);
                    buflVar.e = str2;
                }
                if (strArr4 != null) {
                    String str3 = strArr4[i4];
                    buflVar.aE(5);
                    buflVar.f = str3;
                }
                if (strArr5 != null) {
                    String str4 = strArr5[i4];
                    buflVar.aE(6);
                    buflVar.g = str4;
                }
                jArr2 = jArrC;
                if (jArrC != null) {
                    long j4 = jArr2[i4];
                    buflVar.aE(7);
                    buflVar.h = j4;
                }
                if (iArr != null) {
                    int i7 = iArr[i4];
                    buflVar.aE(8);
                    buflVar.i = i7;
                }
                if (strArr != null) {
                    String str5 = strArr[i4];
                    buflVar.aE(9);
                    buflVar.j = str5;
                }
                bufj bufjVar = new bufj();
                bufjVar.aD(buflVar.aB());
                hashSet = hashSet2;
                bufjVar.a = buflVar.a;
                bufjVar.b = buflVar.b;
                bufjVar.c = buflVar.c;
                bufjVar.d = buflVar.d;
                bufjVar.e = buflVar.e;
                bufjVar.f = buflVar.f;
                bufjVar.g = buflVar.g;
                bufjVar.h = buflVar.h;
                bufjVar.i = buflVar.i;
                bufjVar.j = buflVar.j;
                bufjVar.cM = buflVar.aC();
                ekfwVar.h(bufjVar);
            }
            i4++;
            hashSet2 = hashSet;
            jArrC = jArr2;
            length = i2;
            iArrA = iArr;
        }
        return ekfwVar.g();
    }

    public final long g() {
        return getLong(cO(0, bugy.a));
    }

    public final long h() {
        return getLong(cO(7, bugy.a));
    }

    public final String i() {
        return getString(cO(9, bugy.a));
    }

    public final String j() {
        return getString(cO(5, bugy.a));
    }

    public final String k() {
        return getString(cO(4, bugy.a));
    }

    public final String l() {
        return getString(cO(6, bugy.a));
    }

    public final String m() {
        return getString(cO(1, bugy.a));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
