package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cqy implements Parcelable {
    public static final Parcelable.Creator<cqy> CREATOR = new cqx();
    private final Bundle a;

    public cqy(Bundle bundle) {
        this.a = bundle;
    }

    public final Object a() {
        int i = crd.a;
        boolean zIsLoggable = Log.isLoggable("CarApp.Bun", 3);
        Bundle bundle = this.a;
        if (zIsLoggable) {
            Log.d("CarApp.Bun", "Unbundling ".concat(crd.c(bundle.getInt("tag_class_type"))));
        }
        return crd.b(bundle, crb.a());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.a);
    }

    public cqy(Object obj) {
        String strE = crd.e(obj.getClass());
        if (Log.isLoggable("CarApp.Bun", 3)) {
            Log.d("CarApp.Bun", "Bundling ".concat(String.valueOf(strE)));
        }
        this.a = crd.a(obj, strE, crb.a());
    }
}
