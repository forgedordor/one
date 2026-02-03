package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.android.vcard.VCardConfig;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
@okx(a = "activity")
/* loaded from: classes.dex */
public class ohv extends oky<ohu> {
    private final Context b;
    private final Activity c;

    public ohv(Context context) {
        Object next;
        this.b = context;
        Iterator itA = fdey.e(context, new fdap() { // from class: oht
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                Context context2 = (Context) obj;
                context2.getClass();
                if (context2 instanceof ContextWrapper) {
                    return ((ContextWrapper) context2).getBaseContext();
                }
                return null;
            }
        }).a();
        while (true) {
            if (!itA.hasNext()) {
                next = null;
                break;
            } else {
                next = itA.next();
                if (((Context) next) instanceof Activity) {
                    break;
                }
            }
        }
        this.c = (Activity) next;
    }

    @Override // defpackage.oky
    public final /* synthetic */ ojx a() {
        return new ohu(this);
    }

    @Override // defpackage.oky
    public final boolean b() {
        Activity activity = this.c;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }

    @Override // defpackage.oky
    public final /* bridge */ /* synthetic */ ojx c(ojx ojxVar, Bundle bundle, okg okgVar) {
        Intent intent;
        int intExtra;
        String strEncode;
        ohu ohuVar = (ohu) ojxVar;
        Intent intent2 = ohuVar.a;
        if (intent2 == null) {
            throw new IllegalStateException("Destination " + ohuVar.c() + " does not have an Intent set.");
        }
        Intent intent3 = new Intent(intent2);
        if (bundle != null) {
            intent3.putExtras(bundle);
            String str = ohuVar.b;
            if (str != null && str.length() != 0) {
                StringBuffer stringBuffer = new StringBuffer();
                Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(str);
                while (matcher.find()) {
                    String strGroup = matcher.group(1);
                    strGroup.getClass();
                    if (!pis.g(bundle, strGroup)) {
                        throw new IllegalArgumentException("Could not find " + strGroup + " in " + bundle + " to fill data pattern " + str);
                    }
                    matcher.appendReplacement(stringBuffer, "");
                    oil oilVar = (oil) ohuVar.i().get(strGroup);
                    okq okqVar = oilVar != null ? oilVar.a : null;
                    if (okqVar == null || (strEncode = okqVar.h(okqVar.b(bundle, strGroup))) == null) {
                        strEncode = Uri.encode(String.valueOf(bundle.get(strGroup)));
                    }
                    stringBuffer.append(strEncode);
                }
                matcher.appendTail(stringBuffer);
                intent3.setData(Uri.parse(stringBuffer.toString()));
            }
        }
        Activity activity = this.c;
        if (activity == null) {
            intent3.addFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
        }
        if (okgVar != null && okgVar.a) {
            intent3.addFlags(536870912);
        }
        if (activity != null && (intent = activity.getIntent()) != null && (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) != 0) {
            intent3.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
        }
        intent3.putExtra("android-support-navigation:ActivityNavigator:current", ohuVar.c());
        Context context = this.b;
        Resources resources = context.getResources();
        if (okgVar != null) {
            int i = okgVar.h;
            int i2 = okgVar.i;
            if ((i <= 0 || !fdbq.f(resources.getResourceTypeName(i), "animator")) && (i2 <= 0 || !fdbq.f(resources.getResourceTypeName(i2), "animator"))) {
                intent3.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", i);
                intent3.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", i2).getClass();
            } else {
                Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring popEnter resource " + resources.getResourceName(i) + " and popExit resource " + resources.getResourceName(i2) + " when launching " + ohuVar);
            }
        }
        context.startActivity(intent3);
        if (okgVar != null && activity != null) {
            int i3 = okgVar.f;
            int i4 = okgVar.g;
            if ((i3 > 0 && fdbq.f(resources.getResourceTypeName(i3), "animator")) || (i4 > 0 && fdbq.f(resources.getResourceTypeName(i4), "animator"))) {
                Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring enter resource " + resources.getResourceName(i3) + " and exit resource " + resources.getResourceName(i4) + "when launching " + ohuVar);
            } else if (i3 >= 0 || i4 >= 0) {
                activity.overridePendingTransition(fddu.f(i3, 0), fddu.f(i4, 0));
            }
        }
        return null;
    }
}
