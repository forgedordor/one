package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.ims.rcsservice.locationsharing.LocationInformation;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bbgy {
    public static final cqce a = cqce.g("Bugle", "LocationUtils");
    public static final String b = new String(Character.toChars(128205));
    public final Context c;
    public final baii d;

    public bbgy(Context context, baii baiiVar) {
        this.c = context;
        this.d = baiiVar;
    }

    public final String a(MessagePartCoreData messagePartCoreData) {
        if (!messagePartCoreData.bk()) {
            throw new IllegalArgumentException("Cannot generate location sms text for non-location attachment.");
        }
        LocationInformation locationInformationI = messagePartCoreData.I();
        locationInformationI.getClass();
        return this.c.getString(R.string.share_location_prefix, b, String.format(Locale.US, "https://www.google.com/maps/place/%1$.5f,%2$.5f/", Double.valueOf(locationInformationI.d), Double.valueOf(locationInformationI.c)));
    }
}
