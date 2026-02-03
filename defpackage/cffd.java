package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cffd implements cfrj {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/net/handler/RegisterGaiaRpcHandler");
    public final Optional b;
    public final eosc c;
    public final cfdl d;
    public final ains e;
    private final cfgs f;
    private final cdio g;
    private String h = "";
    private long i = 0;
    private final aprp j;
    private final cfrd k;
    private final bvll l;
    private final aqpb m;

    public cffd(cfgs cfgsVar, cdio cdioVar, eosc eoscVar, Optional optional, cfdl cfdlVar, aprp aprpVar, cfrd cfrdVar, ains ainsVar, bvll bvllVar, aqpb aqpbVar) {
        this.f = cfgsVar;
        this.b = optional;
        this.g = cdioVar;
        this.c = eoscVar;
        this.j = aprpVar;
        this.k = cfrdVar;
        this.d = cfdlVar;
        this.e = ainsVar;
        this.l = bvllVar;
        this.m = aqpbVar;
    }

    @Override // defpackage.cfrj
    public final long a() {
        return this.i;
    }

    @Override // defpackage.cfrj
    public final cfrh b() {
        return this.k;
    }

    @Override // defpackage.cfrj
    public final ListenableFuture c(ezpp ezppVar) {
        ListenableFuture listenableFutureB;
        String str = this.k.a;
        if (!this.g.a() && !str.equals("CMS")) {
            this.h = ezppVar.c;
            ezpo ezpoVar = (ezpo) ezpp.a.createBuilder(ezppVar);
            ezpoVar.copyOnWrite();
            ((ezpp) ezpoVar.instance).e = str;
            final ezpp ezppVar2 = (ezpp) ezpoVar.build();
            cfgr cfgrVarA = this.f.a();
            cfgrVarA.j();
            cfgrVarA.l = ceoy.a(str, ezppVar2.c);
            return eika.k(cfgrVarA.b(), new eooz() { // from class: cfex
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    return this.a.m((ezli) obj, ezppVar2);
                }
            }, eoqg.a);
        }
        this.h = ezppVar.c;
        ezpo ezpoVar2 = (ezpo) ezpp.a.createBuilder(ezppVar);
        ezpoVar2.copyOnWrite();
        ((ezpp) ezpoVar2.instance).e = str;
        final ezpp ezppVar3 = (ezpp) ezpoVar2.build();
        final cfgr cfgrVarA2 = this.f.a();
        cfgrVarA2.j();
        cfgrVarA2.l = ceoy.a(str, ezppVar3.c);
        if (str.equals("GDitto")) {
            listenableFutureB = this.m.a() ? this.l.b().i(new eooz() { // from class: cfey
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    cffd cffdVar = this.a;
                    Boolean bool = (Boolean) obj;
                    if (bool == null || !bool.booleanValue()) {
                        ekrw ekrwVarE = cffd.a.e();
                        ekrwVarE.X(eksq.a, "BugleGDitto");
                        ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/net/handler/RegisterGaiaRpcHandler", "getGDittoMetaData", 196, "RegisterGaiaRpcHandler.java")).q("Gaia Pairing Request sent despite canDeviceRegisterForGaiaPairing is disabled");
                        cffdVar.e.e("Bugle.Gaia.Pairing.Can.Device.Register.Failure.Count", 2);
                    }
                    final cfgr cfgrVar = cfgrVarA2;
                    return cffdVar.d.a().i(new eooz() { // from class: cffa
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj2) {
                            cfgr cfgrVar2 = cfgrVar;
                            cfgrVar2.n = (evqs) obj2;
                            return cfgrVar2.b();
                        }
                    }, cffdVar.c);
                }
            }, this.c) : this.d.a().i(new eooz() { // from class: cfez
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    cfgr cfgrVar = cfgrVarA2;
                    cfgrVar.n = (evqs) obj;
                    return cfgrVar.b();
                }
            }, this.c);
        } else if (!str.equals("CMS")) {
            listenableFutureB = cfgrVarA2.b();
        } else if (this.j.a()) {
            listenableFutureB = this.d.b().i(new eooz() { // from class: cffb
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    cfgr cfgrVar = cfgrVarA2;
                    cfgrVar.n = (evqs) obj;
                    return cfgrVar.b();
                }
            }, this.c);
        } else {
            cfgrVarA2.n = evqs.b;
            listenableFutureB = cfgrVarA2.b();
        }
        return eika.k(listenableFutureB, new eooz() { // from class: cffc
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return this.a.m((ezli) obj, ezppVar3);
            }
        }, this.c);
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [cert, java.lang.Object] */
    @Override // defpackage.cfrj
    public final /* bridge */ /* synthetic */ ListenableFuture d(cezv cezvVar, evuh evuhVar) {
        ezmr ezmrVar = (ezmr) evuhVar;
        ezpp ezppVar = ezmrVar.c;
        if (ezppVar == null) {
            ezppVar = ezpp.a;
        }
        this.h = ezppVar.c;
        Optional optional = this.b;
        optional.isPresent();
        return optional.get().c(ezmrVar);
    }

    @Override // defpackage.cfrj
    public final /* bridge */ /* synthetic */ ListenableFuture e(evuh evuhVar) {
        long j;
        ezmt ezmtVar = (ezmt) evuhVar;
        if (ezmtVar != null) {
            ezpr ezprVar = ezmtVar.c;
            if (ezprVar == null) {
                ezprVar = ezpr.a;
            }
            j = ezprVar.b;
        } else {
            j = 0;
        }
        this.i = j;
        return eijx.e(ezmtVar);
    }

    @Override // defpackage.cfrj
    public final String f() {
        return "RegisterGaiaRpcHandler";
    }

    @Override // defpackage.cfrj
    public final String g() {
        return this.h;
    }

    @Override // defpackage.cfrj
    public final /* synthetic */ void h(Throwable th) {
        cfri.c(this);
    }

    @Override // defpackage.cfrj
    public final /* synthetic */ void i() {
        cfri.a(this);
    }

    @Override // defpackage.cfrj
    public final /* synthetic */ void j() {
        cfri.b(this);
    }

    public final eiju m(ezli ezliVar, ezpp ezppVar) {
        if ((((ezlj) ezliVar.instance).b & 1) == 0) {
            return eijx.d(new cefl());
        }
        ezmq ezmqVar = (ezmq) ezmr.a.createBuilder();
        ezmqVar.copyOnWrite();
        ezmr ezmrVar = (ezmr) ezmqVar.instance;
        ezppVar.getClass();
        ezmrVar.c = ezppVar;
        ezmrVar.b |= 1;
        cfrd cfrdVar = this.k;
        ezmqVar.copyOnWrite();
        ((ezmr) ezmqVar.instance).f = cfrdVar.a;
        ezmqVar.copyOnWrite();
        ((ezmr) ezmqVar.instance).e = felt.a(2);
        ezmqVar.copyOnWrite();
        ezmr ezmrVar2 = (ezmr) ezmqVar.instance;
        ezlj ezljVar = (ezlj) ezliVar.build();
        ezljVar.getClass();
        ezmrVar2.d = ezljVar;
        ezmrVar2.b |= 2;
        return eijx.e((ezmr) ezmqVar.build());
    }

    @Override // defpackage.cfxa
    public final void k() {
    }

    @Override // defpackage.cfxa
    public final /* synthetic */ void l() {
    }
}
