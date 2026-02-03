package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.UUID;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnvb {
    public final cnuj a;
    public final cnuj b;
    public final cnuj c;
    public final cnuj d;
    private final cnuj e;
    private final cnuj f;
    private final cnuj g;

    public cnvb(cnuk cnukVar) {
        this.a = cnukVar.a(new BiConsumer() { // from class: cnuu
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                enpu enpuVar = (enpu) obj;
                enpy enpyVar = (enpy) obj2;
                enpuVar.copyOnWrite();
                enqw enqwVar = (enqw) enpuVar.instance;
                enqw enqwVar2 = enqw.a;
                enpyVar.getClass();
                enqwVar.d = enpyVar;
                enqwVar.c = 8;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        });
        this.e = cnukVar.a(new BiConsumer() { // from class: cnuv
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                enpu enpuVar = (enpu) obj;
                enqk enqkVar = (enqk) obj2;
                enpuVar.copyOnWrite();
                enqw enqwVar = (enqw) enpuVar.instance;
                enqw enqwVar2 = enqw.a;
                enqkVar.getClass();
                enqwVar.d = enqkVar;
                enqwVar.c = 9;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        });
        this.b = cnukVar.a(new BiConsumer() { // from class: cnuw
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                enpu enpuVar = (enpu) obj;
                enqv enqvVar = (enqv) obj2;
                enpuVar.copyOnWrite();
                enqw enqwVar = (enqw) enpuVar.instance;
                enqw enqwVar2 = enqw.a;
                enqvVar.getClass();
                enqwVar.d = enqvVar;
                enqwVar.c = 10;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        });
        this.f = cnukVar.a(new BiConsumer() { // from class: cnux
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                enpu enpuVar = (enpu) obj;
                enqf enqfVar = (enqf) obj2;
                enpuVar.copyOnWrite();
                enqw enqwVar = (enqw) enpuVar.instance;
                enqw enqwVar2 = enqw.a;
                enqfVar.getClass();
                enqwVar.d = enqfVar;
                enqwVar.c = 13;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        });
        this.c = cnukVar.a(new BiConsumer() { // from class: cnuy
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                enpu enpuVar = (enpu) obj;
                enqh enqhVar = (enqh) obj2;
                enpuVar.copyOnWrite();
                enqw enqwVar = (enqw) enpuVar.instance;
                enqw enqwVar2 = enqw.a;
                enqhVar.getClass();
                enqwVar.d = enqhVar;
                enqwVar.c = 11;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        });
        this.d = cnukVar.a(new BiConsumer() { // from class: cnuz
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                enpu enpuVar = (enpu) obj;
                enqt enqtVar = (enqt) obj2;
                enpuVar.copyOnWrite();
                enqw enqwVar = (enqw) enpuVar.instance;
                enqw enqwVar2 = enqw.a;
                enqtVar.getClass();
                enqwVar.d = enqtVar;
                enqwVar.c = 12;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        });
        this.g = cnukVar.a(new BiConsumer() { // from class: cnva
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                enpu enpuVar = (enpu) obj;
                enpw enpwVar = (enpw) obj2;
                enpuVar.copyOnWrite();
                enqw enqwVar = (enqw) enpuVar.instance;
                enqw enqwVar2 = enqw.a;
                enpwVar.getClass();
                enqwVar.d = enpwVar;
                enqwVar.c = 14;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        });
    }

    public final void a(UUID uuid, ekgb ekgbVar) {
        this.g.b(uuid, ekgbVar, enpw.a);
    }

    public final void b(UUID uuid, enqm enqmVar) {
        this.f.b(uuid, ekgb.r(enqmVar), enqf.a);
    }

    public final void c(UUID uuid, UUID uuid2, int i, boolean z) {
        enqi enqiVar = (enqi) enqk.a.createBuilder();
        enqiVar.copyOnWrite();
        enqk enqkVar = (enqk) enqiVar.instance;
        enqkVar.b |= 2;
        enqkVar.d = z;
        enqiVar.copyOnWrite();
        enqk enqkVar2 = (enqk) enqiVar.instance;
        enqkVar2.b |= 4;
        enqkVar2.e = i == 8;
        enqiVar.copyOnWrite();
        enqk enqkVar3 = (enqk) enqiVar.instance;
        enqkVar3.f = i - 1;
        enqkVar3.b |= 8;
        if (uuid2 != null) {
            evqs evqsVarA = cnru.a(uuid2);
            enqiVar.copyOnWrite();
            enqk enqkVar4 = (enqk) enqiVar.instance;
            enqkVar4.b |= 1;
            enqkVar4.c = evqsVarA;
        }
        cnuj cnujVar = this.e;
        int i2 = ekgb.d;
        cnujVar.b(uuid, ekoe.a, (enqk) enqiVar.build());
    }
}
