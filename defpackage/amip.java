package defpackage;

import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amip implements anbf {
    private final bpzr a;
    private final ancj b;

    public amip(final dqsn dqsnVar, anch anchVar) {
        dqsnVar.getClass();
        anchVar.getClass();
        bpzs bpzsVarA = bpzx.a();
        bpzsVarA.A("MessageAnnotationChangeObserver");
        bpzr bpzrVarB = bpzsVarA.b();
        this.a = bpzrVarB;
        this.b = anchVar.a("MessageAnnotationChangeObserver", bpzrVarB, new anci() { // from class: amio
            @Override // defpackage.anci
            public final Object a(final Consumer consumer) {
                return new amja(dqsnVar, new fdap() { // from class: amin
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
