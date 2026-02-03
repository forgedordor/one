package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bpkt extends dqqf implements bpkp {
    @Deprecated
    public bpkt(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, bpkx bpkxVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, bpkz.a, dqwjVar, dqtmVar, bpkxVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new bpkd();
    }

    public final MessageIdType c() {
        return new MessageIdType(getLong(cO(0, bpkz.a)));
    }

    public final String e() {
        return getString(cO(1, bpkz.a));
    }

    public final String f() {
        return getString(cO(2, bpkz.a));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        MessageIdType[] messageIdTypeArr;
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
        if (!zDj) {
            messageIdTypeArr = null;
        } else if (z) {
            long[] jArrDt = dt(getString(cO(0, bpkz.a)));
            int length2 = jArrDt.length;
            MessageIdType[] messageIdTypeArr2 = new MessageIdType[length2];
            for (int i2 = 0; i2 < length2; i2++) {
                messageIdTypeArr2[i2] = new MessageIdType(jArrDt[i2]);
            }
            messageIdTypeArr = (MessageIdType[]) dqru.D(null, messageIdTypeArr2, new MessageIdType[0]);
        } else {
            messageIdTypeArr = new MessageIdType[]{c()};
        }
        dqqf.dA(length, messageIdTypeArr, new ejxr() { // from class: bpkq
            @Override // defpackage.ejxr
            public final Object get() {
                return "message_id:".concat(String.valueOf(this.a.getString(0)));
            }
        });
        String[] strArr = dj(1) ? z ? (String[]) dqru.D(null, du(getString(cO(1, bpkz.a))), new String[0]) : new String[]{e()} : null;
        dqqf.dA(length, strArr, new ejxr() { // from class: bpkr
            @Override // defpackage.ejxr
            public final Object get() {
                return "extension_id:".concat(String.valueOf(this.a.getString(1)));
            }
        });
        String[] strArr2 = dj(2) ? z ? (String[]) dqru.D(null, du(getString(cO(2, bpkz.a))), new String[0]) : new String[]{f()} : null;
        dqqf.dA(length, strArr2, new ejxr() { // from class: bpks
            @Override // defpackage.ejxr
            public final Object get() {
                return "extension_package_name:".concat(String.valueOf(this.a.getString(2)));
            }
        });
        ekfw ekfwVar = new ekfw();
        for (int i3 = 0; i3 < length; i3++) {
            long j = jArrDC[i3];
            if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                hashSet.add(Long.valueOf(jArrDC[i3]));
                String[] strArr3 = bpkz.a;
                bpkf bpkfVar = new bpkf();
                bpkfVar.aF();
                bpkfVar.aD();
                long j2 = jArrDC[i3];
                if (messageIdTypeArr != null) {
                    MessageIdType messageIdType = messageIdTypeArr[i3];
                    bpkfVar.aE(0);
                    bpkfVar.a = messageIdType;
                }
                if (strArr != null) {
                    String str = strArr[i3];
                    bpkfVar.aE(1);
                    bpkfVar.b = str;
                }
                if (strArr2 != null) {
                    String str2 = strArr2[i3];
                    bpkfVar.aE(2);
                    bpkfVar.c = str2;
                }
                bpkd bpkdVar = new bpkd();
                bpkdVar.aD(bpkfVar.aB());
                bpkdVar.a = bpkfVar.a;
                bpkdVar.b = bpkfVar.b;
                bpkdVar.c = bpkfVar.c;
                bpkdVar.cM = bpkfVar.aC();
                ekfwVar.h(bpkdVar);
            }
        }
        return ekfwVar.g();
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
