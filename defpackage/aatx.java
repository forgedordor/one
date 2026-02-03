package defpackage;

import j$.util.Collection;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aatx implements eind {
    final /* synthetic */ aatv a;

    public aatx(aatv aatvVar) {
        this.a = aatvVar;
    }

    @Override // defpackage.eind
    public final /* bridge */ /* synthetic */ eine a(einb einbVar) {
        aauj aaujVar = this.a.p;
        aaujVar.getClass();
        final boolean zA = ((aate) einbVar).a();
        Collection.EL.stream(aaujVar.a).forEach(new Consumer() { // from class: aauc
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ((aauu) obj).d(zA);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        aaujVar.p();
        aaujVar.G();
        return eine.a;
    }
}
