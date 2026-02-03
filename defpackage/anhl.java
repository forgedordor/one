package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anhl extends anhn {
    private final MessageId a;
    private final anhj b;
    private final ckmn c;
    private final fhaz d;
    private final anhk e;

    public anhl(MessageId messageId, anhj anhjVar, ckmn ckmnVar, fhaz fhazVar) {
        messageId.getClass();
        anhjVar.getClass();
        ckmnVar.getClass();
        this.a = messageId;
        this.b = anhjVar;
        this.c = ckmnVar;
        this.d = fhazVar;
        this.e = anhk.a;
    }

    @Override // defpackage.anhn
    public final MessageId a() {
        return this.a;
    }

    @Override // defpackage.anhn
    public final anhj b() {
        return this.b;
    }

    @Override // defpackage.anhn
    public final anhk c() {
        return this.e;
    }

    @Override // defpackage.anhn
    public final ckmn d() {
        return this.c;
    }

    @Override // defpackage.anhn
    public final fhaz e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof anhl)) {
            return false;
        }
        anhl anhlVar = (anhl) obj;
        return fdbq.f(this.a, anhlVar.a) && fdbq.f(this.b, anhlVar.b) && this.c == anhlVar.c && fdbq.f(this.d, anhlVar.d);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "ReactionAddInfo(reactedMessageId=" + this.a + ", reaction=" + this.b + ", surface=" + this.c + ", traceId=" + this.d + ")";
    }
}
