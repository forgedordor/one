package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.VmtTable;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvct extends dqqf implements bvco {
    @Deprecated
    public bvct(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, bvcx bvcxVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, VmtTable.a, dqwjVar, dqtmVar, bvcxVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new bvca();
    }

    @Override // defpackage.bvco
    public final String c() {
        String[] strArr = VmtTable.a;
        if (isNull(cO(0, strArr))) {
            throw new IllegalStateException("found null in cursor for column part_id");
        }
        return getString(cO(0, strArr));
    }

    public final aonp e() {
        return aonp.b(getInt(cO(1, VmtTable.a)));
    }

    public final String f() {
        return getString(cO(3, VmtTable.a));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        String[] strArr;
        aonp[] aonpVarArr;
        dqwl dqwlVar = dqthVar.a;
        long[] jArrDC = dC(getString(dqthVar.h + 1));
        int length = jArrDC.length;
        if (length != 0) {
            if (length != 1 || jArrDC[0] != -1) {
                HashSet hashSet = new HashSet();
                dqtm dqtmVar = this.d;
                boolean zDj = dj(0);
                boolean z = dqtmVar.b;
                if (!zDj) {
                    strArr = null;
                } else if (z) {
                    String[] strArr2 = VmtTable.a;
                    if (isNull(cO(0, strArr2))) {
                        throw new IllegalStateException("found null in cursor for column part_id");
                    }
                    strArr = (String[]) dqru.D(null, du(getString(cO(0, strArr2))), new String[0]);
                } else {
                    strArr = new String[]{c()};
                }
                dqqf.dA(length, strArr, new ejxr() { // from class: bvcp
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "part_id:".concat(String.valueOf(this.a.getString(0)));
                    }
                });
                if (!dj(1)) {
                    aonpVarArr = null;
                } else if (z) {
                    int[] iArrDs = ds(getString(cO(1, VmtTable.a)));
                    aonp[] aonpVarArr2 = new aonp[iArrDs.length];
                    for (int i = 0; i < iArrDs.length; i++) {
                        aonp aonpVarB = aonp.b(iArrDs[i]);
                        if (aonpVarB == null) {
                            throw new IllegalStateException();
                        }
                        aonpVarArr2[i] = aonpVarB;
                    }
                    aonpVarArr = (aonp[]) dqru.D(null, aonpVarArr2, new aonp[0]);
                } else {
                    aonpVarArr = new aonp[]{e()};
                }
                dqqf.dA(length, aonpVarArr, new ejxr() { // from class: bvcq
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "vmt_status:".concat(String.valueOf(this.a.getString(1)));
                    }
                });
                String[] strArr3 = dj(2) ? z ? (String[]) dqru.D(null, du(getString(cO(2, VmtTable.a))), new String[0]) : new String[]{g()} : null;
                dqqf.dA(length, strArr3, new ejxr() { // from class: bvcr
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "text:".concat(String.valueOf(this.a.getString(2)));
                    }
                });
                String[] strArr4 = dj(3) ? z ? (String[]) dqru.D(null, du(getString(cO(3, VmtTable.a))), new String[0]) : new String[]{f()} : null;
                dqqf.dA(length, strArr4, new ejxr() { // from class: bvcs
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "locale:".concat(String.valueOf(this.a.getString(3)));
                    }
                });
                ekfw ekfwVar = new ekfw();
                for (int i2 = 0; i2 < length; i2++) {
                    long j = jArrDC[i2];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(jArrDC[i2]));
                        bvcb bvcbVarB = VmtTable.b();
                        bvcbVarB.aD();
                        long j2 = jArrDC[i2];
                        if (strArr != null) {
                            bvcbVarB.c(strArr[i2]);
                        }
                        if (aonpVarArr != null) {
                            bvcbVarB.e(aonpVarArr[i2]);
                        }
                        if (strArr3 != null) {
                            bvcbVarB.d(strArr3[i2]);
                        }
                        if (strArr4 != null) {
                            bvcbVarB.b(strArr4[i2]);
                        }
                        ekfwVar.h(bvcbVarB.a());
                    }
                }
                return ekfwVar.g();
            }
        }
        int i3 = ekgb.d;
        return ekoe.a;
    }

    public final String g() {
        return getString(cO(2, VmtTable.a));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
