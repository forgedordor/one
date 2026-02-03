package defpackage;

import java.util.concurrent.Callable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cevm implements ceta {
    public final cmfo a;

    public cevm(fcsu fcsuVar) {
        cmgg cmggVarC = cmgh.c();
        cmggVarC.d(cmfn.GAIA_DITTO_TACHYON);
        cmggVarC.f(cesx.a);
        cmggVarC.c(new Supplier() { // from class: cevh
            @Override // java.util.function.Supplier
            public final Object get() {
                return new cesz();
            }
        });
        this.a = ((cmgk) fcsuVar.b()).a(cmggVarC.a());
    }

    @Override // defpackage.cesd
    public final eiju a() {
        return eijx.m(j(0L), h(""), i(new byte[0])).a(new Callable() { // from class: cevd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return null;
            }
        }, eoqg.a);
    }

    @Override // defpackage.cesd
    public final /* synthetic */ eiju b() {
        return cesy.a(this);
    }

    @Override // defpackage.cesd
    public final /* synthetic */ eiju c() {
        return cesy.b(this);
    }

    @Override // defpackage.cesd
    public final /* synthetic */ eiju d(long j) {
        return cesy.c(this, j);
    }

    @Override // defpackage.cesd
    public final /* synthetic */ eiju e(byte[] bArr) {
        return cesy.d(this, bArr);
    }

    @Override // defpackage.ceta
    public final eiju f() {
        return this.a.h().h(new ejvr() { // from class: ceuz
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return ((cesx) obj).d.I();
            }
        }, eoqg.a);
    }

    @Override // defpackage.ceta
    public final eiju g() {
        return this.a.h().h(new ejvr() { // from class: ceuw
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return Long.valueOf(((cesx) obj).e);
            }
        }, eoqg.a);
    }

    @Override // defpackage.ceta
    public final eiju h(final String str) {
        return this.a.j(new ejvr() { // from class: ceux
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cesw ceswVar = (cesw) ((cesx) obj).toBuilder();
                ceswVar.copyOnWrite();
                ((cesx) ceswVar.instance).c = str;
                return (cesx) ceswVar.build();
            }
        }).h(new ejvr() { // from class: ceuy
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return null;
            }
        }, eoqg.a);
    }

    @Override // defpackage.ceta
    public final eiju i(final byte[] bArr) {
        return this.a.j(new ejvr() { // from class: cevb
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cesw ceswVar = (cesw) ((cesx) obj).toBuilder();
                evqs evqsVarX = evqs.x(bArr);
                ceswVar.copyOnWrite();
                ((cesx) ceswVar.instance).d = evqsVarX;
                return (cesx) ceswVar.build();
            }
        }).h(new ejvr() { // from class: cevc
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return null;
            }
        }, eoqg.a);
    }

    @Override // defpackage.ceta
    public final eiju j(final Long l) {
        return this.a.j(new ejvr() { // from class: ceuu
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cesw ceswVar = (cesw) ((cesx) obj).toBuilder();
                long jLongValue = l.longValue();
                ceswVar.copyOnWrite();
                ((cesx) ceswVar.instance).e = jLongValue;
                return (cesx) ceswVar.build();
            }
        }).h(new ejvr() { // from class: ceuv
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return null;
            }
        }, eoqg.a);
    }

    @Override // defpackage.ceta
    public final eiju k(final cetq cetqVar) {
        return this.a.j(new ejvr() { // from class: ceve
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cesw ceswVar = (cesw) ((cesx) obj).toBuilder();
                ceswVar.copyOnWrite();
                cesx cesxVar = (cesx) ceswVar.instance;
                cetq cetqVar2 = cetqVar;
                cetqVar2.getClass();
                cesxVar.g = cetqVar2;
                cesxVar.b |= 2;
                return (cesx) ceswVar.build();
            }
        }).h(new ejvr() { // from class: cevf
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return null;
            }
        }, eoqg.a);
    }

    @Override // defpackage.ceta
    public final eiju l(final cetq cetqVar) {
        return this.a.j(new ejvr() { // from class: cevk
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cesw ceswVar = (cesw) ((cesx) obj).toBuilder();
                ceswVar.copyOnWrite();
                cesx cesxVar = (cesx) ceswVar.instance;
                cetq cetqVar2 = cetqVar;
                cetqVar2.getClass();
                cesxVar.f = cetqVar2;
                cesxVar.b |= 1;
                return (cesx) ceswVar.build();
            }
        }).h(new ejvr() { // from class: cevl
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return null;
            }
        }, eoqg.a);
    }

    public final eiju m() {
        return this.a.h().h(new ejvr() { // from class: cevg
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cesx cesxVar = (cesx) obj;
                return Long.valueOf(cesxVar != null ? cesxVar.h : 0L);
            }
        }, eoqg.a);
    }
}
