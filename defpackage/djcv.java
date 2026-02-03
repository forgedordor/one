package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djcv {
    public final dpfy a;
    public final CharSequence b;
    public final String c;
    public final Integer d;
    public final int e;
    public final boolean f;
    public final djgx g;
    public final djcu h;

    public djcv(dpfy dpfyVar, CharSequence charSequence, String str, Integer num, int i, boolean z, djgx djgxVar, djcu djcuVar) {
        dpfyVar.getClass();
        charSequence.getClass();
        str.getClass();
        djcuVar.getClass();
        this.a = dpfyVar;
        this.b = charSequence;
        this.c = str;
        this.d = num;
        this.e = i;
        this.f = z;
        this.g = djgxVar;
        this.h = djcuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djcv)) {
            return false;
        }
        djcv djcvVar = (djcv) obj;
        return fdbq.f(this.a, djcvVar.a) && fdbq.f(this.b, djcvVar.b) && fdbq.f(this.c, djcvVar.c) && fdbq.f(this.d, djcvVar.d) && this.e == djcvVar.e && this.f == djcvVar.f && fdbq.f(this.g, djcvVar.g) && fdbq.f(this.h, djcvVar.h);
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        Integer num = this.d;
        int iHashCode2 = ((((((iHashCode * 31) + (num == null ? 0 : num.hashCode())) * 31) + this.e) * 31) + (true != this.f ? 1237 : 1231)) * 31;
        djgx djgxVar = this.g;
        return ((iHashCode2 + (djgxVar != null ? djgxVar.hashCode() : 0)) * 31) + this.h.hashCode();
    }

    public final String toString() {
        return "ComposeRowDraftTextUiData(hugoUiData=" + this.a + ", text=" + ((Object) this.b) + ", hint=" + this.c + ", maxLength=" + this.d + ", maxLines=" + this.e + ", forcePlainText=" + this.f + ", counter=" + this.g + ", flags=" + this.h + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ djcv(dpfy dpfyVar, CharSequence charSequence, String str, Integer num, int i, boolean z, djgx djgxVar, djcu djcuVar, int i2) {
        djcu djcuVar2 = (i2 & 128) != 0 ? new djcu(false, 3) : djcuVar;
        int i3 = i2 & 64;
        int i4 = i2 & 16;
        int i5 = i2 & 8;
        boolean z2 = (i2 & 32) == 0;
        djgx djgxVar2 = i3 != 0 ? null : djgxVar;
        boolean z3 = z2 & z;
        this(dpfyVar, charSequence, str, i5 != 0 ? null : num, i4 != 0 ? 12 : i, z3, djgxVar2, djcuVar2);
    }
}
