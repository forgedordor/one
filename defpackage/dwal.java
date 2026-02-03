package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwal extends dwbm {
    public final String a;
    public final dwpx b;
    public final dwpk c;
    public final int d;
    public final long e;
    public final long f;

    public dwal(String str, dwpx dwpxVar, dwpk dwpkVar, int i, long j, long j2) {
        this.a = str;
        this.b = dwpxVar;
        this.c = dwpkVar;
        this.d = i;
        this.e = j;
        this.f = j2;
    }

    @Override // defpackage.dwbm
    public final int a() {
        return this.d;
    }

    @Override // defpackage.dwbm
    public final long b() {
        return this.e;
    }

    @Override // defpackage.dwbm
    public final long c() {
        return this.f;
    }

    @Override // defpackage.dwbm
    public final dwpk d() {
        return this.c;
    }

    @Override // defpackage.dwbm
    public final dwpx e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dwbm) {
            dwbm dwbmVar = (dwbm) obj;
            if (this.a.equals(dwbmVar.f()) && this.b.equals(dwbmVar.e()) && this.c.equals(dwbmVar.d()) && this.d == dwbmVar.a() && this.e == dwbmVar.b() && this.f == dwbmVar.c()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dwbm
    public final String f() {
        return this.a;
    }

    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        long j = this.f;
        long j2 = j ^ (j >>> 32);
        long j3 = this.e;
        return (((((iHashCode * 1000003) ^ this.d) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) j2);
    }

    public final String toString() {
        dwpk dwpkVar = this.c;
        return "TypingIndicator{typingIndicatorId=" + this.a + ", conversationId=" + this.b.toString() + ", sender=" + dwpkVar.toString() + ", typingIndicatorStatus=" + this.d + ", refreshIntervalUSec=" + this.e + ", serverTimestampUSec=" + this.f + "}";
    }
}
