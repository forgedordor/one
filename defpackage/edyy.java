package defpackage;

import android.app.Activity;
import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.InProductHelp;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class edyy implements fdau {
    final /* synthetic */ boolean a;
    final /* synthetic */ fdap b;
    final /* synthetic */ hox c;
    final /* synthetic */ edvs d;

    public edyy(boolean z, fdap fdapVar, edvs edvsVar, hox hoxVar) {
        this.a = z;
        this.b = fdapVar;
        this.d = edvsVar;
        this.c = hoxVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((edp) obj).getClass();
        if ((iIntValue & 17) == 16 && hmlVar.I()) {
            hmlVar.s();
        } else {
            hmlVar.v(-1017340071);
            if (this.a) {
                hmlVar.v(-1633490746);
                final fdap fdapVar = this.b;
                boolean zD = hmlVar.D(fdapVar);
                final hox hoxVar = this.c;
                Object objF = hmlVar.f();
                if (zD || objF == hmk.a) {
                    objF = new fdae() { // from class: edyu
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            edzd.c(hoxVar, false);
                            fdapVar.invoke(etzq.OBAKE_PICTURE_PICKER_GOOGLE_PHOTOS_SCREEN);
                            return fctx.a;
                        }
                    };
                    hmlVar.y(objF);
                }
                hmlVar.o();
                edzd.b(R.string.pqe_google_photos, (fdae) objF, "googlePhotos", 228756, hmlVar, 3456);
            }
            hmlVar.o();
            hmlVar.v(-1633490746);
            final fdap fdapVar2 = this.b;
            boolean zD2 = hmlVar.D(fdapVar2);
            final hox hoxVar2 = this.c;
            Object objF2 = hmlVar.f();
            if (zD2 || objF2 == hmk.a) {
                objF2 = new fdae() { // from class: edyv
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        edzd.c(hoxVar2, false);
                        fdapVar2.invoke(etzq.OBAKE_PICTURE_PICKER_PAST_PROFILE_PHOTOS_SCREEN);
                        return fctx.a;
                    }
                };
                hmlVar.y(objF2);
            }
            hmlVar.o();
            edzd.b(R.string.pqe_menu_past_profile_pictures, (fdae) objF2, "pastProfilePhotos", 228761, hmlVar, 3456);
            hmlVar.v(-1633490746);
            final edvs edvsVar = this.d;
            boolean zF = hmlVar.F(edvsVar);
            Object objF3 = hmlVar.f();
            if (zF || objF3 == hmk.a) {
                objF3 = new fdae() { // from class: edyw
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        edzd.c(hoxVar2, false);
                        GoogleHelp googleHelp = new GoogleHelp("google_account_photo_picker");
                        ThemeSettings themeSettings = new ThemeSettings();
                        themeSettings.a = 3;
                        googleHelp.s = themeSettings;
                        edvs edvsVar2 = edvsVar;
                        FeedbackOptions feedbackOptionsA = edvsVar2.a();
                        Activity activity = edvsVar2.a;
                        googleHelp.c(feedbackOptionsA, activity.getCacheDir());
                        InProductHelp inProductHelp = new InProductHelp(googleHelp, null, null, 0, null, 0, null);
                        inProductHelp.c = "https://support.google.com/accounts/answer/27442";
                        new ddci(activity).d(inProductHelp);
                        return fctx.a;
                    }
                };
                hmlVar.y(objF3);
            }
            hmlVar.o();
            edzd.b(R.string.pqe_menu_help, (fdae) objF3, "help", 228757, hmlVar, 3456);
            hmlVar.v(-1633490746);
            boolean zF2 = hmlVar.F(edvsVar);
            Object objF4 = hmlVar.f();
            if (zF2 || objF4 == hmk.a) {
                objF4 = new fdae() { // from class: edyx
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        edzd.c(hoxVar2, false);
                        edvs edvsVar2 = edvsVar;
                        Context applicationContext = edvsVar2.a.getApplicationContext();
                        dcfd dcfdVar = dcwe.a;
                        new dcwi(applicationContext).c(edvsVar2.a());
                        return fctx.a;
                    }
                };
                hmlVar.y(objF4);
            }
            hmlVar.o();
            edzd.b(R.string.pqe_menu_send_feedback, (fdae) objF4, "feedback", 228755, hmlVar, 3456);
        }
        return fctx.a;
    }
}
