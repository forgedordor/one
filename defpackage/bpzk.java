package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bpzk extends dqqf implements bpze {
    @Deprecated
    public bpzk(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, bpzr bpzrVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, bpzx.a, dqwjVar, dqtmVar, bpzrVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new bpyo();
    }

    @Override // defpackage.bpze
    public final ekgb c() {
        ekfw ekfwVar = new ekfw();
        while (moveToNext()) {
            h();
            ekfwVar.h(h());
        }
        return ekfwVar.g();
    }

    @Override // defpackage.bpze
    public final String e() {
        return getString(cO(0, bpzx.a));
    }

    public final int f() {
        return getInt(cO(3, bpzx.a));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        ConversationIdType[] conversationIdTypeArr;
        MessageIdType[] messageIdTypeArr;
        ezds ezdsVar;
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
        ezds[] ezdsVarArr = null;
        String[] strArr = zDj ? z ? (String[]) dqru.D(null, du(getString(cO(0, bpzx.a))), new String[0]) : new String[]{e()} : null;
        dqqf.dA(length, strArr, new ejxr() { // from class: bpzf
            @Override // defpackage.ejxr
            public final Object get() {
                return "_id:".concat(String.valueOf(this.a.getString(0)));
            }
        });
        if (!dj(1)) {
            conversationIdTypeArr = null;
        } else if (z) {
            String[] strArrDu = du(getString(cO(1, bpzx.a)));
            int length2 = strArrDu.length;
            ConversationIdType[] conversationIdTypeArr2 = new ConversationIdType[length2];
            for (int i2 = 0; i2 < length2; i2++) {
                conversationIdTypeArr2[i2] = barn.b(strArrDu[i2]);
            }
            conversationIdTypeArr = (ConversationIdType[]) dqru.D(null, conversationIdTypeArr2, new ConversationIdType[0]);
        } else {
            conversationIdTypeArr = new ConversationIdType[]{g()};
        }
        dqqf.dA(length, conversationIdTypeArr, new ejxr() { // from class: bpzg
            @Override // defpackage.ejxr
            public final Object get() {
                return "conversation_id:".concat(String.valueOf(this.a.getString(1)));
            }
        });
        if (!dj(2)) {
            messageIdTypeArr = null;
        } else if (z) {
            long[] jArrDt = dt(getString(cO(2, bpzx.a)));
            int length3 = jArrDt.length;
            MessageIdType[] messageIdTypeArr2 = new MessageIdType[length3];
            for (int i3 = 0; i3 < length3; i3++) {
                messageIdTypeArr2[i3] = new MessageIdType(jArrDt[i3]);
            }
            messageIdTypeArr = (MessageIdType[]) dqru.D(null, messageIdTypeArr2, new MessageIdType[0]);
        } else {
            messageIdTypeArr = new MessageIdType[]{h()};
        }
        dqqf.dA(length, messageIdTypeArr, new ejxr() { // from class: bpzh
            @Override // defpackage.ejxr
            public final Object get() {
                return "message_id:".concat(String.valueOf(this.a.getString(2)));
            }
        });
        int[] iArrA = dj(3) ? z ? dqru.A(null, ds(getString(cO(3, bpzx.a)))) : new int[]{f()} : null;
        dqqf.dy(length, iArrA, new ejxr() { // from class: bpzi
            @Override // defpackage.ejxr
            public final Object get() {
                return "annotation_type:".concat(String.valueOf(this.a.getString(3)));
            }
        });
        if (dj(4)) {
            if (z) {
                List listDf = df(getString(cO(4, bpzx.a)));
                ezds[] ezdsVarArr2 = new ezds[listDf.size()];
                Iterator it = listDf.iterator();
                int i4 = 0;
                while (it.hasNext()) {
                    try {
                        byte[] bArrZ = dqru.z((String) it.next());
                        int i5 = i4 + 1;
                        if (bArrZ == null) {
                            ezdsVar = null;
                        } else {
                            try {
                                ezdsVar = (ezds) evsn.parseFrom(ezds.a, bArrZ);
                            } catch (Throwable unused) {
                                i4 = i5;
                                ezdsVarArr2[i4] = null;
                                i4++;
                            }
                        }
                        ezdsVarArr2[i4] = ezdsVar;
                        i4 = i5;
                    } catch (Throwable unused2) {
                    }
                }
                ezdsVarArr = (ezds[]) dqru.D(null, ezdsVarArr2, new ezds[0]);
            } else {
                ezdsVarArr = new ezds[]{i()};
            }
        }
        dqqf.dA(length, ezdsVarArr, new ejxr() { // from class: bpzj
            @Override // defpackage.ejxr
            public final Object get() {
                return "annotation_details:".concat(String.valueOf(this.a.getString(4)));
            }
        });
        ekfw ekfwVar = new ekfw();
        for (int i6 = 0; i6 < length; i6++) {
            long j = jArrDC[i6];
            if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                hashSet.add(Long.valueOf(jArrDC[i6]));
                String[] strArr2 = bpzx.a;
                bpyq bpyqVar = new bpyq();
                bpyqVar.aF();
                bpyqVar.aD();
                long j2 = jArrDC[i6];
                if (strArr != null) {
                    String str = strArr[i6];
                    bpyqVar.aE(0);
                    bpyqVar.a = str;
                }
                if (conversationIdTypeArr != null) {
                    bpyqVar.d(conversationIdTypeArr[i6]);
                }
                if (messageIdTypeArr != null) {
                    bpyqVar.e(messageIdTypeArr[i6]);
                }
                if (iArrA != null) {
                    bpyqVar.c(iArrA[i6]);
                }
                if (ezdsVarArr != null) {
                    bpyqVar.b(ezdsVarArr[i6]);
                }
                ekfwVar.h(bpyqVar.a());
            }
        }
        return ekfwVar.g();
    }

    public final ConversationIdType g() {
        return barn.b(getString(cO(1, bpzx.a)));
    }

    public final MessageIdType h() {
        return new MessageIdType(getLong(cO(2, bpzx.a)));
    }

    public final ezds i() {
        byte[] blob = getBlob(cO(4, bpzx.a));
        if (blob == null) {
            return null;
        }
        try {
            return (ezds) evsn.parseFrom(ezds.a, blob, evrr.a());
        } catch (Throwable unused) {
            return ezds.a;
        }
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
