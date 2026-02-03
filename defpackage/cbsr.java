package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbsr extends dqqf implements cbsg {
    @Deprecated
    public cbsr(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, cbsv cbsvVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, cbtb.a, dqwjVar, dqtmVar, cbsvVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new cbrf();
    }

    @Override // defpackage.cbsg
    public final ekgb c() {
        ekfw ekfwVar = new ekfw();
        while (moveToNext()) {
            if (i() != null) {
                ekfwVar.h(i());
            }
        }
        return ekfwVar.g();
    }

    public final int e() {
        return getInt(cO(3, cbtb.a));
    }

    public final long f() {
        return getLong(cO(9, cbtb.a));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        ConversationIdType[] conversationIdTypeArr;
        awjl[] awjlVarArr;
        int i;
        cbqz[] cbqzVarArr;
        cbqx[] cbqxVarArr;
        Optional[] optionalArr;
        Optional[] optionalArr2;
        long[] jArr;
        Optional[] optionalArr3;
        int i2;
        long[] jArrC;
        char c;
        cbqx[] cbqxVarArr2;
        cbqz[] cbqzVarArr2;
        Optional[] optionalArr4;
        dqwl dqwlVar = dqthVar.a;
        long[] jArrDC = dC(getString(dqthVar.h + 1));
        int length = jArrDC.length;
        if (length != 0) {
            if (length != 1 || jArrDC[0] != -1) {
                HashSet hashSet = new HashSet();
                boolean z = this.d.b;
                if (!dj(0)) {
                    conversationIdTypeArr = null;
                } else if (z) {
                    long[] jArrDt = dt(getString(cO(0, cbtb.a)));
                    int length2 = jArrDt.length;
                    ConversationIdType[] conversationIdTypeArr2 = new ConversationIdType[length2];
                    for (int i3 = 0; i3 < length2; i3++) {
                        conversationIdTypeArr2[i3] = new ConversationIdType(jArrDt[i3]);
                    }
                    conversationIdTypeArr = (ConversationIdType[]) dqru.D(null, conversationIdTypeArr2, new ConversationIdType[0]);
                } else {
                    conversationIdTypeArr = new ConversationIdType[]{h()};
                }
                dqqf.dA(length, conversationIdTypeArr, new ejxr() { // from class: cbsh
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "conversation_id:".concat(String.valueOf(this.a.getString(0)));
                    }
                });
                if (!dj(1)) {
                    awjlVarArr = null;
                } else if (z) {
                    String[] strArrDu = du(getString(cO(1, cbtb.a)));
                    int length3 = strArrDu.length;
                    awjl[] awjlVarArr2 = new awjl[length3];
                    for (int i4 = 0; i4 < length3; i4++) {
                        awjlVarArr2[i4] = awjm.a(strArrDu[i4]);
                    }
                    awjlVarArr = (awjl[]) dqru.D(null, awjlVarArr2, new awjl[0]);
                } else {
                    awjlVarArr = new awjl[]{g()};
                }
                dqqf.dA(length, awjlVarArr, new ejxr() { // from class: cbsi
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "destination_token:".concat(String.valueOf(this.a.getString(1)));
                    }
                });
                String[] strArr = dj(2) ? z ? (String[]) dqru.D(null, du(getString(cO(2, cbtb.a))), new String[0]) : new String[]{n()} : null;
                dqqf.dA(length, strArr, new ejxr() { // from class: cbsj
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "self_id:".concat(String.valueOf(this.a.getString(2)));
                    }
                });
                int[] iArrA = dj(3) ? z ? dqru.A(null, ds(getString(cO(3, cbtb.a)))) : new int[]{e()} : null;
                dqqf.dy(length, iArrA, new ejxr() { // from class: cbsk
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "conv_type:".concat(String.valueOf(this.a.getString(3)));
                    }
                });
                if (!dj(4)) {
                    i = length;
                    cbqzVarArr = null;
                } else if (z) {
                    long[] jArrDt2 = dt(getString(cO(4, cbtb.a)));
                    int length4 = jArrDt2.length;
                    cbqz[] cbqzVarArr3 = new cbqz[length4];
                    int i5 = 0;
                    while (i5 < length4) {
                        cbqzVarArr3[i5] = new cbqz(jArrDt2[i5]);
                        i5++;
                        length = length;
                    }
                    i = length;
                    cbqzVarArr = (cbqz[]) dqru.D(null, cbqzVarArr3, new cbqz[0]);
                } else {
                    i = length;
                    cbqzVarArr = new cbqz[]{j()};
                }
                int i6 = i;
                dqqf.dA(i6, cbqzVarArr, new ejxr() { // from class: cbsl
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "encryption_protocol:".concat(String.valueOf(this.a.getString(4)));
                    }
                });
                if (!dj(5)) {
                    cbqxVarArr = null;
                } else if (z) {
                    String[] strArrDu2 = du(getString(cO(5, cbtb.a)));
                    int length5 = strArrDu2.length;
                    cbqx[] cbqxVarArr3 = new cbqx[length5];
                    for (int i7 = 0; i7 < length5; i7++) {
                        cbqxVarArr3[i7] = cbqw.a(strArrDu2[i7]);
                    }
                    cbqxVarArr = (cbqx[]) dqru.D(null, cbqxVarArr3, new cbqx[0]);
                } else {
                    cbqxVarArr = new cbqx[]{i()};
                }
                dqqf.dA(i6, cbqxVarArr, new ejxr() { // from class: cbsm
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "encryption_id:".concat(String.valueOf(this.a.getString(5)));
                    }
                });
                if (!dj(6)) {
                    optionalArr = null;
                } else if (z) {
                    long[] jArrDt3 = dt(getString(cO(6, cbtb.a)));
                    int length6 = jArrDt3.length;
                    Optional[] optionalArr5 = new Optional[length6];
                    for (int i8 = 0; i8 < length6; i8++) {
                        optionalArr5[i8] = basb.b(jArrDt3[i8]);
                    }
                    optionalArr = (Optional[]) dqru.D(null, optionalArr5, new Optional[0]);
                } else {
                    optionalArr = new Optional[]{l()};
                }
                dqqf.dA(i6, optionalArr, new ejxr() { // from class: cbsn
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "last_updated_timestamp:".concat(String.valueOf(this.a.getString(6)));
                    }
                });
                if (!dj(7)) {
                    optionalArr2 = null;
                } else if (z) {
                    long[] jArrDt4 = dt(getString(cO(7, cbtb.a)));
                    int length7 = jArrDt4.length;
                    Optional[] optionalArr6 = new Optional[length7];
                    for (int i9 = 0; i9 < length7; i9++) {
                        optionalArr6[i9] = basb.b(jArrDt4[i9]);
                    }
                    optionalArr2 = (Optional[]) dqru.D(null, optionalArr6, new Optional[0]);
                } else {
                    optionalArr2 = new Optional[]{k()};
                }
                dqqf.dA(i6, optionalArr2, new ejxr() { // from class: cbso
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "added_to_mls_group_timestamp:".concat(String.valueOf(this.a.getString(7)));
                    }
                });
                if (!dj(8)) {
                    jArr = jArrDC;
                    optionalArr3 = null;
                } else if (z) {
                    long[] jArrDt5 = dt(getString(cO(8, cbtb.a)));
                    int length8 = jArrDt5.length;
                    Optional[] optionalArr7 = new Optional[length8];
                    jArr = jArrDC;
                    for (int i10 = 0; i10 < length8; i10++) {
                        optionalArr7[i10] = basb.b(jArrDt5[i10]);
                    }
                    optionalArr3 = (Optional[]) dqru.D(null, optionalArr7, new Optional[0]);
                } else {
                    jArr = jArrDC;
                    optionalArr3 = new Optional[]{m()};
                }
                dqqf.dA(i6, optionalArr3, new ejxr() { // from class: cbsp
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "mls_last_unexpected_downgrade_timestamp:".concat(String.valueOf(this.a.getString(8)));
                    }
                });
                char c2 = '\t';
                if (!dj(9)) {
                    i2 = 0;
                    jArrC = null;
                } else if (z) {
                    jArrC = dqru.C(null, dt(getString(cO(9, cbtb.a))));
                    i2 = 0;
                } else {
                    i2 = 0;
                    jArrC = new long[]{f()};
                }
                dqqf.dz(i6, jArrC, new ejxr() { // from class: cbsq
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "mls_reupgrade_after_unexpected_downgrade_attempt_count:".concat(String.valueOf(this.a.getString(9)));
                    }
                });
                ekfw ekfwVar = new ekfw();
                int i11 = i2;
                while (i11 < i6) {
                    long j = jArr[i11];
                    if (j <= 0) {
                        c = c2;
                        cbqxVarArr2 = cbqxVarArr;
                        cbqzVarArr2 = cbqzVarArr;
                        optionalArr4 = optionalArr3;
                    } else if (hashSet.contains(Long.valueOf(j))) {
                        cbqxVarArr2 = cbqxVarArr;
                        cbqzVarArr2 = cbqzVarArr;
                        optionalArr4 = optionalArr3;
                        c = '\t';
                    } else {
                        hashSet.add(Long.valueOf(jArr[i11]));
                        String[] strArr2 = cbtb.a;
                        cbrh cbrhVar = new cbrh();
                        cbrhVar.aF();
                        cbrhVar.aD();
                        long j2 = jArr[i11];
                        if (conversationIdTypeArr != null) {
                            cbrhVar.b(conversationIdTypeArr[i11]);
                        }
                        if (awjlVarArr != null) {
                            cbrhVar.d(awjlVarArr[i11]);
                        }
                        if (strArr != null) {
                            cbrhVar.g(strArr[i11]);
                        }
                        if (iArrA != null) {
                            cbrhVar.c(iArrA[i11]);
                        }
                        if (cbqzVarArr != null) {
                            cbrhVar.f(cbqzVarArr[i11]);
                        }
                        if (cbqxVarArr != null) {
                            cbrhVar.e(cbqxVarArr[i11]);
                        }
                        if (optionalArr != null) {
                            Optional optional = optionalArr[i11];
                            cbqxVarArr2 = cbqxVarArr;
                            cbrhVar.aE(6);
                            cbrhVar.g = optional;
                        } else {
                            cbqxVarArr2 = cbqxVarArr;
                        }
                        if (optionalArr2 != null) {
                            Optional optional2 = optionalArr2[i11];
                            cbqzVarArr2 = cbqzVarArr;
                            int i12 = cbrhVar.aB;
                            if (i12 < 60920) {
                                dqru.x("added_to_mls_group_timestamp", i12);
                            }
                            cbrhVar.aE(7);
                            cbrhVar.h = optional2;
                        } else {
                            cbqzVarArr2 = cbqzVarArr;
                        }
                        if (optionalArr3 != null) {
                            Optional optional3 = optionalArr3[i11];
                            int i13 = cbrhVar.aB;
                            if (i13 < 60920) {
                                dqru.x("mls_last_unexpected_downgrade_timestamp", i13);
                            }
                            cbrhVar.aE(8);
                            cbrhVar.i = optional3;
                        }
                        if (jArrC != null) {
                            long j3 = jArrC[i11];
                            int i14 = cbrhVar.aB;
                            optionalArr4 = optionalArr3;
                            if (i14 < 60920) {
                                dqru.x("mls_reupgrade_after_unexpected_downgrade_attempt_count", i14);
                            }
                            c = '\t';
                            cbrhVar.aE(9);
                            cbrhVar.j = j3;
                        } else {
                            optionalArr4 = optionalArr3;
                            c = '\t';
                        }
                        ekfwVar.h(cbrhVar.a());
                    }
                    i11++;
                    c2 = c;
                    cbqxVarArr = cbqxVarArr2;
                    cbqzVarArr = cbqzVarArr2;
                    optionalArr3 = optionalArr4;
                }
                return ekfwVar.g();
            }
        }
        int i15 = ekgb.d;
        return ekoe.a;
    }

    public final awjl g() {
        return awjm.a(getString(cO(1, cbtb.a)));
    }

    public final ConversationIdType h() {
        return new ConversationIdType(getLong(cO(0, cbtb.a)));
    }

    public final cbqx i() {
        return cbqw.a(getString(cO(5, cbtb.a)));
    }

    public final cbqz j() {
        return new cbqz(getLong(cO(4, cbtb.a)));
    }

    public final Optional k() {
        return basb.b(getLong(cO(7, cbtb.a)));
    }

    public final Optional l() {
        return basb.b(getLong(cO(6, cbtb.a)));
    }

    public final Optional m() {
        return basb.b(getLong(cO(8, cbtb.a)));
    }

    public final String n() {
        return getString(cO(2, cbtb.a));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
