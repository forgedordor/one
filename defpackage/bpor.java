package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bpor extends dqqf implements bpoo {
    @Deprecated
    public bpor(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, bpov bpovVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, bpoz.a, dqwjVar, dqtmVar, bpovVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new bpoe();
    }

    public final ConversationIdType c() {
        return new ConversationIdType(getLong(cO(0, bpoz.a)));
    }

    public final boolean e() {
        return getInt(cO(1, bpoz.a)) == 1;
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
            long[] jArrDt = dt(getString(cO(0, bpoz.a)));
            int length2 = jArrDt.length;
            ConversationIdType[] conversationIdTypeArr2 = new ConversationIdType[length2];
            for (int i2 = 0; i2 < length2; i2++) {
                conversationIdTypeArr2[i2] = new ConversationIdType(jArrDt[i2]);
            }
            conversationIdTypeArr = (ConversationIdType[]) dqru.D(null, conversationIdTypeArr2, new ConversationIdType[0]);
        } else {
            conversationIdTypeArr = new ConversationIdType[]{c()};
        }
        dqqf.dA(length, conversationIdTypeArr, new ejxr() { // from class: bpop
            @Override // defpackage.ejxr
            public final Object get() {
                return "conversation_id:".concat(String.valueOf(this.a.getString(0)));
            }
        });
        boolean[] zArrE = dj(1) ? z ? dqru.E(null, dv(getString(cO(1, bpoz.a)))) : new boolean[]{e()} : null;
        dqqf.dB(length, zArrE, new ejxr() { // from class: bpoq
            @Override // defpackage.ejxr
            public final Object get() {
                return "desired_gemini_state:".concat(String.valueOf(this.a.getString(1)));
            }
        });
        ekfw ekfwVar = new ekfw();
        for (int i3 = 0; i3 < length; i3++) {
            long j = jArrDC[i3];
            if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                hashSet.add(Long.valueOf(jArrDC[i3]));
                String[] strArr = bpoz.a;
                bpog bpogVar = new bpog();
                bpogVar.aF();
                bpogVar.aD();
                long j2 = jArrDC[i3];
                if (conversationIdTypeArr != null) {
                    ConversationIdType conversationIdType = conversationIdTypeArr[i3];
                    bpogVar.aE(0);
                    bpogVar.a = conversationIdType;
                }
                if (zArrE != null) {
                    boolean z2 = zArrE[i3];
                    bpogVar.aE(1);
                    bpogVar.b = z2;
                }
                bpoe bpoeVar = new bpoe();
                bpoeVar.aD(bpogVar.aB());
                bpoeVar.a = bpogVar.a;
                bpoeVar.b = bpogVar.b;
                bpoeVar.cM = bpogVar.aC();
                ekfwVar.h(bpoeVar);
            }
        }
        return ekfwVar.g();
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
