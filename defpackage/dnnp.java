package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnnp {
    public final dnmj a;
    public final dnkf b;
    public final Integer c;
    public final dnno d;
    public final boolean e;

    public dnnp(dnmj dnmjVar, dnkf dnkfVar, Integer num, dnno dnnoVar, boolean z) {
        dnkfVar.getClass();
        this.a = dnmjVar;
        this.b = dnkfVar;
        this.c = num;
        this.d = dnnoVar;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnnp)) {
            return false;
        }
        dnnp dnnpVar = (dnnp) obj;
        return fdbq.f(this.a, dnnpVar.a) && fdbq.f(this.b, dnnpVar.b) && fdbq.f(this.c, dnnpVar.c) && fdbq.f(this.d, dnnpVar.d) && this.e == dnnpVar.e;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        Integer num = this.c;
        return (((((iHashCode * 31) + (num == null ? 0 : num.hashCode())) * 31) + this.d.hashCode()) * 31) + (true != this.e ? 1237 : 1231);
    }

    public final String toString() {
        return "EmojiUsage(emojiSet=" + this.a + ", selectedEmoji=" + this.b + ", listPosition=" + this.c + ", source=" + this.d + ", fromVariantPicker=" + this.e + ")";
    }

    public /* synthetic */ dnnp(dnmj dnmjVar, dnkf dnkfVar, Integer num, dnno dnnoVar, boolean z, int i) {
        this(dnmjVar, dnkfVar, (i & 4) != 0 ? null : num, dnnoVar, ((i & 16) == 0) & z);
    }
}
