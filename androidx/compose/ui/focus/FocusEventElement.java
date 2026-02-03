package androidx.compose.ui.focus;

import defpackage.fdap;
import defpackage.icr;
import defpackage.ifu;
import defpackage.jdy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class FocusEventElement extends jdy<ifu> {
    private final fdap a;

    public FocusEventElement(fdap fdapVar) {
        this.a = fdapVar;
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ icr d() {
        return new ifu(this.a);
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ void e(icr icrVar) {
        ((ifu) icrVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusEventElement) && this.a == ((FocusEventElement) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
