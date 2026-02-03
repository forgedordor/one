package androidx.compose.ui.layout;

import defpackage.fdau;
import defpackage.icr;
import defpackage.iwk;
import defpackage.jdy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class LayoutElement extends jdy<iwk> {
    private final fdau a;

    public LayoutElement(fdau fdauVar) {
        this.a = fdauVar;
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ icr d() {
        return new iwk(this.a);
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ void e(icr icrVar) {
        ((iwk) icrVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutElement) && this.a == ((LayoutElement) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
