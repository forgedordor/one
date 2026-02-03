package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzhz extends dzib {
    public final Level a;
    public final String b;
    public final String c;
    public final long d;

    public dzhz(Level level, String str, String str2, long j) {
        this.a = level;
        if (str == null) {
            throw new NullPointerException("Null logFormat");
        }
        this.b = str;
        this.c = str2;
        this.d = j;
    }

    @Override // defpackage.dzib
    public final long a() {
        return this.d;
    }

    @Override // defpackage.dzib
    public final String b() {
        return this.c;
    }

    @Override // defpackage.dzib
    public final String c() {
        return this.b;
    }

    @Override // defpackage.dzib
    public final Level d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzib) {
            dzib dzibVar = (dzib) obj;
            if (this.a.equals(dzibVar.d()) && this.b.equals(dzibVar.c()) && this.c.equals(dzibVar.b()) && this.d == dzibVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        long j = this.d;
        return (iHashCode * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "AbseilLogData{logLevel=" + this.a.toString() + ", logFormat=" + this.b + ", fileName=" + this.c + ", threadId=" + this.d + "}";
    }
}
