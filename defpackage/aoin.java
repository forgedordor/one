package defpackage;

import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
@Deprecated
/* loaded from: classes6.dex */
public final class aoin {
    public final fcsu a;
    public final fcsu b;
    private final fcsu c;
    private final fcsu d;
    private final fcsu e;

    public aoin(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5) {
        this.d = fcsuVar4;
        this.a = fcsuVar;
        this.c = fcsuVar2;
        this.b = fcsuVar3;
        this.e = fcsuVar5;
    }

    public final Optional a(int i) {
        if (i == -1) {
            return Optional.empty();
        }
        if (!((aqsl) this.e.b()).a()) {
            return ((dghj) this.c.b()).g(i).map(new Function() { // from class: aoim
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    aoin aoinVar = this.a;
                    return ((alrj) aoinVar.b.b()).b(((asqx) aoinVar.a.b()).c(((dggk) obj).a));
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
        }
        Optional optionalOfNullable = Optional.ofNullable(((chtk) this.d.b()).a(i));
        final alrj alrjVar = (alrj) this.b.b();
        alrjVar.getClass();
        return optionalOfNullable.map(new Function() { // from class: aoil
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return alrjVar.b((aubq) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }
}
