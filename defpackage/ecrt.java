package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ecrt extends ClickableSpan {
    final /* synthetic */ String a;
    final /* synthetic */ Activity b;
    final /* synthetic */ String c;

    public ecrt(String str, Activity activity, String str2) {
        this.a = str;
        this.b = activity;
        this.c = str2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        ecsc ecscVar = new ecsc();
        String str = this.a;
        if (str != null) {
            ecrw.d(this.b, str);
        } else {
            try {
                Activity activity = this.b;
                String str2 = this.c;
                activity.getClass();
                if (str2 == null || str2.isEmpty()) {
                    eawy.a(activity);
                } else {
                    Intent intentPutExtra = new Intent("com.google.android.gms.accountsettings.action.VIEW_SETTINGS").setPackage("com.google.android.gms").putExtra("extra.accountName", str2).putExtra("extra.screenId", 500);
                    if (intentPutExtra.resolveActivity(activity.getPackageManager()) == null) {
                        eawy.a(activity);
                    } else {
                        activity.startActivityForResult(intentPutExtra, 0);
                    }
                }
            } catch (eawx e) {
                Log.e("ResourceUtils", "No app found to open URL: ".concat(String.valueOf(e.a)));
            }
        }
        Activity activity2 = this.b;
        String str3 = this.c;
        ecsj ecsjVar = ecrz.c;
        if (ecrz.c(fbka.b(ecrz.b))) {
            ecsa ecsaVarA = ecsa.a();
            exhv exhvVar = (exhv) exhx.a.createBuilder();
            exhvVar.copyOnWrite();
            ((exhx) exhvVar.instance).b = 0;
            exhvVar.copyOnWrite();
            ((exhx) exhvVar.instance).c = exhw.a(4);
            ecsaVarA.d((exhx) exhvVar.build(), ecscVar.b(), ecscVar.a(), activity2, str3);
        }
    }
}
