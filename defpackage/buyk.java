package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class buyk extends dqqf implements buyf {
    @Deprecated
    public buyk(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, buys buysVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, buyx.a, dqwjVar, dqtmVar, buysVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new buxq();
    }

    public final long c() {
        return getLong(cO(2, buyx.a));
    }

    public final long e() {
        return getLong(cO(3, buyx.a));
    }

    public final MessageIdType f() {
        return new MessageIdType(getLong(cO(1, buyx.a)));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        MessageIdType[] messageIdTypeArr;
        dqwl dqwlVar = dqthVar.a;
        long[] jArrDC = dC(getString(dqthVar.h + 1));
        int length = jArrDC.length;
        if (length != 0) {
            if (length != 1 || jArrDC[0] != -1) {
                HashSet hashSet = new HashSet();
                dqtm dqtmVar = this.d;
                boolean zDj = dj(0);
                boolean z = dqtmVar.b;
                String[] strArr = zDj ? z ? (String[]) dqru.D(null, du(getString(cO(0, buyx.a))), new String[0]) : new String[]{g()} : null;
                dqqf.dA(length, strArr, new ejxr() { // from class: buyg
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "_id:".concat(String.valueOf(this.a.getString(0)));
                    }
                });
                if (!dj(1)) {
                    messageIdTypeArr = null;
                } else if (z) {
                    long[] jArrDt = dt(getString(cO(1, buyx.a)));
                    int length2 = jArrDt.length;
                    MessageIdType[] messageIdTypeArr2 = new MessageIdType[length2];
                    for (int i = 0; i < length2; i++) {
                        messageIdTypeArr2[i] = new MessageIdType(jArrDt[i]);
                    }
                    messageIdTypeArr = (MessageIdType[]) dqru.D(null, messageIdTypeArr2, new MessageIdType[0]);
                } else {
                    messageIdTypeArr = new MessageIdType[]{f()};
                }
                dqqf.dA(length, messageIdTypeArr, new ejxr() { // from class: buyh
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "message_id:".concat(String.valueOf(this.a.getString(1)));
                    }
                });
                long[] jArrC = dj(2) ? z ? dqru.C(null, dt(getString(cO(2, buyx.a)))) : new long[]{c()} : null;
                dqqf.dz(length, jArrC, new ejxr() { // from class: buyi
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "user_ref_id:".concat(String.valueOf(this.a.getString(2)));
                    }
                });
                long[] jArrC2 = dj(3) ? z ? dqru.C(null, dt(getString(cO(3, buyx.a)))) : new long[]{e()} : null;
                dqqf.dz(length, jArrC2, new ejxr() { // from class: buyj
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "user_ref_datetime:".concat(String.valueOf(this.a.getString(3)));
                    }
                });
                ekfw ekfwVar = new ekfw();
                for (int i2 = 0; i2 < length; i2++) {
                    long j = jArrDC[i2];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(jArrDC[i2]));
                        buxr buxrVarA = buyx.a();
                        buxrVarA.aD();
                        long j2 = jArrDC[i2];
                        if (strArr != null) {
                            buxrVarA.b(strArr[i2]);
                        }
                        if (messageIdTypeArr != null) {
                            buxrVarA.c(messageIdTypeArr[i2]);
                        }
                        if (jArrC != null) {
                            buxrVarA.d(jArrC[i2]);
                        }
                        if (jArrC2 != null) {
                            buxrVarA.e(jArrC2[i2]);
                        }
                        ekfwVar.h(buxrVarA.a());
                    }
                }
                return ekfwVar.g();
            }
        }
        int i3 = ekgb.d;
        return ekoe.a;
    }

    public final String g() {
        return getString(cO(0, buyx.a));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
