package defpackage;

import j$.util.Comparator;
import java.util.function.ToIntFunction;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eybz {
    public static final /* synthetic */ int a = 0;

    static {
        eybl eyblVar = (eybl) eybm.a.createBuilder();
        eyblVar.copyOnWrite();
        ((eybm) eyblVar.instance).b = 24;
        eyblVar.copyOnWrite();
        ((eybm) eyblVar.instance).c = 0;
        eyblVar.copyOnWrite();
        ((eybm) eyblVar.instance).d = 0;
        eyblVar.copyOnWrite();
        ((eybm) eyblVar.instance).e = 0;
        Comparator.EL.thenComparingInt(Comparator.EL.thenComparingInt(Comparator.EL.thenComparingInt(Comparator.CC.comparingInt(new ToIntFunction() { // from class: eybv
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                return ((eybm) obj).b;
            }
        }), new ToIntFunction() { // from class: eybw
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                return ((eybm) obj).c;
            }
        }), new ToIntFunction() { // from class: eybx
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                return ((eybm) obj).d;
            }
        }), new ToIntFunction() { // from class: eyby
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                return ((eybm) obj).e;
            }
        });
    }
}
