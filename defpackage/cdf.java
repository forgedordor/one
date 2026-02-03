package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cdf extends cdn {
    public final String a;
    public final bki b;

    public cdf(String str, bki bkiVar) {
        this.a = str;
        this.b = bkiVar;
    }

    @Override // defpackage.cdn
    public final bki a() {
        return this.b;
    }

    @Override // defpackage.cdj
    public final int b() {
        return -1;
    }

    @Override // defpackage.cdj
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cdn) {
            cdn cdnVar = (cdn) obj;
            if (this.a.equals(cdnVar.c())) {
                cdnVar.b();
                bki bkiVar = this.b;
                if (bkiVar != null ? bkiVar.equals(cdnVar.a()) : cdnVar.a() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        bki bkiVar = this.b;
        return ((~(iHashCode * 1000003)) * 1000003) ^ (bkiVar == null ? 0 : bkiVar.hashCode());
    }

    public final String toString() {
        return "VideoMimeInfo{mimeType=" + this.a + ", profile=-1, compatibleVideoProfile=" + this.b + "}";
    }
}
