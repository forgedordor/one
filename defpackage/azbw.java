package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azbw extends dqqf implements azbt {
    @Deprecated
    public azbw(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, azcc azccVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, azcg.a, dqwjVar, dqtmVar, azccVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new azbj();
    }

    public final MessageIdType c() {
        return new MessageIdType(getLong(cO(0, azcg.a)));
    }

    public final String e() {
        return getString(cO(1, azcg.a));
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
            long[] jArrDt = dt(getString(cO(0, azcg.a)));
            int length2 = jArrDt.length;
            MessageIdType[] messageIdTypeArr2 = new MessageIdType[length2];
            for (int i2 = 0; i2 < length2; i2++) {
                messageIdTypeArr2[i2] = new MessageIdType(jArrDt[i2]);
            }
            messageIdTypeArr = (MessageIdType[]) dqru.D(null, messageIdTypeArr2, new MessageIdType[0]);
        } else {
            messageIdTypeArr = new MessageIdType[]{c()};
        }
        dqqf.dA(length, messageIdTypeArr, new ejxr() { // from class: azbu
            @Override // defpackage.ejxr
            public final Object get() {
                return "message_id:".concat(String.valueOf(this.a.getString(0)));
            }
        });
        String[] strArr = dj(1) ? z ? (String[]) dqru.D(null, du(getString(cO(1, azcg.a))), new String[0]) : new String[]{e()} : null;
        dqqf.dA(length, strArr, new ejxr() { // from class: azbv
            @Override // defpackage.ejxr
            public final Object get() {
                return "caption:".concat(String.valueOf(this.a.getString(1)));
            }
        });
        ekfw ekfwVar = new ekfw();
        for (int i3 = 0; i3 < length; i3++) {
            long j = jArrDC[i3];
            if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                hashSet.add(Long.valueOf(jArrDC[i3]));
                String[] strArr2 = azcg.a;
                azbl azblVar = new azbl();
                azblVar.aF();
                azblVar.aD();
                long j2 = jArrDC[i3];
                if (messageIdTypeArr != null) {
                    MessageIdType messageIdType = messageIdTypeArr[i3];
                    azblVar.aE(0);
                    azblVar.a = messageIdType;
                }
                if (strArr != null) {
                    String str = strArr[i3];
                    azblVar.aE(1);
                    azblVar.b = str;
                }
                azbj azbjVar = new azbj();
                azbjVar.aD(azblVar.aB());
                azbjVar.a = azblVar.a;
                azbjVar.b = azblVar.b;
                azbjVar.cM = azblVar.aC();
                ekfwVar.h(azbjVar);
            }
        }
        return ekfwVar.g();
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
