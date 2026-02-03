package defpackage;

import android.net.Uri;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cauc extends cayv {
    public final cmop a;
    public final cmqj b;
    private final eosc c;

    public cauc(eosc eoscVar, cmop cmopVar, cmqj cmqjVar) {
        this.c = eoscVar;
        this.a = cmopVar;
        this.b = cmqjVar;
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("DeleteMessageFromTelephonyHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return caue.a.getParserForType();
    }

    @Override // defpackage.cayv
    protected final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        final caue caueVar = (caue) evuhVar;
        return eijx.g(new Callable() { // from class: caub
            @Override // java.util.concurrent.Callable
            public final Object call() {
                caue caueVar2 = caueVar;
                List list = (List) Collection.EL.stream(caueVar2.c).map(new Function() { // from class: caty
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return Uri.parse((String) obj);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(Collectors.toCollection(new Supplier() { // from class: catz
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return new ArrayList();
                    }
                }));
                cauc caucVar = this.a;
                caucVar.b.ae(list);
                List<Uri> list2 = (List) Collection.EL.stream(caueVar2.b).map(new Function() { // from class: caua
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return Uri.parse((String) obj);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(Collectors.toCollection(new Supplier() { // from class: catz
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return new ArrayList();
                    }
                }));
                bxgi bxgiVarC = ((bxgj) caucVar.a.a.b()).c(1);
                for (Uri uri : list2) {
                    if (uri != null) {
                        cqca.l("Bugle", "Clearing cache for ".concat(uri.toString()));
                        bxgiVarC.e(uri.toString());
                    }
                }
                return cbcw.i();
            }
        }, this.c);
    }
}
