package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xsb implements akcy {
    final /* synthetic */ xsi a;
    final /* synthetic */ xsc b;

    public xsb(xsi xsiVar, xsc xscVar) {
        this.a = xsiVar;
        this.b = xscVar;
    }

    @Override // defpackage.akcy
    public final Instant a() {
        Instant instantF = this.b.d.f();
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
