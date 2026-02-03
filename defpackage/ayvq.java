package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayvq extends dqqf implements ayvm {
    @Deprecated
    public ayvq(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, ayvx ayvxVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, aywb.a, dqwjVar, dqtmVar, ayvxVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new ayva();
    }

    public final long c() {
        return getLong(cO(0, aywb.a));
    }

    public final ConversationIdType e() {
        return new ConversationIdType(getLong(cO(1, aywb.a)));
    }

    public final boolean f() {
        return getInt(cO(2, aywb.a)) == 1;
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
        long[] jArrC = zDj ? z ? dqru.C(null, dt(getString(cO(0, aywb.a)))) : new long[]{c()} : null;
        dqqf.dz(length, jArrC, new ejxr() { // from class: ayvn
            @Override // defpackage.ejxr
            public final Object get() {
                return "_id:".concat(String.valueOf(this.a.getString(0)));
            }
        });
        if (!dj(1)) {
            conversationIdTypeArr = null;
        } else if (z) {
            long[] jArrDt = dt(getString(cO(1, aywb.a)));
            int length2 = jArrDt.length;
            ConversationIdType[] conversationIdTypeArr2 = new ConversationIdType[length2];
            for (int i2 = 0; i2 < length2; i2++) {
                conversationIdTypeArr2[i2] = new ConversationIdType(jArrDt[i2]);
            }
            conversationIdTypeArr = (ConversationIdType[]) dqru.D(null, conversationIdTypeArr2, new ConversationIdType[0]);
        } else {
            conversationIdTypeArr = new ConversationIdType[]{e()};
        }
        dqqf.dA(length, conversationIdTypeArr, new ejxr() { // from class: ayvo
            @Override // defpackage.ejxr
            public final Object get() {
                return "conversation_id:".concat(String.valueOf(this.a.getString(1)));
            }
        });
        boolean[] zArrE = dj(2) ? z ? dqru.E(null, dv(getString(cO(2, aywb.a)))) : new boolean[]{f()} : null;
        dqqf.dB(length, zArrE, new ejxr() { // from class: ayvp
            @Override // defpackage.ejxr
            public final Object get() {
                return "pin_status:".concat(String.valueOf(this.a.getString(2)));
            }
        });
        ekfw ekfwVar = new ekfw();
        for (int i3 = 0; i3 < length; i3++) {
            long j = jArrDC[i3];
            if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                hashSet.add(Long.valueOf(jArrDC[i3]));
                String[] strArr = aywb.a;
                ayvc ayvcVar = new ayvc();
                ayvcVar.aF();
                ayvcVar.aD();
                long j2 = jArrDC[i3];
                if (jArrC != null) {
                    long j3 = jArrC[i3];
                    ayvcVar.aE(0);
                    ayvcVar.a = j3;
                }
                if (conversationIdTypeArr != null) {
                    ConversationIdType conversationIdType = conversationIdTypeArr[i3];
                    ayvcVar.aE(1);
                    ayvcVar.b = conversationIdType;
                }
                if (zArrE != null) {
                    boolean z2 = zArrE[i3];
                    ayvcVar.aE(2);
                    ayvcVar.c = z2;
                }
                ayva ayvaVar = new ayva();
                ayvaVar.aD(ayvcVar.aB());
                ayvaVar.a = ayvcVar.a;
                ayvaVar.b = ayvcVar.b;
                ayvaVar.c = ayvcVar.c;
                ayvaVar.cM = ayvcVar.aC();
                ekfwVar.h(ayvaVar);
            }
        }
        return ekfwVar.g();
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
