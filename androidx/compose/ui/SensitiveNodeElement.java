package androidx.compose.ui;

import defpackage.icr;
import defpackage.icw;
import defpackage.jbg;
import defpackage.jdy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class SensitiveNodeElement extends jdy<icw> {
    private final boolean a = true;

    @Override // defpackage.jdy
    public final /* synthetic */ icr d() {
        return new icw();
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ void e(icr icrVar) {
        icw icwVar = (icw) icrVar;
        icwVar.b = true;
        if (icwVar.a) {
            return;
        }
        jbg.f(icwVar).p();
        icwVar.a = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SensitiveNodeElement)) {
            return false;
        }
        boolean z = ((SensitiveNodeElement) obj).a;
        return true;
    }

    public final int hashCode() {
        return 1231;
    }

    public final String toString() {
        return "SensitiveNodeElement(isContentSensitive=true)";
    }
}
