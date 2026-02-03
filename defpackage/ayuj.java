package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayuj extends dqqf implements ayuc {
    @Deprecated
    public ayuj(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, ayuq ayuqVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, ayuu.a, dqwjVar, dqtmVar, ayuqVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new aytj();
    }

    public final int c() {
        return getInt(cO(2, ayuu.a));
    }

    public final long e() {
        return getLong(cO(0, ayuu.a));
    }

    public final auej f() {
        return auej.b(getInt(cO(4, ayuu.a)));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        ConversationIdType[] conversationIdTypeArr;
        auej[] auejVarArr;
        int i;
        boolean[] zArr;
        dqwl dqwlVar = dqthVar.a;
        int i2 = 1;
        long[] jArrDC = dC(getString(dqthVar.h + 1));
        int length = jArrDC.length;
        if (length != 0) {
            int i3 = 0;
            if (length != 1 || jArrDC[0] != -1) {
                HashSet hashSet = new HashSet();
                dqtm dqtmVar = this.d;
                boolean zDj = dj(0);
                boolean z = dqtmVar.b;
                long[] jArrC = zDj ? z ? dqru.C(null, dt(getString(cO(0, ayuu.a)))) : new long[]{e()} : null;
                dqqf.dz(length, jArrC, new ejxr() { // from class: ayud
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "_id:".concat(String.valueOf(this.a.getString(0)));
                    }
                });
                if (!dj(1)) {
                    conversationIdTypeArr = null;
                } else if (z) {
                    long[] jArrDt = dt(getString(cO(1, ayuu.a)));
                    int length2 = jArrDt.length;
                    ConversationIdType[] conversationIdTypeArr2 = new ConversationIdType[length2];
                    for (int i4 = 0; i4 < length2; i4++) {
                        conversationIdTypeArr2[i4] = new ConversationIdType(jArrDt[i4]);
                    }
                    conversationIdTypeArr = (ConversationIdType[]) dqru.D(null, conversationIdTypeArr2, new ConversationIdType[0]);
                } else {
                    conversationIdTypeArr = new ConversationIdType[]{g()};
                }
                dqqf.dA(length, conversationIdTypeArr, new ejxr() { // from class: ayue
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "conversation_id:".concat(String.valueOf(this.a.getString(1)));
                    }
                });
                int[] iArrA = dj(2) ? z ? dqru.A(null, ds(getString(cO(2, ayuu.a)))) : new int[]{c()} : null;
                dqqf.dy(length, iArrA, new ejxr() { // from class: ayuf
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "participant_id:".concat(String.valueOf(this.a.getString(2)));
                    }
                });
                boolean[] zArrE = dj(3) ? z ? dqru.E(null, dv(getString(cO(3, ayuu.a)))) : new boolean[]{i()} : null;
                dqqf.dB(length, zArrE, new ejxr() { // from class: ayug
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "is_normalized:".concat(String.valueOf(this.a.getString(3)));
                    }
                });
                if (!dj(4)) {
                    auejVarArr = null;
                } else if (z) {
                    int[] iArrDs = ds(getString(cO(4, ayuu.a)));
                    auej[] auejVarArr2 = new auej[iArrDs.length];
                    for (int i5 = 0; i5 < iArrDs.length; i5++) {
                        auej auejVarB = auej.b(iArrDs[i5]);
                        if (auejVarB == null) {
                            throw new IllegalStateException();
                        }
                        auejVarArr2[i5] = auejVarB;
                    }
                    auejVarArr = (auej[]) dqru.D(null, auejVarArr2, new auej[0]);
                } else {
                    auejVarArr = new auej[]{f()};
                }
                dqqf.dA(length, auejVarArr, new ejxr() { // from class: ayuh
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "rcs_group_join_status:".concat(String.valueOf(this.a.getString(4)));
                    }
                });
                boolean[] zArrE2 = dj(5) ? z ? dqru.E(null, dv(getString(cO(5, ayuu.a)))) : new boolean[]{h()} : null;
                dqqf.dB(length, zArrE2, new ejxr() { // from class: ayui
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "is_c2p_only:".concat(String.valueOf(this.a.getString(5)));
                    }
                });
                ekfw ekfwVar = new ekfw();
                int i6 = 0;
                while (i6 < length) {
                    long j = jArrDC[i6];
                    if (j <= 0 || hashSet.contains(Long.valueOf(j))) {
                        i = length;
                        zArr = zArrE;
                    } else {
                        hashSet.add(Long.valueOf(jArrDC[i6]));
                        String[] strArr = ayuu.a;
                        aytl aytlVar = new aytl();
                        aytlVar.aF();
                        aytlVar.aD();
                        long j2 = jArrDC[i6];
                        zArr = zArrE;
                        if (jArrC != null) {
                            long j3 = jArrC[i6];
                            aytlVar.aE(i3);
                            aytlVar.a = j3;
                        }
                        if (conversationIdTypeArr != null) {
                            ConversationIdType conversationIdType = conversationIdTypeArr[i6];
                            aytlVar.aE(i2);
                            aytlVar.b = conversationIdType;
                        }
                        if (iArrA != null) {
                            int i7 = iArrA[i6];
                            aytlVar.aE(2);
                            aytlVar.c = i7;
                        }
                        if (zArr != null) {
                            boolean z2 = zArr[i6];
                            aytlVar.aE(3);
                            aytlVar.d = z2;
                        }
                        if (auejVarArr != null) {
                            auej auejVar = auejVarArr[i6];
                            aytlVar.aE(4);
                            aytlVar.e = auejVar;
                        }
                        if (zArrE2 != null) {
                            boolean z3 = zArrE2[i6];
                            int i8 = aytlVar.aB;
                            if (i8 < 70) {
                                dqru.x("is_c2p_only", i8);
                            }
                            aytlVar.aE(5);
                            aytlVar.f = z3;
                        }
                        aytj aytjVar = new aytj();
                        aytjVar.aD(aytlVar.aB());
                        i = length;
                        aytjVar.a = aytlVar.a;
                        aytjVar.b = aytlVar.b;
                        aytjVar.c = aytlVar.c;
                        aytjVar.d = aytlVar.d;
                        aytjVar.e = aytlVar.e;
                        aytjVar.f = aytlVar.f;
                        aytjVar.cM = aytlVar.aC();
                        ekfwVar.h(aytjVar);
                    }
                    i6++;
                    length = i;
                    zArrE = zArr;
                    i2 = 1;
                    i3 = 0;
                }
                return ekfwVar.g();
            }
        }
        int i9 = ekgb.d;
        return ekoe.a;
    }

    public final ConversationIdType g() {
        return new ConversationIdType(getLong(cO(1, ayuu.a)));
    }

    public final boolean h() {
        return getInt(cO(5, ayuu.a)) == 1;
    }

    public final boolean i() {
        return getInt(cO(3, ayuu.a)) == 1;
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
