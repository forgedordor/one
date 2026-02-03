package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bulj extends dqqf implements bulg {
    @Deprecated
    public bulj(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, buln bulnVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, bulp.a, dqwjVar, dqtmVar, bulnVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new bukx();
    }

    public final bvee c() {
        return bvee.b(getInt(cO(0, bulp.a)));
    }

    public final boolean e() {
        return getInt(cO(1, bulp.a)) == 1;
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        bvee[] bveeVarArr;
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
        if (!zDj) {
            bveeVarArr = null;
        } else if (z) {
            int[] iArrDs = ds(getString(cO(0, bulp.a)));
            bvee[] bveeVarArr2 = new bvee[iArrDs.length];
            for (int i2 = 0; i2 < iArrDs.length; i2++) {
                bvee bveeVarB = bvee.b(iArrDs[i2]);
                if (bveeVarB == null) {
                    throw new IllegalStateException();
                }
                bveeVarArr2[i2] = bveeVarB;
            }
            bveeVarArr = (bvee[]) dqru.D(null, bveeVarArr2, new bvee[0]);
        } else {
            bveeVarArr = new bvee[]{c()};
        }
        dqqf.dA(length, bveeVarArr, new ejxr() { // from class: bulh
            @Override // defpackage.ejxr
            public final Object get() {
                return "_id:".concat(String.valueOf(this.a.getString(0)));
            }
        });
        boolean[] zArrE = dj(1) ? z ? dqru.E(null, dv(getString(cO(1, bulp.a)))) : new boolean[]{e()} : null;
        dqqf.dB(length, zArrE, new ejxr() { // from class: buli
            @Override // defpackage.ejxr
            public final Object get() {
                return "enabled:".concat(String.valueOf(this.a.getString(1)));
            }
        });
        ekfw ekfwVar = new ekfw();
        for (int i3 = 0; i3 < length; i3++) {
            long j = jArrDC[i3];
            if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                hashSet.add(Long.valueOf(jArrDC[i3]));
                String[] strArr = bulp.a;
                bukz bukzVar = new bukz();
                bukzVar.aF();
                bukzVar.aD();
                long j2 = jArrDC[i3];
                if (bveeVarArr != null) {
                    bvee bveeVar = bveeVarArr[i3];
                    bukzVar.aE(0);
                    bukzVar.a = bveeVar;
                }
                if (zArrE != null) {
                    boolean z2 = zArrE[i3];
                    bukzVar.aE(1);
                    bukzVar.b = z2;
                }
                bukx bukxVar = new bukx();
                bukxVar.aD(bukzVar.aB());
                bukxVar.a = bukzVar.a;
                bukxVar.b = bukzVar.b;
                bukxVar.cM = bukzVar.aC();
                ekfwVar.h(bukxVar);
            }
        }
        return ekfwVar.g();
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
