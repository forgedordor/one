package defpackage;

import android.app.Service;
import android.content.Context;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahij extends ahgs {
    public final Service a;
    public final ahkn b;
    public final eyik c;
    public final eyik d;
    final eyik e;
    final eyik f;
    final eyik g;
    public final eyik h;
    final eyik i;
    final eyik j;
    public final eyik k;
    final eyik l;
    final eyik m;
    final eyik n;
    final eyik o;
    public final eyik p;
    public final eyik q;
    public final eyik r;
    public final eyik s;
    public final eyik t;
    final eyik u;
    public final eyik v;
    public final eyik w;
    private final ahij x = this;

    public ahij(ahkn ahknVar, Service service) {
        this.b = ahknVar;
        this.a = service;
        this.c = new ahii(ahknVar, this, 0);
        this.d = new ahii(ahknVar, this, 1);
        this.e = new ahii(ahknVar, this, 3);
        this.f = new ahii(ahknVar, this, 4);
        this.g = new ahii(ahknVar, this, 5);
        this.h = new ahii(ahknVar, this, 2);
        this.i = new ahii(ahknVar, this, 8);
        this.j = new ahii(ahknVar, this, 7);
        this.k = new ahii(ahknVar, this, 6);
        this.l = new ahii(ahknVar, this, 11);
        this.m = new ahii(ahknVar, this, 12);
        this.n = new ahii(ahknVar, this, 13);
        this.o = new ahii(ahknVar, this, 10);
        this.p = new ahii(ahknVar, this, 9);
        this.q = new ahii(ahknVar, this, 14);
        this.r = new ahii(ahknVar, this, 15);
        this.s = new ahii(ahknVar, this, 16);
        this.t = new ahii(ahknVar, this, 17);
        this.u = new ahii(ahknVar, this, 19);
        this.v = new ahii(ahknVar, this, 18);
        this.w = new ahii(ahknVar, this, 20);
    }

    public static final ehvd d() {
        return new ehvd(eyie.a(eyim.a));
    }

    public final esty a() {
        ahkn ahknVar = this.b;
        return new esty(this.a, (ScheduledExecutorService) ahknVar.p.b(), (fbpc) ahknVar.a.Mj.b(), ejwi.j((List) ahknVar.b.ps.b()));
    }

    @Override // defpackage.eigu
    public final Set aH() {
        return ekon.a;
    }

    @Override // defpackage.eigu
    public final eigp b() {
        return (eigp) this.b.aI.b();
    }

    public final esub c() {
        ekon ekonVar = ekon.a;
        ahkn ahknVar = this.b;
        return new esub(ahknVar.a.Mi, (Context) ahknVar.t.b());
    }
}
