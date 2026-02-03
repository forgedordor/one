package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class brkw extends dqqf implements brkj {
    @Deprecated
    public brkw(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, brld brldVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, brlh.a, dqwjVar, dqtmVar, brldVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new brjf();
    }

    @Override // defpackage.brkj
    public final int c() {
        return getInt(cO(8, brlh.a));
    }

    @Override // defpackage.brkj
    public final int e() {
        return getInt(cO(7, brlh.a));
    }

    @Override // defpackage.brkj
    public final long f() {
        return getLong(cO(2, brlh.a));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        MessageIdType[] messageIdTypeArr;
        elqn[] elqnVarArr;
        emig[] emigVarArr;
        ezac[] ezacVarArr;
        eyzv[] eyzvVarArr;
        long[] jArr;
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        ezac[] ezacVarArr2;
        int i;
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
        String[] strArr5 = zDj ? z ? (String[]) dqru.D(null, du(getString(cO(0, brlh.a))), new String[0]) : new String[]{l()} : null;
        dqqf.dA(length, strArr5, new ejxr() { // from class: brkk
            @Override // defpackage.ejxr
            public final Object get() {
                return "id:".concat(String.valueOf(this.a.getString(0)));
            }
        });
        if (!dj(1)) {
            messageIdTypeArr = null;
        } else if (z) {
            long[] jArrDt = dt(getString(cO(1, brlh.a)));
            int length2 = jArrDt.length;
            MessageIdType[] messageIdTypeArr2 = new MessageIdType[length2];
            for (int i3 = 0; i3 < length2; i3++) {
                messageIdTypeArr2[i3] = new MessageIdType(jArrDt[i3]);
            }
            messageIdTypeArr = (MessageIdType[]) dqru.D(null, messageIdTypeArr2, new MessageIdType[0]);
        } else {
            messageIdTypeArr = new MessageIdType[]{g()};
        }
        dqqf.dA(length, messageIdTypeArr, new ejxr() { // from class: brkp
            @Override // defpackage.ejxr
            public final Object get() {
                return "message_id:".concat(String.valueOf(this.a.getString(1)));
            }
        });
        long[] jArrC = dj(2) ? z ? dqru.C(null, dt(getString(cO(2, brlh.a)))) : new long[]{f()} : null;
        dqqf.dz(length, jArrC, new ejxr() { // from class: brkq
            @Override // defpackage.ejxr
            public final Object get() {
                return "timestamp:".concat(String.valueOf(this.a.getString(2)));
            }
        });
        if (!dj(3)) {
            elqnVarArr = null;
        } else if (z) {
            int[] iArrDs = ds(getString(cO(3, brlh.a)));
            elqn[] elqnVarArr2 = new elqn[iArrDs.length];
            for (int i4 = 0; i4 < iArrDs.length; i4++) {
                elqn elqnVarB = elqn.b(iArrDs[i4]);
                if (elqnVarB == null) {
                    throw new IllegalStateException();
                }
                elqnVarArr2[i4] = elqnVarB;
            }
            elqnVarArr = (elqn[]) dqru.D(null, elqnVarArr2, new elqn[0]);
        } else {
            elqnVarArr = new elqn[]{h()};
        }
        dqqf.dA(length, elqnVarArr, new ejxr() { // from class: brkr
            @Override // defpackage.ejxr
            public final Object get() {
                return "event_type:".concat(String.valueOf(this.a.getString(3)));
            }
        });
        if (!dj(4)) {
            emigVarArr = null;
        } else if (z) {
            int[] iArrDs2 = ds(getString(cO(4, brlh.a)));
            emig[] emigVarArr2 = new emig[iArrDs2.length];
            for (int i5 = 0; i5 < iArrDs2.length; i5++) {
                emig emigVarB = emig.b(iArrDs2[i5]);
                if (emigVarB == null) {
                    throw new IllegalStateException();
                }
                emigVarArr2[i5] = emigVarB;
            }
            emigVarArr = (emig[]) dqru.D(null, emigVarArr2, new emig[0]);
        } else {
            emigVarArr = new emig[]{i()};
        }
        dqqf.dA(length, emigVarArr, new ejxr() { // from class: brks
            @Override // defpackage.ejxr
            public final Object get() {
                return "reply_mode:".concat(String.valueOf(this.a.getString(4)));
            }
        });
        if (!dj(5)) {
            ezacVarArr = null;
        } else if (z) {
            int[] iArrDs3 = ds(getString(cO(5, brlh.a)));
            ezac[] ezacVarArr3 = new ezac[iArrDs3.length];
            for (int i6 = 0; i6 < iArrDs3.length; i6++) {
                ezac ezacVarB = ezac.b(iArrDs3[i6]);
                if (ezacVarB == null) {
                    throw new IllegalStateException();
                }
                ezacVarArr3[i6] = ezacVarB;
            }
            ezacVarArr = (ezac[]) dqru.D(null, ezacVarArr3, new ezac[0]);
        } else {
            ezacVarArr = new ezac[]{k()};
        }
        dqqf.dA(length, ezacVarArr, new ejxr() { // from class: brkt
            @Override // defpackage.ejxr
            public final Object get() {
                return "rejection_reason:".concat(String.valueOf(this.a.getString(5)));
            }
        });
        if (!dj(6)) {
            eyzvVarArr = null;
        } else if (z) {
            int[] iArrDs4 = ds(getString(cO(6, brlh.a)));
            eyzv[] eyzvVarArr2 = new eyzv[iArrDs4.length];
            for (int i7 = 0; i7 < iArrDs4.length; i7++) {
                eyzv eyzvVarB = eyzv.b(iArrDs4[i7]);
                if (eyzvVarB == null) {
                    throw new IllegalStateException();
                }
                eyzvVarArr2[i7] = eyzvVarB;
            }
            eyzvVarArr = (eyzv[]) dqru.D(null, eyzvVarArr2, new eyzv[0]);
        } else {
            eyzvVarArr = new eyzv[]{j()};
        }
        dqqf.dA(length, eyzvVarArr, new ejxr() { // from class: brku
            @Override // defpackage.ejxr
            public final Object get() {
                return "action_source:".concat(String.valueOf(this.a.getString(6)));
            }
        });
        int[] iArrA = dj(7) ? z ? dqru.A(null, ds(getString(cO(7, brlh.a)))) : new int[]{e()} : null;
        dqqf.dy(length, iArrA, new ejxr() { // from class: brkv
            @Override // defpackage.ejxr
            public final Object get() {
                return "num_of_items:".concat(String.valueOf(this.a.getString(7)));
            }
        });
        int[] iArrA2 = dj(8) ? z ? dqru.A(null, ds(getString(cO(8, brlh.a)))) : new int[]{c()} : null;
        dqqf.dy(length, iArrA2, new ejxr() { // from class: brkl
            @Override // defpackage.ejxr
            public final Object get() {
                return "click_index:".concat(String.valueOf(this.a.getString(8)));
            }
        });
        if (!dj(9)) {
            jArr = jArrDC;
            strArr = null;
        } else if (z) {
            jArr = jArrDC;
            strArr = (String[]) dqru.D(null, du(getString(cO(9, brlh.a))), new String[0]);
        } else {
            jArr = jArrDC;
            strArr = new String[]{m()};
        }
        dqqf.dA(length, strArr, new ejxr() { // from class: brkm
            @Override // defpackage.ejxr
            public final Object get() {
                return "impression_id:".concat(String.valueOf(this.a.getString(9)));
            }
        });
        if (!dj(10)) {
            strArr2 = strArr;
            strArr3 = null;
        } else if (z) {
            strArr2 = strArr;
            strArr3 = (String[]) dqru.D(null, du(getString(cO(10, brlh.a))), new String[0]);
        } else {
            strArr2 = strArr;
            strArr3 = new String[]{o()};
        }
        dqqf.dA(length, strArr3, new ejxr() { // from class: brkn
            @Override // defpackage.ejxr
            public final Object get() {
                return "suggestion_types:".concat(String.valueOf(this.a.getString(10)));
            }
        });
        String[] strArr6 = dj(11) ? z ? (String[]) dqru.D(null, du(getString(cO(11, brlh.a))), new String[0]) : new String[]{n()} : null;
        dqqf.dA(length, strArr6, new ejxr() { // from class: brko
            @Override // defpackage.ejxr
            public final Object get() {
                return "model_output_label:".concat(String.valueOf(this.a.getString(11)));
            }
        });
        ekfw ekfwVar = new ekfw();
        int i8 = 0;
        while (i8 < length) {
            long j = jArr[i8];
            if (j <= 0 || hashSet.contains(Long.valueOf(j))) {
                strArr4 = strArr3;
                ezacVarArr2 = ezacVarArr;
                i = length;
            } else {
                hashSet.add(Long.valueOf(jArr[i8]));
                String[] strArr7 = brlh.a;
                brjh brjhVar = new brjh();
                brjhVar.aF();
                brjhVar.aD();
                long j2 = jArr[i8];
                strArr4 = strArr3;
                if (strArr5 != null) {
                    String str = strArr5[i8];
                    ezacVarArr2 = ezacVarArr;
                    brjhVar.aE(0);
                    brjhVar.a = str;
                } else {
                    ezacVarArr2 = ezacVarArr;
                }
                if (messageIdTypeArr != null) {
                    brjhVar.f(messageIdTypeArr[i8]);
                }
                i = length;
                if (jArrC != null) {
                    brjhVar.l(jArrC[i8]);
                }
                if (elqnVarArr != null) {
                    brjhVar.d(elqnVarArr[i8]);
                }
                if (emigVarArr != null) {
                    brjhVar.j(emigVarArr[i8]);
                }
                if (ezacVarArr2 != null) {
                    brjhVar.i(ezacVarArr2[i8]);
                }
                if (eyzvVarArr != null) {
                    brjhVar.b(eyzvVarArr[i8]);
                }
                if (iArrA != null) {
                    brjhVar.h(iArrA[i8]);
                }
                if (iArrA2 != null) {
                    brjhVar.c(iArrA2[i8]);
                }
                if (strArr2 != null) {
                    brjhVar.e(strArr2[i8]);
                }
                if (strArr4 != null) {
                    brjhVar.k(strArr4[i8]);
                }
                if (strArr6 != null) {
                    brjhVar.g(strArr6[i8]);
                }
                ekfwVar.h(brjhVar.a());
            }
            i8++;
            length = i;
            strArr3 = strArr4;
            ezacVarArr = ezacVarArr2;
        }
        return ekfwVar.g();
    }

    @Override // defpackage.brkj
    public final MessageIdType g() {
        return new MessageIdType(getLong(cO(1, brlh.a)));
    }

    @Override // defpackage.brkj
    public final elqn h() {
        return elqn.b(getInt(cO(3, brlh.a)));
    }

    @Override // defpackage.brkj
    public final emig i() {
        return emig.b(getInt(cO(4, brlh.a)));
    }

    @Override // defpackage.brkj
    public final eyzv j() {
        return eyzv.b(getInt(cO(6, brlh.a)));
    }

    @Override // defpackage.brkj
    public final ezac k() {
        return ezac.b(getInt(cO(5, brlh.a)));
    }

    @Override // defpackage.brkj
    public final String l() {
        return getString(cO(0, brlh.a));
    }

    @Override // defpackage.brkj
    public final String m() {
        return getString(cO(9, brlh.a));
    }

    @Override // defpackage.brkj
    public final String n() {
        return getString(cO(11, brlh.a));
    }

    @Override // defpackage.brkj
    public final String o() {
        return getString(cO(10, brlh.a));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
