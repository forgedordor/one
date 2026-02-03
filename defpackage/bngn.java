package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bngn extends dqqf implements bngf {
    @Deprecated
    public bngn(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, bngt bngtVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, bngz.a, dqwjVar, dqtmVar, bngtVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new bnfl();
    }

    @Override // defpackage.bngf
    public final ekgb c() {
        ekfw ekfwVar = new ekfw();
        while (moveToNext()) {
            j();
            ekfwVar.h(j());
        }
        return ekfwVar.g();
    }

    public final long e() {
        return getLong(cO(6, bngz.a));
    }

    public final long f() {
        return getLong(cO(0, bngz.a));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        ConversationIdType[] conversationIdTypeArr;
        aukf[] aukfVarArr;
        aukd[] aukdVarArr;
        char c;
        long[] jArr;
        dqwl dqwlVar = dqthVar.a;
        long[] jArrDC = dC(getString(dqthVar.h + 1));
        int length = jArrDC.length;
        if (length != 0) {
            int i = 0;
            if (length != 1 || jArrDC[0] != -1) {
                HashSet hashSet = new HashSet();
                dqtm dqtmVar = this.d;
                boolean zDj = dj(0);
                boolean z = dqtmVar.b;
                long[] jArrC = zDj ? z ? dqru.C(null, dt(getString(cO(0, bngz.a)))) : new long[]{f()} : null;
                dqqf.dz(length, jArrC, new ejxr() { // from class: bngg
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "_id:".concat(String.valueOf(this.a.getString(0)));
                    }
                });
                if (!dj(1)) {
                    conversationIdTypeArr = null;
                } else if (z) {
                    long[] jArrDt = dt(getString(cO(1, bngz.a)));
                    int length2 = jArrDt.length;
                    ConversationIdType[] conversationIdTypeArr2 = new ConversationIdType[length2];
                    for (int i2 = 0; i2 < length2; i2++) {
                        conversationIdTypeArr2[i2] = new ConversationIdType(jArrDt[i2]);
                    }
                    conversationIdTypeArr = (ConversationIdType[]) dqru.D(null, conversationIdTypeArr2, new ConversationIdType[0]);
                } else {
                    conversationIdTypeArr = new ConversationIdType[]{j()};
                }
                dqqf.dA(length, conversationIdTypeArr, new ejxr() { // from class: bngh
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "conversation_id:".concat(String.valueOf(this.a.getString(1)));
                    }
                });
                if (!dj(2)) {
                    aukfVarArr = null;
                } else if (z) {
                    int[] iArrDs = ds(getString(cO(2, bngz.a)));
                    aukf[] aukfVarArr2 = new aukf[iArrDs.length];
                    for (int i3 = 0; i3 < iArrDs.length; i3++) {
                        aukf aukfVarB = aukf.b(iArrDs[i3]);
                        if (aukfVarB == null) {
                            throw new IllegalStateException();
                        }
                        aukfVarArr2[i3] = aukfVarB;
                    }
                    aukfVarArr = (aukf[]) dqru.D(null, aukfVarArr2, new aukf[0]);
                } else {
                    aukfVarArr = new aukf[]{i()};
                }
                dqqf.dA(length, aukfVarArr, new ejxr() { // from class: bngi
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "classification_type:".concat(String.valueOf(this.a.getString(2)));
                    }
                });
                if (!dj(3)) {
                    aukdVarArr = null;
                } else if (z) {
                    int[] iArrDs2 = ds(getString(cO(3, bngz.a)));
                    aukd[] aukdVarArr2 = new aukd[iArrDs2.length];
                    for (int i4 = 0; i4 < iArrDs2.length; i4++) {
                        aukd aukdVarB = aukd.b(iArrDs2[i4]);
                        if (aukdVarB == null) {
                            throw new IllegalStateException();
                        }
                        aukdVarArr2[i4] = aukdVarB;
                    }
                    aukdVarArr = (aukd[]) dqru.D(null, aukdVarArr2, new aukd[0]);
                } else {
                    aukdVarArr = new aukd[]{h()};
                }
                dqqf.dA(length, aukdVarArr, new ejxr() { // from class: bngj
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "classification_state:".concat(String.valueOf(this.a.getString(3)));
                    }
                });
                String[] strArr = dj(4) ? z ? (String[]) dqru.D(null, du(getString(cO(4, bngz.a))), new String[0]) : new String[]{k()} : null;
                dqqf.dA(length, strArr, new ejxr() { // from class: bngk
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "date:".concat(String.valueOf(this.a.getString(4)));
                    }
                });
                char c2 = 5;
                long[] jArrC2 = dj(5) ? z ? dqru.C(null, dt(getString(cO(5, bngz.a)))) : new long[]{g()} : null;
                dqqf.dz(length, jArrC2, new ejxr() { // from class: bngl
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "impression_count:".concat(String.valueOf(this.a.getString(5)));
                    }
                });
                long[] jArrC3 = dj(6) ? z ? dqru.C(null, dt(getString(cO(6, bngz.a)))) : new long[]{e()} : null;
                dqqf.dz(length, jArrC3, new ejxr() { // from class: bngm
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "generated_timestamp:".concat(String.valueOf(this.a.getString(6)));
                    }
                });
                ekfw ekfwVar = new ekfw();
                int i5 = 0;
                while (i5 < length) {
                    long j = jArrDC[i5];
                    if (j <= 0 || hashSet.contains(Long.valueOf(j))) {
                        c = c2;
                        jArr = jArrC2;
                    } else {
                        hashSet.add(Long.valueOf(jArrDC[i5]));
                        String[] strArr2 = bngz.a;
                        bnfn bnfnVar = new bnfn();
                        bnfnVar.aF();
                        bnfnVar.aD();
                        long j2 = jArrDC[i5];
                        jArr = jArrC2;
                        if (jArrC != null) {
                            long j3 = jArrC[i5];
                            bnfnVar.aE(i);
                            bnfnVar.a = j3;
                        }
                        if (conversationIdTypeArr != null) {
                            bnfnVar.d(conversationIdTypeArr[i5]);
                        }
                        if (aukfVarArr != null) {
                            bnfnVar.c(aukfVarArr[i5]);
                        }
                        if (aukdVarArr != null) {
                            bnfnVar.b(aukdVarArr[i5]);
                        }
                        if (strArr != null) {
                            bnfnVar.e(strArr[i5]);
                        }
                        if (jArr != null) {
                            long j4 = jArr[i5];
                            int i6 = bnfnVar.aB;
                            if (i6 < 58840) {
                                dqru.x("impression_count", i6);
                            }
                            c = 5;
                            bnfnVar.aE(5);
                            bnfnVar.f = j4;
                        } else {
                            c = 5;
                        }
                        if (jArrC3 != null) {
                            bnfnVar.f(jArrC3[i5]);
                        }
                        ekfwVar.h(bnfnVar.a());
                    }
                    i5++;
                    c2 = c;
                    jArrC2 = jArr;
                    i = 0;
                }
                return ekfwVar.g();
            }
        }
        int i7 = ekgb.d;
        return ekoe.a;
    }

    public final long g() {
        return getLong(cO(5, bngz.a));
    }

    public final aukd h() {
        return aukd.b(getInt(cO(3, bngz.a)));
    }

    public final aukf i() {
        return aukf.b(getInt(cO(2, bngz.a)));
    }

    public final ConversationIdType j() {
        return new ConversationIdType(getLong(cO(1, bngz.a)));
    }

    public final String k() {
        return getString(cO(4, bngz.a));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
