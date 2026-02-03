package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axls extends axza {
    public final String a;
    public final String b;
    public final boolean c;

    public axls(String str, String str2, boolean z) {
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null displayOriginatingAddress");
        }
        this.b = str2;
        this.c = z;
    }

    @Override // defpackage.axza
    public final String a() {
        return this.b;
    }

    @Override // defpackage.axza
    public final String b() {
        return this.a;
    }

    @Override // defpackage.axza
    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof axza) {
            axza axzaVar = (axza) obj;
            if (this.a.equals(axzaVar.b()) && this.b.equals(axzaVar.a()) && this.c == axzaVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        return "RawSmsMessagingAddress{originatingAddress=" + this.a + ", displayOriginatingAddress=" + this.b + ", isEmail=" + this.c + "}";
    }
}
