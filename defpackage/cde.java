package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cde extends cda {
    public final String a;
    public final int b;
    public final bkg c;

    public cde(String str, int i, bkg bkgVar) {
        this.a = str;
        this.b = i;
        this.c = bkgVar;
    }

    @Override // defpackage.cda
    public final bkg a() {
        return this.c;
    }

    @Override // defpackage.cdj
    public final int b() {
        return this.b;
    }

    @Override // defpackage.cdj
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        bkg bkgVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cda) {
            cda cdaVar = (cda) obj;
            if (this.a.equals(cdaVar.c()) && this.b == cdaVar.b() && ((bkgVar = this.c) != null ? bkgVar.equals(cdaVar.a()) : cdaVar.a() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        bkg bkgVar = this.c;
        return (((iHashCode * 1000003) ^ this.b) * 1000003) ^ (bkgVar == null ? 0 : bkgVar.hashCode());
    }

    public final String toString() {
        return "AudioMimeInfo{mimeType=" + this.a + ", profile=" + this.b + ", compatibleAudioProfile=" + this.c + "}";
    }
}
