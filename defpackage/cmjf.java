package defpackage;

import android.content.Context;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.io.IOException;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmjf implements cmiv {
    public final fcsu a;
    private final Context b;
    private final fcsu c;
    private final fcsu d;
    private final fcsu e;
    private final fdjx f;

    public cmjf(Context context, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fdjx fdjxVar) {
        context.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fdjxVar.getClass();
        this.b = context;
        this.c = fcsuVar;
        this.a = fcsuVar2;
        this.d = fcsuVar3;
        this.e = fcsuVar4;
        this.f = fdjxVar;
    }

    @Override // defpackage.cmiv
    public final void a(Set set) throws IOException {
        set.getClass();
        eieu eieuVarH = eiiy.h("SimFlagLoader#handleSimLoaded");
        try {
            Context context = this.b;
            Stream stream = Collection.EL.stream(set);
            final fdap fdapVar = new fdap() { // from class: cmja
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    cmmh cmmhVar = (cmmh) obj;
                    cmmhVar.getClass();
                    String str = cmmhVar.k;
                    str.getClass();
                    boolean z = false;
                    if (str.length() != 0) {
                        String str2 = cmmhVar.l;
                        str2.getClass();
                        if (str2.length() != 0) {
                            String str3 = cmmhVar.c;
                            str3.getClass();
                            if (str3.length() != 0) {
                                z = true;
                            }
                        }
                    }
                    return Boolean.valueOf(z);
                }
            };
            Stream streamFilter = stream.filter(new Predicate() { // from class: cmjb
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
                    return ((Boolean) fdapVar.invoke(obj)).booleanValue();
                }
            });
            final fdap fdapVar2 = new fdap() { // from class: cmjc
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    cmmh cmmhVar = (cmmh) obj;
                    cmmhVar.getClass();
                    return cmmhVar.c;
                }
            };
            Stream map = streamFilter.map(new Function() { // from class: cmjd
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return fdapVar2.invoke(obj);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            int i = ekgb.d;
            ekgb ekgbVar = (ekgb) map.collect(ekcv.a);
            if (!ekgbVar.isEmpty()) {
                ((cebe) this.d.b()).a(ekgbVar);
            }
            Object objB = this.c.b();
            objB.getClass();
            ccyw ccywVar = (ccyw) objB;
            ekgbVar.getClass();
            Optional optionalH = ((cmlb) this.e.b()).h(cmla.a);
            final fdap fdapVar3 = new fdap() { // from class: cmiy
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    return ((cmmh) obj).c;
                }
            };
            if (ekgbVar.contains(optionalH.map(new Function() { // from class: cmiz
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return fdapVar3.invoke(obj);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).orElse(""))) {
                ccywVar.b(context, crsd.PHENOTYPE_REGISTRATION_TRIGGER_SIM_CHANGE);
            }
            auvw.k(this.f, null, null, new cmje(this, null), 3);
            fczl.a(eieuVarH, null);
        } finally {
        }
    }

    @Override // defpackage.cmiv
    public final /* synthetic */ void b(Set set) {
    }
}
