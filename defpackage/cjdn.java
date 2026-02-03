package defpackage;

import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjdn extends cjck {
    @Override // defpackage.cjck
    public final void c(cjgl cjglVar, aubv aubvVar) {
        aubvVar.a((Map) Collection.EL.stream(cjglVar.e).collect(ekcv.a(new Function() { // from class: cjdk
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((cjgn) obj).c;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: cjdl
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((cjgn) obj).d;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        })));
    }

    @Override // defpackage.cjck
    public final void d(aubx aubxVar, cjgk cjgkVar) {
        Stream map = Collection.EL.stream(DesugarCollections.unmodifiableMap(aubxVar.e).entrySet()).map(new Function() { // from class: cjdm
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Map.Entry entry = (Map.Entry) obj;
                cjgm cjgmVar = (cjgm) cjgn.a.createBuilder();
                String str = (String) entry.getKey();
                cjgmVar.copyOnWrite();
                cjgn cjgnVar = (cjgn) cjgmVar.instance;
                str.getClass();
                cjgnVar.b |= 1;
                cjgnVar.c = str;
                String str2 = (String) entry.getValue();
                cjgmVar.copyOnWrite();
                cjgn cjgnVar2 = (cjgn) cjgmVar.instance;
                str2.getClass();
                cjgnVar2.b |= 2;
                cjgnVar2.d = str2;
                return (cjgn) cjgmVar.build();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = ekgb.d;
        cjgkVar.a((Iterable) map.collect(ekcv.a));
    }
}
