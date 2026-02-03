package defpackage;

import java.util.regex.Matcher;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class csrv extends cssp {
    private final Matcher a;
    private final String b;
    private final boolean c;

    public csrv(Matcher matcher, String str, boolean z) {
        if (matcher == null) {
            throw new NullPointerException("Null matcher");
        }
        this.a = matcher;
        if (str == null) {
            throw new NullPointerException("Null replacement");
        }
        this.b = str;
        this.c = z;
    }

    @Override // defpackage.cssp
    public final String a() {
        return this.b;
    }

    @Override // defpackage.cssp
    public final Matcher b() {
        return this.a;
    }

    @Override // defpackage.cssp
    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cssp) {
            cssp csspVar = (cssp) obj;
            if (this.a.equals(csspVar.b()) && this.b.equals(csspVar.a()) && this.c == csspVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        return "SanitizationRule{matcher=" + this.a.toString() + ", replacement=" + this.b + ", isLoggingEnabled=" + this.c + "}";
    }
}
