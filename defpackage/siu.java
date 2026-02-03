package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.aicore.aidl.IMagicRewriteStreamingCallback;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class siu extends AbstractSafeParcelable implements SafeParcelable {
    public static final Parcelable.Creator<siu> CREATOR = new siv();
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final smg f;
    private final IMagicRewriteStreamingCallback g;

    public siu(String str, int i, smg smgVar) {
        this.a = str;
        this.b = 1;
        this.c = i;
        this.g = null;
        this.d = 0;
        this.e = 0;
        this.f = smgVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, str, false);
        dclw.i(parcel, 2, this.b);
        dclw.i(parcel, 3, this.c);
        IMagicRewriteStreamingCallback iMagicRewriteStreamingCallback = this.g;
        dclw.u(parcel, 4, iMagicRewriteStreamingCallback == null ? null : iMagicRewriteStreamingCallback.asBinder());
        dclw.i(parcel, 5, this.d);
        dclw.i(parcel, 6, this.e);
        dclw.k(parcel, 7, this.f, i, false);
        dclw.c(parcel, iA);
    }

    public siu(String str, int i, int i2, IBinder iBinder, int i3, int i4, smg smgVar) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.g = iBinder == null ? null : IMagicRewriteStreamingCallback.Stub.asInterface(iBinder);
        this.d = i3;
        this.e = i4;
        this.f = smgVar == null ? smg.a : smgVar;
    }
}
