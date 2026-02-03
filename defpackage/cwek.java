package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwek implements cwec {
    public final fdjx a;
    public final fcsu b;
    public final fcsu c;
    public final fdpl d;
    public final cwdc e;
    private final Optional f;

    /* JADX WARN: Type inference failed for: r1v1, types: [cwfe, java.lang.Object] */
    public cwek(fdjx fdjxVar, fcsu fcsuVar, fcsu fcsuVar2, cwdc cwdcVar, Optional optional) {
        fdjxVar.getClass();
        cwdcVar.getClass();
        this.a = fdjxVar;
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.e = cwdcVar;
        this.f = optional;
        optional.isPresent();
        this.d = optional.get().a();
    }

    @Override // defpackage.cwec
    public final fdvc a(cwdf cwdfVar) {
        return fdtg.b(fdsn.a(new cwef(this.e.c), new cwej(this, cwdfVar, null)), this.a, fdur.a(0L, 3), null);
    }
}
