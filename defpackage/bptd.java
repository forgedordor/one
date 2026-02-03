package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bptd extends dqqf implements bpst {
    @Deprecated
    public bptd(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, bpti bptiVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, bpto.a, dqwjVar, dqtmVar, bptiVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new bprv();
    }

    @Override // defpackage.bpst
    public final ekgb c() {
        ekfw ekfwVar = new ekfw();
        while (moveToNext()) {
            h();
            ekfwVar.h(h());
        }
        return ekfwVar.g();
    }

    public final long e() {
        return getLong(cO(0, bpto.a));
    }

    public final long f() {
        return getLong(cO(7, bpto.a));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        ConversationIdType[] conversationIdTypeArr;
        long[] jArr;
        cdpi[] cdpiVarArr;
        char c;
        long[] jArr2;
        int i;
        dqwl dqwlVar = dqthVar.a;
        long[] jArrDC = dC(getString(dqthVar.h + 1));
        int length = jArrDC.length;
        if (length != 0) {
            if (length != 1 || jArrDC[0] != -1) {
                HashSet hashSet = new HashSet();
                dqtm dqtmVar = this.d;
                boolean zDj = dj(0);
                boolean z = dqtmVar.b;
                long[] jArrC = zDj ? z ? dqru.C(null, dt(getString(cO(0, bpto.a)))) : new long[]{e()} : null;
                dqqf.dz(length, jArrC, new ejxr() { // from class: bpsu
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "_id:".concat(String.valueOf(this.a.getString(0)));
                    }
                });
                if (!dj(1)) {
                    conversationIdTypeArr = null;
                } else if (z) {
                    long[] jArrDt = dt(getString(cO(1, bpto.a)));
                    int length2 = jArrDt.length;
                    ConversationIdType[] conversationIdTypeArr2 = new ConversationIdType[length2];
                    for (int i2 = 0; i2 < length2; i2++) {
                        conversationIdTypeArr2[i2] = new ConversationIdType(jArrDt[i2]);
                    }
                    conversationIdTypeArr = (ConversationIdType[]) dqru.D(null, conversationIdTypeArr2, new ConversationIdType[0]);
                } else {
                    conversationIdTypeArr = new ConversationIdType[]{h()};
                }
                dqqf.dA(length, conversationIdTypeArr, new ejxr() { // from class: bpsv
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "conversation_id:".concat(String.valueOf(this.a.getString(1)));
                    }
                });
                String[] strArr = dj(2) ? z ? (String[]) dqru.D(null, du(getString(cO(2, bpto.a))), new String[0]) : new String[]{j()} : null;
                dqqf.dA(length, strArr, new ejxr() { // from class: bpsw
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "business_id:".concat(String.valueOf(this.a.getString(2)));
                    }
                });
                String[] strArr2 = dj(3) ? z ? (String[]) dqru.D(null, du(getString(cO(3, bpto.a))), new String[0]) : new String[]{k()} : null;
                dqqf.dA(length, strArr2, new ejxr() { // from class: bpsx
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "lighter_conversation_id_json:".concat(String.valueOf(this.a.getString(3)));
                    }
                });
                boolean[] zArrE = dj(4) ? z ? dqru.E(null, dv(getString(cO(4, bpto.a)))) : new boolean[]{m()} : null;
                dqqf.dB(length, zArrE, new ejxr() { // from class: bpsy
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "read:".concat(String.valueOf(this.a.getString(4)));
                    }
                });
                boolean[] zArrE2 = dj(5) ? z ? dqru.E(null, dv(getString(cO(5, bpto.a)))) : new boolean[]{l()} : null;
                dqqf.dB(length, zArrE2, new ejxr() { // from class: bpsz
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "is_last_message_outgoing:".concat(String.valueOf(this.a.getString(5)));
                    }
                });
                if (!dj(6)) {
                    jArr = jArrDC;
                    cdpiVarArr = null;
                } else if (z) {
                    int[] iArrDs = ds(getString(cO(6, bpto.a)));
                    cdpi[] cdpiVarArrValues = cdpi.values();
                    int length3 = cdpiVarArrValues.length;
                    cdpi[] cdpiVarArr2 = new cdpi[iArrDs.length];
                    jArr = jArrDC;
                    for (int i3 = 0; i3 < iArrDs.length; i3++) {
                        int i4 = iArrDs[i3];
                        if (i4 >= length3) {
                            throw new IllegalStateException();
                        }
                        cdpiVarArr2[i3] = cdpiVarArrValues[i4];
                    }
                    cdpiVarArr = (cdpi[]) dqru.D(null, cdpiVarArr2, new cdpi[0]);
                } else {
                    jArr = jArrDC;
                    cdpiVarArr = new cdpi[]{i()};
                }
                dqqf.dA(length, cdpiVarArr, new ejxr() { // from class: bpta
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "conversation_status:".concat(String.valueOf(this.a.getString(6)));
                    }
                });
                char c2 = 7;
                long[] jArrC2 = dj(7) ? z ? dqru.C(null, dt(getString(cO(7, bpto.a)))) : new long[]{f()} : null;
                dqqf.dz(length, jArrC2, new ejxr() { // from class: bptb
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "last_action_timestamp:".concat(String.valueOf(this.a.getString(7)));
                    }
                });
                long[] jArrC3 = dj(8) ? z ? dqru.C(null, dt(getString(cO(8, bpto.a)))) : new long[]{g()} : null;
                dqqf.dz(length, jArrC3, new ejxr() { // from class: bptc
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "sync_timestamp_ms:".concat(String.valueOf(this.a.getString(8)));
                    }
                });
                ekfw ekfwVar = new ekfw();
                int i5 = 0;
                while (i5 < length) {
                    long j = jArr[i5];
                    if (j <= 0 || hashSet.contains(Long.valueOf(j))) {
                        c = c2;
                        jArr2 = jArrC2;
                        i = length;
                    } else {
                        hashSet.add(Long.valueOf(jArr[i5]));
                        String[] strArr3 = bpto.a;
                        bprx bprxVar = new bprx();
                        bprxVar.aF();
                        bprxVar.aD();
                        long j2 = jArr[i5];
                        jArr2 = jArrC2;
                        if (jArrC != null) {
                            long j3 = jArrC[i5];
                            bprxVar.aE(0);
                            bprxVar.a = j3;
                        }
                        if (conversationIdTypeArr != null) {
                            bprxVar.c(conversationIdTypeArr[i5]);
                        }
                        if (strArr != null) {
                            bprxVar.b(strArr[i5]);
                        }
                        if (strArr2 != null) {
                            bprxVar.e(strArr2[i5]);
                        }
                        if (zArrE != null) {
                            bprxVar.f(zArrE[i5]);
                        }
                        if (zArrE2 != null) {
                            bprxVar.d(zArrE2[i5]);
                        }
                        if (cdpiVarArr != null) {
                            cdpi cdpiVar = cdpiVarArr[i5];
                            int i6 = bprxVar.aB;
                            if (i6 < 59030) {
                                dqru.x("conversation_status", i6);
                            }
                            bprxVar.aE(6);
                            bprxVar.g = cdpiVar;
                        }
                        if (jArr2 != null) {
                            long j4 = jArr2[i5];
                            int i7 = bprxVar.aB;
                            i = length;
                            if (i7 < 59040) {
                                dqru.x("last_action_timestamp", i7);
                            }
                            c = 7;
                            bprxVar.aE(7);
                            bprxVar.h = j4;
                        } else {
                            i = length;
                            c = 7;
                        }
                        if (jArrC3 != null) {
                            bprxVar.g(jArrC3[i5]);
                        }
                        ekfwVar.h(bprxVar.a());
                    }
                    i5++;
                    c2 = c;
                    jArrC2 = jArr2;
                    length = i;
                }
                return ekfwVar.g();
            }
        }
        int i8 = ekgb.d;
        return ekoe.a;
    }

    public final long g() {
        return getLong(cO(8, bpto.a));
    }

    public final ConversationIdType h() {
        return new ConversationIdType(getLong(cO(1, bpto.a)));
    }

    public final cdpi i() {
        cdpi[] cdpiVarArrValues = cdpi.values();
        int i = getInt(cO(6, bpto.a));
        if (i < cdpiVarArrValues.length) {
            return cdpiVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    public final String j() {
        return getString(cO(2, bpto.a));
    }

    public final String k() {
        return getString(cO(3, bpto.a));
    }

    public final boolean l() {
        return getInt(cO(5, bpto.a)) == 1;
    }

    public final boolean m() {
        return getInt(cO(4, bpto.a)) == 1;
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
