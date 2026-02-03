package androidx.compose.ui.focus;

import defpackage.fdbq;
import defpackage.icr;
import defpackage.igr;
import defpackage.igw;
import defpackage.jdy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class FocusRequesterElement extends jdy<igw> {
    private final igr a;

    public FocusRequesterElement(igr igrVar) {
        this.a = igrVar;
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ icr d() {
        return new igw(this.a);
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ void e(icr icrVar) {
        igw igwVar = (igw) icrVar;
        igwVar.a.d.m(igwVar);
        igwVar.a = this.a;
        igwVar.a.d.n(igwVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusRequesterElement) && fdbq.f(this.a, ((FocusRequesterElement) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FocusRequesterElement(focusRequester=" + this.a + ')';
    }
}
