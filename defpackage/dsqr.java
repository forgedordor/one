package defpackage;

import android.app.Activity;
import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsqr extends dtlp {
    private final dspg b;
    private final dsqq c;
    private final String d;
    private static final eksp a = eksp.c("GnpSdk");
    public static final Parcelable.Creator<dsqr> CREATOR = new dsqp();

    public dsqr(Parcel parcel) {
        this.d = parcel.readString();
        this.c = (dsqq) b(parcel, dsqq.class.getClassLoader(), dsqq.class, dsqq.UNKNOWN);
        this.b = (dspg) b(parcel, dspg.class.getClassLoader(), dspg.class, null);
    }

    private static Object b(Parcel parcel, ClassLoader classLoader, Class cls, Object obj) {
        Object serializable;
        try {
            serializable = laa.b() ? parcel.readSerializable(classLoader, cls) : cls.cast(parcel.readSerializable());
        } catch (BadParcelableException | ClassCastException unused) {
            ((eksl) ((eksl) a.j()).h("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/gm/taptarget/FeatureHighlightViewFinder", "readSerializable", 91, "FeatureHighlightViewFinder.java")).t("Failed to read %s data from parcel", cls.getName());
            serializable = null;
        }
        return serializable != null ? serializable : obj;
    }

    @Override // defpackage.dtlp
    public final View a(Activity activity, View view) throws NumberFormatException {
        dspg dspgVar = this.b;
        if (dspgVar == null) {
            return null;
        }
        int iOrdinal = this.c.ordinal();
        if (iOrdinal == 1) {
            return dspgVar.a(activity, view, this.d);
        }
        if (iOrdinal == 2) {
            return dspgVar.b(activity, view, this.d);
        }
        if (iOrdinal != 3) {
            return null;
        }
        Integer.parseInt(this.d);
        return dspgVar.d(activity);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.d);
        parcel.writeSerializable(this.c);
        parcel.writeSerializable(this.b);
    }

    public dsqr(dspg dspgVar, etnx etnxVar) {
        this.b = dspgVar;
        int i = etnxVar.c;
        int i2 = i != 0 ? i != 1 ? i != 10 ? i != 11 ? 0 : 3 : 2 : 1 : 4;
        if (i2 == 0) {
            throw null;
        }
        int i3 = i2 - 1;
        if (i3 == 0) {
            this.d = i == 1 ? (String) etnxVar.d : "";
            this.c = dsqq.ID;
            return;
        }
        if (i3 == 1) {
            this.d = i == 10 ? (String) etnxVar.d : "";
            this.c = dsqq.TAG;
        } else if (i3 != 2) {
            ((eksl) ((eksl) a.j()).h("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/gm/taptarget/FeatureHighlightViewFinder", "<init>", 58, "FeatureHighlightViewFinder.java")).q("No tap target element was specified.");
            this.d = "";
            this.c = dsqq.UNKNOWN;
        } else {
            this.d = String.valueOf(i == 11 ? ((Integer) etnxVar.d).intValue() : 0);
            this.c = dsqq.VE_ID;
        }
    }
}
