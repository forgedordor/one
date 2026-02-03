package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crgo extends fcyz implements fdat {
    int a;
    final /* synthetic */ fcsu b;
    final /* synthetic */ eosc c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crgo(fcxy fcxyVar, fcsu fcsuVar, eosc eoscVar) {
        super(2, fcxyVar);
        this.b = fcsuVar;
        this.c = eoscVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((crgo) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        final ejha ejhaVarD = cree.d((String) crbf.A.e());
        final ejly ejlyVar = (ejly) this.b.b();
        final String str = (String) crbf.B.e();
        final eosc eoscVar = this.c;
        final Random random = new Random();
        final ekgb ekgbVarA = ejlu.a(str);
        ListenableFuture listenableFutureF = eooq.f(eoqt.t(ejhaVarD.equals(ejha.a) ? eork.i(ejlw.c().a()) : ejlyVar.c(ejhaVarD).f(new eopl() { // from class: ejlj
            @Override // defpackage.eopl
            public final eopy a(eopt eoptVar, Object obj2) {
                final InputStream inputStream = (InputStream) obj2;
                final ejha ejhaVar = ejhaVarD;
                final ekgb ekgbVar = ekgbVarA;
                final ejly ejlyVar2 = ejlyVar;
                final Executor executor = eoscVar;
                return new eopy(eork.n(new eooy() { // from class: ejlh
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.eooy
                    public final ListenableFuture a() {
                        InputStream inputStream2 = inputStream;
                        if (inputStream2 == null) {
                            return eork.i(ejlw.c().a());
                        }
                        ejhc ejhcVar = ejhaVar.c;
                        if (ejhcVar == null) {
                            ejhcVar = ejhc.a;
                        }
                        final Executor executor2 = executor;
                        final ejly ejlyVar3 = ejlyVar2;
                        final ekgb ekgbVar2 = ekgbVar;
                        final String str2 = ejhcVar.d;
                        final ejht ejhtVar = (ejht) evsn.parseFrom(ejht.a, inputStream2, evrr.a());
                        final ejlv ejlvVarC = ejlw.c();
                        final ekgp ekgpVar = (ekgp) Collection.EL.stream(((ejkb) ejhtVar.b.get(0)).b).distinct().filter(new Predicate() { // from class: ejlf
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
                                return !ekgbVar2.contains(((etyp) obj3).c);
                            }
                        }).collect(ekcv.a(new Function() { // from class: ejlr
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj3) {
                                return ((etyp) obj3).c;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }, new Function() { // from class: ejls
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj3) {
                                final etyp etypVar = (etyp) obj3;
                                ejgz ejgzVar = (ejgz) ejha.a.createBuilder();
                                ejhb ejhbVar = (ejhb) ejhc.a.createBuilder();
                                ejhbVar.copyOnWrite();
                                ejhc ejhcVar2 = (ejhc) ejhbVar.instance;
                                String str3 = str2;
                                str3.getClass();
                                ejhcVar2.b |= 2;
                                ejhcVar2.d = str3;
                                String str4 = etypVar.c;
                                ejhbVar.copyOnWrite();
                                ejhc ejhcVar3 = (ejhc) ejhbVar.instance;
                                str4.getClass();
                                ejhcVar3.b |= 1;
                                ejhcVar3.c = str4;
                                ejgzVar.copyOnWrite();
                                ejha ejhaVar2 = (ejha) ejgzVar.instance;
                                ejhc ejhcVar4 = (ejhc) ejhbVar.build();
                                ejhcVar4.getClass();
                                ejhaVar2.c = ejhcVar4;
                                ejhaVar2.b |= 1;
                                return eooq.f(eoqt.t(ejlyVar3.d((ejha) ejgzVar.build())), new ejvr() { // from class: ejli
                                    @Override // defpackage.ejvr
                                    public final Object apply(Object obj4) {
                                        String str5;
                                        String str6;
                                        etxy etxyVar;
                                        etyp etypVar2 = etypVar;
                                        Optional optional = (Optional) obj4;
                                        try {
                                            if (optional.isPresent()) {
                                                String strReplace = ((String) optional.get()).replace("android://", "file:///data/user/0/");
                                                etyo etyoVar = (etyo) etyp.a.createBuilder();
                                                String str7 = etypVar2.c;
                                                etyoVar.copyOnWrite();
                                                etyp etypVar3 = (etyp) etyoVar.instance;
                                                str7.getClass();
                                                etypVar3.c = str7;
                                                String str8 = etypVar2.h;
                                                etyoVar.copyOnWrite();
                                                etyp etypVar4 = (etyp) etyoVar.instance;
                                                str8.getClass();
                                                etypVar4.h = str8;
                                                etyb etybVar = etyb.a;
                                                etya etyaVar = (etya) etybVar.createBuilder();
                                                etyb etybVar2 = etypVar2.e;
                                                if (etybVar2 == null) {
                                                    etybVar2 = etybVar;
                                                }
                                                String str9 = etybVar2.c;
                                                etyaVar.copyOnWrite();
                                                etyb etybVar3 = (etyb) etyaVar.instance;
                                                str9.getClass();
                                                etybVar3.c = str9;
                                                etyb etybVar4 = etypVar2.e;
                                                if (etybVar4 == null) {
                                                    etybVar4 = etybVar;
                                                }
                                                int iC = ejlu.c(etybVar4.c);
                                                etyaVar.copyOnWrite();
                                                ((etyb) etyaVar.instance).e = etxz.a(iC);
                                                etyb etybVar5 = etypVar2.e;
                                                if (etybVar5 == null) {
                                                    etybVar5 = etybVar;
                                                }
                                                etxy etxyVar2 = etybVar5.f;
                                                if (etxyVar2 == null) {
                                                    etxyVar2 = etxy.a;
                                                }
                                                etyaVar.copyOnWrite();
                                                etyb etybVar6 = (etyb) etyaVar.instance;
                                                etxyVar2.getClass();
                                                etybVar6.f = etxyVar2;
                                                etybVar6.b |= 1;
                                                etyoVar.copyOnWrite();
                                                etyp etypVar5 = (etyp) etyoVar.instance;
                                                etyb etybVar7 = (etyb) etyaVar.build();
                                                etybVar7.getClass();
                                                etypVar5.e = etybVar7;
                                                etypVar5.b |= 1;
                                                etya etyaVar2 = (etya) etybVar.createBuilder();
                                                etyaVar2.copyOnWrite();
                                                etyb etybVar8 = (etyb) etyaVar2.instance;
                                                strReplace.getClass();
                                                etybVar8.c = strReplace;
                                                if ((etypVar2.b & 4) != 0) {
                                                    etyb etybVar9 = etypVar2.g;
                                                    if (etybVar9 == null) {
                                                        etybVar9 = etybVar;
                                                    }
                                                    str5 = etybVar9.c;
                                                } else {
                                                    etyb etybVar10 = etypVar2.e;
                                                    if (etybVar10 == null) {
                                                        etybVar10 = etybVar;
                                                    }
                                                    str5 = etybVar10.c;
                                                }
                                                etyaVar2.copyOnWrite();
                                                etyb etybVar11 = (etyb) etyaVar2.instance;
                                                str5.getClass();
                                                etybVar11.d = str5;
                                                if ((etypVar2.b & 4) != 0) {
                                                    etyb etybVar12 = etypVar2.g;
                                                    if (etybVar12 == null) {
                                                        etybVar12 = etybVar;
                                                    }
                                                    str6 = etybVar12.c;
                                                } else {
                                                    etyb etybVar13 = etypVar2.e;
                                                    if (etybVar13 == null) {
                                                        etybVar13 = etybVar;
                                                    }
                                                    str6 = etybVar13.c;
                                                }
                                                int iC2 = ejlu.c(str6);
                                                etyaVar2.copyOnWrite();
                                                ((etyb) etyaVar2.instance).e = etxz.a(iC2);
                                                if ((etypVar2.b & 4) != 0) {
                                                    etyb etybVar14 = etypVar2.g;
                                                    if (etybVar14 != null) {
                                                        etybVar = etybVar14;
                                                    }
                                                    etxyVar = etybVar.f;
                                                    if (etxyVar == null) {
                                                        etxyVar = etxy.a;
                                                    }
                                                } else {
                                                    etyb etybVar15 = etypVar2.e;
                                                    if (etybVar15 != null) {
                                                        etybVar = etybVar15;
                                                    }
                                                    etxyVar = etybVar.f;
                                                    if (etxyVar == null) {
                                                        etxyVar = etxy.a;
                                                    }
                                                }
                                                etyaVar2.copyOnWrite();
                                                etyb etybVar16 = (etyb) etyaVar2.instance;
                                                etxyVar.getClass();
                                                etybVar16.f = etxyVar;
                                                etybVar16.b |= 1;
                                                etyoVar.copyOnWrite();
                                                etyp etypVar6 = (etyp) etyoVar.instance;
                                                etyb etybVar17 = (etyb) etyaVar2.build();
                                                etybVar17.getClass();
                                                etypVar6.g = etybVar17;
                                                etypVar6.b |= 4;
                                                return (etyp) etyoVar.build();
                                            }
                                        } catch (Exception e) {
                                            ((ekrd) ((ekrd) ((ekrd) ejlu.a.j()).g(e)).h("com/google/chat/smartmessaging/smartreply/android/emotivecontentproviders/StickerProvider", "getStickerForUri", (char) 606, "StickerProvider.java")).q("returning default Sticker instance");
                                        }
                                        return etyp.a;
                                    }
                                }, executor2);
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }));
                        return eooq.f(eoqt.t(eork.c(ekgpVar.values()).a(new Callable() { // from class: ejlt
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                ekgi ekgiVar = new ekgi();
                                ekqg ekqgVarListIterator = ekgpVar.entrySet().listIterator();
                                while (ekqgVarListIterator.hasNext()) {
                                    Map.Entry entry = (Map.Entry) ekqgVarListIterator.next();
                                    ekgiVar.i((String) entry.getKey(), (etyp) eork.q((Future) entry.getValue()));
                                }
                                return ekgiVar.c();
                            }
                        }, executor2)), new ejvr() { // from class: ejlm
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj3) {
                                ejlv ejlvVar = ejlvVarC;
                                ejlvVar.c((ekgp) obj3);
                                Stream streamDistinct = Collection.EL.stream(((ejkb) ejhtVar.b.get(0)).c).distinct();
                                final ekgb ekgbVar3 = ekgbVar2;
                                Stream streamFilter = streamDistinct.filter(new Predicate() { // from class: ejln
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
                                    public final boolean test(Object obj4) {
                                        return !ekgbVar3.contains(((ejhv) obj4).c);
                                    }
                                });
                                Function function = new Function() { // from class: ejlo
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo536andThen(Function function2) {
                                        return Function$CC.$default$andThen(this, function2);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj4) {
                                        return ((ejhv) obj4).b.toLowerCase();
                                    }

                                    public final /* synthetic */ Function compose(Function function2) {
                                        return Function$CC.$default$compose(this, function2);
                                    }
                                };
                                Supplier supplier = new Supplier() { // from class: ejlp
                                    @Override // java.util.function.Supplier
                                    public final Object get() {
                                        return new HashMap();
                                    }
                                };
                                Function function2 = new Function() { // from class: ejlq
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo536andThen(Function function3) {
                                        return Function$CC.$default$andThen(this, function3);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj4) {
                                        return ((ejhv) obj4).c;
                                    }

                                    public final /* synthetic */ Function compose(Function function3) {
                                        return Function$CC.$default$compose(this, function3);
                                    }
                                };
                                int i2 = ekgb.d;
                                ejlvVar.b(ekgp.j((Map) streamFilter.collect(Collectors.groupingBy(function, supplier, Collectors.mapping(function2, ekcv.a)))));
                                return ejlvVar.a();
                            }
                        }, executor2);
                    }
                }, executor));
            }
        }, eoscVar).a(Exception.class, new eopo() { // from class: ejlk
            @Override // defpackage.eopo
            public final Object a(eopt eoptVar, Object obj2) {
                ((ekrd) ((ekrd) ((ekrd) ejlu.a.i()).g((Exception) obj2)).h("com/google/chat/smartmessaging/smartreply/android/emotivecontentproviders/StickerProvider", "readFromConfigFileAsync", 206, "StickerProvider.java")).q("StickerSuggestions creation failed, disabling");
                return ejlw.c().a();
            }
        }, eoscVar).g()), new ejvr() { // from class: ejlg
            @Override // defpackage.ejvr
            public final Object apply(Object obj2) {
                ejlw ejlwVar = (ejlw) obj2;
                return new ejlu(ejlwVar.a(), ejlwVar.b(), str, ekgbVarA, random);
            }
        }, eoscVar);
        this.a = 1;
        Object objC = fdxs.c(listenableFutureF, this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        crgo crgoVar = new crgo(fcxyVar, this.b, this.c);
        crgoVar.d = obj;
        return crgoVar;
    }
}
