package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azau extends dqqf implements azak {
    @Deprecated
    public azau(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, azba azbaVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, azbe.a, dqwjVar, dqtmVar, azbaVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new ayzm();
    }

    public final long c() {
        return getLong(cO(3, azbe.a));
    }

    public final long e() {
        return getLong(cO(0, azbe.a));
    }

    public final MessageIdType f() {
        return new MessageIdType(getLong(cO(1, azbe.a)));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        MessageIdType[] messageIdTypeArr;
        long[] jArr;
        String[] strArr;
        int i;
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
        long[] jArrC = zDj ? z ? dqru.C(null, dt(getString(cO(0, azbe.a)))) : new long[]{e()} : null;
        dqqf.dz(length, jArrC, new ejxr() { // from class: azal
            @Override // defpackage.ejxr
            public final Object get() {
                return "_id:".concat(String.valueOf(this.a.getString(0)));
            }
        });
        if (!dj(1)) {
            messageIdTypeArr = null;
        } else if (z) {
            long[] jArrDt = dt(getString(cO(1, azbe.a)));
            int length2 = jArrDt.length;
            MessageIdType[] messageIdTypeArr2 = new MessageIdType[length2];
            for (int i3 = 0; i3 < length2; i3++) {
                messageIdTypeArr2[i3] = new MessageIdType(jArrDt[i3]);
            }
            messageIdTypeArr = (MessageIdType[]) dqru.D(null, messageIdTypeArr2, new MessageIdType[0]);
        } else {
            messageIdTypeArr = new MessageIdType[]{f()};
        }
        dqqf.dA(length, messageIdTypeArr, new ejxr() { // from class: azam
            @Override // defpackage.ejxr
            public final Object get() {
                return "message_id:".concat(String.valueOf(this.a.getString(1)));
            }
        });
        String[] strArr2 = dj(2) ? z ? (String[]) dqru.D(null, du(getString(cO(2, azbe.a))), new String[0]) : new String[]{l()} : null;
        dqqf.dA(length, strArr2, new ejxr() { // from class: azan
            @Override // defpackage.ejxr
            public final Object get() {
                return "trigger_url:".concat(String.valueOf(this.a.getString(2)));
            }
        });
        long[] jArrC2 = dj(3) ? z ? dqru.C(null, dt(getString(cO(3, azbe.a)))) : new long[]{c()} : null;
        dqqf.dz(length, jArrC2, new ejxr() { // from class: azao
            @Override // defpackage.ejxr
            public final Object get() {
                return "expiration_time_millis:".concat(String.valueOf(this.a.getString(3)));
            }
        });
        String[] strArr3 = dj(4) ? z ? (String[]) dqru.D(null, du(getString(cO(4, azbe.a))), new String[0]) : new String[]{k()} : null;
        dqqf.dA(length, strArr3, new ejxr() { // from class: azap
            @Override // defpackage.ejxr
            public final Object get() {
                return "link_title:".concat(String.valueOf(this.a.getString(4)));
            }
        });
        String[] strArr4 = dj(5) ? z ? (String[]) dqru.D(null, du(getString(cO(5, azbe.a))), new String[0]) : new String[]{h()} : null;
        dqqf.dA(length, strArr4, new ejxr() { // from class: azaq
            @Override // defpackage.ejxr
            public final Object get() {
                return "link_description:".concat(String.valueOf(this.a.getString(5)));
            }
        });
        String[] strArr5 = dj(6) ? z ? (String[]) dqru.D(null, du(getString(cO(6, azbe.a))), new String[0]) : new String[]{j()} : null;
        dqqf.dA(length, strArr5, new ejxr() { // from class: azar
            @Override // defpackage.ejxr
            public final Object get() {
                return "link_image_url:".concat(String.valueOf(this.a.getString(6)));
            }
        });
        String[] strArr6 = dj(7) ? z ? (String[]) dqru.D(null, du(getString(cO(7, azbe.a))), new String[0]) : new String[]{i()} : null;
        dqqf.dA(length, strArr6, new ejxr() { // from class: azas
            @Override // defpackage.ejxr
            public final Object get() {
                return "link_domain:".concat(String.valueOf(this.a.getString(7)));
            }
        });
        String[] strArr7 = dj(8) ? z ? (String[]) dqru.D(null, du(getString(cO(8, azbe.a))), new String[0]) : new String[]{g()} : null;
        dqqf.dA(length, strArr7, new ejxr() { // from class: azat
            @Override // defpackage.ejxr
            public final Object get() {
                return "link_canonical_url:".concat(String.valueOf(this.a.getString(8)));
            }
        });
        ekfw ekfwVar = new ekfw();
        int i4 = 0;
        while (i4 < length) {
            long j = jArrDC[i4];
            if (j <= 0 || hashSet.contains(Long.valueOf(j))) {
                jArr = jArrDC;
                strArr = strArr6;
                i = length;
            } else {
                hashSet.add(Long.valueOf(jArrDC[i4]));
                String[] strArr8 = azbe.a;
                ayzo ayzoVar = new ayzo();
                ayzoVar.aF();
                ayzoVar.aD();
                long j2 = jArrDC[i4];
                jArr = jArrDC;
                if (jArrC != null) {
                    long j3 = jArrC[i4];
                    strArr = strArr6;
                    ayzoVar.aE(0);
                    ayzoVar.a = j3;
                } else {
                    strArr = strArr6;
                }
                if (messageIdTypeArr != null) {
                    MessageIdType messageIdType = messageIdTypeArr[i4];
                    ayzoVar.aE(1);
                    ayzoVar.b = messageIdType;
                }
                if (strArr2 != null) {
                    String str = strArr2[i4];
                    ayzoVar.aE(2);
                    ayzoVar.c = str;
                }
                if (jArrC2 != null) {
                    long j4 = jArrC2[i4];
                    ayzoVar.aE(3);
                    ayzoVar.d = j4;
                }
                if (strArr3 != null) {
                    String str2 = strArr3[i4];
                    ayzoVar.aE(4);
                    ayzoVar.e = str2;
                }
                if (strArr4 != null) {
                    String str3 = strArr4[i4];
                    ayzoVar.aE(5);
                    ayzoVar.f = str3;
                }
                if (strArr5 != null) {
                    String str4 = strArr5[i4];
                    ayzoVar.aE(6);
                    ayzoVar.g = str4;
                }
                if (strArr != null) {
                    String str5 = strArr[i4];
                    ayzoVar.aE(7);
                    ayzoVar.h = str5;
                }
                if (strArr7 != null) {
                    String str6 = strArr7[i4];
                    ayzoVar.aE(8);
                    ayzoVar.i = str6;
                }
                ayzm ayzmVar = new ayzm();
                ayzmVar.aD(ayzoVar.aB());
                i = length;
                ayzmVar.a = ayzoVar.a;
                ayzmVar.b = ayzoVar.b;
                ayzmVar.c = ayzoVar.c;
                ayzmVar.d = ayzoVar.d;
                ayzmVar.e = ayzoVar.e;
                ayzmVar.f = ayzoVar.f;
                ayzmVar.g = ayzoVar.g;
                ayzmVar.h = ayzoVar.h;
                ayzmVar.i = ayzoVar.i;
                ayzmVar.cM = ayzoVar.aC();
                ekfwVar.h(ayzmVar);
            }
            i4++;
            length = i;
            jArrDC = jArr;
            strArr6 = strArr;
        }
        return ekfwVar.g();
    }

    public final String g() {
        return getString(cO(8, azbe.a));
    }

    public final String h() {
        return getString(cO(5, azbe.a));
    }

    public final String i() {
        return getString(cO(7, azbe.a));
    }

    public final String j() {
        return getString(cO(6, azbe.a));
    }

    public final String k() {
        return getString(cO(4, azbe.a));
    }

    public final String l() {
        return getString(cO(2, azbe.a));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
