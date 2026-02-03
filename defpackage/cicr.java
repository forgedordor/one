package defpackage;

import com.google.android.ims.rcsservice.group.GroupInfo;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public abstract class cicr {
    public static final eksp w = eksp.c("BugleGroupManagement");

    public static cicq w() {
        ciai ciaiVar = new ciai();
        ciaiVar.v(0);
        ciaiVar.d = new cnqj();
        ciaiVar.o(false);
        ciaiVar.e = 1;
        ciaiVar.B(false);
        ciaiVar.i(ajsm.a);
        return ciaiVar;
    }

    static Optional x(cicr cicrVar) {
        ciaj ciajVar = (ciaj) cicrVar;
        Optional optional = ciajVar.f;
        return optional.isPresent() ? optional : ciajVar.e.flatMap(new Function() { // from class: cicn
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                eksp ekspVar = cicr.w;
                return Optional.ofNullable(((GroupInfo) obj).c);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    public abstract int a();

    public abstract ajsm b();

    public abstract cnqj c();

    public abstract Optional d();

    public abstract Optional e();

    public abstract Optional f();

    public abstract Optional g();

    public abstract Optional h();

    public abstract Optional i();

    public abstract Optional j();

    public abstract Optional k();

    public abstract Optional l();

    public abstract Optional m();

    public abstract Optional n();

    public abstract Optional o();

    public abstract Optional p();

    public abstract boolean q();

    public abstract boolean r();

    public abstract boolean s();

    public abstract boolean t();

    @Deprecated
    public abstract boolean u();

    public abstract int v();
}
