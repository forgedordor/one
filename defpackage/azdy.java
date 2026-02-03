package defpackage;

import java.util.Arrays;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azdy implements dqoe {
    public static final azdy a = new azdy();
    public static final Map b = fcwa.h(new fcti(c("_id"), d("_id")), new fcti(c("message_id"), d("message_id")), new fcti(c("reactions_data"), d("reactions_data")), new fcti(c("reacted_message_id"), d("reacted_message_id")), new fcti(c("reaction"), d("reaction")), new fcti(c("applied_reaction"), d("applied_reaction")));

    private azdy() {
    }

    private static final azde c(String str) {
        dqpo[] dqpoVarArrC = azds.c();
        for (int i = 0; i < 6; i++) {
            dqpo dqpoVar = dqpoVarArrC[i];
            String strD = dqpoVar.d();
            if (fdbq.f(strD != null ? fdgn.C(strD, '.', strD) : null, str)) {
                dqpoVar.getClass();
                return (azde) dqpoVar;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    private static final bqjq d(String str) {
        dqpo[] dqpoVarArrB = bqke.b();
        for (int i = 0; i < 7; i++) {
            dqpo dqpoVar = dqpoVarArrB[i];
            String strD = dqpoVar.d();
            if (fdbq.f(strD != null ? fdgn.C(strD, '.', strD) : null, str)) {
                dqpoVar.getClass();
                return (bqjq) dqpoVar;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @Override // defpackage.dqoe
    public final void a() {
        String[] strArr = azdx.a;
        azdo azdoVar = new azdo();
        azdoVar.f("clearBackupTable");
        azdoVar.e();
        azdoVar.b().b();
    }

    @Override // defpackage.dqoe
    public final void b() {
        String[] strArr = azdx.a;
        dqtq dqtqVar = new dqtq("message_reactions_backup", "backup");
        dqtqVar.d = 5;
        Map map = b;
        azde[] azdeVarArr = (azde[]) map.keySet().toArray(new azde[0]);
        dqtqVar.b((dqpo[]) Arrays.copyOf(azdeVarArr, azdeVarArr.length));
        bqkg bqkgVarA = bqkl.a();
        bqkgVarA.s();
        bqjq[] bqjqVarArr = (bqjq[]) map.values().toArray(new bqjq[0]);
        bqkgVarA.c((bqjq[]) Arrays.copyOf(bqjqVarArr, bqjqVarArr.length));
        dqtqVar.c = bqkgVarA.b();
        dqtqVar.a().a();
    }
}
