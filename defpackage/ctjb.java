package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.startchat.chip.ChipData;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctjb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        ChipData.a aVar = (ChipData.a) cqtf.a(ChipData.a.class);
        Bundle bundle = parcel.readBundle(ctja.class.getClassLoader());
        if (bundle == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        String string = bundle.getString(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT);
        if (string == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        alre alreVarK = aVar.K();
        Parcelable parcelable = bundle.getParcelable("identity");
        if (parcelable != null) {
            return new ChipData(alreVarK.a((evwl) parcelable), string, bundle.getString("lookup"), (Uri) bundle.getParcelable("photo"), bundle.getBoolean("pinned", false));
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ChipData[i];
    }
}
