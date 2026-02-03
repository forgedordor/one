package defpackage;

import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfsh extends eyix {
    private final eyir b;
    private final eyir c;
    private final eyir d;

    public dfsh(eyik eyikVar, eyik eyikVar2, eyir eyirVar, eyir eyirVar2, eyir eyirVar3) {
        super(eyikVar2, new eyji(dfsh.class), eyikVar);
        this.b = eyje.c(eyirVar);
        this.c = eyje.c(eyirVar2);
        this.d = eyje.c(eyirVar3);
    }

    @Override // defpackage.eyix
    public final /* bridge */ /* synthetic */ ListenableFuture b(Object obj) {
        List list = (List) obj;
        final Conversation conversation = (Conversation) list.get(0);
        Optional optional = (Optional) list.get(1);
        final dfuv dfuvVar = (dfuv) list.get(2);
        dfny dfnyVar = dfsd.a;
        return eork.i(optional.map(new Function() { // from class: dfsc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                dgyx dgyxVar = (dgyx) obj2;
                dfny dfnyVar2 = dfsd.a;
                try {
                    return dfuvVar.d(conversation, dgyxVar);
                } catch (IOException e) {
                    throw new IllegalArgumentException("Error converting Instant message to Message", e);
                }
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }));
    }

    @Override // defpackage.eyix
    protected final ListenableFuture c() {
        eyir eyirVar = this.d;
        return eork.f(this.b.d(), this.c.d(), eyirVar.d());
    }
}
