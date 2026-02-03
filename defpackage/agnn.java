package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agnn implements acth {
    private final agnw a;
    private final agnq b;
    private final agnm c;
    private final agoo d;
    private final arqk e;
    private final Context f;

    public agnn(agnw agnwVar, agnq agnqVar, agnm agnmVar, agoo agooVar, arqk arqkVar, Context context) {
        this.a = agnwVar;
        this.b = agnqVar;
        this.c = agnmVar;
        this.d = agooVar;
        this.e = arqkVar;
        this.f = context;
    }

    @Override // defpackage.acth
    public final eiju a() {
        actk actkVarL = actn.l();
        acte acteVar = (acte) actkVarL;
        acteVar.a = "otp_deletion_banner";
        actkVarL.c(R.drawable.quantum_gm_ic_auto_delete_black_24);
        Context context = this.f;
        actkVarL.e(context.getString(R.string.otp_auto_deletion_promo_banner_negative_button_text));
        acteVar.d = context.getString(R.string.otp_auto_deletion_promo_banner_positive_button_text);
        acteVar.e = this.c;
        acteVar.f = this.b;
        actkVarL.d(this.d);
        if (this.e.a()) {
            acteVar.b = context.getResources().getQuantityString(R.plurals.otp_auto_deletion_promo_banner_title_text_with_description, 24, 24);
            acteVar.c = context.getString(R.string.otp_auto_deletion_promo_banner_body_text);
        } else {
            acteVar.b = context.getString(R.string.otp_auto_deletion_promo_banner_title_text);
        }
        return eijx.e(actkVarL.a());
    }

    @Override // defpackage.acth
    public final eiju b() {
        boolean zBooleanValue = ((Boolean) agnl.a.e()).booleanValue();
        agnw agnwVar = this.a;
        if (!zBooleanValue) {
            return eijx.e(false);
        }
        eieu eieuVarK = eiiy.k("OtpDeletionDataServiceImpl#getIsBannerEligible");
        try {
            final agof agofVar = (agof) agnwVar;
            eiju eijuVarH = eiju.g(((agof) agnwVar).d.a()).h(new ejvr() { // from class: agnx
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    agoh agohVar = (agoh) obj;
                    if (agohVar.d) {
                        ekrw ekrwVarF = agof.a.f();
                        ekrwVarF.X(eksq.a, "BugleOtp");
                        ((ekrd) ((ekrd) ekrwVarF).h("com/google/android/apps/messaging/otp/deletion/data/OtpDeletionDataServiceImpl", "getIsBannerEligible", 79, "OtpDeletionDataServiceImpl.java")).q("OTP auto-delete banner is not eligible since it has been dismissed.");
                        return false;
                    }
                    if (agohVar.b >= ((Integer) agnl.c.e()).intValue()) {
                        ekrw ekrwVarF2 = agof.a.f();
                        ekrwVarF2.X(eksq.a, "BugleOtp");
                        ((ekrd) ((ekrd) ekrwVarF2).h("com/google/android/apps/messaging/otp/deletion/data/OtpDeletionDataServiceImpl", "getIsBannerEligible", 86, "OtpDeletionDataServiceImpl.java")).q("OTP auto-delete banner is not eligible since the impression count reaches the maximum.");
                        return false;
                    }
                    if (((arqi) agofVar.f.b()).a()) {
                        if (agohVar.c) {
                            ekrw ekrwVarF3 = agof.a.f();
                            ekrwVarF3.X(eksq.a, "BugleOtp");
                            ((ekrd) ((ekrd) ekrwVarF3).h("com/google/android/apps/messaging/otp/deletion/data/OtpDeletionDataServiceImpl", "getIsBannerEligible", 93, "OtpDeletionDataServiceImpl.java")).q("OTP auto-delete banner is not eligible since OTP auto-delete is already enabled.");
                            return false;
                        }
                        if (!agof.d()) {
                            ekrw ekrwVarF4 = agof.a.f();
                            ekrwVarF4.X(eksq.a, "BugleOtp");
                            ((ekrd) ((ekrd) ekrwVarF4).h("com/google/android/apps/messaging/otp/deletion/data/OtpDeletionDataServiceImpl", "getIsBannerEligible", 99, "OtpDeletionDataServiceImpl.java")).q("OTP auto-delete banner is not eligible since no OTP message found.");
                            return false;
                        }
                    } else {
                        if (!agof.d()) {
                            ekrw ekrwVarF5 = agof.a.f();
                            ekrwVarF5.X(eksq.a, "BugleOtp");
                            ((ekrd) ((ekrd) ekrwVarF5).h("com/google/android/apps/messaging/otp/deletion/data/OtpDeletionDataServiceImpl", "getIsBannerEligible", 105, "OtpDeletionDataServiceImpl.java")).q("OTP auto-delete banner is not eligible since no OTP message found.");
                            return false;
                        }
                        if (agohVar.c) {
                            ekrw ekrwVarF6 = agof.a.f();
                            ekrwVarF6.X(eksq.a, "BugleOtp");
                            ((ekrd) ((ekrd) ekrwVarF6).h("com/google/android/apps/messaging/otp/deletion/data/OtpDeletionDataServiceImpl", "getIsBannerEligible", 110, "OtpDeletionDataServiceImpl.java")).q("OTP auto-delete banner is not eligible since OTP auto-delete is already enabled.");
                            return false;
                        }
                    }
                    ekrw ekrwVarF7 = agof.a.f();
                    ekrwVarF7.X(eksq.a, "BugleOtp");
                    ((ekrd) ((ekrd) ekrwVarF7).h("com/google/android/apps/messaging/otp/deletion/data/OtpDeletionDataServiceImpl", "getIsBannerEligible", 116, "OtpDeletionDataServiceImpl.java")).q("OTP auto-delete banner is eligible to show.");
                    return true;
                }
            }, ((agof) agnwVar).c);
            eieuVarK.b(eijuVarH);
            eieuVarK.close();
            return eijuVarH;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.acth
    public final /* synthetic */ Set c() {
        return new ekph(cdpg.HOME);
    }

    @Override // defpackage.acth
    public final int d() {
        return 6;
    }
}
