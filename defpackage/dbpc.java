package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbpc {
    public static liu a(Bundle bundle) {
        if (bundle.containsKey("authentication_result_type")) {
            return new liu(new lit(bundle.getInt("authentication_result_type")), null);
        }
        if (bundle.containsKey("authentication_error_code")) {
            return new liu(null, new lis(bundle.getInt("authentication_error_code"), bundle.getString("authentication_error_message")));
        }
        throw new IllegalArgumentException("Neither result or error is present in bundle.");
    }
}
