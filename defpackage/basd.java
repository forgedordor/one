package defpackage;

import android.os.BaseBundle;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class basd extends basf {
    public static final basd a = new basd(null);

    private basd(String str) {
        super(str);
    }

    public static basd a(String str) {
        return str == null ? a : new basd(str);
    }

    public static basd b(BaseBundle baseBundle, String str) {
        return baseBundle == null ? a : a(baseBundle.getString(str));
    }

    public final String toString() {
        return "RcsMessageIdType:".concat(String.valueOf(this.b));
    }
}
