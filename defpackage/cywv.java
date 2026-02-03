package defpackage;

import android.content.Intent;
import com.google.android.apps.messaging.ui.mediapicker.c2o.customization.CategoryCustomizationActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cywv extends abs {
    final /* synthetic */ CategoryCustomizationActivity a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cywv(CategoryCustomizationActivity categoryCustomizationActivity) {
        super(true);
        this.a = categoryCustomizationActivity;
    }

    @Override // defpackage.abs
    public final void b() {
        Intent intent = new Intent();
        CategoryCustomizationActivity categoryCustomizationActivity = this.a;
        intent.putExtra("customization_model", categoryCustomizationActivity.K);
        categoryCustomizationActivity.setResult(-1, intent);
        categoryCustomizationActivity.ae(emsh.UNKNOWN_CLOSING_SOURCE);
        categoryCustomizationActivity.finish();
    }
}
