package androidx.compose.foundation;

import defpackage.dop;
import defpackage.dpo;
import defpackage.dpr;
import defpackage.dsj;
import defpackage.dvj;
import defpackage.dwm;
import defpackage.dyb;
import defpackage.ebk;
import defpackage.fdbq;
import defpackage.icr;
import defpackage.jdy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ScrollingContainerElement extends jdy<dpr> {
    private final dyb a;
    private final dwm b;
    private final boolean c;
    private final boolean d;
    private final dvj f;
    private final dsj g;
    private final boolean h;
    private final dop i;
    private final ebk j;

    public ScrollingContainerElement(dyb dybVar, dwm dwmVar, boolean z, boolean z2, dvj dvjVar, ebk ebkVar, dsj dsjVar, boolean z3, dop dopVar) {
        this.a = dybVar;
        this.b = dwmVar;
        this.c = z;
        this.d = z2;
        this.f = dvjVar;
        this.j = ebkVar;
        this.g = dsjVar;
        this.h = z3;
        this.i = dopVar;
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ icr d() {
        return new dpr(this.a, this.b, this.c, this.d, this.f, this.j, this.g, this.h, this.i);
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ void e(icr icrVar) {
        ((dpr) icrVar).f(this.a, this.b, this.h, this.i, this.c, this.d, this.f, this.j, this.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ScrollingContainerElement scrollingContainerElement = (ScrollingContainerElement) obj;
        return fdbq.f(this.a, scrollingContainerElement.a) && this.b == scrollingContainerElement.b && this.c == scrollingContainerElement.c && this.d == scrollingContainerElement.d && fdbq.f(this.f, scrollingContainerElement.f) && fdbq.f(this.j, scrollingContainerElement.j) && fdbq.f(this.g, scrollingContainerElement.g) && this.h == scrollingContainerElement.h && fdbq.f(this.i, scrollingContainerElement.i);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        dvj dvjVar = this.f;
        int iA = ((((((iHashCode * 31) + dpo.a(this.c)) * 31) + dpo.a(this.d)) * 31) + (dvjVar != null ? dvjVar.hashCode() : 0)) * 31;
        ebk ebkVar = this.j;
        int iHashCode2 = (iA + (ebkVar != null ? ebkVar.hashCode() : 0)) * 31;
        dsj dsjVar = this.g;
        int iHashCode3 = (((iHashCode2 + (dsjVar != null ? dsjVar.hashCode() : 0)) * 31) + dpo.a(this.h)) * 31;
        dop dopVar = this.i;
        return iHashCode3 + (dopVar != null ? dopVar.hashCode() : 0);
    }
}
