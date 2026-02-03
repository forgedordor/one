package androidx.compose.material3;

import defpackage.dew;
import defpackage.fdbq;
import defpackage.gwc;
import defpackage.hsf;
import defpackage.icr;
import defpackage.jdy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class TabIndicatorModifier extends jdy<gwc> {
    private final hsf a;
    private final int b;
    private final boolean c = false;
    private final dew d;

    public TabIndicatorModifier(hsf hsfVar, int i, dew dewVar) {
        this.a = hsfVar;
        this.b = i;
        this.d = dewVar;
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ icr d() {
        return new gwc(this.a, this.b, this.d);
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ void e(icr icrVar) {
        gwc gwcVar = (gwc) icrVar;
        gwcVar.a = this.a;
        gwcVar.b = this.b;
        gwcVar.c = this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabIndicatorModifier)) {
            return false;
        }
        TabIndicatorModifier tabIndicatorModifier = (TabIndicatorModifier) obj;
        if (!fdbq.f(this.a, tabIndicatorModifier.a) || this.b != tabIndicatorModifier.b) {
            return false;
        }
        boolean z = tabIndicatorModifier.c;
        return fdbq.f(this.d, tabIndicatorModifier.d);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b) * 31) + 1237) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "TabIndicatorModifier(tabPositionsState=" + this.a + ", selectedTabIndex=" + this.b + ", followContentSize=false, animationSpec=" + this.d + ')';
    }
}
