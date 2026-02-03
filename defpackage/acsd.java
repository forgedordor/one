package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acsd {
    final cqce a = cqce.g("Bugle", "HomeScreenMenuHandler");
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    private final crnp e;
    private final fcsu f;

    public acsd(fcsu fcsuVar, crnp crnpVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4) {
        this.b = fcsuVar;
        this.e = crnpVar;
        this.c = fcsuVar2;
        this.f = fcsuVar3;
        this.d = fcsuVar4;
    }

    public final void a(efwo efwoVar) {
        if (!this.e.d()) {
            this.a.r("Can't mark as read if it't not default default sms app");
        }
        acsc acscVar = new acsc(this);
        aypj aypjVar = (aypj) this.f.b();
        efwoVar.a();
        aypjVar.k().G(acscVar);
    }
}
