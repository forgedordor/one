package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lww implements piw {
    public Bundle a;
    private final pix b;
    private boolean c;
    private final fctc d;

    public lww(pix pixVar, final lxq lxqVar) {
        pixVar.getClass();
        this.b = pixVar;
        this.d = fctd.a(new fdae() { // from class: lwv
            @Override // defpackage.fdae
            public final Object invoke() {
                return lwu.b(lxqVar);
            }
        });
    }

    private final lwx c() {
        return (lwx) this.d.a();
    }

    @Override // defpackage.piw
    public final Bundle a() {
        Bundle bundleA = lab.a((fcti[]) Arrays.copyOf(new fcti[0], 0));
        Bundle bundle = this.a;
        if (bundle != null) {
            bundleA.putAll(bundle);
        }
        for (Map.Entry entry : c().a.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleA2 = ((lwn) entry.getValue()).a().a();
            if (!bundleA2.isEmpty()) {
                pjc.b(bundleA, str, bundleA2);
            }
        }
        this.c = false;
        return bundleA;
    }

    public final void b() {
        if (this.c) {
            return;
        }
        Bundle bundleA = this.b.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundleA2 = lab.a((fcti[]) Arrays.copyOf(new fcti[0], 0));
        Bundle bundle = this.a;
        if (bundle != null) {
            bundleA2.putAll(bundle);
        }
        if (bundleA != null) {
            bundleA2.putAll(bundleA);
        }
        this.a = bundleA2;
        this.c = true;
        c();
    }
}
