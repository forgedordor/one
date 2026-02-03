package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.concurrent.Callable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfdp implements cffr {
    public final Optional a;
    public final cfrd b;
    private final cogw c;
    private final eosc d;
    private final cfgs e;
    private final cfdl f;
    private final aprp g;
    private final long h;
    private final Supplier i;
    private final ceta j;
    private String k = "";
    private long l = 0;

    public cfdp(cogw cogwVar, eosc eoscVar, cfgs cfgsVar, cfdl cfdlVar, aprp aprpVar, Supplier supplier, Optional optional, long j, cfrd cfrdVar, ceta cetaVar) {
        this.c = cogwVar;
        this.d = eoscVar;
        this.e = cfgsVar;
        this.f = cfdlVar;
        this.g = aprpVar;
        this.a = optional;
        this.h = j;
        this.i = supplier;
        this.b = cfrdVar;
        this.j = cetaVar;
    }

    @Override // defpackage.cfrj
    public final long a() {
        return this.l;
    }

    @Override // defpackage.cfrj
    public final cfrh b() {
        return this.b;
    }

    @Override // defpackage.cfrj
    public final ListenableFuture c(final ezpp ezppVar) {
        this.k = ezppVar.c;
        final cfgr cfgrVarA = this.e.a();
        cfgrVarA.j();
        cfgrVarA.l = ceoy.b(ezppVar.c);
        cfgrVarA.k(this.h);
        cfgrVarA.l();
        ListenableFuture listenableFutureB = cfgrVarA.b();
        if (this.b.a.equals("CMS")) {
            if (this.g.a()) {
                listenableFutureB = this.f.b().i(new eooz() { // from class: cfdm
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        cfgr cfgrVar = cfgrVarA;
                        cfgrVar.n = (evqs) obj;
                        return cfgrVar.b();
                    }
                }, this.d);
            } else {
                cfgrVarA.n = evqs.b;
                listenableFutureB = cfgrVarA.b();
            }
        }
        final ListenableFuture listenableFuture = listenableFutureB;
        final ListenableFuture listenableFuture2 = (ListenableFuture) this.i.get();
        return eika.d(listenableFuture, listenableFuture2).a(new Callable() { // from class: cfdn
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ezli ezliVar = (ezli) eork.q(listenableFuture);
                byte[] bArr = (byte[]) eork.q(listenableFuture2);
                ezpp ezppVar2 = ezppVar;
                long jA = cfgrVarA.a();
                ezpo ezpoVar = (ezpo) ezppVar2.toBuilder();
                ezpoVar.copyOnWrite();
                ((ezpp) ezpoVar.instance).e = this.a.b.a;
                evqs evqsVarX = evqs.x(bArr);
                ezpoVar.copyOnWrite();
                ((ezpp) ezpoVar.instance).f = evqsVarX;
                ezpp ezppVar3 = (ezpp) ezpoVar.build();
                ezlk ezlkVar = (ezlk) ezll.a.createBuilder();
                ezlkVar.copyOnWrite();
                ezll ezllVar = (ezll) ezlkVar.instance;
                ezppVar3.getClass();
                ezllVar.c = ezppVar3;
                ezllVar.b |= 1;
                ezlkVar.copyOnWrite();
                ((ezll) ezlkVar.instance).e = jA;
                ezlkVar.copyOnWrite();
                ezll ezllVar2 = (ezll) ezlkVar.instance;
                ezlj ezljVar = (ezlj) ezliVar.build();
                ezljVar.getClass();
                ezllVar2.h = ezljVar;
                ezllVar2.b |= 4;
                ezlkVar.copyOnWrite();
                ((ezll) ezlkVar.instance).f = 2;
                return (ezll) ezlkVar.build();
            }
        }, this.d);
    }

    @Override // defpackage.cfrj
    public final /* bridge */ /* synthetic */ ListenableFuture d(cezv cezvVar, evuh evuhVar) {
        final ezll ezllVar = (ezll) evuhVar;
        this.a.isPresent();
        cetp cetpVar = (cetp) cetq.a.createBuilder();
        ezpp ezppVar = ezllVar.c;
        if (ezppVar == null) {
            ezppVar = ezpp.a;
        }
        ceta cetaVar = this.j;
        String str = ezppVar.c;
        cetpVar.copyOnWrite();
        cetq cetqVar = (cetq) cetpVar.instance;
        str.getClass();
        cetqVar.b = str;
        long epochMilli = this.c.f().toEpochMilli();
        cetpVar.copyOnWrite();
        ((cetq) cetpVar.instance).c = epochMilli;
        return cetaVar.k((cetq) cetpVar.build()).i(new eooz() { // from class: cfdo
            /* JADX WARN: Type inference failed for: r2v4, types: [cert, java.lang.Object] */
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return this.a.a.get().b(ezllVar);
            }
        }, this.d);
    }

    @Override // defpackage.cfrj
    public final /* bridge */ /* synthetic */ ListenableFuture e(evuh evuhVar) {
        long j;
        ezln ezlnVar = (ezln) evuhVar;
        if (ezlnVar != null) {
            ezpr ezprVar = ezlnVar.c;
            if (ezprVar == null) {
                ezprVar = ezpr.a;
            }
            j = ezprVar.b;
        } else {
            j = 0;
        }
        this.l = j;
        return eork.i(ezlnVar);
    }

    @Override // defpackage.cfrj
    public final String f() {
        return "GaiaRegisterRefreshRpcHandler";
    }

    @Override // defpackage.cfrj
    public final String g() {
        return this.k;
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

    @Override // defpackage.cfxa
    public final void k() {
    }

    @Override // defpackage.cfxa
    public final /* synthetic */ void l() {
    }
}
