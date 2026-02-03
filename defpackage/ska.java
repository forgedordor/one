package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.apps.aicore.aidl.IRosieRobotStreamingCallback;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ska extends AbstractSafeParcelable implements SafeParcelable {
    public static final Parcelable.Creator<ska> CREATOR = new skb();

    @Deprecated
    public final byte[] a;
    public final String b;
    public final int c;
    public final ParcelFileDescriptor d;
    public final String e;
    public final String f;
    public final boolean g;
    private final IRosieRobotStreamingCallback h;

    public ska(byte[] bArr, String str, int i, ParcelFileDescriptor parcelFileDescriptor, String str2, String str3, boolean z, IBinder iBinder) {
        this.a = bArr;
        this.b = str;
        this.c = i;
        this.d = parcelFileDescriptor;
        this.e = str2;
        this.f = str3;
        this.g = z;
        this.h = iBinder == null ? null : IRosieRobotStreamingCallback.Stub.asInterface(iBinder);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.a;
        int iA = dclw.a(parcel);
        dclw.f(parcel, 1, bArr, false);
        dclw.m(parcel, 2, this.b, false);
        dclw.i(parcel, 3, this.c);
        dclw.k(parcel, 4, this.d, i, false);
        dclw.m(parcel, 5, this.e, false);
        dclw.m(parcel, 6, this.f, false);
        dclw.d(parcel, 7, this.g);
        IRosieRobotStreamingCallback iRosieRobotStreamingCallback = this.h;
        dclw.u(parcel, 8, iRosieRobotStreamingCallback == null ? null : iRosieRobotStreamingCallback.asBinder());
        dclw.c(parcel, iA);
    }
}
