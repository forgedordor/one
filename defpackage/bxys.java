package defpackage;

import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxys implements anbf {
    private final ancj a;

    public bxys(final dqsn dqsnVar, anch anchVar) {
        String[] strArr = bqsm.a;
        bqsh bqshVar = new bqsh(bqsm.a);
        bqshVar.A("MessageStarChangeObserver");
        bqshVar.d(new Function() { // from class: bxyp
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bqrv bqrvVar = (bqrv) obj;
                return new bqrw[]{bqrvVar.a, bqrvVar.b};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        this.a = anchVar.a("MessageStarChangeObserver", bqshVar.b(), new anci() { // from class: bxyq
            @Override // defpackage.anci
            public final Object a(final Consumer consumer) {
                return new bxzd(dqsnVar, new Consumer() { // from class: bxyr
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        consumer.z((ekgb) obj);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                        return Consumer$CC.$default$andThen(this, consumer2);
                    }
                });
            }
        });
    }

    @Override // defpackage.anbf
    public final anbe a() {
        return this.a.a();
    }

    @Override // defpackage.anbf
    public final cquc b(ajmg ajmgVar) {
        return this.a.b(ajmgVar);
    }
}
