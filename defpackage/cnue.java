package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.UUID;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnue {
    private final cnuj a;

    public cnue(cnuk cnukVar) {
        this.a = cnukVar.a(new BiConsumer() { // from class: cnud
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                enpu enpuVar = (enpu) obj;
                enpt enptVar = (enpt) obj2;
                enpuVar.copyOnWrite();
                enqw enqwVar = (enqw) enpuVar.instance;
                enqw enqwVar2 = enqw.a;
                enptVar.getClass();
                enqwVar.d = enptVar;
                enqwVar.c = 4;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        });
    }

    public final void a(UUID uuid, UUID uuid2, int i, int i2, int i3, int i4, int i5, ekgb ekgbVar) {
        cczi ccziVar = cnuj.a;
        if (true != ((Boolean) ccziVar.e()).booleanValue()) {
            i = -1;
        }
        if (true != ((Boolean) ccziVar.e()).booleanValue()) {
            i2 = -1;
        }
        if (true != ((Boolean) ccziVar.e()).booleanValue()) {
            i3 = -1;
        }
        if (true != ((Boolean) ccziVar.e()).booleanValue()) {
            i4 = -1;
        }
        if (true != ((Boolean) ccziVar.e()).booleanValue()) {
            i5 = -1;
        }
        enps enpsVar = (enps) enpt.a.createBuilder();
        evqs evqsVarA = cnru.a(uuid2);
        enpsVar.copyOnWrite();
        enpt enptVar = (enpt) enpsVar.instance;
        enptVar.b |= 1;
        enptVar.c = evqsVarA;
        enpsVar.copyOnWrite();
        enpt enptVar2 = (enpt) enpsVar.instance;
        enptVar2.b |= 2;
        enptVar2.d = i;
        enpsVar.copyOnWrite();
        enpt enptVar3 = (enpt) enpsVar.instance;
        enptVar3.b |= 4;
        enptVar3.e = i3;
        enpsVar.copyOnWrite();
        enpt enptVar4 = (enpt) enpsVar.instance;
        enptVar4.b |= 8;
        enptVar4.f = i4;
        enpsVar.copyOnWrite();
        enpt enptVar5 = (enpt) enpsVar.instance;
        enptVar5.b |= 32;
        enptVar5.h = i5;
        if (((Boolean) ((cczi) cnrt.h.get()).e()).booleanValue()) {
            long j = i2;
            enpsVar.copyOnWrite();
            enpt enptVar6 = (enpt) enpsVar.instance;
            enptVar6.b |= 16;
            enptVar6.g = j;
        }
        this.a.b(uuid, ekgbVar, (enpt) enpsVar.build());
    }
}
