package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avqs extends dqqf implements avqn {
    @Deprecated
    public avqs(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, avqz avqzVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, avrd.a, dqwjVar, dqtmVar, avqzVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new avpz();
    }

    @Override // defpackage.avqn
    public final ekgb c() {
        ekfw ekfwVar = new ekfw();
        while (moveToNext()) {
            g();
            ekfwVar.h(g());
        }
        return ekfwVar.g();
    }

    public final long e() {
        return getLong(cO(0, avrd.a));
    }

    public final long f() {
        return getLong(cO(1, avrd.a));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
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
        ConversationIdType[] conversationIdTypeArr = null;
        long[] jArrC = zDj ? z ? dqru.C(null, dt(getString(cO(0, avrd.a)))) : new long[]{e()} : null;
        dqqf.dz(length, jArrC, new ejxr() { // from class: avqo
            @Override // defpackage.ejxr
            public final Object get() {
                return "_id:".concat(String.valueOf(this.a.getString(0)));
            }
        });
        long[] jArrC2 = dj(1) ? z ? dqru.C(null, dt(getString(cO(1, avrd.a)))) : new long[]{f()} : null;
        dqqf.dz(length, jArrC2, new ejxr() { // from class: avqp
            @Override // defpackage.ejxr
            public final Object get() {
                return "matcher_version:".concat(String.valueOf(this.a.getString(1)));
            }
        });
        String[] strArr = dj(2) ? z ? (String[]) dqru.D(null, du(getString(cO(2, avrd.a))), new String[0]) : new String[]{h()} : null;
        dqqf.dA(length, strArr, new ejxr() { // from class: avqq
            @Override // defpackage.ejxr
            public final Object get() {
                return "destination_key:".concat(String.valueOf(this.a.getString(2)));
            }
        });
        if (dj(3)) {
            if (z) {
                long[] jArrDt = dt(getString(cO(3, avrd.a)));
                int length2 = jArrDt.length;
                ConversationIdType[] conversationIdTypeArr2 = new ConversationIdType[length2];
                for (int i2 = 0; i2 < length2; i2++) {
                    conversationIdTypeArr2[i2] = new ConversationIdType(jArrDt[i2]);
                }
                conversationIdTypeArr = (ConversationIdType[]) dqru.D(null, conversationIdTypeArr2, new ConversationIdType[0]);
            } else {
                conversationIdTypeArr = new ConversationIdType[]{g()};
            }
        }
        dqqf.dA(length, conversationIdTypeArr, new ejxr() { // from class: avqr
            @Override // defpackage.ejxr
            public final Object get() {
                return "conversation_id:".concat(String.valueOf(this.a.getString(3)));
            }
        });
        ekfw ekfwVar = new ekfw();
        for (int i3 = 0; i3 < length; i3++) {
            long j = jArrDC[i3];
            if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                hashSet.add(Long.valueOf(jArrDC[i3]));
                String[] strArr2 = avrd.a;
                avqb avqbVar = new avqb();
                avqbVar.aF();
                avqbVar.aD();
                long j2 = jArrDC[i3];
                if (jArrC != null) {
                    long j3 = jArrC[i3];
                    avqbVar.aE(0);
                    avqbVar.a = j3;
                }
                if (jArrC2 != null) {
                    avqbVar.d(jArrC2[i3]);
                }
                if (strArr != null) {
                    avqbVar.c(strArr[i3]);
                }
                if (conversationIdTypeArr != null) {
                    avqbVar.b(conversationIdTypeArr[i3]);
                }
                ekfwVar.h(avqbVar.a());
            }
        }
        return ekfwVar.g();
    }

    public final ConversationIdType g() {
        return new ConversationIdType(getLong(cO(3, avrd.a)));
    }

    public final String h() {
        return getString(cO(2, avrd.a));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
