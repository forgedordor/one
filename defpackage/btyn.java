package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btyn extends dqqf implements btyd {
    @Deprecated
    public btyn(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, btyr btyrVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, btyx.a, dqwjVar, dqtmVar, btyrVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new btxe();
    }

    @Override // defpackage.btyd
    public final ekgb c() {
        ekfw ekfwVar = new ekfw();
        while (moveToNext()) {
            if (i() != null) {
                ekfwVar.h(i());
            }
        }
        return ekfwVar.g();
    }

    @Override // defpackage.btyd
    public final String e() {
        return getString(cO(8, btyx.a));
    }

    public final int f() {
        return getInt(cO(3, btyx.a));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        long[] jArr;
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
        String[] strArr = zDj ? z ? (String[]) dqru.D(null, du(getString(cO(0, btyx.a))), new String[0]) : new String[]{i()} : null;
        dqqf.dA(length, strArr, new ejxr() { // from class: btye
            @Override // defpackage.ejxr
            public final Object get() {
                return "_id:".concat(String.valueOf(this.a.getString(0)));
            }
        });
        String[] strArr2 = dj(1) ? z ? (String[]) dqru.D(null, du(getString(cO(1, btyx.a))), new String[0]) : new String[]{k()} : null;
        dqqf.dA(length, strArr2, new ejxr() { // from class: btyf
            @Override // defpackage.ejxr
            public final Object get() {
                return "phone_number:".concat(String.valueOf(this.a.getString(1)));
            }
        });
        String[] strArr3 = dj(2) ? z ? (String[]) dqru.D(null, du(getString(cO(2, btyx.a))), new String[0]) : new String[]{l()} : null;
        dqqf.dA(length, strArr3, new ejxr() { // from class: btyg
            @Override // defpackage.ejxr
            public final Object get() {
                return "sim_serial_number:".concat(String.valueOf(this.a.getString(2)));
            }
        });
        int[] iArrA = dj(3) ? z ? dqru.A(null, ds(getString(cO(3, btyx.a)))) : new int[]{f()} : null;
        dqqf.dy(length, iArrA, new ejxr() { // from class: btyh
            @Override // defpackage.ejxr
            public final Object get() {
                return "sim_slot_index:".concat(String.valueOf(this.a.getString(3)));
            }
        });
        int[] iArrA2 = dj(4) ? z ? dqru.A(null, ds(getString(cO(4, btyx.a)))) : new int[]{g()} : null;
        dqqf.dy(length, iArrA2, new ejxr() { // from class: btyi
            @Override // defpackage.ejxr
            public final Object get() {
                return "sub_id:".concat(String.valueOf(this.a.getString(4)));
            }
        });
        String[] strArr4 = dj(5) ? z ? (String[]) dqru.D(null, du(getString(cO(5, btyx.a))), new String[0]) : new String[]{m()} : null;
        dqqf.dA(length, strArr4, new ejxr() { // from class: btyj
            @Override // defpackage.ejxr
            public final Object get() {
                return "subscription_name:".concat(String.valueOf(this.a.getString(5)));
            }
        });
        int[] iArrA3 = dj(6) ? z ? dqru.A(null, ds(getString(cO(6, btyx.a)))) : new int[]{h()} : null;
        dqqf.dy(length, iArrA3, new ejxr() { // from class: btyk
            @Override // defpackage.ejxr
            public final Object get() {
                return "subscription_color:".concat(String.valueOf(this.a.getString(6)));
            }
        });
        String[] strArr5 = dj(7) ? z ? (String[]) dqru.D(null, du(getString(cO(7, btyx.a))), new String[0]) : new String[]{j()} : null;
        dqqf.dA(length, strArr5, new ejxr() { // from class: btyl
            @Override // defpackage.ejxr
            public final Object get() {
                return "participant_id:".concat(String.valueOf(this.a.getString(7)));
            }
        });
        String[] strArr6 = dj(8) ? z ? (String[]) dqru.D(null, du(getString(cO(8, btyx.a))), new String[0]) : new String[]{e()} : null;
        dqqf.dA(length, strArr6, new ejxr() { // from class: btym
            @Override // defpackage.ejxr
            public final Object get() {
                return "smsc:".concat(String.valueOf(this.a.getString(8)));
            }
        });
        ekfw ekfwVar = new ekfw();
        int i2 = 0;
        while (i2 < length) {
            long j = jArrDC[i2];
            if (j <= 0 || hashSet.contains(Long.valueOf(j))) {
                jArr = jArrDC;
            } else {
                hashSet.add(Long.valueOf(jArrDC[i2]));
                String[] strArr7 = btyx.a;
                btxi btxiVar = new btxi();
                btxiVar.aF();
                btxiVar.aD();
                long j2 = jArrDC[i2];
                if (strArr != null) {
                    String str = strArr[i2];
                    jArr = jArrDC;
                    btxiVar.aE(0);
                    btxiVar.a = str;
                } else {
                    jArr = jArrDC;
                }
                if (strArr2 != null) {
                    btxiVar.e(strArr2[i2]);
                }
                if (strArr3 != null) {
                    String str2 = strArr3[i2];
                    btxiVar.aE(2);
                    btxiVar.c = str2;
                }
                if (iArrA != null) {
                    btxiVar.f(iArrA[i2]);
                }
                if (iArrA2 != null) {
                    btxiVar.h(iArrA2[i2]);
                }
                if (strArr4 != null) {
                    btxiVar.j(strArr4[i2]);
                }
                if (iArrA3 != null) {
                    btxiVar.i(iArrA3[i2]);
                }
                if (strArr5 != null) {
                    btxiVar.d(strArr5[i2]);
                }
                if (strArr6 != null) {
                    btxiVar.g(strArr6[i2]);
                }
                ekfwVar.h(btxiVar.a());
            }
            i2++;
            jArrDC = jArr;
        }
        return ekfwVar.g();
    }

    public final int g() {
        return getInt(cO(4, btyx.a));
    }

    public final int h() {
        return getInt(cO(6, btyx.a));
    }

    public final String i() {
        return getString(cO(0, btyx.a));
    }

    public final String j() {
        return getString(cO(7, btyx.a));
    }

    public final String k() {
        return getString(cO(1, btyx.a));
    }

    public final String l() {
        return getString(cO(2, btyx.a));
    }

    public final String m() {
        return getString(cO(5, btyx.a));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
