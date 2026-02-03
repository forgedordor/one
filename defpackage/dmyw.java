package defpackage;

import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmyw implements dpxp {
    public static final fctc a = fctd.a(new fdae() { // from class: dmyv
        @Override // defpackage.fdae
        public final Object invoke() {
            fctc fctcVar = dmyw.a;
            dohf dohfVar = dohm.b;
            List listA = dogr.a();
            fctc fctcVar2 = dojm.b;
            return fcva.ah(listA, doir.a());
        }
    });
    public final Integer b;
    public final int c;
    public final dnbx d;
    public final dmiv e;
    public final fctc f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;

    public dmyw() {
        this((dnbx) null, (dmiv) null, (fctc) null, false, false, false, false, 1023);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmyw)) {
            return false;
        }
        dmyw dmywVar = (dmyw) obj;
        Integer num = dmywVar.b;
        if (!fdbq.f(null, null) || this.c != dmywVar.c || !fdbq.f(this.d, dmywVar.d) || !fdbq.f(this.e, dmywVar.e) || !fdbq.f(this.f, dmywVar.f) || this.g != dmywVar.g) {
            return false;
        }
        boolean z = dmywVar.h;
        return this.i == dmywVar.i && this.j == dmywVar.j && this.k == dmywVar.k;
    }

    public final int hashCode() {
        int iHashCode = (this.c * 31) + this.d.hashCode();
        dmiv dmivVar = this.e;
        return (((((((((((((iHashCode * 31) + (dmivVar == null ? 0 : dmivVar.hashCode())) * 31) + this.f.hashCode()) * 31) + dmyu.a(this.g)) * 31) + dmyu.a(false)) * 31) + dmyu.a(this.i)) * 31) + dmyu.a(this.j)) * 31) + dmyu.a(this.k);
    }

    public final String toString() {
        return "CameraGalleryConfiguration(columnMaxCount=null, columnMinWidth=" + this.c + ", systemContentPicker=" + this.d + ", camera=" + this.e + ", supportedFormats=" + this.f + ", expandToMaxHeightUponHeaderAppearance=" + this.g + ", autoScrollToTopOnRefresh=false, observeDraftAttachmentsController=" + this.i + ", requireFullVisibleRowsInScrollCalculation=" + this.j + ", skipGalleryInvalidationDuringLayout=" + this.k + ")";
    }

    public dmyw(int i, dnbx dnbxVar, dmiv dmivVar, fctc fctcVar, boolean z, boolean z2, boolean z3, boolean z4) {
        dnbxVar.getClass();
        fctcVar.getClass();
        this.b = null;
        this.c = i;
        this.d = dnbxVar;
        this.e = dmivVar;
        this.f = fctcVar;
        this.g = z;
        this.h = false;
        this.i = z2;
        this.j = z3;
        this.k = z4;
    }

    public /* synthetic */ dmyw(dnbx dnbxVar, dmiv dmivVar, fctc fctcVar, boolean z, boolean z2, boolean z3, boolean z4, int i) {
        this((i & 2) != 0 ? R.dimen.gallery_item_min_width : 0, (i & 4) != 0 ? new dnbx(false, false, 15) : dnbxVar, (i & 8) != 0 ? null : dmivVar, (i & 16) != 0 ? a : fctcVar, ((i & 32) == 0) & z, (!((i & 128) == 0)) | z2, (!((i & 256) == 0)) | z3, ((i & 512) == 0) & z4);
    }
}
