package defpackage;

import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acsa implements eind {
    final /* synthetic */ acrt a;

    public acsa(acrt acrtVar) {
        this.a = acrtVar;
    }

    @Override // defpackage.eind
    public final /* bridge */ /* synthetic */ eine a(einb einbVar) {
        ((Optional) ((eyig) this.a.au).a).ifPresent(new Consumer() { // from class: acoq
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                throw null;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return eine.a;
    }
}
