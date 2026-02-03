package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.appindexing.internal.Thing;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esbm extends AbstractSafeParcelable implements dcfx {
    public static final Parcelable.Creator<esbm> CREATOR = new esbn();
    public final Status a;
    public final Thing b;

    public esbm(Status status, Thing thing) {
        this.a = status;
        this.b = thing;
    }

    @Override // defpackage.dcfx
    public final Status a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Status status = this.a;
        int iA = dclw.a(parcel);
        dclw.k(parcel, 1, status, i, false);
        dclw.k(parcel, 2, this.b, i, false);
        dclw.c(parcel, iA);
    }
}
