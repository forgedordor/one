package androidx.compose.ui.focus;

import defpackage.fdap;
import defpackage.icr;
import defpackage.ifp;
import defpackage.jdy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class FocusChangedElement extends jdy<ifp> {
    private final fdap a;

    public FocusChangedElement(fdap fdapVar) {
        this.a = fdapVar;
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ icr d() {
        return new ifp(this.a);
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ void e(icr icrVar) {
        ((ifp) icrVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusChangedElement) && this.a == ((FocusChangedElement) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
