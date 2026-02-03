package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqca extends dqqf implements bqbv {
    @Deprecated
    public bqca(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, bqcg bqcgVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, bqcn.a, dqwjVar, dqtmVar, bqcgVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new bqbh();
    }

    public final long c() {
        return getLong(cO(0, bqcn.a));
    }

    public final MessageIdType e() {
        return new MessageIdType(getLong(cO(1, bqcn.a)));
    }

    public final ezah f() {
        return ezah.b(getInt(cO(2, bqcn.a)));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        MessageIdType[] messageIdTypeArr;
        ezah[] ezahVarArr;
        ezgd ezgdVar;
        dqwl dqwlVar = dqthVar.a;
        long[] jArrDC = dC(getString(dqthVar.h + 1));
        int length = jArrDC.length;
        if (length == 0 || (length == 1 && jArrDC[0] == -1)) {
            int i = ekgb.d;
            return ekoe.a;
        }
        HashSet hashSet = new HashSet();
        dqtm dqtmVar = this.d;
        boolean zDj = dj(0);
        boolean z = dqtmVar.b;
        ezgd[] ezgdVarArr = null;
        long[] jArrC = zDj ? z ? dqru.C(null, dt(getString(cO(0, bqcn.a)))) : new long[]{c()} : null;
        dqqf.dz(length, jArrC, new ejxr() { // from class: bqbw
            @Override // defpackage.ejxr
            public final Object get() {
                return "_id:".concat(String.valueOf(this.a.getString(0)));
            }
        });
        if (!dj(1)) {
            messageIdTypeArr = null;
        } else if (z) {
            long[] jArrDt = dt(getString(cO(1, bqcn.a)));
            int length2 = jArrDt.length;
            MessageIdType[] messageIdTypeArr2 = new MessageIdType[length2];
            for (int i2 = 0; i2 < length2; i2++) {
                messageIdTypeArr2[i2] = new MessageIdType(jArrDt[i2]);
            }
            messageIdTypeArr = (MessageIdType[]) dqru.D(null, messageIdTypeArr2, new MessageIdType[0]);
        } else {
            messageIdTypeArr = new MessageIdType[]{e()};
        }
        dqqf.dA(length, messageIdTypeArr, new ejxr() { // from class: bqbx
            @Override // defpackage.ejxr
            public final Object get() {
                return "message_id:".concat(String.valueOf(this.a.getString(1)));
            }
        });
        if (!dj(2)) {
            ezahVarArr = null;
        } else if (z) {
            int[] iArrDs = ds(getString(cO(2, bqcn.a)));
            ezah[] ezahVarArr2 = new ezah[iArrDs.length];
            for (int i3 = 0; i3 < iArrDs.length; i3++) {
                ezah ezahVarB = ezah.b(iArrDs[i3]);
                if (ezahVarB == null) {
                    throw new IllegalStateException();
                }
                ezahVarArr2[i3] = ezahVarB;
            }
            ezahVarArr = (ezah[]) dqru.D(null, ezahVarArr2, new ezah[0]);
        } else {
            ezahVarArr = new ezah[]{f()};
        }
        dqqf.dA(length, ezahVarArr, new ejxr() { // from class: bqby
            @Override // defpackage.ejxr
            public final Object get() {
                return "classification_type:".concat(String.valueOf(this.a.getString(2)));
            }
        });
        if (dj(3)) {
            if (z) {
                String[] strArr = bqcn.a;
                if (isNull(cO(3, strArr))) {
                    throw new IllegalStateException("found null in cursor for column classification_details");
                }
                List listDf = df(getString(cO(3, strArr)));
                ezgd[] ezgdVarArr2 = new ezgd[listDf.size()];
                Iterator it = listDf.iterator();
                int i4 = 0;
                while (it.hasNext()) {
                    try {
                        byte[] bArrZ = dqru.z((String) it.next());
                        int i5 = i4 + 1;
                        if (bArrZ == null) {
                            ezgdVar = null;
                        } else {
                            try {
                                ezgdVar = (ezgd) evsn.parseFrom(ezgd.a, bArrZ);
                            } catch (Throwable unused) {
                                i4 = i5;
                                ezgdVarArr2[i4] = null;
                                i4++;
                            }
                        }
                        ezgdVarArr2[i4] = ezgdVar;
                        i4 = i5;
                    } catch (Throwable unused2) {
                    }
                }
                ezgdVarArr = (ezgd[]) dqru.D(null, ezgdVarArr2, new ezgd[0]);
            } else {
                ezgdVarArr = new ezgd[]{g()};
            }
        }
        dqqf.dA(length, ezgdVarArr, new ejxr() { // from class: bqbz
            @Override // defpackage.ejxr
            public final Object get() {
                return "classification_details:".concat(String.valueOf(this.a.getString(3)));
            }
        });
        ekfw ekfwVar = new ekfw();
        for (int i6 = 0; i6 < length; i6++) {
            long j = jArrDC[i6];
            if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                hashSet.add(Long.valueOf(jArrDC[i6]));
                String[] strArr2 = bqcn.a;
                bqbj bqbjVar = new bqbj();
                bqbjVar.aF();
                bqbjVar.aD();
                long j2 = jArrDC[i6];
                if (jArrC != null) {
                    long j3 = jArrC[i6];
                    bqbjVar.aE(0);
                    bqbjVar.a = j3;
                }
                if (messageIdTypeArr != null) {
                    bqbjVar.d(messageIdTypeArr[i6]);
                }
                if (ezahVarArr != null) {
                    bqbjVar.c(ezahVarArr[i6]);
                }
                if (ezgdVarArr != null) {
                    bqbjVar.b(ezgdVarArr[i6]);
                }
                ekfwVar.h(bqbjVar.a());
            }
        }
        return ekfwVar.g();
    }

    public final ezgd g() {
        String[] strArr = bqcn.a;
        if (isNull(cO(3, strArr))) {
            throw new IllegalStateException("found null in cursor for column classification_details");
        }
        byte[] blob = getBlob(cO(3, strArr));
        if (blob == null) {
            return null;
        }
        try {
            return (ezgd) evsn.parseFrom(ezgd.a, blob, evrr.a());
        } catch (Throwable unused) {
            return ezgd.a;
        }
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
