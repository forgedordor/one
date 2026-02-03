package androidx.compose.animation;

import defpackage.czf;
import defpackage.dao;
import defpackage.dap;
import defpackage.dar;
import defpackage.dhc;
import defpackage.dhk;
import defpackage.fdae;
import defpackage.fdbq;
import defpackage.icr;
import defpackage.jdy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class EnterExitTransitionElement extends jdy<dao> {
    private final dhk a;
    private final dhc b;
    private final dhc c;
    private final dhc d;
    private final dap f;
    private final dar g;
    private final fdae h;
    private final czf i;

    public EnterExitTransitionElement(dhk dhkVar, dhc dhcVar, dhc dhcVar2, dhc dhcVar3, dap dapVar, dar darVar, fdae fdaeVar, czf czfVar) {
        this.a = dhkVar;
        this.b = dhcVar;
        this.c = dhcVar2;
        this.d = dhcVar3;
        this.f = dapVar;
        this.g = darVar;
        this.h = fdaeVar;
        this.i = czfVar;
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ icr d() {
        return new dao(this.a, this.b, this.c, this.d, this.f, this.g, this.h, this.i);
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ void e(icr icrVar) {
        dao daoVar = (dao) icrVar;
        daoVar.a = this.a;
        daoVar.b = this.b;
        daoVar.c = this.c;
        daoVar.d = this.d;
        daoVar.e = this.f;
        daoVar.f = this.g;
        daoVar.g = this.h;
        daoVar.i = this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnterExitTransitionElement)) {
            return false;
        }
        EnterExitTransitionElement enterExitTransitionElement = (EnterExitTransitionElement) obj;
        return fdbq.f(this.a, enterExitTransitionElement.a) && fdbq.f(this.b, enterExitTransitionElement.b) && fdbq.f(this.c, enterExitTransitionElement.c) && fdbq.f(this.d, enterExitTransitionElement.d) && fdbq.f(this.f, enterExitTransitionElement.f) && fdbq.f(this.g, enterExitTransitionElement.g) && fdbq.f(this.h, enterExitTransitionElement.h) && fdbq.f(this.i, enterExitTransitionElement.i);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        dhc dhcVar = this.b;
        int iHashCode2 = (iHashCode + (dhcVar == null ? 0 : dhcVar.hashCode())) * 31;
        dhc dhcVar2 = this.c;
        int iHashCode3 = (iHashCode2 + (dhcVar2 == null ? 0 : dhcVar2.hashCode())) * 31;
        dhc dhcVar3 = this.d;
        return ((((((((iHashCode3 + (dhcVar3 != null ? dhcVar3.hashCode() : 0)) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode();
    }

    public final String toString() {
        return "EnterExitTransitionElement(transition=" + this.a + ", sizeAnimation=" + this.b + ", offsetAnimation=" + this.c + ", slideAnimation=" + this.d + ", enter=" + this.f + ", exit=" + this.g + ", isEnabled=" + this.h + ", graphicsLayerBlock=" + this.i + ')';
    }
}
