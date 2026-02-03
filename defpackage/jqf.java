package defpackage;

import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jqf {
    public final Object a;
    public final View b;

    public jqf(ContentCaptureSession contentCaptureSession, View view) {
        this.a = contentCaptureSession;
        this.b = view;
    }

    public final AutofillId a(long j) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        Object obj = this.a;
        return ied$$ExternalSyntheticApiModelOutline0.m(obj).newAutofillId(iy$$ExternalSyntheticApiModelOutline1.m511m(jqg.a(this.b).a), j);
    }
}
