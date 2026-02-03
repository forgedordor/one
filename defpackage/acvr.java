package defpackage;

import android.view.View;
import com.google.android.apps.messaging.home.select.SelectedConversation;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acvr extends acwa {
    private final boolean a;
    private final SelectedConversation b;
    private final View c;
    private final MessageIdType d;
    private final bajg e;

    public acvr(boolean z, SelectedConversation selectedConversation, View view, MessageIdType messageIdType, bajg bajgVar) {
        this.a = z;
        this.b = selectedConversation;
        this.c = view;
        this.d = messageIdType;
        this.e = bajgVar;
    }

    @Override // defpackage.acwa
    public final View a() {
        return this.c;
    }

    @Override // defpackage.acwa
    public final SelectedConversation b() {
        return this.b;
    }

    @Override // defpackage.acwa
    public final bajg c() {
        return this.e;
    }

    @Override // defpackage.acwa
    public final MessageIdType d() {
        return this.d;
    }

    @Override // defpackage.acwa
    public final boolean e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof acwa) {
            acwa acwaVar = (acwa) obj;
            if (this.a == acwaVar.e() && this.b.equals(acwaVar.b()) && this.c.equals(acwaVar.a()) && this.d.equals(acwaVar.d()) && this.e.equals(acwaVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        bajg bajgVar = this.e;
        MessageIdType messageIdType = this.d;
        View view = this.c;
        return "ConversationClickEvent{isLongClick=" + this.a + ", selectedConversation=" + this.b.toString() + ", view=" + view.toString() + ", messageId=" + messageIdType.toString() + ", renderData=" + bajgVar.toString() + "}";
    }
}
