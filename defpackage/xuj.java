package defpackage;

import j$.time.Duration;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xuj implements xtr {
    public final fdjx a;
    public final fcsu b;
    private final fdjx c;
    private final fdpl d;
    private final fdpl e;
    private final fcsu f;
    private final fdpl g;

    public xuj(fdjx fdjxVar, fdjx fdjxVar2, fdpl fdplVar, fdpl fdplVar2, fcsu fcsuVar, fcsu fcsuVar2) {
        fdjxVar.getClass();
        fdjxVar2.getClass();
        fdplVar.getClass();
        fdplVar2.getClass();
        fcsuVar.getClass();
        this.a = fdjxVar;
        this.c = fdjxVar2;
        this.d = fdplVar;
        this.e = fdplVar2;
        this.b = fcsuVar;
        this.f = fcsuVar2;
        this.g = avac.i(fdplVar, fdplVar2, fdjxVar2, new xui(this, null));
    }

    @Override // defpackage.xtr
    public final fdpl a() {
        return this.g;
    }

    public final String c(Instant instant) {
        if (instant == null) {
            return "None";
        }
        Duration durationBetween = Duration.between(((cogw) this.f.b()).f(), instant);
        if (durationBetween.isNegative() || durationBetween.isZero()) {
            return "None";
        }
        return durationBetween.getSeconds() + " seconds remaining";
    }

    @Override // defpackage.xtr
    public final void b() {
    }
}
