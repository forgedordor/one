package androidx.compose.foundation;

import defpackage.dmx;
import defpackage.ebk;
import defpackage.fdbq;
import defpackage.icr;
import defpackage.jdy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class HoverableElement extends jdy<dmx> {
    private final ebk a;

    public HoverableElement(ebk ebkVar) {
        this.a = ebkVar;
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ icr d() {
        return new dmx(this.a);
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ void e(icr icrVar) {
        dmx dmxVar = (dmx) icrVar;
        ebk ebkVar = dmxVar.a;
        ebk ebkVar2 = this.a;
        if (fdbq.f(ebkVar, ebkVar2)) {
            return;
        }
        dmxVar.f();
        dmxVar.a = ebkVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HoverableElement) && fdbq.f(((HoverableElement) obj).a, this.a);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
