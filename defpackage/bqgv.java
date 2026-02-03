package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqgv extends dqqf implements bqgn {
    @Deprecated
    public bqgv(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, bqha bqhaVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, bqhf.a, dqwjVar, dqtmVar, bqhaVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new bqfs();
    }

    @Override // defpackage.bqgn
    public final ekgb c() {
        ekfw ekfwVar = new ekfw();
        while (moveToNext()) {
            f();
            ekfwVar.h(f());
        }
        return ekfwVar.g();
    }

    public final int e() {
        return getInt(cO(2, bqhf.a));
    }

    public final MessageIdType f() {
        return new MessageIdType(getLong(cO(1, bqhf.a)));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        MessageIdType[] messageIdTypeArr;
        bqhg[] bqhgVarArr;
        bqhh[] bqhhVarArr;
        String[] strArr;
        String[] strArr2;
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
                String[] strArr3 = zDj ? z ? (String[]) dqru.D(null, du(getString(cO(0, bqhf.a))), new String[0]) : new String[]{i()} : null;
                dqqf.dA(length, strArr3, new ejxr() { // from class: bqgo
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "_id:".concat(String.valueOf(this.a.getString(0)));
                    }
                });
                if (!dj(1)) {
                    messageIdTypeArr = null;
                } else if (z) {
                    long[] jArrDt = dt(getString(cO(1, bqhf.a)));
                    int length2 = jArrDt.length;
                    MessageIdType[] messageIdTypeArr2 = new MessageIdType[length2];
                    for (int i2 = 0; i2 < length2; i2++) {
                        messageIdTypeArr2[i2] = new MessageIdType(jArrDt[i2]);
                    }
                    messageIdTypeArr = (MessageIdType[]) dqru.D(null, messageIdTypeArr2, new MessageIdType[0]);
                } else {
                    messageIdTypeArr = new MessageIdType[]{f()};
                }
                dqqf.dA(length, messageIdTypeArr, new ejxr() { // from class: bqgp
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "message_id:".concat(String.valueOf(this.a.getString(1)));
                    }
                });
                int[] iArrA = dj(2) ? z ? dqru.A(null, ds(getString(cO(2, bqhf.a)))) : new int[]{e()} : null;
                dqqf.dy(length, iArrA, new ejxr() { // from class: bqgq
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "label:".concat(String.valueOf(this.a.getString(2)));
                    }
                });
                if (!dj(3)) {
                    bqhgVarArr = null;
                } else if (z) {
                    int[] iArrDs = ds(getString(cO(3, bqhf.a)));
                    bqhg[] bqhgVarArrValues = bqhg.values();
                    int length3 = bqhgVarArrValues.length;
                    bqhg[] bqhgVarArr2 = new bqhg[iArrDs.length];
                    for (int i3 = 0; i3 < iArrDs.length; i3++) {
                        int i4 = iArrDs[i3];
                        if (i4 >= length3) {
                            throw new IllegalStateException();
                        }
                        bqhgVarArr2[i3] = bqhgVarArrValues[i4];
                    }
                    bqhgVarArr = (bqhg[]) dqru.D(null, bqhgVarArr2, new bqhg[0]);
                } else {
                    bqhgVarArr = new bqhg[]{g()};
                }
                dqqf.dA(length, bqhgVarArr, new ejxr() { // from class: bqgr
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "confidence:".concat(String.valueOf(this.a.getString(3)));
                    }
                });
                if (!dj(4)) {
                    bqhhVarArr = null;
                } else if (z) {
                    int[] iArrDs2 = ds(getString(cO(4, bqhf.a)));
                    bqhh[] bqhhVarArrValues = bqhh.values();
                    int length4 = bqhhVarArrValues.length;
                    bqhh[] bqhhVarArr2 = new bqhh[iArrDs2.length];
                    for (int i5 = 0; i5 < iArrDs2.length; i5++) {
                        int i6 = iArrDs2[i5];
                        if (i6 >= length4) {
                            throw new IllegalStateException();
                        }
                        bqhhVarArr2[i5] = bqhhVarArrValues[i6];
                    }
                    bqhhVarArr = (bqhh[]) dqru.D(null, bqhhVarArr2, new bqhh[0]);
                } else {
                    bqhhVarArr = new bqhh[]{h()};
                }
                dqqf.dA(length, bqhhVarArr, new ejxr() { // from class: bqgs
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "source:".concat(String.valueOf(this.a.getString(4)));
                    }
                });
                if (!dj(5)) {
                    strArr = null;
                } else if (z) {
                    String[] strArr4 = bqhf.a;
                    if (isNull(cO(5, strArr4))) {
                        throw new IllegalStateException("found null in cursor for column intent");
                    }
                    strArr = (String[]) dqru.D(null, du(getString(cO(5, strArr4))), new String[0]);
                } else {
                    strArr = new String[]{j()};
                }
                dqqf.dA(length, strArr, new ejxr() { // from class: bqgt
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "intent:".concat(String.valueOf(this.a.getString(5)));
                    }
                });
                if (!dj(6)) {
                    strArr2 = null;
                } else if (z) {
                    String[] strArr5 = bqhf.a;
                    if (isNull(cO(6, strArr5))) {
                        throw new IllegalStateException("found null in cursor for column model_id");
                    }
                    strArr2 = (String[]) dqru.D(null, du(getString(cO(6, strArr5))), new String[0]);
                } else {
                    strArr2 = new String[]{k()};
                }
                dqqf.dA(length, strArr2, new ejxr() { // from class: bqgu
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "model_id:".concat(String.valueOf(this.a.getString(6)));
                    }
                });
                ekfw ekfwVar = new ekfw();
                int i7 = 0;
                while (i7 < length) {
                    long j = jArrDC[i7];
                    if (j <= 0 || hashSet.contains(Long.valueOf(j))) {
                        jArr = jArrDC;
                    } else {
                        hashSet.add(Long.valueOf(jArrDC[i7]));
                        String[] strArr6 = bqhf.a;
                        bqfu bqfuVar = new bqfu();
                        bqfuVar.aF();
                        bqfuVar.aD();
                        long j2 = jArrDC[i7];
                        if (strArr3 != null) {
                            String str = strArr3[i7];
                            bqfuVar.aE(i);
                            bqfuVar.a = str;
                        }
                        if (messageIdTypeArr != null) {
                            MessageIdType messageIdType = messageIdTypeArr[i7];
                            bqfuVar.aE(1);
                            bqfuVar.b = messageIdType;
                        }
                        if (iArrA != null) {
                            int i8 = iArrA[i7];
                            bqfuVar.aE(2);
                            bqfuVar.c = i8;
                        }
                        if (bqhgVarArr != null) {
                            bqhg bqhgVar = bqhgVarArr[i7];
                            int i9 = bqfuVar.aB;
                            if (i9 < 53060) {
                                dqru.x("confidence", i9);
                            }
                            bqfuVar.aE(3);
                            bqfuVar.d = bqhgVar;
                        }
                        if (bqhhVarArr != null) {
                            bqhh bqhhVar = bqhhVarArr[i7];
                            bqfuVar.aE(4);
                            bqfuVar.e = bqhhVar;
                        }
                        if (strArr != null) {
                            String str2 = strArr[i7];
                            int i10 = bqfuVar.aB;
                            if (i10 < 58590) {
                                dqru.x("intent", i10);
                            }
                            bqfuVar.aE(5);
                            bqfuVar.f = str2;
                        }
                        if (strArr2 != null) {
                            String str3 = strArr2[i7];
                            bqfuVar.aE(6);
                            bqfuVar.g = str3;
                        }
                        bqfs bqfsVar = new bqfs();
                        bqfsVar.aD(bqfuVar.aB());
                        String str4 = bqfuVar.f;
                        if (str4 == null) {
                            throw new IllegalStateException("field intent cannot be null");
                        }
                        String str5 = bqfuVar.g;
                        if (str5 == null) {
                            throw new IllegalStateException("field model_id cannot be null");
                        }
                        jArr = jArrDC;
                        bqfsVar.a = bqfuVar.a;
                        bqfsVar.b = bqfuVar.b;
                        bqfsVar.c = bqfuVar.c;
                        bqfsVar.d = bqfuVar.d;
                        bqfsVar.e = bqfuVar.e;
                        bqfsVar.f = str4;
                        bqfsVar.g = str5;
                        bqfsVar.cM = bqfuVar.aC();
                        ekfwVar.h(bqfsVar);
                    }
                    i7++;
                    jArrDC = jArr;
                    i = 0;
                }
                return ekfwVar.g();
            }
        }
        int i11 = ekgb.d;
        return ekoe.a;
    }

    public final bqhg g() {
        bqhg[] bqhgVarArrValues = bqhg.values();
        int i = getInt(cO(3, bqhf.a));
        if (i < bqhgVarArrValues.length) {
            return bqhgVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    public final bqhh h() {
        bqhh[] bqhhVarArrValues = bqhh.values();
        int i = getInt(cO(4, bqhf.a));
        if (i < bqhhVarArrValues.length) {
            return bqhhVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    public final String i() {
        return getString(cO(0, bqhf.a));
    }

    public final String j() {
        String[] strArr = bqhf.a;
        if (isNull(cO(5, strArr))) {
            throw new IllegalStateException("found null in cursor for column intent");
        }
        return getString(cO(5, strArr));
    }

    public final String k() {
        String[] strArr = bqhf.a;
        if (isNull(cO(6, strArr))) {
            throw new IllegalStateException("found null in cursor for column model_id");
        }
        return getString(cO(6, strArr));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
