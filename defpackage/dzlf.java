package defpackage;

import androidx.car.app.model.Alert;
import j$.util.function.Predicate$CC;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dzlf {
    public static dzle n() {
        dzkw dzkwVar = new dzkw();
        dzkwVar.c(false);
        dzkwVar.d(false);
        dzkwVar.b(0);
        dzkwVar.g(false);
        dzkwVar.e(Alert.DURATION_SHOW_INDEFINITELY);
        dzkwVar.f = new Predicate() { // from class: dzld
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo538negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return true;
            }
        };
        return dzkwVar;
    }

    public abstract int a();

    public abstract int b();

    public abstract dzii c();

    public abstract dzok d();

    public abstract Long e();

    public abstract String f();

    public abstract String g();

    public abstract Predicate h();

    public abstract feeg i();

    public abstract feix j();

    public abstract boolean k();

    public abstract boolean l();

    public abstract boolean m();
}
