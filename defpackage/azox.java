package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azox extends dqqf implements azoq {
    @Deprecated
    public azox(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, azpd azpdVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, azph.a, dqwjVar, dqtmVar, azpdVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new aznx();
    }

    public final long c() {
        return getLong(cO(5, azph.a));
    }

    public final long e() {
        return getLong(cO(0, azph.a));
    }

    public final long f() {
        return getLong(cO(2, azph.a));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        MessageIdType[] messageIdTypeArr;
        long[] jArr;
        int i;
        dqwl dqwlVar = dqthVar.a;
        int i2 = 1;
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
        long[] jArrC = zDj ? z ? dqru.C(null, dt(getString(cO(0, azph.a)))) : new long[]{e()} : null;
        dqqf.dz(length, jArrC, new ejxr() { // from class: azor
            @Override // defpackage.ejxr
            public final Object get() {
                return "_id:".concat(String.valueOf(this.a.getString(0)));
            }
        });
        if (!dj(1)) {
            messageIdTypeArr = null;
        } else if (z) {
            long[] jArrDt = dt(getString(cO(1, azph.a)));
            int length2 = jArrDt.length;
            MessageIdType[] messageIdTypeArr2 = new MessageIdType[length2];
            for (int i4 = 0; i4 < length2; i4++) {
                messageIdTypeArr2[i4] = new MessageIdType(jArrDt[i4]);
            }
            messageIdTypeArr = (MessageIdType[]) dqru.D(null, messageIdTypeArr2, new MessageIdType[0]);
        } else {
            messageIdTypeArr = new MessageIdType[]{i()};
        }
        dqqf.dA(length, messageIdTypeArr, new ejxr() { // from class: azos
            @Override // defpackage.ejxr
            public final Object get() {
                return "message_id:".concat(String.valueOf(this.a.getString(1)));
            }
        });
        long[] jArrC2 = dj(2) ? z ? dqru.C(null, dt(getString(cO(2, azph.a)))) : new long[]{f()} : null;
        dqqf.dz(length, jArrC2, new ejxr() { // from class: azot
            @Override // defpackage.ejxr
            public final Object get() {
                return "participant_id:".concat(String.valueOf(this.a.getString(2)));
            }
        });
        long[] jArrC3 = dj(3) ? z ? dqru.C(null, dt(getString(cO(3, azph.a)))) : new long[]{h()} : null;
        dqqf.dz(length, jArrC3, new ejxr() { // from class: azou
            @Override // defpackage.ejxr
            public final Object get() {
                return "receive_time:".concat(String.valueOf(this.a.getString(3)));
            }
        });
        long[] jArrC4 = dj(4) ? z ? dqru.C(null, dt(getString(cO(4, azph.a)))) : new long[]{g()} : null;
        dqqf.dz(length, jArrC4, new ejxr() { // from class: azov
            @Override // defpackage.ejxr
            public final Object get() {
                return "read_time:".concat(String.valueOf(this.a.getString(4)));
            }
        });
        long[] jArrC5 = dj(5) ? z ? dqru.C(null, dt(getString(cO(5, azph.a)))) : new long[]{c()} : null;
        dqqf.dz(length, jArrC5, new ejxr() { // from class: azow
            @Override // defpackage.ejxr
            public final Object get() {
                return "ftd_time:".concat(String.valueOf(this.a.getString(5)));
            }
        });
        ekfw ekfwVar = new ekfw();
        int i5 = 0;
        while (i5 < length) {
            long j = jArrDC[i5];
            if (j <= 0 || hashSet.contains(Long.valueOf(j))) {
                jArr = jArrC2;
                i = length;
            } else {
                hashSet.add(Long.valueOf(jArrDC[i5]));
                String[] strArr = azph.a;
                aznz aznzVar = new aznz();
                aznzVar.aF();
                aznzVar.aD();
                long j2 = jArrDC[i5];
                jArr = jArrC2;
                if (jArrC != null) {
                    long j3 = jArrC[i5];
                    aznzVar.aE(0);
                    aznzVar.a = j3;
                }
                if (messageIdTypeArr != null) {
                    MessageIdType messageIdType = messageIdTypeArr[i5];
                    aznzVar.aE(i2);
                    aznzVar.b = messageIdType;
                }
                if (jArr != null) {
                    long j4 = jArr[i5];
                    aznzVar.aE(2);
                    aznzVar.c = j4;
                }
                if (jArrC3 != null) {
                    long j5 = jArrC3[i5];
                    aznzVar.aE(3);
                    aznzVar.d = j5;
                }
                if (jArrC4 != null) {
                    long j6 = jArrC4[i5];
                    aznzVar.aE(4);
                    aznzVar.e = j6;
                }
                if (jArrC5 != null) {
                    long j7 = jArrC5[i5];
                    aznzVar.aE(5);
                    aznzVar.f = j7;
                }
                aznx aznxVar = new aznx();
                aznxVar.aD(aznzVar.aB());
                i = length;
                aznxVar.a = aznzVar.a;
                aznxVar.b = aznzVar.b;
                aznxVar.c = aznzVar.c;
                aznxVar.d = aznzVar.d;
                aznxVar.e = aznzVar.e;
                aznxVar.f = aznzVar.f;
                aznxVar.cM = aznzVar.aC();
                ekfwVar.h(aznxVar);
            }
            i5++;
            length = i;
            jArrC2 = jArr;
            i2 = 1;
        }
        return ekfwVar.g();
    }

    public final long g() {
        return getLong(cO(4, azph.a));
    }

    public final long h() {
        return getLong(cO(3, azph.a));
    }

    public final MessageIdType i() {
        return new MessageIdType(getLong(cO(1, azph.a)));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
