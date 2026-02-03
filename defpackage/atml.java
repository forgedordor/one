package defpackage;

import android.database.Cursor;
import android.net.Uri;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atml extends dqqf implements atmc {
    @Deprecated
    public atml(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, atmr atmrVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, atmx.a, dqwjVar, dqtmVar, atmrVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new atlh();
    }

    public final Uri c() {
        String string = getString(cO(2, atmx.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final athh e() {
        return athg.a(getString(cO(0, atmx.a)));
    }

    public final atmy f() {
        atmy[] atmyVarArrValues = atmy.values();
        int i = getInt(cO(1, atmx.a));
        if (i < atmyVarArrValues.length) {
            return atmyVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        athh[] athhVarArr;
        atmy[] atmyVarArr;
        Uri[] uriArr;
        aubx[] aubxVarArr;
        eyfn[] eyfnVarArr;
        aucj[] aucjVarArr;
        long[] jArr;
        int i;
        epwc[] epwcVarArr;
        long[] jArr2;
        epwc epwcVar;
        aucj aucjVar;
        eyfn eyfnVar;
        aubx aubxVar;
        dqwl dqwlVar = dqthVar.a;
        long[] jArrDC = dC(getString(dqthVar.h + 1));
        int length = jArrDC.length;
        if (length != 0) {
            int i2 = 0;
            if (length != 1 || jArrDC[0] != -1) {
                HashSet hashSet = new HashSet();
                boolean z = this.d.b;
                aucj aucjVar2 = null;
                if (!dj(0)) {
                    athhVarArr = null;
                } else if (z) {
                    String[] strArrDu = du(getString(cO(0, atmx.a)));
                    int length2 = strArrDu.length;
                    athh[] athhVarArr2 = new athh[length2];
                    for (int i3 = 0; i3 < length2; i3++) {
                        athhVarArr2[i3] = athg.a(strArrDu[i3]);
                    }
                    athhVarArr = (athh[]) dqru.D(null, athhVarArr2, new athh[0]);
                } else {
                    athhVarArr = new athh[]{e()};
                }
                dqqf.dA(length, athhVarArr, new ejxr() { // from class: atmd
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "processing_id:".concat(String.valueOf(this.a.getString(0)));
                    }
                });
                if (!dj(1)) {
                    atmyVarArr = null;
                } else if (z) {
                    int[] iArrDs = ds(getString(cO(1, atmx.a)));
                    atmy[] atmyVarArrValues = atmy.values();
                    int length3 = atmyVarArrValues.length;
                    atmy[] atmyVarArr2 = new atmy[iArrDs.length];
                    for (int i4 = 0; i4 < iArrDs.length; i4++) {
                        int i5 = iArrDs[i4];
                        if (i5 >= length3) {
                            throw new IllegalStateException();
                        }
                        atmyVarArr2[i4] = atmyVarArrValues[i5];
                    }
                    atmyVarArr = (atmy[]) dqru.D(null, atmyVarArr2, new atmy[0]);
                } else {
                    atmyVarArr = new atmy[]{f()};
                }
                dqqf.dA(length, atmyVarArr, new ejxr() { // from class: atme
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "file_type:".concat(String.valueOf(this.a.getString(1)));
                    }
                });
                if (!dj(2)) {
                    uriArr = null;
                } else if (z) {
                    String[] strArrDu2 = du(getString(cO(2, atmx.a)));
                    int length4 = strArrDu2.length;
                    Uri[] uriArr2 = new Uri[length4];
                    int i6 = 0;
                    int i7 = 0;
                    while (i6 < length4) {
                        String str = strArrDu2[i6];
                        int i8 = i7 + 1;
                        uriArr2[i7] = (str == null || str.length() == 0) ? null : Uri.parse(str);
                        i6++;
                        i7 = i8;
                    }
                    uriArr = (Uri[]) dqru.D(null, uriArr2, new Uri[0]);
                } else {
                    uriArr = new Uri[]{c()};
                }
                dqqf.dA(length, uriArr, new ejxr() { // from class: atmf
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "file_uri:".concat(String.valueOf(this.a.getString(2)));
                    }
                });
                if (!dj(3)) {
                    aubxVarArr = null;
                } else if (z) {
                    List listDf = df(getString(cO(3, atmx.a)));
                    aubx[] aubxVarArr2 = new aubx[listDf.size()];
                    Iterator it = listDf.iterator();
                    int i9 = 0;
                    while (it.hasNext()) {
                        try {
                            byte[] bArrZ = dqru.z((String) it.next());
                            int i10 = i9 + 1;
                            if (bArrZ == null) {
                                aubxVar = null;
                            } else {
                                try {
                                    aubxVar = (aubx) evsn.parseFrom(aubx.a, bArrZ);
                                } catch (Throwable unused) {
                                    i9 = i10;
                                    aubxVarArr2[i9] = null;
                                    i9++;
                                }
                            }
                            aubxVarArr2[i9] = aubxVar;
                            i9 = i10;
                        } catch (Throwable unused2) {
                        }
                    }
                    aubxVarArr = (aubx[]) dqru.D(null, aubxVarArr2, new aubx[0]);
                } else {
                    aubxVarArr = new aubx[]{g()};
                }
                dqqf.dA(length, aubxVarArr, new ejxr() { // from class: atmg
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "content_type:".concat(String.valueOf(this.a.getString(3)));
                    }
                });
                if (!dj(4)) {
                    eyfnVarArr = null;
                } else if (z) {
                    List listDf2 = df(getString(cO(4, atmx.a)));
                    eyfn[] eyfnVarArr2 = new eyfn[listDf2.size()];
                    Iterator it2 = listDf2.iterator();
                    int i11 = 0;
                    while (it2.hasNext()) {
                        try {
                            byte[] bArrZ2 = dqru.z((String) it2.next());
                            int i12 = i11 + 1;
                            if (bArrZ2 == null) {
                                eyfnVar = null;
                            } else {
                                try {
                                    eyfnVar = (eyfn) evsn.parseFrom(eyfn.a, bArrZ2);
                                } catch (Throwable unused3) {
                                    i11 = i12;
                                    eyfnVarArr2[i11] = null;
                                    i11++;
                                }
                            }
                            eyfnVarArr2[i11] = eyfnVar;
                            i11 = i12;
                        } catch (Throwable unused4) {
                        }
                    }
                    eyfnVarArr = (eyfn[]) dqru.D(null, eyfnVarArr2, new eyfn[0]);
                } else {
                    eyfnVarArr = new eyfn[]{j()};
                }
                dqqf.dA(length, eyfnVarArr, new ejxr() { // from class: atmh
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "encryption_metadata:".concat(String.valueOf(this.a.getString(4)));
                    }
                });
                String[] strArr = dj(5) ? z ? (String[]) dqru.D(null, du(getString(cO(5, atmx.a))), new String[0]) : new String[]{k()} : null;
                dqqf.dA(length, strArr, new ejxr() { // from class: atmi
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "transfer_handle:".concat(String.valueOf(this.a.getString(5)));
                    }
                });
                if (!dj(6)) {
                    aucjVarArr = null;
                } else if (z) {
                    List listDf3 = df(getString(cO(6, atmx.a)));
                    aucj[] aucjVarArr2 = new aucj[listDf3.size()];
                    Iterator it3 = listDf3.iterator();
                    int i13 = 0;
                    while (it3.hasNext()) {
                        aucj aucjVar3 = aucjVar2;
                        try {
                            byte[] bArrZ3 = dqru.z((String) it3.next());
                            int i14 = i13 + 1;
                            if (bArrZ3 == null) {
                                aucjVar = aucjVar3;
                            } else {
                                try {
                                    aucjVar = (aucj) evsn.parseFrom(aucj.a, bArrZ3);
                                } catch (Throwable unused5) {
                                    i13 = i14;
                                    aucjVarArr2[i13] = aucjVar3;
                                    i13++;
                                    aucjVar2 = aucjVar3;
                                    i2 = 0;
                                }
                            }
                            aucjVarArr2[i13] = aucjVar;
                            i13 = i14;
                        } catch (Throwable unused6) {
                        }
                        aucjVar2 = aucjVar3;
                        i2 = 0;
                    }
                    aucjVarArr = (aucj[]) dqru.D(aucjVar2, aucjVarArr2, new aucj[i2]);
                } else {
                    aucjVarArr = new aucj[]{h()};
                }
                dqqf.dA(length, aucjVarArr, new ejxr() { // from class: atmj
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "upload_result:".concat(String.valueOf(this.a.getString(6)));
                    }
                });
                if (!dj(7)) {
                    jArr = jArrDC;
                    i = 0;
                    epwcVarArr = null;
                } else if (z) {
                    List listDf4 = df(getString(cO(7, atmx.a)));
                    epwc[] epwcVarArr2 = new epwc[listDf4.size()];
                    Iterator it4 = listDf4.iterator();
                    int i15 = 0;
                    while (it4.hasNext()) {
                        try {
                            byte[] bArrZ4 = dqru.z((String) it4.next());
                            int i16 = i15 + 1;
                            if (bArrZ4 == null) {
                                jArr2 = jArrDC;
                                epwcVar = null;
                            } else {
                                jArr2 = jArrDC;
                                try {
                                    epwcVar = (epwc) evsn.parseFrom(epwc.a, bArrZ4);
                                } catch (Throwable unused7) {
                                    i15 = i16;
                                    epwcVarArr2[i15] = null;
                                    i15++;
                                    jArrDC = jArr2;
                                }
                            }
                            epwcVarArr2[i15] = epwcVar;
                            i15 = i16;
                        } catch (Throwable unused8) {
                            jArr2 = jArrDC;
                        }
                        jArrDC = jArr2;
                    }
                    jArr = jArrDC;
                    i = 0;
                    epwcVarArr = (epwc[]) dqru.D(null, epwcVarArr2, new epwc[0]);
                } else {
                    jArr = jArrDC;
                    i = 0;
                    epwcVarArr = new epwc[]{i()};
                }
                dqqf.dA(length, epwcVarArr, new ejxr() { // from class: atmk
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "mls_file_metadata:".concat(String.valueOf(this.a.getString(7)));
                    }
                });
                ekfw ekfwVar = new ekfw();
                while (i < length) {
                    long j = jArr[i];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(jArr[i]));
                        String[] strArr2 = atmx.a;
                        atlj atljVar = new atlj();
                        atljVar.aF();
                        atljVar.aD();
                        long j2 = jArr[i];
                        if (athhVarArr != null) {
                            atljVar.e(athhVarArr[i]);
                        }
                        if (atmyVarArr != null) {
                            atljVar.c(atmyVarArr[i]);
                        }
                        if (uriArr != null) {
                            Uri uri = uriArr[i];
                            atljVar.aE(2);
                            atljVar.c = uri;
                        }
                        if (aubxVarArr != null) {
                            aubx aubxVar2 = aubxVarArr[i];
                            atljVar.aE(3);
                            atljVar.d = aubxVar2;
                        }
                        if (eyfnVarArr != null) {
                            atljVar.b(eyfnVarArr[i]);
                        }
                        if (strArr != null) {
                            atljVar.f(strArr[i]);
                        }
                        if (aucjVarArr != null) {
                            atljVar.g(aucjVarArr[i]);
                        }
                        if (epwcVarArr != null) {
                            atljVar.d(epwcVarArr[i]);
                        }
                        ekfwVar.h(atljVar.a());
                    }
                    i++;
                }
                return ekfwVar.g();
            }
        }
        int i17 = ekgb.d;
        return ekoe.a;
    }

    public final aubx g() {
        byte[] blob = getBlob(cO(3, atmx.a));
        if (blob == null) {
            return null;
        }
        try {
            return (aubx) evsn.parseFrom(aubx.a, blob, evrr.a());
        } catch (Throwable unused) {
            return aubx.a;
        }
    }

    public final aucj h() {
        byte[] blob = getBlob(cO(6, atmx.a));
        if (blob == null) {
            return null;
        }
        try {
            return (aucj) evsn.parseFrom(aucj.a, blob, evrr.a());
        } catch (Throwable unused) {
            return aucj.a;
        }
    }

    public final epwc i() {
        byte[] blob = getBlob(cO(7, atmx.a));
        if (blob == null) {
            return null;
        }
        try {
            return (epwc) evsn.parseFrom(epwc.a, blob, evrr.a());
        } catch (Throwable unused) {
            return epwc.a;
        }
    }

    public final eyfn j() {
        byte[] blob = getBlob(cO(4, atmx.a));
        if (blob == null) {
            return null;
        }
        try {
            return (eyfn) evsn.parseFrom(eyfn.a, blob, evrr.a());
        } catch (Throwable unused) {
            return eyfn.a;
        }
    }

    public final String k() {
        return getString(cO(5, atmx.a));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
