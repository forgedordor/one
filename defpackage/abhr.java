package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abhr {
    public final eosc a;
    public final egbf b;
    public final egej c;
    public final eosc d;
    public final dyyv e;
    private final abfv f;

    public abhr(egbf egbfVar, eosc eoscVar, egej egejVar, dyyv dyyvVar, eosc eoscVar2, abfv abfvVar) {
        this.b = egbfVar;
        this.a = eoscVar;
        this.c = egejVar;
        this.e = dyyvVar;
        this.d = eoscVar2;
        this.f = abfvVar;
    }

    public final eiju a() {
        return this.f.d().i(new eooz() { // from class: abhh
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final abhr abhrVar = this.a;
                final egej egejVar = abhrVar.c;
                egejVar.getClass();
                return (ListenableFuture) ((Optional) obj).map(new Function() { // from class: abhi
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return egejVar.c((String) obj2);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).map(new Function() { // from class: abhj
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return eiju.g((ListenableFuture) obj2);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).map(new Function() { // from class: abhk
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return ((eiju) obj2).h(new ejvr() { // from class: abhn
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj3) {
                                return Optional.of((efwo) obj3);
                            }
                        }, abhrVar.d);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).orElse(eijx.e(Optional.empty()));
            }
        }, this.d);
    }
}
