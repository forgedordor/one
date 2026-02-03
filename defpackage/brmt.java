package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class brmt extends dqqf implements brml {
    @Deprecated
    public brmt(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, brmz brmzVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, brnk.a, dqwjVar, dqtmVar, brmzVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new brlp();
    }

    @Override // defpackage.brml
    public final long c() {
        return getLong(cO(2, brnk.a));
    }

    public final MessageIdType e() {
        return new MessageIdType(getLong(cO(1, brnk.a)));
    }

    public final ezai f() {
        return ezai.b(getInt(cO(5, brnk.a)));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        MessageIdType[] messageIdTypeArr;
        ezgi[] ezgiVarArr;
        ezan[] ezanVarArr;
        ezai[] ezaiVarArr;
        HashSet hashSet;
        ezgi ezgiVar;
        dqwl dqwlVar = dqthVar.a;
        long[] jArrDC = dC(getString(dqthVar.h + 1));
        int length = jArrDC.length;
        if (length != 0) {
            int i = 0;
            if (length != 1 || jArrDC[0] != -1) {
                HashSet hashSet2 = new HashSet();
                dqtm dqtmVar = this.d;
                boolean zDj = dj(0);
                boolean z = dqtmVar.b;
                ezaj[] ezajVarArr = null;
                String[] strArr = zDj ? z ? (String[]) dqru.D(null, du(getString(cO(0, brnk.a))), new String[0]) : new String[]{j()} : null;
                dqqf.dA(length, strArr, new ejxr() { // from class: brmm
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "_id:".concat(String.valueOf(this.a.getString(0)));
                    }
                });
                if (!dj(1)) {
                    messageIdTypeArr = null;
                } else if (z) {
                    long[] jArrDt = dt(getString(cO(1, brnk.a)));
                    int length2 = jArrDt.length;
                    MessageIdType[] messageIdTypeArr2 = new MessageIdType[length2];
                    for (int i2 = 0; i2 < length2; i2++) {
                        messageIdTypeArr2[i2] = new MessageIdType(jArrDt[i2]);
                    }
                    messageIdTypeArr = (MessageIdType[]) dqru.D(null, messageIdTypeArr2, new MessageIdType[0]);
                } else {
                    messageIdTypeArr = new MessageIdType[]{e()};
                }
                dqqf.dA(length, messageIdTypeArr, new ejxr() { // from class: brmn
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "target_message_id:".concat(String.valueOf(this.a.getString(1)));
                    }
                });
                long[] jArrC = dj(2) ? z ? dqru.C(null, dt(getString(cO(2, brnk.a)))) : new long[]{c()} : null;
                dqqf.dz(length, jArrC, new ejxr() { // from class: brmo
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "generated_timestamp:".concat(String.valueOf(this.a.getString(2)));
                    }
                });
                if (!dj(3)) {
                    ezgiVarArr = null;
                } else if (z) {
                    String[] strArr2 = brnk.a;
                    if (isNull(cO(3, strArr2))) {
                        throw new IllegalStateException("found null in cursor for column suggestion");
                    }
                    List listDf = df(getString(cO(3, strArr2)));
                    ezgi[] ezgiVarArr2 = new ezgi[listDf.size()];
                    Iterator it = listDf.iterator();
                    int i3 = 0;
                    while (it.hasNext()) {
                        try {
                            byte[] bArrZ = dqru.z((String) it.next());
                            int i4 = i3 + 1;
                            if (bArrZ == null) {
                                ezgiVar = null;
                            } else {
                                try {
                                    ezgiVar = (ezgi) evsn.parseFrom(ezgi.a, bArrZ);
                                } catch (Throwable unused) {
                                    i3 = i4;
                                    ezgiVarArr2[i3] = null;
                                    i3++;
                                }
                            }
                            ezgiVarArr2[i3] = ezgiVar;
                            i3 = i4;
                        } catch (Throwable unused2) {
                        }
                    }
                    ezgiVarArr = (ezgi[]) dqru.D(null, ezgiVarArr2, new ezgi[0]);
                } else {
                    ezgiVarArr = new ezgi[]{i()};
                }
                dqqf.dA(length, ezgiVarArr, new ejxr() { // from class: brmp
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "suggestion:".concat(String.valueOf(this.a.getString(3)));
                    }
                });
                if (!dj(4)) {
                    ezanVarArr = null;
                } else if (z) {
                    int[] iArrDs = ds(getString(cO(4, brnk.a)));
                    ezan[] ezanVarArr2 = new ezan[iArrDs.length];
                    for (int i5 = 0; i5 < iArrDs.length; i5++) {
                        ezan ezanVarB = ezan.b(iArrDs[i5]);
                        if (ezanVarB == null) {
                            throw new IllegalStateException();
                        }
                        ezanVarArr2[i5] = ezanVarB;
                    }
                    ezanVarArr = (ezan[]) dqru.D(null, ezanVarArr2, new ezan[0]);
                } else {
                    ezanVarArr = new ezan[]{h()};
                }
                dqqf.dA(length, ezanVarArr, new ejxr() { // from class: brmq
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "smart_suggestion_type:".concat(String.valueOf(this.a.getString(4)));
                    }
                });
                if (!dj(5)) {
                    ezaiVarArr = null;
                } else if (z) {
                    int[] iArrDs2 = ds(getString(cO(5, brnk.a)));
                    ezai[] ezaiVarArr2 = new ezai[iArrDs2.length];
                    for (int i6 = 0; i6 < iArrDs2.length; i6++) {
                        ezai ezaiVarB = ezai.b(iArrDs2[i6]);
                        if (ezaiVarB == null) {
                            throw new IllegalStateException();
                        }
                        ezaiVarArr2[i6] = ezaiVarB;
                    }
                    ezaiVarArr = (ezai[]) dqru.D(null, ezaiVarArr2, new ezai[0]);
                } else {
                    ezaiVarArr = new ezai[]{f()};
                }
                dqqf.dA(length, ezaiVarArr, new ejxr() { // from class: brmr
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "suggestion_status:".concat(String.valueOf(this.a.getString(5)));
                    }
                });
                if (dj(6)) {
                    if (z) {
                        int[] iArrDs3 = ds(getString(cO(6, brnk.a)));
                        ezaj[] ezajVarArr2 = new ezaj[iArrDs3.length];
                        for (int i7 = 0; i7 < iArrDs3.length; i7++) {
                            ezaj ezajVarB = ezaj.b(iArrDs3[i7]);
                            if (ezajVarB == null) {
                                throw new IllegalStateException();
                            }
                            ezajVarArr2[i7] = ezajVarB;
                        }
                        ezajVarArr = (ezaj[]) dqru.D(null, ezajVarArr2, new ezaj[0]);
                    } else {
                        ezajVarArr = new ezaj[]{g()};
                    }
                }
                dqqf.dA(length, ezajVarArr, new ejxr() { // from class: brms
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "consumption_state:".concat(String.valueOf(this.a.getString(6)));
                    }
                });
                ekfw ekfwVar = new ekfw();
                int i8 = 0;
                while (i8 < length) {
                    long j = jArrDC[i8];
                    if (j <= 0 || hashSet2.contains(Long.valueOf(j))) {
                        hashSet = hashSet2;
                    } else {
                        hashSet2.add(Long.valueOf(jArrDC[i8]));
                        String[] strArr3 = brnk.a;
                        brlt brltVar = new brlt();
                        brltVar.aF();
                        brltVar.aD();
                        long j2 = jArrDC[i8];
                        if (strArr != null) {
                            String str = strArr[i8];
                            brltVar.aE(i);
                            brltVar.a = str;
                        }
                        if (messageIdTypeArr != null) {
                            brltVar.g(messageIdTypeArr[i8]);
                        }
                        hashSet = hashSet2;
                        if (jArrC != null) {
                            brltVar.c(jArrC[i8]);
                        }
                        if (ezgiVarArr != null) {
                            brltVar.e(ezgiVarArr[i8]);
                        }
                        if (ezanVarArr != null) {
                            brltVar.d(ezanVarArr[i8]);
                        }
                        if (ezaiVarArr != null) {
                            brltVar.f(ezaiVarArr[i8]);
                        }
                        if (ezajVarArr != null) {
                            ezaj ezajVar = ezajVarArr[i8];
                            int i9 = brltVar.aB;
                            if (i9 < 53080) {
                                dqru.x("consumption_state", i9);
                            }
                            brltVar.aE(6);
                            brltVar.g = ezajVar;
                        }
                        ekfwVar.h(brltVar.a());
                    }
                    i8++;
                    hashSet2 = hashSet;
                    i = 0;
                }
                return ekfwVar.g();
            }
        }
        int i10 = ekgb.d;
        return ekoe.a;
    }

    public final ezaj g() {
        return ezaj.b(getInt(cO(6, brnk.a)));
    }

    public final ezan h() {
        return ezan.b(getInt(cO(4, brnk.a)));
    }

    public final ezgi i() {
        String[] strArr = brnk.a;
        if (isNull(cO(3, strArr))) {
            throw new IllegalStateException("found null in cursor for column suggestion");
        }
        byte[] blob = getBlob(cO(3, strArr));
        if (blob == null) {
            return null;
        }
        try {
            return (ezgi) evsn.parseFrom(ezgi.a, blob, evrr.a());
        } catch (Throwable unused) {
            return ezgi.a;
        }
    }

    public final String j() {
        return getString(cO(0, brnk.a));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
