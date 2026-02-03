package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqeh extends eqek {
    public final String a;
    public final Optional b;
    public final Optional c;
    public final Optional d;
    public final int e;

    public eqeh(int i, String str, Optional optional, Optional optional2, Optional optional3) {
        this.e = i;
        this.a = str;
        this.b = optional;
        this.c = optional2;
        this.d = optional3;
    }

    @Override // defpackage.eqek
    public final Optional a() {
        return this.d;
    }

    @Override // defpackage.eqek
    public final Optional b() {
        return this.b;
    }

    @Override // defpackage.eqek
    public final Optional c() {
        return this.c;
    }

    @Override // defpackage.eqek
    public final String d() {
        return this.a;
    }

    @Override // defpackage.eqek
    public final int e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eqek) {
            eqek eqekVar = (eqek) obj;
            if (this.e == eqekVar.e() && this.a.equals(eqekVar.d()) && this.b.equals(eqekVar.b()) && this.c.equals(eqekVar.c()) && this.d.equals(eqekVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.e ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        int i = this.e;
        String str = i != 1 ? i != 2 ? i != 3 ? "VERBOSE" : "INFO" : "WARNING" : "ERROR";
        Optional optional = this.b;
        Optional optional2 = this.c;
        Optional optional3 = this.d;
        return "LogEvent{severity=" + str + ", text=" + this.a + ", messageId=" + String.valueOf(optional) + ", throwable=" + String.valueOf(optional2) + ", contentType=" + optional3.toString() + "}";
    }
}
