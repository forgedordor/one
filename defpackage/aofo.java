package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aofo implements anpj {
    private static final ekrg d = ekrg.c("com/google/android/apps/messaging/shared/api/messaging/selfidentity/connection/ConnectionTypeObservableSupplier");
    public final fdjx a;
    public final cliy b;
    public fdlr c;
    private final cqbm e;
    private final fcsu f;
    private final fctc g;
    private final fctc h = fctd.a(new fdae() { // from class: aofj
        @Override // defpackage.fdae
        public final Object invoke() {
            return new AtomicReference(aoff.a);
        }
    });

    public aofo(final cqtp cqtpVar, fdjx fdjxVar, cliy cliyVar, cqbm cqbmVar, fcsu fcsuVar) {
        this.a = fdjxVar;
        this.b = cliyVar;
        this.e = cqbmVar;
        this.f = fcsuVar;
        this.g = fctd.a(new fdae() { // from class: aofi
            @Override // defpackage.fdae
            public final Object invoke() {
                return cqtpVar.a(new aofn(this));
            }
        });
    }

    @Override // defpackage.anpj
    public final cquc a(final anpi anpiVar) {
        return f().a(new cqtk() { // from class: aofg
            @Override // defpackage.cqtk
            public final eiju a(Object obj) {
                return anpiVar.a();
            }
        }, "SatelliteConnectionStateSupplier::register", "SatelliteConnectionStateSupplier::callback", "SatelliteConnectionStateSupplier::unregister");
    }

    @Override // defpackage.anpj
    public final eiju b() {
        return auvw.c(this.a, fcyi.a, fdjz.a, new aofk(this, null));
    }

    @Override // defpackage.anpj
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final aoff c() {
        if (g().get() != aoff.a) {
            Object obj = g().get();
            obj.getClass();
            return (aoff) obj;
        }
        ekrw ekrwVarG = d.g();
        ekrwVarG.X(eksq.a, "BugleSatellite");
        ((ekrd) ekrwVarG.h("com/google/android/apps/messaging/shared/api/messaging/selfidentity/connection/ConnectionTypeObservableSupplier", "getBlocking", 51, "ConnectionTypeObservableSupplier.kt")).q("getBlocking called before supplier is initialized");
        cliy cliyVar = this.b;
        cliyVar.i();
        return e((cljh) cliyVar.h().c());
    }

    public final aoff e(cljh cljhVar) {
        int iOrdinal = cljhVar.ordinal();
        if (iOrdinal == 0) {
            return aoff.a;
        }
        if (iOrdinal == 1) {
            return aoff.d;
        }
        if (iOrdinal == 2) {
            return aoff.e;
        }
        if (iOrdinal == 3) {
            return aoff.c;
        }
        if (iOrdinal == 4) {
            return ((asap) this.f.b()).a() ? ((cqey) this.e.a()).r() ? aoff.b : aoff.a : aoff.b;
        }
        throw new fctg();
    }

    public final cqtq f() {
        Object objA = this.g.a();
        objA.getClass();
        return (cqtq) objA;
    }

    public final AtomicReference g() {
        return (AtomicReference) this.h.a();
    }
}
