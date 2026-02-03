package defpackage;

import com.google.android.apps.messaging.ui.mediapicker.c2o.location.picker.LocationAttachmentPickerActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class czdt {
    public final /* synthetic */ LocationAttachmentPickerActivity a;
    public final /* synthetic */ ddqx b;

    public /* synthetic */ czdt(LocationAttachmentPickerActivity locationAttachmentPickerActivity, ddqx ddqxVar) {
        this.a = locationAttachmentPickerActivity;
        this.b = ddqxVar;
    }

    public final void a(ddqo ddqoVar) {
        ((ekrd) ((ekrd) LocationAttachmentPickerActivity.K.h()).h("com/google/android/apps/messaging/ui/mediapicker/c2o/location/picker/LocationAttachmentPickerActivity", "initializeViews", 242, "LocationAttachmentPickerActivity.java")).t("Initialized maps SDK with %s renderer", ddqoVar);
        if (!dcnm.a()) {
            throw new IllegalStateException("getMapAsync must be called on the main thread.");
        }
        ddqx ddqxVar = this.b;
        LocationAttachmentPickerActivity locationAttachmentPickerActivity = this.a;
        ddqw ddqwVar = ddqxVar.a;
        dcvl dcvlVar = ddqwVar.a;
        if (dcvlVar != null) {
            ((ddqv) dcvlVar).getMapAsync(locationAttachmentPickerActivity);
        } else {
            ddqwVar.d.add(locationAttachmentPickerActivity);
        }
    }
}
