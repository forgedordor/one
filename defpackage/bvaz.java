package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvaz extends dqsi {
    public static final String[] a = {"verified_sms_brands._id", "verified_sms_brands.brand_id", "verified_sms_brands.name", "verified_sms_brands.description", "verified_sms_brands.logo_url", "verified_sms_brands.logo_uri", "verified_sms_brands.version_token"};
    public static final bvaj b;
    public static final int[] c;

    static {
        new ekgi().c();
        new ekgi().c();
        b = new bvaj();
        c = new int[]{29120};
    }

    public static buzt a() {
        buzu buzuVar = new buzu();
        buzuVar.aF();
        return buzuVar;
    }

    public static dqsy b() {
        return dqru.e("$primary");
    }

    public static void c(dqsy dqsyVar) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("brand_id TEXT NOT NULL UNIQUE");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("name TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("description TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("logo_url TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("logo_uri TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("version_token TEXT NOT NULL");
        sb.insert(0, "CREATE TABLE verified_sms_brands (");
        sb.append(");");
        dqsyVar.v(sb.toString());
        for (String str : (String[]) new ArrayList().toArray(new String[0])) {
            dqsyVar.v(str);
        }
    }
}
