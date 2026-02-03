package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bsvv extends dqqf implements bsvo {
    @Deprecated
    public bsvv(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, bswb bswbVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, bswf.a, dqwjVar, dqtmVar, bswbVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new bsuw();
    }

    public final avbl c() {
        avbl[] avblVarArrValues = avbl.values();
        int i = getInt(cO(2, bswf.a));
        if (i < avblVarArrValues.length) {
            return avblVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    public final String e() {
        return getString(cO(3, bswf.a));
    }

    public final String f() {
        return getString(cO(0, bswf.a));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        avbl[] avblVarArr;
        dqwl dqwlVar = dqthVar.a;
        long[] jArrDC = dC(getString(dqthVar.h + 1));
        int length = jArrDC.length;
        if (length == 0 || (length == 1 && jArrDC[0] == -1)) {
            int i = ekgb.d;
            return ekoe.a;
        }
        HashSet hashSet = new HashSet();
        dqtm dqtmVar = this.d;
        boolean zDj = dj(0);
        boolean z = dqtmVar.b;
        String[] strArr = zDj ? z ? (String[]) dqru.D(null, du(getString(cO(0, bswf.a))), new String[0]) : new String[]{f()} : null;
        dqqf.dA(length, strArr, new ejxr() { // from class: bsvp
            @Override // defpackage.ejxr
            public final Object get() {
                return "_id:".concat(String.valueOf(this.a.getString(0)));
            }
        });
        String[] strArr2 = dj(1) ? z ? (String[]) dqru.D(null, du(getString(cO(1, bswf.a))), new String[0]) : new String[]{h()} : null;
        dqqf.dA(length, strArr2, new ejxr() { // from class: bsvq
            @Override // defpackage.ejxr
            public final Object get() {
                return "rbm_bot_id:".concat(String.valueOf(this.a.getString(1)));
            }
        });
        if (!dj(2)) {
            avblVarArr = null;
        } else if (z) {
            int[] iArrDs = ds(getString(cO(2, bswf.a)));
            avbl[] avblVarArrValues = avbl.values();
            int length2 = avblVarArrValues.length;
            avbl[] avblVarArr2 = new avbl[iArrDs.length];
            for (int i2 = 0; i2 < iArrDs.length; i2++) {
                int i3 = iArrDs[i2];
                if (i3 >= length2) {
                    throw new IllegalStateException();
                }
                avblVarArr2[i2] = avblVarArrValues[i3];
            }
            avblVarArr = (avbl[]) dqru.D(null, avblVarArr2, new avbl[0]);
        } else {
            avblVarArr = new avbl[]{c()};
        }
        dqqf.dA(length, avblVarArr, new ejxr() { // from class: bsvr
            @Override // defpackage.ejxr
            public final Object get() {
                return "type:".concat(String.valueOf(this.a.getString(2)));
            }
        });
        String[] strArr3 = dj(3) ? z ? (String[]) dqru.D(null, du(getString(cO(3, bswf.a))), new String[0]) : new String[]{e()} : null;
        dqqf.dA(length, strArr3, new ejxr() { // from class: bsvs
            @Override // defpackage.ejxr
            public final Object get() {
                return "header:".concat(String.valueOf(this.a.getString(3)));
            }
        });
        String[] strArr4 = dj(4) ? z ? (String[]) dqru.D(null, du(getString(cO(4, bswf.a))), new String[0]) : new String[]{i()} : null;
        dqqf.dA(length, strArr4, new ejxr() { // from class: bsvt
            @Override // defpackage.ejxr
            public final Object get() {
                return "subheader:".concat(String.valueOf(this.a.getString(4)));
            }
        });
        String[] strArr5 = dj(5) ? z ? (String[]) dqru.D(null, du(getString(cO(5, bswf.a))), new String[0]) : new String[]{g()} : null;
        dqqf.dA(length, strArr5, new ejxr() { // from class: bsvu
            @Override // defpackage.ejxr
            public final Object get() {
                return "property_value:".concat(String.valueOf(this.a.getString(5)));
            }
        });
        ekfw ekfwVar = new ekfw();
        for (int i4 = 0; i4 < length; i4++) {
            long j = jArrDC[i4];
            if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                hashSet.add(Long.valueOf(jArrDC[i4]));
                String[] strArr6 = bswf.a;
                bsuy bsuyVar = new bsuy();
                bsuyVar.aF();
                bsuyVar.aD();
                long j2 = jArrDC[i4];
                if (strArr != null) {
                    String str = strArr[i4];
                    bsuyVar.aE(0);
                    bsuyVar.a = str;
                }
                if (strArr2 != null) {
                    bsuyVar.d(strArr2[i4]);
                }
                if (avblVarArr != null) {
                    bsuyVar.f(avblVarArr[i4]);
                }
                if (strArr3 != null) {
                    bsuyVar.b(strArr3[i4]);
                }
                if (strArr4 != null) {
                    bsuyVar.e(strArr4[i4]);
                }
                if (strArr5 != null) {
                    bsuyVar.c(strArr5[i4]);
                }
                ekfwVar.h(bsuyVar.a());
            }
        }
        return ekfwVar.g();
    }

    public final String g() {
        return getString(cO(5, bswf.a));
    }

    public final String h() {
        return getString(cO(1, bswf.a));
    }

    public final String i() {
        return getString(cO(4, bswf.a));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
