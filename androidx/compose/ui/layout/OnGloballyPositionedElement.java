package androidx.compose.ui.layout;

import defpackage.fdap;
import defpackage.icr;
import defpackage.ixz;
import defpackage.jdy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class OnGloballyPositionedElement extends jdy<ixz> {
    private final fdap a;

    public OnGloballyPositionedElement(fdap fdapVar) {
        this.a = fdapVar;
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ icr d() {
        return new ixz(this.a);
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ void e(icr icrVar) {
        ((ixz) icrVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OnGloballyPositionedElement) && this.a == ((OnGloballyPositionedElement) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
