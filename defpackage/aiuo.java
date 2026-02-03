package defpackage;

import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aiuo {
    private Optional c = Optional.empty();
    public int b = 1;
    public Optional a = Optional.empty();

    public final elyy a() {
        final elyw elywVar = (elyw) elyy.a.createBuilder();
        int i = this.b;
        elywVar.copyOnWrite();
        elyy elyyVar = (elyy) elywVar.instance;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        elyyVar.d = i2;
        elyyVar.b |= 2;
        this.a.ifPresent(new Consumer() { // from class: aium
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                String strA = cqck.a((String) obj);
                elyw elywVar2 = elywVar;
                elywVar2.copyOnWrite();
                elyy elyyVar2 = (elyy) elywVar2.instance;
                elyy elyyVar3 = elyy.a;
                strA.getClass();
                elyyVar2.b |= 4;
                elyyVar2.e = strA;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        this.c.ifPresent(new Consumer() { // from class: aiun
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                String strA = cqck.a((String) obj);
                elyw elywVar2 = elywVar;
                elywVar2.copyOnWrite();
                elyy elyyVar2 = (elyy) elywVar2.instance;
                elyy elyyVar3 = elyy.a;
                strA.getClass();
                elyyVar2.b |= 1;
                elyyVar2.c = strA;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return (elyy) elywVar.build();
    }

    public final void b(String str) {
        this.c = Optional.of(str);
    }
}
