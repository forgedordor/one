package defpackage;

import android.content.Context;
import j$.time.Duration;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abdc implements eyif {
    /* JADX WARN: Type inference failed for: r7v2, types: [cfgy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [cfgy, java.lang.Object] */
    public static cfze a(final efwo efwoVar, Context context, final ceql ceqlVar, ceff ceffVar, Optional optional, Optional optional2, Optional optional3, Optional optional4, final fcsu fcsuVar, eosc eoscVar) {
        efwoVar.getClass();
        context.getClass();
        ceqlVar.getClass();
        ceffVar.getClass();
        optional4.getClass();
        fcsuVar.getClass();
        eoscVar.getClass();
        if (((Boolean) cdip.a.e()).booleanValue()) {
            fcsu fcsuVar2 = new fcsu() { // from class: abcw
                @Override // defpackage.fcsu
                public final Object b() {
                    return ceqlVar;
                }
            };
            Object obj = optional.get();
            ?? r7 = optional2.get();
            Object obj2 = optional3.get();
            final fdap fdapVar = new fdap() { // from class: abcx
                @Override // defpackage.fdap
                public final Object invoke(Object obj3) {
                    ceov ceovVar = (ceov) obj3;
                    ahji ahjiVar = (ahji) fcsuVar.b();
                    ceovVar.getClass();
                    ahjq ahjqVar = ahjiVar.a;
                    ahkn ahknVar = ahjqVar.a;
                    ahjr ahjrVar = ahjqVar.b;
                    ahnh ahnhVar = ahknVar.a;
                    return Optional.of(new cfiq(efwoVar, ceovVar, ahnhVar.pG, ahjrVar.bZ, ahnhVar.oQ));
                }
            };
            Optional optionalFlatMap = optional4.flatMap(new Function() { // from class: abcy
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj3) {
                    return fdapVar.invoke(obj3);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            Duration duration = cfgy.a;
            Duration durationOfSeconds = Duration.ofSeconds(((Number) cefs.m.e()).intValue());
            Object objE = cefs.n.e();
            objE.getClass();
            int iIntValue = ((Number) objE).intValue();
            Object objE2 = cefs.o.e();
            objE2.getClass();
            return new cfze(context, fcsuVar2, (cfrx) obj, r7, (cfpl) obj2, eoscVar, ceffVar, 5, optionalFlatMap, duration, durationOfSeconds, iIntValue, ((Number) objE2).intValue(), false, true, true);
        }
        fcsu fcsuVar3 = new fcsu() { // from class: abcz
            @Override // defpackage.fcsu
            public final Object b() {
                return ceqlVar;
            }
        };
        Object obj3 = optional.get();
        ?? r8 = optional2.get();
        Object obj4 = optional3.get();
        final fdap fdapVar2 = new fdap() { // from class: abda
            @Override // defpackage.fdap
            public final Object invoke(Object obj5) {
                return Optional.of(new ceot((ceov) obj5));
            }
        };
        Optional optionalFlatMap2 = optional4.flatMap(new Function() { // from class: abdb
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj5) {
                return fdapVar2.invoke(obj5);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        Duration duration2 = cfgy.a;
        Duration durationOfSeconds2 = Duration.ofSeconds(((Number) cefs.m.e()).intValue());
        Object objE3 = cefs.n.e();
        objE3.getClass();
        int iIntValue2 = ((Number) objE3).intValue();
        Object objE4 = cefs.o.e();
        objE4.getClass();
        return new cfze(context, fcsuVar3, (cfrx) obj3, r8, (cfpl) obj4, eoscVar, ceffVar, 5, optionalFlatMap2, duration2, durationOfSeconds2, iIntValue2, ((Number) objE4).intValue(), false, true, true);
    }

    @Override // defpackage.fcsu
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
