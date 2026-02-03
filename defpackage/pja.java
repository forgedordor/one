package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pja {
    public final pix a;
    private final pji b;

    public pja(pji pjiVar) {
        this.b = pjiVar;
        this.a = new pix(pjiVar);
    }

    public final void a() {
        this.b.a();
    }

    public final void b(Bundle bundle) {
        pji pjiVar = this.b;
        if (!pjiVar.d) {
            pjiVar.a();
        }
        pjb pjbVar = pjiVar.a;
        if (pjbVar.P().a().a(lvb.d)) {
            lvb lvbVarA = pjbVar.P().a();
            Objects.toString(lvbVarA);
            throw new IllegalStateException("performRestore cannot be called when owner is ".concat(String.valueOf(lvbVarA)));
        }
        if (pjiVar.f) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        Bundle bundleB = null;
        if (bundle != null && pis.g(bundle, "androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            bundleB = pis.b(bundle, "androidx.lifecycle.BundlableSavedStateRegistry.key");
        }
        pjiVar.e = bundleB;
        pjiVar.f = true;
    }

    public final void c(Bundle bundle) {
        Bundle bundleA = lab.a((fcti[]) Arrays.copyOf(new fcti[0], 0));
        pji pjiVar = this.b;
        Bundle bundle2 = pjiVar.e;
        if (bundle2 != null) {
            bundleA.putAll(bundle2);
        }
        synchronized (pjiVar.b) {
            for (Map.Entry entry : pjiVar.c.entrySet()) {
                pjc.b(bundleA, (String) entry.getKey(), ((piw) entry.getValue()).a());
            }
        }
        if (bundleA.isEmpty()) {
            return;
        }
        pjc.b(bundle, "androidx.lifecycle.BundlableSavedStateRegistry.key", bundleA);
    }
}
