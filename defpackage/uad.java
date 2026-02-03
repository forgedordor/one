package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import j$.util.Collection;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.HashSet;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uad {
    public static final cqce a = cqce.g("BugleCms", "ConversationSync");
    public final ubo b;
    public final eosc c;
    public final byos d;
    public final cpmc e;
    public final cppc f;
    public final eosc g;

    public uad(cpmc cpmcVar, cppc cppcVar, ubo uboVar, byos byosVar, eosc eoscVar, eosc eoscVar2) {
        this.d = byosVar;
        this.e = cpmcVar;
        this.f = cppcVar;
        this.b = uboVar;
        this.c = eoscVar;
        this.g = eoscVar2;
    }

    public final eiju a(final String str, final String str2) {
        return (eiju) botm.h(str, new Function() { // from class: tzu
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cqbd cqbdVarC = uad.a.c();
                cqbdVarC.A(bzmz.t.a, str2);
                cqbdVarC.A(bzmz.v.a, "Ignore");
                cqbdVarC.A(bzmz.w.a, str);
                cqbdVarC.A(bzmz.x.a, "Conversation already in db");
                cqbdVarC.I("Conversation Sync");
                cqbdVarC.r();
                return eijx.e(null);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Supplier() { // from class: tzv
            @Override // java.util.function.Supplier
            public final Object get() {
                final uad uadVar = this.a;
                cpmc cpmcVar = uadVar.e;
                final String str3 = str;
                final String str4 = str2;
                eiju eijuVarM = cpmcVar.m(str3);
                eooz eoozVar = new eooz() { // from class: tzw
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        final uad uadVar2 = uadVar;
                        final eqjv eqjvVar = (eqjv) obj;
                        try {
                            epjx epjxVarA = uadVar2.f.a(eqjvVar);
                            final String str5 = str4;
                            final evtg evtgVar = epjxVarA.g;
                            bsbo bsboVarE = ParticipantsTable.e();
                            bsboVarE.A("getParticipantsInDb");
                            bsboVarE.h(new Function() { // from class: uaa
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    bsbx bsbxVar = (bsbx) obj2;
                                    bsbxVar.e(evtgVar);
                                    return bsbxVar;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            bsboVarE.f(new Function() { // from class: uab
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    return ((brzh) obj2).E;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            return bsboVarE.b().x().h(new ejvr() { // from class: uac
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj2) {
                                    final HashSet hashSet = new HashSet();
                                    Collection.EL.stream((ekgb) obj2).forEach(new Consumer() { // from class: tzt
                                        @Override // java.util.function.Consumer
                                        /* renamed from: accept */
                                        public final void z(Object obj3) {
                                            String strL = ((ParticipantsTable.BindData) obj3).L();
                                            if (TextUtils.isEmpty(strL)) {
                                                return;
                                            }
                                            hashSet.add(strL);
                                        }

                                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                            return Consumer$CC.$default$andThen(this, consumer);
                                        }
                                    });
                                    return hashSet;
                                }
                            }, uadVar2.g).i(new eooz() { // from class: tzp
                                @Override // defpackage.eooz
                                public final ListenableFuture a(Object obj2) {
                                    final HashSet hashSet = (HashSet) obj2;
                                    Stream streamFilter = Collection.EL.stream(evtgVar).filter(new Predicate() { // from class: tzq
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
                                        public final boolean test(Object obj3) {
                                            return !hashSet.contains((String) obj3);
                                        }
                                    });
                                    final uad uadVar3 = uadVar2;
                                    final String str6 = str5;
                                    Stream map = streamFilter.map(new Function() { // from class: tzr
                                        @Override // java.util.function.Function
                                        /* renamed from: andThen */
                                        public final /* synthetic */ Function mo536andThen(Function function) {
                                            return Function$CC.$default$andThen(this, function);
                                        }

                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj3) {
                                            return uadVar3.b.a((String) obj3, str6);
                                        }

                                        public final /* synthetic */ Function compose(Function function) {
                                            return Function$CC.$default$compose(this, function);
                                        }
                                    });
                                    int i = ekgb.d;
                                    eijw eijwVarL = eijx.l((Iterable) map.collect(ekcv.a));
                                    final eqjv eqjvVar2 = eqjvVar;
                                    return eijwVarL.a(new Callable() { // from class: tzs
                                        @Override // java.util.concurrent.Callable
                                        public final Object call() {
                                            return eqjvVar2;
                                        }
                                    }, uadVar3.g);
                                }
                            }, uadVar2.c);
                        } catch (evtj e) {
                            throw new IllegalStateException("Error parsing conversation extended details", e);
                        }
                    }
                };
                eosc eoscVar = uadVar.c;
                return eijuVarM.i(eoozVar, eoscVar).i(new eooz() { // from class: tzx
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        return uadVar.d.a((eqjv) obj, false);
                    }
                }, uadVar.g).h(new ejvr() { // from class: tzy
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        cqbd cqbdVarC = uad.a.c();
                        cqbdVarC.A(bzmz.t.a, str4);
                        cqbdVarC.A(bzmz.v.a, "Created conversation in DB");
                        cqbdVarC.A(bzmz.w.a, str3);
                        cqbdVarC.I("Conversation Sync");
                        cqbdVarC.r();
                        return null;
                    }
                }, eoscVar).f(Throwable.class, new eooz() { // from class: tzz
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        Throwable th = (Throwable) obj;
                        boolean zEquals = Status.c(th).getCode().equals(Status.Code.NOT_FOUND);
                        String str5 = str4;
                        String str6 = str3;
                        if (zEquals) {
                            cqbd cqbdVarE = uad.a.e();
                            cqbdVarE.A(bzmz.t.a, str5);
                            cqbdVarE.A(bzmz.v.a, "Ignore: Conversation not found in CMS");
                            cqbdVarE.A(bzmz.w.a, str6);
                            cqbdVarE.I("Conversation Sync");
                            cqbdVarE.r();
                            return eijx.e(null);
                        }
                        cqbd cqbdVarE2 = uad.a.e();
                        cqbdVarE2.A(bzmz.t.a, str5);
                        cqbdVarE2.A(bzmz.v.a, "Exception while processing event");
                        cqbdVarE2.A(bzmz.w.a, str6);
                        cqbdVarE2.I("Conversation Sync");
                        cqbdVarE2.s(th);
                        return eijx.d(th);
                    }
                }, eoqg.a);
            }
        });
    }
}
