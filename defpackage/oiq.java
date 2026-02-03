package defpackage;

import android.os.Bundle;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oiq {
    private final omm a;

    public oiq(Bundle bundle) {
        bundle.getClass();
        bundle.setClassLoader(getClass().getClassLoader());
        this.a = new omm(bundle);
    }

    public final int a() {
        return this.a.b;
    }

    public final Bundle b() {
        Bundle bundleA = lab.a((fcti[]) Arrays.copyOf(new fcti[0], 0));
        omm ommVar = this.a;
        pjc.d(bundleA, "nav-entry-state:id", ommVar.a);
        bundleA.putInt("nav-entry-state:destination-id", ommVar.b);
        Bundle bundleA2 = ommVar.c;
        if (bundleA2 == null) {
            bundleA2 = lab.a((fcti[]) Arrays.copyOf(new fcti[0], 0));
        }
        pjc.b(bundleA, "nav-entry-state:args", bundleA2);
        pjc.b(bundleA, "nav-entry-state:saved-state", ommVar.d);
        return bundleA;
    }

    public final oip c(omn omnVar, ojx ojxVar, lvb lvbVar, oje ojeVar) {
        omnVar.getClass();
        lvbVar.getClass();
        omm ommVar = this.a;
        Bundle bundle = ommVar.c;
        if (bundle != null) {
            bundle.setClassLoader(omnVar.a.getClassLoader());
        } else {
            bundle = null;
        }
        return oio.a(omnVar, ojxVar, bundle, lvbVar, ojeVar, ommVar.a, ommVar.d);
    }

    public final String d() {
        return this.a.a;
    }

    public oiq(oip oipVar) {
        oipVar.getClass();
        this.a = new omm(oipVar, oipVar.a.c());
    }
}
