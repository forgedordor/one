package defpackage;

import android.os.Bundle;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class omm {
    public final String a;
    public final int b;
    public final Bundle c;
    public final Bundle d;

    public omm(Bundle bundle) {
        this.a = pis.c(bundle, "nav-entry-state:id");
        this.b = pis.a(bundle, "nav-entry-state:destination-id");
        this.c = pis.b(bundle, "nav-entry-state:args");
        this.d = pis.b(bundle, "nav-entry-state:saved-state");
    }

    public omm(oip oipVar, int i) {
        this.a = oipVar.d;
        this.b = i;
        this.c = oipVar.a();
        Bundle bundleA = lab.a((fcti[]) Arrays.copyOf(new fcti[0], 0));
        this.d = bundleA;
        oipVar.f.d.c(bundleA);
    }
}
