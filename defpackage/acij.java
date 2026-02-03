package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.helpandfeedback.advancedfeedback.ui.AdvancedFeedbackActivity;
import j$.util.function.Consumer$CC;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acij implements acif {
    private final fcsu a;
    private final fcsu b;

    public acij(fcsu fcsuVar, fcsu fcsuVar2) {
        this.a = fcsuVar;
        this.b = fcsuVar2;
    }

    @Override // defpackage.acif
    public final Intent a(Context context, acie acieVar) {
        final Intent intentA = aiiw.c(context, AdvancedFeedbackActivity.class, "android.intent.action.VIEW").a();
        acil acilVar = (acil) acieVar;
        intentA.putExtra("advanced_feedback_config_data", acilVar.c.k);
        acilVar.b.ifPresent(new Consumer() { // from class: acih
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                intentA.putExtra("report_issue_type_value_extra", ((emgm) obj).o);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        acilVar.a.ifPresent(new Consumer() { // from class: acii
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                intentA.putExtra("advanced_feedback_throwable_string_key", ebul.a((Throwable) obj));
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return intentA;
    }

    @Override // defpackage.acif
    public final void b(final Context context, acie acieVar) {
        if (!((Boolean) ackx.a.e()).booleanValue()) {
            throw new IllegalStateException("Expect advanced feedback pheontype flag is on");
        }
        final Intent intentA = a(context, acieVar);
        final Bitmap bitmapA = null;
        if (((acil) acieVar).c.equals(elie.BUGLE_ADVANCED_FEEDBACK_SOURCE_NOTIFICATION_GENERIC)) {
            intentA.addFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
        } else {
            Activity activityF = dakl.f(context);
            if (activityF != null) {
                bitmapA = dcwi.a(activityF);
            }
        }
        if (bitmapA == null) {
            context.startActivity(intentA);
        } else {
            final acnp acnpVar = (acnp) this.a.b();
            eijx.g(new Callable() { // from class: acnn
                @Override // java.util.concurrent.Callable
                public final Object call() throws IOException {
                    File file = new File(acnpVar.a.getCacheDir().getPath(), "temp_feedback_screenshot_" + String.valueOf(UUID.randomUUID()) + ".png");
                    Bitmap bitmap = bitmapA;
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                        fileOutputStream.close();
                        return file;
                    } catch (IOException e) {
                        throw new IllegalStateException("Failed to write screenshot to temp file", e);
                    }
                }
            }, acnpVar.b).k(auvh.c(new Consumer() { // from class: acig
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    String path = ((File) obj).getPath();
                    Intent intent = intentA;
                    intent.putExtra("advanced_feedback_screenshot_key", path);
                    context.startActivity(intent);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            }), (Executor) this.b.b());
        }
    }
}
