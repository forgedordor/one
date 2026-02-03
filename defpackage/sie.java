package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.aicore.aidl.IInfoExtractionStreamingCallback;
import com.google.android.apps.aicore.aidl.ITaskStateChangeCallback;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sie extends AbstractSafeParcelable implements SafeParcelable {
    public static final Parcelable.Creator<sie> CREATOR = new sif();
    public final ekgb a;
    public final int b;
    public final int c;
    public final int d;
    public final String e;
    public final Float f;
    public final Integer g;
    public final smg h;
    public final ekgb i;
    private final IInfoExtractionStreamingCallback j;
    private final ITaskStateChangeCallback k;

    public sie(List list, int i, IBinder iBinder, int i2, int i3, IBinder iBinder2, String str, Float f, Integer num, smg smgVar, List list2) {
        this.a = list == null ? null : ekgb.n(list);
        this.b = i;
        this.j = iBinder == null ? null : IInfoExtractionStreamingCallback.Stub.asInterface(iBinder);
        this.k = iBinder2 == null ? null : ITaskStateChangeCallback.Stub.asInterface(iBinder2);
        this.c = i2;
        this.d = i3;
        this.e = str;
        this.f = f;
        this.g = num;
        this.h = smgVar == null ? smg.a : smgVar;
        this.i = list2 != null ? ekgb.n(list2) : null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ekgb ekgbVar = this.a;
        int iA = dclw.a(parcel);
        dclw.n(parcel, 1, ekgbVar, false);
        dclw.i(parcel, 2, this.b);
        IInfoExtractionStreamingCallback iInfoExtractionStreamingCallback = this.j;
        dclw.u(parcel, 3, iInfoExtractionStreamingCallback == null ? null : iInfoExtractionStreamingCallback.asBinder());
        dclw.i(parcel, 4, this.c);
        dclw.i(parcel, 5, this.d);
        ITaskStateChangeCallback iTaskStateChangeCallback = this.k;
        dclw.u(parcel, 6, iTaskStateChangeCallback != null ? iTaskStateChangeCallback.asBinder() : null);
        dclw.m(parcel, 7, this.e, false);
        dclw.t(parcel, 8, this.f);
        dclw.x(parcel, 9, this.g);
        dclw.k(parcel, 10, this.h, i, false);
        dclw.n(parcel, 11, this.i, false);
        dclw.c(parcel, iA);
    }
}
