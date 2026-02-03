package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqlp extends dqqf implements bqlk {
    @Deprecated
    public bqlp(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, bqlv bqlvVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, bqmc.a, dqwjVar, dqtmVar, bqlvVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new bqkt();
    }

    public final ahqp c() {
        return ahqp.b(getInt(cO(2, bqmc.a)));
    }

    public final MessageIdType e() {
        return new MessageIdType(getLong(cO(0, bqmc.a)));
    }

    public final MessageIdType f() {
        return new MessageIdType(getLong(cO(1, bqmc.a)));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        MessageIdType[] messageIdTypeArr;
        MessageIdType[] messageIdTypeArr2;
        ahqp[] ahqpVarArr;
        dqwl dqwlVar = dqthVar.a;
        long[] jArrDC = dC(getString(dqthVar.h + 1));
        int length = jArrDC.length;
        if (length != 0) {
            if (length != 1 || jArrDC[0] != -1) {
                HashSet hashSet = new HashSet();
                dqtm dqtmVar = this.d;
                boolean zDj = dj(0);
                boolean z = dqtmVar.b;
                basd[] basdVarArr = null;
                if (!zDj) {
                    messageIdTypeArr = null;
                } else if (z) {
                    long[] jArrDt = dt(getString(cO(0, bqmc.a)));
                    int length2 = jArrDt.length;
                    MessageIdType[] messageIdTypeArr3 = new MessageIdType[length2];
                    for (int i = 0; i < length2; i++) {
                        messageIdTypeArr3[i] = new MessageIdType(jArrDt[i]);
                    }
                    messageIdTypeArr = (MessageIdType[]) dqru.D(null, messageIdTypeArr3, new MessageIdType[0]);
                } else {
                    messageIdTypeArr = new MessageIdType[]{e()};
                }
                dqqf.dA(length, messageIdTypeArr, new ejxr() { // from class: bqll
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "message_id:".concat(String.valueOf(this.a.getString(0)));
                    }
                });
                if (!dj(1)) {
                    messageIdTypeArr2 = null;
                } else if (z) {
                    long[] jArrDt2 = dt(getString(cO(1, bqmc.a)));
                    int length3 = jArrDt2.length;
                    MessageIdType[] messageIdTypeArr4 = new MessageIdType[length3];
                    for (int i2 = 0; i2 < length3; i2++) {
                        messageIdTypeArr4[i2] = new MessageIdType(jArrDt2[i2]);
                    }
                    messageIdTypeArr2 = (MessageIdType[]) dqru.D(null, messageIdTypeArr4, new MessageIdType[0]);
                } else {
                    messageIdTypeArr2 = new MessageIdType[]{f()};
                }
                dqqf.dA(length, messageIdTypeArr2, new ejxr() { // from class: bqlm
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "replied_to_message_id:".concat(String.valueOf(this.a.getString(1)));
                    }
                });
                if (!dj(2)) {
                    ahqpVarArr = null;
                } else if (z) {
                    int[] iArrDs = ds(getString(cO(2, bqmc.a)));
                    ahqp[] ahqpVarArr2 = new ahqp[iArrDs.length];
                    for (int i3 = 0; i3 < iArrDs.length; i3++) {
                        ahqp ahqpVarB = ahqp.b(iArrDs[i3]);
                        if (ahqpVarB == null) {
                            throw new IllegalStateException();
                        }
                        ahqpVarArr2[i3] = ahqpVarB;
                    }
                    ahqpVarArr = (ahqp[]) dqru.D(null, ahqpVarArr2, new ahqp[0]);
                } else {
                    ahqpVarArr = new ahqp[]{c()};
                }
                dqqf.dA(length, ahqpVarArr, new ejxr() { // from class: bqln
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "replied_to_message_id_null_reason:".concat(String.valueOf(this.a.getString(2)));
                    }
                });
                if (dj(3)) {
                    if (z) {
                        String[] strArrDu = du(getString(cO(3, bqmc.a)));
                        int length4 = strArrDu.length;
                        basd[] basdVarArr2 = new basd[length4];
                        for (int i4 = 0; i4 < length4; i4++) {
                            basdVarArr2[i4] = basd.a(strArrDu[i4]);
                        }
                        basdVarArr = (basd[]) dqru.D(null, basdVarArr2, new basd[0]);
                    } else {
                        basdVarArr = new basd[]{g()};
                    }
                }
                dqqf.dA(length, basdVarArr, new ejxr() { // from class: bqlo
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "replied_to_rcs_message_id:".concat(String.valueOf(this.a.getString(3)));
                    }
                });
                ekfw ekfwVar = new ekfw();
                for (int i5 = 0; i5 < length; i5++) {
                    long j = jArrDC[i5];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(jArrDC[i5]));
                        String[] strArr = bqmc.a;
                        bqkx bqkxVar = new bqkx();
                        bqkxVar.aF();
                        bqkxVar.aD();
                        long j2 = jArrDC[i5];
                        if (messageIdTypeArr != null) {
                            bqkxVar.d(messageIdTypeArr[i5]);
                        }
                        if (messageIdTypeArr2 != null) {
                            bqkxVar.e(messageIdTypeArr2[i5]);
                        }
                        if (ahqpVarArr != null) {
                            bqkxVar.f(ahqpVarArr[i5]);
                        }
                        if (basdVarArr != null) {
                            bqkxVar.g(basdVarArr[i5]);
                        }
                        ekfwVar.h(bqkxVar.a());
                    }
                }
                return ekfwVar.g();
            }
        }
        int i6 = ekgb.d;
        return ekoe.a;
    }

    public final basd g() {
        return basd.a(getString(cO(3, bqmc.a)));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
