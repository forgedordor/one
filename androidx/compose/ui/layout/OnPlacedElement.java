package androidx.compose.ui.layout;

import defpackage.fdap;
import defpackage.icr;
import defpackage.iyc;
import defpackage.jdy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class OnPlacedElement extends jdy<iyc> {
    private final fdap a;

    public OnPlacedElement(fdap fdapVar) {
        this.a = fdapVar;
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ icr d() {
        return new iyc(this.a);
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ void e(icr icrVar) {
        ((iyc) icrVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OnPlacedElement) && this.a == ((OnPlacedElement) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
