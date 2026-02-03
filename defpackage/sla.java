package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.aicore.aidl.ISummarizationStreamingCallback;
import com.google.android.apps.aicore.aidl.ITaskStateChangeCallback;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sla extends AbstractSafeParcelable implements SafeParcelable {
    public static final Parcelable.Creator<sla> CREATOR = new slb();
    public final ekgb a;
    public final float b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final skw i;
    public final int j;
    private final ISummarizationStreamingCallback k;
    private final ITaskStateChangeCallback l;

    public sla(List list, float f, int i, int i2, int i3, IBinder iBinder, int i4, int i5, IBinder iBinder2, int i6, skw skwVar, int i7) {
        this.a = ekgb.n(list);
        this.b = f;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.k = iBinder == null ? null : ISummarizationStreamingCallback.Stub.asInterface(iBinder);
        this.f = i4;
        this.g = i5;
        this.l = iBinder2 != null ? ITaskStateChangeCallback.Stub.asInterface(iBinder2) : null;
        this.h = i6;
        this.i = skwVar;
        this.j = i7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ekgb ekgbVar = this.a;
        int iA = dclw.a(parcel);
        dclw.n(parcel, 1, ekgbVar, false);
        dclw.h(parcel, 2, this.b);
        dclw.i(parcel, 3, this.c);
        dclw.i(parcel, 4, this.d);
        dclw.i(parcel, 5, this.e);
        ISummarizationStreamingCallback iSummarizationStreamingCallback = this.k;
        dclw.u(parcel, 6, iSummarizationStreamingCallback == null ? null : iSummarizationStreamingCallback.asBinder());
        dclw.i(parcel, 7, this.f);
        dclw.i(parcel, 8, this.g);
        ITaskStateChangeCallback iTaskStateChangeCallback = this.l;
        dclw.u(parcel, 9, iTaskStateChangeCallback != null ? iTaskStateChangeCallback.asBinder() : null);
        dclw.i(parcel, 10, this.h);
        dclw.k(parcel, 11, this.i, i, false);
        dclw.i(parcel, 12, this.j);
        dclw.c(parcel, iA);
    }
}
