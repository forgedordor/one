package defpackage;

import com.google.android.rcs.client.messaging.data.ContentType;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.AbstractMap;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efpo extends efop {
    @Override // defpackage.efop
    public final void c(ContentType contentType, cjgk cjgkVar) {
        cjgkVar.a((Iterable) Collection.EL.stream(contentType.a().entrySet()).map(new Function() { // from class: efpm
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
        }).collect(Collectors.toList()));
    }

    @Override // defpackage.efop
    public final void d(cjgl cjglVar, efil efilVar) {
        efilVar.h(ekgp.i((Iterable) Collection.EL.stream(cjglVar.e).map(new Function() { // from class: efpn
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cjgn cjgnVar = (cjgn) obj;
                String str = cjgnVar.c;
                String str2 = cjgnVar.d;
                str.getClass();
                str2.getClass();
                return new AbstractMap.SimpleImmutableEntry(str, str2);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toList())));
    }
}
