package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.aicore.aidl.ICortanaStateCallback;
import com.google.android.apps.aicore.aidl.ICortanaStreamingCallback;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class shh extends AbstractSafeParcelable implements SafeParcelable {
    public static final Parcelable.Creator<shh> CREATOR = new shi();
    public final ekgb a;
    public final float b;
    public final int c;
    public final int d;
    public final int e;
    public final ekgb f;
    public final int g;
    public final int h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final int m;
    private final ICortanaStreamingCallback n;
    private final ICortanaStateCallback o;

    public shh(List list, float f, int i, int i2, IBinder iBinder, int i3, IBinder iBinder2, List list2, int i4, int i5, String str, String str2, String str3, String str4, int i6) {
        this.a = ekgb.n(list);
        this.b = f;
        this.c = i;
        this.d = i2;
        this.n = iBinder == null ? null : ICortanaStreamingCallback.Stub.asInterface(iBinder);
        this.e = i3;
        this.o = iBinder2 != null ? ICortanaStateCallback.Stub.asInterface(iBinder2) : null;
        this.f = ekgb.n(list2);
        this.g = i4;
        this.h = i5;
        this.i = str;
        this.j = str2;
        this.k = str3;
        this.l = str4;
        this.m = i6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ekgb ekgbVar = this.a;
        int iA = dclw.a(parcel);
        dclw.n(parcel, 1, ekgbVar, false);
        dclw.h(parcel, 2, this.b);
        dclw.i(parcel, 3, this.c);
        dclw.i(parcel, 4, this.d);
        ICortanaStreamingCallback iCortanaStreamingCallback = this.n;
        dclw.u(parcel, 5, iCortanaStreamingCallback == null ? null : iCortanaStreamingCallback.asBinder());
        dclw.i(parcel, 6, this.e);
        ICortanaStateCallback iCortanaStateCallback = this.o;
        dclw.u(parcel, 7, iCortanaStateCallback != null ? iCortanaStateCallback.asBinder() : null);
        dclw.n(parcel, 8, this.f, false);
        dclw.i(parcel, 9, this.g);
        dclw.i(parcel, 10, this.h);
        dclw.m(parcel, 11, this.i, false);
        dclw.m(parcel, 12, this.j, false);
        dclw.m(parcel, 13, this.k, false);
        dclw.m(parcel, 14, this.l, false);
        dclw.i(parcel, 15, this.m);
        dclw.c(parcel, iA);
    }
}
