package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awxh extends dqsi {
    public static final String[] a = {"my_identities.token", "my_identities.canonical_token", "my_identities.provisioning_id_v2", "my_identities.is_verified_v2", "my_identities.address_type", "my_identities.phone_number", "my_identities.display_name"};
    public static final ekgp b;
    public static final awwl c;
    public static final int[] d;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("my_identities.canonical_token", 60530);
        ekgiVar.i("my_identities.provisioning_id_v2", 60810);
        ekgiVar.i("my_identities.is_verified_v2", 60810);
        ekgiVar.i("my_identities.address_type", 59980);
        ekgiVar.i("my_identities.display_name", 60120);
        b = ekgiVar.c();
        ekgi ekgiVar2 = new ekgi();
        ekgiVar2.i("canonical_token", "index_my_identities_canonical_token");
        ekgiVar2.c();
        c = new awwl();
        d = new int[]{59450, 59980, 59990, 60120, 60320, 60530, 60810};
    }

    public static final awxc a() {
        String[] strArr;
        Integer numC = c();
        if (numC.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = ekgb.d;
            ekfw ekfwVar = new ekfw();
            ekfwVar.h("my_identities.token");
            if (numC.intValue() >= 60530) {
                ekfwVar.h("my_identities.canonical_token");
            }
            if (numC.intValue() >= 60810) {
                ekfwVar.h("my_identities.provisioning_id_v2");
            }
            if (numC.intValue() >= 60810) {
                ekfwVar.h("my_identities.is_verified_v2");
            }
            if (numC.intValue() >= 59980) {
                ekfwVar.h("my_identities.address_type");
            }
            ekfwVar.h("my_identities.phone_number");
            if (numC.intValue() >= 60120) {
                ekfwVar.h("my_identities.display_name");
            }
            strArr = (String[]) ekfwVar.g().toArray(new String[0]);
        }
        return new awxc(strArr);
    }

    public static dqsy b() {
        return dqru.e("$primary");
    }

    public static Integer c() {
        return Integer.valueOf(e().a());
    }

    public static void d(dqsy dqsyVar, int i) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("token TEXT PRIMARY KEY NOT NULL");
        if (i >= 60530) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("canonical_token TEXT REFERENCES my_identities(token) ON DELETE NO ACTION ON UPDATE CASCADE");
        }
        if (i >= 59990) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("provisioning_id TEXT");
        }
        if (i >= 60810) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("provisioning_id_v2 TEXT");
        }
        if (i >= 60320) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("is_verified INT DEFAULT(0) NOT NULL");
        }
        if (i >= 60810) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("is_verified_v2 INT DEFAULT(0) NOT NULL");
        }
        if (i >= 59980) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("address_type INT");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("phone_number TEXT");
        if (i >= 60120) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("display_name TEXT");
        }
        sb.insert(0, "CREATE TABLE my_identities (");
        sb.append(");");
        dqsyVar.v(sb.toString());
        ArrayList arrayList = new ArrayList();
        if (i >= 60530) {
            arrayList.add("DROP INDEX IF EXISTS index_my_identities_canonical_token");
            arrayList.add("CREATE INDEX index_my_identities_canonical_token ON my_identities(canonical_token);");
        }
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            dqsyVar.v(str);
        }
    }

    public static dqxa e() {
        return b().M();
    }
}
