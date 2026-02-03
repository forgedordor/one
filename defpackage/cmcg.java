package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.scheduledsend.database.ScheduledSendTable;
import j$.time.Instant;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmcg extends dqqf implements cmbz {
    @Deprecated
    public cmcg(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, cmck cmckVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, ScheduledSendTable.a, dqwjVar, dqtmVar, cmckVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new cmbe();
    }

    public final ConversationIdType c() {
        return new ConversationIdType(getLong(cO(2, ScheduledSendTable.a)));
    }

    public final MessageIdType e() {
        return new MessageIdType(getLong(cO(1, ScheduledSendTable.a)));
    }

    public final cmct f() {
        cmct[] cmctVarArrValues = cmct.values();
        int i = getInt(cO(4, ScheduledSendTable.a));
        if (i < cmctVarArrValues.length) {
            return cmctVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        MessageIdType[] messageIdTypeArr;
        ConversationIdType[] conversationIdTypeArr;
        Instant[] instantArr;
        cmct[] cmctVarArr;
        Instant[] instantArr2;
        dqwl dqwlVar = dqthVar.a;
        long[] jArrDC = dC(getString(dqthVar.h + 1));
        int length = jArrDC.length;
        if (length != 0) {
            if (length != 1 || jArrDC[0] != -1) {
                HashSet hashSet = new HashSet();
                dqtm dqtmVar = this.d;
                boolean zDj = dj(0);
                boolean z = dqtmVar.b;
                String[] strArr = zDj ? z ? (String[]) dqru.D(null, du(getString(cO(0, ScheduledSendTable.a))), new String[0]) : new String[]{i()} : null;
                dqqf.dA(length, strArr, new ejxr() { // from class: cmca
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "_id:".concat(String.valueOf(this.a.getString(0)));
                    }
                });
                if (!dj(1)) {
                    messageIdTypeArr = null;
                } else if (z) {
                    long[] jArrDt = dt(getString(cO(1, ScheduledSendTable.a)));
                    int length2 = jArrDt.length;
                    MessageIdType[] messageIdTypeArr2 = new MessageIdType[length2];
                    for (int i = 0; i < length2; i++) {
                        messageIdTypeArr2[i] = new MessageIdType(jArrDt[i]);
                    }
                    messageIdTypeArr = (MessageIdType[]) dqru.D(null, messageIdTypeArr2, new MessageIdType[0]);
                } else {
                    messageIdTypeArr = new MessageIdType[]{e()};
                }
                dqqf.dA(length, messageIdTypeArr, new ejxr() { // from class: cmcb
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "message_id:".concat(String.valueOf(this.a.getString(1)));
                    }
                });
                if (!dj(2)) {
                    conversationIdTypeArr = null;
                } else if (z) {
                    long[] jArrDt2 = dt(getString(cO(2, ScheduledSendTable.a)));
                    int length3 = jArrDt2.length;
                    ConversationIdType[] conversationIdTypeArr2 = new ConversationIdType[length3];
                    for (int i2 = 0; i2 < length3; i2++) {
                        conversationIdTypeArr2[i2] = new ConversationIdType(jArrDt2[i2]);
                    }
                    conversationIdTypeArr = (ConversationIdType[]) dqru.D(null, conversationIdTypeArr2, new ConversationIdType[0]);
                } else {
                    conversationIdTypeArr = new ConversationIdType[]{c()};
                }
                dqqf.dA(length, conversationIdTypeArr, new ejxr() { // from class: cmcc
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "conversation_id:".concat(String.valueOf(this.a.getString(2)));
                    }
                });
                if (!dj(3)) {
                    instantArr = null;
                } else if (z) {
                    long[] jArrDt3 = dt(getString(cO(3, ScheduledSendTable.a)));
                    int length4 = jArrDt3.length;
                    Instant[] instantArr3 = new Instant[length4];
                    for (int i3 = 0; i3 < length4; i3++) {
                        instantArr3[i3] = bart.b(jArrDt3[i3]);
                    }
                    instantArr = (Instant[]) dqru.D(null, instantArr3, new Instant[0]);
                } else {
                    instantArr = new Instant[]{h()};
                }
                dqqf.dA(length, instantArr, new ejxr() { // from class: cmcd
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "scheduled_time:".concat(String.valueOf(this.a.getString(3)));
                    }
                });
                if (!dj(4)) {
                    cmctVarArr = null;
                } else if (z) {
                    int[] iArrDs = ds(getString(cO(4, ScheduledSendTable.a)));
                    cmct[] cmctVarArrValues = cmct.values();
                    int length5 = cmctVarArrValues.length;
                    cmct[] cmctVarArr2 = new cmct[iArrDs.length];
                    for (int i4 = 0; i4 < iArrDs.length; i4++) {
                        int i5 = iArrDs[i4];
                        if (i5 >= length5) {
                            throw new IllegalStateException();
                        }
                        cmctVarArr2[i4] = cmctVarArrValues[i5];
                    }
                    cmctVarArr = (cmct[]) dqru.D(null, cmctVarArr2, new cmct[0]);
                } else {
                    cmctVarArr = new cmct[]{f()};
                }
                dqqf.dA(length, cmctVarArr, new ejxr() { // from class: cmce
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "status:".concat(String.valueOf(this.a.getString(4)));
                    }
                });
                if (!dj(5)) {
                    instantArr2 = null;
                } else if (z) {
                    long[] jArrDt4 = dt(getString(cO(5, ScheduledSendTable.a)));
                    int length6 = jArrDt4.length;
                    Instant[] instantArr4 = new Instant[length6];
                    for (int i6 = 0; i6 < length6; i6++) {
                        instantArr4[i6] = bart.b(jArrDt4[i6]);
                    }
                    instantArr2 = (Instant[]) dqru.D(null, instantArr4, new Instant[0]);
                } else {
                    instantArr2 = new Instant[]{g()};
                }
                dqqf.dA(length, instantArr2, new ejxr() { // from class: cmcf
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "creation_time:".concat(String.valueOf(this.a.getString(5)));
                    }
                });
                ekfw ekfwVar = new ekfw();
                for (int i7 = 0; i7 < length; i7++) {
                    long j = jArrDC[i7];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(jArrDC[i7]));
                        cmbh cmbhVarA = ScheduledSendTable.a();
                        cmbhVarA.aD();
                        long j2 = jArrDC[i7];
                        if (strArr != null) {
                            cmbhVarA.e(strArr[i7]);
                        }
                        if (messageIdTypeArr != null) {
                            cmbhVarA.f(messageIdTypeArr[i7]);
                        }
                        if (conversationIdTypeArr != null) {
                            cmbhVarA.c(conversationIdTypeArr[i7]);
                        }
                        if (instantArr != null) {
                            cmbhVarA.g(instantArr[i7]);
                        }
                        if (cmctVarArr != null) {
                            cmbhVarA.h(cmctVarArr[i7]);
                        }
                        if (instantArr2 != null) {
                            cmbhVarA.d(instantArr2[i7]);
                        }
                        ekfwVar.h(cmbhVarA.a());
                    }
                }
                return ekfwVar.g();
            }
        }
        int i8 = ekgb.d;
        return ekoe.a;
    }

    public final Instant g() {
        return bart.b(getLong(cO(5, ScheduledSendTable.a)));
    }

    public final Instant h() {
        return bart.b(getLong(cO(3, ScheduledSendTable.a)));
    }

    public final String i() {
        return getString(cO(0, ScheduledSendTable.a));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
