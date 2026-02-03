package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aoko extends egxm {
    private final anqw a;

    public aoko(aokp aokpVar, anqw anqwVar) {
        super(aokpVar.b, "ContentObserverManager notified", aokpVar.c);
        this.a = anqwVar;
    }

    @Override // defpackage.egxm
    public final void a(final Uri uri) {
        final antf antfVar = this.a.a;
        antfVar.c.c(new Supplier() { // from class: anrr
            @Override // java.util.function.Supplier
            public final Object get() {
                Uri uri2 = uri;
                if (uri2 != null) {
                    if (uri2.getPathSegments().size() == bace.h(antfVar.a).getPathSegments().size() + 1) {
                        return Optional.ofNullable(barn.b(uri2.getLastPathSegment())).map(new Function() { // from class: anst
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                return new BugleConversationId((ConversationIdType) obj);
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                    }
                }
                return Optional.empty();
            }
        }, "ConversationParticipantsChanged");
    }
}
