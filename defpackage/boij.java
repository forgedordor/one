package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class boij extends dqqf implements boie {
    @Deprecated
    public boij(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, boip boipVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, boiv.a, dqwjVar, dqtmVar, boipVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new bohn();
    }

    @Override // defpackage.boie
    public final long c() {
        return getLong(cO(1, boiv.a));
    }

    @Override // defpackage.boie
    public final ConversationIdType e() {
        return new ConversationIdType(getLong(cO(0, boiv.a)));
    }

    public final auej f() {
        return auej.b(getInt(cO(2, boiv.a)));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        ConversationIdType[] conversationIdTypeArr;
        auej[] auejVarArr;
        dqwl dqwlVar = dqthVar.a;
        long[] jArrDC = dC(getString(dqthVar.h + 1));
        int length = jArrDC.length;
        if (length != 0) {
            if (length != 1 || jArrDC[0] != -1) {
                HashSet hashSet = new HashSet();
                dqtm dqtmVar = this.d;
                boolean zDj = dj(0);
                boolean z = dqtmVar.b;
                bbaj[] bbajVarArr = null;
                if (!zDj) {
                    conversationIdTypeArr = null;
                } else if (z) {
                    long[] jArrDt = dt(getString(cO(0, boiv.a)));
                    int length2 = jArrDt.length;
                    ConversationIdType[] conversationIdTypeArr2 = new ConversationIdType[length2];
                    for (int i = 0; i < length2; i++) {
                        conversationIdTypeArr2[i] = new ConversationIdType(jArrDt[i]);
                    }
                    conversationIdTypeArr = (ConversationIdType[]) dqru.D(null, conversationIdTypeArr2, new ConversationIdType[0]);
                } else {
                    conversationIdTypeArr = new ConversationIdType[]{e()};
                }
                dqqf.dA(length, conversationIdTypeArr, new ejxr() { // from class: boif
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "conversation_id:".concat(String.valueOf(this.a.getString(0)));
                    }
                });
                long[] jArrC = dj(1) ? z ? dqru.C(null, dt(getString(cO(1, boiv.a)))) : new long[]{c()} : null;
                dqqf.dz(length, jArrC, new ejxr() { // from class: boig
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "participant_id:".concat(String.valueOf(this.a.getString(1)));
                    }
                });
                if (!dj(2)) {
                    auejVarArr = null;
                } else if (z) {
                    int[] iArrDs = ds(getString(cO(2, boiv.a)));
                    auej[] auejVarArr2 = new auej[iArrDs.length];
                    for (int i2 = 0; i2 < iArrDs.length; i2++) {
                        auej auejVarB = auej.b(iArrDs[i2]);
                        if (auejVarB == null) {
                            throw new IllegalStateException();
                        }
                        auejVarArr2[i2] = auejVarB;
                    }
                    auejVarArr = (auej[]) dqru.D(null, auejVarArr2, new auej[0]);
                } else {
                    auejVarArr = new auej[]{f()};
                }
                dqqf.dA(length, auejVarArr, new ejxr() { // from class: boih
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "rcs_group_join_status:".concat(String.valueOf(this.a.getString(2)));
                    }
                });
                if (dj(3)) {
                    if (z) {
                        String[] strArrDu = du(getString(cO(3, boiv.a)));
                        int length3 = strArrDu.length;
                        bbaj[] bbajVarArr2 = new bbaj[length3];
                        for (int i3 = 0; i3 < length3; i3++) {
                            bbajVarArr2[i3] = bbam.a(strArrDu[i3]);
                        }
                        bbajVarArr = (bbaj[]) dqru.D(null, bbajVarArr2, new bbaj[0]);
                    } else {
                        bbajVarArr = new bbaj[]{g()};
                    }
                }
                dqqf.dA(length, bbajVarArr, new ejxr() { // from class: boii
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "last_modified_by_key:".concat(String.valueOf(this.a.getString(3)));
                    }
                });
                ekfw ekfwVar = new ekfw();
                for (int i4 = 0; i4 < length; i4++) {
                    long j = jArrDC[i4];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(jArrDC[i4]));
                        String[] strArr = boiv.a;
                        bohr bohrVar = new bohr();
                        bohrVar.aF();
                        bohrVar.aD();
                        long j2 = jArrDC[i4];
                        if (conversationIdTypeArr != null) {
                            bohrVar.c(conversationIdTypeArr[i4]);
                        }
                        if (jArrC != null) {
                            bohrVar.e(jArrC[i4]);
                        }
                        if (auejVarArr != null) {
                            bohrVar.f(auejVarArr[i4]);
                        }
                        if (bbajVarArr != null) {
                            bohrVar.d(bbajVarArr[i4]);
                        }
                        ekfwVar.h(bohrVar.a());
                    }
                }
                return ekfwVar.g();
            }
        }
        int i5 = ekgb.d;
        return ekoe.a;
    }

    public final bbaj g() {
        return bbam.a(getString(cO(3, boiv.a)));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
