package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Collection;
import j$.util.Iterator$EL;
import j$.util.function.Consumer$CC;
import j$.util.stream.Collectors;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class barn {
    public static final ConversationIdType a = new ConversationIdType(-1);

    public static long a(ConversationIdType conversationIdType) {
        if (conversationIdType == null) {
            return -1L;
        }
        return conversationIdType.a;
    }

    public static ConversationIdType b(String str) {
        if (str != null) {
            try {
                return new ConversationIdType(Long.parseLong(str));
            } catch (Exception unused) {
            }
        }
        return a;
    }

    public static ekgb c(Iterable iterable) {
        int i = ekgb.d;
        final ekfw ekfwVar = new ekfw();
        Iterator$EL.forEachRemaining(iterable.iterator(), new Consumer() { // from class: barm
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ekfwVar.h(barn.b((String) obj));
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return ekfwVar.g();
    }

    public static ekgb d(Collection collection) {
        return ekgb.n((Collection) Collection.EL.stream(collection).map(new bari()).collect(Collectors.toCollection(new barj())));
    }

    public static ekgb e(List list) {
        return ekgb.n((java.util.Collection) Collection.EL.stream(list).map(new bari()).collect(Collectors.toCollection(new barj())));
    }
}
