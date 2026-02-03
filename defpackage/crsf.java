package defpackage;

import j$.util.Optional;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class crsf implements crse {
    private final fcsu a;
    private final fcsu b;
    private final fcsu c;

    public crsf(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.c = fcsuVar3;
    }

    @Override // defpackage.crse
    public final int a() {
        Optional optionalE = e();
        if (dfpq.n()) {
            return 1;
        }
        if (dfpq.d() && !optionalE.isEmpty()) {
            return ((dgiq) optionalE.get()).o().mDefaultSharingMethod;
        }
        return -1;
    }

    @Override // defpackage.crse
    public final int b() {
        return cqej.c(e());
    }

    @Override // defpackage.crse
    public final int c() {
        return cqej.d(e());
    }

    @Override // defpackage.crse
    public final int d() {
        return cqej.e(e());
    }

    @Override // defpackage.crse
    public final Optional e() {
        return ((dggz) this.a.b()).l();
    }

    @Override // defpackage.crse
    public final String f() {
        Optional optionalE = e();
        return optionalE.isEmpty() ? "" : ((cqej) this.c.b()).b((dgiq) optionalE.get());
    }

    @Override // defpackage.crse
    public final String g() {
        return (String) ((dgtg) this.b.b()).c().orElse("");
    }
}
