package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import j$.util.DesugarCollections;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyat {
    private static final String a = "dyat";

    private dyat() {
    }

    public static void a(View view, ejwi ejwiVar, etzq etzqVar, dxxk dxxkVar, Object obj, String str) {
        if (obj == null || !dxxkVar.g(obj)) {
            ea eaVarD = d(view);
            Activity activityG = eaVarD != null ? eaVarD.G() : null;
            if (activityG == null) {
                activityG = c(view.getContext());
            }
            try {
                new aky().a().a(activityG, Uri.parse(str));
                return;
            } catch (ActivityNotFoundException e) {
                Log.e(a, String.format("Can't open URL '%s'. This can happen if there is no browser app on the device.", str), e);
                return;
            }
        }
        String strC = dxxkVar.c(obj);
        etzr etzrVar = (etzr) etzt.a.createBuilder();
        int i = etzqVar.rz;
        etzrVar.copyOnWrite();
        etzt etztVar = (etzt) etzrVar.instance;
        etztVar.b = 1 | etztVar.b;
        etztVar.c = i;
        b(view, strC, (etzt) etzrVar.build());
    }

    public static void b(View view, String str, etzt etztVar) {
        ea eaVarD = d(view);
        str.getClass();
        etztVar.getClass();
        Intent intent = new Intent();
        intent.setAction("com.google.android.gms.accountsettings.action.VIEW_SETTINGS");
        intent.setPackage("com.google.android.gms").putExtra("extra.screenId", etztVar.c).putExtra("extra.utmSource", "OG").putExtra("extra.accountName", str).putExtra("extra.themeChoice", 0);
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(etztVar.d);
        mapUnmodifiableMap.getClass();
        for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            str2.getClass();
            intent.putExtra("extra.screen.".concat(str2), str3);
        }
        Activity activityG = eaVarD != null ? eaVarD.G() : null;
        if (activityG == null) {
            activityG = c(view.getContext());
        }
        activityG.startActivityForResult(intent, 51332);
    }

    private static Activity c(Context context) {
        Activity activity = (Activity) dyqe.a(context, Activity.class);
        activity.getClass();
        return activity;
    }

    private static ea d(View view) {
        try {
            return fr.f(view);
        } catch (IllegalStateException e) {
            Log.e(a, "Failed to find Fragment for view", e);
            return null;
        }
    }
}
