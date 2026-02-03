package defpackage;

import android.net.Uri;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqwk extends cqwt {
    public final Uri a;
    public final File b;
    public final long c;
    public final double d;
    public final boolean e;
    public final double f;
    public final String g;
    public final String h;

    public cqwk(Uri uri, File file, long j, double d, boolean z, double d2, String str, String str2) {
        this.a = uri;
        this.b = file;
        this.c = j;
        this.d = d;
        this.e = z;
        this.f = d2;
        this.g = str;
        this.h = str2;
    }

    @Override // defpackage.cqwt
    public final double a() {
        return this.d;
    }

    @Override // defpackage.cqwt
    public final double b() {
        return this.f;
    }

    @Override // defpackage.cqwt
    public final long c() {
        return this.c;
    }

    @Override // defpackage.cqwt
    public final Uri d() {
        return this.a;
    }

    @Override // defpackage.cqwt
    public final File e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cqwt) {
            cqwt cqwtVar = (cqwt) obj;
            if (this.a.equals(cqwtVar.d()) && this.b.equals(cqwtVar.e()) && this.c == cqwtVar.c() && Double.doubleToLongBits(this.d) == Double.doubleToLongBits(cqwtVar.a()) && this.e == cqwtVar.h() && Double.doubleToLongBits(this.f) == Double.doubleToLongBits(cqwtVar.b()) && ((str = this.g) != null ? str.equals(cqwtVar.f()) : cqwtVar.f() == null) && ((str2 = this.h) != null ? str2.equals(cqwtVar.g()) : cqwtVar.g() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cqwt
    public final String f() {
        return this.g;
    }

    @Override // defpackage.cqwt
    public final String g() {
        return this.h;
    }

    @Override // defpackage.cqwt
    public final boolean h() {
        return this.e;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        double d = this.d;
        long jDoubleToLongBits = Double.doubleToLongBits(d) ^ (Double.doubleToLongBits(d) >>> 32);
        double d2 = this.f;
        long jDoubleToLongBits2 = Double.doubleToLongBits(d2) ^ (Double.doubleToLongBits(d2) >>> 32);
        String str = this.g;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        long j = this.c;
        int i = ((((((((((iHashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) jDoubleToLongBits)) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ ((int) jDoubleToLongBits2)) * 1000003) ^ iHashCode2) * 1000003;
        String str2 = this.h;
        return i ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        File file = this.b;
        return "TranscodeParameters{sourceUri=" + this.a.toString() + ", outputPath=" + file.toString() + ", sizeLimit=" + this.c + ", bitrateLimitFactor=" + this.d + ", enableHighBudgetVideoCompression=" + this.e + ", mmsVideoCompressionFudgeFactor=" + this.f + ", mimeType=" + this.g + ", targetMimeType=" + this.h + "}";
    }
}
