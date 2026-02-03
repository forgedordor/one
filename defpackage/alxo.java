package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class alxo {
    public final ResolvedRecipient a;
    final /* synthetic */ alxr b;
    private final Instant c;

    public alxo(alxr alxrVar, ResolvedRecipient resolvedRecipient, Instant instant) {
        this.b = alxrVar;
        this.a = resolvedRecipient;
        this.c = instant;
    }

    public final String toString() {
        ResolvedRecipient resolvedRecipient = this.a;
        alxr alxrVar = this.b;
        return resolvedRecipient.x(false) + " " + alxrVar.c(this.c);
    }
}
