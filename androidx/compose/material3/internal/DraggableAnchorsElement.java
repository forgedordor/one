package androidx.compose.material3.internal;

import defpackage.dwm;
import defpackage.fdat;
import defpackage.fdbq;
import defpackage.hgn;
import defpackage.hii;
import defpackage.icr;
import defpackage.jdy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class DraggableAnchorsElement<T> extends jdy<hii<T>> {
    private final hgn a;
    private final fdat b;
    private final dwm c;

    public DraggableAnchorsElement(hgn hgnVar, fdat fdatVar, dwm dwmVar) {
        this.a = hgnVar;
        this.b = fdatVar;
        this.c = dwmVar;
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ icr d() {
        return new hii(this.a, this.b, this.c);
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ void e(icr icrVar) {
        hii hiiVar = (hii) icrVar;
        hiiVar.a = this.a;
        hiiVar.b = this.b;
        hiiVar.c = this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraggableAnchorsElement)) {
            return false;
        }
        DraggableAnchorsElement draggableAnchorsElement = (DraggableAnchorsElement) obj;
        return fdbq.f(this.a, draggableAnchorsElement.a) && this.b == draggableAnchorsElement.b && this.c == draggableAnchorsElement.c;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }
}
