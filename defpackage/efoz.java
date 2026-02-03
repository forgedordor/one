package defpackage;

import com.google.android.rcs.client.messaging.MessagingResult;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class efoz implements Function {
    @Override // java.util.function.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cjjb apply(MessagingResult messagingResult) {
        cjiy cjiyVar = (cjiy) cjjb.a.createBuilder();
        c(messagingResult, cjiyVar);
        b(messagingResult, cjiyVar);
        d(messagingResult, cjiyVar);
        e(messagingResult, cjiyVar);
        return (cjjb) cjiyVar.build();
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo536andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public abstract void b(MessagingResult messagingResult, cjiy cjiyVar);

    public abstract void c(MessagingResult messagingResult, cjiy cjiyVar);

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }

    public abstract void d(MessagingResult messagingResult, cjiy cjiyVar);

    public abstract void e(MessagingResult messagingResult, cjiy cjiyVar);
}
