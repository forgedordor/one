package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anhm extends anhn {
    public final angn a;
    private final MessageId b;
    private final anhj c;
    private final ckmn d;
    private final fhaz e;
    private final anhk f;

    public anhm(MessageId messageId, anhj anhjVar, ckmn ckmnVar, fhaz fhazVar, angn angnVar) {
        messageId.getClass();
        anhjVar.getClass();
        ckmnVar.getClass();
        this.b = messageId;
        this.c = anhjVar;
        this.d = ckmnVar;
        this.e = fhazVar;
        this.a = angnVar;
        this.f = anhk.b;
    }

    @Override // defpackage.anhn
    public final MessageId a() {
        return this.b;
    }

    @Override // defpackage.anhn
    public final anhj b() {
        return this.c;
    }

    @Override // defpackage.anhn
    public final anhk c() {
        return this.f;
    }

    @Override // defpackage.anhn
    public final ckmn d() {
        return this.d;
    }

    @Override // defpackage.anhn
    public final fhaz e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof anhm)) {
            return false;
        }
        anhm anhmVar = (anhm) obj;
        return fdbq.f(this.b, anhmVar.b) && fdbq.f(this.c, anhmVar.c) && this.d == anhmVar.d && fdbq.f(this.e, anhmVar.e) && fdbq.f(this.a, anhmVar.a);
    }

    public final int hashCode() {
        int iHashCode = (((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
        angn angnVar = this.a;
        return (iHashCode * 31) + (angnVar == null ? 0 : angnVar.hashCode());
    }

    public final String toString() {
        return "ReactionRemoveInfo(reactedMessageId=" + this.b + ", reaction=" + this.c + ", surface=" + this.d + ", traceId=" + this.e + ", removedReactionMetadata=" + this.a + ")";
    }
}
