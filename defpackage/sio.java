package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.aicore.aidl.IImageEmbeddingCallback;
import com.google.android.apps.aicore.aidl.ILLMStreamingCallback;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sio extends AbstractSafeParcelable implements SafeParcelable {
    public static final Parcelable.Creator<sio> CREATOR = new sip();
    public final ekgb a;
    public final float b;
    public final int c;
    public final ekgb d;
    public final int e;
    public final int f;
    public final boolean g;
    public final int h;
    public final int i;
    public final int j;
    public final String k;
    public final Bundle l;
    public final int m;
    public final smg n;
    private final ILLMStreamingCallback o;
    private final IImageEmbeddingCallback p;

    static {
        ekgb.t("auxiliary_lora_file", "auxiliary_drafter_lora_file", "auxiliary_session_state_file");
    }

    public sio(List list, float f, int i, List list2, int i2, int i3, IBinder iBinder, boolean z, int i4, IBinder iBinder2, int i5, int i6, String str, Bundle bundle, int i7, smg smgVar) {
        this.a = ekgb.n(list);
        this.b = f;
        this.c = i;
        this.d = ekgb.n(list2);
        this.e = i2;
        this.f = i3;
        this.o = iBinder == null ? null : ILLMStreamingCallback.Stub.asInterface(iBinder);
        this.g = z;
        this.h = i4;
        this.p = iBinder2 != null ? IImageEmbeddingCallback.Stub.asInterface(iBinder2) : null;
        this.i = i5;
        this.j = i6;
        this.k = str;
        this.l = bundle;
        this.m = i7;
        this.n = smgVar == null ? smg.a : smgVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ekgb ekgbVar = this.a;
        int iA = dclw.a(parcel);
        dclw.n(parcel, 1, ekgbVar, false);
        dclw.h(parcel, 2, this.b);
        dclw.i(parcel, 3, this.c);
        dclw.D(parcel, 4, this.d);
        dclw.i(parcel, 5, this.e);
        dclw.i(parcel, 6, this.f);
        ILLMStreamingCallback iLLMStreamingCallback = this.o;
        dclw.u(parcel, 7, iLLMStreamingCallback == null ? null : iLLMStreamingCallback.asBinder());
        dclw.d(parcel, 8, this.g);
        dclw.i(parcel, 9, this.h);
        IImageEmbeddingCallback iImageEmbeddingCallback = this.p;
        dclw.u(parcel, 10, iImageEmbeddingCallback != null ? iImageEmbeddingCallback.asBinder() : null);
        dclw.i(parcel, 11, this.i);
        dclw.i(parcel, 12, this.j);
        dclw.m(parcel, 13, this.k, false);
        dclw.p(parcel, 14, this.l);
        dclw.i(parcel, 15, this.m);
        dclw.k(parcel, 16, this.n, i, false);
        dclw.c(parcel, iA);
    }
}
