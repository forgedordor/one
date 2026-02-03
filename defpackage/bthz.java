package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bthz extends dqqf implements btht {
    @Deprecated
    public bthz(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, btig btigVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, btin.a, dqwjVar, dqtmVar, btigVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new bthc();
    }

    @Override // defpackage.btht
    public final ekgb c() {
        ekfw ekfwVar = new ekfw();
        while (moveToNext()) {
            if (i() != null) {
                ekfwVar.h(i());
            }
        }
        return ekfwVar.g();
    }

    public final long e() {
        return getLong(cO(3, btin.a));
    }

    public final ConversationIdType f() {
        return new ConversationIdType(getLong(cO(2, btin.a)));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        MessageIdType[] messageIdTypeArr;
        ConversationIdType[] conversationIdTypeArr;
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
        bvdw[] bvdwVarArr = null;
        String[] strArr = zDj ? z ? (String[]) dqru.D(null, du(getString(cO(0, btin.a))), new String[0]) : new String[]{i()} : null;
        dqqf.dA(length, strArr, new ejxr() { // from class: bthu
            @Override // defpackage.ejxr
            public final Object get() {
                return "_id:".concat(String.valueOf(this.a.getString(0)));
            }
        });
        if (!dj(1)) {
            messageIdTypeArr = null;
        } else if (z) {
            long[] jArrDt = dt(getString(cO(1, btin.a)));
            int length2 = jArrDt.length;
            MessageIdType[] messageIdTypeArr2 = new MessageIdType[length2];
            for (int i2 = 0; i2 < length2; i2++) {
                messageIdTypeArr2[i2] = new MessageIdType(jArrDt[i2]);
            }
            messageIdTypeArr = (MessageIdType[]) dqru.D(null, messageIdTypeArr2, new MessageIdType[0]);
        } else {
            messageIdTypeArr = new MessageIdType[]{g()};
        }
        dqqf.dA(length, messageIdTypeArr, new ejxr() { // from class: bthv
            @Override // defpackage.ejxr
            public final Object get() {
                return "message_id:".concat(String.valueOf(this.a.getString(1)));
            }
        });
        if (!dj(2)) {
            conversationIdTypeArr = null;
        } else if (z) {
            long[] jArrDt2 = dt(getString(cO(2, btin.a)));
            int length3 = jArrDt2.length;
            ConversationIdType[] conversationIdTypeArr2 = new ConversationIdType[length3];
            for (int i3 = 0; i3 < length3; i3++) {
                conversationIdTypeArr2[i3] = new ConversationIdType(jArrDt2[i3]);
            }
            conversationIdTypeArr = (ConversationIdType[]) dqru.D(null, conversationIdTypeArr2, new ConversationIdType[0]);
        } else {
            conversationIdTypeArr = new ConversationIdType[]{f()};
        }
        dqqf.dA(length, conversationIdTypeArr, new ejxr() { // from class: bthw
            @Override // defpackage.ejxr
            public final Object get() {
                return "conversation_id:".concat(String.valueOf(this.a.getString(2)));
            }
        });
        long[] jArrC = dj(3) ? z ? dqru.C(null, dt(getString(cO(3, btin.a)))) : new long[]{e()} : null;
        dqqf.dz(length, jArrC, new ejxr() { // from class: bthx
            @Override // defpackage.ejxr
            public final Object get() {
                return "trigger_time:".concat(String.valueOf(this.a.getString(3)));
            }
        });
        if (dj(4)) {
            if (z) {
                int[] iArrDs = ds(getString(cO(4, btin.a)));
                bvdw[] bvdwVarArrValues = bvdw.values();
                int length4 = bvdwVarArrValues.length;
                bvdw[] bvdwVarArr2 = new bvdw[iArrDs.length];
                for (int i4 = 0; i4 < iArrDs.length; i4++) {
                    int i5 = iArrDs[i4];
                    if (i5 >= length4) {
                        throw new IllegalStateException();
                    }
                    bvdwVarArr2[i4] = bvdwVarArrValues[i5];
                }
                bvdwVarArr = (bvdw[]) dqru.D(null, bvdwVarArr2, new bvdw[0]);
            } else {
                bvdwVarArr = new bvdw[]{h()};
            }
        }
        dqqf.dA(length, bvdwVarArr, new ejxr() { // from class: bthy
            @Override // defpackage.ejxr
            public final Object get() {
                return "status:".concat(String.valueOf(this.a.getString(4)));
            }
        });
        ekfw ekfwVar = new ekfw();
        for (int i6 = 0; i6 < length; i6++) {
            long j = jArrDC[i6];
            if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                hashSet.add(Long.valueOf(jArrDC[i6]));
                String[] strArr2 = btin.a;
                bthe btheVar = new bthe();
                btheVar.aF();
                btheVar.aD();
                long j2 = jArrDC[i6];
                if (strArr != null) {
                    String str = strArr[i6];
                    btheVar.aE(0);
                    btheVar.a = str;
                }
                if (messageIdTypeArr != null) {
                    btheVar.c(messageIdTypeArr[i6]);
                }
                if (conversationIdTypeArr != null) {
                    btheVar.b(conversationIdTypeArr[i6]);
                }
                if (jArrC != null) {
                    btheVar.d(jArrC[i6]);
                }
                if (bvdwVarArr != null) {
                    bvdw bvdwVar = bvdwVarArr[i6];
                    btheVar.aE(4);
                    btheVar.e = bvdwVar;
                }
                ekfwVar.h(btheVar.a());
            }
        }
        return ekfwVar.g();
    }

    public final MessageIdType g() {
        return new MessageIdType(getLong(cO(1, btin.a)));
    }

    public final bvdw h() {
        bvdw[] bvdwVarArrValues = bvdw.values();
        int i = getInt(cO(4, btin.a));
        if (i < bvdwVarArrValues.length) {
            return bvdwVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    public final String i() {
        return getString(cO(0, btin.a));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
