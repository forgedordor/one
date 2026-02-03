package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwmm extends dwju {
    public final ekgb a;
    public final Instant b;
    public final Instant c;
    private final dwjt d;

    public dwmm(ekgb ekgbVar, Instant instant, Instant instant2, dwjt dwjtVar) {
        this.a = ekgbVar;
        this.b = instant;
        this.c = instant2;
        this.d = dwjtVar;
    }

    @Override // defpackage.dwju
    public final dwjt b() {
        return this.d;
    }

    @Override // defpackage.dwju
    public final ekgb c() {
        return this.a;
    }

    @Override // defpackage.dwju
    public final Instant d() {
        return this.b;
    }

    @Override // defpackage.dwju
    public final Instant e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dwju) {
            dwju dwjuVar = (dwju) obj;
            if (ekjz.h(this.a, dwjuVar.c()) && this.b.equals(dwjuVar.d()) && this.c.equals(dwjuVar.e()) && this.d.equals(dwjuVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        dwjt dwjtVar = this.d;
        Instant instant = this.c;
        Instant instant2 = this.b;
        return "AuthToken{tachyonToken=" + String.valueOf(this.a) + ", expireAt=" + String.valueOf(instant2) + ", refreshedAt=" + String.valueOf(instant) + ", oneOfId=" + String.valueOf(dwjtVar) + "}";
    }
}
