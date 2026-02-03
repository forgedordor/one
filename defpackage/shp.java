package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.aicore.aidl.IImageDescriptionStreamingCallback;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class shp extends AbstractSafeParcelable implements SafeParcelable {
    public static final Parcelable.Creator<shp> CREATOR = new shq();
    public final List a;
    public final String b;
    public final int c;
    private final IImageDescriptionStreamingCallback d;

    public shp(List list, IBinder iBinder, String str, int i) {
        this.a = list;
        this.d = iBinder == null ? null : IImageDescriptionStreamingCallback.Stub.asInterface(iBinder);
        this.b = str;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int iA = dclw.a(parcel);
        dclw.n(parcel, 1, list, false);
        IImageDescriptionStreamingCallback iImageDescriptionStreamingCallback = this.d;
        dclw.u(parcel, 2, iImageDescriptionStreamingCallback == null ? null : iImageDescriptionStreamingCallback.asBinder());
        dclw.m(parcel, 3, this.b, false);
        dclw.i(parcel, 4, this.c);
        dclw.c(parcel, iA);
    }
}
