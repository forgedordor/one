package defpackage;

import java.util.Arrays;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azpi implements dqoe {
    public static final azpi a = new azpi();
    public static final Map b = fcwa.h(new fcti(c("_id"), d("_id")), new fcti(c("message_id"), d("message_id")), new fcti(c("participant_id"), d("participant_id")), new fcti(c("receive_time"), d("receive_time")), new fcti(c("read_time"), d("read_time")), new fcti(c("ftd_time"), d("ftd_time")));

    private azpi() {
    }

    private static final azop c(String str) {
        dqpo[] dqpoVarArrB = azpc.b();
        for (int i = 0; i < 6; i++) {
            dqpo dqpoVar = dqpoVarArrB[i];
            String strD = dqpoVar.d();
            if (fdbq.f(strD != null ? fdgn.C(strD, '.', strD) : null, str)) {
                dqpoVar.getClass();
                return (azop) dqpoVar;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    private static final btbb d(String str) {
        dqpo[] dqpoVarArrB = btbm.b();
        for (int i = 0; i < 6; i++) {
            dqpo dqpoVar = dqpoVarArrB[i];
            String strD = dqpoVar.d();
            if (fdbq.f(strD != null ? fdgn.C(strD, '.', strD) : null, str)) {
                dqpoVar.getClass();
                return (btbb) dqpoVar;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @Override // defpackage.dqoe
    public final void a() {
        String[] strArr = azph.a;
        azoz azozVar = new azoz();
        azozVar.f("clearBackupTable");
        azozVar.e();
        azozVar.b().b();
    }

    @Override // defpackage.dqoe
    public final void b() {
        String[] strArr = azph.a;
        dqtq dqtqVar = new dqtq("read_reports_backup", "backup");
        dqtqVar.d = 5;
        Map map = b;
        azop[] azopVarArr = (azop[]) map.keySet().toArray(new azop[0]);
        dqtqVar.b((dqpo[]) Arrays.copyOf(azopVarArr, azopVarArr.length));
        btbo btboVarB = btbt.b();
        btboVarB.s();
        btbb[] btbbVarArr = (btbb[]) map.values().toArray(new btbb[0]);
        btboVarB.c((btbb[]) Arrays.copyOf(btbbVarArr, btbbVarArr.length));
        dqtqVar.c = btboVarB.b();
        dqtqVar.a().a();
    }
}
