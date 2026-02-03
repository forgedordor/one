package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityIdImpl;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aojk implements aoer {
    public final fcsu a;
    public final amnc b;
    public final ammy c;
    private final fdjx d;
    private final cpbn e;
    private final alrj f;
    private final SelfIdentityId g;
    private final String h = "Satellite";
    private final String i = "Satellite";
    private final String j = "Satellite";
    private final String k = "Satellite";
    private final Uri l = Uri.EMPTY;
    private final anpj m = new aoji();
    private final anpj n = new aojg();
    private final aoip o;
    private final eiju p;
    private final aoft q;
    private final anpk r;

    public aojk(fdjx fdjxVar, cpbn cpbnVar, alrj alrjVar, fcsu fcsuVar, ammy ammyVar, amnc amncVar, SelfIdentityId selfIdentityId) {
        this.d = fdjxVar;
        this.e = cpbnVar;
        this.f = alrjVar;
        this.a = fcsuVar;
        this.c = ammyVar;
        this.b = amncVar;
        this.g = selfIdentityId;
        aojj aojjVar = new aojj();
        this.o = aojjVar;
        eiju eijuVarE = eijx.e(aojjVar);
        eijuVarE.getClass();
        this.p = eijuVarE;
        this.q = new aoje();
        this.r = new anpk(aoff.e);
    }

    @Override // defpackage.aoer
    public final eiju A(int i, Optional optional) {
        if (i == 0) {
            throw null;
        }
        optional.getClass();
        eiju eijuVarE = eijx.e(Optional.empty());
        eijuVarE.getClass();
        return eijuVarE;
    }

    @Override // defpackage.aoer
    public final int a() {
        return 0;
    }

    @Override // defpackage.aoer
    public final int b() {
        return -1;
    }

    @Override // defpackage.aoer
    public final Uri c() {
        Uri uriE = this.e.e(null, this.i, this.f.f(), null);
        uriE.getClass();
        return uriE;
    }

    @Override // defpackage.aoer
    public final Uri d() {
        return this.l;
    }

    @Override // defpackage.aoer
    public final /* synthetic */ anpj e() {
        return this.r;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aojk) {
            return fdbq.f(this.g, ((aojk) obj).g);
        }
        return false;
    }

    @Override // defpackage.aoer
    public final anpj f() {
        return this.m;
    }

    @Override // defpackage.aoer
    public final anpj g() {
        return this.n;
    }

    @Override // defpackage.aoer
    public final SelfIdentityId h() {
        return this.g;
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    @Override // defpackage.aoer
    public final aoft i() {
        return this.q;
    }

    @Override // defpackage.aoer
    public final aoip j() {
        return this.o;
    }

    @Override // defpackage.aoer
    public final /* bridge */ /* synthetic */ awxn k() {
        throw new UnsupportedOperationException("SatelliteSelfIdentity does not support MyIdentity.");
    }

    @Override // defpackage.aoer
    public final eiju l() {
        return this.p;
    }

    @Override // defpackage.aoer
    public final eiju m(boolean z, boolean z2) {
        return auvw.c(this.d, fcyi.a, fdjz.a, new aojf(this, null));
    }

    @Override // defpackage.aoer
    public final eiju n(ajna ajnaVar) {
        ajnaVar.getClass();
        if (ajnaVar == ajna.SATELLITE) {
            return auvw.c(this.d, fcyi.a, fdjz.a, new aojh(this, null));
        }
        eiju eijuVarE = eijx.e(false);
        eijuVarE.getClass();
        return eijuVarE;
    }

    @Override // defpackage.aoer
    public final Optional o() {
        return Optional.of(this.f.f());
    }

    @Override // defpackage.aoer
    public final String p() {
        return this.j;
    }

    @Override // defpackage.aoer
    public final String q() {
        return this.h;
    }

    @Override // defpackage.aoer
    public final String r() {
        return this.i;
    }

    @Override // defpackage.aoer
    public final String s() {
        return this.k;
    }

    @Override // defpackage.aoer
    public final /* bridge */ /* synthetic */ String t() {
        return null;
    }

    @Override // defpackage.aoer
    public final boolean u() {
        return false;
    }

    @Override // defpackage.aoer
    public final boolean v() {
        return false;
    }

    @Override // defpackage.aoer
    public final boolean w() {
        return true;
    }

    @Override // defpackage.aoer
    public final boolean x() {
        return false;
    }

    @Override // defpackage.aoer
    public final boolean y() {
        return false;
    }

    @Override // defpackage.aoer
    public final boolean z(aoer aoerVar) {
        return fdbq.f(((SelfIdentityIdImpl) this.g).a, aoerVar.h().b());
    }
}
