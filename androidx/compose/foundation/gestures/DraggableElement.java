package androidx.compose.foundation.gestures;

import defpackage.dux;
import defpackage.dvh;
import defpackage.dvi;
import defpackage.dwm;
import defpackage.ebk;
import defpackage.fdap;
import defpackage.fdau;
import defpackage.fdbq;
import defpackage.icr;
import defpackage.jdy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class DraggableElement extends jdy<dvh> {
    private static final fdap a = new fdap() { // from class: duy
        @Override // defpackage.fdap
        public final Object invoke(Object obj) {
            return true;
        }
    };
    private final dvi b;
    private final dwm c;
    private final boolean d;
    private final boolean f;
    private final fdau g;
    private final fdau h;
    private final boolean i;
    private final ebk j;

    public DraggableElement(dvi dviVar, dwm dwmVar, boolean z, ebk ebkVar, boolean z2, fdau fdauVar, fdau fdauVar2, boolean z3) {
        this.b = dviVar;
        this.c = dwmVar;
        this.d = z;
        this.j = ebkVar;
        this.f = z2;
        this.g = fdauVar;
        this.h = fdauVar2;
        this.i = z3;
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ icr d() {
        return new dvh(this.b, a, this.c, this.d, this.j, this.f, this.g, this.h, this.i);
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ void e(icr icrVar) {
        boolean z;
        boolean z2;
        dvh dvhVar = (dvh) icrVar;
        fdap fdapVar = a;
        dvi dviVar = dvhVar.a;
        dvi dviVar2 = this.b;
        if (fdbq.f(dviVar, dviVar2)) {
            z = false;
        } else {
            dvhVar.a = dviVar2;
            z = true;
        }
        dwm dwmVar = this.c;
        if (dvhVar.b != dwmVar) {
            dvhVar.b = dwmVar;
            z = true;
        }
        boolean z3 = this.i;
        if (dvhVar.m != z3) {
            dvhVar.m = z3;
            z2 = true;
        } else {
            z2 = z;
        }
        fdau fdauVar = this.h;
        fdau fdauVar2 = this.g;
        boolean z4 = this.f;
        ebk ebkVar = this.j;
        boolean z5 = this.d;
        dvhVar.d = fdauVar2;
        dvhVar.l = fdauVar;
        dvhVar.c = z4;
        dvhVar.C(fdapVar, z5, ebkVar, dwmVar, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DraggableElement draggableElement = (DraggableElement) obj;
        return fdbq.f(this.b, draggableElement.b) && this.c == draggableElement.c && this.d == draggableElement.d && fdbq.f(this.j, draggableElement.j) && this.f == draggableElement.f && fdbq.f(this.g, draggableElement.g) && fdbq.f(this.h, draggableElement.h) && this.i == draggableElement.i;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() * 31) + this.c.hashCode();
        ebk ebkVar = this.j;
        return (((((((((((iHashCode * 31) + dux.a(this.d)) * 31) + (ebkVar != null ? ebkVar.hashCode() : 0)) * 31) + dux.a(this.f)) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + dux.a(this.i);
    }
}
