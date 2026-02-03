package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aoiw implements anpj {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/api/messaging/selfidentity/rcs/SubscriptionRcsAvailabilitySupplier");
    public static final eksp b = eksp.c("BugleSelfIdentity");
    public final eosc c;
    public final int d;
    public final dggv e;
    public final fcsu f;
    public final fcsu g;
    private final cqtq h;
    private final AtomicReference i;

    public aoiw(cqtp cqtpVar, eosc eoscVar, fcsu fcsuVar, fcsu fcsuVar2, crof crofVar) {
        final AtomicReference atomicReference = new AtomicReference(enwr.DISABLED_NOT_DEFAULT_SMS_APP);
        this.i = atomicReference;
        final cqtq cqtqVarA = cqtpVar.a(new aoiv(this));
        this.h = cqtqVarA;
        this.c = eoscVar;
        this.f = fcsuVar;
        final int iA = crofVar.a();
        this.d = iA;
        this.g = fcsuVar2;
        this.e = new dggv() { // from class: aoir
            @Override // defpackage.dggv
            public final void gf(String str, dgid dgidVar) {
                ekrg ekrgVar = aoiw.a;
                AtomicReference atomicReference2 = atomicReference;
                enwr enwrVar = dgidVar.a;
                if (atomicReference2.getAndSet(enwrVar) != enwrVar) {
                    cqtq cqtqVar = cqtqVarA;
                    int i = iA;
                    eksl ekslVar = (eksl) aoiw.b.h();
                    ekslVar.X(cqnc.w, Integer.valueOf(i));
                    ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/api/messaging/selfidentity/rcs/SubscriptionRcsAvailabilitySupplier", "createRcsAvailabilityListener", 156, "SubscriptionRcsAvailabilitySupplier.java")).t("Rcs Availability has been updated to %s.", enwrVar);
                    cqtqVar.c(new Supplier() { // from class: aoit
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            ekrg ekrgVar2 = aoiw.a;
                            return null;
                        }
                    }, "SubscriptionRcsEnabledSupplier::Notify");
                }
            }
        };
    }

    @Override // defpackage.anpj
    public final cquc a(final anpi anpiVar) {
        return this.h.a(new cqtk() { // from class: aoiu
            @Override // defpackage.cqtk
            public final eiju a(Object obj) {
                ekrg ekrgVar = aoiw.a;
                return anpiVar.a();
            }
        }, "SubscriptionRcsEnabledSupplier::register", "SubscriptionRcsEnabledSupplier::callback", "SubscriptionRcsEnabledSupplier::unregister");
    }

    @Override // defpackage.anpj
    public final eiju b() {
        return ((dggw) this.f.b()).d(this.d).h(new ejvr() { // from class: aois
            /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
            @Override // defpackage.ejvr
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object apply(java.lang.Object r6) {
                /*
                    r5 = this;
                    dgid r6 = (defpackage.dgid) r6
                    enwr r6 = r6.a
                    int r0 = r6.ordinal()
                    r1 = 2
                    if (r0 == r1) goto L18
                    r1 = 7
                    if (r0 == r1) goto L15
                    r1 = 23
                    if (r0 == r1) goto L18
                    aoio r0 = defpackage.aoio.b
                    goto L1a
                L15:
                    aoio r0 = defpackage.aoio.a
                    goto L1a
                L18:
                    aoio r0 = defpackage.aoio.c
                L1a:
                    aoiw r1 = r5.a
                    eksp r2 = defpackage.aoiw.b
                    ekrw r2 = r2.h()
                    eksl r2 = (defpackage.eksl) r2
                    ekrz r3 = defpackage.cqnc.w
                    int r1 = r1.d
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                    r2.X(r3, r1)
                    ekrz r1 = defpackage.cqnc.T
                    java.lang.String r6 = r6.toString()
                    r2.X(r1, r6)
                    r6 = 110(0x6e, float:1.54E-43)
                    java.lang.String r1 = "SubscriptionRcsAvailabilitySupplier.java"
                    java.lang.String r3 = "com/google/android/apps/messaging/shared/api/messaging/selfidentity/rcs/SubscriptionRcsAvailabilitySupplier"
                    java.lang.String r4 = "convertRcsAvailability"
                    ekrw r6 = r2.h(r3, r4, r6, r1)
                    eksl r6 = (defpackage.eksl) r6
                    java.lang.String r1 = "Rcs is %s for SelfIdentity."
                    r6.t(r1, r0)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.aois.apply(java.lang.Object):java.lang.Object");
            }
        }, this.c);
    }

    @Override // defpackage.anpj
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException();
    }
}
