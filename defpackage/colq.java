package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class colq extends dqqf implements colh {
    @Deprecated
    public colq(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, colv colvVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, comb.a, dqwjVar, dqtmVar, colvVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new cokl();
    }

    @Override // defpackage.colh
    public final ekgb c() {
        ekfw ekfwVar = new ekfw();
        while (moveToNext()) {
            h();
            ekfwVar.h(h());
        }
        return ekfwVar.g();
    }

    public final aucj e() {
        byte[] blob = getBlob(cO(4, comb.a));
        if (blob == null) {
            return null;
        }
        try {
            return (aucj) evsn.parseFrom(aucj.a, blob, evrr.a());
        } catch (Throwable unused) {
            return aucj.a;
        }
    }

    public final aucj f() {
        byte[] blob = getBlob(cO(5, comb.a));
        if (blob == null) {
            return null;
        }
        try {
            return (aucj) evsn.parseFrom(aucj.a, blob, evrr.a());
        } catch (Throwable unused) {
            return aucj.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        MessageIdType[] messageIdTypeArr;
        comc[] comcVarArr;
        aucl[] auclVarArr;
        aucj[] aucjVarArr;
        aucj[] aucjVarArr2;
        long[] jArr;
        char c;
        aucj aucjVar;
        aucj aucjVar2;
        aucl auclVar;
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
                aucj aucjVar3 = null;
                if (!zDj) {
                    messageIdTypeArr = null;
                } else if (z) {
                    long[] jArrDt = dt(getString(cO(0, comb.a)));
                    int length2 = jArrDt.length;
                    MessageIdType[] messageIdTypeArr2 = new MessageIdType[length2];
                    for (int i2 = 0; i2 < length2; i2++) {
                        messageIdTypeArr2[i2] = new MessageIdType(jArrDt[i2]);
                    }
                    messageIdTypeArr = (MessageIdType[]) dqru.D(null, messageIdTypeArr2, new MessageIdType[0]);
                } else {
                    messageIdTypeArr = new MessageIdType[]{h()};
                }
                dqqf.dA(length, messageIdTypeArr, new ejxr() { // from class: coli
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "message_id:".concat(String.valueOf(this.a.getString(0)));
                    }
                });
                String[] strArr = dj(1) ? z ? (String[]) dqru.D(null, du(getString(cO(1, comb.a))), new String[0]) : new String[]{k()} : null;
                dqqf.dA(length, strArr, new ejxr() { // from class: colj
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "transfer_id:".concat(String.valueOf(this.a.getString(1)));
                    }
                });
                if (!dj(2)) {
                    comcVarArr = null;
                } else if (z) {
                    int[] iArrDs = ds(getString(cO(2, comb.a)));
                    comc[] comcVarArrValues = comc.values();
                    int length3 = comcVarArrValues.length;
                    comc[] comcVarArr2 = new comc[iArrDs.length];
                    for (int i3 = 0; i3 < iArrDs.length; i3++) {
                        int i4 = iArrDs[i3];
                        if (i4 >= length3) {
                            throw new IllegalStateException();
                        }
                        comcVarArr2[i3] = comcVarArrValues[i4];
                    }
                    comcVarArr = (comc[]) dqru.D(null, comcVarArr2, new comc[0]);
                } else {
                    comcVarArr = new comc[]{i()};
                }
                dqqf.dA(length, comcVarArr, new ejxr() { // from class: colk
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "transfer_type:".concat(String.valueOf(this.a.getString(2)));
                    }
                });
                if (!dj(3)) {
                    auclVarArr = null;
                } else if (z) {
                    List listDf = df(getString(cO(3, comb.a)));
                    aucl[] auclVarArr2 = new aucl[listDf.size()];
                    Iterator it = listDf.iterator();
                    int i5 = 0;
                    while (it.hasNext()) {
                        try {
                            byte[] bArrZ = dqru.z((String) it.next());
                            int i6 = i5 + 1;
                            if (bArrZ == null) {
                                auclVar = null;
                            } else {
                                try {
                                    auclVar = (aucl) evsn.parseFrom(aucl.a, bArrZ);
                                } catch (Throwable unused) {
                                    i5 = i6;
                                    auclVarArr2[i5] = null;
                                    i5++;
                                }
                            }
                            auclVarArr2[i5] = auclVar;
                            i5 = i6;
                        } catch (Throwable unused2) {
                        }
                    }
                    auclVarArr = (aucl[]) dqru.D(null, auclVarArr2, new aucl[0]);
                } else {
                    auclVarArr = new aucl[]{g()};
                }
                dqqf.dA(length, auclVarArr, new ejxr() { // from class: coll
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "attachment_upload_response:".concat(String.valueOf(this.a.getString(3)));
                    }
                });
                if (!dj(4)) {
                    aucjVarArr = null;
                } else if (z) {
                    List listDf2 = df(getString(cO(4, comb.a)));
                    aucj[] aucjVarArr3 = new aucj[listDf2.size()];
                    Iterator it2 = listDf2.iterator();
                    int i7 = 0;
                    while (it2.hasNext()) {
                        try {
                            byte[] bArrZ2 = dqru.z((String) it2.next());
                            int i8 = i7 + 1;
                            if (bArrZ2 == null) {
                                aucjVar2 = null;
                            } else {
                                try {
                                    aucjVar2 = (aucj) evsn.parseFrom(aucj.a, bArrZ2);
                                } catch (Throwable unused3) {
                                    i7 = i8;
                                    aucjVarArr3[i7] = null;
                                    i7++;
                                }
                            }
                            aucjVarArr3[i7] = aucjVar2;
                            i7 = i8;
                        } catch (Throwable unused4) {
                        }
                    }
                    aucjVarArr = (aucj[]) dqru.D(null, aucjVarArr3, new aucj[0]);
                } else {
                    aucjVarArr = new aucj[]{e()};
                }
                dqqf.dA(length, aucjVarArr, new ejxr() { // from class: colm
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "file_information:".concat(String.valueOf(this.a.getString(4)));
                    }
                });
                if (!dj(5)) {
                    aucjVarArr2 = null;
                } else if (z) {
                    List listDf3 = df(getString(cO(5, comb.a)));
                    aucj[] aucjVarArr4 = new aucj[listDf3.size()];
                    Iterator it3 = listDf3.iterator();
                    int i9 = 0;
                    while (it3.hasNext()) {
                        try {
                            byte[] bArrZ3 = dqru.z((String) it3.next());
                            int i10 = i9 + 1;
                            if (bArrZ3 == null) {
                                aucjVar = aucjVar3;
                            } else {
                                aucjVar = aucjVar3;
                                try {
                                    aucjVar3 = (aucj) evsn.parseFrom(aucj.a, bArrZ3);
                                } catch (Throwable unused5) {
                                    i9 = i10;
                                    aucjVarArr4[i9] = aucjVar;
                                    i9++;
                                    aucjVar3 = aucjVar;
                                }
                            }
                            aucjVarArr4[i9] = aucjVar3;
                            i9 = i10;
                        } catch (Throwable unused6) {
                            aucjVar = aucjVar3;
                        }
                        aucjVar3 = aucjVar;
                    }
                    aucjVarArr2 = (aucj[]) dqru.D(aucjVar3, aucjVarArr4, new aucj[0]);
                } else {
                    aucjVarArr2 = new aucj[]{f()};
                }
                dqqf.dA(length, aucjVarArr2, new ejxr() { // from class: coln
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "thumbnail_information:".concat(String.valueOf(this.a.getString(5)));
                    }
                });
                char c2 = 6;
                String[] strArr2 = dj(6) ? z ? (String[]) dqru.D(null, du(getString(cO(6, comb.a))), new String[0]) : new String[]{j()} : null;
                dqqf.dA(length, strArr2, new ejxr() { // from class: colo
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "transfer_handle:".concat(String.valueOf(this.a.getString(6)));
                    }
                });
                byte[][] bArrF = dj(7) ? z ? dqru.F(null, dD(getString(cO(7, comb.a)))) : new byte[][]{l()} : null;
                dqqf.dA(length, bArrF, new ejxr() { // from class: colp
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "opaque_data:".concat(String.valueOf(this.a.getString(7)));
                    }
                });
                ekfw ekfwVar = new ekfw();
                while (i < length) {
                    long j = jArrDC[i];
                    if (j <= 0 || hashSet.contains(Long.valueOf(j))) {
                        jArr = jArrDC;
                        c = c2;
                    } else {
                        hashSet.add(Long.valueOf(jArrDC[i]));
                        String[] strArr3 = comb.a;
                        cokn coknVar = new cokn();
                        coknVar.aF();
                        coknVar.aD();
                        long j2 = jArrDC[i];
                        if (messageIdTypeArr != null) {
                            coknVar.c(messageIdTypeArr[i]);
                        }
                        if (strArr != null) {
                            coknVar.e(strArr[i]);
                        }
                        if (comcVarArr != null) {
                            coknVar.f(comcVarArr[i]);
                        }
                        if (auclVarArr != null) {
                            aucl auclVar2 = auclVarArr[i];
                            coknVar.aE(3);
                            coknVar.d = auclVar2;
                        }
                        if (aucjVarArr != null) {
                            coknVar.b(aucjVarArr[i]);
                        }
                        if (aucjVarArr2 != null) {
                            aucj aucjVar4 = aucjVarArr2[i];
                            int i11 = coknVar.aB;
                            jArr = jArrDC;
                            if (i11 < 59910) {
                                dqru.x("thumbnail_information", i11);
                            }
                            coknVar.aE(5);
                            coknVar.f = aucjVar4;
                        } else {
                            jArr = jArrDC;
                        }
                        if (strArr2 != null) {
                            String str = strArr2[i];
                            int i12 = coknVar.aB;
                            if (i12 < 55030) {
                                dqru.x("transfer_handle", i12);
                            }
                            c = 6;
                            coknVar.aE(6);
                            coknVar.g = str;
                        } else {
                            c = 6;
                        }
                        if (bArrF != null) {
                            coknVar.d(bArrF[i]);
                        }
                        ekfwVar.h(coknVar.a());
                    }
                    i++;
                    c2 = c;
                    jArrDC = jArr;
                }
                return ekfwVar.g();
            }
        }
        int i13 = ekgb.d;
        return ekoe.a;
    }

    public final aucl g() {
        byte[] blob = getBlob(cO(3, comb.a));
        if (blob == null) {
            return null;
        }
        try {
            return (aucl) evsn.parseFrom(aucl.a, blob, evrr.a());
        } catch (Throwable unused) {
            return aucl.a;
        }
    }

    public final MessageIdType h() {
        return new MessageIdType(getLong(cO(0, comb.a)));
    }

    public final comc i() {
        comc[] comcVarArrValues = comc.values();
        int i = getInt(cO(2, comb.a));
        if (i < comcVarArrValues.length) {
            return comcVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    public final String j() {
        return getString(cO(6, comb.a));
    }

    public final String k() {
        return getString(cO(1, comb.a));
    }

    public final byte[] l() {
        return getBlob(cO(7, comb.a));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
