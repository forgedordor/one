package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.function.Predicate$CC;
import java.util.function.Predicate;

/* compiled from: PG */
@Deprecated
/* loaded from: classes8.dex */
public final class cgfx extends cayl {
    public final fcsu a;
    private final cqpz b;
    private final eosc c;
    private final fcsu d;

    public cgfx(fcsu fcsuVar, cqpz cqpzVar, eosc eoscVar, fcsu fcsuVar2) {
        this.a = fcsuVar;
        this.b = cqpzVar;
        this.c = eoscVar;
        this.d = fcsuVar2;
    }

    @Override // defpackage.cayl, defpackage.cazg
    public final caya a() {
        caxz caxzVarL = caya.l();
        caxk caxkVar = (caxk) caxzVarL;
        caxkVar.c = elgm.REFRESH_STATEFUL_NOTIFICATIONS_ACTION;
        caxzVarL.d(20);
        caxkVar.d = Duration.ofMillis(this.b.c("bugle_refresh_notification_backoff_duration_in_millis", 100L));
        return caxzVarL.a();
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("RefreshIncomingMessageNotificationsHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return cggb.a.getParserForType();
    }

    @Override // defpackage.cayl
    public final eiju j(cayy cayyVar, final ekgb ekgbVar) {
        if (((crma) this.d.b()).k()) {
            return eijx.h(new eooy() { // from class: cgft
                @Override // defpackage.eooy
                public final ListenableFuture a() {
                    cgbn cgbnVar = (cgbn) this.a.a.b();
                    ekgb ekgbVar2 = ekgbVar;
                    Collection.EL.stream(ekgbVar2).allMatch(new Predicate() { // from class: cgfw
                        public final /* synthetic */ Predicate and(Predicate predicate) {
                            return Predicate$CC.$default$and(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        /* renamed from: negate */
                        public final /* synthetic */ Predicate mo538negate() {
                            return Predicate$CC.$default$negate(this);
                        }

                        public final /* synthetic */ Predicate or(Predicate predicate) {
                            return Predicate$CC.$default$or(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            return ((cggb) obj).d;
                        }
                    });
                    Collection.EL.stream(ekgbVar2).allMatch(new Predicate() { // from class: cgfv
                        public final /* synthetic */ Predicate and(Predicate predicate) {
                            return Predicate$CC.$default$and(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        /* renamed from: negate */
                        public final /* synthetic */ Predicate mo538negate() {
                            return Predicate$CC.$default$negate(this);
                        }

                        public final /* synthetic */ Predicate or(Predicate predicate) {
                            return Predicate$CC.$default$or(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            int iA = cgga.a(((cggb) obj).c);
                            return iA != 0 && iA == 2;
                        }
                    });
                    Collection.EL.stream(ekgbVar2).noneMatch(new Predicate() { // from class: cgfs
                        public final /* synthetic */ Predicate and(Predicate predicate) {
                            return Predicate$CC.$default$and(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        /* renamed from: negate */
                        public final /* synthetic */ Predicate mo538negate() {
                            return Predicate$CC.$default$negate(this);
                        }

                        public final /* synthetic */ Predicate or(Predicate predicate) {
                            return Predicate$CC.$default$or(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            int iA = cgga.a(((cggb) obj).c);
                            return iA != 0 && iA == 3;
                        }
                    });
                    return cgbnVar.M();
                }
            }, this.c).h(new ejvr() { // from class: cgfu
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    return cbcw.i();
                }
            }, eoqg.a);
        }
        E.r("Cannot process pending work item, required phone permission is missing");
        return eijx.e(cbcw.k());
    }
}
