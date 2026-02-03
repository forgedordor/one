package defpackage;

import j$.util.Objects;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhgp {
    public final long a;
    public final String d;
    public Optional e;
    public Optional f;
    public Optional c = Optional.ofNullable(null);
    public Optional b = Optional.empty();
    public Optional g = Optional.empty();

    public dhgp(long j, String str, String str2, String str3) {
        this.a = j;
        this.f = Optional.ofNullable(str2);
        this.d = str;
        this.e = Optional.ofNullable(str3);
    }

    public final void a(dezn deznVar) {
        this.b = Optional.of(deznVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            dhgp dhgpVar = (dhgp) obj;
            if (this.a == dhgpVar.a && Objects.equals(this.b, dhgpVar.b) && this.d.equals(dhgpVar.d) && Objects.equals(this.e, dhgpVar.e) && Objects.equals(this.f, dhgpVar.f) && Objects.equals(this.g, dhgpVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), this.b, this.d, this.e, this.f, this.g);
    }

    public final String toString() {
        return "Group ID: " + this.d + ", rcs session ID: " + this.a + ", conference URI: " + dhiz.URI.c(this.e) + ", conference Info: " + String.valueOf(this.b) + ", subject: " + dhiz.MESSAGE_CONTENT.c(this.f);
    }
}
