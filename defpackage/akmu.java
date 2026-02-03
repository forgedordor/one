package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.api.messaging.conversation.rbm.RbmConversationId;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akmu implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Bundle bundle = parcel.readBundle(getClass().getClassLoader());
        bundle.getClass();
        evwl evwlVar = (evwl) bundle.getParcelable("proto");
        evwlVar.getClass();
        return new RbmConversationId(barn.b(((akln) evwlVar.a(akln.a, evrr.a())).c));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new RbmConversationId[i];
    }
}
