package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.function.Function$CC;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anes {
    public final ancj a;
    private final bsjc b;

    public anes(final dqsn dqsnVar, anch anchVar) {
        dqsnVar.getClass();
        anchVar.getClass();
        bsje bsjeVarC = PartsTable.c();
        bsjeVarC.A("MessagePartsChangeObserver");
        bsjeVarC.e(new Function() { // from class: aneq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsgr bsgrVar = (bsgr) obj;
                fcww fcwwVar = new fcww((byte[]) null);
                fcwwVar.add(bsgrVar.a);
                fcwwVar.add(bsgrVar.b);
                fcwwVar.add(bsgrVar.f);
                fcwwVar.add(bsgrVar.e);
                fcwwVar.add(bsgrVar.w);
                fcwwVar.add(bsgrVar.v);
                fcwwVar.add(bsgrVar.S);
                fcwwVar.add(bsgrVar.V);
                fcwwVar.add(bsgrVar.o);
                fcwwVar.add(bsgrVar.Y);
                if (crtr.e()) {
                    fcwwVar.add(bsgrVar.Z);
                }
                bsgs[] bsgsVarArr = (bsgs[]) fcva.a(fcwwVar).toArray(new bsgs[0]);
                return (bsgs[]) Arrays.copyOf(bsgsVarArr, bsgsVarArr.length);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bsjc bsjcVarB = bsjeVarC.b();
        this.b = bsjcVarB;
        this.a = anchVar.a("SafeMessagePartsChangeObserver", bsjcVarB, new anci() { // from class: aner
            @Override // defpackage.anci
            public final Object a(final Consumer consumer) {
                return new aneo(dqsnVar, new fdap() { // from class: anep
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        ekgb ekgbVar = (ekgb) obj;
                        ekgbVar.getClass();
                        consumer.z(ekgbVar);
                        return fctx.a;
                    }
                });
            }
        });
    }
}
