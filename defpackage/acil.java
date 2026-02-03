package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acil extends acie {
    public final Optional a;
    public final Optional b;
    public final elie c;
    private final Optional d;

    public acil(Optional optional, Optional optional2, Optional optional3, elie elieVar) {
        this.a = optional;
        this.d = optional2;
        this.b = optional3;
        this.c = elieVar;
    }

    @Override // defpackage.acie
    public final elie a() {
        return this.c;
    }

    @Override // defpackage.acie
    public final Optional b() {
        return this.d;
    }

    @Override // defpackage.acie
    public final Optional c() {
        return this.b;
    }

    @Override // defpackage.acie
    public final Optional d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        Optional optional;
        if (obj == this) {
            return true;
        }
        if (obj instanceof acie) {
            acie acieVar = (acie) obj;
            if (this.a.equals(acieVar.d()) && ((optional = this.d) != null ? optional.equals(acieVar.b()) : acieVar.b() == null) && this.b.equals(acieVar.c()) && this.c.equals(acieVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        Optional optional = this.d;
        return (((((iHashCode * 1000003) ^ (optional == null ? 0 : optional.hashCode())) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        elie elieVar = this.c;
        Optional optional = this.b;
        Optional optional2 = this.d;
        return "AdvancedFeedbackLauncherConfigData{throwable=" + String.valueOf(this.a) + ", psdMap=" + String.valueOf(optional2) + ", reportIssueType=" + String.valueOf(optional) + ", bugleAdvancedFeedbackSource=" + elieVar.toString() + "}";
    }
}
