package defpackage;

import android.content.Context;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.concurrent.ThreadLocalRandom;
import j$.util.function.Function$CC;
import j$.util.stream.Collector;
import j$.util.stream.Stream;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class alpa implements alfq {
    public static final eksp a = eksp.c("Bugle");
    public final Context b;
    public final eygg c;
    public final eygg d;
    public final eygg e;
    public final eygg f;
    public final eygg g;
    private final eygg h;
    private final eygg i;
    private final eygg j;

    public alpa(Context context, eygg eyggVar, eygg eyggVar2, eygg eyggVar3, eygg eyggVar4, eygg eyggVar5, eygg eyggVar6, eygg eyggVar7, eygg eyggVar8) {
        this.b = context;
        this.h = eyggVar;
        this.c = eyggVar2;
        this.d = eyggVar3;
        this.e = eyggVar4;
        this.i = eyggVar5;
        this.f = eyggVar6;
        this.g = eyggVar7;
        this.j = eyggVar8;
    }

    public static esvh o(awch awchVar, crnc crncVar) {
        return new esvh(esvg.CONFIRMED_UPLOAD_SAFE_USER_DATA, s(awchVar, crncVar != null ? crncVar.toString() : null));
    }

    public static esvh p(final awch awchVar, ekgb ekgbVar) {
        Stream map = Collection.EL.stream(ekgbVar).map(new Function() { // from class: aloc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                eksp ekspVar = alpa.a;
                return alpa.s(awchVar, ((crnc) obj).toString());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = ekgb.d;
        return new esvh(esvg.CONFIRMED_UPLOAD_SAFE_USER_DATA, ((ekgb) map.collect(ekcv.a)).toString());
    }

    public static esvh q(awch awchVar, String str) {
        return new esvh(esvg.CONFIRMED_UPLOAD_SAFE_USER_DATA, ((avog) awchVar.a(String.valueOf(str))).b);
    }

    public static esvh r(awch awchVar, String str) {
        return new esvh(esvg.CONFIRMED_UPLOAD_SAFE_USER_DATA, s(awchVar, str));
    }

    public static String s(awch awchVar, String str) {
        return str == null ? "null" : crpq.a(str) ? "AUTO" : awchVar.c(str);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [alfq, java.lang.Object] */
    @Override // defpackage.alfq
    public final alqm a(final String str) {
        return l(this.h.b().a(str), new ejxr() { // from class: alot
            /* JADX WARN: Type inference failed for: r0v2, types: [alfq, java.lang.Object] */
            @Override // defpackage.ejxr
            public final Object get() {
                return this.a.c.b().a(str);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [alfq, java.lang.Object] */
    @Override // defpackage.alfq
    public final alqm b(final aubq aubqVar) {
        return l(this.h.b().b(aubqVar), new ejxr() { // from class: aloe
            /* JADX WARN: Type inference failed for: r0v2, types: [alfq, java.lang.Object] */
            @Override // defpackage.ejxr
            public final Object get() {
                return this.a.c.b().b(aubqVar);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [alfq, java.lang.Object] */
    @Override // defpackage.alfq
    public final alqm c(final String str, final ejxr ejxrVar) {
        return l(this.h.b().c(str, ejxrVar), new ejxr() { // from class: alow
            /* JADX WARN: Type inference failed for: r0v2, types: [alfq, java.lang.Object] */
            @Override // defpackage.ejxr
            public final Object get() {
                return this.a.c.b().c(str, ejxrVar);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [alfq, java.lang.Object] */
    @Override // defpackage.alfq
    public final alqm d(final dggk dggkVar) {
        return l(this.h.b().d(dggkVar), new ejxr() { // from class: alol
            /* JADX WARN: Type inference failed for: r0v2, types: [alfq, java.lang.Object] */
            @Override // defpackage.ejxr
            public final Object get() {
                return this.a.c.b().d(dggkVar);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [alfq, java.lang.Object] */
    @Override // defpackage.alfq
    public final alqm e(final String str, final String str2, final String str3, final boolean z, final String str4, final ejxr ejxrVar) {
        return l(this.h.b().e(str, str2, str3, z, str4, ejxrVar), new ejxr() { // from class: aloy
            /* JADX WARN: Type inference failed for: r1v0, types: [alfq, java.lang.Object] */
            @Override // defpackage.ejxr
            public final Object get() {
                return this.a.c.b().e(str, str2, str3, z, str4, ejxrVar);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [alfq, java.lang.Object] */
    @Override // defpackage.alfq
    public final alqm f() {
        return l(this.h.b().f(), new ejxr() { // from class: alox
            /* JADX WARN: Type inference failed for: r0v2, types: [alfq, java.lang.Object] */
            @Override // defpackage.ejxr
            public final Object get() {
                return this.a.c.b().f();
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [alfq, java.lang.Object] */
    @Override // defpackage.alfq
    public final alqm g(final alqm alqmVar, final ejxr ejxrVar) {
        return l(this.h.b().g(alqmVar, ejxrVar), new ejxr() { // from class: alor
            /* JADX WARN: Type inference failed for: r0v2, types: [alfq, java.lang.Object] */
            @Override // defpackage.ejxr
            public final Object get() {
                return this.a.c.b().g(alqmVar, ejxrVar);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [alfq, java.lang.Object] */
    @Override // defpackage.alfq
    public final alqm h(final alqm alqmVar, final String str) {
        return l(this.h.b().h(alqmVar, str), new ejxr() { // from class: alos
            /* JADX WARN: Type inference failed for: r0v2, types: [alfq, java.lang.Object] */
            @Override // defpackage.ejxr
            public final Object get() {
                return this.a.c.b().h(alqmVar, str);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [alfq, java.lang.Object] */
    @Override // defpackage.alfq
    public final alqm i(final alqm alqmVar, final boolean z) {
        return l(this.h.b().i(alqmVar, z), new ejxr() { // from class: alof
            /* JADX WARN: Type inference failed for: r0v2, types: [alfq, java.lang.Object] */
            @Override // defpackage.ejxr
            public final Object get() {
                return this.a.c.b().i(alqmVar, z);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [alfq, java.lang.Object] */
    @Override // defpackage.alfq
    public final alqm j(final alqm alqmVar, final int i) {
        return l(this.h.b().j(alqmVar, i), new ejxr() { // from class: alob
            /* JADX WARN: Type inference failed for: r0v2, types: [alfq, java.lang.Object] */
            @Override // defpackage.ejxr
            public final Object get() {
                return this.a.c.b().j(alqmVar, i);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [alfq, java.lang.Object] */
    @Override // defpackage.alfq
    public final alqm k(final alqm alqmVar) {
        return l(this.h.b().k(alqmVar), new ejxr() { // from class: alod
            /* JADX WARN: Type inference failed for: r0v2, types: [alfq, java.lang.Object] */
            @Override // defpackage.ejxr
            public final Object get() {
                return this.a.c.b().k(alqmVar);
            }
        });
    }

    final alqm l(alqm alqmVar, ejxr ejxrVar) {
        ejxr ejxrVarA = ejxx.a(ejxrVar);
        aloz alozVar = new aloz();
        return ((alql) this.j.b()).c(n("local", new Function() { // from class: alog
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((alqm) obj).j();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, alqmVar, ejxrVarA, alozVar), n("raw", new Function() { // from class: aloh
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((alqm) obj).n();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, alqmVar, ejxrVarA, alozVar), n("international", new Function() { // from class: aloi
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                eksp ekspVar = alpa.a;
                return ((alqm) obj).c();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, alqmVar, ejxrVarA, alozVar), n("legacy_normalized", new Function() { // from class: aloj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                eksp ekspVar = alpa.a;
                String strL = ((alqm) obj).l();
                strL.getClass();
                return strL;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, alqmVar, ejxrVarA, alozVar), n("comparable", new Function() { // from class: alok
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                eksp ekspVar = alpa.a;
                return ((alqm) obj).o();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, alqmVar, ejxrVarA, alozVar), n("rcsIdentifier", new Function() { // from class: alom
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((alqm) obj).e();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, alqmVar, ejxrVarA, alozVar), n("display", new Function() { // from class: alon
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                eksp ekspVar = alpa.a;
                return ((alqm) obj).F();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, alqmVar, ejxrVarA, alozVar), n(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, new Function() { // from class: aloo
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((alqm) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, alqmVar, ejxrVarA, alozVar), n("callCode", new Function() { // from class: alop
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((alqm) obj).f();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, alqmVar, ejxrVarA, alozVar), n("regionCode", new Function() { // from class: aloq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((alqm) obj).g();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, alqmVar, ejxrVarA, alozVar));
    }

    public final crnc m(String str) {
        return (str == null || str.length() != 2) ? new crnc(0) : new crnc(((ephj) this.i.b()).a(str.toUpperCase(Locale.US)));
    }

    final ejxr n(final String str, final Function function, final alqm alqmVar, final ejxr ejxrVar, final Throwable th) {
        return ejxx.a(new ejxr() { // from class: aloa
            @Override // defpackage.ejxr
            public final Object get() {
                Function function2 = function;
                alqm alqmVar2 = alqmVar;
                Object objApply = function2.apply(alqmVar2);
                Double d = (Double) dfog.o().a.ad.a();
                double dDoubleValue = d.doubleValue();
                if (dDoubleValue < 1.0d) {
                    if (dDoubleValue <= 0.0d) {
                        ((eksl) alpa.a.o().h("com/google/android/apps/messaging/shared/api/messaging/identity/CsMessagingIdentityFactoryV2ShadowImpl", "shouldDoShadowAnalysis", 269, "CsMessagingIdentityFactoryV2ShadowImpl.java")).q("CsMessagingIdentityFactoryV2ShadowImpl not logging because ratio=0%");
                        return objApply;
                    }
                    if (ThreadLocalRandom.current().nextDouble() >= dDoubleValue) {
                        ((eksl) alpa.a.o().h("com/google/android/apps/messaging/shared/api/messaging/identity/CsMessagingIdentityFactoryV2ShadowImpl", "shouldDoShadowAnalysis", 276, "CsMessagingIdentityFactoryV2ShadowImpl.java")).t("CsMessagingIdentityFactoryV2ShadowImpl not logging (ratio=%s%%)", d);
                        return objApply;
                    }
                }
                alqm alqmVar3 = (alqm) ejxrVar.get();
                Object objApply2 = function2.apply(alqmVar3);
                if (Objects.equals(objApply, objApply2)) {
                    ((eksl) alpa.a.o().h("com/google/android/apps/messaging/shared/api/messaging/identity/CsMessagingIdentityFactoryV2ShadowImpl", "shadowGet", 253, "CsMessagingIdentityFactoryV2ShadowImpl.java")).t("CsMessagingIdentityFactoryV2ShadowImpl not logging because both returned %s", objApply);
                    return objApply;
                }
                final alpa alpaVar = this.a;
                String strValueOf = String.valueOf(objApply);
                String strValueOf2 = String.valueOf(objApply2);
                awch awchVarA = ((awci) alpaVar.d.b()).a();
                List listM = ((crny) alpaVar.e.b()).m();
                Stream map = Collection.EL.stream(listM).map(new Function() { // from class: alou
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function3) {
                        return Function$CC.$default$andThen(this, function3);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return alpaVar.m(((crof) obj).p());
                    }

                    public final /* synthetic */ Function compose(Function function3) {
                        return Function$CC.$default$compose(this, function3);
                    }
                });
                int i = ekgb.d;
                Collector collector = ekcv.a;
                ekgb ekgbVar = (ekgb) map.collect(collector);
                ekgb ekgbVar2 = (ekgb) Collection.EL.stream(listM).map(new Function() { // from class: alov
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function3) {
                        return Function$CC.$default$andThen(this, function3);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return alpaVar.m(((crof) obj).s());
                    }

                    public final /* synthetic */ Function compose(Function function3) {
                        return Function$CC.$default$compose(this, function3);
                    }
                }).collect(collector);
                Locale localeC = craf.c(alpaVar.b);
                String upperCase = localeC != null ? localeC.getCountry().toUpperCase(localeC) : "";
                Throwable th2 = th;
                String str2 = str;
                String strB = ((crnb) alpaVar.f.b()).b();
                crnc crncVarM = alpaVar.m(((crmx) alpaVar.g.b()).r());
                eksl ekslVar = (eksl) alpa.a.j();
                ekslVar.V(2, TimeUnit.SECONDS);
                eksl ekslVar2 = (eksl) ekslVar.g(th2);
                ekslVar2.Z(eksk.SMALL);
                eksl ekslVar3 = (eksl) ekslVar2.h("com/google/android/apps/messaging/shared/api/messaging/identity/CsMessagingIdentityFactoryV2ShadowImpl", "logMiDifference", 313, "CsMessagingIdentityFactoryV2ShadowImpl.java");
                esvg esvgVar = esvg.CONFIRMED_UPLOAD_SAFE_USER_DATA;
                ekslVar3.O("MessagingIdentityV2#%s has different result than MessagingIdentityV1: v2{getter=[%s], raw=[%s], local=[%s], country=[%s], type=[%s]}.  v1{getter=[%s], raw=[%s], local=[%s], country=[%s], type=[%s]}.  localeCountryCode=[%s], networkCountryCodeDeprecated=[%s], simCountryCodes=[%s], networkCountryCodes=[%s], settingsCountryCode=[%s]", new esvh(esvgVar, str2), alpa.q(awchVarA, strValueOf2), alpa.q(awchVarA, alqmVar3.n()), alpa.q(awchVarA, alqmVar3.j()), alpa.o(awchVarA, (crnc) alqmVar3.f().orElse(null)), new esvh(esvgVar, alqmVar3.a().name()), alpa.q(awchVarA, strValueOf), alpa.q(awchVarA, alqmVar2.n()), alpa.q(awchVarA, alqmVar2.j()), alpa.o(awchVarA, (crnc) alqmVar2.f().orElse(null)), new esvh(esvgVar, alqmVar2.a().name()), alpa.r(awchVarA, upperCase), alpa.r(awchVarA, strB), alpa.p(awchVarA, ekgbVar2), alpa.p(awchVarA, ekgbVar), alpa.o(awchVarA, crncVarM));
                return objApply;
            }
        });
    }
}
