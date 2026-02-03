package defpackage;

import com.google.android.rcs.client.messaging.data.AutoValue_IsComposingMessage;
import com.google.android.rcs.client.messaging.data.IsComposingMessage;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efhu extends efjl {
    private efjm a;
    private Optional b = Optional.empty();
    private Optional c = Optional.empty();

    @Override // defpackage.efjl
    public final IsComposingMessage a() {
        efjm efjmVar = this.a;
        if (efjmVar != null) {
            return new AutoValue_IsComposingMessage(efjmVar, this.b, this.c);
        }
        throw new IllegalStateException("Missing required properties: state");
    }

    @Override // defpackage.efjl
    public final void b(Duration duration) {
        this.b = Optional.of(duration);
    }

    @Override // defpackage.efjl
    public final void c(efjm efjmVar) {
        if (efjmVar == null) {
            throw new NullPointerException("Null state");
        }
        this.a = efjmVar;
    }

    @Override // defpackage.efjl
    public final void d(Instant instant) {
        this.c = Optional.of(instant);
    }
}
