package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chul extends chxw {
    public final Optional a;
    public final Optional b;
    public final Optional c;
    public final Optional d;
    public final Optional e;
    public final Optional f;
    private final Optional g;

    public chul(Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5, Optional optional6, Optional optional7) {
        this.a = optional;
        this.b = optional2;
        this.c = optional3;
        this.d = optional4;
        this.e = optional5;
        this.g = optional6;
        this.f = optional7;
    }

    @Override // defpackage.chxw
    public final Optional a() {
        return this.b;
    }

    @Override // defpackage.chxw
    public final Optional b() {
        return this.d;
    }

    @Override // defpackage.chxw
    public final Optional c() {
        return this.f;
    }

    @Override // defpackage.chxw
    public final Optional d() {
        return this.a;
    }

    @Override // defpackage.chxw
    public final Optional e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof chxw) {
            chxw chxwVar = (chxw) obj;
            if (this.a.equals(chxwVar.d()) && this.b.equals(chxwVar.a()) && this.c.equals(chxwVar.f()) && this.d.equals(chxwVar.b()) && this.e.equals(chxwVar.e()) && this.g.equals(chxwVar.g()) && this.f.equals(chxwVar.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.chxw
    public final Optional f() {
        return this.c;
    }

    @Override // defpackage.chxw
    public final Optional g() {
        return this.g;
    }

    public final int hashCode() {
        return ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        Optional optional = this.f;
        Optional optional2 = this.g;
        Optional optional3 = this.e;
        Optional optional4 = this.d;
        Optional optional5 = this.c;
        Optional optional6 = this.b;
        return "TransactionId{mmsMessage=" + this.a.toString() + ", legacyConferenceUri=" + optional6.toString() + ", rcsMessage=" + optional5.toString() + ", legacyTransactionId=" + optional4.toString() + ", mmsMessageProto=" + optional3.toString() + ", smsMessage=" + optional2.toString() + ", messagePersistenceId=" + optional.toString() + "}";
    }
}
