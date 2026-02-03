package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cgav extends cgdx {
    public final emgm a;
    public final Optional b;
    public final Optional c;
    public final Optional d;

    public cgav(emgm emgmVar, Optional optional, Optional optional2, Optional optional3) {
        this.a = emgmVar;
        this.b = optional;
        this.c = optional2;
        this.d = optional3;
    }

    @Override // defpackage.cgdx
    public final emgm a() {
        return this.a;
    }

    @Override // defpackage.cgdx
    public final Optional b() {
        return this.b;
    }

    @Override // defpackage.cgdx
    public final Optional c() {
        return this.d;
    }

    @Override // defpackage.cgdx
    public final Optional d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cgdx) {
            cgdx cgdxVar = (cgdx) obj;
            if (this.a.equals(cgdxVar.a()) && this.b.equals(cgdxVar.b()) && this.c.equals(cgdxVar.d()) && this.d.equals(cgdxVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        Optional optional = this.d;
        Optional optional2 = this.c;
        Optional optional3 = this.b;
        return "ReportIssueNotificationData{issueType=" + this.a.toString() + ", message=" + String.valueOf(optional3) + ", throwable=" + String.valueOf(optional2) + ", psdMap=" + String.valueOf(optional) + "}";
    }
}
