package defpackage;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Context;
import android.net.Uri;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xgt {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/content/ComposeRowContentInsertionListener");
    public static final fctc b = fctd.a(new fdae() { // from class: xgo
        @Override // defpackage.fdae
        public final Object invoke() {
            ekrg ekrgVar = xgt.a;
            String lowerCase = "text/x-vCard".toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            return fcwm.d("application/hbs-vcs", "application/ics", "application/vcs", "application/ogg", "audio/*", "application/msword", "application/vnd.openxmlformats-officedocument.wordprocessingml.document", "image/*", "application/pdf", "application/vnd.ms-powerpoint", "application/vnd.openxmlformats-officedocument.presentationml.presentation", "text/calendar", "text/x-vCalendar", "text/x-vCard", lowerCase, "text/x-vcalendar", "video/*", "application/vnd.ms-excel", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        }
    });
    public static final fctc c = fctd.a(new fdae() { // from class: xgp
        @Override // defpackage.fdae
        public final Object invoke() {
            ekrg ekrgVar = xgt.a;
            Set<String> setA = xgq.a();
            ArrayList arrayList = new ArrayList(fcva.p(setA, 10));
            for (String str : setA) {
                doig doigVarA = dohx.a(str);
                if (doigVarA == null) {
                    throw new IllegalStateException("Bad type in SUPPORTED_MEDIA_TYPES: ".concat(String.valueOf(str)));
                }
                arrayList.add(doigVarA);
            }
            Set setAv = fcva.av(arrayList);
            if (setAv.size() == xgq.a().size()) {
                return setAv;
            }
            throw new IllegalStateException("SUPPORTED_MEDIA_TYPES has less items than SUPPORTED_MEDIA_TYPE_STRINGS");
        }
    });
    public final fcsu d;
    public final fcsu e;
    public final vth f;
    public final aqhi g;
    public final vuc h;
    private final Context i;
    private final fdjx j;

    public xgt(Context context, fdjx fdjxVar, fcsu fcsuVar, fcsu fcsuVar2, vuc vucVar, vth vthVar, aqhi aqhiVar) {
        context.getClass();
        fdjxVar.getClass();
        vucVar.getClass();
        vthVar.getClass();
        this.i = context;
        this.j = fdjxVar;
        this.d = fcsuVar;
        this.e = fcsuVar2;
        this.h = vucVar;
        this.f = vthVar;
        this.g = aqhiVar;
    }

    public final dltc a(int i, Uri uri) {
        int i2 = 1;
        if (i == 1) {
            i2 = 4;
        } else if (i == 2) {
            i2 = 3;
        } else if (i != 3) {
            ekrw ekrwVarJ = a.j();
            ekrwVarJ.X(eksq.a, "BugleComposeRow2");
            ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/content/ComposeRowContentInsertionListener", "getSource", BasePaymentResult.ERROR_REQUEST_TIMEOUT, "ComposeRowContentInsertionListener.kt")).w("Using EntryPoint.UNKNOWN for %d used by %s", i, uri);
        } else {
            i2 = 5;
        }
        return new dlsx(uri.getAuthority(), i2);
    }

    public final doig b(ClipData clipData, int i) {
        doig doigVarA;
        int mimeTypeCount = clipData.getDescription().getMimeTypeCount();
        if (mimeTypeCount == 1) {
            String mimeType = clipData.getDescription().getMimeType(0);
            mimeType.getClass();
            doigVarA = dohx.a(mimeType);
        } else if (mimeTypeCount == clipData.getItemCount()) {
            String mimeType2 = clipData.getDescription().getMimeType(i);
            mimeType2.getClass();
            doigVarA = dohx.a(mimeType2);
        } else {
            doigVarA = null;
        }
        if (doigVarA == null || fdbq.f(doigVarA.c, "*")) {
            return null;
        }
        return doigVarA;
    }

    public final doig c(Uri uri) {
        ekrg ekrgVar = a;
        ekrw ekrwVarJ = ekrgVar.j();
        ekrz ekrzVar = eksq.a;
        ekrwVarJ.X(ekrzVar, "BugleComposeRow2");
        ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/content/ComposeRowContentInsertionListener", "resolveMediaType", 180, "ComposeRowContentInsertionListener.kt")).t("Getting type from content resolver for %s", uri);
        String type = this.i.getContentResolver().getType(uri);
        if (type == null) {
            ekrw ekrwVarJ2 = ekrgVar.j();
            ekrwVarJ2.X(ekrzVar, "BugleComposeRow2");
            ((ekrd) ekrwVarJ2.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/content/ComposeRowContentInsertionListener", "resolveMediaType", 183, "ComposeRowContentInsertionListener.kt")).t("Unable to resolve type for %s", uri);
            return null;
        }
        ekrw ekrwVarE = ekrgVar.e();
        ekrwVarE.X(ekrzVar, "BugleComposeRow2");
        ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/content/ComposeRowContentInsertionListener", "resolveMediaType", 186, "ComposeRowContentInsertionListener.kt")).D("Resolved type %s for %s", type, uri);
        return dohx.a(type);
    }

    public final dpfv d() {
        return new dpfv(fcva.ao((Set) c.a()), new xgs(this));
    }

    public final void e(vvo vvoVar) {
        auvw.k(this.j, null, null, new xgr(this, vvoVar, null), 3);
    }

    public final boolean f(doig doigVar) {
        Set setA = xgq.a();
        if ((setA instanceof Collection) && setA.isEmpty()) {
            return false;
        }
        Iterator it = setA.iterator();
        while (it.hasNext()) {
            if (ClipDescription.compareMimeTypes(doigVar.a(), (String) it.next())) {
                return true;
            }
        }
        return false;
    }
}
