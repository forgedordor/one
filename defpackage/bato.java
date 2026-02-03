package defpackage;

import com.google.android.apps.messaging.shared.conversation.draft.ComposeRowState;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bato implements batq {
    public final ComposeRowState a;

    public bato(ComposeRowState composeRowState) {
        this.a = composeRowState;
    }

    @Override // defpackage.batq
    public final /* synthetic */ void a(fdap fdapVar, fdap fdapVar2) {
        batp.b(this, fdapVar, fdapVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bato) && fdbq.f(this.a, ((bato) obj).a);
    }

    public final int hashCode() {
        ComposeRowState composeRowState = this.a;
        if (composeRowState == null) {
            return 0;
        }
        return composeRowState.hashCode();
    }

    public final String toString() {
        return "NullableComposeRowState(composeRowState=" + this.a + ")";
    }
}
