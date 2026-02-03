package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sus extends fcyz implements fdat {
    int a;
    final /* synthetic */ sux b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sus(fcxy fcxyVar, sux suxVar) {
        super(2, fcxyVar);
        this.b = suxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((sus) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        if (this.a != 0) {
            fctl.b(obj);
            return obj;
        }
        fctl.b(obj);
        Intent intent = new Intent("android.speech.action.GET_LANGUAGE_DETAILS");
        sux suxVar = this.b;
        ekrg ekrgVar = ebum.a;
        Context context = suxVar.d;
        Iterator<ResolveInfo> it = context.getPackageManager().queryBroadcastReceivers(new Intent("android.speech.action.GET_LANGUAGE_DETAILS"), 0).iterator();
        ComponentName componentName = null;
        ComponentName componentName2 = null;
        while (true) {
            if (it.hasNext()) {
                ResolveInfo next = it.next();
                if (next.activityInfo.packageName.equals("com.google.android.tts") && Build.VERSION.SDK_INT >= 31) {
                    componentName = new ComponentName(next.activityInfo.packageName, next.activityInfo.name);
                    break;
                }
                if (next.activityInfo.packageName.equals("com.google.android.googlequicksearchbox") && next.activityInfo.name.equals("com.google.android.apps.gsa.languagepack.LanguagePackDetailsReceiver_Receiver")) {
                    componentName2 = new ComponentName(next.activityInfo.packageName, next.activityInfo.name);
                }
            } else if (componentName2 == null) {
                ((ekrd) ((ekrd) ebum.a.j()).h("com/google/android/libraries/speech/transcription/TranscriptionUtils", "getModelManagerLPDetailsComponent", 211, "TranscriptionUtils.java")).q("No Model Manager Get Language Pack Details API provided by Google.");
            } else {
                componentName = componentName2;
            }
        }
        Intent intentPutExtra = intent.setComponent(componentName).putExtra("com.google.recognition.extra.RETURN_OFFLINE_LANGUAGE_DETAILS", true).putExtra("calling_package", context.getPackageName());
        intentPutExtra.getClass();
        this.c = this;
        this.a = 1;
        fdiu fdiuVar = new fdiu(fcym.c(this), 1);
        fdiuVar.B();
        fdjx fdjxVar = (fdjx) suxVar.i.a.b();
        fdjxVar.getClass();
        context.sendOrderedBroadcast(intentPutExtra, null, new sun(fdjxVar, fdiuVar), null, -1, null, null);
        Object objM = fdiuVar.m();
        return objM == fcylVar ? fcylVar : objM;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        sus susVar = new sus(fcxyVar, this.b);
        susVar.c = obj;
        return susVar;
    }
}
