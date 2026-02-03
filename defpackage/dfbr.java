package defpackage;

import j$.util.function.Consumer$CC;
import java.util.Locale;
import java.util.Set;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfbr implements dfap {
    final dzzh a;

    public dfbr(dzzh dzzhVar) {
        this.a = dzzhVar;
    }

    @Override // defpackage.dfap
    public final Object a() {
        dfbs.x.ifPresent(new Consumer() { // from class: dfbq
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((Set) obj).add(this.a.a.d());
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return this.a.b();
    }

    @Override // defpackage.dfap
    public final String b() {
        return this.a.d();
    }

    public final String toString() {
        return String.format(Locale.US, "%s=%s", b(), a());
    }
}
