package defpackage;

import android.database.Cursor;
import java.util.HashSet;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bukj extends dqqf implements bukf {
    @Deprecated
    public bukj(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, bukp bukpVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, bukt.a, dqwjVar, dqtmVar, bukpVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new bujs();
    }

    public final int c() {
        return getInt(cO(0, bukt.a));
    }

    public final buku e() {
        buku[] bukuVarArrValues = buku.values();
        int i = getInt(cO(2, bukt.a));
        if (i < bukuVarArrValues.length) {
            return bukuVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    public final String f() {
        return getString(cO(1, bukt.a));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        dqwl dqwlVar = dqthVar.a;
        long[] jArrDC = dC(getString(dqthVar.h + 1));
        int length = jArrDC.length;
        if (length != 0) {
            if (length != 1 || jArrDC[0] != -1) {
                HashSet hashSet = new HashSet();
                dqtm dqtmVar = this.d;
                boolean zDj = dj(0);
                boolean z = dqtmVar.b;
                buku[] bukuVarArr = null;
                int[] iArrA = zDj ? z ? dqru.A(null, ds(getString(cO(0, bukt.a)))) : new int[]{c()} : null;
                dqqf.dy(length, iArrA, new ejxr() { // from class: bukg
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "_id:".concat(String.valueOf(this.a.getString(0)));
                    }
                });
                String[] strArr = dj(1) ? z ? (String[]) dqru.D(null, du(getString(cO(1, bukt.a))), new String[0]) : new String[]{f()} : null;
                dqqf.dA(length, strArr, new ejxr() { // from class: bukh
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "name:".concat(String.valueOf(this.a.getString(1)));
                    }
                });
                if (dj(2)) {
                    if (z) {
                        int[] iArrDs = ds(getString(cO(2, bukt.a)));
                        buku[] bukuVarArrValues = buku.values();
                        int length2 = bukuVarArrValues.length;
                        buku[] bukuVarArr2 = new buku[iArrDs.length];
                        for (int i = 0; i < iArrDs.length; i++) {
                            int i2 = iArrDs[i];
                            if (i2 >= length2) {
                                throw new IllegalStateException();
                            }
                            bukuVarArr2[i] = bukuVarArrValues[i2];
                        }
                        bukuVarArr = (buku[]) dqru.D(null, bukuVarArr2, new buku[0]);
                    } else {
                        bukuVarArr = new buku[]{e()};
                    }
                }
                dqqf.dA(length, bukuVarArr, new ejxr() { // from class: buki
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "status:".concat(String.valueOf(this.a.getString(2)));
                    }
                });
                ekfw ekfwVar = new ekfw();
                for (int i3 = 0; i3 < length; i3++) {
                    long j = jArrDC[i3];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(jArrDC[i3]));
                        String[] strArr2 = bukt.a;
                        bujw bujwVar = new bujw();
                        bujwVar.aF();
                        bujwVar.aD();
                        long j2 = jArrDC[i3];
                        if (iArrA != null) {
                            bujwVar.c(iArrA[i3]);
                        }
                        if (strArr != null) {
                            bujwVar.d(strArr[i3]);
                        }
                        if (bukuVarArr != null) {
                            bujwVar.e(bukuVarArr[i3]);
                        }
                        ekfwVar.h(bujwVar.a(new Supplier() { // from class: bujt
                            @Override // java.util.function.Supplier
                            public final Object get() {
                                return new bujs();
                            }
                        }));
                    }
                }
                return ekfwVar.g();
            }
        }
        int i4 = ekgb.d;
        return ekoe.a;
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
