package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.api.messaging.conversation.emergency.EmergencyConversationId;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aken implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        Bundle bundle = parcel.readBundle(getClass().getClassLoader());
        if (bundle == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Parcelable parcelable = bundle.getParcelable("proto");
        if (parcelable == null) {
            throw new IllegalStateException("Required value was null.");
        }
        evuh evuhVarA = ((evwl) parcelable).a(akln.a, evrr.a());
        evuhVarA.getClass();
        return new EmergencyConversationId(barn.b(((akln) evuhVarA).c));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new EmergencyConversationId[i];
    }
}
