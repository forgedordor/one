package androidx.compose.foundation.gestures;

import defpackage.dop;
import defpackage.drv;
import defpackage.dsd;
import defpackage.dvj;
import defpackage.dwm;
import defpackage.ebk;
import defpackage.fdbq;
import defpackage.icr;
import defpackage.jdy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class AnchoredDraggableElement<T> extends jdy<drv<T>> {
    private final dsd a;
    private final dwm b;
    private final dvj h;
    private final boolean c = true;
    private final Boolean d = null;
    private final ebk i = null;
    private final Boolean f = null;
    private final dop g = null;

    public AnchoredDraggableElement(dsd dsdVar, dwm dwmVar, dvj dvjVar) {
        this.a = dsdVar;
        this.b = dwmVar;
        this.h = dvjVar;
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ icr d() {
        return new drv(this.a, this.b, this.h);
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ void e(icr icrVar) {
        boolean z;
        drv drvVar = (drv) icrVar;
        dvj dvjVar = this.h;
        drvVar.c = dvjVar;
        dsd dsdVar = drvVar.a;
        dsd dsdVar2 = this.a;
        if (fdbq.f(dsdVar, dsdVar2)) {
            z = false;
        } else {
            drvVar.a = dsdVar2;
            drvVar.j(dvjVar);
            z = true;
        }
        dwm dwmVar = this.b;
        if (drvVar.b != dwmVar) {
            drvVar.b = dwmVar;
            z = true;
        }
        drvVar.C(drvVar.f, true, null, dwmVar, (!fdbq.f(null, null)) | z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnchoredDraggableElement)) {
            return false;
        }
        AnchoredDraggableElement anchoredDraggableElement = (AnchoredDraggableElement) obj;
        if (!fdbq.f(this.a, anchoredDraggableElement.a) || this.b != anchoredDraggableElement.b) {
            return false;
        }
        boolean z = anchoredDraggableElement.c;
        Boolean bool = anchoredDraggableElement.d;
        if (!fdbq.f(null, null)) {
            return false;
        }
        ebk ebkVar = anchoredDraggableElement.i;
        if (!fdbq.f(null, null)) {
            return false;
        }
        Boolean bool2 = anchoredDraggableElement.f;
        if (!fdbq.f(null, null)) {
            return false;
        }
        dop dopVar = anchoredDraggableElement.g;
        return fdbq.f(null, null) && fdbq.f(this.h, anchoredDraggableElement.h);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        dvj dvjVar = this.h;
        return (((iHashCode * 31) + 1231) * 28629151) + (dvjVar != null ? dvjVar.hashCode() : 0);
    }
}
