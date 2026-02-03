package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efck extends effa {
    private final efez a;
    private final String b;
    private final Instant c;
    private final String d;

    public efck(efez efezVar, String str, Instant instant, String str2) {
        this.a = efezVar;
        this.b = str;
        this.c = instant;
        this.d = str2;
    }

    @Override // defpackage.effa
    public final efez a() {
        return this.a;
    }

    @Override // defpackage.effa
    public final Instant b() {
        return this.c;
    }

    @Override // defpackage.effa
    public final String c() {
        return this.b;
    }

    @Override // defpackage.effa
    public final String d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof effa) {
            effa effaVar = (effa) obj;
            if (this.a.equals(effaVar.a()) && this.b.equals(effaVar.c()) && this.c.equals(effaVar.b()) && this.d.equals(effaVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        Instant instant = this.c;
        return "MessageReceipt{type=" + this.a.toString() + ", messageId=" + this.b + ", timestamp=" + instant.toString() + ", status=" + this.d + "}";
    }
}
