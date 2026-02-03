package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhpw {
    public static final long a = TimeUnit.HOURS.toMillis(1);

    public static final pzs a(dhnv dhnvVar) {
        dhnvVar.getClass();
        pzn pznVar = new pzn();
        pznVar.e("key_client_id", dhnvVar.a());
        return pznVar.a();
    }

    public static final dhnv b(pzs pzsVar) {
        String strD = pzsVar.d("key_client_id");
        if (strD != null) {
            if (strD.length() <= 0) {
                strD = null;
            }
            if (strD != null) {
                List listS = fdgn.S(strD, new String[]{":"}, 2, 2);
                return listS.size() == 1 ? new dhnv(strD, "") : new dhnv((String) listS.get(0), (String) listS.get(1));
            }
        }
        return null;
    }

    public static final String c(String str, dhnv dhnvVar) {
        dhnvVar.getClass();
        String str2 = String.format("%s:%s", Arrays.copyOf(new Object[]{str, dhnvVar.a()}, 2));
        str2.getClass();
        return str2;
    }

    public static final int d(int i) {
        return i + (-1) != 1 ? 2 : 3;
    }
}
