package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anib implements anbf {
    private final btbn a;
    private final ancj b;

    public anib(final dqsn dqsnVar, anch anchVar) {
        dqsnVar.getClass();
        anchVar.getClass();
        btbo btboVarB = btbt.b();
        btboVarB.A("MessageDeliveryReportsChangeObserver");
        btboVarB.d(new Function() { // from class: anhy
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                btba btbaVar = (btba) obj;
                return new btbb[]{btbaVar.a, btbaVar.b, btbaVar.c, btbaVar.d, btbaVar.e, btbaVar.f};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        btbn btbnVarB = btboVarB.b();
        this.a = btbnVarB;
        this.b = anchVar.a("MessageDeliveryReportsChangeObserver", btbnVarB, new anci() { // from class: anhz
            @Override // defpackage.anci
            public final Object a(final Consumer consumer) {
                return new anim(dqsnVar, new fdap() { // from class: ania
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        ekgb ekgbVar = (ekgb) obj;
                        ekgbVar.getClass();
                        consumer.z(ekgbVar);
                        return fctx.a;
                    }
                });
            }
        });
    }

    @Override // defpackage.anbf
    public final anbe a() {
        return this.b.a();
    }

    @Override // defpackage.anbf
    public final cquc b(ajmg ajmgVar) {
        return this.b.b(ajmgVar);
    }
}
