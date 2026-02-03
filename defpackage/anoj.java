package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.function.Function$CC;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anoj {
    public static final Set a;
    private static final buys d;
    public final fcsu b;
    public final ancj c;

    static {
        String[] strArr = buyx.a;
        buyu buyuVar = new buyu(buyx.a);
        buyuVar.A("TombstoneUserReferenceObserver");
        buyuVar.c(new Function() { // from class: anob
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buyd buydVar = (buyd) obj;
                Set set = anoj.a;
                return new buye[]{buydVar.a, buydVar.b, buydVar.c};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        d = buyuVar.b();
        a = fcwm.d(Integer.valueOf(BasePaymentResult.ERROR_REQUEST_FAILED), Integer.valueOf(BasePaymentResult.ERROR_REQUEST_TIMEOUT), 225, 226, 227, 231);
    }

    public anoj(fcsu fcsuVar, fcsu fcsuVar2) {
        fcsuVar.getClass();
        this.b = fcsuVar;
        this.c = ((anch) fcsuVar2.b()).a("TombstoneUserReferenceObserver", d, new anci() { // from class: anoc
            @Override // defpackage.anci
            public final Object a(final Consumer consumer) {
                return new anoi(this.a, new fdap() { // from class: anoa
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        ekgb ekgbVar = (ekgb) obj;
                        Set set = anoj.a;
                        ekgbVar.getClass();
                        consumer.z(ekgbVar);
                        return fctx.a;
                    }
                });
            }
        });
    }
}
