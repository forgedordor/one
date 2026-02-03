package defpackage;

import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efbt extends efdo {
    private final Optional a;
    private final int b;
    private final efdf c;
    private final String d;
    private final Instant e;
    private final Optional f;

    public efbt(Optional optional, int i, efdf efdfVar, String str, Instant instant, Optional optional2) {
        this.a = optional;
        this.b = i;
        this.c = efdfVar;
        this.d = str;
        this.e = instant;
        this.f = optional2;
    }

    @Override // defpackage.efdo
    public final int a() {
        return this.b;
    }

    @Override // defpackage.efdo
    public final efdf b() {
        return this.c;
    }

    @Override // defpackage.efdo
    public final Instant c() {
        return this.e;
    }

    @Override // defpackage.efdo
    public final Optional d() {
        return this.f;
    }

    @Override // defpackage.efdo
    public final Optional e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof efdo) {
            efdo efdoVar = (efdo) obj;
            if (this.a.equals(efdoVar.e()) && this.b == efdoVar.a() && this.c.equals(efdoVar.b()) && this.d.equals(efdoVar.f()) && this.e.equals(efdoVar.c()) && this.f.equals(efdoVar.d())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.efdo
    public final String f() {
        return this.d;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        Optional optional = this.f;
        Instant instant = this.e;
        efdf efdfVar = this.c;
        return "FileInformation{name=" + this.a.toString() + ", sizeBytes=" + this.b + ", contentType=" + efdfVar.toString() + ", url=" + this.d + ", validUntil=" + instant.toString() + ", fileType=" + optional.toString() + "}";
    }
}
