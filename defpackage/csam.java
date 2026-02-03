package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.HashSet;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csam extends dqqf implements csag {
    @Deprecated
    public csam(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, csar csarVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, csav.a, dqwjVar, dqtmVar, csarVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new crzn();
    }

    public final long c() {
        return getLong(cO(4, csav.a));
    }

    public final ConversationIdType e() {
        return new ConversationIdType(getLong(cO(2, csav.a)));
    }

    public final MessageIdType f() {
        return new MessageIdType(getLong(cO(0, csav.a)));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        MessageIdType[] messageIdTypeArr;
        ConversationIdType[] conversationIdTypeArr;
        dqwl dqwlVar = dqthVar.a;
        long[] jArrDC = dC(getString(dqthVar.h + 1));
        int length = jArrDC.length;
        if (length != 0) {
            if (length != 1 || jArrDC[0] != -1) {
                HashSet hashSet = new HashSet();
                dqtm dqtmVar = this.d;
                boolean zDj = dj(0);
                boolean z = dqtmVar.b;
                if (!zDj) {
                    messageIdTypeArr = null;
                } else if (z) {
                    long[] jArrDt = dt(getString(cO(0, csav.a)));
                    int length2 = jArrDt.length;
                    MessageIdType[] messageIdTypeArr2 = new MessageIdType[length2];
                    for (int i = 0; i < length2; i++) {
                        messageIdTypeArr2[i] = new MessageIdType(jArrDt[i]);
                    }
                    messageIdTypeArr = (MessageIdType[]) dqru.D(null, messageIdTypeArr2, new MessageIdType[0]);
                } else {
                    messageIdTypeArr = new MessageIdType[]{f()};
                }
                dqqf.dA(length, messageIdTypeArr, new ejxr() { // from class: csah
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "message_id:".concat(String.valueOf(this.a.getString(0)));
                    }
                });
                String[] strArr = dj(1) ? z ? (String[]) dqru.D(null, du(getString(cO(1, csav.a))), new String[0]) : new String[]{h()} : null;
                dqqf.dA(length, strArr, new ejxr() { // from class: csai
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "message_logging_id:".concat(String.valueOf(this.a.getString(1)));
                    }
                });
                if (!dj(2)) {
                    conversationIdTypeArr = null;
                } else if (z) {
                    long[] jArrDt2 = dt(getString(cO(2, csav.a)));
                    int length3 = jArrDt2.length;
                    ConversationIdType[] conversationIdTypeArr2 = new ConversationIdType[length3];
                    for (int i2 = 0; i2 < length3; i2++) {
                        conversationIdTypeArr2[i2] = new ConversationIdType(jArrDt2[i2]);
                    }
                    conversationIdTypeArr = (ConversationIdType[]) dqru.D(null, conversationIdTypeArr2, new ConversationIdType[0]);
                } else {
                    conversationIdTypeArr = new ConversationIdType[]{e()};
                }
                dqqf.dA(length, conversationIdTypeArr, new ejxr() { // from class: csaj
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "conversation_id:".concat(String.valueOf(this.a.getString(2)));
                    }
                });
                String[] strArr2 = dj(3) ? z ? (String[]) dqru.D(null, du(getString(cO(3, csav.a))), new String[0]) : new String[]{g()} : null;
                dqqf.dA(length, strArr2, new ejxr() { // from class: csak
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "conversation_logging_id:".concat(String.valueOf(this.a.getString(3)));
                    }
                });
                long[] jArrC = dj(4) ? z ? dqru.C(null, dt(getString(cO(4, csav.a)))) : new long[]{c()} : null;
                dqqf.dz(length, jArrC, new ejxr() { // from class: csal
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "generation_timestamp:".concat(String.valueOf(this.a.getString(4)));
                    }
                });
                ekfw ekfwVar = new ekfw();
                for (int i3 = 0; i3 < length; i3++) {
                    long j = jArrDC[i3];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(jArrDC[i3]));
                        String[] strArr3 = csav.a;
                        crzr crzrVar = new crzr();
                        crzrVar.aF();
                        crzrVar.aD();
                        long j2 = jArrDC[i3];
                        if (messageIdTypeArr != null) {
                            crzrVar.e(messageIdTypeArr[i3]);
                        }
                        if (strArr != null) {
                            crzrVar.f(strArr[i3]);
                        }
                        if (conversationIdTypeArr != null) {
                            crzrVar.b(conversationIdTypeArr[i3]);
                        }
                        if (strArr2 != null) {
                            crzrVar.c(strArr2[i3]);
                        }
                        if (jArrC != null) {
                            crzrVar.d(jArrC[i3]);
                        }
                        ekfwVar.h(crzrVar.a(new Supplier() { // from class: crzp
                            @Override // java.util.function.Supplier
                            public final Object get() {
                                return new crzn();
                            }
                        }));
                    }
                }
                return ekfwVar.g();
            }
        }
        int i4 = ekgb.d;
        return ekoe.a;
    }

    public final String g() {
        return getString(cO(3, csav.a));
    }

    public final String h() {
        return getString(cO(1, csav.a));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
