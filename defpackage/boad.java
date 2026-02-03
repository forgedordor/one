package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.time.Instant;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class boad extends dqqf implements bnzt {
    @Deprecated
    public boad(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, boah boahVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, boal.a, dqwjVar, dqtmVar, boahVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new bnyw();
    }

    public final long c() {
        return getLong(cO(2, boal.a));
    }

    public final long e() {
        return getLong(cO(5, boal.a));
    }

    public final auej f() {
        return auej.b(getInt(cO(7, boal.a)));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        Instant[] instantArr;
        int i;
        ConversationIdType[] conversationIdTypeArr;
        auej[] auejVarArr;
        bbaj[] bbajVarArr;
        long[] jArr;
        ekfw ekfwVar;
        ekfw ekfwVar2;
        dqwl dqwlVar = dqthVar.a;
        long[] jArrDC = dC(getString(dqthVar.h + 1));
        int length = jArrDC.length;
        if (length == 0 || (length == 1 && jArrDC[0] == -1)) {
            int i2 = ekgb.d;
            return ekoe.a;
        }
        HashSet hashSet = new HashSet();
        dqtm dqtmVar = this.d;
        boolean zDj = dj(0);
        boolean z = dqtmVar.b;
        String[] strArr = zDj ? z ? (String[]) dqru.D(null, du(getString(cO(0, boal.a))), new String[0]) : new String[]{k()} : null;
        dqqf.dA(length, strArr, new ejxr() { // from class: bnzu
            @Override // defpackage.ejxr
            public final Object get() {
                return "_id:".concat(String.valueOf(this.a.getString(0)));
            }
        });
        if (!dj(1)) {
            instantArr = null;
        } else if (z) {
            long[] jArrDt = dt(getString(cO(1, boal.a)));
            int length2 = jArrDt.length;
            Instant[] instantArr2 = new Instant[length2];
            for (int i3 = 0; i3 < length2; i3++) {
                instantArr2[i3] = bart.b(jArrDt[i3]);
            }
            instantArr = (Instant[]) dqru.D(null, instantArr2, new Instant[0]);
        } else {
            instantArr = new Instant[]{i()};
        }
        dqqf.dA(length, instantArr, new ejxr() { // from class: bnzv
            @Override // defpackage.ejxr
            public final Object get() {
                return "operation_datetime:".concat(String.valueOf(this.a.getString(1)));
            }
        });
        long[] jArrC = dj(2) ? z ? dqru.C(null, dt(getString(cO(2, boal.a)))) : new long[]{c()} : null;
        dqqf.dz(length, jArrC, new ejxr() { // from class: bnzw
            @Override // defpackage.ejxr
            public final Object get() {
                return "operation_type:".concat(String.valueOf(this.a.getString(2)));
            }
        });
        String[] strArr2 = dj(3) ? z ? (String[]) dqru.D(null, du(getString(cO(3, boal.a))), new String[0]) : new String[]{j()} : null;
        dqqf.dA(length, strArr2, new ejxr() { // from class: bnzx
            @Override // defpackage.ejxr
            public final Object get() {
                return "conversation_participants_id:".concat(String.valueOf(this.a.getString(3)));
            }
        });
        if (!dj(4)) {
            i = length;
            conversationIdTypeArr = null;
        } else if (z) {
            long[] jArrDt2 = dt(getString(cO(4, boal.a)));
            int length3 = jArrDt2.length;
            ConversationIdType[] conversationIdTypeArr2 = new ConversationIdType[length3];
            int i4 = 0;
            while (i4 < length3) {
                conversationIdTypeArr2[i4] = new ConversationIdType(jArrDt2[i4]);
                i4++;
                length = length;
            }
            i = length;
            conversationIdTypeArr = (ConversationIdType[]) dqru.D(null, conversationIdTypeArr2, new ConversationIdType[0]);
        } else {
            i = length;
            conversationIdTypeArr = new ConversationIdType[]{g()};
        }
        int i5 = i;
        dqqf.dA(i5, conversationIdTypeArr, new ejxr() { // from class: bnzy
            @Override // defpackage.ejxr
            public final Object get() {
                return "conversation_id:".concat(String.valueOf(this.a.getString(4)));
            }
        });
        long[] jArrC2 = dj(5) ? z ? dqru.C(null, dt(getString(cO(5, boal.a)))) : new long[]{e()} : null;
        dqqf.dz(i5, jArrC2, new ejxr() { // from class: bnzz
            @Override // defpackage.ejxr
            public final Object get() {
                return "participant_id:".concat(String.valueOf(this.a.getString(5)));
            }
        });
        boolean[] zArrE = dj(6) ? z ? dqru.E(null, dv(getString(cO(6, boal.a)))) : new boolean[]{l()} : null;
        dqqf.dB(i5, zArrE, new ejxr() { // from class: boaa
            @Override // defpackage.ejxr
            public final Object get() {
                return "is_normalized:".concat(String.valueOf(this.a.getString(6)));
            }
        });
        if (!dj(7)) {
            auejVarArr = null;
        } else if (z) {
            int[] iArrDs = ds(getString(cO(7, boal.a)));
            auej[] auejVarArr2 = new auej[iArrDs.length];
            for (int i6 = 0; i6 < iArrDs.length; i6++) {
                auej auejVarB = auej.b(iArrDs[i6]);
                if (auejVarB == null) {
                    throw new IllegalStateException();
                }
                auejVarArr2[i6] = auejVarB;
            }
            auejVarArr = (auej[]) dqru.D(null, auejVarArr2, new auej[0]);
        } else {
            auejVarArr = new auej[]{f()};
        }
        dqqf.dA(i5, auejVarArr, new ejxr() { // from class: boab
            @Override // defpackage.ejxr
            public final Object get() {
                return "rcs_group_join_status:".concat(String.valueOf(this.a.getString(7)));
            }
        });
        if (!dj(8)) {
            bbajVarArr = null;
        } else if (z) {
            String[] strArrDu = du(getString(cO(8, boal.a)));
            int length4 = strArrDu.length;
            bbaj[] bbajVarArr2 = new bbaj[length4];
            for (int i7 = 0; i7 < length4; i7++) {
                bbajVarArr2[i7] = bbam.a(strArrDu[i7]);
            }
            bbajVarArr = (bbaj[]) dqru.D(null, bbajVarArr2, new bbaj[0]);
        } else {
            bbajVarArr = new bbaj[]{h()};
        }
        dqqf.dA(i5, bbajVarArr, new ejxr() { // from class: boac
            @Override // defpackage.ejxr
            public final Object get() {
                return "last_modified_by_key:".concat(String.valueOf(this.a.getString(8)));
            }
        });
        ekfw ekfwVar3 = new ekfw();
        int i8 = 0;
        while (i8 < i5) {
            long j = jArrDC[i8];
            if (j <= 0 || hashSet.contains(Long.valueOf(j))) {
                jArr = jArrDC;
                ekfwVar = ekfwVar3;
            } else {
                hashSet.add(Long.valueOf(jArrDC[i8]));
                String[] strArr3 = boal.a;
                bnyy bnyyVar = new bnyy();
                bnyyVar.aF();
                bnyyVar.aD();
                long j2 = jArrDC[i8];
                if (strArr != null) {
                    String str = strArr[i8];
                    jArr = jArrDC;
                    bnyyVar.aE(0);
                    bnyyVar.a = str;
                } else {
                    jArr = jArrDC;
                }
                if (instantArr != null) {
                    Instant instant = instantArr[i8];
                    bnyyVar.aE(1);
                    bnyyVar.b = instant;
                }
                if (jArrC != null) {
                    long j3 = jArrC[i8];
                    ekfwVar2 = ekfwVar3;
                    bnyyVar.aE(2);
                    bnyyVar.c = j3;
                } else {
                    ekfwVar2 = ekfwVar3;
                }
                if (strArr2 != null) {
                    String str2 = strArr2[i8];
                    bnyyVar.aE(3);
                    bnyyVar.d = str2;
                }
                if (conversationIdTypeArr != null) {
                    ConversationIdType conversationIdType = conversationIdTypeArr[i8];
                    bnyyVar.aE(4);
                    bnyyVar.e = conversationIdType;
                }
                if (jArrC2 != null) {
                    long j4 = jArrC2[i8];
                    bnyyVar.aE(5);
                    bnyyVar.f = j4;
                }
                if (zArrE != null) {
                    boolean z2 = zArrE[i8];
                    bnyyVar.aE(6);
                    bnyyVar.g = z2;
                }
                if (auejVarArr != null) {
                    auej auejVar = auejVarArr[i8];
                    bnyyVar.aE(7);
                    bnyyVar.h = auejVar;
                }
                if (bbajVarArr != null) {
                    bbaj bbajVar = bbajVarArr[i8];
                    int i9 = bnyyVar.aB;
                    if (i9 < 59440) {
                        dqru.x("last_modified_by_key", i9);
                    }
                    bnyyVar.aE(8);
                    bnyyVar.i = bbajVar;
                }
                bnyw bnywVar = new bnyw();
                bnywVar.aD(bnyyVar.aB());
                bnywVar.a = bnyyVar.a;
                bnywVar.b = bnyyVar.b;
                bnywVar.c = bnyyVar.c;
                bnywVar.d = bnyyVar.d;
                bnywVar.e = bnyyVar.e;
                bnywVar.f = bnyyVar.f;
                bnywVar.g = bnyyVar.g;
                bnywVar.h = bnyyVar.h;
                bnywVar.i = bnyyVar.i;
                bnywVar.cM = bnyyVar.aC();
                ekfwVar = ekfwVar2;
                ekfwVar.h(bnywVar);
            }
            i8++;
            ekfwVar3 = ekfwVar;
            jArrDC = jArr;
        }
        return ekfwVar3.g();
    }

    public final ConversationIdType g() {
        return new ConversationIdType(getLong(cO(4, boal.a)));
    }

    public final bbaj h() {
        return bbam.a(getString(cO(8, boal.a)));
    }

    public final Instant i() {
        return bart.b(getLong(cO(1, boal.a)));
    }

    public final String j() {
        return getString(cO(3, boal.a));
    }

    public final String k() {
        return getString(cO(0, boal.a));
    }

    public final boolean l() {
        return getInt(cO(6, boal.a)) == 1;
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
