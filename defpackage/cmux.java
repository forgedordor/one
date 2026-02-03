package defpackage;

import android.os.Build;
import android.os.Bundle;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmux implements cmuw {
    private final fcsu a;

    public cmux(fcsu fcsuVar) {
        fcsuVar.getClass();
        this.a = fcsuVar;
    }

    @Override // defpackage.cmuw
    public final Bundle a(int i) {
        Bundle bundle = new Bundle();
        boolean zE = ejuf.e("MOTOROLA", Build.MANUFACTURER);
        int i2 = R.xml.motorola_config_override;
        if (!zE && !ejuf.e("MOTOROLA", Build.BRAND)) {
            i2 = crad.b() ? R.xml.huawei_config_override : crad.c() ? R.xml.lge_config_override : Integer.MIN_VALUE;
        }
        if (i2 != Integer.MIN_VALUE) {
            bundle.putAll(((cmus) this.a.b()).a(i, i2));
        }
        return bundle;
    }
}
