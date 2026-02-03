package defpackage;

import android.media.MediaMetadataRetriever;
import android.util.Size;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class domu extends domt {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public domu(fdjx fdjxVar) {
        super(fdjxVar);
        fdjxVar.getClass();
    }

    @Override // defpackage.domt
    public final /* bridge */ /* synthetic */ domh a(MediaMetadataRetriever mediaMetadataRetriever) throws NumberFormatException {
        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
        if (strExtractMetadata == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        int i = Integer.parseInt(strExtractMetadata);
        if (i <= 0) {
            throw new IllegalArgumentException("Video width resolved to non positive value.");
        }
        String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
        if (strExtractMetadata2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        int i2 = Integer.parseInt(strExtractMetadata2);
        if (i2 <= 0) {
            throw new IllegalArgumentException("Video height resolved to non positive value.");
        }
        String strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
        return new domg(c(mediaMetadataRetriever), dngm.a(new Size(i, i2), strExtractMetadata3 != null ? Integer.parseInt(strExtractMetadata3) : 0), d(mediaMetadataRetriever));
    }
}
