package defpackage;

import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final /* synthetic */ class cdfd {
    public static ekgb a(Map map) {
        Stream map2 = Collection.EL.stream(map.entrySet()).map(new Function() { // from class: cdfc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Map.Entry entry = (Map.Entry) obj;
                cdew cdewVar = new cdew();
                cdewVar.b((String) entry.getKey());
                cdewVar.c((String) entry.getValue());
                return cdewVar.a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = ekgb.d;
        return (ekgb) map2.collect(ekcv.a);
    }

    public static eiju b() {
        return eijx.e("");
    }

    public static eiju c() {
        return eijx.e(new ArrayList());
    }

    public static eiju d() {
        return eijx.e(new ArrayList());
    }
}
