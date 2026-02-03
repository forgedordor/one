package androidx.compose.ui.layout;

import defpackage.fdbq;
import defpackage.icr;
import defpackage.iwb;
import defpackage.jdy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class LayoutIdElement extends jdy<iwb> {
    private final Object a;

    public LayoutIdElement(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ icr d() {
        return new iwb(this.a);
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ void e(icr icrVar) {
        ((iwb) icrVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutIdElement) && fdbq.f(this.a, ((LayoutIdElement) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LayoutIdElement(layoutId=" + this.a + ')';
    }
}
