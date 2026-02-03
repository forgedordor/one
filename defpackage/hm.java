package defpackage;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Bundle bundle;
        Object objCreateFromParcel = MediaDescription.CREATOR.createFromParcel(parcel);
        if (objCreateFromParcel == null) {
            return null;
        }
        MediaDescription mediaDescription = (MediaDescription) objCreateFromParcel;
        String mediaId = mediaDescription.getMediaId();
        CharSequence title = mediaDescription.getTitle();
        CharSequence subtitle = mediaDescription.getSubtitle();
        CharSequence description = mediaDescription.getDescription();
        Bitmap iconBitmap = mediaDescription.getIconBitmap();
        Uri iconUri = mediaDescription.getIconUri();
        Bundle bundleA = ia.a(mediaDescription.getExtras());
        if (bundleA != null) {
            bundleA = new Bundle(bundleA);
        }
        Uri mediaUri = bundleA != null ? (Uri) bundleA.getParcelable("android.support.v4.media.description.MEDIA_URI") : null;
        if (mediaUri == null) {
            bundle = bundleA;
        } else if (bundleA.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && bundleA.size() == 2) {
            bundle = null;
        } else {
            bundleA.remove("android.support.v4.media.description.MEDIA_URI");
            bundleA.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
            bundle = bundleA;
        }
        if (mediaUri == null) {
            mediaUri = mediaDescription.getMediaUri();
        }
        hn hnVar = new hn(mediaId, title, subtitle, description, iconBitmap, iconUri, bundle, mediaUri);
        hnVar.a = mediaDescription;
        return hnVar;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new hn[i];
    }
}
