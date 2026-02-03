package defpackage;

import com.google.android.apps.messaging.home.select.SelectedConversation;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwvc extends cwvg {
    private final SelectedConversation a;
    private final elka b;

    public cwvc(SelectedConversation selectedConversation, elka elkaVar) {
        this.a = selectedConversation;
        if (elkaVar == null) {
            throw new NullPointerException("Null origin");
        }
        this.b = elkaVar;
    }

    @Override // defpackage.cwvg
    public final SelectedConversation a() {
        return this.a;
    }

    @Override // defpackage.cwvg
    public final elka b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cwvg) {
            cwvg cwvgVar = (cwvg) obj;
            if (this.a.equals(cwvgVar.a()) && this.b.equals(cwvgVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        elka elkaVar = this.b;
        return "ConversationDeleteEvent{selectedConversation=" + this.a.toString() + ", origin=" + elkaVar.toString() + "}";
    }
}
