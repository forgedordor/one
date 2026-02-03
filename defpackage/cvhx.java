package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvhx extends cvhw {
    public final ekgp a;
    public final ekgb b;

    public cvhx(ekgp ekgpVar, ekgb ekgbVar) {
        this.a = ekgpVar;
        if (ekgbVar == null) {
            throw new NullPointerException("Null googlePhotosAttachments");
        }
        this.b = ekgbVar;
    }

    @Override // defpackage.cvhw
    public final ekgb a() {
        return this.b;
    }

    @Override // defpackage.cvhw
    public final ekgp b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cvhw) {
            cvhw cvhwVar = (cvhw) obj;
            if (ekmi.m(this.a, cvhwVar.b()) && ekjz.h(this.b, cvhwVar.a())) {
                cvhwVar.c();
                cvhwVar.d();
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (~((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003)) * 1000003;
    }

    public final String toString() {
        return "AttachmentsPosition{positionToSingleAttachments=" + ekmi.g(this.a) + ", googlePhotosAttachments=" + this.b.toString() + ", googlePhotosPosition=-1, googlePhotosUploadStateHash=0}";
    }

    @Override // defpackage.cvhw
    public final void c() {
    }

    @Override // defpackage.cvhw
    public final void d() {
    }
}
