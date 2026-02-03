package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bmis extends dqqf implements bmio {
    @Deprecated
    public bmis(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, bmix bmixVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, bmjd.a, dqwjVar, dqtmVar, bmixVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new bmic();
    }

    public final int c() {
        return getInt(cO(2, bmjd.a));
    }

    public final long e() {
        return getLong(cO(0, bmjd.a));
    }

    public final ConversationIdType f() {
        return new ConversationIdType(getLong(cO(1, bmjd.a)));
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
        long[] jArrC = zDj ? z ? dqru.C(null, dt(getString(cO(0, bmjd.a)))) : new long[]{e()} : null;
        dqqf.dz(length, jArrC, new ejxr() { // from class: bmip
            @Override // defpackage.ejxr
            public final Object get() {
                return "_id:".concat(String.valueOf(this.a.getString(0)));
            }
        });
        if (!dj(1)) {
            conversationIdTypeArr = null;
        } else if (z) {
            long[] jArrDt = dt(getString(cO(1, bmjd.a)));
            int length2 = jArrDt.length;
            ConversationIdType[] conversationIdTypeArr2 = new ConversationIdType[length2];
            for (int i2 = 0; i2 < length2; i2++) {
                conversationIdTypeArr2[i2] = new ConversationIdType(jArrDt[i2]);
            }
            conversationIdTypeArr = (ConversationIdType[]) dqru.D(null, conversationIdTypeArr2, new ConversationIdType[0]);
        } else {
            conversationIdTypeArr = new ConversationIdType[]{f()};
        }
        dqqf.dA(length, conversationIdTypeArr, new ejxr() { // from class: bmiq
            @Override // defpackage.ejxr
            public final Object get() {
                return "conversation_id:".concat(String.valueOf(this.a.getString(1)));
            }
        });
        int[] iArrA = dj(2) ? z ? dqru.A(null, ds(getString(cO(2, bmjd.a)))) : new int[]{c()} : null;
        dqqf.dy(length, iArrA, new ejxr() { // from class: bmir
            @Override // defpackage.ejxr
            public final Object get() {
                return "banner_status:".concat(String.valueOf(this.a.getString(2)));
            }
        });
        ekfw ekfwVar = new ekfw();
        for (int i3 = 0; i3 < length; i3++) {
            long j = jArrDC[i3];
            if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                hashSet.add(Long.valueOf(jArrDC[i3]));
                String[] strArr = bmjd.a;
                bmie bmieVar = new bmie();
                bmieVar.aF();
                bmieVar.aD();
                long j2 = jArrDC[i3];
                if (jArrC != null) {
                    long j3 = jArrC[i3];
                    bmieVar.aE(0);
                    bmieVar.a = j3;
                }
                if (conversationIdTypeArr != null) {
                    bmieVar.c(conversationIdTypeArr[i3]);
                }
                if (iArrA != null) {
                    bmieVar.b(iArrA[i3]);
                }
                ekfwVar.h(bmieVar.a());
            }
        }
        return ekfwVar.g();
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
