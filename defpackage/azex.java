package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azex extends dqqf implements azes {
    @Deprecated
    public azex(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, azfe azfeVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, azfi.a, dqwjVar, dqtmVar, azfeVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new azed();
    }

    public final ahqp c() {
        return ahqp.b(getInt(cO(2, azfi.a)));
    }

    public final MessageIdType e() {
        return new MessageIdType(getLong(cO(0, azfi.a)));
    }

    public final MessageIdType f() {
        return new MessageIdType(getLong(cO(1, azfi.a)));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        MessageIdType[] messageIdTypeArr;
        MessageIdType[] messageIdTypeArr2;
        ahqp[] ahqpVarArr;
        dqwl dqwlVar = dqthVar.a;
        int i = 1;
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
        basd[] basdVarArr = null;
        if (!zDj) {
            messageIdTypeArr = null;
        } else if (z) {
            long[] jArrDt = dt(getString(cO(0, azfi.a)));
            int length2 = jArrDt.length;
            MessageIdType[] messageIdTypeArr3 = new MessageIdType[length2];
            for (int i3 = 0; i3 < length2; i3++) {
                messageIdTypeArr3[i3] = new MessageIdType(jArrDt[i3]);
            }
            messageIdTypeArr = (MessageIdType[]) dqru.D(null, messageIdTypeArr3, new MessageIdType[0]);
        } else {
            messageIdTypeArr = new MessageIdType[]{e()};
        }
        dqqf.dA(length, messageIdTypeArr, new ejxr() { // from class: azet
            @Override // defpackage.ejxr
            public final Object get() {
                return "message_id:".concat(String.valueOf(this.a.getString(0)));
            }
        });
        if (!dj(1)) {
            messageIdTypeArr2 = null;
        } else if (z) {
            long[] jArrDt2 = dt(getString(cO(1, azfi.a)));
            int length3 = jArrDt2.length;
            MessageIdType[] messageIdTypeArr4 = new MessageIdType[length3];
            for (int i4 = 0; i4 < length3; i4++) {
                messageIdTypeArr4[i4] = new MessageIdType(jArrDt2[i4]);
            }
            messageIdTypeArr2 = (MessageIdType[]) dqru.D(null, messageIdTypeArr4, new MessageIdType[0]);
        } else {
            messageIdTypeArr2 = new MessageIdType[]{f()};
        }
        dqqf.dA(length, messageIdTypeArr2, new ejxr() { // from class: azeu
            @Override // defpackage.ejxr
            public final Object get() {
                return "replied_to_message_id:".concat(String.valueOf(this.a.getString(1)));
            }
        });
        if (!dj(2)) {
            ahqpVarArr = null;
        } else if (z) {
            int[] iArrDs = ds(getString(cO(2, azfi.a)));
            ahqp[] ahqpVarArr2 = new ahqp[iArrDs.length];
            for (int i5 = 0; i5 < iArrDs.length; i5++) {
                ahqp ahqpVarB = ahqp.b(iArrDs[i5]);
                if (ahqpVarB == null) {
                    throw new IllegalStateException();
                }
                ahqpVarArr2[i5] = ahqpVarB;
            }
            ahqpVarArr = (ahqp[]) dqru.D(null, ahqpVarArr2, new ahqp[0]);
        } else {
            ahqpVarArr = new ahqp[]{c()};
        }
        dqqf.dA(length, ahqpVarArr, new ejxr() { // from class: azev
            @Override // defpackage.ejxr
            public final Object get() {
                return "replied_to_message_id_null_reason:".concat(String.valueOf(this.a.getString(2)));
            }
        });
        if (dj(3)) {
            if (z) {
                String[] strArrDu = du(getString(cO(3, azfi.a)));
                int length4 = strArrDu.length;
                basd[] basdVarArr2 = new basd[length4];
                for (int i6 = 0; i6 < length4; i6++) {
                    basdVarArr2[i6] = basd.a(strArrDu[i6]);
                }
                basdVarArr = (basd[]) dqru.D(null, basdVarArr2, new basd[0]);
            } else {
                basdVarArr = new basd[]{g()};
            }
        }
        dqqf.dA(length, basdVarArr, new ejxr() { // from class: azew
            @Override // defpackage.ejxr
            public final Object get() {
                return "replied_to_rcs_message_id:".concat(String.valueOf(this.a.getString(3)));
            }
        });
        ekfw ekfwVar = new ekfw();
        int i7 = 0;
        while (i7 < length) {
            long j = jArrDC[i7];
            if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                hashSet.add(Long.valueOf(jArrDC[i7]));
                String[] strArr = azfi.a;
                azef azefVar = new azef();
                azefVar.aF();
                azefVar.aD();
                long j2 = jArrDC[i7];
                if (messageIdTypeArr != null) {
                    MessageIdType messageIdType = messageIdTypeArr[i7];
                    azefVar.aE(0);
                    azefVar.a = messageIdType;
                }
                if (messageIdTypeArr2 != null) {
                    MessageIdType messageIdType2 = messageIdTypeArr2[i7];
                    azefVar.aE(i);
                    azefVar.b = messageIdType2;
                }
                if (ahqpVarArr != null) {
                    ahqp ahqpVar = ahqpVarArr[i7];
                    azefVar.aE(2);
                    azefVar.c = ahqpVar;
                }
                if (basdVarArr != null) {
                    basd basdVar = basdVarArr[i7];
                    azefVar.aE(3);
                    azefVar.d = basdVar;
                }
                azed azedVar = new azed();
                azedVar.aD(azefVar.aB());
                azedVar.a = azefVar.a;
                azedVar.b = azefVar.b;
                azedVar.c = azefVar.c;
                azedVar.d = azefVar.d;
                azedVar.cM = azefVar.aC();
                ekfwVar.h(azedVar);
            }
            i7++;
            i = 1;
        }
        return ekfwVar.g();
    }

    public final basd g() {
        return basd.a(getString(cO(3, azfi.a)));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
