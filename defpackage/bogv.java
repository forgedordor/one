package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.time.Instant;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bogv extends dqqf implements bogn {
    @Deprecated
    public bogv(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, bogz bogzVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, bohb.a, dqwjVar, dqtmVar, bogzVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new bofu();
    }

    public final long c() {
        return getLong(cO(0, bohb.a));
    }

    public final long e() {
        return getLong(cO(2, bohb.a));
    }

    public final long f() {
        return getLong(cO(4, bohb.a));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        Instant[] instantArr;
        long[] jArr;
        ConversationIdType[] conversationIdTypeArr;
        auej[] auejVarArr;
        HashSet hashSet;
        char c;
        long[] jArr2;
        auej[] auejVarArr2;
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
                long[] jArrC = zDj ? z ? dqru.C(null, dt(getString(cO(0, bohb.a)))) : new long[]{c()} : null;
                dqqf.dz(length, jArrC, new ejxr() { // from class: bogo
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "_id:".concat(String.valueOf(this.a.getString(0)));
                    }
                });
                if (!dj(1)) {
                    instantArr = null;
                } else if (z) {
                    long[] jArrDt = dt(getString(cO(1, bohb.a)));
                    int length2 = jArrDt.length;
                    Instant[] instantArr2 = new Instant[length2];
                    for (int i2 = 0; i2 < length2; i2++) {
                        instantArr2[i2] = bart.b(jArrDt[i2]);
                    }
                    instantArr = (Instant[]) dqru.D(null, instantArr2, new Instant[0]);
                } else {
                    instantArr = new Instant[]{j()};
                }
                dqqf.dA(length, instantArr, new ejxr() { // from class: bogp
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "operation_datetime:".concat(String.valueOf(this.a.getString(1)));
                    }
                });
                long[] jArrC2 = dj(2) ? z ? dqru.C(null, dt(getString(cO(2, bohb.a)))) : new long[]{e()} : null;
                dqqf.dz(length, jArrC2, new ejxr() { // from class: bogq
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "operation_type:".concat(String.valueOf(this.a.getString(2)));
                    }
                });
                if (!dj(3)) {
                    jArr = jArrC2;
                    conversationIdTypeArr = null;
                } else if (z) {
                    long[] jArrDt2 = dt(getString(cO(3, bohb.a)));
                    int length3 = jArrDt2.length;
                    ConversationIdType[] conversationIdTypeArr2 = new ConversationIdType[length3];
                    int i3 = 0;
                    while (i3 < length3) {
                        conversationIdTypeArr2[i3] = new ConversationIdType(jArrDt2[i3]);
                        i3++;
                        jArrC2 = jArrC2;
                    }
                    jArr = jArrC2;
                    conversationIdTypeArr = (ConversationIdType[]) dqru.D(null, conversationIdTypeArr2, new ConversationIdType[0]);
                } else {
                    jArr = jArrC2;
                    conversationIdTypeArr = new ConversationIdType[]{h()};
                }
                dqqf.dA(length, conversationIdTypeArr, new ejxr() { // from class: bogr
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "conversation_id:".concat(String.valueOf(this.a.getString(3)));
                    }
                });
                char c2 = 4;
                long[] jArrC3 = dj(4) ? z ? dqru.C(null, dt(getString(cO(4, bohb.a)))) : new long[]{f()} : null;
                dqqf.dz(length, jArrC3, new ejxr() { // from class: bogs
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "participant_id:".concat(String.valueOf(this.a.getString(4)));
                    }
                });
                if (!dj(5)) {
                    auejVarArr = null;
                } else if (z) {
                    int[] iArrDs = ds(getString(cO(5, bohb.a)));
                    auej[] auejVarArr3 = new auej[iArrDs.length];
                    for (int i4 = 0; i4 < iArrDs.length; i4++) {
                        auej auejVarB = auej.b(iArrDs[i4]);
                        if (auejVarB == null) {
                            throw new IllegalStateException();
                        }
                        auejVarArr3[i4] = auejVarB;
                    }
                    auejVarArr = (auej[]) dqru.D(null, auejVarArr3, new auej[0]);
                } else {
                    auejVarArr = new auej[]{g()};
                }
                dqqf.dA(length, auejVarArr, new ejxr() { // from class: bogt
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "rcs_group_join_status:".concat(String.valueOf(this.a.getString(5)));
                    }
                });
                if (dj(6)) {
                    if (z) {
                        String[] strArrDu = du(getString(cO(6, bohb.a)));
                        int length4 = strArrDu.length;
                        bbaj[] bbajVarArr2 = new bbaj[length4];
                        for (int i5 = 0; i5 < length4; i5++) {
                            bbajVarArr2[i5] = bbam.a(strArrDu[i5]);
                        }
                        bbajVarArr = (bbaj[]) dqru.D(null, bbajVarArr2, new bbaj[0]);
                    } else {
                        bbajVarArr = new bbaj[]{i()};
                    }
                }
                dqqf.dA(length, bbajVarArr, new ejxr() { // from class: bogu
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "last_modified_by_key:".concat(String.valueOf(this.a.getString(6)));
                    }
                });
                ekfw ekfwVar = new ekfw();
                int i6 = 0;
                while (i6 < length) {
                    long j = jArrDC[i6];
                    if (j <= 0 || hashSet2.contains(Long.valueOf(j))) {
                        hashSet = hashSet2;
                        c = c2;
                        jArr2 = jArrC3;
                        auejVarArr2 = auejVarArr;
                    } else {
                        hashSet2.add(Long.valueOf(jArrDC[i6]));
                        String[] strArr = bohb.a;
                        bofw bofwVar = new bofw();
                        bofwVar.aF();
                        bofwVar.aD();
                        long j2 = jArrDC[i6];
                        jArr2 = jArrC3;
                        if (jArrC != null) {
                            long j3 = jArrC[i6];
                            bofwVar.aE(i);
                            bofwVar.a = j3;
                        }
                        if (instantArr != null) {
                            Instant instant = instantArr[i6];
                            bofwVar.aE(1);
                            bofwVar.b = instant;
                        }
                        hashSet = hashSet2;
                        if (jArr != null) {
                            long j4 = jArr[i6];
                            bofwVar.aE(2);
                            bofwVar.c = j4;
                        }
                        if (conversationIdTypeArr != null) {
                            ConversationIdType conversationIdType = conversationIdTypeArr[i6];
                            bofwVar.aE(3);
                            bofwVar.d = conversationIdType;
                        }
                        if (jArr2 != null) {
                            long j5 = jArr2[i6];
                            c = 4;
                            bofwVar.aE(4);
                            bofwVar.e = j5;
                        } else {
                            c = 4;
                        }
                        if (auejVarArr != null) {
                            auej auejVar = auejVarArr[i6];
                            bofwVar.aE(5);
                            bofwVar.f = auejVar;
                        }
                        if (bbajVarArr != null) {
                            bbaj bbajVar = bbajVarArr[i6];
                            bofwVar.aE(6);
                            bofwVar.g = bbajVar;
                        }
                        bofu bofuVar = new bofu();
                        bofuVar.aD(bofwVar.aB());
                        auejVarArr2 = auejVarArr;
                        bofuVar.a = bofwVar.a;
                        bofuVar.b = bofwVar.b;
                        bofuVar.c = bofwVar.c;
                        bofuVar.d = bofwVar.d;
                        bofuVar.e = bofwVar.e;
                        bofuVar.f = bofwVar.f;
                        bofuVar.g = bofwVar.g;
                        bofuVar.cM = bofwVar.aC();
                        ekfwVar.h(bofuVar);
                    }
                    i6++;
                    auejVarArr = auejVarArr2;
                    c2 = c;
                    hashSet2 = hashSet;
                    jArrC3 = jArr2;
                    i = 0;
                }
                return ekfwVar.g();
            }
        }
        int i7 = ekgb.d;
        return ekoe.a;
    }

    public final auej g() {
        return auej.b(getInt(cO(5, bohb.a)));
    }

    public final ConversationIdType h() {
        return new ConversationIdType(getLong(cO(3, bohb.a)));
    }

    public final bbaj i() {
        return bbam.a(getString(cO(6, bohb.a)));
    }

    public final Instant j() {
        return bart.b(getLong(cO(1, bohb.a)));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
