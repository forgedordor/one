package defpackage;

import j$.time.Duration;
import j$.time.Instant;
import j$.util.function.BiConsumer$CC;
import java.util.UUID;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnup {
    public final cnuj a;

    public cnup(cnuk cnukVar) {
        this.a = cnukVar.a(new BiConsumer() { // from class: cnuo
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                enpu enpuVar = (enpu) obj;
                enqa enqaVar = (enqa) obj2;
                enpuVar.copyOnWrite();
                enqw enqwVar = (enqw) enpuVar.instance;
                enqw enqwVar2 = enqw.a;
                enqaVar.getClass();
                enqwVar.d = enqaVar;
                enqwVar.c = 6;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        });
    }

    public final void a(UUID uuid, Instant instant, Instant instant2, Instant instant3, long j, ekgb ekgbVar) {
        Duration durationBetween = Duration.between(instant, instant3);
        enpz enpzVar = (enpz) enqa.a.createBuilder();
        enpzVar.copyOnWrite();
        enqa enqaVar = (enqa) enpzVar.instance;
        enqaVar.b |= 1;
        enqaVar.c = j;
        evrj evrjVarA = evwz.a(durationBetween);
        enpzVar.copyOnWrite();
        enqa enqaVar2 = (enqa) enpzVar.instance;
        evrjVarA.getClass();
        enqaVar2.d = evrjVarA;
        enqaVar2.b |= 2;
        evrj evrjVarA2 = evwz.a(Duration.between(instant2, instant3));
        enpzVar.copyOnWrite();
        enqa enqaVar3 = (enqa) enpzVar.instance;
        evrjVarA2.getClass();
        enqaVar3.e = evrjVarA2;
        enqaVar3.b |= 4;
        this.a.b(uuid, ekgbVar, (enqa) enpzVar.build());
    }
}
