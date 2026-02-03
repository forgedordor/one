package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anfe implements anbf {
    private final bpxd a;
    private final ancj b;

    public anfe(final dqsn dqsnVar, anch anchVar) {
        dqsnVar.getClass();
        anchVar.getClass();
        bpxe bpxeVarB = bpxj.b();
        bpxeVarB.A("MessagePreviewChangeObserver");
        bpxeVarB.d(new Function() { // from class: anfc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bpwi bpwiVar = (bpwi) obj;
                return new bpwj[]{bpwiVar.a, bpwiVar.b, bpwiVar.d, bpwiVar.e, bpwiVar.f, bpwiVar.h, bpwiVar.g, bpwiVar.c, bpwiVar.j, bpwiVar.k};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bpxd bpxdVarB = bpxeVarB.b();
        this.a = bpxdVarB;
        this.b = anchVar.a("MessagePreviewChangeObserver", bpxdVarB, new anci() { // from class: anfd
            @Override // defpackage.anci
            public final Object a(final Consumer consumer) {
                return new anfp(dqsnVar, new fdap() { // from class: anfb
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
