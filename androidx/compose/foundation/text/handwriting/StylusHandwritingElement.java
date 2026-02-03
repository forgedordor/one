package androidx.compose.foundation.text.handwriting;

import defpackage.fdae;
import defpackage.fej;
import defpackage.icr;
import defpackage.jdy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class StylusHandwritingElement extends jdy<fej> {
    private final fdae a;

    public StylusHandwritingElement(fdae fdaeVar) {
        this.a = fdaeVar;
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ icr d() {
        return new fej(this.a);
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ void e(icr icrVar) {
        ((fej) icrVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StylusHandwritingElement) && this.a == ((StylusHandwritingElement) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
