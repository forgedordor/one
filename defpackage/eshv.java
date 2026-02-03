package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eshv extends esib {
    public final String a;
    public final long b;
    public final int c;

    public eshv(String str, long j, int i) {
        this.a = str;
        this.b = j;
        this.c = i;
    }

    @Override // defpackage.esib
    public final long a() {
        return this.b;
    }

    @Override // defpackage.esib
    public final String b() {
        return this.a;
    }

    @Override // defpackage.esib
    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        int i;
        if (obj == this) {
            return true;
        }
        if (obj instanceof esib) {
            esib esibVar = (esib) obj;
            String str = this.a;
            if (str != null ? str.equals(esibVar.b()) : esibVar.b() == null) {
                if (this.b == esibVar.a() && ((i = this.c) != 0 ? i == esibVar.c() : esibVar.c() == 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j = this.b;
        int i = this.c;
        return ((((iHashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ (i != 0 ? i : 0);
    }

    public final String toString() {
        int i = this.c;
        String str = i != 1 ? i != 2 ? i != 3 ? "null" : "AUTH_ERROR" : "BAD_CONFIG" : "OK";
        long j = this.b;
        return "TokenResult{token=" + this.a + ", tokenExpirationTimestamp=" + j + ", responseCode=" + str + "}";
    }
}
