package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ConversationNotificationSettingsTable;
import j$.time.Instant;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bnyi extends dqqf implements bnyd {
    @Deprecated
    public bnyi(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, bnyo bnyoVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, ConversationNotificationSettingsTable.a, dqwjVar, dqtmVar, bnyoVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new bnxp();
    }

    public final ConversationIdType c() {
        return new ConversationIdType(getLong(cO(0, ConversationNotificationSettingsTable.a)));
    }

    public final cgra e() {
        cgra[] cgraVarArrValues = cgra.values();
        int i = getInt(cO(2, ConversationNotificationSettingsTable.a));
        if (i < cgraVarArrValues.length) {
            return cgraVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    public final cgrc f() {
        cgrc[] cgrcVarArrValues = cgrc.values();
        int i = getInt(cO(3, ConversationNotificationSettingsTable.a));
        if (i < cgrcVarArrValues.length) {
            return cgrcVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        ConversationIdType[] conversationIdTypeArr;
        Instant[] instantArr;
        cgra[] cgraVarArr;
        dqwl dqwlVar = dqthVar.a;
        long[] jArrDC = dC(getString(dqthVar.h + 1));
        int length = jArrDC.length;
        if (length != 0) {
            if (length != 1 || jArrDC[0] != -1) {
                HashSet hashSet = new HashSet();
                dqtm dqtmVar = this.d;
                boolean zDj = dj(0);
                boolean z = dqtmVar.b;
                cgrc[] cgrcVarArr = null;
                if (!zDj) {
                    conversationIdTypeArr = null;
                } else if (z) {
                    long[] jArrDt = dt(getString(cO(0, ConversationNotificationSettingsTable.a)));
                    int length2 = jArrDt.length;
                    ConversationIdType[] conversationIdTypeArr2 = new ConversationIdType[length2];
                    for (int i = 0; i < length2; i++) {
                        conversationIdTypeArr2[i] = new ConversationIdType(jArrDt[i]);
                    }
                    conversationIdTypeArr = (ConversationIdType[]) dqru.D(null, conversationIdTypeArr2, new ConversationIdType[0]);
                } else {
                    conversationIdTypeArr = new ConversationIdType[]{c()};
                }
                dqqf.dA(length, conversationIdTypeArr, new ejxr() { // from class: bnye
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "conversation_id:".concat(String.valueOf(this.a.getString(0)));
                    }
                });
                if (!dj(1)) {
                    instantArr = null;
                } else if (z) {
                    long[] jArrDt2 = dt(getString(cO(1, ConversationNotificationSettingsTable.a)));
                    int length3 = jArrDt2.length;
                    Instant[] instantArr2 = new Instant[length3];
                    for (int i2 = 0; i2 < length3; i2++) {
                        instantArr2[i2] = bart.b(jArrDt2[i2]);
                    }
                    instantArr = (Instant[]) dqru.D(null, instantArr2, new Instant[0]);
                } else {
                    instantArr = new Instant[]{g()};
                }
                dqqf.dA(length, instantArr, new ejxr() { // from class: bnyf
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "muted_until_timestamp:".concat(String.valueOf(this.a.getString(1)));
                    }
                });
                if (!dj(2)) {
                    cgraVarArr = null;
                } else if (z) {
                    int[] iArrDs = ds(getString(cO(2, ConversationNotificationSettingsTable.a)));
                    cgra[] cgraVarArrValues = cgra.values();
                    int length4 = cgraVarArrValues.length;
                    cgra[] cgraVarArr2 = new cgra[iArrDs.length];
                    for (int i3 = 0; i3 < iArrDs.length; i3++) {
                        int i4 = iArrDs[i3];
                        if (i4 >= length4) {
                            throw new IllegalStateException();
                        }
                        cgraVarArr2[i3] = cgraVarArrValues[i4];
                    }
                    cgraVarArr = (cgra[]) dqru.D(null, cgraVarArr2, new cgra[0]);
                } else {
                    cgraVarArr = new cgra[]{e()};
                }
                dqqf.dA(length, cgraVarArr, new ejxr() { // from class: bnyg
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "muted_duration:".concat(String.valueOf(this.a.getString(2)));
                    }
                });
                if (dj(3)) {
                    if (z) {
                        int[] iArrDs2 = ds(getString(cO(3, ConversationNotificationSettingsTable.a)));
                        cgrc[] cgrcVarArrValues = cgrc.values();
                        int length5 = cgrcVarArrValues.length;
                        cgrc[] cgrcVarArr2 = new cgrc[iArrDs2.length];
                        for (int i5 = 0; i5 < iArrDs2.length; i5++) {
                            int i6 = iArrDs2[i5];
                            if (i6 >= length5) {
                                throw new IllegalStateException();
                            }
                            cgrcVarArr2[i5] = cgrcVarArrValues[i6];
                        }
                        cgrcVarArr = (cgrc[]) dqru.D(null, cgrcVarArr2, new cgrc[0]);
                    } else {
                        cgrcVarArr = new cgrc[]{f()};
                    }
                }
                dqqf.dA(length, cgrcVarArr, new ejxr() { // from class: bnyh
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "muted_threshold:".concat(String.valueOf(this.a.getString(3)));
                    }
                });
                ekfw ekfwVar = new ekfw();
                for (int i7 = 0; i7 < length; i7++) {
                    long j = jArrDC[i7];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(jArrDC[i7]));
                        String[] strArr = ConversationNotificationSettingsTable.a;
                        bnxr bnxrVar = new bnxr();
                        bnxrVar.aF();
                        bnxrVar.aD();
                        long j2 = jArrDC[i7];
                        if (conversationIdTypeArr != null) {
                            bnxrVar.b(conversationIdTypeArr[i7]);
                        }
                        if (instantArr != null) {
                            bnxrVar.e(instantArr[i7]);
                        }
                        if (cgraVarArr != null) {
                            bnxrVar.c(cgraVarArr[i7]);
                        }
                        if (cgrcVarArr != null) {
                            bnxrVar.d(cgrcVarArr[i7]);
                        }
                        ekfwVar.h(bnxrVar.a());
                    }
                }
                return ekfwVar.g();
            }
        }
        int i8 = ekgb.d;
        return ekoe.a;
    }

    public final Instant g() {
        return bart.b(getLong(cO(1, ConversationNotificationSettingsTable.a)));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
