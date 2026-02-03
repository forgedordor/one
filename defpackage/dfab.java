package defpackage;

import android.text.TextUtils;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum dfab {
    RECV_ONLY("recvonly"),
    SEND_ONLY("sendonly"),
    SEND_RECEIVE("sendrecv"),
    INACTIVE("inactive"),
    NONE("none");

    public final String f;

    dfab(String str) {
        this.f = str;
    }

    public static dfab a(String str) {
        if (!TextUtils.isEmpty(str)) {
            String lowerCase = str.toLowerCase(Locale.US);
            for (dfab dfabVar : values()) {
                if (dfabVar.f.equals(lowerCase)) {
                    return dfabVar;
                }
            }
        }
        return NONE;
    }
}
