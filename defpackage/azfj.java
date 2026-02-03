package defpackage;

import java.util.Arrays;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azfj implements dqoe {
    public static final azfj a = new azfj();
    public static final Map b = fcwa.h(new fcti(c("message_id"), d("message_id")), new fcti(c("replied_to_message_id"), d("replied_to_message_id")), new fcti(c("replied_to_message_id_null_reason"), d("replied_to_message_id_null_reason")), new fcti(c("replied_to_rcs_message_id"), d("replied_to_rcs_message_id")));

    private azfj() {
    }

    private static final azer c(String str) {
        dqpo[] dqpoVarArrC = azfd.c();
        for (int i = 0; i < 4; i++) {
            dqpo dqpoVar = dqpoVarArrC[i];
            String strD = dqpoVar.d();
            if (fdbq.f(strD != null ? fdgn.C(strD, '.', strD) : null, str)) {
                dqpoVar.getClass();
                return (azer) dqpoVar;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    private static final bqlj d(String str) {
        dqpo[] dqpoVarArrB = bqlu.b();
        for (int i = 0; i < 4; i++) {
            dqpo dqpoVar = dqpoVarArrB[i];
            String strD = dqpoVar.d();
            if (fdbq.f(strD != null ? fdgn.C(strD, '.', strD) : null, str)) {
                dqpoVar.getClass();
                return (bqlj) dqpoVar;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @Override // defpackage.dqoe
    public final void a() {
        String[] strArr = azfi.a;
        azez azezVar = new azez();
        azezVar.f("clearBackupTable");
        azezVar.e();
        azezVar.b().b();
    }

    @Override // defpackage.dqoe
    public final void b() {
        String[] strArr = azfi.a;
        dqtq dqtqVar = new dqtq("message_replies_backup", "backup");
        dqtqVar.d = 5;
        Map map = b;
        azer[] azerVarArr = (azer[]) map.keySet().toArray(new azer[0]);
        dqtqVar.b((dqpo[]) Arrays.copyOf(azerVarArr, azerVarArr.length));
        String[] strArr2 = bqmc.a;
        bqlw bqlwVar = new bqlw(bqmc.a);
        bqlwVar.s();
        bqlj[] bqljVarArr = (bqlj[]) map.values().toArray(new bqlj[0]);
        bqlwVar.c((bqlj[]) Arrays.copyOf(bqljVarArr, bqljVarArr.length));
        dqtqVar.c = bqlwVar.b();
        dqtqVar.a().a();
    }
}
