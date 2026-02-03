package defpackage;

import j$.util.function.Consumer$CC;
import java.util.Locale;
import java.util.Set;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfoa implements dfny {
    public final dzzh a;

    protected dfoa(dzzh dzzhVar) {
        this.a = dzzhVar;
    }

    @Override // defpackage.dfny
    public final Object a() {
        dfoc.c.ifPresent(new Consumer() { // from class: dfnz
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((Set) obj).add(this.a.a.d());
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        try {
            return this.a.b();
        } catch (IllegalStateException | NullPointerException unused) {
            dzzh.f(((dfob) dfds.a(dfob.class)).v().a);
            return this.a.b();
        }
    }

    @Override // defpackage.dfny
    public final String b() {
        return this.a.d();
    }

    public final String toString() {
        return String.format(Locale.US, "%s: %s", b(), a());
    }
}
