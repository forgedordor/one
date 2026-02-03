package defpackage;

import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cebz implements cebp {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/mobileconfiguration/accessor/XmsConfigurationListener");

    @Override // defpackage.cebp
    public final eiju a(ekgb ekgbVar) {
        Stream map = Collection.EL.stream(ekgbVar).map(new Function() { // from class: ceby
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((cebg) obj).d();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = ekgb.d;
        ekgb ekgbVar2 = (ekgb) map.collect(ekcv.a);
        ekrw ekrwVarE = a.e();
        ekrwVarE.X(eksq.a, "Bugle");
        ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/mobileconfiguration/accessor/XmsConfigurationListener", "onNewConfig", 34, "XmsConfigurationListener.java")).t("XmsConfigurationListener: Xms flags configuration ids updated: %s", ekgbVar2);
        return eijx.e(null);
    }
}
