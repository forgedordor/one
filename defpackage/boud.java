package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class boud extends dqqf implements boua {
    @Deprecated
    public boud(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, boui bouiVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, bouk.a, dqwjVar, dqtmVar, bouiVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new botq();
    }

    public final ConversationIdType c() {
        return new ConversationIdType(getLong(cO(0, bouk.a)));
    }

    public final String e() {
        return getString(cO(1, bouk.a));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
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
        if (!zDj) {
            conversationIdTypeArr = null;
        } else if (z) {
            long[] jArrDt = dt(getString(cO(0, bouk.a)));
            int length2 = jArrDt.length;
            ConversationIdType[] conversationIdTypeArr2 = new ConversationIdType[length2];
            for (int i2 = 0; i2 < length2; i2++) {
                conversationIdTypeArr2[i2] = new ConversationIdType(jArrDt[i2]);
            }
            conversationIdTypeArr = (ConversationIdType[]) dqru.D(null, conversationIdTypeArr2, new ConversationIdType[0]);
        } else {
            conversationIdTypeArr = new ConversationIdType[]{c()};
        }
        dqqf.dA(length, conversationIdTypeArr, new ejxr() { // from class: boub
            @Override // defpackage.ejxr
            public final Object get() {
                return "conversation_id:".concat(String.valueOf(this.a.getString(0)));
            }
        });
        String[] strArr = dj(1) ? z ? (String[]) dqru.D(null, du(getString(cO(1, bouk.a))), new String[0]) : new String[]{e()} : null;
        dqqf.dA(length, strArr, new ejxr() { // from class: bouc
            @Override // defpackage.ejxr
            public final Object get() {
                return "rcs_group_id:".concat(String.valueOf(this.a.getString(1)));
            }
        });
        ekfw ekfwVar = new ekfw();
        for (int i3 = 0; i3 < length; i3++) {
            long j = jArrDC[i3];
            if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                hashSet.add(Long.valueOf(jArrDC[i3]));
                String[] strArr2 = bouk.a;
                bots botsVar = new bots();
                botsVar.aF();
                botsVar.aD();
                long j2 = jArrDC[i3];
                if (conversationIdTypeArr != null) {
                    ConversationIdType conversationIdType = conversationIdTypeArr[i3];
                    botsVar.aE(0);
                    botsVar.a = conversationIdType;
                }
                if (strArr != null) {
                    String str = strArr[i3];
                    botsVar.aE(1);
                    botsVar.b = str;
                }
                botq botqVar = new botq();
                botqVar.aD(botsVar.aB());
                botqVar.a = botsVar.a;
                botqVar.b = botsVar.b;
                botqVar.cM = botsVar.aC();
                ekfwVar.h(botqVar);
            }
        }
        return ekfwVar.g();
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
