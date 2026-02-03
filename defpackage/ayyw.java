package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayyw extends dqqf implements ayyb {
    @Deprecated
    public ayyw(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, ayzd ayzdVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, ayzh.a, dqwjVar, dqtmVar, ayzdVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new aywh();
    }

    public final int c() {
        return getInt(cO(16, ayzh.a));
    }

    public final int e() {
        return getInt(cO(15, ayzh.a));
    }

    public final int f() {
        return getInt(cO(17, ayzh.a));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        ConversationIdType[] conversationIdTypeArr;
        axcm[] axcmVarArr;
        bvdk[] bvdkVarArr;
        long[] jArr;
        boolean z;
        bvdp[] bvdpVarArr;
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        boolean[] zArr;
        bvdp[] bvdpVarArr2;
        ConversationIdType[] conversationIdTypeArr2;
        cigb[] cigbVarArr;
        avoe[] avoeVarArr;
        int[] iArr;
        int[] iArrA;
        int[] iArr2;
        avoe[] avoeVarArr2;
        String[] strArr4;
        String[] strArr5;
        String[] strArr6;
        cigb[] cigbVarArr2;
        cpyi[] cpyiVarArr;
        int i;
        int i2;
        int[] iArr3;
        cpyi[] cpyiVarArr2;
        dqwl dqwlVar = dqthVar.a;
        long[] jArrDC = dC(getString(dqthVar.h + 1));
        int length = jArrDC.length;
        if (length == 0 || (length == 1 && jArrDC[0] == -1)) {
            int i3 = ekgb.d;
            return ekoe.a;
        }
        HashSet hashSet = new HashSet();
        dqtm dqtmVar = this.d;
        boolean zDj = dj(0);
        boolean z2 = dqtmVar.b;
        if (!zDj) {
            conversationIdTypeArr = null;
        } else if (z2) {
            long[] jArrDt = dt(getString(cO(0, ayzh.a)));
            int length2 = jArrDt.length;
            ConversationIdType[] conversationIdTypeArr3 = new ConversationIdType[length2];
            for (int i4 = 0; i4 < length2; i4++) {
                conversationIdTypeArr3[i4] = new ConversationIdType(jArrDt[i4]);
            }
            conversationIdTypeArr = (ConversationIdType[]) dqru.D(null, conversationIdTypeArr3, new ConversationIdType[0]);
        } else {
            conversationIdTypeArr = new ConversationIdType[]{k()};
        }
        dqqf.dA(length, conversationIdTypeArr, new ejxr() { // from class: ayyc
            @Override // defpackage.ejxr
            public final Object get() {
                return "_id:".concat(String.valueOf(this.a.getString(0)));
            }
        });
        if (!dj(1)) {
            axcmVarArr = null;
        } else if (z2) {
            String[] strArrDu = du(getString(cO(1, ayzh.a)));
            int length3 = strArrDu.length;
            axcm[] axcmVarArr2 = new axcm[length3];
            for (int i5 = 0; i5 < length3; i5++) {
                axcmVarArr2[i5] = axcn.a(strArrDu[i5]);
            }
            axcmVarArr = (axcm[]) dqru.D(null, axcmVarArr2, new axcm[0]);
        } else {
            axcmVarArr = new axcm[]{j()};
        }
        dqqf.dA(length, axcmVarArr, new ejxr() { // from class: ayye
            @Override // defpackage.ejxr
            public final Object get() {
                return "current_my_identity:".concat(String.valueOf(this.a.getString(1)));
            }
        });
        String[] strArr7 = dj(2) ? z2 ? (String[]) dqru.D(null, du(getString(cO(2, ayzh.a))), new String[0]) : new String[]{u()} : null;
        dqqf.dA(length, strArr7, new ejxr() { // from class: ayyf
            @Override // defpackage.ejxr
            public final Object get() {
                return "snippet_text:".concat(String.valueOf(this.a.getString(2)));
            }
        });
        if (!dj(3)) {
            bvdkVarArr = null;
        } else if (z2) {
            int[] iArrDs = ds(getString(cO(3, ayzh.a)));
            bvdk[] bvdkVarArr2 = new bvdk[iArrDs.length];
            for (int i6 = 0; i6 < iArrDs.length; i6++) {
                bvdk bvdkVarA = bvdk.a(iArrDs[i6]);
                if (bvdkVarA == null) {
                    throw new IllegalStateException();
                }
                bvdkVarArr2[i6] = bvdkVarA;
            }
            bvdkVarArr = (bvdk[]) dqru.D(null, bvdkVarArr2, new bvdk[0]);
        } else {
            bvdkVarArr = new bvdk[]{l()};
        }
        dqqf.dA(length, bvdkVarArr, new ejxr() { // from class: ayyg
            @Override // defpackage.ejxr
            public final Object get() {
                return "archive_status:".concat(String.valueOf(this.a.getString(3)));
            }
        });
        long[] jArrC = dj(4) ? z2 ? dqru.C(null, dt(getString(cO(4, ayzh.a)))) : new long[]{g()} : null;
        dqqf.dz(length, jArrC, new ejxr() { // from class: ayyh
            @Override // defpackage.ejxr
            public final Object get() {
                return "most_recent_timestamp_ms:".concat(String.valueOf(this.a.getString(4)));
            }
        });
        String[] strArr8 = dj(5) ? z2 ? (String[]) dqru.D(null, du(getString(cO(5, ayzh.a))), new String[0]) : new String[]{v()} : null;
        dqqf.dA(length, strArr8, new ejxr() { // from class: ayyi
            @Override // defpackage.ejxr
            public final Object get() {
                return "subject:".concat(String.valueOf(this.a.getString(5)));
            }
        });
        String[] strArr9 = dj(6) ? z2 ? (String[]) dqru.D(null, du(getString(cO(6, ayzh.a))), new String[0]) : new String[]{q()} : null;
        dqqf.dA(length, strArr9, new ejxr() { // from class: ayyj
            @Override // defpackage.ejxr
            public final Object get() {
                return "name:".concat(String.valueOf(this.a.getString(6)));
            }
        });
        if (!dj(7)) {
            jArr = jArrDC;
            z = z2;
            bvdpVarArr = null;
        } else if (z2) {
            int[] iArrDs2 = ds(getString(cO(7, ayzh.a)));
            bvdp[] bvdpVarArrValues = bvdp.values();
            int length4 = bvdpVarArrValues.length;
            bvdp[] bvdpVarArr3 = new bvdp[iArrDs2.length];
            jArr = jArrDC;
            z = z2;
            for (int i7 = 0; i7 < iArrDs2.length; i7++) {
                int i8 = iArrDs2[i7];
                if (i8 >= length4) {
                    throw new IllegalStateException();
                }
                bvdpVarArr3[i7] = bvdpVarArrValues[i8];
            }
            bvdpVarArr = (bvdp[]) dqru.D(null, bvdpVarArr3, new bvdp[0]);
        } else {
            jArr = jArrDC;
            z = z2;
            bvdpVarArr = new bvdp[]{m()};
        }
        dqqf.dA(length, bvdpVarArr, new ejxr() { // from class: ayyk
            @Override // defpackage.ejxr
            public final Object get() {
                return "name_is_automatic:".concat(String.valueOf(this.a.getString(7)));
            }
        });
        boolean[] zArrE = dj(8) ? z ? dqru.E(null, dv(getString(cO(8, ayzh.a)))) : new boolean[]{w()} : null;
        dqqf.dB(length, zArrE, new ejxr() { // from class: ayyl
            @Override // defpackage.ejxr
            public final Object get() {
                return "has_rbm_participant:".concat(String.valueOf(this.a.getString(8)));
            }
        });
        String[] strArr10 = dj(9) ? z ? (String[]) dqru.D(null, du(getString(cO(9, ayzh.a))), new String[0]) : new String[]{t()} : null;
        dqqf.dA(length, strArr10, new ejxr() { // from class: ayym
            @Override // defpackage.ejxr
            public final Object get() {
                return "rcs_group_self_msisdn:".concat(String.valueOf(this.a.getString(9)));
            }
        });
        String[] strArr11 = dj(10) ? z ? (String[]) dqru.D(null, du(getString(cO(10, ayzh.a))), new String[0]) : new String[]{s()} : null;
        dqqf.dA(length, strArr11, new ejxr() { // from class: ayyn
            @Override // defpackage.ejxr
            public final Object get() {
                return "rcs_group_id:".concat(String.valueOf(this.a.getString(10)));
            }
        });
        if (!dj(11)) {
            strArr = strArr11;
            strArr2 = null;
        } else if (z) {
            strArr = strArr11;
            strArr2 = (String[]) dqru.D(null, du(getString(cO(11, ayzh.a))), new String[0]);
        } else {
            strArr = strArr11;
            strArr2 = new String[]{r()};
        }
        dqqf.dA(length, strArr2, new ejxr() { // from class: ayyo
            @Override // defpackage.ejxr
            public final Object get() {
                return "rcs_conference_uri:".concat(String.valueOf(this.a.getString(11)));
            }
        });
        if (!dj(12)) {
            strArr3 = strArr2;
            zArr = zArrE;
            bvdpVarArr2 = bvdpVarArr;
            conversationIdTypeArr2 = conversationIdTypeArr;
            cigbVarArr = null;
        } else if (z) {
            long[] jArrDt2 = dt(getString(cO(12, ayzh.a)));
            int length5 = jArrDt2.length;
            strArr3 = strArr2;
            cigb[] cigbVarArr3 = new cigb[length5];
            zArr = zArrE;
            int i9 = 0;
            while (i9 < length5) {
                int i10 = i9;
                cigbVarArr3[i10] = new cigb(jArrDt2[i9]);
                i9 = i10 + 1;
                conversationIdTypeArr = conversationIdTypeArr;
                bvdpVarArr = bvdpVarArr;
            }
            bvdpVarArr2 = bvdpVarArr;
            conversationIdTypeArr2 = conversationIdTypeArr;
            cigbVarArr = (cigb[]) dqru.D(null, cigbVarArr3, new cigb[0]);
        } else {
            strArr3 = strArr2;
            zArr = zArrE;
            bvdpVarArr2 = bvdpVarArr;
            conversationIdTypeArr2 = conversationIdTypeArr;
            cigbVarArr = new cigb[]{n()};
        }
        dqqf.dA(length, cigbVarArr, new ejxr() { // from class: ayyp
            @Override // defpackage.ejxr
            public final Object get() {
                return "rcs_group_capabilities:".concat(String.valueOf(this.a.getString(12)));
            }
        });
        if (!dj(13)) {
            avoeVarArr = null;
        } else if (z) {
            int[] iArrDs3 = ds(getString(cO(13, ayzh.a)));
            avoe[] avoeVarArr3 = new avoe[iArrDs3.length];
            for (int i11 = 0; i11 < iArrDs3.length; i11++) {
                avoe avoeVarB = avoe.b(iArrDs3[i11]);
                if (avoeVarB == null) {
                    throw new IllegalStateException();
                }
                avoeVarArr3[i11] = avoeVarB;
            }
            avoeVarArr = (avoe[]) dqru.D(null, avoeVarArr3, new avoe[0]);
        } else {
            avoeVarArr = new avoe[]{i()};
        }
        dqqf.dA(length, avoeVarArr, new ejxr() { // from class: ayyq
            @Override // defpackage.ejxr
            public final Object get() {
                return "error_state:".concat(String.valueOf(this.a.getString(13)));
            }
        });
        long[] jArrC2 = dj(14) ? z ? dqru.C(null, dt(getString(cO(14, ayzh.a)))) : new long[]{h()} : null;
        dqqf.dz(length, jArrC2, new ejxr() { // from class: ayyr
            @Override // defpackage.ejxr
            public final Object get() {
                return "rcs_subject_change_timestamp_ms:".concat(String.valueOf(this.a.getString(14)));
            }
        });
        int[] iArrA2 = dj(15) ? z ? dqru.A(null, ds(getString(cO(15, ayzh.a)))) : new int[]{e()} : null;
        dqqf.dy(length, iArrA2, new ejxr() { // from class: ayys
            @Override // defpackage.ejxr
            public final Object get() {
                return "join_state:".concat(String.valueOf(this.a.getString(15)));
            }
        });
        int[] iArrA3 = dj(16) ? z ? dqru.A(null, ds(getString(cO(16, ayzh.a)))) : new int[]{c()} : null;
        dqqf.dy(length, iArrA3, new ejxr() { // from class: ayyt
            @Override // defpackage.ejxr
            public final Object get() {
                return "conversation_type:".concat(String.valueOf(this.a.getString(16)));
            }
        });
        if (!dj(17)) {
            iArr = iArrA3;
            iArrA = null;
        } else if (z) {
            iArr = iArrA3;
            iArrA = dqru.A(null, ds(getString(cO(17, ayzh.a))));
        } else {
            iArr = iArrA3;
            iArrA = new int[]{f()};
        }
        dqqf.dy(length, iArrA, new ejxr() { // from class: ayyu
            @Override // defpackage.ejxr
            public final Object get() {
                return "send_mode:".concat(String.valueOf(this.a.getString(17)));
            }
        });
        if (!dj(18)) {
            iArr2 = iArrA;
            avoeVarArr2 = avoeVarArr;
            strArr4 = null;
        } else if (z) {
            iArr2 = iArrA;
            avoeVarArr2 = avoeVarArr;
            strArr4 = (String[]) dqru.D(null, du(getString(cO(18, ayzh.a))), new String[0]);
        } else {
            iArr2 = iArrA;
            avoeVarArr2 = avoeVarArr;
            strArr4 = new String[]{p()};
        }
        dqqf.dA(length, strArr4, new ejxr() { // from class: ayyv
            @Override // defpackage.ejxr
            public final Object get() {
                return "cms_id:".concat(String.valueOf(this.a.getString(18)));
            }
        });
        if (!dj(19)) {
            strArr5 = strArr4;
            strArr6 = strArr10;
            cigbVarArr2 = cigbVarArr;
            cpyiVarArr = null;
        } else if (z) {
            int[] iArrDs4 = ds(getString(cO(19, ayzh.a)));
            cpyi[] cpyiVarArrValues = cpyi.values();
            strArr5 = strArr4;
            int length6 = cpyiVarArrValues.length;
            cpyi[] cpyiVarArr3 = new cpyi[iArrDs4.length];
            strArr6 = strArr10;
            cigbVarArr2 = cigbVarArr;
            for (int i12 = 0; i12 < iArrDs4.length; i12++) {
                int i13 = iArrDs4[i12];
                if (i13 >= length6) {
                    throw new IllegalStateException();
                }
                cpyiVarArr3[i12] = cpyiVarArrValues[i13];
            }
            cpyiVarArr = (cpyi[]) dqru.D(null, cpyiVarArr3, new cpyi[0]);
        } else {
            strArr5 = strArr4;
            strArr6 = strArr10;
            cigbVarArr2 = cigbVarArr;
            cpyiVarArr = new cpyi[]{o()};
        }
        dqqf.dA(length, cpyiVarArr, new ejxr() { // from class: ayyd
            @Override // defpackage.ejxr
            public final Object get() {
                return "cms_life_cycle:".concat(String.valueOf(this.a.getString(19)));
            }
        });
        ekfw ekfwVar = new ekfw();
        int i14 = 0;
        while (i14 < length) {
            long j = jArr[i14];
            if (j <= 0 || hashSet.contains(Long.valueOf(j))) {
                i = i14;
                i2 = length;
                iArr3 = iArrA2;
                cpyiVarArr2 = cpyiVarArr;
            } else {
                hashSet.add(Long.valueOf(jArr[i14]));
                String[] strArr12 = ayzh.a;
                aywj aywjVar = new aywj();
                aywjVar.aF();
                aywjVar.aD();
                long j2 = jArr[i14];
                if (conversationIdTypeArr2 != null) {
                    ConversationIdType conversationIdType = conversationIdTypeArr2[i14];
                    aywjVar.aE(0);
                    aywjVar.a = conversationIdType;
                }
                if (axcmVarArr != null) {
                    axcm axcmVar = axcmVarArr[i14];
                    int i15 = aywjVar.aB;
                    i = i14;
                    if (i15 < 110) {
                        dqru.x("current_my_identity", i15);
                    }
                    aywjVar.aE(1);
                    aywjVar.b = axcmVar;
                } else {
                    i = i14;
                }
                if (strArr7 != null) {
                    String str = strArr7[i];
                    aywjVar.aE(2);
                    aywjVar.c = str;
                }
                if (bvdkVarArr != null) {
                    bvdk bvdkVar = bvdkVarArr[i];
                    aywjVar.aE(3);
                    aywjVar.d = bvdkVar;
                }
                i2 = length;
                if (jArrC != null) {
                    long j3 = jArrC[i];
                    aywjVar.aE(4);
                    aywjVar.e = j3;
                }
                if (strArr8 != null) {
                    String str2 = strArr8[i];
                    aywjVar.aE(5);
                    aywjVar.f = str2;
                }
                if (strArr9 != null) {
                    String str3 = strArr9[i];
                    aywjVar.aE(6);
                    aywjVar.g = str3;
                }
                if (bvdpVarArr2 != null) {
                    bvdp bvdpVar = bvdpVarArr2[i];
                    aywjVar.aE(7);
                    aywjVar.h = bvdpVar;
                }
                if (zArr != null) {
                    boolean z3 = zArr[i];
                    aywjVar.aE(8);
                    aywjVar.i = z3;
                }
                if (strArr6 != null) {
                    String str4 = strArr6[i];
                    aywjVar.aE(9);
                    aywjVar.j = str4;
                }
                if (strArr != null) {
                    String str5 = strArr[i];
                    aywjVar.aE(10);
                    aywjVar.k = str5;
                }
                if (strArr3 != null) {
                    String str6 = strArr3[i];
                    aywjVar.aE(11);
                    aywjVar.l = str6;
                }
                if (cigbVarArr2 != null) {
                    cigb cigbVar = cigbVarArr2[i];
                    aywjVar.aE(12);
                    aywjVar.m = cigbVar;
                }
                if (avoeVarArr2 != null) {
                    avoe avoeVar = avoeVarArr2[i];
                    aywjVar.aE(13);
                    aywjVar.n = avoeVar;
                }
                iArr3 = iArrA2;
                if (jArrC2 != null) {
                    long j4 = jArrC2[i];
                    aywjVar.aE(14);
                    aywjVar.o = j4;
                }
                if (iArr3 != null) {
                    int i16 = iArr3[i];
                    aywjVar.aE(15);
                    aywjVar.p = i16;
                }
                if (iArr != null) {
                    int i17 = iArr[i];
                    aywjVar.aE(16);
                    aywjVar.q = i17;
                }
                if (iArr2 != null) {
                    int i18 = iArr2[i];
                    aywjVar.aE(17);
                    aywjVar.r = i18;
                }
                if (strArr5 != null) {
                    String str7 = strArr5[i];
                    aywjVar.aE(18);
                    aywjVar.s = str7;
                }
                if (cpyiVarArr != null) {
                    cpyi cpyiVar = cpyiVarArr[i];
                    aywjVar.aE(19);
                    aywjVar.t = cpyiVar;
                }
                aywh aywhVar = new aywh();
                aywhVar.aD(aywjVar.aB());
                aywhVar.a = aywjVar.a;
                aywhVar.b = aywjVar.b;
                aywhVar.c = aywjVar.c;
                aywhVar.d = aywjVar.d;
                cpyiVarArr2 = cpyiVarArr;
                aywhVar.e = aywjVar.e;
                aywhVar.f = aywjVar.f;
                aywhVar.g = aywjVar.g;
                aywhVar.h = aywjVar.h;
                aywhVar.i = aywjVar.i;
                aywhVar.j = aywjVar.j;
                aywhVar.k = aywjVar.k;
                aywhVar.l = aywjVar.l;
                aywhVar.m = aywjVar.m;
                aywhVar.n = aywjVar.n;
                aywhVar.o = aywjVar.o;
                aywhVar.p = aywjVar.p;
                aywhVar.q = aywjVar.q;
                aywhVar.r = aywjVar.r;
                aywhVar.s = aywjVar.s;
                aywhVar.t = aywjVar.t;
                aywhVar.cM = aywjVar.aC();
                ekfwVar.h(aywhVar);
            }
            iArrA2 = iArr3;
            cpyiVarArr = cpyiVarArr2;
            i14 = i + 1;
            length = i2;
        }
        return ekfwVar.g();
    }

    public final long g() {
        return getLong(cO(4, ayzh.a));
    }

    public final long h() {
        return getLong(cO(14, ayzh.a));
    }

    public final avoe i() {
        return avoe.b(getInt(cO(13, ayzh.a)));
    }

    public final axcm j() {
        return axcn.a(getString(cO(1, ayzh.a)));
    }

    public final ConversationIdType k() {
        return new ConversationIdType(getLong(cO(0, ayzh.a)));
    }

    public final bvdk l() {
        return bvdk.a(getInt(cO(3, ayzh.a)));
    }

    public final bvdp m() {
        bvdp[] bvdpVarArrValues = bvdp.values();
        int i = getInt(cO(7, ayzh.a));
        if (i < bvdpVarArrValues.length) {
            return bvdpVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    public final cigb n() {
        return new cigb(getLong(cO(12, ayzh.a)));
    }

    public final cpyi o() {
        cpyi[] cpyiVarArrValues = cpyi.values();
        int i = getInt(cO(19, ayzh.a));
        if (i < cpyiVarArrValues.length) {
            return cpyiVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    public final String p() {
        return getString(cO(18, ayzh.a));
    }

    public final String q() {
        return getString(cO(6, ayzh.a));
    }

    public final String r() {
        return getString(cO(11, ayzh.a));
    }

    public final String s() {
        return getString(cO(10, ayzh.a));
    }

    public final String t() {
        return getString(cO(9, ayzh.a));
    }

    public final String u() {
        return getString(cO(2, ayzh.a));
    }

    public final String v() {
        return getString(cO(5, ayzh.a));
    }

    public final boolean w() {
        return getInt(cO(8, ayzh.a)) == 1;
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
