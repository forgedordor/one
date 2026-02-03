package defpackage;

import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kcx {
    public final String a = "com.google.android.gms.fonts";
    public final String b = "com.google.android.gms";
    private final List c = null;
    private final int d = R.array.com_google_android_gms_fonts_certs;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kcx)) {
            return false;
        }
        kcx kcxVar = (kcx) obj;
        if (!fdbq.f(this.a, kcxVar.a) || !fdbq.f(this.b, kcxVar.b)) {
            return false;
        }
        List list = kcxVar.c;
        if (!fdbq.f(null, null)) {
            return false;
        }
        int i = kcxVar.d;
        return true;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 961) + R.array.com_google_android_gms_fonts_certs;
    }
}
