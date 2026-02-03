package defpackage;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.InProductHelp;
import com.google.android.libraries.social.licenses.LicenseMenuActivity;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acic implements achu {
    public static final cqce a = cqce.g("Bugle", "HelpAndFeedbackIntentsImpl");
    public final Context b;
    public final cqtj c;
    public final cdga d;
    private final cpch e;
    private final egej f;

    public acic(Context context, cqtj cqtjVar, cdga cdgaVar, cpch cpchVar, egej egejVar) {
        this.b = context;
        this.c = cqtjVar;
        this.e = cpchVar;
        this.f = egejVar;
        this.d = cdgaVar;
    }

    public static Intent k(String str) {
        return new Intent("android.intent.action.VIEW", Uri.parse(str));
    }

    public static Bitmap l(Context context) {
        Activity activityF = dakl.f(context);
        if (activityF == null) {
            return null;
        }
        return dcwi.a(activityF);
    }

    private final FeedbackOptions m(Context context, String str, String str2) {
        Bitmap bitmapL = l(context);
        dcwj dcwjVarN = n(context, str2);
        dcwjVarN.d(this.d, false);
        if (bitmapL != null) {
            dcwjVarN.a = bitmapL;
        }
        if (str != null) {
            dcwjVarN.d = str;
        } else {
            String str3 = (String) ccze.k.e();
            if (!TextUtils.isEmpty(str3)) {
                dcwjVarN.d = str3;
            }
        }
        a.p("Sending feedback...");
        return dcwjVarN.a();
    }

    private static final dcwj n(Context context, String str) {
        dcwj dcwjVar = new dcwj(context);
        dcwn dcwnVar = new dcwn();
        dcwnVar.b();
        dcwjVar.f = dcwnVar.a();
        if (str != null) {
            dcwjVar.c = str;
        }
        return dcwjVar;
    }

    @Override // defpackage.achu
    public final defn a(acht achtVar) {
        achq achqVar = (achq) achtVar;
        ekgb ekgbVar = achqVar.a;
        List list = (List) Collection.EL.stream(ekgbVar).map(new Function() { // from class: achv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((acin) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).filter(new Predicate() { // from class: achw
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo538negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return Objects.nonNull((eiju) obj);
            }
        }).collect(Collectors.toCollection(new Supplier() { // from class: achx
            @Override // java.util.function.Supplier
            public final Object get() {
                return new ArrayList();
            }
        }));
        HashMap map = new HashMap();
        acjc acjcVar = achqVar.b;
        map.put("share_with_partner_consent", acjcVar.a());
        list.add(eijx.e(map));
        ekgp ekgpVar = achqVar.d;
        list.add(eijx.e(ekgpVar));
        ekgi ekgiVar = new ekgi();
        ekgiVar.g((Map) Collection.EL.stream(ekgbVar).collect(ekcv.a(new Function() { // from class: achy
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((acin) obj).h();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: achz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (acin) obj;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        })));
        ekgiVar.i("CONSENT", acjcVar);
        ekgiVar.i("EXTRA", new cdgm(ekgpVar));
        ekgp ekgpVarC = ekgiVar.c();
        cdga cdgaVar = this.d;
        cdgaVar.c(ekgpVarC);
        Context context = this.b;
        final dcwj dcwjVarN = n(context, null);
        dcwjVarN.d(cdgaVar, false);
        achqVar.e.ifPresent(new Consumer() { // from class: acia
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                dcwj dcwjVar = dcwjVarN;
                dcwjVar.c = this.a.b.getString(R.string.report_issue_description);
                dcwjVar.e((String) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        Bitmap bitmap = achqVar.c;
        if (bitmap != null) {
            dcwjVarN.a = bitmap;
        }
        a.p("Sending feedback...");
        return achr.b(context, dcwjVarN.a());
    }

    @Override // defpackage.achu
    public final defn b(Context context, String str, String str2) {
        return achr.b(context, m(context, str, str2));
    }

    @Override // defpackage.achu
    public final eiju c(final Context context, final String str, efwo efwoVar, final cdfg cdfgVar) {
        return eiju.g(this.f.b(efwoVar)).i(new eooz() { // from class: acib
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                String str2 = (String) obj;
                if (ActivityManager.isUserAMonkey()) {
                    return eijx.e(null);
                }
                String str3 = str;
                Context context2 = context;
                acic acicVar = this.a;
                Uri uri = Uri.parse("https://support.google.com/nexus/topic/6089061/?hl=%locale%");
                cqtj cqtjVar = acicVar.c;
                Intent intentK = acic.k(cqtjVar.a());
                Intent intentK2 = acic.k(cqtjVar.b());
                Intent intent = new Intent(context2, (Class<?>) LicenseMenuActivity.class);
                Resources resources = context2.getResources();
                ThemeSettings themeSettings = new ThemeSettings();
                themeSettings.a = acicVar.j();
                GoogleHelp googleHelp = new GoogleHelp(str3);
                googleHelp.q = uri;
                googleHelp.b(0, resources.getString(R.string.menu_privacy_policy), intentK);
                googleHelp.b(1, resources.getString(R.string.menu_terms_of_service), intentK2);
                googleHelp.b(2, resources.getString(R.string.menu_license), intent);
                googleHelp.s = themeSettings;
                dcwj dcwjVar = new dcwj(context2);
                dcwn dcwnVar = new dcwn();
                dcwnVar.b();
                dcwjVar.f = dcwnVar.a();
                Bitmap bitmapL = acic.l(context2);
                if (bitmapL != null) {
                    dcwjVar.a = bitmapL;
                }
                if (str2 != null) {
                    dcwjVar.b = str2;
                }
                cdfg cdfgVar2 = cdfgVar;
                if (cdfgVar2 != null) {
                    acicVar.d.c(ekgp.l("ConversationPsd", cdfgVar2));
                }
                dcwjVar.d(acicVar.d, true);
                googleHelp.c(dcwjVar.a(), context2.getCacheDir());
                Intent intentA = googleHelp.a();
                Activity activityF = dakl.f(context2);
                if (activityF == null) {
                    acic.a.r("Supplied context was not an Activity, cannot launch help");
                    return eijx.e(null);
                }
                achr.a(activityF, intentA);
                return eijx.e(null);
            }
        }, eoqg.a);
    }

    @Override // defpackage.achu
    public final void d(Context context, String str) {
        if (ActivityManager.isUserAMonkey()) {
            return;
        }
        context.getClass();
        cqtj cqtjVar = this.c;
        Uri uri = Uri.parse("https://support.google.com/nexus/topic/6089061/?hl=%locale%");
        Intent intentK = k(cqtjVar.a());
        Intent intentK2 = k(cqtjVar.b());
        Intent intent = new Intent(context, (Class<?>) LicenseMenuActivity.class);
        Resources resources = context.getResources();
        ThemeSettings themeSettings = new ThemeSettings();
        themeSettings.a = j();
        GoogleHelp googleHelp = new GoogleHelp(str);
        googleHelp.q = uri;
        googleHelp.b(0, resources.getString(R.string.menu_privacy_policy), intentK);
        googleHelp.b(1, resources.getString(R.string.menu_terms_of_service), intentK2);
        googleHelp.b(2, resources.getString(R.string.menu_license), intent);
        googleHelp.s = themeSettings;
        dcwj dcwjVar = new dcwj(context);
        dcwn dcwnVar = new dcwn();
        dcwnVar.b();
        dcwjVar.f = dcwnVar.a();
        Bitmap bitmapL = l(context);
        if (bitmapL != null) {
            dcwjVar.a = bitmapL;
        }
        dcwjVar.d(this.d, true);
        googleHelp.c(dcwjVar.a(), context.getCacheDir());
        Intent intentA = googleHelp.a();
        Activity activityF = dakl.f(context);
        if (activityF == null) {
            a.r("Supplied context was not an Activity, cannot launch help");
        } else {
            achr.a(activityF, intentA);
        }
    }

    @Override // defpackage.achu
    public final void e(Activity activity, String str) {
        String str2 = (String) crbf.x.e();
        if (ActivityManager.isUserAMonkey()) {
            return;
        }
        ThemeSettings themeSettings = new ThemeSettings();
        themeSettings.a = j();
        FeedbackOptions feedbackOptionsM = m(activity, null, null);
        GoogleHelp googleHelp = new GoogleHelp(str);
        googleHelp.q = Uri.parse(str2);
        googleHelp.s = themeSettings;
        googleHelp.c(feedbackOptionsM, activity.getCacheDir());
        achr.a(activity, googleHelp.a());
    }

    @Override // defpackage.achu
    public final void f(Context context) {
        ThemeSettings themeSettings = new ThemeSettings();
        themeSettings.a = j();
        dcwj dcwjVar = new dcwj(context);
        dcwjVar.e = themeSettings;
        dcwjVar.d(this.d, false);
        Activity activityF = dakl.f(context);
        Bitmap bitmapA = activityF == null ? null : dcwi.a(activityF);
        if (bitmapA != null) {
            dcwjVar.a = bitmapA;
        }
        achr.b(context, dcwjVar.a());
    }

    @Override // defpackage.achu
    public final void g(Activity activity) {
        ThemeSettings themeSettings = new ThemeSettings();
        themeSettings.a = j();
        GoogleHelp googleHelp = new GoogleHelp("rcs_chat");
        googleHelp.s = themeSettings;
        InProductHelp inProductHelp = new InProductHelp(googleHelp, null, null, 0, null, 0, null);
        inProductHelp.c = "https://support.google.com/messages?p=rcs_chats_faq";
        new ddci(activity).d(inProductHelp);
    }

    @Override // defpackage.achu
    public final defn h(Context context, boolean z) {
        Bitmap bitmapL = l(context);
        dcwj dcwjVar = new dcwj(context);
        if (z) {
            ekgi ekgiVar = new ekgi();
            ekgiVar.i("gemini_feedback", "true");
            ekgp ekgpVarC = ekgiVar.c();
            ekgi ekgiVar2 = new ekgi();
            ekgiVar2.i("gemini_feedback", new cdgm(ekgpVarC));
            ekgp ekgpVarC2 = ekgiVar2.c();
            cdga cdgaVar = this.d;
            cdgaVar.c(ekgpVarC2);
            dcwjVar.d(cdgaVar, true);
        }
        if (bitmapL != null) {
            dcwjVar.a = bitmapL;
        }
        dcwjVar.d = "com.google.android.apps.messaging.GENAI_FEATURES";
        dcwjVar.g = "magic_compose";
        a.p("Sending feedback...");
        return achr.b(context, dcwjVar.a());
    }

    @Override // defpackage.achu
    public final eiju i(Context context, efwo efwoVar) {
        return c(context, "Messenger_main", efwoVar, null);
    }

    final int j() {
        int iA = this.e.a();
        if (iA != 1) {
            return iA != 2 ? 3 : 2;
        }
        return 0;
    }
}
