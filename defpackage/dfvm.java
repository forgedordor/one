package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dfvm extends dfvw {
    private final Optional a;
    private final int b;
    private final String c;
    private final Optional d;
    private final Optional e;

    public dfvm(Optional optional, int i, String str, Optional optional2, Optional optional3) {
        this.a = optional;
        this.b = i;
        this.c = str;
        this.d = optional2;
        this.e = optional3;
    }

    @Override // defpackage.dfvw
    @Deprecated
    public final int a() {
        return this.b;
    }

    @Override // defpackage.dfvw
    @Deprecated
    public final Optional b() {
        return this.d;
    }

    @Override // defpackage.dfvw
    public final Optional c() {
        return this.e;
    }

    @Override // defpackage.dfvw
    public final Optional d() {
        return this.a;
    }

    @Override // defpackage.dfvw
    @Deprecated
    public final String e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dfvw) {
            dfvw dfvwVar = (dfvw) obj;
            if (this.a.equals(dfvwVar.d()) && this.b == dfvwVar.a() && this.c.equals(dfvwVar.e()) && this.d.equals(dfvwVar.b()) && this.e.equals(dfvwVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        Optional optional = this.e;
        Optional optional2 = this.d;
        return "SessionEstablishedResult{session=" + String.valueOf(this.a) + ", responseCode=" + this.b + ", reason=" + this.c + ", exception=" + optional2.toString() + ", instantMessageError=" + String.valueOf(optional) + "}";
    }
}
