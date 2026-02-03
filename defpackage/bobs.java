package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bobs extends dqqf implements bobl {
    @Deprecated
    public bobs(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, bobz bobzVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, bocg.a, dqwjVar, dqtmVar, bobzVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new boas();
    }

    @Override // defpackage.bobl
    public final ekgb c() {
        ekfw ekfwVar = new ekfw();
        while (moveToNext()) {
            if (i() != null) {
                ekfwVar.h(i());
            }
        }
        return ekfwVar.g();
    }

    public final long e() {
        return getLong(cO(2, bocg.a));
    }

    public final auej f() {
        return auej.b(getInt(cO(4, bocg.a)));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        ConversationIdType[] conversationIdTypeArr;
        auej[] auejVarArr;
        HashSet hashSet;
        dqwl dqwlVar = dqthVar.a;
        long[] jArrDC = dC(getString(dqthVar.h + 1));
        int length = jArrDC.length;
        if (length != 0) {
            int i = 0;
            if (length != 1 || jArrDC[0] != -1) {
                HashSet hashSet2 = new HashSet();
                dqtm dqtmVar = this.d;
                boolean zDj = dj(0);
                boolean z = dqtmVar.b;
                bbaj[] bbajVarArr = null;
                String[] strArr = zDj ? z ? (String[]) dqru.D(null, du(getString(cO(0, bocg.a))), new String[0]) : new String[]{i()} : null;
                dqqf.dA(length, strArr, new ejxr() { // from class: bobm
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "_id:".concat(String.valueOf(this.a.getString(0)));
                    }
                });
                if (!dj(1)) {
                    conversationIdTypeArr = null;
                } else if (z) {
                    long[] jArrDt = dt(getString(cO(1, bocg.a)));
                    int length2 = jArrDt.length;
                    ConversationIdType[] conversationIdTypeArr2 = new ConversationIdType[length2];
                    for (int i2 = 0; i2 < length2; i2++) {
                        conversationIdTypeArr2[i2] = new ConversationIdType(jArrDt[i2]);
                    }
                    conversationIdTypeArr = (ConversationIdType[]) dqru.D(null, conversationIdTypeArr2, new ConversationIdType[0]);
                } else {
                    conversationIdTypeArr = new ConversationIdType[]{g()};
                }
                dqqf.dA(length, conversationIdTypeArr, new ejxr() { // from class: bobn
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "conversation_id:".concat(String.valueOf(this.a.getString(1)));
                    }
                });
                long[] jArrC = dj(2) ? z ? dqru.C(null, dt(getString(cO(2, bocg.a)))) : new long[]{e()} : null;
                dqqf.dz(length, jArrC, new ejxr() { // from class: bobo
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "participant_id:".concat(String.valueOf(this.a.getString(2)));
                    }
                });
                boolean[] zArrE = dj(3) ? z ? dqru.E(null, dv(getString(cO(3, bocg.a)))) : new boolean[]{j()} : null;
                dqqf.dB(length, zArrE, new ejxr() { // from class: bobp
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "is_normalized:".concat(String.valueOf(this.a.getString(3)));
                    }
                });
                if (!dj(4)) {
                    auejVarArr = null;
                } else if (z) {
                    int[] iArrDs = ds(getString(cO(4, bocg.a)));
                    auej[] auejVarArr2 = new auej[iArrDs.length];
                    for (int i3 = 0; i3 < iArrDs.length; i3++) {
                        auej auejVarB = auej.b(iArrDs[i3]);
                        if (auejVarB == null) {
                            throw new IllegalStateException();
                        }
                        auejVarArr2[i3] = auejVarB;
                    }
                    auejVarArr = (auej[]) dqru.D(null, auejVarArr2, new auej[0]);
                } else {
                    auejVarArr = new auej[]{f()};
                }
                dqqf.dA(length, auejVarArr, new ejxr() { // from class: bobq
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "rcs_group_join_status:".concat(String.valueOf(this.a.getString(4)));
                    }
                });
                if (dj(5)) {
                    if (z) {
                        String[] strArrDu = du(getString(cO(5, bocg.a)));
                        int length3 = strArrDu.length;
                        bbaj[] bbajVarArr2 = new bbaj[length3];
                        for (int i4 = 0; i4 < length3; i4++) {
                            bbajVarArr2[i4] = bbam.a(strArrDu[i4]);
                        }
                        bbajVarArr = (bbaj[]) dqru.D(null, bbajVarArr2, new bbaj[0]);
                    } else {
                        bbajVarArr = new bbaj[]{h()};
                    }
                }
                dqqf.dA(length, bbajVarArr, new ejxr() { // from class: bobr
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "last_modified_by_key:".concat(String.valueOf(this.a.getString(5)));
                    }
                });
                ekfw ekfwVar = new ekfw();
                int i5 = 0;
                while (i5 < length) {
                    long j = jArrDC[i5];
                    if (j <= 0 || hashSet2.contains(Long.valueOf(j))) {
                        hashSet = hashSet2;
                    } else {
                        hashSet2.add(Long.valueOf(jArrDC[i5]));
                        String[] strArr2 = bocg.a;
                        boau boauVar = new boau();
                        boauVar.aF();
                        boauVar.aD();
                        long j2 = jArrDC[i5];
                        if (strArr != null) {
                            String str = strArr[i5];
                            boauVar.aE(i);
                            boauVar.a = str;
                        }
                        if (conversationIdTypeArr != null) {
                            boauVar.b(conversationIdTypeArr[i5]);
                        }
                        hashSet = hashSet2;
                        if (jArrC != null) {
                            boauVar.c(jArrC[i5]);
                        }
                        if (zArrE != null) {
                            boolean z2 = zArrE[i5];
                            int i6 = boauVar.aB;
                            if (i6 < 58090) {
                                dqru.x("is_normalized", i6);
                            }
                            boauVar.aE(3);
                            boauVar.d = z2;
                        }
                        if (auejVarArr != null) {
                            boauVar.d(auejVarArr[i5]);
                        }
                        if (bbajVarArr != null) {
                            bbaj bbajVar = bbajVarArr[i5];
                            int i7 = boauVar.aB;
                            if (i7 < 59440) {
                                dqru.x("last_modified_by_key", i7);
                            }
                            boauVar.aE(5);
                            boauVar.f = bbajVar;
                        }
                        ekfwVar.h(boauVar.a());
                    }
                    i5++;
                    hashSet2 = hashSet;
                    i = 0;
                }
                return ekfwVar.g();
            }
        }
        int i8 = ekgb.d;
        return ekoe.a;
    }

    public final ConversationIdType g() {
        return new ConversationIdType(getLong(cO(1, bocg.a)));
    }

    public final bbaj h() {
        return bbam.a(getString(cO(5, bocg.a)));
    }

    public final String i() {
        return getString(cO(0, bocg.a));
    }

    public final boolean j() {
        return getInt(cO(3, bocg.a)) == 1;
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
