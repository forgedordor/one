package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class alwo extends amea {
    private final ResolvedRecipient a;
    private final aoer b;

    public alwo(ResolvedRecipient resolvedRecipient, aoer aoerVar) {
        this.a = resolvedRecipient;
        this.b = aoerVar;
    }

    @Override // defpackage.ajlr
    public final ResolvedRecipient a() {
        return this.a;
    }

    @Override // defpackage.ajlr
    public final aoer b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof amea) {
            amea ameaVar = (amea) obj;
            if (this.a.equals(ameaVar.a()) && this.b.equals(ameaVar.b())) {
                ameaVar.c();
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
    }

    public final String toString() {
        aoer aoerVar = this.b;
        return "DefaultIncomingMessageProvenance{sender=" + this.a.toString() + ", receivingSelfIdentity=" + aoerVar.toString() + ", messageDetails=null}";
    }

    @Override // defpackage.amea
    public final void c() {
    }
}
