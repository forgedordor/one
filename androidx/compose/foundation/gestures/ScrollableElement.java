package androidx.compose.foundation.gestures;

import defpackage.dop;
import defpackage.dsj;
import defpackage.dvj;
import defpackage.dwm;
import defpackage.dxc;
import defpackage.dxz;
import defpackage.dyb;
import defpackage.ebk;
import defpackage.fdbq;
import defpackage.icr;
import defpackage.jdy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ScrollableElement extends jdy<dxz> {
    private final dyb a;
    private final dwm b;
    private final boolean d;
    private final boolean f;
    private final ebk i;
    private final dop c = null;
    private final dvj g = null;
    private final dsj h = null;

    public ScrollableElement(dyb dybVar, dwm dwmVar, boolean z, boolean z2, ebk ebkVar) {
        this.a = dybVar;
        this.b = dwmVar;
        this.d = z;
        this.f = z2;
        this.i = ebkVar;
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ icr d() {
        return new dxz(this.a, null, null, this.b, this.d, this.f, this.i, null);
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ void e(icr icrVar) {
        ebk ebkVar = this.i;
        ((dxz) icrVar).g(this.a, this.b, null, this.d, this.f, null, ebkVar, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScrollableElement)) {
            return false;
        }
        ScrollableElement scrollableElement = (ScrollableElement) obj;
        if (!fdbq.f(this.a, scrollableElement.a) || this.b != scrollableElement.b) {
            return false;
        }
        dop dopVar = scrollableElement.c;
        if (!fdbq.f(null, null) || this.d != scrollableElement.d || this.f != scrollableElement.f) {
            return false;
        }
        dvj dvjVar = scrollableElement.g;
        if (!fdbq.f(null, null) || !fdbq.f(this.i, scrollableElement.i)) {
            return false;
        }
        dsj dsjVar = scrollableElement.h;
        return fdbq.f(null, null);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        ebk ebkVar = this.i;
        return ((((((iHashCode * 961) + dxc.a(this.d)) * 31) + dxc.a(this.f)) * 961) + (ebkVar != null ? ebkVar.hashCode() : 0)) * 31;
    }
}
