package defpackage;

import com.google.android.rcs.client.messaging.RemoveUserFromGroupRequest;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.function.Function$CC;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfti extends eyix {
    private final eyir b;
    private final eyir c;
    private final eyir d;
    private final eyir e;

    public dfti(eyik eyikVar, eyik eyikVar2, eyir eyirVar, eyir eyirVar2, eyir eyirVar3, eyir eyirVar4) {
        super(eyikVar2, new eyji(dfti.class), eyikVar);
        this.b = eyje.c(eyirVar);
        this.c = eyje.c(eyirVar2);
        this.d = eyje.c(eyirVar3);
        this.e = eyje.c(eyirVar4);
    }

    @Override // defpackage.eyix
    public final /* bridge */ /* synthetic */ ListenableFuture b(Object obj) {
        List list = (List) obj;
        return !((RemoveUserFromGroupRequest) list.get(0)).c().a().equals(((dgrs) list.get(1)).k().map(new Function() { // from class: dftc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return ((dgiq) obj2).m();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).map(new Function() { // from class: dftd
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return ((dgis) obj2).x();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse("")) ? this.d.d() : this.c.d();
    }

    @Override // defpackage.eyix
    protected final ListenableFuture c() {
        return eork.f(this.b.d(), this.e.d());
    }
}
