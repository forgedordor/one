package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csiv {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/util/spam/hades/analytics/LanguageComparisonUtils");
    private final fcsu b;
    private final Context c;

    public csiv(fcsu fcsuVar, Context context) {
        fcsuVar.getClass();
        context.getClass();
        this.b = fcsuVar;
        this.c = context;
    }

    public final void a(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        try {
            String language = this.c.getResources().getConfiguration().getLocales().get(0).getLanguage();
            language.getClass();
            if (language.length() == 0) {
                csiu.a(null);
            } else if (fdgn.j(str, language, true)) {
                ((ains) this.b.b()).e("Bugle.DetectedAndSystemLanguages.Incoming.Count", 1);
            } else {
                ((ains) this.b.b()).e("Bugle.DetectedAndSystemLanguages.Incoming.Count", 2);
            }
        } catch (Exception e) {
            csiu.a(e);
        }
    }
}
