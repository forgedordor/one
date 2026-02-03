package defpackage;

import j$.time.Duration;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class asqt {
    public static final cczi a = cdag.h(cdag.b, "enable_bot_id_logging_with_block_reports", false);
    public static final cczi b = cdag.h(cdag.b, "enable_draft_toolstone", false);
    public static final cczi c = cdag.e(cdag.b, "rbm_toolstone_reappearance_strategy", 1);
    public static final cczi d = cdag.e(cdag.b, "rbm_toolstone_reappearance_unresponded_time_passed_days", 10);
    public static final cczi e = cdag.e(cdag.b, "rbm_toolstone_reappearance_unresponded_message_count", 10);
    public static final cczi f = cdag.h(cdag.b, "rbm_toolstone_visible_by_default", false);
    public static final cczi g = cdag.e(cdag.b, "rbm_toolstone_first_appearance_strategy", 1);
    public static final cczi h = cdag.e(cdag.b, "rbm_toolstone_first_appearance_unresponded_time_passed_days", 10);
    public static final cczi i = cdag.g(cdag.b, "rbm_toolstone_allowlisted_bot_ids", "google@rbm.goog");
    public static final cczi j = cdag.e(cdag.b, "rbm_toolstone_first_appearance_unresponded_message_count", 10);
    public static final cczi k = cdag.h(cdag.b, "enable_blocking_on_toolstone_calculation", false);
    public static final cczi l = cdag.g(cdag.b, "rbm_toolstone_enabled_domains", "rbm.goog");
    public static final cczv m;

    static {
        dzzf dzzfVar = cdag.b;
        ewtn ewtnVar = (ewtn) ewto.a.createBuilder();
        ewtnVar.getClass();
        DesugarCollections.unmodifiableList(((ewto) ewtnVar.instance).b).getClass();
        ewtnVar.b("OTP");
        evsn evsnVarBuild = ewtnVar.build();
        evsnVarBuild.getClass();
        m = cdag.t(dzzfVar, "hide_rbm_toolstone_categories", (ewto) evsnVarBuild, new dzze() { // from class: asqs
            @Override // defpackage.dzze
            public final Object a(byte[] bArr) {
                return (ewto) evsn.parseFrom(ewto.a, bArr);
            }
        });
        cdag.h(cdag.b, "catch_null_bot_id_and_raw_destination", false);
    }

    public static final List a() {
        Object objE = l.e();
        objE.getClass();
        return b((String) objE);
    }

    public static final List b(String str) {
        if (str.length() == 0) {
            return fcvo.a;
        }
        List listS = fdgn.S(str, new String[]{","}, 0, 6);
        ArrayList arrayList = new ArrayList(fcva.p(listS, 10));
        Iterator it = listS.iterator();
        while (it.hasNext()) {
            arrayList.add(fdgn.x((String) it.next()).toString());
        }
        return arrayList;
    }

    public static final long c(int i2) {
        (i2 == 3 ? (Integer) h.e() : (Integer) d.e()).getClass();
        return Duration.ofDays(Math.max(0, Math.min(90, r2.intValue()))).toMillis();
    }

    public static final int d(int i2) {
        Integer num = i2 == 3 ? (Integer) j.e() : (Integer) e.e();
        num.getClass();
        return Math.max(0, Math.min(30, num.intValue()));
    }
}
