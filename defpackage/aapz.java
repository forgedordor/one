package defpackage;

import j$.util.Collection;
import j$.util.function.Consumer$CC;
import java.util.Set;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aapz implements aapx {
    private final Set a;

    public aapz(Set set) {
        this.a = set;
    }

    @Override // defpackage.aapx
    public final void b(final aapw aapwVar) {
        Collection.EL.stream(this.a).forEach(new Consumer() { // from class: aapy
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ((aaqa) obj).b(aapwVar);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }
}
