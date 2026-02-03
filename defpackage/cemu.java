package defpackage;

import android.content.Context;
import android.text.TextUtils;
import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.apps.messaging.shared.net.VerifyTachyonOtpWorker;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cemu extends cldm {
    public final Context b;
    private final eosc f;
    private final fcsu g;
    private final cpfb h;
    private static final cqce d = cqce.g("Bugle", "TachyonOtpPattern");
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/net/TachyonOtpPattern");
    private static final cczi e = cdag.g(cdag.b, "tachyon_phone_registration_code_pattern", "^(\\d{6})\\sis\\syour\\sMessages\\sverification\\scode(?:$|\\s(?s).*$)");

    public cemu(Context context, fcsu fcsuVar, eosc eoscVar, cpfb cpfbVar) {
        this.b = context;
        this.f = eoscVar;
        this.h = cpfbVar;
        this.g = fcsuVar;
    }

    @Override // defpackage.cldm
    protected final String b() {
        return (String) e.e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    final String c(CharSequence charSequence) {
        ekgb ekgbVar = (ekgb) this.c.get();
        if (ekgbVar.size() != 1) {
            throw new IllegalStateException("Invalid OTP pattern");
        }
        try {
            Matcher matcher = ((Pattern) ekgbVar.get(0)).matcher(charSequence);
            return matcher.find() ? matcher.group(1) : "";
        } catch (PatternSyntaxException unused) {
            cqbd cqbdVarB = d.b();
            cqbdVarB.I("Invalid pattern");
            cqbdVarB.A("input", b());
            cqbdVarB.r();
            return "";
        }
    }

    @Override // defpackage.cldm, defpackage.cldq
    public final eiju ge(CharSequence charSequence, int i) {
        ListenableFuture listenableFutureJ;
        final String strC = c(charSequence);
        if (TextUtils.isEmpty(strC)) {
            cqbd cqbdVarA = d.a();
            cqbdVarA.I("Skip processing due to empty otp");
            cqbdVarA.r();
            return eijx.e(false);
        }
        final eiju eijuVarF = ((chtk) this.g.b()).f(i);
        cpfb cpfbVar = this.h;
        if (cezu.a()) {
            aubq aubqVarA = ((chtk) cpfbVar.c.b()).a(i);
            String str = aubqVarA != null ? aubqVarA.d : null;
            if (TextUtils.isEmpty(str)) {
                cpfb.a.m("RCS phone number is not available. Skip OTP check");
                listenableFutureJ = eork.i(false);
            } else {
                listenableFutureJ = eika.j(((cexn) cpfbVar.b.b()).a(str).g(), new ejvr() { // from class: cpfa
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        if (!((cevr) obj).h.H()) {
                            return true;
                        }
                        cpfb.a.m("Data store does not have token to verify OTP. Skip OTP check.");
                        return false;
                    }
                }, eoqg.a);
            }
        } else {
            cpfb.a.m("Tachyon phone registration is not available. Skip OTP check");
            listenableFutureJ = eork.i(false);
        }
        final eiju eijuVarG = eiju.g(listenableFutureJ);
        return eijx.k(eijuVarF, eijuVarG).a(new Callable() { // from class: cemt
            @Override // java.util.concurrent.Callable
            public final Object call() {
                if (!((Boolean) eork.q(eijuVarG)).booleanValue()) {
                    ekrw ekrwVarH = cemu.a.h();
                    ekrwVarH.X(eksq.a, "Bugle");
                    ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/net/TachyonOtpPattern", "scheduleOtpVerification", EnergyProfile.EVCONNECTOR_TYPE_OTHER, "TachyonOtpPattern.java")).q("Skip unnecessary tachyon otp processing.");
                    return false;
                }
                aubq aubqVar = (aubq) eork.q(eijuVarF);
                if (aubqVar == null) {
                    ekrw ekrwVarJ = cemu.a.j();
                    ekrwVarJ.X(eksq.a, "Bugle");
                    ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/net/TachyonOtpPattern", "scheduleOtpVerification", 106, "TachyonOtpPattern.java")).q("Could not get msisdn for subId, skipping otp verification.");
                    return false;
                }
                String str2 = strC;
                cemu cemuVar = this.a;
                ekrw ekrwVarH2 = cemu.a.h();
                ekrwVarH2.X(eksq.a, "Bugle");
                ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/apps/messaging/shared/net/TachyonOtpPattern", "scheduleOtpVerification", 111, "TachyonOtpPattern.java")).q("Scheduling otp verification");
                pzn pznVar = new pzn();
                pznVar.e("otpCode", str2);
                pznVar.e("msisdn", aubqVar.d);
                qau qauVar = new qau(VerifyTachyonOtpWorker.class);
                qauVar.d("tachyon_otp_worker");
                qauVar.j(pznVar.a());
                qbq.a(cemuVar.b).d((qav) qauVar.b());
                return true;
            }
        }, this.f);
    }
}
