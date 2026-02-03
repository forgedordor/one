package defpackage;

import android.database.sqlite.SQLiteConstraintException;
import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.function.UnaryOperator$CC;
import j$.util.stream.Stream;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bysy implements bykl {
    public static final cqce a = cqce.g("BugleCms", "CmsMessageObjectConsumer");
    public final cpmc b;
    public final eosc c;
    public final eosc d;
    public final byos e;
    public final byvu f;
    public final aurx g;
    private final appc h;

    public bysy(byvu byvuVar, byos byosVar, cpmc cpmcVar, eosc eoscVar, eosc eoscVar2, aurx aurxVar, appc appcVar) {
        this.e = byosVar;
        this.f = byvuVar;
        this.b = cpmcVar;
        this.c = eoscVar;
        this.d = eoscVar2;
        this.g = aurxVar;
        this.h = appcVar;
    }

    @Override // defpackage.bykl
    public final eiju a(final ekgb ekgbVar, Optional optional, boolean z) {
        eiju eijuVarG = g(ekgbVar, optional, true);
        return (cpyl.a() && ((Boolean) ((cczi) cpyl.o.get()).e()).booleanValue() && !this.h.a()) ? eijuVarG.i(new eooz() { // from class: bysk
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final bysy bysyVar = this.a;
                final ekgb ekgbVar2 = ekgbVar;
                final ekgp ekgpVar = (ekgp) obj;
                return bysyVar.g.s().i(new eooz() { // from class: byrz
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                        final ekgp ekgpVar2 = ekgpVar;
                        if (!zBooleanValue) {
                            return eijx.e(ekgpVar2);
                        }
                        ekgb ekgbVar3 = ekgbVar2;
                        return bysyVar.g.u(((Boolean) ((cczi) cpxw.g.get()).e()).booleanValue() ? ekgbVar3.size() - ekgpVar2.size() : ekgbVar3.size()).h(new ejvr() { // from class: bysa
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj3) {
                                return ekgpVar2;
                            }
                        }, eoqg.a);
                    }
                }, bysyVar.d);
            }
        }, this.c) : eijuVarG;
    }

    @Override // defpackage.bykl
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return !toc.a((eqnd) obj);
    }

    @Override // defpackage.bykl
    public final boolean c() {
        return true;
    }

    @Override // defpackage.bykl
    public final /* bridge */ /* synthetic */ eiju d(Object obj) {
        return e((eqnd) obj, true);
    }

    public final eiju e(eqnd eqndVar, boolean z) {
        return f(eqndVar, true, z);
    }

    public final eiju f(final eqnd eqndVar, final boolean z, final boolean z2) {
        eooy eooyVar = new eooy() { // from class: byst
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                return this.a.f.c(eqndVar, z2, false);
            }
        };
        eosc eoscVar = this.c;
        return eijx.h(eooyVar, eoscVar).f(cpyv.class, new eooz() { // from class: bysu
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                cpyv cpyvVar = (cpyv) obj;
                int i = cpyvVar.c;
                if (i == 0) {
                    throw null;
                }
                if (i != 59 || !z) {
                    throw cpyvVar;
                }
                final boolean z3 = z2;
                final eqnd eqndVar2 = eqndVar;
                final bysy bysyVar = this.a;
                cqbd cqbdVarA = bysy.a.a();
                cqbdVarA.I("Conversation not found in BugleDb. Fetch from CMS.");
                cqbdVarA.A("cms_conversation_id", eqndVar2.m);
                cqbdVarA.A("cms_object_id", eqndVar2.c);
                cqbdVarA.r();
                eiju eijuVarM = bysyVar.b.m(eqndVar2.m);
                eooz eoozVar = new eooz() { // from class: bysl
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        return bysyVar.e.a((eqjv) obj2, z3);
                    }
                };
                eosc eoscVar2 = bysyVar.c;
                return eijuVarM.i(eoozVar, eoscVar2).i(new eooz() { // from class: bysm
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        cqbd cqbdVarC = bysy.a.c();
                        cqbdVarC.I("Restored CMS conversation not found in BugleDb.");
                        eqnd eqndVar3 = eqndVar2;
                        cqbdVarC.A("cms_conversation_id", eqndVar3.m);
                        cqbdVarC.A("cms_object_id", eqndVar3.c);
                        cqbdVarC.r();
                        return bysyVar.f(eqndVar3, false, z3);
                    }
                }, eoscVar2).e(fbtf.class, new ejvr() { // from class: bysn
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        fbtf fbtfVar = (fbtf) obj2;
                        if (fbtfVar.a.getCode().equals(Status.Code.NOT_FOUND)) {
                            throw new bysx(fbtfVar);
                        }
                        throw fbtfVar;
                    }
                }, eoqg.a).f(cpyv.class, new eooz() { // from class: byso
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        cpyv cpyvVar2 = (cpyv) obj2;
                        if (!(cpyvVar2.getCause() instanceof SQLiteConstraintException)) {
                            throw cpyvVar2;
                        }
                        boolean z4 = z3;
                        eqnd eqndVar3 = eqndVar2;
                        bysy bysyVar2 = bysyVar;
                        cqbd cqbdVarE = bysy.a.e();
                        cqbdVarE.I("Error saving CMS conversation id to DB, probably because multiple objects tried to restore the conversation. Try object restore again.");
                        cqbdVarE.A("cms_conversation_id", eqndVar3.m);
                        cqbdVarE.A("cms_object_id", eqndVar3.c);
                        cqbdVarE.s(cpyvVar2);
                        return bysyVar2.f(eqndVar3, false, z4);
                    }
                }, eoscVar2);
            }
        }, eoscVar);
    }

    public final eiju g(ekgb ekgbVar, final Optional optional, boolean z) {
        eiju eijuVarI = this.f.i(ekgbVar, optional);
        return z ? eijuVarI.i(new eooz() { // from class: byss
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                ekgp ekgpVar = (ekgp) obj;
                ekgpVar.getClass();
                ekgp ekgpVar2 = (ekgp) Collection.EL.stream(ekgpVar.entrySet()).filter(new Predicate() { // from class: bysf
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
                    public final boolean test(Object obj2) {
                        Map.Entry entry = (Map.Entry) obj2;
                        if (!(entry.getValue() instanceof cpyv)) {
                            return false;
                        }
                        int i = ((cpyv) entry.getValue()).c;
                        if (i != 0) {
                            return i == 59;
                        }
                        throw null;
                    }
                }).map(new Function() { // from class: bysg
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return ((eqnd) ((Map.Entry) obj2).getKey()).m;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).distinct().collect(ekcv.a(UnaryOperator$CC.identity(), new Function() { // from class: bysh
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return new ekfw();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }));
                if (!ekgpVar2.isEmpty()) {
                    ekqg ekqgVarListIterator = ekgpVar.keySet().listIterator();
                    while (ekqgVarListIterator.hasNext()) {
                        eqnd eqndVar = (eqnd) ekqgVarListIterator.next();
                        ekfw ekfwVar = (ekfw) ekgpVar2.get(eqndVar.m);
                        if (ekfwVar != null) {
                            ekfwVar.h(eqndVar);
                        }
                    }
                }
                ekgp ekgpVar3 = (ekgp) Collection.EL.stream(ekgpVar2.entrySet()).collect(ekcv.a(new Function() { // from class: bysi
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return (String) ((Map.Entry) obj2).getKey();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Function() { // from class: bysj
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return ((ekfw) ((Map.Entry) obj2).getValue()).g();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }));
                ekgi ekgiVar = new ekgi();
                ekqg ekqgVarListIterator2 = ekgpVar.entrySet().listIterator();
                while (ekqgVarListIterator2.hasNext()) {
                    Map.Entry entry = (Map.Entry) ekqgVarListIterator2.next();
                    if (!ekgpVar3.containsKey(((eqnd) entry.getKey()).m)) {
                        ekgiVar.j(entry);
                    }
                }
                eiju eijuVarE = eijx.e(ekgiVar);
                ekqg ekqgVarListIterator3 = ekgpVar3.entrySet().listIterator();
                while (ekqgVarListIterator3.hasNext()) {
                    final Optional optional2 = optional;
                    final bysy bysyVar = this.a;
                    final Map.Entry entry2 = (Map.Entry) ekqgVarListIterator3.next();
                    eijuVarE = eijuVarE.i(new eooz() { // from class: bysq
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj2) {
                            final Map.Entry entry3 = entry2;
                            final ekgi ekgiVar2 = (ekgi) obj2;
                            final String str = (String) entry3.getKey();
                            final ekgb ekgbVar2 = (ekgb) entry3.getValue();
                            cqbd cqbdVarC = bysy.a.c();
                            cqbdVarC.I("Conversation not found in BugleDb. Fetch from CMS.");
                            cqbdVarC.A("cms_conversation_id", str);
                            Stream map = Collection.EL.stream(ekgbVar2).map(new bysp());
                            int i = ekgb.d;
                            cqbdVarC.A("cms_object_ids", map.collect(ekcv.a));
                            cqbdVarC.r();
                            final bysy bysyVar2 = bysyVar;
                            eiju eijuVarM = bysyVar2.b.m(str);
                            eooz eoozVar = new eooz() { // from class: bysb
                                @Override // defpackage.eooz
                                public final ListenableFuture a(Object obj3) {
                                    return bysyVar2.e.a((eqjv) obj3, true);
                                }
                            };
                            eosc eoscVar = bysyVar2.c;
                            eiju eijuVarI2 = eijuVarM.i(eoozVar, eoscVar);
                            ejvr ejvrVar = new ejvr() { // from class: bysc
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj3) {
                                    fbtf fbtfVar = (fbtf) obj3;
                                    if (fbtfVar.a.getCode().equals(Status.Code.NOT_FOUND)) {
                                        throw new bysx(fbtfVar);
                                    }
                                    throw fbtfVar;
                                }
                            };
                            eoqg eoqgVar = eoqg.a;
                            eiju eijuVarE2 = eijuVarI2.e(fbtf.class, ejvrVar, eoqgVar);
                            final Optional optional3 = optional2;
                            eiju eijuVarF = eijuVarE2.i(new eooz() { // from class: bysd
                                @Override // defpackage.eooz
                                public final ListenableFuture a(Object obj3) {
                                    return bysyVar2.g(ekgbVar2, optional3, false);
                                }
                            }, eoscVar).f(Exception.class, new eooz() { // from class: byse
                                @Override // defpackage.eooz
                                public final ListenableFuture a(Object obj3) throws Exception {
                                    Exception exc = (Exception) obj3;
                                    if ((!(exc instanceof cpyv) || !(exc.getCause() instanceof SQLiteConstraintException)) && !(exc instanceof SQLiteConstraintException)) {
                                        throw exc;
                                    }
                                    Optional optional4 = optional3;
                                    ekgb ekgbVar3 = ekgbVar2;
                                    String str2 = str;
                                    bysy bysyVar3 = bysyVar2;
                                    cqbd cqbdVarE = bysy.a.e();
                                    cqbdVarE.I("Error saving CMS conversation id to DB, probably because multiple objects tried to restore the conversation. Try object restore again.");
                                    cqbdVarE.A("cms_conversation_id", str2);
                                    Stream map2 = Collection.EL.stream(ekgbVar3).map(new bysp());
                                    int i2 = ekgb.d;
                                    cqbdVarE.A("cms_object_ids", map2.collect(ekcv.a));
                                    cqbdVarE.s(exc);
                                    return bysyVar3.g(ekgbVar3, optional4, false);
                                }
                            }, eoscVar);
                            ekgiVar2.getClass();
                            return eijuVarF.h(new ejvr() { // from class: bysv
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj3) {
                                    ekgi ekgiVar3 = ekgiVar2;
                                    ekgiVar3.g((ekgp) obj3);
                                    return ekgiVar3;
                                }
                            }, eoqgVar).e(Exception.class, new ejvr() { // from class: bysw
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj3) {
                                    Exception exc = (Exception) obj3;
                                    ekgb ekgbVar3 = (ekgb) entry3.getValue();
                                    int size = ekgbVar3.size();
                                    int i2 = 0;
                                    while (true) {
                                        ekgi ekgiVar3 = ekgiVar2;
                                        if (i2 >= size) {
                                            return ekgiVar3;
                                        }
                                        ekgiVar3.i((eqnd) ekgbVar3.get(i2), exc);
                                        i2++;
                                    }
                                }
                            }, eoqgVar);
                        }
                    }, bysyVar.d);
                }
                return eijuVarE.h(new ejvr() { // from class: bysr
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        return ((ekgi) obj2).c();
                    }
                }, eoqg.a);
            }
        }, this.c) : eijuVarI;
    }
}
