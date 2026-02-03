package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class piq implements piw {
    public final Set a = new LinkedHashSet();

    public piq(pix pixVar) {
        pixVar.b("androidx.savedstate.Restarter", this);
    }

    @Override // defpackage.piw
    public final Bundle a() {
        Bundle bundleA = lab.a((fcti[]) Arrays.copyOf(new fcti[0], 0));
        pjc.f(bundleA, "classes_to_restore", fcva.ao(this.a));
        return bundleA;
    }
}
