package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ajxa implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Bundle bundle = parcel.readBundle(getClass().getClassLoader());
        bundle.getClass();
        evwl evwlVar = (evwl) bundle.getParcelable("proto");
        evwlVar.getClass();
        aklp aklpVar = (aklp) evwlVar.a(aklp.a, evrr.a());
        DefaultConversation.a aVar = (DefaultConversation.a) cqtf.a(DefaultConversation.a.class);
        return aVar.ah().a(new BugleConversationId(barn.b(aklpVar.b)), aklpVar.c);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new DefaultConversation[i];
    }
}
