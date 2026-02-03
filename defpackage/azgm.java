package defpackage;

import java.util.Arrays;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azgm implements dqoe {
    public static final azgm a = new azgm();
    public static final Map b = fcwa.h(new fcti(c("_id"), d("_id")), new fcti(c("message_id"), d("message_id")));

    private azgm() {
    }

    private static final azfw c(String str) {
        dqpo[] dqpoVarArrC = azgg.c();
        for (int i = 0; i < 2; i++) {
            dqpo dqpoVar = dqpoVarArrC[i];
            String strD = dqpoVar.d();
            if (fdbq.f(strD != null ? fdgn.C(strD, '.', strD) : null, str)) {
                dqpoVar.getClass();
                return (azfw) dqpoVar;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    private static final bqrw d(String str) {
        dqpo[] dqpoVarArrB = bqsf.b();
        for (int i = 0; i < 2; i++) {
            dqpo dqpoVar = dqpoVarArrB[i];
            String strD = dqpoVar.d();
            if (fdbq.f(strD != null ? fdgn.C(strD, '.', strD) : null, str)) {
                dqpoVar.getClass();
                return (bqrw) dqpoVar;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @Override // defpackage.dqoe
    public final void a() {
        String[] strArr = azgl.a;
        azgc azgcVar = new azgc();
        azgcVar.f("clearBackupTable");
        azgcVar.e();
        azgcVar.b().b();
    }

    @Override // defpackage.dqoe
    public final void b() {
        String[] strArr = azgl.a;
        dqtq dqtqVar = new dqtq("message_star_backup", "backup");
        dqtqVar.d = 5;
        Map map = b;
        azfw[] azfwVarArr = (azfw[]) map.keySet().toArray(new azfw[0]);
        dqtqVar.b((dqpo[]) Arrays.copyOf(azfwVarArr, azfwVarArr.length));
        String[] strArr2 = bqsm.a;
        bqsh bqshVar = new bqsh(bqsm.a);
        bqshVar.s();
        bqrw[] bqrwVarArr = (bqrw[]) map.values().toArray(new bqrw[0]);
        bqshVar.c((bqrw[]) Arrays.copyOf(bqrwVarArr, bqrwVarArr.length));
        dqtqVar.c = bqshVar.b();
        dqtqVar.a().a();
    }
}
