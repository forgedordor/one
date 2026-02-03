package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bpwx extends dqqf implements bpwk {
    @Deprecated
    public bpwx(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, bpxd bpxdVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, bpxj.a, dqwjVar, dqtmVar, bpxdVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new bpve();
    }

    public final long c() {
        return getLong(cO(3, bpxj.a));
    }

    public final long e() {
        return getLong(cO(0, bpxj.a));
    }

    public final MessageIdType f() {
        return new MessageIdType(getLong(cO(1, bpxj.a)));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        MessageIdType[] messageIdTypeArr;
        String[] strArr;
        String[] strArr2;
        int i;
        String[] strArr3;
        boolean[] zArrE;
        long[] jArr;
        boolean[] zArrE2;
        boolean[] zArrE3;
        int i2;
        boolean[] zArr;
        String[] strArr4;
        int i3;
        int i4;
        dqwl dqwlVar = dqthVar.a;
        long[] jArrDC = dC(getString(dqthVar.h + 1));
        int length = jArrDC.length;
        if (length == 0 || (length == 1 && jArrDC[0] == -1)) {
            int i5 = ekgb.d;
            return ekoe.a;
        }
        HashSet hashSet = new HashSet();
        dqtm dqtmVar = this.d;
        boolean zDj = dj(0);
        boolean z = dqtmVar.b;
        long[] jArrC = zDj ? z ? dqru.C(null, dt(getString(cO(0, bpxj.a)))) : new long[]{e()} : null;
        dqqf.dz(length, jArrC, new ejxr() { // from class: bpwl
            @Override // defpackage.ejxr
            public final Object get() {
                return "_id:".concat(String.valueOf(this.a.getString(0)));
            }
        });
        if (!dj(1)) {
            messageIdTypeArr = null;
        } else if (z) {
            long[] jArrDt = dt(getString(cO(1, bpxj.a)));
            int length2 = jArrDt.length;
            MessageIdType[] messageIdTypeArr2 = new MessageIdType[length2];
            for (int i6 = 0; i6 < length2; i6++) {
                messageIdTypeArr2[i6] = new MessageIdType(jArrDt[i6]);
            }
            messageIdTypeArr = (MessageIdType[]) dqru.D(null, messageIdTypeArr2, new MessageIdType[0]);
        } else {
            messageIdTypeArr = new MessageIdType[]{f()};
        }
        dqqf.dA(length, messageIdTypeArr, new ejxr() { // from class: bpwq
            @Override // defpackage.ejxr
            public final Object get() {
                return "message_id:".concat(String.valueOf(this.a.getString(1)));
            }
        });
        String[] strArr5 = dj(2) ? z ? (String[]) dqru.D(null, du(getString(cO(2, bpxj.a))), new String[0]) : new String[]{l()} : null;
        dqqf.dA(length, strArr5, new ejxr() { // from class: bpwr
            @Override // defpackage.ejxr
            public final Object get() {
                return "trigger_url:".concat(String.valueOf(this.a.getString(2)));
            }
        });
        long[] jArrC2 = dj(3) ? z ? dqru.C(null, dt(getString(cO(3, bpxj.a)))) : new long[]{c()} : null;
        dqqf.dz(length, jArrC2, new ejxr() { // from class: bpws
            @Override // defpackage.ejxr
            public final Object get() {
                return "expiration_time_millis:".concat(String.valueOf(this.a.getString(3)));
            }
        });
        if (!dj(4)) {
            strArr = null;
        } else if (z) {
            String[] strArrDu = du(getString(cO(4, bpxj.a)));
            for (int i7 = 0; i7 < strArrDu.length; i7++) {
                strArrDu[i7] = cssq.a(strArrDu[i7]);
            }
            strArr = (String[]) dqru.D(null, strArrDu, new String[0]);
        } else {
            strArr = new String[]{k()};
        }
        dqqf.dA(length, strArr, new ejxr() { // from class: bpwt
            @Override // defpackage.ejxr
            public final Object get() {
                return "link_title:".concat(String.valueOf(this.a.getString(4)));
            }
        });
        if (!dj(5)) {
            strArr2 = null;
        } else if (z) {
            String[] strArrDu2 = du(getString(cO(5, bpxj.a)));
            for (int i8 = 0; i8 < strArrDu2.length; i8++) {
                strArrDu2[i8] = cssq.a(strArrDu2[i8]);
            }
            strArr2 = (String[]) dqru.D(null, strArrDu2, new String[0]);
        } else {
            strArr2 = new String[]{h()};
        }
        dqqf.dA(length, strArr2, new ejxr() { // from class: bpwu
            @Override // defpackage.ejxr
            public final Object get() {
                return "link_description:".concat(String.valueOf(this.a.getString(5)));
            }
        });
        String[] strArr6 = dj(6) ? z ? (String[]) dqru.D(null, du(getString(cO(6, bpxj.a))), new String[0]) : new String[]{j()} : null;
        dqqf.dA(length, strArr6, new ejxr() { // from class: bpwv
            @Override // defpackage.ejxr
            public final Object get() {
                return "link_image_url:".concat(String.valueOf(this.a.getString(6)));
            }
        });
        String[] strArr7 = dj(7) ? z ? (String[]) dqru.D(null, du(getString(cO(7, bpxj.a))), new String[0]) : new String[]{i()} : null;
        dqqf.dA(length, strArr7, new ejxr() { // from class: bpww
            @Override // defpackage.ejxr
            public final Object get() {
                return "link_domain:".concat(String.valueOf(this.a.getString(7)));
            }
        });
        if (!dj(8)) {
            i = 0;
            strArr3 = null;
        } else if (z) {
            i = 0;
            strArr3 = (String[]) dqru.D(null, du(getString(cO(8, bpxj.a))), new String[0]);
        } else {
            i = 0;
            strArr3 = new String[]{g()};
        }
        dqqf.dA(length, strArr3, new ejxr() { // from class: bpwm
            @Override // defpackage.ejxr
            public final Object get() {
                return "link_canonical_url:".concat(String.valueOf(this.a.getString(8)));
            }
        });
        if (!dj(9)) {
            zArrE = null;
        } else if (z) {
            zArrE = dqru.E(null, dv(getString(cO(9, bpxj.a))));
        } else {
            zArrE = new boolean[1];
            zArrE[i] = o();
        }
        dqqf.dB(length, zArrE, new ejxr() { // from class: bpwn
            @Override // defpackage.ejxr
            public final Object get() {
                return "link_preview_prevented:".concat(String.valueOf(this.a.getString(9)));
            }
        });
        if (!dj(10)) {
            jArr = jArrDC;
            zArrE2 = null;
        } else if (z) {
            jArr = jArrDC;
            zArrE2 = dqru.E(null, dv(getString(cO(10, bpxj.a))));
        } else {
            jArr = jArrDC;
            zArrE2 = new boolean[1];
            zArrE2[i] = n();
        }
        dqqf.dB(length, zArrE2, new ejxr() { // from class: bpwo
            @Override // defpackage.ejxr
            public final Object get() {
                return "link_preview_failed:".concat(String.valueOf(this.a.getString(10)));
            }
        });
        if (!dj(11)) {
            zArrE3 = null;
        } else if (z) {
            zArrE3 = dqru.E(null, dv(getString(cO(11, bpxj.a))));
        } else {
            zArrE3 = new boolean[1];
            zArrE3[i] = m();
        }
        dqqf.dB(length, zArrE3, new ejxr() { // from class: bpwp
            @Override // defpackage.ejxr
            public final Object get() {
                return "deferred:".concat(String.valueOf(this.a.getString(11)));
            }
        });
        ekfw ekfwVar = new ekfw();
        int i9 = i;
        while (i9 < length) {
            long j = jArr[i9];
            if (j > 0) {
                i2 = i9;
                if (!hashSet.contains(Long.valueOf(j))) {
                    hashSet.add(Long.valueOf(jArr[i2]));
                    bpvh bpvhVarA = bpxj.a();
                    bpvhVarA.aD();
                    long j2 = jArr[i2];
                    zArr = zArrE2;
                    strArr4 = strArr7;
                    if (jArrC != null) {
                        long j3 = jArrC[i2];
                        i3 = length;
                        i4 = i;
                        bpvhVarA.aE(i4);
                        bpvhVarA.a = j3;
                    } else {
                        i3 = length;
                        i4 = i;
                    }
                    if (messageIdTypeArr != null) {
                        bpvhVarA.n(messageIdTypeArr[i2]);
                    }
                    if (strArr5 != null) {
                        bpvhVarA.o(strArr5[i2]);
                    }
                    if (jArrC2 != null) {
                        bpvhVarA.f(jArrC2[i2]);
                    }
                    if (strArr != null) {
                        bpvhVarA.m(strArr[i2]);
                    }
                    if (strArr2 != null) {
                        bpvhVarA.h(strArr2[i2]);
                    }
                    if (strArr6 != null) {
                        bpvhVarA.j(strArr6[i2]);
                    }
                    if (strArr4 != null) {
                        bpvhVarA.i(strArr4[i2]);
                    }
                    if (strArr3 != null) {
                        bpvhVarA.g(strArr3[i2]);
                    }
                    if (zArrE != null) {
                        bpvhVarA.l(zArrE[i2]);
                    }
                    if (zArr != null) {
                        bpvhVarA.k(zArr[i2]);
                    }
                    if (zArrE3 != null) {
                        bpvhVarA.e(zArrE3[i2]);
                    }
                    ekfwVar.h(bpvhVarA.a());
                }
                i9 = i2 + 1;
                i = i4;
                strArr7 = strArr4;
                zArrE2 = zArr;
                length = i3;
            } else {
                i2 = i9;
            }
            zArr = zArrE2;
            strArr4 = strArr7;
            i3 = length;
            i4 = i;
            i9 = i2 + 1;
            i = i4;
            strArr7 = strArr4;
            zArrE2 = zArr;
            length = i3;
        }
        return ekfwVar.g();
    }

    public final String g() {
        return getString(cO(8, bpxj.a));
    }

    public final String h() {
        return cssq.a(getString(cO(5, bpxj.a)));
    }

    public final String i() {
        return getString(cO(7, bpxj.a));
    }

    public final String j() {
        return getString(cO(6, bpxj.a));
    }

    public final String k() {
        return cssq.a(getString(cO(4, bpxj.a)));
    }

    public final String l() {
        return getString(cO(2, bpxj.a));
    }

    public final boolean m() {
        return getInt(cO(11, bpxj.a)) == 1;
    }

    public final boolean n() {
        return getInt(cO(10, bpxj.a)) == 1;
    }

    public final boolean o() {
        return getInt(cO(9, bpxj.a)) == 1;
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
