package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.aicore.aidl.IQuestionToAnswerStreamingCallback;
import com.google.android.apps.aicore.aidl.ITaskStateChangeCallback;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sjo extends AbstractSafeParcelable implements SafeParcelable {
    public static final Parcelable.Creator<sjo> CREATOR = new sjp();
    public final String a;
    public final int b;
    public final String c;
    public final ekgb d;
    public final String e;
    public final smg f;
    private final ITaskStateChangeCallback g;
    private final IQuestionToAnswerStreamingCallback h;

    public sjo(String str, String str2, int i, IBinder iBinder, IBinder iBinder2, List list, String str3, smg smgVar) {
        this.a = str;
        this.c = str2;
        this.b = i;
        this.g = iBinder == null ? null : ITaskStateChangeCallback.Stub.asInterface(iBinder);
        this.h = iBinder2 == null ? null : IQuestionToAnswerStreamingCallback.Stub.asInterface(iBinder2);
        this.d = list != null ? ekgb.n(list) : null;
        this.e = str3;
        this.f = smgVar == null ? smg.a : smgVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, str, false);
        dclw.i(parcel, 2, this.b);
        dclw.m(parcel, 3, this.c, false);
        ITaskStateChangeCallback iTaskStateChangeCallback = this.g;
        dclw.u(parcel, 4, iTaskStateChangeCallback == null ? null : iTaskStateChangeCallback.asBinder());
        dclw.D(parcel, 5, this.d);
        dclw.m(parcel, 6, this.e, false);
        IQuestionToAnswerStreamingCallback iQuestionToAnswerStreamingCallback = this.h;
        dclw.u(parcel, 7, iQuestionToAnswerStreamingCallback != null ? iQuestionToAnswerStreamingCallback.asBinder() : null);
        dclw.k(parcel, 8, this.f, i, false);
        dclw.c(parcel, iA);
    }
}
