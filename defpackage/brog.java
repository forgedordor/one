package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class brog extends dqqf implements brod {
    @Deprecated
    public brog(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, brom bromVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, bros.a, dqwjVar, dqtmVar, bromVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new brnt();
    }

    public final akbk c() {
        akbk[] akbkVarArrValues = akbk.values();
        int i = getInt(cO(1, bros.a));
        if (i < akbkVarArrValues.length) {
            return akbkVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    public final ConversationIdType e() {
        return new ConversationIdType(getLong(cO(0, bros.a)));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
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
                akbk[] akbkVarArr = null;
                if (!zDj) {
                    conversationIdTypeArr = null;
                } else if (z) {
                    long[] jArrDt = dt(getString(cO(0, bros.a)));
                    int length2 = jArrDt.length;
                    ConversationIdType[] conversationIdTypeArr2 = new ConversationIdType[length2];
                    for (int i = 0; i < length2; i++) {
                        conversationIdTypeArr2[i] = new ConversationIdType(jArrDt[i]);
                    }
                    conversationIdTypeArr = (ConversationIdType[]) dqru.D(null, conversationIdTypeArr2, new ConversationIdType[0]);
                } else {
                    conversationIdTypeArr = new ConversationIdType[]{e()};
                }
                dqqf.dA(length, conversationIdTypeArr, new ejxr() { // from class: broe
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "conversation_id:".concat(String.valueOf(this.a.getString(0)));
                    }
                });
                if (dj(1)) {
                    if (z) {
                        int[] iArrDs = ds(getString(cO(1, bros.a)));
                        akbk[] akbkVarArrValues = akbk.values();
                        int length3 = akbkVarArrValues.length;
                        akbk[] akbkVarArr2 = new akbk[iArrDs.length];
                        for (int i2 = 0; i2 < iArrDs.length; i2++) {
                            int i3 = iArrDs[i2];
                            if (i3 >= length3) {
                                throw new IllegalStateException();
                            }
                            akbkVarArr2[i2] = akbkVarArrValues[i3];
                        }
                        akbkVarArr = (akbk[]) dqru.D(null, akbkVarArr2, new akbk[0]);
                    } else {
                        akbkVarArr = new akbk[]{c()};
                    }
                }
                dqqf.dA(length, akbkVarArr, new ejxr() { // from class: brof
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "conversation_parent_supervision_state:".concat(String.valueOf(this.a.getString(1)));
                    }
                });
                ekfw ekfwVar = new ekfw();
                for (int i4 = 0; i4 < length; i4++) {
                    long j = jArrDC[i4];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(jArrDC[i4]));
                        String[] strArr = bros.a;
                        brnv brnvVar = new brnv();
                        brnvVar.aF();
                        brnvVar.aD();
                        long j2 = jArrDC[i4];
                        if (conversationIdTypeArr != null) {
                            brnvVar.b(conversationIdTypeArr[i4]);
                        }
                        if (akbkVarArr != null) {
                            brnvVar.c(akbkVarArr[i4]);
                        }
                        ekfwVar.h(brnvVar.a());
                    }
                }
                return ekfwVar.g();
            }
        }
        int i5 = ekgb.d;
        return ekoe.a;
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
