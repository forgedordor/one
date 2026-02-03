package defpackage;

import android.database.Cursor;
import android.net.Uri;
import j$.time.Instant;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bruu extends dqqf implements brsw {
    @Deprecated
    public bruu(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, bruz bruzVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, brvd.a, dqwjVar, dqtmVar, bruzVar);
    }

    public final chpq A() {
        return chpq.b(getInt(cO(45, brvd.a)));
    }

    public final cpyi B() {
        cpyi[] cpyiVarArrValues = cpyi.values();
        int i = getInt(cO(41, brvd.a));
        if (i < cpyiVarArrValues.length) {
            return cpyiVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    public final Instant C() {
        return bart.b(getLong(cO(1, brvd.a)));
    }

    public final String D() {
        return getString(cO(30, brvd.a));
    }

    public final String E() {
        return getString(cO(33, brvd.a));
    }

    public final String F() {
        return getString(cO(11, brvd.a));
    }

    public final String G() {
        return getString(cO(27, brvd.a));
    }

    public final String H() {
        return getString(cO(12, brvd.a));
    }

    public final String I() {
        return getString(cO(10, brvd.a));
    }

    public final String J() {
        return getString(cO(40, brvd.a));
    }

    public final String K() {
        return getString(cO(16, brvd.a));
    }

    public final String L() {
        return getString(cO(15, brvd.a));
    }

    public final String M() {
        return getString(cO(0, brvd.a));
    }

    public final String N() {
        return getString(cO(20, brvd.a));
    }

    public final String O() {
        return getString(cO(8, brvd.a));
    }

    public final String P() {
        return getString(cO(3, brvd.a));
    }

    public final String Q() {
        return getString(cO(35, brvd.a));
    }

    public final String R() {
        return getString(cO(14, brvd.a));
    }

    public final String S() {
        return getString(cO(9, brvd.a));
    }

    public final String T() {
        return getString(cO(25, brvd.a));
    }

    public final boolean U() {
        return getInt(cO(24, brvd.a)) == 1;
    }

    public final boolean V() {
        return getInt(cO(38, brvd.a)) == 1;
    }

    public final boolean W() {
        return getInt(cO(48, brvd.a)) == 1;
    }

    public final boolean X() {
        return getInt(cO(31, brvd.a)) == 1;
    }

    public final boolean Y() {
        return getInt(cO(39, brvd.a)) == 1;
    }

    public final byte[] Z() {
        return getBlob(cO(36, brvd.a));
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new brow();
    }

    public final int c() {
        return getInt(cO(21, brvd.a));
    }

    public final int e() {
        return getInt(cO(22, brvd.a));
    }

    public final int f() {
        return getInt(cO(23, brvd.a));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        Instant[] instantArr;
        axcm[] axcmVarArr;
        axcm[] axcmVarArr2;
        int i;
        String[] strArr;
        long[] jArr;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        String[] strArr5;
        String[] strArr6;
        String[] strArr7;
        String[] strArr8;
        String[] strArr9;
        axcm[] axcmVarArr3;
        String[] strArr10;
        String[] strArr11;
        String[] strArr12;
        String[] strArr13;
        String[] strArr14;
        String[] strArr15;
        String[] strArr16;
        Uri[] uriArr;
        Uri[] uriArr2;
        Uri[] uriArr3;
        long[] jArr2;
        String[] strArr17;
        String[] strArr18;
        int[] iArrA;
        int[] iArr;
        int[] iArrA2;
        int[] iArr2;
        boolean[] zArrE;
        boolean[] zArr;
        int[] iArr3;
        String[] strArr19;
        String[] strArr20;
        Uri[] uriArr4;
        String[] strArr21;
        int[] iArr4;
        int[] iArrA3;
        int[] iArr5;
        String[] strArr22;
        String[] strArr23;
        boolean[] zArr2;
        int[] iArrA4;
        int[] iArr6;
        String[] strArr24;
        String[] strArr25;
        String[] strArr26;
        boolean z;
        String[] strArr27;
        bvdz[] bvdzVarArr;
        String[] strArr28;
        boolean[] zArrE2;
        boolean[] zArr3;
        boolean[] zArrE3;
        boolean[] zArr4;
        byte[][] bArr;
        String[] strArr29;
        String[] strArr30;
        bvdz[] bvdzVarArr2;
        long[] jArr3;
        cpyi[] cpyiVarArr;
        alwm[] alwmVarArr;
        bbaj[] bbajVarArr;
        bbaj[] bbajVarArr2;
        alwm[] alwmVarArr2;
        chpq[] chpqVarArr;
        chpq[] chpqVarArr2;
        chpq[] chpqVarArr3;
        chpq[] chpqVarArr4;
        chpm[] chpmVarArr;
        chpm[] chpmVarArr2;
        anuc[] anucVarArr;
        int i2;
        boolean[] zArrE4;
        boolean[] zArr5;
        anuc[] anucVarArr2;
        int i3;
        Iterator it;
        anuc anucVar;
        dqwl dqwlVar = dqthVar.a;
        long[] jArrDC = dC(getString(dqthVar.h + 1));
        int length = jArrDC.length;
        if (length == 0 || (length == 1 && jArrDC[0] == -1)) {
            int i4 = ekgb.d;
            return ekoe.a;
        }
        HashSet hashSet = new HashSet();
        dqtm dqtmVar = this.d;
        boolean zDj = dj(0);
        boolean z2 = dqtmVar.b;
        String[] strArr31 = zDj ? z2 ? (String[]) dqru.D(null, du(getString(cO(0, brvd.a))), new String[0]) : new String[]{M()} : null;
        dqqf.dA(length, strArr31, new ejxr() { // from class: brsx
            @Override // defpackage.ejxr
            public final Object get() {
                return "_id:".concat(String.valueOf(this.a.getString(0)));
            }
        });
        if (!dj(1)) {
            instantArr = null;
        } else if (z2) {
            long[] jArrDt = dt(getString(cO(1, brvd.a)));
            int length2 = jArrDt.length;
            Instant[] instantArr2 = new Instant[length2];
            for (int i5 = 0; i5 < length2; i5++) {
                instantArr2[i5] = bart.b(jArrDt[i5]);
            }
            instantArr = (Instant[]) dqru.D(null, instantArr2, new Instant[0]);
        } else {
            instantArr = new Instant[]{C()};
        }
        dqqf.dA(length, instantArr, new ejxr() { // from class: brsz
            @Override // defpackage.ejxr
            public final Object get() {
                return "operation_datetime:".concat(String.valueOf(this.a.getString(1)));
            }
        });
        long[] jArrC = dj(2) ? z2 ? dqru.C(null, dt(getString(cO(2, brvd.a)))) : new long[]{o()} : null;
        dqqf.dz(length, jArrC, new ejxr() { // from class: brtl
            @Override // defpackage.ejxr
            public final Object get() {
                return "operation_type:".concat(String.valueOf(this.a.getString(2)));
            }
        });
        String[] strArr32 = dj(3) ? z2 ? (String[]) dqru.D(null, du(getString(cO(3, brvd.a))), new String[0]) : new String[]{P()} : null;
        dqqf.dA(length, strArr32, new ejxr() { // from class: brtx
            @Override // defpackage.ejxr
            public final Object get() {
                return "participant_id:".concat(String.valueOf(this.a.getString(3)));
            }
        });
        if (!dj(4)) {
            axcmVarArr = null;
        } else if (z2) {
            String[] strArrDu = du(getString(cO(4, brvd.a)));
            int length3 = strArrDu.length;
            axcm[] axcmVarArr4 = new axcm[length3];
            for (int i6 = 0; i6 < length3; i6++) {
                axcmVarArr4[i6] = axcn.a(strArrDu[i6]);
            }
            axcmVarArr = (axcm[]) dqru.D(null, axcmVarArr4, new axcm[0]);
        } else {
            axcmVarArr = new axcm[]{u()};
        }
        dqqf.dA(length, axcmVarArr, new ejxr() { // from class: brui
            @Override // defpackage.ejxr
            public final Object get() {
                return "my_identity_token:".concat(String.valueOf(this.a.getString(4)));
            }
        });
        if (!dj(5)) {
            axcmVarArr2 = null;
        } else if (z2) {
            String[] strArrDu2 = du(getString(cO(5, brvd.a)));
            int length4 = strArrDu2.length;
            axcm[] axcmVarArr5 = new axcm[length4];
            for (int i7 = 0; i7 < length4; i7++) {
                axcmVarArr5[i7] = axcn.a(strArrDu2[i7]);
            }
            axcmVarArr2 = (axcm[]) dqru.D(null, axcmVarArr5, new axcm[0]);
        } else {
            axcmVarArr2 = new axcm[]{v()};
        }
        dqqf.dA(length, axcmVarArr2, new ejxr() { // from class: bruj
            @Override // defpackage.ejxr
            public final Object get() {
                return "my_identity_token_foreign_key:".concat(String.valueOf(this.a.getString(5)));
            }
        });
        int[] iArrA5 = dj(6) ? z2 ? dqru.A(null, ds(getString(cO(6, brvd.a)))) : new int[]{j()} : null;
        dqqf.dy(length, iArrA5, new ejxr() { // from class: bruk
            @Override // defpackage.ejxr
            public final Object get() {
                return "sub_id:".concat(String.valueOf(this.a.getString(6)));
            }
        });
        int[] iArrA6 = dj(7) ? z2 ? dqru.A(null, ds(getString(cO(7, brvd.a)))) : new int[]{i()} : null;
        dqqf.dy(length, iArrA6, new ejxr() { // from class: brul
            @Override // defpackage.ejxr
            public final Object get() {
                return "sim_slot_id:".concat(String.valueOf(this.a.getString(7)));
            }
        });
        if (!dj(8)) {
            i = 0;
            strArr = null;
        } else if (z2) {
            i = 0;
            strArr = (String[]) dqru.D(null, du(getString(cO(8, brvd.a))), new String[0]);
        } else {
            i = 0;
            strArr = new String[]{O()};
        }
        dqqf.dA(length, strArr, new ejxr() { // from class: brum
            @Override // defpackage.ejxr
            public final Object get() {
                return "normalized_destination:".concat(String.valueOf(this.a.getString(8)));
            }
        });
        if (!dj(9)) {
            jArr = jArrDC;
            strArr2 = null;
        } else if (z2) {
            jArr = jArrDC;
            strArr2 = (String[]) dqru.D(null, du(getString(cO(9, brvd.a))), new String[i]);
        } else {
            jArr = jArrDC;
            String[] strArr33 = new String[1];
            strArr33[i] = S();
            strArr2 = strArr33;
        }
        dqqf.dA(length, strArr2, new ejxr() { // from class: brun
            @Override // defpackage.ejxr
            public final Object get() {
                return "send_destination:".concat(String.valueOf(this.a.getString(9)));
            }
        });
        if (!dj(10)) {
            strArr3 = strArr2;
            strArr4 = null;
        } else if (z2) {
            strArr3 = strArr2;
            strArr4 = (String[]) dqru.D(null, du(getString(cO(10, brvd.a))), new String[0]);
        } else {
            strArr3 = strArr2;
            strArr4 = new String[]{I()};
        }
        dqqf.dA(length, strArr4, new ejxr() { // from class: brti
            @Override // defpackage.ejxr
            public final Object get() {
                return "display_destination:".concat(String.valueOf(this.a.getString(10)));
            }
        });
        if (!dj(11)) {
            strArr5 = strArr4;
            strArr6 = null;
        } else if (z2) {
            strArr5 = strArr4;
            strArr6 = (String[]) dqru.D(null, du(getString(cO(11, brvd.a))), new String[0]);
        } else {
            strArr5 = strArr4;
            strArr6 = new String[]{F()};
        }
        dqqf.dA(length, strArr6, new ejxr() { // from class: brtt
            @Override // defpackage.ejxr
            public final Object get() {
                return "comparable_destination:".concat(String.valueOf(this.a.getString(11)));
            }
        });
        if (!dj(12)) {
            strArr7 = strArr6;
            strArr8 = null;
        } else if (z2) {
            strArr7 = strArr6;
            strArr8 = (String[]) dqru.D(null, du(getString(cO(12, brvd.a))), new String[0]);
        } else {
            strArr7 = strArr6;
            strArr8 = new String[]{H()};
        }
        dqqf.dA(length, strArr8, new ejxr() { // from class: brue
            @Override // defpackage.ejxr
            public final Object get() {
                return "country_code:".concat(String.valueOf(this.a.getString(12)));
            }
        });
        long[] jArrC2 = dj(13) ? z2 ? dqru.C(null, dt(getString(cO(13, brvd.a)))) : new long[]{p()} : null;
        dqqf.dz(length, jArrC2, new ejxr() { // from class: bruo
            @Override // defpackage.ejxr
            public final Object get() {
                return "recipient_id:".concat(String.valueOf(this.a.getString(13)));
            }
        });
        if (!dj(14)) {
            strArr9 = strArr8;
            axcmVarArr3 = axcmVarArr2;
            strArr10 = null;
        } else if (z2) {
            strArr9 = strArr8;
            axcmVarArr3 = axcmVarArr2;
            strArr10 = (String[]) dqru.D(null, du(getString(cO(14, brvd.a))), new String[0]);
        } else {
            strArr9 = strArr8;
            axcmVarArr3 = axcmVarArr2;
            strArr10 = new String[]{R()};
        }
        dqqf.dA(length, strArr10, new ejxr() { // from class: brup
            @Override // defpackage.ejxr
            public final Object get() {
                return "recipient_canonical_address:".concat(String.valueOf(this.a.getString(14)));
            }
        });
        if (!dj(15)) {
            strArr11 = strArr10;
            strArr12 = null;
        } else if (z2) {
            strArr11 = strArr10;
            strArr12 = (String[]) dqru.D(null, du(getString(cO(15, brvd.a))), new String[0]);
        } else {
            strArr11 = strArr10;
            strArr12 = new String[]{L()};
        }
        dqqf.dA(length, strArr12, new ejxr() { // from class: bruq
            @Override // defpackage.ejxr
            public final Object get() {
                return "full_name:".concat(String.valueOf(this.a.getString(15)));
            }
        });
        if (!dj(16)) {
            strArr13 = strArr12;
            strArr14 = null;
        } else if (z2) {
            strArr13 = strArr12;
            strArr14 = (String[]) dqru.D(null, du(getString(cO(16, brvd.a))), new String[0]);
        } else {
            strArr13 = strArr12;
            strArr14 = new String[]{K()};
        }
        dqqf.dA(length, strArr14, new ejxr() { // from class: brur
            @Override // defpackage.ejxr
            public final Object get() {
                return "first_name:".concat(String.valueOf(this.a.getString(16)));
            }
        });
        if (!dj(17)) {
            strArr15 = strArr14;
            strArr16 = strArr;
            uriArr = null;
        } else if (z2) {
            String[] strArrDu3 = du(getString(cO(17, brvd.a)));
            int length5 = strArrDu3.length;
            strArr15 = strArr14;
            Uri[] uriArr5 = new Uri[length5];
            strArr16 = strArr;
            int i8 = 0;
            int i9 = 0;
            while (i8 < length5) {
                String str = strArrDu3[i8];
                int i10 = i9 + 1;
                uriArr5[i9] = (str == null || str.length() == 0) ? null : Uri.parse(str);
                i8++;
                i9 = i10;
            }
            uriArr = (Uri[]) dqru.D(null, uriArr5, new Uri[0]);
        } else {
            strArr15 = strArr14;
            strArr16 = strArr;
            uriArr = new Uri[]{r()};
        }
        dqqf.dA(length, uriArr, new ejxr() { // from class: brus
            @Override // defpackage.ejxr
            public final Object get() {
                return "profile_photo_uri:".concat(String.valueOf(this.a.getString(17)));
            }
        });
        if (!dj(18)) {
            uriArr2 = null;
        } else if (z2) {
            String[] strArrDu4 = du(getString(cO(18, brvd.a)));
            int length6 = strArrDu4.length;
            Uri[] uriArr6 = new Uri[length6];
            int i11 = 0;
            int i12 = 0;
            while (i11 < length6) {
                String str2 = strArrDu4[i11];
                int i13 = i12 + 1;
                uriArr6[i12] = (str2 == null || str2.length() == 0) ? null : Uri.parse(str2);
                i11++;
                i12 = i13;
            }
            uriArr2 = (Uri[]) dqru.D(null, uriArr6, new Uri[0]);
        } else {
            uriArr2 = new Uri[]{q()};
        }
        dqqf.dA(length, uriArr2, new ejxr() { // from class: brut
            @Override // defpackage.ejxr
            public final Object get() {
                return "contact_photo_uri:".concat(String.valueOf(this.a.getString(18)));
            }
        });
        long[] jArrC3 = dj(19) ? z2 ? dqru.C(null, dt(getString(cO(19, brvd.a)))) : new long[]{m()} : null;
        dqqf.dz(length, jArrC3, new ejxr() { // from class: brsy
            @Override // defpackage.ejxr
            public final Object get() {
                return "contact_id:".concat(String.valueOf(this.a.getString(19)));
            }
        });
        if (!dj(20)) {
            uriArr3 = uriArr2;
            jArr2 = jArrC3;
            strArr17 = null;
        } else if (z2) {
            uriArr3 = uriArr2;
            jArr2 = jArrC3;
            strArr17 = (String[]) dqru.D(null, du(getString(cO(20, brvd.a))), new String[0]);
        } else {
            uriArr3 = uriArr2;
            jArr2 = jArrC3;
            strArr17 = new String[]{N()};
        }
        dqqf.dA(length, strArr17, new ejxr() { // from class: brta
            @Override // defpackage.ejxr
            public final Object get() {
                return "lookup_key:".concat(String.valueOf(this.a.getString(20)));
            }
        });
        int[] iArrA7 = dj(21) ? z2 ? dqru.A(null, ds(getString(cO(21, brvd.a)))) : new int[]{c()} : null;
        dqqf.dy(length, iArrA7, new ejxr() { // from class: brtb
            @Override // defpackage.ejxr
            public final Object get() {
                return "color_palette_index:".concat(String.valueOf(this.a.getString(21)));
            }
        });
        if (!dj(22)) {
            strArr18 = strArr17;
            iArrA = null;
        } else if (z2) {
            strArr18 = strArr17;
            iArrA = dqru.A(null, ds(getString(cO(22, brvd.a))));
        } else {
            strArr18 = strArr17;
            iArrA = new int[]{e()};
        }
        dqqf.dy(length, iArrA, new ejxr() { // from class: brtc
            @Override // defpackage.ejxr
            public final Object get() {
                return "color_type:".concat(String.valueOf(this.a.getString(22)));
            }
        });
        if (!dj(23)) {
            iArr = iArrA;
            iArrA2 = null;
        } else if (z2) {
            iArr = iArrA;
            iArrA2 = dqru.A(null, ds(getString(cO(23, brvd.a))));
        } else {
            iArr = iArrA;
            iArrA2 = new int[]{f()};
        }
        dqqf.dy(length, iArrA2, new ejxr() { // from class: brtd
            @Override // defpackage.ejxr
            public final Object get() {
                return "extended_color:".concat(String.valueOf(this.a.getString(23)));
            }
        });
        if (!dj(24)) {
            iArr2 = iArrA2;
            zArrE = null;
        } else if (z2) {
            iArr2 = iArrA2;
            zArrE = dqru.E(null, dv(getString(cO(24, brvd.a))));
        } else {
            iArr2 = iArrA2;
            zArrE = new boolean[]{U()};
        }
        dqqf.dB(length, zArrE, new ejxr() { // from class: brte
            @Override // defpackage.ejxr
            public final Object get() {
                return "blocked:".concat(String.valueOf(this.a.getString(24)));
            }
        });
        if (!dj(25)) {
            zArr = zArrE;
            iArr3 = iArrA7;
            strArr19 = null;
        } else if (z2) {
            zArr = zArrE;
            iArr3 = iArrA7;
            strArr19 = (String[]) dqru.D(null, du(getString(cO(25, brvd.a))), new String[0]);
        } else {
            zArr = zArrE;
            iArr3 = iArrA7;
            strArr19 = new String[]{T()};
        }
        dqqf.dA(length, strArr19, new ejxr() { // from class: brtf
            @Override // defpackage.ejxr
            public final Object get() {
                return "subscription_name:".concat(String.valueOf(this.a.getString(25)));
            }
        });
        int[] iArrA8 = dj(26) ? z2 ? dqru.A(null, ds(getString(cO(26, brvd.a)))) : new int[]{k()} : null;
        dqqf.dy(length, iArrA8, new ejxr() { // from class: brtg
            @Override // defpackage.ejxr
            public final Object get() {
                return "subscription_color:".concat(String.valueOf(this.a.getString(26)));
            }
        });
        if (!dj(27)) {
            strArr20 = strArr19;
            uriArr4 = uriArr;
            strArr21 = null;
        } else if (z2) {
            strArr20 = strArr19;
            uriArr4 = uriArr;
            strArr21 = (String[]) dqru.D(null, du(getString(cO(27, brvd.a))), new String[0]);
        } else {
            strArr20 = strArr19;
            uriArr4 = uriArr;
            strArr21 = new String[]{G()};
        }
        dqqf.dA(length, strArr21, new ejxr() { // from class: brth
            @Override // defpackage.ejxr
            public final Object get() {
                return "contact_destination:".concat(String.valueOf(this.a.getString(27)));
            }
        });
        int[] iArrA9 = dj(28) ? z2 ? dqru.A(null, ds(getString(cO(28, brvd.a)))) : new int[]{h()} : null;
        dqqf.dy(length, iArrA9, new ejxr() { // from class: brtj
            @Override // defpackage.ejxr
            public final Object get() {
                return "participant_type:".concat(String.valueOf(this.a.getString(28)));
            }
        });
        if (!dj(29)) {
            iArr4 = iArrA9;
            iArrA3 = null;
        } else if (z2) {
            iArr4 = iArrA9;
            iArrA3 = dqru.A(null, ds(getString(cO(29, brvd.a))));
        } else {
            iArr4 = iArrA9;
            iArrA3 = new int[]{l()};
        }
        dqqf.dy(length, iArrA3, new ejxr() { // from class: brtk
            @Override // defpackage.ejxr
            public final Object get() {
                return "video_reachability:".concat(String.valueOf(this.a.getString(29)));
            }
        });
        if (!dj(30)) {
            iArr5 = iArrA3;
            strArr22 = strArr21;
            strArr23 = null;
        } else if (z2) {
            iArr5 = iArrA3;
            strArr22 = strArr21;
            strArr23 = (String[]) dqru.D(null, du(getString(cO(30, brvd.a))), new String[0]);
        } else {
            iArr5 = iArrA3;
            strArr22 = strArr21;
            strArr23 = new String[]{D()};
        }
        dqqf.dA(length, strArr23, new ejxr() { // from class: brtm
            @Override // defpackage.ejxr
            public final Object get() {
                return "alias:".concat(String.valueOf(this.a.getString(30)));
            }
        });
        boolean[] zArrE5 = dj(31) ? z2 ? dqru.E(null, dv(getString(cO(31, brvd.a)))) : new boolean[]{X()} : null;
        dqqf.dB(length, zArrE5, new ejxr() { // from class: brtn
            @Override // defpackage.ejxr
            public final Object get() {
                return "is_spam:".concat(String.valueOf(this.a.getString(31)));
            }
        });
        if (!dj(32)) {
            zArr2 = zArrE5;
            iArrA4 = null;
        } else if (z2) {
            zArr2 = zArrE5;
            iArrA4 = dqru.A(null, ds(getString(cO(32, brvd.a))));
        } else {
            zArr2 = zArrE5;
            iArrA4 = new int[]{g()};
        }
        dqqf.dy(length, iArrA4, new ejxr() { // from class: brto
            @Override // defpackage.ejxr
            public final Object get() {
                return "is_spam_source:".concat(String.valueOf(this.a.getString(32)));
            }
        });
        if (!dj(33)) {
            iArr6 = iArrA4;
            strArr24 = strArr23;
            strArr25 = null;
        } else if (z2) {
            iArr6 = iArrA4;
            strArr24 = strArr23;
            strArr25 = (String[]) dqru.D(null, du(getString(cO(33, brvd.a))), new String[0]);
        } else {
            iArr6 = iArrA4;
            strArr24 = strArr23;
            strArr25 = new String[]{E()};
        }
        dqqf.dA(length, strArr25, new ejxr() { // from class: brtp
            @Override // defpackage.ejxr
            public final Object get() {
                return "cms_id:".concat(String.valueOf(this.a.getString(33)));
            }
        });
        if (!dj(34)) {
            strArr26 = strArr25;
            z = z2;
            strArr27 = strArr31;
            bvdzVarArr = null;
        } else if (z2) {
            int[] iArrDs = ds(getString(cO(34, brvd.a)));
            bvdz[] bvdzVarArrValues = bvdz.values();
            strArr26 = strArr25;
            int length7 = bvdzVarArrValues.length;
            bvdz[] bvdzVarArr3 = new bvdz[iArrDs.length];
            z = z2;
            strArr27 = strArr31;
            for (int i14 = 0; i14 < iArrDs.length; i14++) {
                int i15 = iArrDs[i14];
                if (i15 >= length7) {
                    throw new IllegalStateException();
                }
                bvdzVarArr3[i14] = bvdzVarArrValues[i15];
            }
            bvdzVarArr = (bvdz[]) dqru.D(null, bvdzVarArr3, new bvdz[0]);
        } else {
            strArr26 = strArr25;
            z = z2;
            strArr27 = strArr31;
            bvdzVarArr = new bvdz[]{x()};
        }
        dqqf.dA(length, bvdzVarArr, new ejxr() { // from class: brtq
            @Override // defpackage.ejxr
            public final Object get() {
                return "latest_verification_status:".concat(String.valueOf(this.a.getString(34)));
            }
        });
        String[] strArr34 = dj(35) ? z ? (String[]) dqru.D(null, du(getString(cO(35, brvd.a))), new String[0]) : new String[]{Q()} : null;
        dqqf.dA(length, strArr34, new ejxr() { // from class: brtr
            @Override // defpackage.ejxr
            public final Object get() {
                return "profile_photo_blob_id:".concat(String.valueOf(this.a.getString(35)));
            }
        });
        byte[][] bArrF = dj(36) ? z ? dqru.F(null, dD(getString(cO(36, brvd.a)))) : new byte[][]{Z()} : null;
        dqqf.dA(length, bArrF, new ejxr() { // from class: brts
            @Override // defpackage.ejxr
            public final Object get() {
                return "profile_photo_encryption_key:".concat(String.valueOf(this.a.getString(36)));
            }
        });
        long[] jArrC4 = dj(37) ? z ? dqru.C(null, dt(getString(cO(37, brvd.a)))) : new long[]{n()} : null;
        dqqf.dz(length, jArrC4, new ejxr() { // from class: brtu
            @Override // defpackage.ejxr
            public final Object get() {
                return "directory_id:".concat(String.valueOf(this.a.getString(37)));
            }
        });
        if (!dj(38)) {
            strArr28 = strArr34;
            zArrE2 = null;
        } else if (z) {
            strArr28 = strArr34;
            zArrE2 = dqru.E(null, dv(getString(cO(38, brvd.a))));
        } else {
            strArr28 = strArr34;
            zArrE2 = new boolean[]{V()};
        }
        dqqf.dB(length, zArrE2, new ejxr() { // from class: brtv
            @Override // defpackage.ejxr
            public final Object get() {
                return "is_check_constraint_enabled_via_phenotype:".concat(String.valueOf(this.a.getString(38)));
            }
        });
        if (!dj(39)) {
            zArr3 = zArrE2;
            zArrE3 = null;
        } else if (z) {
            zArr3 = zArrE2;
            zArrE3 = dqru.E(null, dv(getString(cO(39, brvd.a))));
        } else {
            zArr3 = zArrE2;
            zArrE3 = new boolean[]{Y()};
        }
        dqqf.dB(length, zArrE3, new ejxr() { // from class: brtw
            @Override // defpackage.ejxr
            public final Object get() {
                return "is_valid_phone_number_data:".concat(String.valueOf(this.a.getString(39)));
            }
        });
        if (!dj(40)) {
            zArr4 = zArrE3;
            bArr = bArrF;
            strArr29 = null;
        } else if (z) {
            zArr4 = zArrE3;
            bArr = bArrF;
            strArr29 = (String[]) dqru.D(null, du(getString(cO(40, brvd.a))), new String[0]);
        } else {
            zArr4 = zArrE3;
            bArr = bArrF;
            strArr29 = new String[]{J()};
        }
        dqqf.dA(length, strArr29, new ejxr() { // from class: brty
            @Override // defpackage.ejxr
            public final Object get() {
                return "duplicate_of:".concat(String.valueOf(this.a.getString(40)));
            }
        });
        if (!dj(41)) {
            strArr30 = strArr29;
            bvdzVarArr2 = bvdzVarArr;
            jArr3 = jArrC4;
            cpyiVarArr = null;
        } else if (z) {
            int[] iArrDs2 = ds(getString(cO(41, brvd.a)));
            cpyi[] cpyiVarArrValues = cpyi.values();
            strArr30 = strArr29;
            int length8 = cpyiVarArrValues.length;
            bvdzVarArr2 = bvdzVarArr;
            cpyi[] cpyiVarArr2 = new cpyi[iArrDs2.length];
            jArr3 = jArrC4;
            for (int i16 = 0; i16 < iArrDs2.length; i16++) {
                int i17 = iArrDs2[i16];
                if (i17 >= length8) {
                    throw new IllegalStateException();
                }
                cpyiVarArr2[i16] = cpyiVarArrValues[i17];
            }
            cpyiVarArr = (cpyi[]) dqru.D(null, cpyiVarArr2, new cpyi[0]);
        } else {
            strArr30 = strArr29;
            bvdzVarArr2 = bvdzVarArr;
            jArr3 = jArrC4;
            cpyiVarArr = new cpyi[]{B()};
        }
        dqqf.dA(length, cpyiVarArr, new ejxr() { // from class: brtz
            @Override // defpackage.ejxr
            public final Object get() {
                return "cms_life_cycle:".concat(String.valueOf(this.a.getString(41)));
            }
        });
        if (!dj(42)) {
            alwmVarArr = null;
        } else if (z) {
            int[] iArrDs3 = ds(getString(cO(42, brvd.a)));
            alwm[] alwmVarArr3 = new alwm[iArrDs3.length];
            for (int i18 = 0; i18 < iArrDs3.length; i18++) {
                alwm alwmVarB = alwm.b(iArrDs3[i18]);
                if (alwmVarB == null) {
                    throw new IllegalStateException();
                }
                alwmVarArr3[i18] = alwmVarB;
            }
            alwmVarArr = (alwm[]) dqru.D(null, alwmVarArr3, new alwm[0]);
        } else {
            alwmVarArr = new alwm[]{s()};
        }
        dqqf.dA(length, alwmVarArr, new ejxr() { // from class: brua
            @Override // defpackage.ejxr
            public final Object get() {
                return "norm_ui_status:".concat(String.valueOf(this.a.getString(42)));
            }
        });
        if (!dj(43)) {
            bbajVarArr = null;
        } else if (z) {
            String[] strArrDu5 = du(getString(cO(43, brvd.a)));
            int length9 = strArrDu5.length;
            bbaj[] bbajVarArr3 = new bbaj[length9];
            for (int i19 = 0; i19 < length9; i19++) {
                bbajVarArr3[i19] = bbam.a(strArrDu5[i19]);
            }
            bbajVarArr = (bbaj[]) dqru.D(null, bbajVarArr3, new bbaj[0]);
        } else {
            bbajVarArr = new bbaj[]{w()};
        }
        dqqf.dA(length, bbajVarArr, new ejxr() { // from class: brub
            @Override // defpackage.ejxr
            public final Object get() {
                return "last_modified_by_key:".concat(String.valueOf(this.a.getString(43)));
            }
        });
        if (!dj(44)) {
            bbajVarArr2 = bbajVarArr;
            alwmVarArr2 = alwmVarArr;
            chpqVarArr = null;
        } else if (z) {
            int[] iArrDs4 = ds(getString(cO(44, brvd.a)));
            chpq[] chpqVarArr5 = new chpq[iArrDs4.length];
            bbajVarArr2 = bbajVarArr;
            alwmVarArr2 = alwmVarArr;
            for (int i20 = 0; i20 < iArrDs4.length; i20++) {
                chpq chpqVarB = chpq.b(iArrDs4[i20]);
                if (chpqVarB == null) {
                    throw new IllegalStateException();
                }
                chpqVarArr5[i20] = chpqVarB;
            }
            chpqVarArr = (chpq[]) dqru.D(null, chpqVarArr5, new chpq[0]);
        } else {
            bbajVarArr2 = bbajVarArr;
            alwmVarArr2 = alwmVarArr;
            chpqVarArr = new chpq[]{z()};
        }
        dqqf.dA(length, chpqVarArr, new ejxr() { // from class: bruc
            @Override // defpackage.ejxr
            public final Object get() {
                return "name_source:".concat(String.valueOf(this.a.getString(44)));
            }
        });
        if (!dj(45)) {
            chpqVarArr2 = chpqVarArr;
            chpqVarArr3 = null;
        } else if (z) {
            int[] iArrDs5 = ds(getString(cO(45, brvd.a)));
            chpq[] chpqVarArr6 = new chpq[iArrDs5.length];
            chpqVarArr2 = chpqVarArr;
            for (int i21 = 0; i21 < iArrDs5.length; i21++) {
                chpq chpqVarB2 = chpq.b(iArrDs5[i21]);
                if (chpqVarB2 == null) {
                    throw new IllegalStateException();
                }
                chpqVarArr6[i21] = chpqVarB2;
            }
            chpqVarArr3 = (chpq[]) dqru.D(null, chpqVarArr6, new chpq[0]);
        } else {
            chpqVarArr2 = chpqVarArr;
            chpqVarArr3 = new chpq[]{A()};
        }
        dqqf.dA(length, chpqVarArr3, new ejxr() { // from class: brud
            @Override // defpackage.ejxr
            public final Object get() {
                return "photo_source:".concat(String.valueOf(this.a.getString(45)));
            }
        });
        if (!dj(46)) {
            chpqVarArr4 = chpqVarArr3;
            chpmVarArr = null;
        } else if (z) {
            int[] iArrDs6 = ds(getString(cO(46, brvd.a)));
            chpm[] chpmVarArr3 = new chpm[iArrDs6.length];
            chpqVarArr4 = chpqVarArr3;
            for (int i22 = 0; i22 < iArrDs6.length; i22++) {
                chpm chpmVarB = chpm.b(iArrDs6[i22]);
                if (chpmVarB == null) {
                    throw new IllegalStateException();
                }
                chpmVarArr3[i22] = chpmVarB;
            }
            chpmVarArr = (chpm[]) dqru.D(null, chpmVarArr3, new chpm[0]);
        } else {
            chpqVarArr4 = chpqVarArr3;
            chpmVarArr = new chpm[]{y()};
        }
        dqqf.dA(length, chpmVarArr, new ejxr() { // from class: bruf
            @Override // defpackage.ejxr
            public final Object get() {
                return "profile_photo_user_preference:".concat(String.valueOf(this.a.getString(46)));
            }
        });
        if (!dj(47)) {
            chpmVarArr2 = chpmVarArr;
            anucVarArr = null;
        } else if (z) {
            List listDf = df(getString(cO(47, brvd.a)));
            anuc[] anucVarArr3 = new anuc[listDf.size()];
            Iterator it2 = listDf.iterator();
            int i23 = 0;
            while (it2.hasNext()) {
                chpm[] chpmVarArr4 = chpmVarArr;
                try {
                    byte[] bArrZ = dqru.z((String) it2.next());
                    int i24 = i23 + 1;
                    if (bArrZ == null) {
                        it = it2;
                        anucVar = null;
                    } else {
                        it = it2;
                        try {
                            anucVar = (anuc) evsn.parseFrom(anuc.a, bArrZ);
                        } catch (Throwable unused) {
                            i23 = i24;
                            anucVarArr3[i23] = null;
                            i23++;
                            chpmVarArr = chpmVarArr4;
                            it2 = it;
                        }
                    }
                    anucVarArr3[i23] = anucVar;
                    i23 = i24;
                } catch (Throwable unused2) {
                    it = it2;
                }
                chpmVarArr = chpmVarArr4;
                it2 = it;
            }
            chpmVarArr2 = chpmVarArr;
            anucVarArr = (anuc[]) dqru.D(null, anucVarArr3, new anuc[0]);
        } else {
            chpmVarArr2 = chpmVarArr;
            anucVarArr = new anuc[]{t()};
        }
        dqqf.dA(length, anucVarArr, new ejxr() { // from class: brug
            @Override // defpackage.ejxr
            public final Object get() {
                return "contact_metadata:".concat(String.valueOf(this.a.getString(47)));
            }
        });
        if (!dj(48)) {
            i2 = 0;
            zArrE4 = null;
        } else if (z) {
            zArrE4 = dqru.E(null, dv(getString(cO(48, brvd.a))));
            i2 = 0;
        } else {
            i2 = 0;
            zArrE4 = new boolean[]{W()};
        }
        dqqf.dB(length, zArrE4, new ejxr() { // from class: bruh
            @Override // defpackage.ejxr
            public final Object get() {
                return "is_enterprise_contact:".concat(String.valueOf(this.a.getString(48)));
            }
        });
        ekfw ekfwVar = new ekfw();
        int i25 = i2;
        while (i25 < length) {
            long j = jArr[i25];
            if (j <= 0 || hashSet.contains(Long.valueOf(j))) {
                zArr5 = zArrE4;
                anucVarArr2 = anucVarArr;
                i3 = length;
            } else {
                hashSet.add(Long.valueOf(jArr[i25]));
                String[] strArr35 = brvd.a;
                broy broyVar = new broy();
                broyVar.aF();
                broyVar.aD();
                long j2 = jArr[i25];
                zArr5 = zArrE4;
                if (strArr27 != null) {
                    broyVar.t(strArr27[i25]);
                }
                if (instantArr != null) {
                    broyVar.H(instantArr[i25]);
                }
                anucVarArr2 = anucVarArr;
                if (jArrC != null) {
                    broyVar.I(jArrC[i25]);
                }
                if (strArr32 != null) {
                    broyVar.J(strArr32[i25]);
                }
                if (axcmVarArr != null) {
                    broyVar.C(axcmVarArr[i25]);
                }
                if (axcmVarArr3 != null) {
                    broyVar.D(axcmVarArr3[i25]);
                }
                if (iArrA5 != null) {
                    int i26 = iArrA5[i25];
                    broyVar.aE(6);
                    broyVar.g = i26;
                }
                if (iArrA6 != null) {
                    int i27 = iArrA6[i25];
                    broyVar.aE(7);
                    broyVar.h = i27;
                }
                if (strArr16 != null) {
                    broyVar.G(strArr16[i25]);
                }
                if (strArr3 != null) {
                    String str3 = strArr3[i25];
                    broyVar.aE(9);
                    broyVar.j = str3;
                }
                if (strArr5 != null) {
                    broyVar.o(strArr5[i25]);
                }
                if (strArr7 != null) {
                    broyVar.h(strArr7[i25]);
                }
                if (strArr9 != null) {
                    broyVar.m(strArr9[i25]);
                }
                if (jArrC2 != null) {
                    long j3 = jArrC2[i25];
                    i3 = length;
                    broyVar.aE(13);
                    broyVar.n = j3;
                } else {
                    i3 = length;
                }
                if (strArr11 != null) {
                    String str4 = strArr11[i25];
                    broyVar.aE(14);
                    broyVar.o = str4;
                }
                if (strArr13 != null) {
                    broyVar.s(strArr13[i25]);
                }
                if (strArr15 != null) {
                    broyVar.r(strArr15[i25]);
                }
                if (uriArr4 != null) {
                    Uri uri = uriArr4[i25];
                    broyVar.aE(17);
                    broyVar.r = uri;
                }
                if (uriArr3 != null) {
                    broyVar.l(uriArr3[i25]);
                }
                if (jArr2 != null) {
                    broyVar.j(jArr2[i25]);
                }
                if (strArr18 != null) {
                    broyVar.B(strArr18[i25]);
                }
                if (iArr3 != null) {
                    broyVar.f(iArr3[i25]);
                }
                if (iArr != null) {
                    broyVar.g(iArr[i25]);
                }
                if (iArr2 != null) {
                    broyVar.q(iArr2[i25]);
                }
                if (zArr != null) {
                    broyVar.c(zArr[i25]);
                }
                if (strArr20 != null) {
                    String str5 = strArr20[i25];
                    broyVar.aE(25);
                    broyVar.z = str5;
                }
                if (iArrA8 != null) {
                    int i28 = iArrA8[i25];
                    broyVar.aE(26);
                    broyVar.A = i28;
                }
                if (strArr22 != null) {
                    broyVar.i(strArr22[i25]);
                }
                if (iArr4 != null) {
                    broyVar.K(iArr4[i25]);
                }
                if (iArr5 != null) {
                    int i29 = iArr5[i25];
                    broyVar.aE(29);
                    broyVar.D = i29;
                }
                if (strArr24 != null) {
                    broyVar.b(strArr24[i25]);
                }
                if (zArr2 != null) {
                    broyVar.w(zArr2[i25]);
                }
                if (iArr6 != null) {
                    broyVar.x(iArr6[i25]);
                }
                if (strArr26 != null) {
                    broyVar.d(strArr26[i25]);
                }
                if (bvdzVarArr2 != null) {
                    broyVar.A(bvdzVarArr2[i25]);
                }
                if (strArr28 != null) {
                    broyVar.M(strArr28[i25]);
                }
                if (bArr != null) {
                    broyVar.N(bArr[i25]);
                }
                if (jArr3 != null) {
                    broyVar.n(jArr3[i25]);
                }
                if (zArr3 != null) {
                    broyVar.u(zArr3[i25]);
                }
                if (zArr4 != null) {
                    broyVar.y(zArr4[i25]);
                }
                if (strArr30 != null) {
                    broyVar.p(strArr30[i25]);
                }
                if (cpyiVarArr != null) {
                    broyVar.e(cpyiVarArr[i25]);
                }
                if (alwmVarArr2 != null) {
                    broyVar.F(alwmVarArr2[i25]);
                }
                if (bbajVarArr2 != null) {
                    broyVar.z(bbajVarArr2[i25]);
                }
                if (chpqVarArr2 != null) {
                    broyVar.E(chpqVarArr2[i25]);
                }
                if (chpqVarArr4 != null) {
                    broyVar.L(chpqVarArr4[i25]);
                }
                if (chpmVarArr2 != null) {
                    broyVar.O(chpmVarArr2[i25]);
                }
                if (anucVarArr2 != null) {
                    broyVar.k(anucVarArr2[i25]);
                }
                if (zArr5 != null) {
                    broyVar.v(zArr5[i25]);
                }
                ekfwVar.h(broyVar.a());
            }
            i25++;
            length = i3;
            zArrE4 = zArr5;
            anucVarArr = anucVarArr2;
        }
        return ekfwVar.g();
    }

    public final int g() {
        return getInt(cO(32, brvd.a));
    }

    public final int h() {
        return getInt(cO(28, brvd.a));
    }

    public final int i() {
        return getInt(cO(7, brvd.a));
    }

    public final int j() {
        return getInt(cO(6, brvd.a));
    }

    public final int k() {
        return getInt(cO(26, brvd.a));
    }

    public final int l() {
        return getInt(cO(29, brvd.a));
    }

    public final long m() {
        return getLong(cO(19, brvd.a));
    }

    public final long n() {
        return getLong(cO(37, brvd.a));
    }

    public final long o() {
        return getLong(cO(2, brvd.a));
    }

    public final long p() {
        return getLong(cO(13, brvd.a));
    }

    public final Uri q() {
        String string = getString(cO(18, brvd.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final Uri r() {
        String string = getString(cO(17, brvd.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final alwm s() {
        return alwm.b(getInt(cO(42, brvd.a)));
    }

    public final anuc t() {
        byte[] blob = getBlob(cO(47, brvd.a));
        if (blob == null) {
            return null;
        }
        try {
            return (anuc) evsn.parseFrom(anuc.a, blob, evrr.a());
        } catch (Throwable unused) {
            return anuc.a;
        }
    }

    public final axcm u() {
        return axcn.a(getString(cO(4, brvd.a)));
    }

    public final axcm v() {
        return axcn.a(getString(cO(5, brvd.a)));
    }

    public final bbaj w() {
        return bbam.a(getString(cO(43, brvd.a)));
    }

    public final bvdz x() {
        bvdz[] bvdzVarArrValues = bvdz.values();
        int i = getInt(cO(34, brvd.a));
        if (i < bvdzVarArrValues.length) {
            return bvdzVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    public final chpm y() {
        return chpm.b(getInt(cO(46, brvd.a)));
    }

    public final chpq z() {
        return chpq.b(getInt(cO(44, brvd.a)));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
