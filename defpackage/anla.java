package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anla implements anlb {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final int i;

    public /* synthetic */ anla(String str, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i2) {
        this.a = 1 == (i2 & 1) ? null : str;
        this.i = i;
        this.b = ((i2 & 4) == 0) & z;
        this.c = ((i2 & 8) == 0) & z2;
        this.d = ((i2 & 16) == 0) & z3;
        this.e = ((i2 & 32) == 0) & z4;
        this.f = ((i2 & 64) == 0) & z5;
        this.g = ((i2 & 128) == 0) & z6;
        this.h = ((i2 & 256) == 0) & z7;
    }

    @Override // defpackage.anlb
    public final String a() {
        return this.a;
    }

    @Override // defpackage.anlb
    public final int b() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof anla)) {
            return false;
        }
        anla anlaVar = (anla) obj;
        return fdbq.f(this.a, anlaVar.a) && this.i == anlaVar.i && this.b == anlaVar.b && this.c == anlaVar.c && this.d == anlaVar.d && this.e == anlaVar.e && this.f == anlaVar.f && this.g == anlaVar.g && this.h == anlaVar.h;
    }

    public final int hashCode() {
        String str = this.a;
        return ((((((((((((((((str == null ? 0 : str.hashCode()) * 31) + this.i) * 31) + ankz.a(this.b)) * 31) + ankz.a(this.c)) * 31) + ankz.a(this.d)) * 31) + ankz.a(this.e)) * 31) + ankz.a(this.f)) * 31) + ankz.a(this.g)) * 31) + ankz.a(this.h);
    }

    public final String toString() {
        return "BugleOutgoingDisplayableStatus(text=" + this.a + ", type=" + ((Object) anlc.a(this.i)) + ", canResend=" + this.b + ", canFallback=" + this.c + ", canDelete=" + this.d + ", sentAsFallback=" + this.e + ", canResendImmediately=" + this.f + ", canCall=" + this.g + ", canShowPremiumOptions=" + this.h + ")";
    }
}
