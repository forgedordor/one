package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.AutoValue_MessageNotification;
import com.google.android.rcs.client.messaging.Conversation;
import com.google.android.rcs.client.messaging.MessageNotification;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efex implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Conversation conversation = (Conversation) efmp.f(parcel, 1, Conversation.CREATOR).get();
        efeu efeuVar = (efeu) efmp.f(parcel, 2, efmg.a).get();
        ejwl.a(efmp.j(parcel).isPresent());
        return new AutoValue_MessageNotification(conversation, efeuVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new MessageNotification[i];
    }
}
