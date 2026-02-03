package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azdm extends dqqf implements azdf {
    @Deprecated
    public azdm(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, azdt azdtVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, azdx.a, dqwjVar, dqtmVar, azdtVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new azcm();
    }

    public final long c() {
        return getLong(cO(0, azdx.a));
    }

    public final MessageIdType e() {
        return new MessageIdType(getLong(cO(1, azdx.a)));
    }

    public final MessageIdType f() {
        return new MessageIdType(getLong(cO(3, azdx.a)));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        MessageIdType[] messageIdTypeArr;
        cklv[] cklvVarArr;
        MessageIdType[] messageIdTypeArr2;
        ckml[] ckmlVarArr;
        long[] jArr;
        ckmb ckmbVar;
        cklv cklvVar;
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
                ckmb[] ckmbVarArr = null;
                long[] jArrC = zDj ? z ? dqru.C(null, dt(getString(cO(0, azdx.a)))) : new long[]{c()} : null;
                dqqf.dz(length, jArrC, new ejxr() { // from class: azdg
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "_id:".concat(String.valueOf(this.a.getString(0)));
                    }
                });
                if (!dj(1)) {
                    messageIdTypeArr = null;
                } else if (z) {
                    long[] jArrDt = dt(getString(cO(1, azdx.a)));
                    int length2 = jArrDt.length;
                    MessageIdType[] messageIdTypeArr3 = new MessageIdType[length2];
                    for (int i2 = 0; i2 < length2; i2++) {
                        messageIdTypeArr3[i2] = new MessageIdType(jArrDt[i2]);
                    }
                    messageIdTypeArr = (MessageIdType[]) dqru.D(null, messageIdTypeArr3, new MessageIdType[0]);
                } else {
                    messageIdTypeArr = new MessageIdType[]{e()};
                }
                dqqf.dA(length, messageIdTypeArr, new ejxr() { // from class: azdh
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "message_id:".concat(String.valueOf(this.a.getString(1)));
                    }
                });
                if (!dj(2)) {
                    cklvVarArr = null;
                } else if (z) {
                    List listDf = df(getString(cO(2, azdx.a)));
                    cklv[] cklvVarArr2 = new cklv[listDf.size()];
                    Iterator it = listDf.iterator();
                    int i3 = 0;
                    while (it.hasNext()) {
                        try {
                            byte[] bArrZ = dqru.z((String) it.next());
                            int i4 = i3 + 1;
                            if (bArrZ == null) {
                                cklvVar = null;
                            } else {
                                try {
                                    cklvVar = (cklv) evsn.parseFrom(cklv.a, bArrZ);
                                } catch (Throwable unused) {
                                    i3 = i4;
                                    cklvVarArr2[i3] = null;
                                    i3++;
                                }
                            }
                            cklvVarArr2[i3] = cklvVar;
                            i3 = i4;
                        } catch (Throwable unused2) {
                        }
                    }
                    cklvVarArr = (cklv[]) dqru.D(null, cklvVarArr2, new cklv[0]);
                } else {
                    cklvVarArr = new cklv[]{g()};
                }
                dqqf.dA(length, cklvVarArr, new ejxr() { // from class: azdi
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "reactions_data:".concat(String.valueOf(this.a.getString(2)));
                    }
                });
                if (!dj(3)) {
                    messageIdTypeArr2 = null;
                } else if (z) {
                    long[] jArrDt2 = dt(getString(cO(3, azdx.a)));
                    int length3 = jArrDt2.length;
                    MessageIdType[] messageIdTypeArr4 = new MessageIdType[length3];
                    int i5 = 0;
                    while (i5 < length3) {
                        long[] jArr2 = jArrDt2;
                        messageIdTypeArr4[i5] = new MessageIdType(jArr2[i5]);
                        i5++;
                        jArrDt2 = jArr2;
                    }
                    messageIdTypeArr2 = (MessageIdType[]) dqru.D(null, messageIdTypeArr4, new MessageIdType[0]);
                } else {
                    messageIdTypeArr2 = new MessageIdType[]{f()};
                }
                dqqf.dA(length, messageIdTypeArr2, new ejxr() { // from class: azdj
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "reacted_message_id:".concat(String.valueOf(this.a.getString(3)));
                    }
                });
                if (!dj(4)) {
                    ckmlVarArr = null;
                } else if (z) {
                    int[] iArrDs = ds(getString(cO(4, azdx.a)));
                    ckml[] ckmlVarArr2 = new ckml[iArrDs.length];
                    for (int i6 = 0; i6 < iArrDs.length; i6++) {
                        ckml ckmlVarB = ckml.b(iArrDs[i6]);
                        if (ckmlVarB == null) {
                            throw new IllegalStateException();
                        }
                        ckmlVarArr2[i6] = ckmlVarB;
                    }
                    ckmlVarArr = (ckml[]) dqru.D(null, ckmlVarArr2, new ckml[0]);
                } else {
                    ckmlVarArr = new ckml[]{i()};
                }
                dqqf.dA(length, ckmlVarArr, new ejxr() { // from class: azdk
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "reaction:".concat(String.valueOf(this.a.getString(4)));
                    }
                });
                if (dj(5)) {
                    if (z) {
                        List listDf2 = df(getString(cO(5, azdx.a)));
                        ckmb[] ckmbVarArr2 = new ckmb[listDf2.size()];
                        Iterator it2 = listDf2.iterator();
                        int i7 = 0;
                        while (it2.hasNext()) {
                            try {
                                byte[] bArrZ2 = dqru.z((String) it2.next());
                                int i8 = i7 + 1;
                                if (bArrZ2 == null) {
                                    ckmbVar = null;
                                } else {
                                    try {
                                        ckmbVar = (ckmb) evsn.parseFrom(ckmb.a, bArrZ2);
                                    } catch (Throwable unused3) {
                                        i7 = i8;
                                        ckmbVarArr2[i7] = null;
                                        i7++;
                                    }
                                }
                                ckmbVarArr2[i7] = ckmbVar;
                                i7 = i8;
                            } catch (Throwable unused4) {
                            }
                        }
                        ckmbVarArr = (ckmb[]) dqru.D(null, ckmbVarArr2, new ckmb[0]);
                    } else {
                        ckmbVarArr = new ckmb[]{h()};
                    }
                }
                dqqf.dA(length, ckmbVarArr, new ejxr() { // from class: azdl
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "applied_reaction:".concat(String.valueOf(this.a.getString(5)));
                    }
                });
                ekfw ekfwVar = new ekfw();
                int i9 = 0;
                while (i9 < length) {
                    long j = jArrDC[i9];
                    if (j <= 0 || hashSet.contains(Long.valueOf(j))) {
                        jArr = jArrDC;
                    } else {
                        hashSet.add(Long.valueOf(jArrDC[i9]));
                        String[] strArr = azdx.a;
                        azco azcoVar = new azco();
                        azcoVar.aF();
                        azcoVar.aD();
                        long j2 = jArrDC[i9];
                        if (jArrC != null) {
                            long j3 = jArrC[i9];
                            azcoVar.aE(i);
                            azcoVar.a = j3;
                        }
                        if (messageIdTypeArr != null) {
                            MessageIdType messageIdType = messageIdTypeArr[i9];
                            azcoVar.aE(1);
                            azcoVar.b = messageIdType;
                        }
                        if (cklvVarArr != null) {
                            cklv cklvVar2 = cklvVarArr[i9];
                            azcoVar.aE(2);
                            azcoVar.c = cklvVar2;
                        }
                        if (messageIdTypeArr2 != null) {
                            MessageIdType messageIdType2 = messageIdTypeArr2[i9];
                            azcoVar.aE(3);
                            azcoVar.d = messageIdType2;
                        }
                        if (ckmlVarArr != null) {
                            ckml ckmlVar = ckmlVarArr[i9];
                            azcoVar.aE(4);
                            azcoVar.e = ckmlVar;
                        }
                        if (ckmbVarArr != null) {
                            ckmb ckmbVar2 = ckmbVarArr[i9];
                            azcoVar.aE(5);
                            azcoVar.f = ckmbVar2;
                        }
                        azcm azcmVar = new azcm();
                        azcmVar.aD(azcoVar.aB());
                        jArr = jArrDC;
                        azcmVar.a = azcoVar.a;
                        azcmVar.b = azcoVar.b;
                        azcmVar.c = azcoVar.c;
                        azcmVar.d = azcoVar.d;
                        azcmVar.e = azcoVar.e;
                        azcmVar.f = azcoVar.f;
                        azcmVar.cM = azcoVar.aC();
                        ekfwVar.h(azcmVar);
                    }
                    i9++;
                    jArrDC = jArr;
                    i = 0;
                }
                return ekfwVar.g();
            }
        }
        int i10 = ekgb.d;
        return ekoe.a;
    }

    public final cklv g() {
        byte[] blob = getBlob(cO(2, azdx.a));
        if (blob == null) {
            return null;
        }
        try {
            return (cklv) evsn.parseFrom(cklv.a, blob, evrr.a());
        } catch (Throwable unused) {
            return cklv.a;
        }
    }

    public final ckmb h() {
        byte[] blob = getBlob(cO(5, azdx.a));
        if (blob == null) {
            return null;
        }
        try {
            return (ckmb) evsn.parseFrom(ckmb.a, blob, evrr.a());
        } catch (Throwable unused) {
            return ckmb.a;
        }
    }

    public final ckml i() {
        return ckml.b(getInt(cO(4, azdx.a)));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
