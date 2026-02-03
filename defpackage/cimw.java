package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cimw extends dqqf implements cimu {
    @Deprecated
    public cimw(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, cimz cimzVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, cinb.a, dqwjVar, dqtmVar, cimzVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new cimm();
    }

    public final MessageIdType c() {
        return new MessageIdType(getLong(cO(0, cinb.a)));
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
        MessageIdType[] messageIdTypeArr = null;
        if (dj(0)) {
            if (dqtmVar.b) {
                long[] jArrDt = dt(getString(cO(0, cinb.a)));
                int length2 = jArrDt.length;
                MessageIdType[] messageIdTypeArr2 = new MessageIdType[length2];
                for (int i2 = 0; i2 < length2; i2++) {
                    messageIdTypeArr2[i2] = new MessageIdType(jArrDt[i2]);
                }
                messageIdTypeArr = (MessageIdType[]) dqru.D(null, messageIdTypeArr2, new MessageIdType[0]);
            } else {
                messageIdTypeArr = new MessageIdType[]{c()};
            }
        }
        dqqf.dA(length, messageIdTypeArr, new ejxr() { // from class: cimv
            @Override // defpackage.ejxr
            public final Object get() {
                return "message_id:".concat(String.valueOf(this.a.getString(0)));
            }
        });
        ekfw ekfwVar = new ekfw();
        for (int i3 = 0; i3 < length; i3++) {
            long j = jArrDC[i3];
            if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                hashSet.add(Long.valueOf(jArrDC[i3]));
                String[] strArr = cinb.a;
                cimo cimoVar = new cimo();
                cimoVar.aF();
                cimoVar.aD();
                long j2 = jArrDC[i3];
                if (messageIdTypeArr != null) {
                    MessageIdType messageIdType = messageIdTypeArr[i3];
                    cimoVar.aE(0);
                    cimoVar.a = messageIdType;
                }
                cimm cimmVar = new cimm();
                cimmVar.aD(cimoVar.aB());
                cimmVar.a = cimoVar.a;
                cimmVar.cM = cimoVar.aC();
                ekfwVar.h(cimmVar);
            }
        }
        return ekfwVar.g();
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
