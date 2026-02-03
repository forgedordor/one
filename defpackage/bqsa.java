package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqsa extends dqqf implements bqrx {
    @Deprecated
    public bqsa(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, bqsg bqsgVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, bqsm.a, dqwjVar, dqtmVar, bqsgVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new bqrn();
    }

    public final long c() {
        return getLong(cO(0, bqsm.a));
    }

    public final MessageIdType e() {
        return new MessageIdType(getLong(cO(1, bqsm.a)));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
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
        MessageIdType[] messageIdTypeArr = null;
        long[] jArrC = zDj ? z ? dqru.C(null, dt(getString(cO(0, bqsm.a)))) : new long[]{c()} : null;
        dqqf.dz(length, jArrC, new ejxr() { // from class: bqry
            @Override // defpackage.ejxr
            public final Object get() {
                return "_id:".concat(String.valueOf(this.a.getString(0)));
            }
        });
        if (dj(1)) {
            if (z) {
                long[] jArrDt = dt(getString(cO(1, bqsm.a)));
                int length2 = jArrDt.length;
                MessageIdType[] messageIdTypeArr2 = new MessageIdType[length2];
                for (int i2 = 0; i2 < length2; i2++) {
                    messageIdTypeArr2[i2] = new MessageIdType(jArrDt[i2]);
                }
                messageIdTypeArr = (MessageIdType[]) dqru.D(null, messageIdTypeArr2, new MessageIdType[0]);
            } else {
                messageIdTypeArr = new MessageIdType[]{e()};
            }
        }
        dqqf.dA(length, messageIdTypeArr, new ejxr() { // from class: bqrz
            @Override // defpackage.ejxr
            public final Object get() {
                return "message_id:".concat(String.valueOf(this.a.getString(1)));
            }
        });
        ekfw ekfwVar = new ekfw();
        for (int i3 = 0; i3 < length; i3++) {
            long j = jArrDC[i3];
            if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                hashSet.add(Long.valueOf(jArrDC[i3]));
                String[] strArr = bqsm.a;
                bqrp bqrpVar = new bqrp();
                bqrpVar.aF();
                bqrpVar.aD();
                long j2 = jArrDC[i3];
                if (jArrC != null) {
                    long j3 = jArrC[i3];
                    bqrpVar.aE(0);
                    bqrpVar.a = j3;
                }
                if (messageIdTypeArr != null) {
                    bqrpVar.b(messageIdTypeArr[i3]);
                }
                ekfwVar.h(bqrpVar.a());
            }
        }
        return ekfwVar.g();
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
