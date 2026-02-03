package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class angn {
    public final String a;
    public final Uri b;
    public final aoer c;
    public final fhaz d;
    public final String e;
    public final basd f;
    private final boolean g;

    public /* synthetic */ angn(String str, Uri uri, boolean z, aoer aoerVar, fhaz fhazVar, String str2, basd basdVar, int i) {
        str.getClass();
        uri.getClass();
        this.a = str;
        this.b = uri;
        this.g = ((i & 4) == 0) & z;
        this.c = (i & 8) != 0 ? null : aoerVar;
        this.d = (i & 16) != 0 ? null : fhazVar;
        this.e = (i & 32) != 0 ? null : str2;
        this.f = (i & 64) != 0 ? null : basdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof angn)) {
            return false;
        }
        angn angnVar = (angn) obj;
        return fdbq.f(this.a, angnVar.a) && fdbq.f(this.b, angnVar.b) && this.g == angnVar.g && fdbq.f(this.c, angnVar.c) && fdbq.f(this.d, angnVar.d) && fdbq.f(this.e, angnVar.e) && fdbq.f(this.f, angnVar.f);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        aoer aoerVar = this.c;
        int iHashCode2 = ((((iHashCode * 31) + (true != this.g ? 1237 : 1231)) * 31) + (aoerVar == null ? 0 : aoerVar.hashCode())) * 31;
        fhaz fhazVar = this.d;
        int iHashCode3 = (iHashCode2 + (fhazVar == null ? 0 : fhazVar.hashCode())) * 31;
        String str = this.e;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        basd basdVar = this.f;
        return iHashCode4 + (basdVar != null ? basdVar.hashCode() : 0);
    }

    public final String toString() {
        return "DefaultReactionMetadata(reactorName=" + this.a + ", reactorAvatar=" + this.b + ", isFromIos=" + this.g + ", selfIdentity=" + this.c + ", traceId=" + this.d + ", reactorProfileName=" + this.e + ", rcsMessageId=" + this.f + ")";
    }
}
