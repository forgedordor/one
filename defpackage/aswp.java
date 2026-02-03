package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import java.util.Map;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aswp implements asxy {
    public static final eksp a = eksp.c("BugleRcsCapabilities");
    private final ekgp b;
    private final fcsu c;
    private final eosd d;
    private final asse e;

    public aswp(fcsu fcsuVar, Map map, asse asseVar, eosd eosdVar) {
        this.b = ekgp.j(map);
        this.c = fcsuVar;
        this.e = asseVar;
        this.d = eosdVar;
    }

    private final elfq e() {
        asse asseVar = this.e;
        Object objB = asseVar.c.b();
        objB.getClass();
        Duration durationOfMillis = Duration.ofMillis(((Number) objB).longValue());
        durationOfMillis.getClass();
        return elfq.c(durationOfMillis, 2.0d, (int) ((Number) asseVar.d.b()).longValue());
    }

    @Override // defpackage.asxy
    public final eiju a(final Iterable iterable) {
        Logger logger = elgb.a;
        elfy elfyVar = new elfy();
        eosd eosdVar = this.d;
        elfyVar.b(eosdVar);
        elfyVar.b = new aswo();
        return eiju.g(elfyVar.a(eiid.b(new ejxr() { // from class: aswj
            @Override // defpackage.ejxr
            public final Object get() {
                return this.a.d().a(iterable);
            }
        }), e(), new aswk())).f(elfj.class, new eooz() { // from class: aswl
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                eksp ekspVar = aswp.a;
                return eijx.d(new assm("RetryingFuture failed to fetch RCS capabilities for batch.", ((elfj) obj).getCause()));
            }
        }, eosdVar);
    }

    @Override // defpackage.asxy
    public final eiju b(final aubq aubqVar) {
        Logger logger = elgb.a;
        elfy elfyVar = new elfy();
        eosd eosdVar = this.d;
        elfyVar.b(eosdVar);
        elfyVar.b = new aswo();
        return eiju.g(elfyVar.a(eiid.b(new ejxr() { // from class: aswm
            @Override // defpackage.ejxr
            public final Object get() {
                return this.a.d().b(aubqVar);
            }
        }), e(), new aswk())).f(elfj.class, new eooz() { // from class: aswn
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                eksp ekspVar = aswp.a;
                return eijx.d(new assm("RetryingFuture failed to fetch RCS capabilities.", ((elfj) obj).getCause()));
            }
        }, eosdVar);
    }

    @Override // defpackage.asxy
    public final /* synthetic */ Object c(Iterable iterable, fcxy fcxyVar) {
        return asxw.a(this, iterable, fcxyVar);
    }

    public final asxy d() {
        enmr enmrVarD = ((cozg) this.c.b()).d();
        fcsu fcsuVar = (fcsu) this.b.get(enmrVarD);
        enmrVarD.name();
        fcsuVar.getClass();
        return (asxy) fcsuVar.b();
    }
}
