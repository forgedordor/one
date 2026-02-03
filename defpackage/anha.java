package defpackage;

import j$.util.function.Function$CC;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anha implements anbf {
    public final arxr a;
    private final bqkf b;
    private final ancj c;

    public anha(final dqsn dqsnVar, anch anchVar, arxr arxrVar) {
        dqsnVar.getClass();
        anchVar.getClass();
        this.a = arxrVar;
        bqkg bqkgVarA = bqkl.a();
        bqkgVarA.A("ReactionsChangeObserver");
        bqkgVarA.d(new Function() { // from class: angx
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bqjp bqjpVar = (bqjp) obj;
                return new bqjq[]{bqjpVar.b, bqjpVar.c, bqjpVar.g};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bqkf bqkfVarB = bqkgVarA.b();
        this.b = bqkfVarB;
        this.c = anchVar.a("ReactionsChangeObserver", bqkfVarB, new anci() { // from class: angy
            @Override // defpackage.anci
            public final Object a(final Consumer consumer) {
                return new anhh(dqsnVar, this.a, new fdap() { // from class: angz
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        List list = (List) obj;
                        list.getClass();
                        consumer.z(ekfv.a(list));
                        return fctx.a;
                    }
                });
            }
        });
    }

    @Override // defpackage.anbf
    public final anbe a() {
        return this.c.a();
    }

    @Override // defpackage.anbf
    public final cquc b(ajmg ajmgVar) {
        return this.c.b(ajmgVar);
    }
}
