package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqar extends dqqf implements bqao {
    @Deprecated
    public bqar(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, bqax bqaxVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, bqbb.a, dqwjVar, dqtmVar, bqaxVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new bqae();
    }

    public final MessageIdType c() {
        return new MessageIdType(getLong(cO(0, bqbb.a)));
    }

    public final String e() {
        return getString(cO(1, bqbb.a));
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
                if (!zDj) {
                    messageIdTypeArr = null;
                } else if (z) {
                    long[] jArrDt = dt(getString(cO(0, bqbb.a)));
                    int length2 = jArrDt.length;
                    MessageIdType[] messageIdTypeArr2 = new MessageIdType[length2];
                    for (int i = 0; i < length2; i++) {
                        messageIdTypeArr2[i] = new MessageIdType(jArrDt[i]);
                    }
                    messageIdTypeArr = (MessageIdType[]) dqru.D(null, messageIdTypeArr2, new MessageIdType[0]);
                } else {
                    messageIdTypeArr = new MessageIdType[]{c()};
                }
                dqqf.dA(length, messageIdTypeArr, new ejxr() { // from class: bqap
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "message_id:".concat(String.valueOf(this.a.getString(0)));
                    }
                });
                String[] strArr = dj(1) ? z ? (String[]) dqru.D(null, du(getString(cO(1, bqbb.a))), new String[0]) : new String[]{e()} : null;
                dqqf.dA(length, strArr, new ejxr() { // from class: bqaq
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "caption:".concat(String.valueOf(this.a.getString(1)));
                    }
                });
                ekfw ekfwVar = new ekfw();
                for (int i2 = 0; i2 < length; i2++) {
                    long j = jArrDC[i2];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(jArrDC[i2]));
                        String[] strArr2 = bqbb.a;
                        bqag bqagVar = new bqag();
                        bqagVar.aF();
                        bqagVar.aD();
                        long j2 = jArrDC[i2];
                        if (messageIdTypeArr != null) {
                            bqagVar.c(messageIdTypeArr[i2]);
                        }
                        if (strArr != null) {
                            bqagVar.b(strArr[i2]);
                        }
                        ekfwVar.h(bqagVar.a());
                    }
                }
                return ekfwVar.g();
            }
        }
        int i3 = ekgb.d;
        return ekoe.a;
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
