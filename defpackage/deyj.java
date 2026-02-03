package defpackage;

import android.content.Context;
import j$.util.function.Function$CC;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class deyj extends deys {
    public static final /* synthetic */ int b = 0;

    public deyj(dfxx dfxxVar, dhes dhesVar, emko emkoVar, eosc eoscVar, dexw dexwVar) {
        super(dfxxVar, dhesVar, emkoVar, eoscVar, dexwVar);
    }

    public final void d(final Context context, final int i) {
        L(new Callable() { // from class: deyf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ewlw ewlwVar = (ewlw) ewlx.a.createBuilder();
                ewlz ewlzVar = (ewlz) ewma.a.createBuilder();
                ewlzVar.copyOnWrite();
                ewma ewmaVar = (ewma) ewlzVar.instance;
                ewmaVar.c = i - 1;
                ewmaVar.b |= 1;
                ewlwVar.copyOnWrite();
                ewlx ewlxVar = (ewlx) ewlwVar.instance;
                ewma ewmaVar2 = (ewma) ewlzVar.build();
                ewmaVar2.getClass();
                ewlxVar.c = ewmaVar2;
                ewlxVar.b = 3;
                this.a.B(context, (ewlx) ewlwVar.build());
                return null;
            }
        }, new Function() { // from class: deyg
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                int i2 = deyj.b;
                dhja.i((Throwable) obj, "Fail to log platformBindingEvent %d", Integer.valueOf(i - 1));
                return null;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }
}
