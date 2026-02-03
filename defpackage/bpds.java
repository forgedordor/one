package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bpds extends dqqf implements bpdp {
    @Deprecated
    public bpds(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, bpdx bpdxVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, bped.a, dqwjVar, dqtmVar, bpdxVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new bpdf();
    }

    @Override // defpackage.bpdp
    public final ekgb c() {
        ekfw ekfwVar = new ekfw();
        while (moveToNext()) {
            if (f() != null) {
                ekfwVar.h(f());
            }
        }
        return ekfwVar.g();
    }

    public final MessageIdType e() {
        return new MessageIdType(getLong(cO(0, bped.a)));
    }

    public final String f() {
        return getString(cO(1, bped.a));
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
                    long[] jArrDt = dt(getString(cO(0, bped.a)));
                    int length2 = jArrDt.length;
                    MessageIdType[] messageIdTypeArr2 = new MessageIdType[length2];
                    for (int i = 0; i < length2; i++) {
                        messageIdTypeArr2[i] = new MessageIdType(jArrDt[i]);
                    }
                    messageIdTypeArr = (MessageIdType[]) dqru.D(null, messageIdTypeArr2, new MessageIdType[0]);
                } else {
                    messageIdTypeArr = new MessageIdType[]{e()};
                }
                dqqf.dA(length, messageIdTypeArr, new ejxr() { // from class: bpdq
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "message_id:".concat(String.valueOf(this.a.getString(0)));
                    }
                });
                String[] strArr = dj(1) ? z ? (String[]) dqru.D(null, du(getString(cO(1, bped.a))), new String[0]) : new String[]{f()} : null;
                dqqf.dA(length, strArr, new ejxr() { // from class: bpdr
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "option_id:".concat(String.valueOf(this.a.getString(1)));
                    }
                });
                ekfw ekfwVar = new ekfw();
                for (int i2 = 0; i2 < length; i2++) {
                    long j = jArrDC[i2];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(jArrDC[i2]));
                        String[] strArr2 = bped.a;
                        bpdh bpdhVar = new bpdh();
                        bpdhVar.aF();
                        bpdhVar.aD();
                        long j2 = jArrDC[i2];
                        if (messageIdTypeArr != null) {
                            bpdhVar.b(messageIdTypeArr[i2]);
                        }
                        if (strArr != null) {
                            bpdhVar.c(strArr[i2]);
                        }
                        ekfwVar.h(bpdhVar.a());
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
