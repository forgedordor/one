package defpackage;

import android.text.Spanned;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aaqz extends aarg {
    public final String a;
    public final String b;
    public final Spanned c;
    private final long d;
    private final boolean e;

    public aaqz(String str, String str2, Spanned spanned, long j, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = spanned;
        this.d = j;
        this.e = z;
    }

    @Override // defpackage.aarg
    public final long a() {
        return this.d;
    }

    @Override // defpackage.aarg
    public final Spanned b() {
        return this.c;
    }

    @Override // defpackage.aarg
    public final String c() {
        return this.b;
    }

    @Override // defpackage.aarg
    public final String d() {
        return this.a;
    }

    @Override // defpackage.aarg
    public final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aarg) {
            aarg aargVar = (aarg) obj;
            if (this.a.equals(aargVar.d()) && this.b.equals(aargVar.c()) && this.c.equals(aargVar.b()) && this.d == aargVar.a() && this.e == aargVar.e()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        int i = true != this.e ? 1237 : 1231;
        long j = this.d;
        return (((iHashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ i;
    }

    public final String toString() {
        return "Message{normalizedDestination=" + this.a + ", displayDestination=" + this.b + ", textContent=" + this.c.toString() + ", timestamp=" + this.d + ", isIncoming=" + this.e + "}";
    }
}
