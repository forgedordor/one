package defpackage;

import java.util.concurrent.Callable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cest implements ceta {
    static final cczv a = cdag.q(147611892, "tachyon_data_migration");
    public static final /* synthetic */ int b = 0;
    private final cmfo c;
    private final ceto d;

    public cest(cmgk cmgkVar, ceto cetoVar, ains ainsVar) {
        cmgg cmggVarC = cmgh.c();
        cmggVarC.d(cmfn.TACHYON_GAIA);
        cmggVarC.f(cete.a);
        cmggVarC.e(new cess(cetoVar, ainsVar));
        cmggVarC.c(new Supplier() { // from class: cesn
            @Override // java.util.function.Supplier
            public final Object get() {
                return new cesz();
            }
        });
        this.c = cmgkVar.a(cmggVarC.a());
        this.d = cetoVar;
    }

    @Override // defpackage.cesd
    public final eiju a() {
        return eijx.m(j(0L), h(""), i(new byte[0])).a(new Callable() { // from class: cesm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i = cest.b;
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
        return !((Boolean) a.e()).booleanValue() ? eiju.g(this.d.a.a()).h(new ejvr() { // from class: cetm
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return ((cete) obj).d.I();
            }
        }, eoqg.a) : this.c.h().h(new ejvr() { // from class: cesp
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                int i = cest.b;
                return ((cete) obj).d.I();
            }
        }, eoqg.a);
    }

    @Override // defpackage.ceta
    public final eiju g() {
        return !((Boolean) a.e()).booleanValue() ? eiju.g(this.d.a.a()).h(new ejvr() { // from class: ceti
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return Long.valueOf(((cete) obj).e);
            }
        }, eoqg.a) : this.c.h().h(new ejvr() { // from class: ceso
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return Long.valueOf(((cete) obj).e);
            }
        }, eoqg.a);
    }

    @Override // defpackage.ceta
    public final eiju h(final String str) {
        ejvr ejvrVarA = eiid.a(new ejvr() { // from class: cetl
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cetd cetdVar = (cetd) ((cete) obj).toBuilder();
                cetdVar.copyOnWrite();
                ((cete) cetdVar.instance).c = str;
                return (cete) cetdVar.build();
            }
        });
        ecjh ecjhVar = this.d.a;
        eoqg eoqgVar = eoqg.a;
        return eijx.m(eiju.g(ecjhVar.b(ejvrVarA, eoqgVar)), this.c.j(new ejvr() { // from class: cese
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                int i = cest.b;
                cetd cetdVar = (cetd) ((cete) obj).toBuilder();
                cetdVar.copyOnWrite();
                ((cete) cetdVar.instance).c = str;
                return (cete) cetdVar.build();
            }
        })).a(new Callable() { // from class: cesl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i = cest.b;
                return null;
            }
        }, eoqgVar);
    }

    @Override // defpackage.ceta
    public final eiju i(final byte[] bArr) {
        ejvr ejvrVarA = eiid.a(new ejvr() { // from class: ceth
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cetd cetdVar = (cetd) ((cete) obj).toBuilder();
                evqs evqsVarX = evqs.x(bArr);
                cetdVar.copyOnWrite();
                ((cete) cetdVar.instance).d = evqsVarX;
                return (cete) cetdVar.build();
            }
        });
        ecjh ecjhVar = this.d.a;
        eoqg eoqgVar = eoqg.a;
        return eijx.m(eiju.g(ecjhVar.b(ejvrVarA, eoqgVar)), this.c.j(new ejvr() { // from class: cesj
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                int i = cest.b;
                cetd cetdVar = (cetd) ((cete) obj).toBuilder();
                evqs evqsVarX = evqs.x(bArr);
                cetdVar.copyOnWrite();
                ((cete) cetdVar.instance).d = evqsVarX;
                return (cete) cetdVar.build();
            }
        })).a(new Callable() { // from class: cesk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i = cest.b;
                return null;
            }
        }, eoqgVar);
    }

    @Override // defpackage.ceta
    public final eiju j(final Long l) {
        ejvr ejvrVarA = eiid.a(new ejvr() { // from class: cetj
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cetd cetdVar = (cetd) ((cete) obj).toBuilder();
                long jLongValue = l.longValue();
                cetdVar.copyOnWrite();
                ((cete) cetdVar.instance).e = jLongValue;
                return (cete) cetdVar.build();
            }
        });
        ecjh ecjhVar = this.d.a;
        eoqg eoqgVar = eoqg.a;
        return eijx.m(eiju.g(ecjhVar.b(ejvrVarA, eoqgVar)), this.c.j(new ejvr() { // from class: cesf
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                int i = cest.b;
                cetd cetdVar = (cetd) ((cete) obj).toBuilder();
                long jLongValue = l.longValue();
                cetdVar.copyOnWrite();
                ((cete) cetdVar.instance).e = jLongValue;
                return (cete) cetdVar.build();
            }
        })).a(new Callable() { // from class: cesg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i = cest.b;
                return null;
            }
        }, eoqgVar);
    }

    @Override // defpackage.ceta
    public final eiju k(final cetq cetqVar) {
        ejvr ejvrVarA = eiid.a(new ejvr() { // from class: cetg
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cetd cetdVar = (cetd) ((cete) obj).toBuilder();
                cetdVar.copyOnWrite();
                cete ceteVar = (cete) cetdVar.instance;
                cetq cetqVar2 = cetqVar;
                cetqVar2.getClass();
                ceteVar.h = cetqVar2;
                ceteVar.b |= 2;
                return (cete) cetdVar.build();
            }
        });
        ecjh ecjhVar = this.d.a;
        eoqg eoqgVar = eoqg.a;
        return eijx.m(eiju.g(ecjhVar.b(ejvrVarA, eoqgVar)), this.c.j(new ejvr() { // from class: cesh
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                int i = cest.b;
                cetd cetdVar = (cetd) ((cete) obj).toBuilder();
                cetdVar.copyOnWrite();
                cete ceteVar = (cete) cetdVar.instance;
                cetq cetqVar2 = cetqVar;
                cetqVar2.getClass();
                ceteVar.h = cetqVar2;
                ceteVar.b |= 2;
                return (cete) cetdVar.build();
            }
        })).a(new Callable() { // from class: cesi
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i = cest.b;
                return null;
            }
        }, eoqgVar);
    }

    @Override // defpackage.ceta
    public final eiju l(final cetq cetqVar) {
        ejvr ejvrVarA = eiid.a(new ejvr() { // from class: cetf
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cetd cetdVar = (cetd) ((cete) obj).toBuilder();
                cetdVar.copyOnWrite();
                cete ceteVar = (cete) cetdVar.instance;
                cetq cetqVar2 = cetqVar;
                cetqVar2.getClass();
                ceteVar.g = cetqVar2;
                ceteVar.b |= 1;
                return (cete) cetdVar.build();
            }
        });
        ecjh ecjhVar = this.d.a;
        eoqg eoqgVar = eoqg.a;
        return eijx.m(eiju.g(ecjhVar.b(ejvrVarA, eoqgVar)), this.c.j(new ejvr() { // from class: cesq
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                int i = cest.b;
                cetd cetdVar = (cetd) ((cete) obj).toBuilder();
                cetdVar.copyOnWrite();
                cete ceteVar = (cete) cetdVar.instance;
                cetq cetqVar2 = cetqVar;
                cetqVar2.getClass();
                ceteVar.g = cetqVar2;
                ceteVar.b |= 1;
                return (cete) cetdVar.build();
            }
        })).a(new Callable() { // from class: cesr
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i = cest.b;
                return null;
            }
        }, eoqgVar);
    }
}
