package defpackage;

import android.os.ParcelFileDescriptor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euhh extends euly {
    private final ekgb a;
    private final ParcelFileDescriptor b;
    private final ParcelFileDescriptor c;
    private final ParcelFileDescriptor d;
    private final ParcelFileDescriptor e;

    public euhh(ekgb ekgbVar, ParcelFileDescriptor parcelFileDescriptor, ParcelFileDescriptor parcelFileDescriptor2, ParcelFileDescriptor parcelFileDescriptor3, ParcelFileDescriptor parcelFileDescriptor4) {
        this.a = ekgbVar;
        this.b = parcelFileDescriptor;
        this.c = parcelFileDescriptor2;
        this.d = parcelFileDescriptor3;
        this.e = parcelFileDescriptor4;
    }

    @Override // defpackage.euly
    public final ParcelFileDescriptor a() {
        return this.b;
    }

    @Override // defpackage.euly
    public final ParcelFileDescriptor b() {
        return this.d;
    }

    @Override // defpackage.euly
    public final ParcelFileDescriptor c() {
        return this.e;
    }

    @Override // defpackage.euly
    public final ParcelFileDescriptor d() {
        return this.c;
    }

    @Override // defpackage.euly
    public final ekgb e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        ParcelFileDescriptor parcelFileDescriptor;
        ParcelFileDescriptor parcelFileDescriptor2;
        ParcelFileDescriptor parcelFileDescriptor3;
        ParcelFileDescriptor parcelFileDescriptor4;
        if (obj == this) {
            return true;
        }
        if (obj instanceof euly) {
            euly eulyVar = (euly) obj;
            if (ekjz.h(this.a, eulyVar.e()) && ((parcelFileDescriptor = this.b) != null ? parcelFileDescriptor.equals(eulyVar.a()) : eulyVar.a() == null) && ((parcelFileDescriptor2 = this.c) != null ? parcelFileDescriptor2.equals(eulyVar.d()) : eulyVar.d() == null) && ((parcelFileDescriptor3 = this.d) != null ? parcelFileDescriptor3.equals(eulyVar.b()) : eulyVar.b() == null) && ((parcelFileDescriptor4 = this.e) != null ? parcelFileDescriptor4.equals(eulyVar.c()) : eulyVar.c() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        ParcelFileDescriptor parcelFileDescriptor = this.b;
        int iHashCode2 = ((iHashCode * 1000003) ^ (parcelFileDescriptor == null ? 0 : parcelFileDescriptor.hashCode())) * 1000003;
        ParcelFileDescriptor parcelFileDescriptor2 = this.c;
        int iHashCode3 = (iHashCode2 ^ (parcelFileDescriptor2 == null ? 0 : parcelFileDescriptor2.hashCode())) * 1000003;
        ParcelFileDescriptor parcelFileDescriptor3 = this.d;
        int iHashCode4 = (iHashCode3 ^ (parcelFileDescriptor3 == null ? 0 : parcelFileDescriptor3.hashCode())) * 1000003;
        ParcelFileDescriptor parcelFileDescriptor4 = this.e;
        return iHashCode4 ^ (parcelFileDescriptor4 != null ? parcelFileDescriptor4.hashCode() : 0);
    }

    public final String toString() {
        ParcelFileDescriptor parcelFileDescriptor = this.e;
        ParcelFileDescriptor parcelFileDescriptor2 = this.d;
        ParcelFileDescriptor parcelFileDescriptor3 = this.c;
        ParcelFileDescriptor parcelFileDescriptor4 = this.b;
        return "WebrefModel{slices=" + String.valueOf(this.a) + ", modelMetadataProto=" + String.valueOf(parcelFileDescriptor4) + ", wordEmbeddings=" + String.valueOf(parcelFileDescriptor3) + ", refNet=" + String.valueOf(parcelFileDescriptor2) + ", topicalityModel=" + String.valueOf(parcelFileDescriptor) + "}";
    }
}
