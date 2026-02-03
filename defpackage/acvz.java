package defpackage;

import android.view.View;
import com.google.android.apps.messaging.home.select.SelectedConversation;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acvz implements einb {
    public final View a;
    public final SelectedConversation b;

    public acvz(View view, SelectedConversation selectedConversation) {
        this.a = view;
        this.b = selectedConversation;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof acvz)) {
            return false;
        }
        acvz acvzVar = (acvz) obj;
        return fdbq.f(this.a, acvzVar.a) && fdbq.f(this.b, acvzVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ConversationAvatarClickEvent(view=" + this.a + ", selectedConversation=" + this.b + ")";
    }
}
