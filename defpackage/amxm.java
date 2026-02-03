package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amxm extends amxq {
    public final anpj a;
    public final boolean b;
    public final boolean c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final boolean g;

    public amxm(anpj anpjVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.a = anpjVar;
        this.b = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.c = z5;
        this.g = z6;
    }

    @Override // defpackage.amxq, defpackage.amyb
    public final anpj a() {
        return this.a;
    }

    @Override // defpackage.amxq, defpackage.amyb
    public final boolean b() {
        return this.c;
    }

    @Override // defpackage.amxq, defpackage.amyb
    public final boolean c() {
        return this.f;
    }

    @Override // defpackage.amxq
    public final boolean d() {
        return this.g;
    }

    @Override // defpackage.amxq, defpackage.amyb
    public final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof amxq) {
            amxq amxqVar = (amxq) obj;
            if (this.a.equals(amxqVar.a()) && this.b == amxqVar.f() && this.d == amxqVar.g() && this.e == amxqVar.e() && this.f == amxqVar.c() && this.c == amxqVar.b() && this.g == amxqVar.d()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.amxq, defpackage.amyb
    public final boolean f() {
        return this.b;
    }

    @Override // defpackage.amxq, defpackage.amyb
    public final boolean g() {
        return this.d;
    }

    public final int hashCode() {
        return ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true == this.g ? 1231 : 1237);
    }

    public final String toString() {
        return "BugleFileTransferProgress{progress=" + this.a.toString() + ", isTransferring=" + this.b + ", isYetToManualDownload=" + this.d + ", isManualDownloading=" + this.e + ", isAutoDownloading=" + this.f + ", hasPermanentFailure=" + this.c + ", isCms=" + this.g + "}";
    }
}
