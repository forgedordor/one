package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csyt implements csyk {
    public final fcsu a;
    public final fcsu b;
    private final eosc c;
    private final fcsu d;

    public csyt(eosc eoscVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        this.c = eoscVar;
        this.d = fcsuVar;
        this.a = fcsuVar2;
        this.b = fcsuVar3;
    }

    @Override // defpackage.csyk
    public final Optional a() {
        return Optional.of(Integer.valueOf(R.drawable.quantum_gm_ic_meet_vd_theme_24));
    }

    @Override // defpackage.csyk
    public final void b(ParticipantsTable.BindData bindData) {
        c(ekgb.r(bindData));
    }

    @Override // defpackage.csyk
    public final void c(List list) {
        if (((Boolean) csym.a.e()).booleanValue()) {
            List list2 = (List) Collection.EL.stream(list).filter(new Predicate() { // from class: csyo
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
                    return ((alrj) this.a.b.b()).q((ParticipantsTable.BindData) obj).r();
                }
            }).collect(Collectors.toCollection(new Supplier() { // from class: csyp
                @Override // java.util.function.Supplier
                public final Object get() {
                    return new ArrayList();
                }
            }));
            auvh.h((((Boolean) csym.g.e()).booleanValue() ? ((csxp) this.a.b()).a(ekgb.n(list2)) : ((cszd) this.d.b()).a(ekgb.n(list2)).i(new eooz() { // from class: csyn
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    return ((csxp) this.a.a.b()).a(ekgb.n((List) obj));
                }
            }, this.c)).h(new ejvr() { // from class: csyq
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    Stream map = Collection.EL.stream((List) obj).map(new Function() { // from class: csyr
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            return ((ParticipantsTable.BindData) obj2).R();
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    int i = ekgb.d;
                    final ekgb ekgbVar = (ekgb) map.collect(ekcv.a);
                    bsbs bsbsVarF = ParticipantsTable.f();
                    bsbsVarF.ap("updateReachabilityOnlyForDuoKitAndViLTE");
                    bsbsVarF.S(6);
                    bsbsVarF.U(new Function() { // from class: csys
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            bsbx bsbxVar = (bsbx) obj2;
                            bsbxVar.m(ekgbVar);
                            return bsbxVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    bsbsVarF.b().e();
                    return null;
                }
            }, this.c));
        }
    }

    @Override // defpackage.csyk
    public final boolean d(ParticipantsTable.BindData bindData) {
        int iT = bindData.t();
        return (iT == 6 || iT == 0) ? false : true;
    }

    @Override // defpackage.csyk
    public final boolean e(ParticipantsTable.BindData bindData) {
        int iT = bindData.t();
        return iT == 1 || iT == 3;
    }
}
