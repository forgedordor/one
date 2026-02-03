package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aglq implements Function {
    final /* synthetic */ aukf a;
    final /* synthetic */ ConversationIdType b;

    public aglq(aukf aukfVar, ConversationIdType conversationIdType) {
        this.a = aukfVar;
        this.b = conversationIdType;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo536andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        bngy bngyVar = (bngy) obj;
        bngyVar.c(this.a);
        bngyVar.d(this.b);
        return bngyVar;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
