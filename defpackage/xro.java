package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xro implements akcy {
    final /* synthetic */ xsi a;
    final /* synthetic */ xrp b;

    public xro(xsi xsiVar, xrp xrpVar) {
        this.a = xsiVar;
        this.b = xrpVar;
    }

    @Override // defpackage.akcy
    public final Instant a() {
        Instant instantF = this.b.e.f();
        instantF.getClass();
        return instantF;
    }

    @Override // defpackage.akcy
    public final Integer b() {
        xsi xsiVar = this.a;
        if (xsiVar != null) {
            return Integer.valueOf(xsiVar.a);
        }
        return null;
    }
}
