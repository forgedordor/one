package defpackage;

import java.util.Arrays;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azch implements dqoe {
    public static final azch a = new azch();
    public static final Map b = fcwa.h(new fcti(c("message_id"), d("message_id")), new fcti(c("caption"), d("caption")));

    private azch() {
    }

    private static final azbs c(String str) {
        dqpo[] dqpoVarArrB = azcb.b();
        for (int i = 0; i < 2; i++) {
            dqpo dqpoVar = dqpoVarArrB[i];
            String strD = dqpoVar.d();
            if (fdbq.f(strD != null ? fdgn.C(strD, '.', strD) : null, str)) {
                dqpoVar.getClass();
                return (azbs) dqpoVar;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    private static final bqan d(String str) {
        dqpo[] dqpoVarArrB = bqaw.b();
        for (int i = 0; i < 2; i++) {
            dqpo dqpoVar = dqpoVarArrB[i];
            String strD = dqpoVar.d();
            if (fdbq.f(strD != null ? fdgn.C(strD, '.', strD) : null, str)) {
                dqpoVar.getClass();
                return (bqan) dqpoVar;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @Override // defpackage.dqoe
    public final void a() {
        String[] strArr = azcg.a;
        azby azbyVar = new azby();
        azbyVar.f("clearBackupTable");
        azbyVar.e();
        azbyVar.b().b();
    }

    @Override // defpackage.dqoe
    public final void b() {
        String[] strArr = azcg.a;
        dqtq dqtqVar = new dqtq("message_captions_backup", "backup");
        dqtqVar.d = 5;
        Map map = b;
        azbs[] azbsVarArr = (azbs[]) map.keySet().toArray(new azbs[0]);
        dqtqVar.b((dqpo[]) Arrays.copyOf(azbsVarArr, azbsVarArr.length));
        String[] strArr2 = bqbb.a;
        bqay bqayVar = new bqay(bqbb.a);
        bqayVar.s();
        bqan[] bqanVarArr = (bqan[]) map.values().toArray(new bqan[0]);
        bqayVar.c((bqan[]) Arrays.copyOf(bqanVarArr, bqanVarArr.length));
        dqtqVar.c = bqayVar.b();
        dqtqVar.a().a();
    }
}
