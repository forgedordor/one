package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.ui.mediapicker.c2o.contact.VCardContentItem;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cywi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        ((bahv) ((VCardContentItem.a) cqtf.a(VCardContentItem.a.class)).dc().a.b()).getClass();
        parcel.getClass();
        return new VCardContentItem(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new VCardContentItem[i];
    }
}
