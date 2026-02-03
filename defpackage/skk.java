package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.aicore.aidl.IImageEmbeddingCallback;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class skk extends AbstractSafeParcelable implements SafeParcelable {
    public static final Parcelable.Creator<skk> CREATOR = new skl();
    public final List a;
    public final int b;
    public final int c;
    private final IImageEmbeddingCallback d;

    public skk(List list, IBinder iBinder, int i, int i2) {
        this.a = list;
        this.d = iBinder == null ? null : IImageEmbeddingCallback.Stub.asInterface(iBinder);
        this.b = i;
        this.c = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int iA = dclw.a(parcel);
        dclw.n(parcel, 1, list, false);
        IImageEmbeddingCallback iImageEmbeddingCallback = this.d;
        dclw.u(parcel, 2, iImageEmbeddingCallback == null ? null : iImageEmbeddingCallback.asBinder());
        dclw.i(parcel, 3, this.b);
        dclw.i(parcel, 4, this.c);
        dclw.c(parcel, iA);
    }
}
