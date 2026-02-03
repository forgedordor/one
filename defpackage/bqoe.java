package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.HashSet;
import java.util.UUID;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqoe extends dqqf implements bqnq {
    @Deprecated
    public bqoe(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, bqoj bqojVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, bqoo.a, dqwjVar, dqtmVar, bqojVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new bqmi();
    }

    @Override // defpackage.bqnq
    public final ekgb c() {
        ekfw ekfwVar = new ekfw();
        while (moveToNext()) {
            if (q() != null) {
                ekfwVar.h(q());
            }
        }
        return ekfwVar.g();
    }

    public final long e() {
        return getLong(cO(3, bqoo.a));
    }

    public final long f() {
        return getLong(cO(2, bqoo.a));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        UUID[] uuidArr;
        MessageIdType[] messageIdTypeArr;
        bvea[] bveaVarArr;
        int i;
        String[] strArr;
        long[] jArr;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        String[] strArr5;
        String[] strArr6;
        int i2;
        String[] strArr7;
        String[] strArr8;
        String[] strArr9;
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
        boolean z = dqtmVar.b;
        if (!zDj) {
            uuidArr = null;
        } else if (z) {
            String[] strArrDu = du(getString(cO(0, bqoo.a)));
            int length2 = strArrDu.length;
            UUID[] uuidArr2 = new UUID[length2];
            for (int i4 = 0; i4 < length2; i4++) {
                uuidArr2[i4] = UUID.fromString(strArrDu[i4]);
            }
            uuidArr = (UUID[]) dqru.D(null, uuidArr2, new UUID[0]);
        } else {
            uuidArr = new UUID[]{q()};
        }
        dqqf.dA(length, uuidArr, new ejxr() { // from class: bqnr
            @Override // defpackage.ejxr
            public final Object get() {
                return "_id:".concat(String.valueOf(this.a.getString(0)));
            }
        });
        if (!dj(1)) {
            messageIdTypeArr = null;
        } else if (z) {
            long[] jArrDt = dt(getString(cO(1, bqoo.a)));
            int length3 = jArrDt.length;
            MessageIdType[] messageIdTypeArr2 = new MessageIdType[length3];
            for (int i5 = 0; i5 < length3; i5++) {
                messageIdTypeArr2[i5] = new MessageIdType(jArrDt[i5]);
            }
            messageIdTypeArr = (MessageIdType[]) dqru.D(null, messageIdTypeArr2, new MessageIdType[0]);
        } else {
            messageIdTypeArr = new MessageIdType[]{g()};
        }
        dqqf.dA(length, messageIdTypeArr, new ejxr() { // from class: bqny
            @Override // defpackage.ejxr
            public final Object get() {
                return "message_id:".concat(String.valueOf(this.a.getString(1)));
            }
        });
        long[] jArrC = dj(2) ? z ? dqru.C(null, dt(getString(cO(2, bqoo.a)))) : new long[]{f()} : null;
        dqqf.dz(length, jArrC, new ejxr() { // from class: bqnz
            @Override // defpackage.ejxr
            public final Object get() {
                return "timestamp:".concat(String.valueOf(this.a.getString(2)));
            }
        });
        long[] jArrC2 = dj(3) ? z ? dqru.C(null, dt(getString(cO(3, bqoo.a)))) : new long[]{e()} : null;
        dqqf.dz(length, jArrC2, new ejxr() { // from class: bqoa
            @Override // defpackage.ejxr
            public final Object get() {
                return "message_sending_attempt:".concat(String.valueOf(this.a.getString(3)));
            }
        });
        if (!dj(4)) {
            bveaVarArr = null;
        } else if (z) {
            int[] iArrDs = ds(getString(cO(4, bqoo.a)));
            bvea[] bveaVarArrValues = bvea.values();
            int length4 = bveaVarArrValues.length;
            bvea[] bveaVarArr2 = new bvea[iArrDs.length];
            for (int i6 = 0; i6 < iArrDs.length; i6++) {
                int i7 = iArrDs[i6];
                if (i7 >= length4) {
                    throw new IllegalStateException();
                }
                bveaVarArr2[i6] = bveaVarArrValues[i7];
            }
            bveaVarArr = (bvea[]) dqru.D(null, bveaVarArr2, new bvea[0]);
        } else {
            bveaVarArr = new bvea[]{h()};
        }
        dqqf.dA(length, bveaVarArr, new ejxr() { // from class: bqob
            @Override // defpackage.ejxr
            public final Object get() {
                return "message_protocol:".concat(String.valueOf(this.a.getString(4)));
            }
        });
        String[] strArr10 = dj(5) ? z ? (String[]) dqru.D(null, du(getString(cO(5, bqoo.a))), new String[0]) : new String[]{k()} : null;
        dqqf.dA(length, strArr10, new ejxr() { // from class: bqoc
            @Override // defpackage.ejxr
            public final Object get() {
                return "current_sim_network_country:".concat(String.valueOf(this.a.getString(5)));
            }
        });
        String[] strArr11 = dj(6) ? z ? (String[]) dqru.D(null, du(getString(cO(6, bqoo.a))), new String[0]) : new String[]{j()} : null;
        dqqf.dA(length, strArr11, new ejxr() { // from class: bqod
            @Override // defpackage.ejxr
            public final Object get() {
                return "current_sim_country:".concat(String.valueOf(this.a.getString(6)));
            }
        });
        String[] strArr12 = dj(7) ? z ? (String[]) dqru.D(null, du(getString(cO(7, bqoo.a))), new String[0]) : new String[]{i()} : null;
        dqqf.dA(length, strArr12, new ejxr() { // from class: bqns
            @Override // defpackage.ejxr
            public final Object get() {
                return "current_sim_carrier_country:".concat(String.valueOf(this.a.getString(7)));
            }
        });
        if (!dj(8)) {
            i = 0;
            strArr = null;
        } else if (z) {
            i = 0;
            strArr = (String[]) dqru.D(null, du(getString(cO(8, bqoo.a))), new String[0]);
        } else {
            i = 0;
            strArr = new String[]{p()};
        }
        dqqf.dA(length, strArr, new ejxr() { // from class: bqnt
            @Override // defpackage.ejxr
            public final Object get() {
                return "settings_country:".concat(String.valueOf(this.a.getString(8)));
            }
        });
        if (!dj(9)) {
            jArr = jArrDC;
            strArr2 = null;
        } else if (z) {
            jArr = jArrDC;
            strArr2 = (String[]) dqru.D(null, du(getString(cO(9, bqoo.a))), new String[i]);
        } else {
            jArr = jArrDC;
            strArr2 = new String[1];
            strArr2[i] = m();
        }
        dqqf.dA(length, strArr2, new ejxr() { // from class: bqnu
            @Override // defpackage.ejxr
            public final Object get() {
                return "default_sms_sim_country:".concat(String.valueOf(this.a.getString(9)));
            }
        });
        if (!dj(10)) {
            strArr3 = strArr2;
            strArr4 = null;
        } else if (z) {
            strArr3 = strArr2;
            strArr4 = (String[]) dqru.D(null, du(getString(cO(10, bqoo.a))), new String[0]);
        } else {
            strArr3 = strArr2;
            strArr4 = new String[]{o()};
        }
        dqqf.dA(length, strArr4, new ejxr() { // from class: bqnv
            @Override // defpackage.ejxr
            public final Object get() {
                return "locale_country:".concat(String.valueOf(this.a.getString(10)));
            }
        });
        if (!dj(11)) {
            strArr5 = strArr4;
            strArr6 = null;
        } else if (z) {
            strArr5 = strArr4;
            strArr6 = (String[]) dqru.D(null, du(getString(cO(11, bqoo.a))), new String[0]);
        } else {
            strArr5 = strArr4;
            strArr6 = new String[]{n()};
        }
        dqqf.dA(length, strArr6, new ejxr() { // from class: bqnw
            @Override // defpackage.ejxr
            public final Object get() {
                return "default_sms_sim_network_country:".concat(String.valueOf(this.a.getString(11)));
            }
        });
        if (!dj(12)) {
            i2 = 0;
            strArr7 = null;
        } else if (z) {
            i2 = 0;
            strArr7 = (String[]) dqru.D(null, du(getString(cO(12, bqoo.a))), new String[0]);
        } else {
            i2 = 0;
            strArr7 = new String[]{l()};
        }
        dqqf.dA(length, strArr7, new ejxr() { // from class: bqnx
            @Override // defpackage.ejxr
            public final Object get() {
                return "default_sms_sim_carrier_country:".concat(String.valueOf(this.a.getString(12)));
            }
        });
        ekfw ekfwVar = new ekfw();
        int i8 = i2;
        while (i8 < length) {
            long j = jArr[i8];
            if (j <= 0 || hashSet.contains(Long.valueOf(j))) {
                strArr8 = strArr6;
                strArr9 = strArr10;
            } else {
                hashSet.add(Long.valueOf(jArr[i8]));
                String[] strArr13 = bqoo.a;
                bqmm bqmmVar = new bqmm();
                bqmmVar.aF();
                bqmmVar.aD();
                long j2 = jArr[i8];
                strArr8 = strArr6;
                if (uuidArr != null) {
                    bqmmVar.h(uuidArr[i8]);
                }
                if (messageIdTypeArr != null) {
                    bqmmVar.j(messageIdTypeArr[i8]);
                }
                strArr9 = strArr10;
                if (jArrC != null) {
                    bqmmVar.m(jArrC[i8]);
                }
                if (jArrC2 != null) {
                    bqmmVar.k(jArrC2[i8]);
                }
                if (bveaVarArr != null) {
                    bqmmVar.n(bveaVarArr[i8]);
                }
                if (strArr9 != null) {
                    bqmmVar.d(strArr9[i8]);
                }
                if (strArr11 != null) {
                    bqmmVar.c(strArr11[i8]);
                }
                if (strArr12 != null) {
                    bqmmVar.b(strArr12[i8]);
                }
                if (strArr != null) {
                    bqmmVar.l(strArr[i8]);
                }
                if (strArr3 != null) {
                    bqmmVar.f(strArr3[i8]);
                }
                if (strArr5 != null) {
                    bqmmVar.i(strArr5[i8]);
                }
                if (strArr8 != null) {
                    bqmmVar.g(strArr8[i8]);
                }
                if (strArr7 != null) {
                    bqmmVar.e(strArr7[i8]);
                }
                ekfwVar.h(bqmmVar.a(new Supplier() { // from class: bqmj
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return new bqmi();
                    }
                }));
            }
            i8++;
            strArr6 = strArr8;
            strArr10 = strArr9;
        }
        return ekfwVar.g();
    }

    public final MessageIdType g() {
        return new MessageIdType(getLong(cO(1, bqoo.a)));
    }

    public final bvea h() {
        bvea[] bveaVarArrValues = bvea.values();
        int i = getInt(cO(4, bqoo.a));
        if (i < bveaVarArrValues.length) {
            return bveaVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    public final String i() {
        return getString(cO(7, bqoo.a));
    }

    public final String j() {
        return getString(cO(6, bqoo.a));
    }

    public final String k() {
        return getString(cO(5, bqoo.a));
    }

    public final String l() {
        return getString(cO(12, bqoo.a));
    }

    public final String m() {
        return getString(cO(9, bqoo.a));
    }

    public final String n() {
        return getString(cO(11, bqoo.a));
    }

    public final String o() {
        return getString(cO(10, bqoo.a));
    }

    public final String p() {
        return getString(cO(8, bqoo.a));
    }

    public final UUID q() {
        return UUID.fromString(getString(cO(0, bqoo.a)));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
