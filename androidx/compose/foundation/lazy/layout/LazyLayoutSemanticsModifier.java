package androidx.compose.foundation.lazy.layout;

import defpackage.dwm;
import defpackage.ept;
import defpackage.epv;
import defpackage.eqc;
import defpackage.fdae;
import defpackage.fdbq;
import defpackage.icr;
import defpackage.jdy;
import defpackage.jfz;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class LazyLayoutSemanticsModifier extends jdy<eqc> {
    private final fdae a;
    private final ept b;
    private final dwm c;
    private final boolean d;
    private final boolean f;

    public LazyLayoutSemanticsModifier(fdae fdaeVar, ept eptVar, dwm dwmVar, boolean z, boolean z2) {
        this.a = fdaeVar;
        this.b = eptVar;
        this.c = dwmVar;
        this.d = z;
        this.f = z2;
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ icr d() {
        return new eqc(this.a, this.b, this.c, this.d, this.f);
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ void e(icr icrVar) {
        eqc eqcVar = (eqc) icrVar;
        eqcVar.a = this.a;
        eqcVar.b = this.b;
        dwm dwmVar = eqcVar.c;
        dwm dwmVar2 = this.c;
        if (dwmVar != dwmVar2) {
            eqcVar.c = dwmVar2;
            jfz.a(eqcVar);
        }
        boolean z = this.f;
        boolean z2 = this.d;
        if (eqcVar.d == z2 && eqcVar.e == z) {
            return;
        }
        eqcVar.d = z2;
        eqcVar.e = z;
        eqcVar.a();
        jfz.a(eqcVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutSemanticsModifier)) {
            return false;
        }
        LazyLayoutSemanticsModifier lazyLayoutSemanticsModifier = (LazyLayoutSemanticsModifier) obj;
        return this.a == lazyLayoutSemanticsModifier.a && fdbq.f(this.b, lazyLayoutSemanticsModifier.b) && this.c == lazyLayoutSemanticsModifier.c && this.d == lazyLayoutSemanticsModifier.d && this.f == lazyLayoutSemanticsModifier.f;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + epv.a(this.d)) * 31) + epv.a(this.f);
    }
}
