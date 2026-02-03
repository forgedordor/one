package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class caz extends cbg {
    public final bki a;
    private final int b;
    private final int c;
    private final List d;
    private final List e;
    private final bkg f;

    public caz(int i, int i2, List list, List list2, bkg bkgVar, bki bkiVar) {
        this.b = i;
        this.c = i2;
        if (list == null) {
            throw new NullPointerException("Null audioProfiles");
        }
        this.d = list;
        if (list2 == null) {
            throw new NullPointerException("Null videoProfiles");
        }
        this.e = list2;
        this.f = bkgVar;
        if (bkiVar == null) {
            throw new NullPointerException("Null defaultVideoProfile");
        }
        this.a = bkiVar;
    }

    @Override // defpackage.bkj
    public final int a() {
        return this.b;
    }

    @Override // defpackage.bkj
    public final int b() {
        return this.c;
    }

    @Override // defpackage.bkj
    public final List c() {
        return this.d;
    }

    @Override // defpackage.bkj
    public final List d() {
        return this.e;
    }

    @Override // defpackage.cbg
    public final bkg e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        bkg bkgVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cbg) {
            cbg cbgVar = (cbg) obj;
            if (this.b == cbgVar.a() && this.c == cbgVar.b() && this.d.equals(cbgVar.c()) && this.e.equals(cbgVar.d()) && ((bkgVar = this.f) != null ? bkgVar.equals(cbgVar.e()) : cbgVar.e() == null) && this.a.equals(cbgVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cbg
    public final bki f() {
        return this.a;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.b ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
        bkg bkgVar = this.f;
        return (((iHashCode * 1000003) ^ (bkgVar == null ? 0 : bkgVar.hashCode())) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        return "VideoValidatedEncoderProfilesProxy{defaultDurationSeconds=" + this.b + ", recommendedFileFormat=" + this.c + ", audioProfiles=" + this.d + ", videoProfiles=" + this.e + ", defaultAudioProfile=" + this.f + ", defaultVideoProfile=" + this.a + "}";
    }
}
