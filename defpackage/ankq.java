package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ankq extends aivg {
    public ankq(fcsu fcsuVar, ankt anktVar, Executor executor) {
        super(fcsuVar, anktVar, executor);
    }

    @Override // defpackage.aivg
    public final BiConsumer a() {
        return new BiConsumer() { // from class: anko
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                enhr enhrVar = (enhr) obj;
                enhw enhwVar = (enhw) obj2;
                enhrVar.copyOnWrite();
                enhs enhsVar = (enhs) enhrVar.instance;
                enhs enhsVar2 = enhs.a;
                enhwVar.getClass();
                enhsVar.c = enhwVar;
                enhsVar.b = 1;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }

    public final void b(final int i, final ctho cthoVar) {
        k(new Supplier() { // from class: ankp
            @Override // java.util.function.Supplier
            public final Object get() {
                enhu enhuVar = (enhu) enhw.a.createBuilder();
                enhuVar.copyOnWrite();
                enhw enhwVar = (enhw) enhuVar.instance;
                int i2 = i;
                if (i2 == 0) {
                    throw null;
                }
                ctho cthoVar2 = cthoVar;
                enhwVar.c = i2 - 1;
                enhwVar.b |= 1;
                int i3 = cthoVar2.d;
                int i4 = 3;
                char c = i3 != 0 ? i3 != 1 ? i3 != 2 ? (char) 0 : (char) 4 : (char) 3 : (char) 2;
                if (c != 0 && c == 3) {
                    i4 = 2;
                }
                enhuVar.copyOnWrite();
                enhw enhwVar2 = (enhw) enhuVar.instance;
                enhwVar2.d = i4 - 1;
                enhwVar2.b |= 2;
                String str = cthoVar2.e;
                enhuVar.copyOnWrite();
                enhw enhwVar3 = (enhw) enhuVar.instance;
                str.getClass();
                enhwVar3.b = 4 | enhwVar3.b;
                enhwVar3.e = str;
                String str2 = cthoVar2.b;
                enhuVar.copyOnWrite();
                enhw enhwVar4 = (enhw) enhuVar.instance;
                str2.getClass();
                enhwVar4.b |= 8;
                enhwVar4.f = str2;
                return (enhw) enhuVar.build();
            }
        });
    }
}
