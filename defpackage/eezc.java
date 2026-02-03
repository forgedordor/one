package defpackage;

import com.google.android.gms.common.api.Status;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eezc extends dcff {
    /* JADX WARN: Illegal instructions before constructor call */
    public eezc() {
        String str;
        Locale locale = Locale.getDefault();
        Map map = eezn.a;
        if (map.containsKey(-1)) {
            str = ((String) map.get(-1)) + " (https://developer.android.com/reference/com/google/android/play/core/review/model/ReviewErrorCode.html#" + ((String) eezn.b.get(-1)) + ")";
        } else {
            str = "";
        }
        super(new Status(-1, String.format(locale, "Review Error(%d): %s", -1, str)));
    }
}
