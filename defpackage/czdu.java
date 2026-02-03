package defpackage;

import com.google.android.apps.messaging.ui.mediapicker.c2o.location.picker.LocationAttachmentPickerActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czdu extends abs {
    final /* synthetic */ LocationAttachmentPickerActivity a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public czdu(LocationAttachmentPickerActivity locationAttachmentPickerActivity) {
        super(true);
        this.a = locationAttachmentPickerActivity;
    }

    @Override // defpackage.abs
    public final void b() {
        LocationAttachmentPickerActivity locationAttachmentPickerActivity = this.a;
        locationAttachmentPickerActivity.Q.c("Bugle.Share.LocationAttachmentPicker.ExitedWithoutSending");
        h(false);
        locationAttachmentPickerActivity.c().d();
    }
}
