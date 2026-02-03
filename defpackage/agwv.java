package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agwv implements afju {
    public final Optional a;
    public final agtg b;
    public final fcsu c;
    public final egyt d;
    private final fdjx e;
    private efwo f;

    public agwv(fdjx fdjxVar, Optional optional, agtg agtgVar, fcsu fcsuVar, egyt egytVar) {
        fdjxVar.getClass();
        optional.getClass();
        agtgVar.getClass();
        fcsuVar.getClass();
        egytVar.getClass();
        this.e = fdjxVar;
        this.a = optional;
        this.b = agtgVar;
        this.c = fcsuVar;
        this.d = egytVar;
    }

    @Override // defpackage.afju
    public final void a(efwo efwoVar) {
        if (!((Boolean) ((cczi) crbf.ak.get()).e()).booleanValue() || this.a.isEmpty() || fdbq.f(efwoVar, this.f)) {
            return;
        }
        this.f = efwoVar;
        auvw.k(this.e, null, null, new agwu(this, efwoVar, null), 3);
    }
}
