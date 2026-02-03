package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doea implements doeb {
    public final fdvc a;
    public final fdae b;
    public final fdvc c;
    public final fdvc d;
    public final fdvc e;
    public final fdae f;
    private final int g = R.string.magic_compose_storage_error_message;
    private final int h = R.string.magic_compose_storage_settings_link;

    public doea(fdvc fdvcVar, fdae fdaeVar, fdvc fdvcVar2, fdvc fdvcVar3, fdvc fdvcVar4, fdae fdaeVar2) {
        this.a = fdvcVar;
        this.b = fdaeVar;
        this.c = fdvcVar2;
        this.d = fdvcVar3;
        this.e = fdvcVar4;
        this.f = fdaeVar2;
    }

    @Override // defpackage.doeb
    public final int a() {
        return R.string.magic_compose_feature_downloading_error_message;
    }

    @Override // defpackage.doeb
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof doea)) {
            return false;
        }
        doea doeaVar = (doea) obj;
        if (!fdbq.f(this.a, doeaVar.a)) {
            return false;
        }
        int i = doeaVar.g;
        int i2 = doeaVar.h;
        return fdbq.f(this.b, doeaVar.b) && fdbq.f(this.c, doeaVar.c) && fdbq.f(this.d, doeaVar.d) && fdbq.f(this.e, doeaVar.e) && fdbq.f(this.f, doeaVar.f);
    }

    public final int hashCode() {
        fdvc fdvcVar = this.a;
        int iHashCode = fdvcVar == null ? 0 : fdvcVar.hashCode();
        fdae fdaeVar = this.b;
        int iHashCode2 = fdaeVar == null ? 0 : fdaeVar.hashCode();
        fdvc fdvcVar2 = this.c;
        int iHashCode3 = ((((((((iHashCode * 31) + R.string.magic_compose_storage_error_message) * 31) + R.string.magic_compose_storage_settings_link) * 31) + iHashCode2) * 31) + (fdvcVar2 == null ? 0 : fdvcVar2.hashCode())) * 31;
        fdvc fdvcVar3 = this.d;
        int iHashCode4 = (iHashCode3 + (fdvcVar3 == null ? 0 : fdvcVar3.hashCode())) * 31;
        fdvc fdvcVar4 = this.e;
        return ((iHashCode4 + (fdvcVar4 != null ? fdvcVar4.hashCode() : 0)) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "FeatureDownload(isStorageInsufficientFlow=" + this.a + ", storageInsufficientErrorMessageStringResource=2132085363, storageLinkTextStringResource=2132085364, onStorageLinkClicked=" + this.b + ", bytesToDownloadFlow=" + this.c + ", totalBytesDownloadedFlow=" + this.d + ", downloadCompleteFlow=" + this.e + ", onDownloadComplete=" + this.f + ")";
    }
}
