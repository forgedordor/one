package defpackage;

import android.app.Activity;
import android.app.UiModeManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecrw {
    public static Drawable a(Drawable drawable, Context context, int i) {
        Drawable drawableMutate = drawable.getConstantState().newDrawable(context.getResources()).mutate();
        drawableMutate.setColorFilter(i, PorterDuff.Mode.SRC_ATOP);
        return drawableMutate;
    }

    public static List b(Context context, String str, Bundle bundle) throws PackageManager.NameNotFoundException {
        Resources resources = context.getResources();
        exny exnyVarD = ecse.d(context);
        exnv exnvVar = exnyVarD.c;
        if (exnvVar == null) {
            exnvVar = exnv.a;
        }
        evrj evrjVar = exnvVar.e;
        if (evrjVar == null) {
            evrjVar = evrj.a;
        }
        exnr exnrVar = exnvVar.c;
        if (exnrVar == null) {
            exnrVar = exnr.a;
        }
        exnu exnuVar = exnvVar.d;
        if (exnuVar == null) {
            exnuVar = exnu.a;
        }
        exnx exnxVar = exnyVarD.d;
        if (exnxVar == null) {
            exnxVar = exnx.a;
        }
        ArrayList arrayList = new ArrayList(15);
        long nanos = TimeUnit.SECONDS.toNanos(evrjVar.b) + evrjVar.c;
        g(R.string.survey_email_address, str, arrayList, resources);
        g(R.string.survey_timezone_offset, String.format("%02d:%02d:%02d", Long.valueOf(TimeUnit.NANOSECONDS.toHours(nanos)), Long.valueOf(TimeUnit.NANOSECONDS.toMinutes(nanos) - TimeUnit.HOURS.toMinutes(TimeUnit.NANOSECONDS.toHours(nanos))), Long.valueOf(TimeUnit.NANOSECONDS.toSeconds(nanos) - TimeUnit.MINUTES.toSeconds(TimeUnit.NANOSECONDS.toMinutes(nanos)))), arrayList, resources);
        g(R.string.survey_user_agent, exnrVar.b, arrayList, resources);
        g(R.string.survey_url, exnrVar.c, arrayList, resources);
        g(R.string.survey_device_model, exnuVar.b, arrayList, resources);
        g(R.string.survey_brand, exnuVar.c, arrayList, resources);
        g(R.string.survey_operating_system_version, exnuVar.e, arrayList, resources);
        g(R.string.survey_app_name, exnuVar.f, arrayList, resources);
        g(R.string.survey_app_id, exnuVar.g, arrayList, resources);
        g(R.string.survey_app_version, exnuVar.h, arrayList, resources);
        g(R.string.survey_google_play_services_version, exnuVar.i, arrayList, resources);
        int i = exnuVar.d;
        char c = i != 0 ? i != 1 ? i != 2 ? (char) 0 : (char) 4 : (char) 3 : (char) 2;
        g(R.string.survey_operating_system, c == 0 ? "UNRECOGNIZED" : c != 2 ? c != 3 ? "OS_TYPE_IOS" : "OS_TYPE_ANDROID" : "OS_TYPE_UNKNOWN", arrayList, resources);
        int i2 = exnxVar.b;
        char c2 = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? (char) 0 : (char) 5 : (char) 4 : (char) 3 : (char) 2;
        g(R.string.survey_platform, c2 != 0 ? c2 != 2 ? c2 != 3 ? c2 != 4 ? "PLATFORM_IOS" : "PLATFORM_ANDROID" : "PLATFORM_WEB" : "PLATFORM_UNKNOWN" : "UNRECOGNIZED", arrayList, resources);
        g(R.string.survey_library_version, exnxVar.c, arrayList, resources);
        StringBuilder sb = new StringBuilder();
        for (String str2 : bundle.keySet()) {
            sb.append(String.format("%s %s %s\n", str2, context.getString(R.string.survey_rightwards_arrow), bundle.get(str2)));
        }
        g(R.string.survey_application_data, sb.toString(), arrayList, resources);
        return arrayList;
    }

    public static void c(final Activity activity, TextView textView, String str, String str2, String str3, String str4, ecrv ecrvVar) throws Resources.NotFoundException {
        Resources resources = activity.getResources();
        long j = ecse.a;
        if (((UiModeManager) ejxx.a(new ejxr() { // from class: ecsd
            @Override // defpackage.ejxr
            public final Object get() {
                long j2 = ecse.a;
                return (UiModeManager) activity.getSystemService("uimode");
            }
        }).get()).getCurrentModeType() == 3) {
            textView.setText(resources.getString(R.string.survey_legal_text_car));
        } else {
            String string = resources.getString(R.string.survey_account_and_system_info);
            String string2 = resources.getString(R.string.survey_privacy);
            String string3 = resources.getString(R.string.survey_terms);
            String string4 = resources.getString(R.string.survey_legal_text, string, string2, string3);
            if (str2 != null) {
                string4 = string4.replace("Google", str2);
            }
            SpannableString spannableString = new SpannableString(string4);
            h(spannableString, string, new ecrs(ecrvVar));
            h(spannableString, string2, new ecrt(str3, activity, str));
            h(spannableString, string3, new ecru(activity, str4, str));
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setText(spannableString);
        }
        ecsj ecsjVar = ecrz.c;
        Context context = ecrz.b;
        fblt fbltVar = fblt.a;
        if (ecrz.c(fbltVar.get().d(context))) {
            String packageName = activity.getPackageName();
            ecsj ecsjVar2 = ecrz.c;
            String[] strArrSplit = TextUtils.split(fbltVar.get().a(ecrz.b), ",");
            int i = 0;
            while (true) {
                if (i >= strArrSplit.length) {
                    break;
                }
                strArrSplit[i] = strArrSplit[i].trim();
                i++;
            }
            for (String str5 : strArrSplit) {
                if (TextUtils.equals(str5, packageName)) {
                    ley.p(textView, new ecsf(textView));
                    return;
                }
            }
        }
    }

    public static void d(Context context, String str) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnectedOrConnecting()) {
            Toast.makeText(context, context.getString(R.string.survey_network_request_failed), 0).show();
            return;
        }
        akw akwVar = new akw();
        akwVar.b(Color.parseColor("#eeeeee"));
        akx akxVarA = akwVar.a();
        aky akyVar = new aky();
        akyVar.c(akxVarA);
        try {
            akyVar.a().a(context, Uri.parse(str));
        } catch (ActivityNotFoundException unused) {
            Log.e("ResourceUtils", "No app found to open URL: ".concat(String.valueOf(str)));
        }
    }

    public static void e(ImageView imageView, Context context, int i) {
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            imageView.setImageDrawable(a(drawable, context, i));
        }
    }

    public static Drawable f(Context context) {
        return a(context.getDrawable(R.drawable.survey_close_button_icon), context, context.getColor(R.color.survey_close_icon_color));
    }

    private static void g(int i, String str, List list, Resources resources) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        list.add(new lcb(resources.getString(i), str));
    }

    private static void h(Spannable spannable, String str, ClickableSpan clickableSpan) {
        int iIndexOf = spannable.toString().indexOf(str);
        int length = str.length() + iIndexOf;
        if (iIndexOf >= 0) {
            spannable.setSpan(clickableSpan, iIndexOf, length, 0);
        }
    }
}
