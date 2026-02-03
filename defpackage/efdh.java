package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.AutoValue_Conversation;
import com.google.android.rcs.client.messaging.Conversation;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efdh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = new int[]{1, 2}[((Integer) efmp.d(parcel, 1).get()).intValue()];
        if (i == 0) {
            throw new NullPointerException("Null type");
        }
        String str = (String) efmp.h(parcel, 2).get();
        effi effiVar = (effi) efmp.f(parcel, 3, efmr.a).get();
        ejwl.a(efmp.j(parcel).isPresent());
        return new AutoValue_Conversation(i, effiVar, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new Conversation[i];
    }
}
