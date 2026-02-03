package defpackage;

import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cbbh {
    final /* synthetic */ cbbj a;
    private final cazg b;
    private final Long[] c;
    private final cbcw d;

    public cbbh(cbbj cbbjVar, cazg cazgVar, Long[] lArr, cbcw cbcwVar) {
        this.a = cbbjVar;
        this.b = cazgVar;
        this.c = lArr;
        this.d = cbcwVar;
    }

    public final String toString() {
        String str = (String) DesugarArrays.stream(this.c).map(new Function() { // from class: cbbg
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return String.valueOf((Long) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.joining(","));
        String strD = this.a.c.d(this.b);
        if (strD == null) {
            strD = "?";
        }
        Object obj = this.d;
        if (obj == null) {
            obj = "";
        }
        return strD + " [" + str + "] " + obj.toString();
    }
}
