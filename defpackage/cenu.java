package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cenu {
    public static final cczi a = cdag.g(cdag.b, "cms_environment", "prod");

    public cenu(aurx aurxVar) {
        aurxVar.getClass();
    }

    public static final String a() {
        if (!cqbe.e() && !cqbe.f()) {
            return "jibemessagestore.googleapis.com";
        }
        Optional.empty();
        Object objE = a.e();
        objE.getClass();
        String str = (String) objE;
        return str.equals("autopush") ? "autopush-jibemessagestore.sandbox.googleapis.com" : str.equals("staging") ? "staging-jibemessagestore.sandbox.googleapis.com" : "jibemessagestore.googleapis.com";
    }
}
