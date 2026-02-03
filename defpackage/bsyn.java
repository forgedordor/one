package defpackage;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bsyn extends dqsi {
    public static final String[] a = {"rbm_business_info.rbm_bot_id", "rbm_business_info.display_name", "rbm_business_info.logo_image_remote_url", "rbm_business_info.logo_image_local_uri", "rbm_business_info.description", "rbm_business_info.color", "rbm_business_info.hero_image_remote_url", "rbm_business_info.hero_image_local_uri", "rbm_business_info.verifier_id", "rbm_business_info.version", "rbm_business_info.expiry_milliseconds", "rbm_business_info.agent_use_case_category"};
    public static final bsxm b;
    public static final int[] c;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("rbm_business_info.agent_use_case_category", 59140);
        ekgiVar.c();
        new ekgi().c();
        b = new bsxm();
        c = new int[]{49030, 59140};
    }

    public static bswk a(String str) {
        bsyi bsyiVarB = b();
        bsyiVarB.A("rbm_business_info.queryOnRbmBotId");
        bsyiVarB.q();
        bsym bsymVar = new bsym();
        bsymVar.b(str);
        bsyiVarB.k(new bsyl(bsymVar));
        return (bswk) dqru.c(bsyiVarB.b());
    }

    public static final bsyi b() {
        String[] strArr;
        Integer numD = d();
        if (numD.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = ekgb.d;
            ekfw ekfwVar = new ekfw();
            ekfwVar.h("rbm_business_info.rbm_bot_id");
            ekfwVar.h("rbm_business_info.display_name");
            ekfwVar.h("rbm_business_info.logo_image_remote_url");
            ekfwVar.h("rbm_business_info.logo_image_local_uri");
            ekfwVar.h("rbm_business_info.description");
            ekfwVar.h("rbm_business_info.color");
            ekfwVar.h("rbm_business_info.hero_image_remote_url");
            ekfwVar.h("rbm_business_info.hero_image_local_uri");
            ekfwVar.h("rbm_business_info.verifier_id");
            ekfwVar.h("rbm_business_info.version");
            ekfwVar.h("rbm_business_info.expiry_milliseconds");
            if (numD.intValue() >= 59140) {
                ekfwVar.h("rbm_business_info.agent_use_case_category");
            }
            strArr = (String[]) ekfwVar.g().toArray(new String[0]);
        }
        return new bsyi(strArr);
    }

    public static dqsy c() {
        return dqru.e("$primary");
    }

    public static Integer d() {
        return Integer.valueOf(h().a());
    }

    public static Object e(String str, Function function, Supplier supplier) {
        bswk bswkVarA = a(str);
        return bswkVarA != null ? function.apply(bswkVarA) : supplier.get();
    }

    public static String f(int i, String str) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rbm_bot_id TEXT PRIMARY KEY");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("display_name TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("logo_image_remote_url TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("logo_image_local_uri TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("description TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("color TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("hero_image_remote_url TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("hero_image_local_uri TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("verifier_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("version TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("expiry_milliseconds INTEGER NOT NULL");
        if (i >= 59140) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("agent_use_case_category INT DEFAULT(0)");
        }
        sb.insert(0, a.a(str, "CREATE TABLE ", " ("));
        sb.append(");");
        return sb.toString();
    }

    public static void g(dqsy dqsyVar, int i) {
        dqsyVar.v(f(i, "rbm_business_info"));
        for (String str : i()) {
            dqsyVar.v(str);
        }
    }

    public static dqxa h() {
        return c().M();
    }

    public static String[] i() {
        return (String[]) new ArrayList().toArray(new String[0]);
    }
}
