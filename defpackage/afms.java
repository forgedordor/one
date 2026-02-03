package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.multishare.chip.ChipData;
import com.google.android.apps.messaging.multishare.chip.ChipId;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afms implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        Bundle bundle = parcel.readBundle(afmr.class.getClassLoader());
        if (bundle == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Object objA = ih.a(bundle, "chip_id", ChipId.class);
        if (objA == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        ChipId chipId = (ChipId) objA;
        String string = bundle.getString(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT);
        if (string != null) {
            return new ChipData(chipId, string, bundle.getString("lookup"), (Uri) ih.a(bundle, "photo", Uri.class), bundle.getBoolean("clip"));
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ChipData[i];
    }
}
