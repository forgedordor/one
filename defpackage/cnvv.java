package defpackage;

import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnvv {
    public final awlc a;
    public final awlc b;
    public final fdjx c;

    public cnvv(awlc awlcVar, awlc awlcVar2, fdjx fdjxVar) {
        awlcVar.getClass();
        awlcVar2.getClass();
        fdjxVar.getClass();
        this.a = awlcVar;
        this.b = awlcVar2;
        this.c = fdjxVar;
    }

    public final void a(awlc awlcVar, final fdap fdapVar) {
        awlcVar.a(new Function() { // from class: cnvt
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                obj.getClass();
                return auvw.c(this.a.c, fcyi.a, fdjz.a, new cnvu(fdapVar, obj, null));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    public final void b() {
        this.a.d(new Consumer() { // from class: cnvm
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                cnvl cnvlVar = (cnvl) obj;
                cnvlVar.getClass();
                cnvlVar.a();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final void c(final cnvk cnvkVar) {
        cnvkVar.getClass();
        Consumer consumer = new Consumer() { // from class: cnvo
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                cnvl cnvlVar = (cnvl) obj;
                cnvlVar.getClass();
                cnvlVar.b();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                return Consumer$CC.$default$andThen(this, consumer2);
            }
        };
        awlc awlcVar = this.a;
        awlcVar.d(consumer);
        a(awlcVar, new fdap() { // from class: cnvp
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                cnvl cnvlVar = (cnvl) obj;
                cnvlVar.getClass();
                cnvlVar.e();
                return fctx.a;
            }
        });
        a(this.b, new fdap() { // from class: cnvq
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                cmqg cmqgVar = (cmqg) obj;
                cmqgVar.getClass();
                cnyz cnyzVar = cnvkVar.a.c;
                if (cnyzVar == null) {
                    cnyzVar = cnyz.a;
                }
                cnyzVar.getClass();
                cmqgVar.b(cobt.e(cnyzVar));
                return fctx.a;
            }
        });
    }
}
