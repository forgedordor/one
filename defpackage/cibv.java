package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
abstract class cibv {
    public static ekgb e(ekgb ekgbVar) {
        Stream map = Collection.EL.stream(ekgbVar).map(new Function() { // from class: cibt
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                final bojh bojhVar = (bojh) obj;
                bojhVar.getClass();
                return new ciae(new ejxr() { // from class: cibw
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return bojhVar.C();
                    }
                }, cnqk.a(bojhVar.N()));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = ekgb.d;
        return (ekgb) map.collect(ekcv.a);
    }

    public abstract ekgb a();

    public abstract Optional b();

    public abstract Optional c();

    public abstract Optional d();
}
