package defpackage;

import java.util.Arrays;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azbf implements dqoe {
    public static final azbf a = new azbf();
    public static final Map b = fcwa.h(new fcti(c("_id"), d("_id")), new fcti(c("message_id"), d("message_id")), new fcti(c("trigger_url"), d("trigger_url")), new fcti(c("expiration_time_millis"), d("expiration_time_millis")), new fcti(c("link_title"), d("link_title")), new fcti(c("link_description"), d("link_description")), new fcti(c("link_image_url"), d("link_image_url")), new fcti(c("link_domain"), d("link_domain")), new fcti(c("link_canonical_url"), d("link_canonical_url")));

    private azbf() {
    }

    private static final azaj c(String str) {
        dqpo[] dqpoVarArrB = azaz.b();
        for (int i = 0; i < 9; i++) {
            dqpo dqpoVar = dqpoVarArrB[i];
            String strD = dqpoVar.d();
            if (fdbq.f(strD != null ? fdgn.C(strD, '.', strD) : null, str)) {
                dqpoVar.getClass();
                return (azaj) dqpoVar;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    private static final bpwj d(String str) {
        dqpo[] dqpoVarArrB = bpxc.b();
        for (int i = 0; i < 12; i++) {
            dqpo dqpoVar = dqpoVarArrB[i];
            String strD = dqpoVar.d();
            if (fdbq.f(strD != null ? fdgn.C(strD, '.', strD) : null, str)) {
                dqpoVar.getClass();
                return (bpwj) dqpoVar;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @Override // defpackage.dqoe
    public final void a() {
        String[] strArr = azbe.a;
        azaw azawVar = new azaw();
        azawVar.f("clearBackupTable");
        azawVar.e();
        azawVar.b().b();
    }

    @Override // defpackage.dqoe
    public final void b() {
        String[] strArr = azbe.a;
        dqtq dqtqVar = new dqtq("link_preview_backup", "backup");
        dqtqVar.d = 5;
        Map map = b;
        azaj[] azajVarArr = (azaj[]) map.keySet().toArray(new azaj[0]);
        dqtqVar.b((dqpo[]) Arrays.copyOf(azajVarArr, azajVarArr.length));
        bpxe bpxeVarB = bpxj.b();
        bpxeVarB.s();
        bpwj[] bpwjVarArr = (bpwj[]) map.values().toArray(new bpwj[0]);
        bpxeVarB.c((bpwj[]) Arrays.copyOf(bpwjVarArr, bpwjVarArr.length));
        dqtqVar.c = bpxeVarB.b();
        dqtqVar.a().a();
    }
}
