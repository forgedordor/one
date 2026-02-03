package defpackage;

import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dons {
    public final dofn a;
    public final ImageView.ScaleType b;
    public final boolean c;

    /* JADX WARN: Multi-variable type inference failed */
    public dons() {
        this((dofn) null, (ImageView.ScaleType) (0 == true ? 1 : 0), 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dons)) {
            return false;
        }
        dons donsVar = (dons) obj;
        return fdbq.f(this.a, donsVar.a) && this.b == donsVar.b && this.c == donsVar.c;
    }

    public final int hashCode() {
        dofn dofnVar = this.a;
        int iHashCode = dofnVar == null ? 0 : dofnVar.hashCode();
        ImageView.ScaleType scaleType = this.b;
        return (((iHashCode * 31) + (scaleType != null ? scaleType.hashCode() : 0)) * 31) + (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        return "MediaViewHolderConfiguration(aspectRatio=" + this.a + ", scaleType=" + this.b + ", getCoordinatesOnLongPress=" + this.c + ")";
    }

    public dons(dofn dofnVar, ImageView.ScaleType scaleType, boolean z) {
        this.a = dofnVar;
        this.b = scaleType;
        this.c = z;
    }

    public /* synthetic */ dons(dofn dofnVar, ImageView.ScaleType scaleType, int i) {
        this(1 == (i & 1) ? null : dofnVar, (i & 2) != 0 ? ImageView.ScaleType.CENTER_CROP : scaleType, false);
    }
}
