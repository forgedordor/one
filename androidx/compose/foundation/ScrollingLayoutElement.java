package androidx.compose.foundation;

import defpackage.dph;
import defpackage.dpn;
import defpackage.dps;
import defpackage.fdbq;
import defpackage.icr;
import defpackage.jdy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ScrollingLayoutElement extends jdy<dph> {
    private final dpn a;
    private final boolean b;
    private final boolean c;

    public ScrollingLayoutElement(dpn dpnVar, boolean z, boolean z2) {
        this.a = dpnVar;
        this.b = z;
        this.c = z2;
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ icr d() {
        return new dph(this.a, this.b, this.c);
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ void e(icr icrVar) {
        dph dphVar = (dph) icrVar;
        dphVar.a = this.a;
        dphVar.b = this.b;
        dphVar.c = this.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ScrollingLayoutElement)) {
            return false;
        }
        ScrollingLayoutElement scrollingLayoutElement = (ScrollingLayoutElement) obj;
        return fdbq.f(this.a, scrollingLayoutElement.a) && this.b == scrollingLayoutElement.b && this.c == scrollingLayoutElement.c;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + dps.a(this.b)) * 31) + dps.a(this.c);
    }
}
