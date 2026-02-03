package androidx.compose.foundation;

import defpackage.dld;
import defpackage.dll;
import defpackage.dnk;
import defpackage.ebk;
import defpackage.fdae;
import defpackage.fdbq;
import defpackage.icr;
import defpackage.jdy;
import defpackage.jrw;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ClickableElement extends jdy<dll> {
    private final dnk a;
    private final boolean b;
    private final boolean c;
    private final String d;
    private final jrw f;
    private final fdae g;
    private final ebk h;

    public ClickableElement(ebk ebkVar, dnk dnkVar, boolean z, boolean z2, String str, jrw jrwVar, fdae fdaeVar) {
        this.h = ebkVar;
        this.a = dnkVar;
        this.b = z;
        this.c = z2;
        this.d = str;
        this.f = jrwVar;
        this.g = fdaeVar;
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ icr d() {
        return new dll(this.h, this.a, this.b, this.c, this.d, this.f, this.g);
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ void e(icr icrVar) {
        ((dll) icrVar).z(this.h, this.a, this.b, this.c, this.d, this.f, this.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClickableElement clickableElement = (ClickableElement) obj;
        return fdbq.f(this.h, clickableElement.h) && fdbq.f(this.a, clickableElement.a) && this.b == clickableElement.b && this.c == clickableElement.c && fdbq.f(this.d, clickableElement.d) && fdbq.f(this.f, clickableElement.f) && this.g == clickableElement.g;
    }

    public final int hashCode() {
        ebk ebkVar = this.h;
        int iHashCode = ebkVar != null ? ebkVar.hashCode() : 0;
        dnk dnkVar = this.a;
        int iHashCode2 = dnkVar != null ? dnkVar.hashCode() : 0;
        int i = iHashCode * 31;
        boolean z = this.b;
        boolean z2 = this.c;
        String str = this.d;
        int iA = (((((((i + iHashCode2) * 31) + dld.a(z)) * 31) + dld.a(z2)) * 31) + (str != null ? str.hashCode() : 0)) * 31;
        jrw jrwVar = this.f;
        return ((iA + (jrwVar != null ? jrwVar.a : 0)) * 31) + this.g.hashCode();
    }
}
