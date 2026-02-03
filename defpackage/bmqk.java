package defpackage;

import android.database.Cursor;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bmqk extends dqqf implements bmpy {
    @Deprecated
    public bmqk(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, bmqq bmqqVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, bmqy.a, dqwjVar, dqtmVar, bmqqVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new bmov();
    }

    public final int c() {
        return getInt(cO(9, bmqy.a));
    }

    public final int e() {
        return getInt(cO(8, bmqy.a));
    }

    public final int f() {
        return getInt(cO(5, bmqy.a));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        bmra[] bmraVarArr;
        bmqz[] bmqzVarArr;
        emcn[] emcnVarArr;
        byiv[] byivVarArr;
        long[] jArr;
        String[] strArr;
        bmqz[] bmqzVarArr2;
        int i;
        byiv byivVar;
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
                byiv byivVar2 = null;
                String[] strArr2 = zDj ? z ? (String[]) dqru.D(null, du(getString(cO(0, bmqy.a))), new String[0]) : new String[]{n()} : null;
                dqqf.dA(length, strArr2, new ejxr() { // from class: bmpz
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "_id:".concat(String.valueOf(this.a.getString(0)));
                    }
                });
                String[] strArr3 = dj(1) ? z ? (String[]) dqru.D(null, du(getString(cO(1, bmqy.a))), new String[0]) : new String[]{m()} : null;
                dqqf.dA(length, strArr3, new ejxr() { // from class: bmqc
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "cms_id:".concat(String.valueOf(this.a.getString(1)));
                    }
                });
                if (!dj(2)) {
                    bmraVarArr = null;
                } else if (z) {
                    int[] iArrDs = ds(getString(cO(2, bmqy.a)));
                    bmra[] bmraVarArrValues = bmra.values();
                    int length2 = bmraVarArrValues.length;
                    bmra[] bmraVarArr2 = new bmra[iArrDs.length];
                    for (int i3 = 0; i3 < iArrDs.length; i3++) {
                        int i4 = iArrDs[i3];
                        if (i4 >= length2) {
                            throw new IllegalStateException();
                        }
                        bmraVarArr2[i3] = bmraVarArrValues[i4];
                    }
                    bmraVarArr = (bmra[]) dqru.D(null, bmraVarArr2, new bmra[0]);
                } else {
                    bmraVarArr = new bmra[]{h()};
                }
                dqqf.dA(length, bmraVarArr, new ejxr() { // from class: bmqd
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "cms_data_type:".concat(String.valueOf(this.a.getString(2)));
                    }
                });
                if (!dj(3)) {
                    bmqzVarArr = null;
                } else if (z) {
                    int[] iArrDs2 = ds(getString(cO(3, bmqy.a)));
                    bmqz[] bmqzVarArrValues = bmqz.values();
                    int length3 = bmqzVarArrValues.length;
                    bmqz[] bmqzVarArr3 = new bmqz[iArrDs2.length];
                    for (int i5 = 0; i5 < iArrDs2.length; i5++) {
                        int i6 = iArrDs2[i5];
                        if (i6 >= length3) {
                            throw new IllegalStateException();
                        }
                        bmqzVarArr3[i5] = bmqzVarArrValues[i6];
                    }
                    bmqzVarArr = (bmqz[]) dqru.D(null, bmqzVarArr3, new bmqz[0]);
                } else {
                    bmqzVarArr = new bmqz[]{g()};
                }
                dqqf.dA(length, bmqzVarArr, new ejxr() { // from class: bmqe
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "abandoned_action:".concat(String.valueOf(this.a.getString(3)));
                    }
                });
                if (!dj(4)) {
                    emcnVarArr = null;
                } else if (z) {
                    int[] iArrDs3 = ds(getString(cO(4, bmqy.a)));
                    emcn[] emcnVarArr2 = new emcn[iArrDs3.length];
                    for (int i7 = 0; i7 < iArrDs3.length; i7++) {
                        emcn emcnVarB = emcn.b(iArrDs3[i7]);
                        if (emcnVarB == null) {
                            throw new IllegalStateException();
                        }
                        emcnVarArr2[i7] = emcnVarB;
                    }
                    emcnVarArr = (emcn[]) dqru.D(null, emcnVarArr2, new emcn[0]);
                } else {
                    emcnVarArr = new emcn[]{j()};
                }
                dqqf.dA(length, emcnVarArr, new ejxr() { // from class: bmqf
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "failure_reason:".concat(String.valueOf(this.a.getString(4)));
                    }
                });
                int[] iArrA = dj(5) ? z ? dqru.A(null, ds(getString(cO(5, bmqy.a)))) : new int[]{f()} : null;
                dqqf.dy(length, iArrA, new ejxr() { // from class: bmqg
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "bugle_table_type:".concat(String.valueOf(this.a.getString(5)));
                    }
                });
                String[] strArr4 = dj(6) ? z ? (String[]) dqru.D(null, du(getString(cO(6, bmqy.a))), new String[0]) : new String[]{l()} : null;
                dqqf.dA(length, strArr4, new ejxr() { // from class: bmqh
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "bugle_id:".concat(String.valueOf(this.a.getString(6)));
                    }
                });
                if (!dj(7)) {
                    byivVarArr = null;
                } else if (z) {
                    List listDf = df(getString(cO(7, bmqy.a)));
                    byiv[] byivVarArr2 = new byiv[listDf.size()];
                    Iterator it = listDf.iterator();
                    int i8 = 0;
                    while (it.hasNext()) {
                        byiv byivVar3 = byivVar2;
                        try {
                            byte[] bArrZ = dqru.z((String) it.next());
                            int i9 = i8 + 1;
                            if (bArrZ == null) {
                                byivVar = byivVar3;
                            } else {
                                try {
                                    byivVar = (byiv) evsn.parseFrom(byiv.a, bArrZ);
                                } catch (Throwable unused) {
                                    i8 = i9;
                                    byivVarArr2[i8] = byivVar3;
                                    i8++;
                                    byivVar2 = byivVar3;
                                    i2 = 0;
                                }
                            }
                            byivVarArr2[i8] = byivVar;
                            i8 = i9;
                        } catch (Throwable unused2) {
                        }
                        byivVar2 = byivVar3;
                        i2 = 0;
                    }
                    byivVarArr = (byiv[]) dqru.D(byivVar2, byivVarArr2, new byiv[i2]);
                } else {
                    byivVarArr = new byiv[]{i()};
                }
                dqqf.dA(length, byivVarArr, new ejxr() { // from class: bmqi
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "cms_backup_parameters:".concat(String.valueOf(this.a.getString(7)));
                    }
                });
                int[] iArrA2 = dj(8) ? z ? dqru.A(null, ds(getString(cO(8, bmqy.a)))) : new int[]{e()} : null;
                dqqf.dy(length, iArrA2, new ejxr() { // from class: bmqj
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "backup_flags:".concat(String.valueOf(this.a.getString(8)));
                    }
                });
                int[] iArrA3 = dj(9) ? z ? dqru.A(null, ds(getString(cO(9, bmqy.a)))) : new int[]{c()} : null;
                dqqf.dy(length, iArrA3, new ejxr() { // from class: bmqa
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "backup_dependency_table_type:".concat(String.valueOf(this.a.getString(9)));
                    }
                });
                if (!dj(10)) {
                    jArr = jArrDC;
                    strArr = null;
                } else if (z) {
                    jArr = jArrDC;
                    strArr = (String[]) dqru.D(null, du(getString(cO(10, bmqy.a))), new String[0]);
                } else {
                    jArr = jArrDC;
                    strArr = new String[]{k()};
                }
                dqqf.dA(length, strArr, new ejxr() { // from class: bmqb
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "backup_dependency_bugle_id:".concat(String.valueOf(this.a.getString(10)));
                    }
                });
                ekfw ekfwVar = new ekfw();
                int i10 = 0;
                while (i10 < length) {
                    long j = jArr[i10];
                    if (j <= 0 || hashSet.contains(Long.valueOf(j))) {
                        bmqzVarArr2 = bmqzVarArr;
                        i = length;
                    } else {
                        hashSet.add(Long.valueOf(jArr[i10]));
                        String[] strArr5 = bmqy.a;
                        bmoz bmozVar = new bmoz();
                        bmozVar.aF();
                        bmozVar.aD();
                        long j2 = jArr[i10];
                        bmqzVarArr2 = bmqzVarArr;
                        if (strArr2 != null) {
                            String str = strArr2[i10];
                            i = length;
                            bmozVar.aE(0);
                            bmozVar.a = str;
                        } else {
                            i = length;
                        }
                        if (strArr3 != null) {
                            bmozVar.k(strArr3[i10]);
                        }
                        if (bmraVarArr != null) {
                            bmozVar.j(bmraVarArr[i10]);
                        }
                        if (bmqzVarArr2 != null) {
                            bmozVar.c(bmqzVarArr2[i10]);
                        }
                        if (emcnVarArr != null) {
                            bmozVar.l(emcnVarArr[i10]);
                        }
                        if (iArrA != null) {
                            bmozVar.h(iArrA[i10]);
                        }
                        if (strArr4 != null) {
                            bmozVar.g(strArr4[i10]);
                        }
                        if (byivVarArr != null) {
                            bmozVar.i(byivVarArr[i10]);
                        }
                        if (iArrA2 != null) {
                            bmozVar.f(iArrA2[i10]);
                        }
                        if (iArrA3 != null) {
                            bmozVar.e(iArrA3[i10]);
                        }
                        if (strArr != null) {
                            bmozVar.d(strArr[i10]);
                        }
                        ekfwVar.h(bmozVar.a());
                    }
                    i10++;
                    bmqzVarArr = bmqzVarArr2;
                    length = i;
                }
                return ekfwVar.g();
            }
        }
        int i11 = ekgb.d;
        return ekoe.a;
    }

    public final bmqz g() {
        bmqz[] bmqzVarArrValues = bmqz.values();
        int i = getInt(cO(3, bmqy.a));
        if (i < bmqzVarArrValues.length) {
            return bmqzVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    public final bmra h() {
        bmra[] bmraVarArrValues = bmra.values();
        int i = getInt(cO(2, bmqy.a));
        if (i < bmraVarArrValues.length) {
            return bmraVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    public final byiv i() {
        byte[] blob = getBlob(cO(7, bmqy.a));
        if (blob == null) {
            return null;
        }
        try {
            return (byiv) evsn.parseFrom(byiv.a, blob, evrr.a());
        } catch (Throwable unused) {
            return byiv.a;
        }
    }

    public final emcn j() {
        return emcn.b(getInt(cO(4, bmqy.a)));
    }

    public final String k() {
        return getString(cO(10, bmqy.a));
    }

    public final String l() {
        return getString(cO(6, bmqy.a));
    }

    public final String m() {
        return getString(cO(1, bmqy.a));
    }

    public final String n() {
        return getString(cO(0, bmqy.a));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
