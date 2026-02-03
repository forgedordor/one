package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ammt implements amln {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/api/messaging/message/compose/constraints/emergency/EmergencyComposeConstraintsSupplier");
    public final fdjx b;
    public final anpj c;
    public final anpj d;
    public final anpj e;
    public final anpj f;
    public final anpj g;
    public cquc h;
    public final cqtq i;
    private final fdjx j;
    private final fcsu k;

    public ammt(fdjx fdjxVar, fdjx fdjxVar2, fcsu fcsuVar, cqtp cqtpVar, anpj anpjVar, anpj anpjVar2, anpj anpjVar3, anpj anpjVar4, anpj anpjVar5) {
        this.b = fdjxVar;
        this.j = fdjxVar2;
        this.k = fcsuVar;
        this.c = anpjVar;
        this.d = anpjVar2;
        this.e = anpjVar3;
        this.f = anpjVar4;
        this.g = anpjVar5;
        this.i = cqtpVar.a(new ammq(this));
    }

    @Override // defpackage.anpj
    public final cquc a(final anpi anpiVar) {
        return this.i.a(new cqtk() { // from class: ammn
            @Override // defpackage.cqtk
            public final eiju a(Object obj) {
                return anpiVar.a();
            }
        }, "EmergencyComposeConstraintsSupplier:register", "EmergencyComposeConstraintsSupplier:callback", "EmergencyComposeConstraintsSupplier:unregister");
    }

    @Override // defpackage.anpj
    public final eiju b() {
        return auvw.c(this.j, fcyi.a, fdjz.a, new ammo(this, null));
    }

    @Override // defpackage.anpj
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.amln
    public final eiju d() {
        return e().d();
    }

    public final amln e() {
        anpj anpjVar = this.c;
        if (!(anpjVar instanceof anpg)) {
            return (amln) anpjVar;
        }
        anpj anpjVar2 = ((anpg) anpjVar).e;
        anpjVar2.getClass();
        return (amln) anpjVar2;
    }

    public final boolean f(amqj amqjVar) {
        if (amqjVar != null) {
            return ((cogw) this.k.b()).f().isBefore(amqjVar.e);
        }
        return false;
    }
}
