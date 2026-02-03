package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqqq extends dqqf implements bqqc {
    @Deprecated
    public bqqq(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, bqqx bqqxVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, bqrg.a, dqwjVar, dqtmVar, bqqxVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new bqov();
    }

    @Override // defpackage.bqqc
    public final ekgb c() {
        ekfw ekfwVar = new ekfw();
        while (moveToNext()) {
            m();
            ekfwVar.h(m());
        }
        return ekfwVar.g();
    }

    @Override // defpackage.bqqc
    public final ekgb e() {
        ekfw ekfwVar = new ekfw();
        while (moveToNext()) {
            i();
            ekfwVar.h(Integer.valueOf(i()));
        }
        return ekfwVar.g();
    }

    public final float f() {
        return getFloat(cO(4, bqrg.a));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        MessageIdType[] messageIdTypeArr;
        ConversationIdType[] conversationIdTypeArr;
        eoff[] eoffVarArr;
        long[] jArr;
        eoeo[] eoeoVarArr;
        ConversationIdType[] conversationIdTypeArr2;
        eykc[] eykcVarArr;
        int[] iArr;
        eykc[] eykcVarArr2;
        eofg[] eofgVarArr;
        int[] iArr2;
        eofg[] eofgVarArr2;
        dqwl dqwlVar = dqthVar.a;
        long[] jArrDC = dC(getString(dqthVar.h + 1));
        int length = jArrDC.length;
        if (length != 0) {
            if (length != 1 || jArrDC[0] != -1) {
                HashSet hashSet = new HashSet();
                dqtm dqtmVar = this.d;
                boolean zDj = dj(0);
                boolean z = dqtmVar.b;
                long[] jArrC = zDj ? z ? dqru.C(null, dt(getString(cO(0, bqrg.a)))) : new long[]{k()} : null;
                dqqf.dz(length, jArrC, new ejxr() { // from class: bqqd
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "_id:".concat(String.valueOf(this.a.getString(0)));
                    }
                });
                if (!dj(1)) {
                    messageIdTypeArr = null;
                } else if (z) {
                    long[] jArrDt = dt(getString(cO(1, bqrg.a)));
                    int length2 = jArrDt.length;
                    MessageIdType[] messageIdTypeArr2 = new MessageIdType[length2];
                    for (int i = 0; i < length2; i++) {
                        messageIdTypeArr2[i] = new MessageIdType(jArrDt[i]);
                    }
                    messageIdTypeArr = (MessageIdType[]) dqru.D(null, messageIdTypeArr2, new MessageIdType[0]);
                } else {
                    messageIdTypeArr = new MessageIdType[]{m()};
                }
                dqqf.dA(length, messageIdTypeArr, new ejxr() { // from class: bqqk
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "message_id:".concat(String.valueOf(this.a.getString(1)));
                    }
                });
                if (!dj(2)) {
                    conversationIdTypeArr = null;
                } else if (z) {
                    long[] jArrDt2 = dt(getString(cO(2, bqrg.a)));
                    int length3 = jArrDt2.length;
                    ConversationIdType[] conversationIdTypeArr3 = new ConversationIdType[length3];
                    for (int i2 = 0; i2 < length3; i2++) {
                        conversationIdTypeArr3[i2] = new ConversationIdType(jArrDt2[i2]);
                    }
                    conversationIdTypeArr = (ConversationIdType[]) dqru.D(null, conversationIdTypeArr3, new ConversationIdType[0]);
                } else {
                    conversationIdTypeArr = new ConversationIdType[]{l()};
                }
                dqqf.dA(length, conversationIdTypeArr, new ejxr() { // from class: bqql
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "conversation_id:".concat(String.valueOf(this.a.getString(2)));
                    }
                });
                int[] iArrA = dj(3) ? z ? dqru.A(null, ds(getString(cO(3, bqrg.a)))) : new int[]{i()} : null;
                dqqf.dy(length, iArrA, new ejxr() { // from class: bqqm
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "source:".concat(String.valueOf(this.a.getString(3)));
                    }
                });
                float[] fArrI = dj(4) ? z ? dqru.I(dr(getString(cO(4, bqrg.a)))) : new float[]{f()} : null;
                dqqf.dx(length, fArrI, new ejxr() { // from class: bqqn
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "score:".concat(String.valueOf(this.a.getString(4)));
                    }
                });
                if (!dj(5)) {
                    eoffVarArr = null;
                } else if (z) {
                    int[] iArrDs = ds(getString(cO(5, bqrg.a)));
                    eoff[] eoffVarArr2 = new eoff[iArrDs.length];
                    for (int i3 = 0; i3 < iArrDs.length; i3++) {
                        eoff eoffVarB = eoff.b(iArrDs[i3]);
                        if (eoffVarB == null) {
                            throw new IllegalStateException();
                        }
                        eoffVarArr2[i3] = eoffVarB;
                    }
                    eoffVarArr = (eoff[]) dqru.D(null, eoffVarArr2, new eoff[0]);
                } else {
                    eoffVarArr = new eoff[]{o()};
                }
                dqqf.dA(length, eoffVarArr, new ejxr() { // from class: bqqo
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "outcome:".concat(String.valueOf(this.a.getString(5)));
                    }
                });
                String[] strArr = dj(6) ? z ? (String[]) dqru.D(null, du(getString(cO(6, bqrg.a))), new String[0]) : new String[]{r()} : null;
                dqqf.dA(length, strArr, new ejxr() { // from class: bqqp
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "ares_initiated_by:".concat(String.valueOf(this.a.getString(6)));
                    }
                });
                long[] jArrC2 = dj(7) ? z ? dqru.C(null, dt(getString(cO(7, bqrg.a)))) : new long[]{j()} : null;
                dqqf.dz(length, jArrC2, new ejxr() { // from class: bqqe
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "classification_timestamp:".concat(String.valueOf(this.a.getString(7)));
                    }
                });
                if (!dj(8)) {
                    jArr = jArrDC;
                    eoeoVarArr = null;
                } else if (z) {
                    int[] iArrDs2 = ds(getString(cO(8, bqrg.a)));
                    eoeo[] eoeoVarArr2 = new eoeo[iArrDs2.length];
                    jArr = jArrDC;
                    for (int i4 = 0; i4 < iArrDs2.length; i4++) {
                        eoeo eoeoVarB = eoeo.b(iArrDs2[i4]);
                        if (eoeoVarB == null) {
                            throw new IllegalStateException();
                        }
                        eoeoVarArr2[i4] = eoeoVarB;
                    }
                    eoeoVarArr = (eoeo[]) dqru.D(null, eoeoVarArr2, new eoeo[0]);
                } else {
                    jArr = jArrDC;
                    eoeoVarArr = new eoeo[]{n()};
                }
                dqqf.dA(length, eoeoVarArr, new ejxr() { // from class: bqqf
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "trigger:".concat(String.valueOf(this.a.getString(8)));
                    }
                });
                if (!dj(9)) {
                    conversationIdTypeArr2 = conversationIdTypeArr;
                    eykcVarArr = null;
                } else if (z) {
                    int[] iArrDs3 = ds(getString(cO(9, bqrg.a)));
                    eykc[] eykcVarArr3 = new eykc[iArrDs3.length];
                    conversationIdTypeArr2 = conversationIdTypeArr;
                    for (int i5 = 0; i5 < iArrDs3.length; i5++) {
                        eykc eykcVarB = eykc.b(iArrDs3[i5]);
                        if (eykcVarB == null) {
                            throw new IllegalStateException();
                        }
                        eykcVarArr3[i5] = eykcVarB;
                    }
                    eykcVarArr = (eykc[]) dqru.D(null, eykcVarArr3, new eykc[0]);
                } else {
                    conversationIdTypeArr2 = conversationIdTypeArr;
                    eykcVarArr = new eykc[]{q()};
                }
                dqqf.dA(length, eykcVarArr, new ejxr() { // from class: bqqg
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "action_type:".concat(String.valueOf(this.a.getString(9)));
                    }
                });
                int[] iArrA2 = dj(10) ? z ? dqru.A(null, ds(getString(cO(10, bqrg.a)))) : new int[]{g()} : null;
                dqqf.dy(length, iArrA2, new ejxr() { // from class: bqqh
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "action_contributors:".concat(String.valueOf(this.a.getString(10)));
                    }
                });
                if (!dj(11)) {
                    iArr = iArrA2;
                    eykcVarArr2 = eykcVarArr;
                    eofgVarArr = null;
                } else if (z) {
                    int[] iArrDs4 = ds(getString(cO(11, bqrg.a)));
                    eofg[] eofgVarArr3 = new eofg[iArrDs4.length];
                    iArr = iArrA2;
                    eykcVarArr2 = eykcVarArr;
                    for (int i6 = 0; i6 < iArrDs4.length; i6++) {
                        eofg eofgVarB = eofg.b(iArrDs4[i6]);
                        if (eofgVarB == null) {
                            throw new IllegalStateException();
                        }
                        eofgVarArr3[i6] = eofgVarB;
                    }
                    eofgVarArr = (eofg[]) dqru.D(null, eofgVarArr3, new eofg[0]);
                } else {
                    iArr = iArrA2;
                    eykcVarArr2 = eykcVarArr;
                    eofgVarArr = new eofg[]{p()};
                }
                dqqf.dA(length, eofgVarArr, new ejxr() { // from class: bqqi
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "error_code:".concat(String.valueOf(this.a.getString(11)));
                    }
                });
                int[] iArrA3 = dj(12) ? z ? dqru.A(null, ds(getString(cO(12, bqrg.a)))) : new int[]{h()} : null;
                dqqf.dy(length, iArrA3, new ejxr() { // from class: bqqj
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "reclassification_index:".concat(String.valueOf(this.a.getString(12)));
                    }
                });
                ekfw ekfwVar = new ekfw();
                int i7 = 0;
                while (i7 < length) {
                    long j = jArr[i7];
                    if (j <= 0 || hashSet.contains(Long.valueOf(j))) {
                        iArr2 = iArrA3;
                        eofgVarArr2 = eofgVarArr;
                    } else {
                        hashSet.add(Long.valueOf(jArr[i7]));
                        String[] strArr2 = bqrg.a;
                        bqox bqoxVar = new bqox();
                        bqoxVar.aF();
                        bqoxVar.aD();
                        long j2 = jArr[i7];
                        iArr2 = iArrA3;
                        if (jArrC != null) {
                            long j3 = jArrC[i7];
                            eofgVarArr2 = eofgVarArr;
                            bqoxVar.aE(0);
                            bqoxVar.a = j3;
                        } else {
                            eofgVarArr2 = eofgVarArr;
                        }
                        if (messageIdTypeArr != null) {
                            bqoxVar.h(messageIdTypeArr[i7]);
                        }
                        if (conversationIdTypeArr2 != null) {
                            bqoxVar.f(conversationIdTypeArr2[i7]);
                        }
                        if (iArrA != null) {
                            bqoxVar.l(iArrA[i7]);
                        }
                        if (fArrI != null) {
                            bqoxVar.k(fArrI[i7]);
                        }
                        if (eoffVarArr != null) {
                            bqoxVar.i(eoffVarArr[i7]);
                        }
                        if (strArr != null) {
                            bqoxVar.d(strArr[i7]);
                        }
                        if (jArrC2 != null) {
                            bqoxVar.e(jArrC2[i7]);
                        }
                        if (eoeoVarArr != null) {
                            bqoxVar.m(eoeoVarArr[i7]);
                        }
                        if (eykcVarArr2 != null) {
                            bqoxVar.c(eykcVarArr2[i7]);
                        }
                        if (iArr != null) {
                            bqoxVar.b(iArr[i7]);
                        }
                        if (eofgVarArr2 != null) {
                            bqoxVar.g(eofgVarArr2[i7]);
                        }
                        if (iArr2 != null) {
                            bqoxVar.j(iArr2[i7]);
                        }
                        ekfwVar.h(bqoxVar.a());
                    }
                    i7++;
                    iArrA3 = iArr2;
                    eofgVarArr = eofgVarArr2;
                }
                return ekfwVar.g();
            }
        }
        int i8 = ekgb.d;
        return ekoe.a;
    }

    public final int g() {
        return getInt(cO(10, bqrg.a));
    }

    public final int h() {
        return getInt(cO(12, bqrg.a));
    }

    public final int i() {
        return getInt(cO(3, bqrg.a));
    }

    public final long j() {
        return getLong(cO(7, bqrg.a));
    }

    public final long k() {
        return getLong(cO(0, bqrg.a));
    }

    public final ConversationIdType l() {
        return new ConversationIdType(getLong(cO(2, bqrg.a)));
    }

    public final MessageIdType m() {
        return new MessageIdType(getLong(cO(1, bqrg.a)));
    }

    public final eoeo n() {
        return eoeo.b(getInt(cO(8, bqrg.a)));
    }

    public final eoff o() {
        return eoff.b(getInt(cO(5, bqrg.a)));
    }

    public final eofg p() {
        return eofg.b(getInt(cO(11, bqrg.a)));
    }

    public final eykc q() {
        return eykc.b(getInt(cO(9, bqrg.a)));
    }

    public final String r() {
        return getString(cO(6, bqrg.a));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
