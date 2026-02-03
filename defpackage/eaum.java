package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eaum extends eavm {
    public final eatj a;
    public final String b;
    public final long c;
    public final deem d;

    public eaum(eatj eatjVar, String str, long j, deem deemVar) {
        this.a = eatjVar;
        this.b = str;
        this.c = j;
        this.d = deemVar;
    }

    @Override // defpackage.eavm, defpackage.eanv
    public final deem a() {
        return this.d;
    }

    @Override // defpackage.eavm
    public final long b() {
        return this.c;
    }

    @Override // defpackage.eavm
    public final eatj c() {
        return this.a;
    }

    @Override // defpackage.eavm
    public final String d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        deem deemVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof eavm) {
            eavm eavmVar = (eavm) obj;
            eatj eatjVar = this.a;
            if (eatjVar != null ? eatjVar.equals(eavmVar.c()) : eavmVar.c() == null) {
                String str = this.b;
                if (str != null ? str.equals(eavmVar.d()) : eavmVar.d() == null) {
                    if (this.c == eavmVar.b() && ((deemVar = this.d) != null ? deemVar.equals(eavmVar.a()) : eavmVar.a() == null)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        eatj eatjVar = this.a;
        int iHashCode = eatjVar == null ? 0 : eatjVar.hashCode();
        String str = this.b;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int i = iHashCode ^ 1000003;
        long j = this.c;
        deem deemVar = this.d;
        return (((((i * 1000003) ^ iHashCode2) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ (deemVar != null ? deemVar.hashCode() : 0);
    }

    public final String toString() {
        deem deemVar = this.d;
        return "IsOpenRequest{place=" + String.valueOf(this.a) + ", placeId=" + this.b + ", utcTimeMillis=" + this.c + ", cancellationToken=" + String.valueOf(deemVar) + "}";
    }
}
