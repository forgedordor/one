package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bofe extends dqqf implements boet {
    @Deprecated
    public bofe(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, bofl boflVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, bofr.a, dqwjVar, dqtmVar, boflVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new bodt();
    }

    public final int c() {
        return getInt(cO(2, bofr.a));
    }

    public final long e() {
        return getLong(cO(0, bofr.a));
    }

    public final long f() {
        return getLong(cO(9, bofr.a));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        MessageIdType[] messageIdTypeArr;
        basd[] basdVarArr;
        basd[] basdVarArr2;
        long[] jArr;
        basd[] basdVarArr3;
        int i;
        dqwl dqwlVar = dqthVar.a;
        long[] jArrDC = dC(getString(dqthVar.h + 1));
        int length = jArrDC.length;
        if (length != 0) {
            if (length != 1 || jArrDC[0] != -1) {
                HashSet hashSet = new HashSet();
                dqtm dqtmVar = this.d;
                boolean zDj = dj(0);
                boolean z = dqtmVar.b;
                long[] jArrC = zDj ? z ? dqru.C(null, dt(getString(cO(0, bofr.a)))) : new long[]{e()} : null;
                dqqf.dz(length, jArrC, new ejxr() { // from class: boeu
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "_id:".concat(String.valueOf(this.a.getString(0)));
                    }
                });
                if (!dj(1)) {
                    messageIdTypeArr = null;
                } else if (z) {
                    long[] jArrDt = dt(getString(cO(1, bofr.a)));
                    int length2 = jArrDt.length;
                    MessageIdType[] messageIdTypeArr2 = new MessageIdType[length2];
                    for (int i2 = 0; i2 < length2; i2++) {
                        messageIdTypeArr2[i2] = new MessageIdType(jArrDt[i2]);
                    }
                    messageIdTypeArr = (MessageIdType[]) dqru.D(null, messageIdTypeArr2, new MessageIdType[0]);
                } else {
                    messageIdTypeArr = new MessageIdType[]{g()};
                }
                dqqf.dA(length, messageIdTypeArr, new ejxr() { // from class: boev
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "message_id:".concat(String.valueOf(this.a.getString(1)));
                    }
                });
                int[] iArrA = dj(2) ? z ? dqru.A(null, ds(getString(cO(2, bofr.a)))) : new int[]{c()} : null;
                dqqf.dy(length, iArrA, new ejxr() { // from class: boew
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "conversation_suggestion_type:".concat(String.valueOf(this.a.getString(2)));
                    }
                });
                String[] strArr = dj(3) ? z ? (String[]) dqru.D(null, du(getString(cO(3, bofr.a))), new String[0]) : new String[]{l()} : null;
                dqqf.dA(length, strArr, new ejxr() { // from class: boex
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "properties:".concat(String.valueOf(this.a.getString(3)));
                    }
                });
                String[] strArr2 = dj(4) ? z ? (String[]) dqru.D(null, du(getString(cO(4, bofr.a))), new String[0]) : new String[]{j()} : null;
                dqqf.dA(length, strArr2, new ejxr() { // from class: boey
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "post_back_data:".concat(String.valueOf(this.a.getString(4)));
                    }
                });
                String[] strArr3 = dj(5) ? z ? (String[]) dqru.D(null, du(getString(cO(5, bofr.a))), new String[0]) : new String[]{k()} : null;
                dqqf.dA(length, strArr3, new ejxr() { // from class: boez
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "post_back_encoding:".concat(String.valueOf(this.a.getString(5)));
                    }
                });
                if (!dj(6)) {
                    basdVarArr = null;
                } else if (z) {
                    String[] strArrDu = du(getString(cO(6, bofr.a)));
                    int length3 = strArrDu.length;
                    basd[] basdVarArr4 = new basd[length3];
                    for (int i3 = 0; i3 < length3; i3++) {
                        basdVarArr4[i3] = basd.a(strArrDu[i3]);
                    }
                    basdVarArr = (basd[]) dqru.D(null, basdVarArr4, new basd[0]);
                } else {
                    basdVarArr = new basd[]{h()};
                }
                dqqf.dA(length, basdVarArr, new ejxr() { // from class: bofa
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "rcs_message_id:".concat(String.valueOf(this.a.getString(6)));
                    }
                });
                if (!dj(7)) {
                    basdVarArr2 = null;
                } else if (z) {
                    String[] strArrDu2 = du(getString(cO(7, bofr.a)));
                    int length4 = strArrDu2.length;
                    basd[] basdVarArr5 = new basd[length4];
                    for (int i4 = 0; i4 < length4; i4++) {
                        basdVarArr5[i4] = basd.a(strArrDu2[i4]);
                    }
                    basdVarArr2 = (basd[]) dqru.D(null, basdVarArr5, new basd[0]);
                } else {
                    basdVarArr2 = new basd[]{i()};
                }
                dqqf.dA(length, basdVarArr2, new ejxr() { // from class: bofb
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "target_rcs_message_id:".concat(String.valueOf(this.a.getString(7)));
                    }
                });
                boolean[] zArrE = dj(8) ? z ? dqru.E(null, dv(getString(cO(8, bofr.a)))) : new boolean[]{m()} : null;
                dqqf.dB(length, zArrE, new ejxr() { // from class: bofc
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "read:".concat(String.valueOf(this.a.getString(8)));
                    }
                });
                long[] jArrC2 = dj(9) ? z ? dqru.C(null, dt(getString(cO(9, bofr.a)))) : new long[]{f()} : null;
                dqqf.dz(length, jArrC2, new ejxr() { // from class: bofd
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "received_timestamp:".concat(String.valueOf(this.a.getString(9)));
                    }
                });
                ekfw ekfwVar = new ekfw();
                int i5 = 0;
                while (i5 < length) {
                    long j = jArrDC[i5];
                    if (j <= 0 || hashSet.contains(Long.valueOf(j))) {
                        jArr = jArrDC;
                        basdVarArr3 = basdVarArr2;
                        i = length;
                    } else {
                        hashSet.add(Long.valueOf(jArrDC[i5]));
                        String[] strArr4 = bofr.a;
                        bodv bodvVar = new bodv();
                        bodvVar.aF();
                        bodvVar.aD();
                        long j2 = jArrDC[i5];
                        jArr = jArrDC;
                        basdVarArr3 = basdVarArr2;
                        if (jArrC != null) {
                            long j3 = jArrC[i5];
                            i = length;
                            bodvVar.aE(0);
                            bodvVar.a = j3;
                        } else {
                            i = length;
                        }
                        if (messageIdTypeArr != null) {
                            bodvVar.i(messageIdTypeArr[i5]);
                        }
                        if (iArrA != null) {
                            bodvVar.b(iArrA[i5]);
                        }
                        if (strArr != null) {
                            bodvVar.e(strArr[i5]);
                        }
                        if (strArr2 != null) {
                            bodvVar.c(strArr2[i5]);
                        }
                        if (strArr3 != null) {
                            bodvVar.d(strArr3[i5]);
                        }
                        if (basdVarArr != null) {
                            bodvVar.f(basdVarArr[i5]);
                        }
                        if (basdVarArr3 != null) {
                            bodvVar.j(basdVarArr3[i5]);
                        }
                        if (zArrE != null) {
                            bodvVar.g(zArrE[i5]);
                        }
                        if (jArrC2 != null) {
                            bodvVar.h(jArrC2[i5]);
                        }
                        ekfwVar.h(bodvVar.a());
                    }
                    i5++;
                    jArrDC = jArr;
                    basdVarArr2 = basdVarArr3;
                    length = i;
                }
                return ekfwVar.g();
            }
        }
        int i6 = ekgb.d;
        return ekoe.a;
    }

    public final MessageIdType g() {
        return new MessageIdType(getLong(cO(1, bofr.a)));
    }

    public final basd h() {
        return basd.a(getString(cO(6, bofr.a)));
    }

    public final basd i() {
        return basd.a(getString(cO(7, bofr.a)));
    }

    public final String j() {
        return getString(cO(4, bofr.a));
    }

    public final String k() {
        return getString(cO(5, bofr.a));
    }

    public final String l() {
        return getString(cO(3, bofr.a));
    }

    public final boolean m() {
        return getInt(cO(8, bofr.a)) == 1;
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
