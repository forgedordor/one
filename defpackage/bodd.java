package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bodd extends dqqf implements bocz {
    @Deprecated
    public bodd(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, bodj bodjVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, bodn.a, dqwjVar, dqtmVar, bodjVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new bocn();
    }

    @Override // defpackage.bocz
    public final ekgb c() {
        ekfw ekfwVar = new ekfw();
        while (moveToNext()) {
            f();
            ekfwVar.h(f());
        }
        return ekfwVar.g();
    }

    public final long e() {
        return getLong(cO(0, bodn.a));
    }

    public final ConversationIdType f() {
        return new ConversationIdType(getLong(cO(1, bodn.a)));
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
        long[] jArrC = zDj ? z ? dqru.C(null, dt(getString(cO(0, bodn.a)))) : new long[]{e()} : null;
        dqqf.dz(length, jArrC, new ejxr() { // from class: boda
            @Override // defpackage.ejxr
            public final Object get() {
                return "_id:".concat(String.valueOf(this.a.getString(0)));
            }
        });
        if (!dj(1)) {
            conversationIdTypeArr = null;
        } else if (z) {
            long[] jArrDt = dt(getString(cO(1, bodn.a)));
            int length2 = jArrDt.length;
            ConversationIdType[] conversationIdTypeArr2 = new ConversationIdType[length2];
            for (int i2 = 0; i2 < length2; i2++) {
                conversationIdTypeArr2[i2] = new ConversationIdType(jArrDt[i2]);
            }
            conversationIdTypeArr = (ConversationIdType[]) dqru.D(null, conversationIdTypeArr2, new ConversationIdType[0]);
        } else {
            conversationIdTypeArr = new ConversationIdType[]{f()};
        }
        dqqf.dA(length, conversationIdTypeArr, new ejxr() { // from class: bodb
            @Override // defpackage.ejxr
            public final Object get() {
                return "conversation_id:".concat(String.valueOf(this.a.getString(1)));
            }
        });
        boolean[] zArrE = dj(2) ? z ? dqru.E(null, dv(getString(cO(2, bodn.a)))) : new boolean[]{g()} : null;
        dqqf.dB(length, zArrE, new ejxr() { // from class: bodc
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
                String[] strArr = bodn.a;
                bocp bocpVar = new bocp();
                bocpVar.aF();
                bocpVar.aD();
                long j2 = jArrDC[i3];
                if (jArrC != null) {
                    long j3 = jArrC[i3];
                    bocpVar.aE(0);
                    bocpVar.a = j3;
                }
                if (conversationIdTypeArr != null) {
                    bocpVar.b(conversationIdTypeArr[i3]);
                }
                if (zArrE != null) {
                    bocpVar.c(zArrE[i3]);
                }
                ekfwVar.h(bocpVar.a());
            }
        }
        return ekfwVar.g();
    }

    public final boolean g() {
        return getInt(cO(2, bodn.a)) == 1;
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
