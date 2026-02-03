package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final /* synthetic */ class ajtc implements Function {
    public final /* synthetic */ ajtf a;

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo536andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return this.a.K((ConversationId) obj);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
