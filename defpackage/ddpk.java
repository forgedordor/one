package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ddpk implements dcia {
    final /* synthetic */ ddpl a;

    public ddpk(ddpl ddplVar) {
        this.a = ddplVar;
    }

    @Override // defpackage.dcia
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        dchz dchzVar;
        ddpe ddpeVar = this.a.a;
        synchronized (ddpeVar) {
            ((ddor) ddpeVar).b = false;
            dchzVar = ((ddor) ddpeVar).a.b;
        }
        if (dchzVar != null) {
            ((ddor) ddpeVar).c.l(dchzVar, 2441);
        }
    }

    @Override // defpackage.dcia
    public final void b() {
    }
}
