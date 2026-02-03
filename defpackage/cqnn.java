package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqnn extends ekrz {
    private final Function e;

    public cqnn(Class cls, Function function) {
        super(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, cls, false);
        this.e = function;
    }

    @Override // defpackage.ekrz
    public final void a(Object obj, ekry ekryVar) {
        if (obj != null) {
            ekryVar.a(this.a, this.e.apply(obj));
        }
    }
}
