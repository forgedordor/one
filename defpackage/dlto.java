package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlto implements dltn {
    public final doig a;
    public final String b;
    public final long c;
    public final String d;
    private final Instant e;
    private final dltc f;

    public dlto(doig doigVar, String str, long j, String str2, Instant instant, dltc dltcVar) {
        doigVar.getClass();
        str.getClass();
        instant.getClass();
        dltcVar.getClass();
        this.a = doigVar;
        this.b = str;
        this.c = j;
        this.d = str2;
        this.e = instant;
        this.f = dltcVar;
    }

    @Override // defpackage.dltn
    public final long a() {
        return this.c;
    }

    @Override // defpackage.dltn
    public final doig b() {
        return this.a;
    }

    @Override // defpackage.dltn
    public final Instant c() {
        return this.e;
    }

    @Override // defpackage.dltn
    public final String d() {
        return this.d;
    }

    @Override // defpackage.dltn
    public final /* synthetic */ String e() {
        return dltj.b(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlto)) {
            return false;
        }
        dlto dltoVar = (dlto) obj;
        return fdbq.f(this.a, dltoVar.a) && fdbq.f(this.b, dltoVar.b) && this.c == dltoVar.c && fdbq.f(this.d, dltoVar.d) && fdbq.f(this.e, dltoVar.e) && fdbq.f(this.f, dltoVar.f);
    }

    @Override // defpackage.dltn
    public final String f() {
        return this.b;
    }

    @Override // defpackage.dltd
    public final dltc fo() {
        return this.f;
    }

    @Override // defpackage.dlti
    public final /* bridge */ /* synthetic */ Object fp() {
        return e();
    }

    @Override // defpackage.dltd
    public final /* synthetic */ String fq() {
        return toString();
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        String str = this.d;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        long j = this.c;
        return (((((((iHashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + iHashCode2) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "LocalFile(mediaType=" + this.a + ", url=" + this.b + ", sizeBytes=" + this.c + ", displayName=" + this.d + ", dateModified=" + this.e + ", source=" + this.f + ")";
    }
}
