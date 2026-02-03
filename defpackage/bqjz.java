package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqjz extends dqqf implements bqjr {
    @Deprecated
    public bqjz(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, bqkf bqkfVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, bqkl.a, dqwjVar, dqtmVar, bqkfVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new bqiu();
    }

    @Override // defpackage.bqjr
    public final MessageIdType c() {
        return new MessageIdType(getLong(cO(3, bqkl.a)));
    }

    @Override // defpackage.bqjr
    public final ekgb e() {
        ekfw ekfwVar = new ekfw();
        while (moveToNext()) {
            g();
            ekfwVar.h(g());
        }
        return ekfwVar.g();
    }

    public final long f() {
        return getLong(cO(0, bqkl.a));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        MessageIdType[] messageIdTypeArr;
        cklv[] cklvVarArr;
        int i;
        MessageIdType[] messageIdTypeArr2;
        ckml[] ckmlVarArr;
        ckmb[] ckmbVarArr;
        ckmb[] ckmbVarArr2;
        ckmb ckmbVar;
        ckmb ckmbVar2;
        cklv cklvVar;
        dqwl dqwlVar = dqthVar.a;
        long[] jArrDC = dC(getString(dqthVar.h + 1));
        int length = jArrDC.length;
        if (length != 0) {
            int i2 = 0;
            if (length != 1 || jArrDC[0] != -1) {
                HashSet hashSet = new HashSet();
                dqtm dqtmVar = this.d;
                boolean zDj = dj(0);
                boolean z = dqtmVar.b;
                long[] jArrC = zDj ? z ? dqru.C(null, dt(getString(cO(0, bqkl.a)))) : new long[]{f()} : null;
                dqqf.dz(length, jArrC, new ejxr() { // from class: bqjs
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "_id:".concat(String.valueOf(this.a.getString(0)));
                    }
                });
                if (!dj(1)) {
                    messageIdTypeArr = null;
                } else if (z) {
                    long[] jArrDt = dt(getString(cO(1, bqkl.a)));
                    int length2 = jArrDt.length;
                    MessageIdType[] messageIdTypeArr3 = new MessageIdType[length2];
                    for (int i3 = 0; i3 < length2; i3++) {
                        messageIdTypeArr3[i3] = new MessageIdType(jArrDt[i3]);
                    }
                    messageIdTypeArr = (MessageIdType[]) dqru.D(null, messageIdTypeArr3, new MessageIdType[0]);
                } else {
                    messageIdTypeArr = new MessageIdType[]{g()};
                }
                dqqf.dA(length, messageIdTypeArr, new ejxr() { // from class: bqjt
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "message_id:".concat(String.valueOf(this.a.getString(1)));
                    }
                });
                if (!dj(2)) {
                    cklvVarArr = null;
                } else if (z) {
                    List listDf = df(getString(cO(2, bqkl.a)));
                    cklv[] cklvVarArr2 = new cklv[listDf.size()];
                    Iterator it = listDf.iterator();
                    int i4 = 0;
                    while (it.hasNext()) {
                        try {
                            byte[] bArrZ = dqru.z((String) it.next());
                            int i5 = i4 + 1;
                            if (bArrZ == null) {
                                cklvVar = null;
                            } else {
                                try {
                                    cklvVar = (cklv) evsn.parseFrom(cklv.a, bArrZ);
                                } catch (Throwable unused) {
                                    i4 = i5;
                                    cklvVarArr2[i4] = null;
                                    i4++;
                                }
                            }
                            cklvVarArr2[i4] = cklvVar;
                            i4 = i5;
                        } catch (Throwable unused2) {
                        }
                    }
                    cklvVarArr = (cklv[]) dqru.D(null, cklvVarArr2, new cklv[0]);
                } else {
                    cklvVarArr = new cklv[]{h()};
                }
                dqqf.dA(length, cklvVarArr, new ejxr() { // from class: bqju
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "reactions_data:".concat(String.valueOf(this.a.getString(2)));
                    }
                });
                if (!dj(3)) {
                    i = length;
                    messageIdTypeArr2 = null;
                } else if (z) {
                    long[] jArrDt2 = dt(getString(cO(3, bqkl.a)));
                    int length3 = jArrDt2.length;
                    MessageIdType[] messageIdTypeArr4 = new MessageIdType[length3];
                    int i6 = 0;
                    while (i6 < length3) {
                        messageIdTypeArr4[i6] = new MessageIdType(jArrDt2[i6]);
                        i6++;
                        length = length;
                    }
                    i = length;
                    messageIdTypeArr2 = (MessageIdType[]) dqru.D(null, messageIdTypeArr4, new MessageIdType[0]);
                } else {
                    i = length;
                    messageIdTypeArr2 = new MessageIdType[]{c()};
                }
                dqqf.dA(i, messageIdTypeArr2, new ejxr() { // from class: bqjv
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "reacted_message_id:".concat(String.valueOf(this.a.getString(3)));
                    }
                });
                if (!dj(4)) {
                    ckmlVarArr = null;
                } else if (z) {
                    int[] iArrDs = ds(getString(cO(4, bqkl.a)));
                    ckml[] ckmlVarArr2 = new ckml[iArrDs.length];
                    for (int i7 = 0; i7 < iArrDs.length; i7++) {
                        ckml ckmlVarB = ckml.b(iArrDs[i7]);
                        if (ckmlVarB == null) {
                            throw new IllegalStateException();
                        }
                        ckmlVarArr2[i7] = ckmlVarB;
                    }
                    ckmlVarArr = (ckml[]) dqru.D(null, ckmlVarArr2, new ckml[0]);
                } else {
                    ckmlVarArr = new ckml[]{k()};
                }
                dqqf.dA(i, ckmlVarArr, new ejxr() { // from class: bqjw
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "reaction:".concat(String.valueOf(this.a.getString(4)));
                    }
                });
                if (!dj(5)) {
                    ckmbVarArr = null;
                } else if (z) {
                    List listDf2 = df(getString(cO(5, bqkl.a)));
                    ckmb[] ckmbVarArr3 = new ckmb[listDf2.size()];
                    Iterator it2 = listDf2.iterator();
                    int i8 = 0;
                    while (it2.hasNext()) {
                        try {
                            byte[] bArrZ2 = dqru.z((String) it2.next());
                            int i9 = i8 + 1;
                            if (bArrZ2 == null) {
                                ckmbVar2 = null;
                            } else {
                                try {
                                    ckmbVar2 = (ckmb) evsn.parseFrom(ckmb.a, bArrZ2);
                                } catch (Throwable unused3) {
                                    i8 = i9;
                                    ckmbVarArr3[i8] = null;
                                    i8++;
                                    i2 = 0;
                                }
                            }
                            ckmbVarArr3[i8] = ckmbVar2;
                            i8 = i9;
                        } catch (Throwable unused4) {
                        }
                        i2 = 0;
                    }
                    ckmbVarArr = (ckmb[]) dqru.D(null, ckmbVarArr3, new ckmb[i2]);
                } else {
                    ckmbVarArr = new ckmb[]{j()};
                }
                dqqf.dA(i, ckmbVarArr, new ejxr() { // from class: bqjx
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "applied_reaction:".concat(String.valueOf(this.a.getString(5)));
                    }
                });
                if (!dj(6)) {
                    ckmbVarArr2 = null;
                } else if (z) {
                    List listDf3 = df(getString(cO(6, bqkl.a)));
                    ckmb[] ckmbVarArr4 = new ckmb[listDf3.size()];
                    Iterator it3 = listDf3.iterator();
                    int i10 = 0;
                    while (it3.hasNext()) {
                        try {
                            byte[] bArrZ3 = dqru.z((String) it3.next());
                            int i11 = i10 + 1;
                            if (bArrZ3 == null) {
                                ckmbVar = null;
                            } else {
                                try {
                                    ckmbVar = (ckmb) evsn.parseFrom(ckmb.a, bArrZ3);
                                } catch (Throwable unused5) {
                                    i10 = i11;
                                    ckmbVarArr4[i10] = null;
                                    i10++;
                                }
                            }
                            ckmbVarArr4[i10] = ckmbVar;
                            i10 = i11;
                        } catch (Throwable unused6) {
                        }
                    }
                    ckmbVarArr2 = (ckmb[]) dqru.D(null, ckmbVarArr4, new ckmb[0]);
                } else {
                    ckmbVarArr2 = new ckmb[]{i()};
                }
                dqqf.dA(i, ckmbVarArr2, new ejxr() { // from class: bqjy
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "animation_effect:".concat(String.valueOf(this.a.getString(6)));
                    }
                });
                ekfw ekfwVar = new ekfw();
                for (int i12 = 0; i12 < i; i12++) {
                    long j = jArrDC[i12];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(jArrDC[i12]));
                        String[] strArr = bqkl.a;
                        bqiy bqiyVar = new bqiy();
                        bqiyVar.aF();
                        bqiyVar.aD();
                        long j2 = jArrDC[i12];
                        if (jArrC != null) {
                            long j3 = jArrC[i12];
                            bqiyVar.aE(0);
                            bqiyVar.a = j3;
                        }
                        if (messageIdTypeArr != null) {
                            bqiyVar.e(messageIdTypeArr[i12]);
                        }
                        if (cklvVarArr != null) {
                            bqiyVar.h(cklvVarArr[i12]);
                        }
                        if (messageIdTypeArr2 != null) {
                            bqiyVar.f(messageIdTypeArr2[i12]);
                        }
                        if (ckmlVarArr != null) {
                            bqiyVar.g(ckmlVarArr[i12]);
                        }
                        if (ckmbVarArr != null) {
                            bqiyVar.d(ckmbVarArr[i12]);
                        }
                        if (ckmbVarArr2 != null) {
                            bqiyVar.c(ckmbVarArr2[i12]);
                        }
                        ekfwVar.h(bqiyVar.a());
                    }
                }
                return ekfwVar.g();
            }
        }
        int i13 = ekgb.d;
        return ekoe.a;
    }

    public final MessageIdType g() {
        return new MessageIdType(getLong(cO(1, bqkl.a)));
    }

    public final cklv h() {
        byte[] blob = getBlob(cO(2, bqkl.a));
        if (blob == null) {
            return null;
        }
        try {
            return (cklv) evsn.parseFrom(cklv.a, blob, evrr.a());
        } catch (Throwable unused) {
            return cklv.a;
        }
    }

    public final ckmb i() {
        byte[] blob = getBlob(cO(6, bqkl.a));
        if (blob == null) {
            return null;
        }
        try {
            return (ckmb) evsn.parseFrom(ckmb.a, blob, evrr.a());
        } catch (Throwable unused) {
            return ckmb.a;
        }
    }

    public final ckmb j() {
        byte[] blob = getBlob(cO(5, bqkl.a));
        if (blob == null) {
            return null;
        }
        try {
            return (ckmb) evsn.parseFrom(ckmb.a, blob, evrr.a());
        } catch (Throwable unused) {
            return ckmb.a;
        }
    }

    public final ckml k() {
        return ckml.b(getInt(cO(4, bqkl.a)));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
