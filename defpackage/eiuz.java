package defpackage;

import j$.util.DesugarCollections;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eiuz implements eith {
    final List a;

    public eiuz(List list) {
        this.a = DesugarCollections.unmodifiableList(list);
    }

    @Override // defpackage.eith
    public final evvl a(Object obj) {
        final evvj evvjVar = (evvj) evvl.a.createBuilder();
        for (final eirl eirlVar : this.a) {
            ((Optional) eirlVar.c().apply(obj)).ifPresent(new Consumer() { // from class: eiuy
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj2) {
                    evvjVar.a(eirlVar.b(), (evwg) obj2);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        return (evvl) evvjVar.build();
    }
}
