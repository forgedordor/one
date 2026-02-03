package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hyq implements hyk, pjb {
    public final pja a;
    private final /* synthetic */ hyk b;
    private final lvn c;
    private final pix d;

    public hyq(hyk hykVar) {
        this.b = hykVar;
        pja pjaVarA = piz.a(this);
        this.a = pjaVarA;
        this.c = new lvn(this);
        this.d = pjaVarA.a;
        Object objA = a("androidx.savedstate.SavedStateRegistry");
        pjaVarA.b(objA instanceof Bundle ? (Bundle) objA : null);
        e("androidx.savedstate.SavedStateRegistry", new fdae() { // from class: hyp
            @Override // defpackage.fdae
            public final Object invoke() {
                Bundle bundleA = lab.a((fcti[]) Arrays.copyOf(new fcti[0], 0));
                this.a.a.c(bundleA);
                if (bundleA.isEmpty()) {
                    return null;
                }
                return bundleA;
            }
        });
    }

    @Override // defpackage.lvj
    public final /* synthetic */ lvc P() {
        return this.c;
    }

    @Override // defpackage.pjb
    public final pix U() {
        return this.d;
    }

    @Override // defpackage.hyk
    public final Object a(String str) {
        return this.b.a(str);
    }

    @Override // defpackage.hyk
    public final Map b() {
        return this.b.b();
    }

    @Override // defpackage.hyk
    public final boolean d(Object obj) {
        return this.b.d(obj);
    }

    @Override // defpackage.hyk
    public final hyl e(String str, fdae fdaeVar) {
        return this.b.e(str, fdaeVar);
    }
}
