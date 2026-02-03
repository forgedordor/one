package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amuf implements amuy {
    public final Long a;
    public final amvy b;
    public final amvy c;
    public final long d;

    public amuf(Long l, amvy amvyVar, amvy amvyVar2, long j) {
        this.a = l;
        this.b = amvyVar;
        this.c = amvyVar2;
        this.d = j;
    }

    @Override // defpackage.amuy
    public final Long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof amuf)) {
            return false;
        }
        amuf amufVar = (amuf) obj;
        return fdbq.f(this.a, amufVar.a) && fdbq.f(this.b, amufVar.b) && fdbq.f(this.c, amufVar.c) && this.d == amufVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        amvy amvyVar = this.b;
        int iHashCode2 = (((iHashCode + (amvyVar == null ? 0 : amvyVar.hashCode())) * 31) + this.c.hashCode()) * 31;
        long j = this.d;
        return iHashCode2 + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "BugleMediaRichCardAttachmentContent(targetFileSize=" + this.a + ", thumbnailContent=" + this.b + ", mediaContent=" + this.c + ", partId=" + this.d + ")";
    }
}
