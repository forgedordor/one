package defpackage;

import j$.lang.Iterable$EL;
import j$.util.function.Consumer$CC;
import java.util.Set;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clcz {
    public final fcsu a;

    public clcz(fcsu fcsuVar) {
        this.a = fcsuVar;
    }

    public final void a(final cldb cldbVar) {
        Iterable$EL.forEach((Set) this.a.b(), new Consumer() { // from class: clcy
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                final clcj clcjVar = (clcj) obj;
                final cldb cldbVar2 = cldbVar;
                auvh.h(eijx.f(new Runnable() { // from class: clch
                    @Override // java.lang.Runnable
                    public final void run() {
                        clcjVar.a(cldbVar2);
                    }
                }, clcjVar.a));
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final void b(final cldb cldbVar, final boolean z) {
        Iterable$EL.forEach((Set) this.a.b(), new Consumer() { // from class: clcx
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                final clcj clcjVar = (clcj) obj;
                if (z) {
                    return;
                }
                final cldb cldbVar2 = cldbVar;
                auvh.h(eijx.f(new Runnable() { // from class: clci
                    @Override // java.lang.Runnable
                    public final void run() {
                        clcjVar.a(cldbVar2);
                    }
                }, clcjVar.a));
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }
}
