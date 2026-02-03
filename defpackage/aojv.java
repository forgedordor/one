package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aojv implements anpj {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/api/messaging/selfidentity/satellite/eligibility/SatelliteConnectionEligibilityObservableSupplier");
    public final fdjx b;
    public final cliy c;
    public fdlr d;
    private final fctc e;
    private final fctc f = fctd.a(new fdae() { // from class: aojq
        @Override // defpackage.fdae
        public final Object invoke() {
            return new AtomicReference(aojm.UNKNOWN);
        }
    });

    public aojv(final cqtp cqtpVar, fdjx fdjxVar, cliy cliyVar) {
        this.b = fdjxVar;
        this.c = cliyVar;
        this.e = fctd.a(new fdae() { // from class: aojp
            @Override // defpackage.fdae
            public final Object invoke() {
                return cqtpVar.a(new aoju(this));
            }
        });
    }

    public static final aojm g(cljh cljhVar) {
        return cljhVar.ordinal() != 3 ? aojm.INELIGIBLE : aojm.ELIGIBLE;
    }

    @Override // defpackage.anpj
    public final cquc a(final anpi anpiVar) {
        return e().a(new cqtk() { // from class: aojn
            @Override // defpackage.cqtk
            public final eiju a(Object obj) {
                return anpiVar.a();
            }
        }, "SatelliteConnectionEligibilityObservableSupplier::register", "SatelliteConnectionEligibilityObservableSupplier::callback", "SatelliteConnectionEligibilityObservableSupplier::unregister");
    }

    @Override // defpackage.anpj
    public final eiju b() {
        return auvw.c(this.b, fcyi.a, fdjz.a, new aojr(this, null));
    }

    @Override // defpackage.anpj
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final aojm c() {
        if (f().get() != aojm.UNKNOWN) {
            Object obj = f().get();
            obj.getClass();
            return (aojm) obj;
        }
        ekrw ekrwVarG = a.g();
        ekrwVarG.X(eksq.a, "BugleSatellite");
        ((ekrd) ekrwVarG.h("com/google/android/apps/messaging/shared/api/messaging/selfidentity/satellite/eligibility/SatelliteConnectionEligibilityObservableSupplier", "getBlocking", 56, "SatelliteConnectionEligibilityObservableSupplier.kt")).q("getBlocking called before supplier is initialized");
        cliy cliyVar = this.c;
        cliyVar.i();
        return g((cljh) cliyVar.h().c());
    }

    public final cqtq e() {
        Object objA = this.e.a();
        objA.getClass();
        return (cqtq) objA;
    }

    public final AtomicReference f() {
        return (AtomicReference) this.f.a();
    }
}
