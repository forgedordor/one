package defpackage;

import androidx.core.graphics.drawable.IconCompat;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public abstract class cghn {
    public static cghm l() {
        cggj cggjVar = new cggj();
        cggjVar.g(Optional.empty());
        cggjVar.e = Optional.empty();
        cggjVar.d = Optional.empty();
        cggjVar.f = Optional.empty();
        return cggjVar;
    }

    public abstract int a();

    public abstract IconCompat b();

    public abstract ConversationId c();

    public abstract ConversationIdType d();

    public abstract Optional e();

    public abstract Optional f();

    public abstract Optional g();

    public abstract Optional h();

    public abstract String i();

    public abstract String j();

    public abstract boolean k();
}
