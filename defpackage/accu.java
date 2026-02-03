package defpackage;

import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import com.google.android.apps.messaging.gaia.signoutaccount.SignOutAccountActivity;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class accu {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/gaia/signoutaccount/SignOutAccountActivityPeer");
    public final SignOutAccountActivity b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    private final fcsu f;

    public accu(SignOutAccountActivity signOutAccountActivity, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4) {
        fcsuVar4.getClass();
        this.b = signOutAccountActivity;
        this.c = fcsuVar;
        this.d = fcsuVar2;
        this.f = fcsuVar3;
        this.e = fcsuVar4;
        efxf efxfVar = (efxf) fcsuVar.b();
        if (!egaq.h() && signOutAccountActivity.getCallingActivity() == null) {
            ((ekrd) ((ekrd) egaq.d.j()).h("com/google/apps/tiktok/account/api/controller/Config", "forRequirementActivity", 129, "Config.java")).t("Requirement activity not launched for result: %s", signOutAccountActivity.getClass());
        }
        egap egapVarD = egaq.d();
        egapVarD.c(true);
        int i = ekgb.d;
        ((egam) egapVarD).a = ekoe.a;
        efxfVar.g(egapVarD.a());
        signOutAccountActivity.getIntent().getExtras();
        efxfVar.e(new acct(this));
        Optional optional = (Optional) fcsuVar3.b();
        final fdap fdapVar = new fdap() { // from class: accr
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                efxf efxfVar2 = (efxf) this.a.c.b();
                efxfVar2.e(new abwz((abxa) obj));
                return efxfVar2;
            }
        };
        optional.map(new Function() { // from class: accs
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return fdapVar.invoke(obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    public final efwo a() {
        Intent intent = this.b.getIntent();
        intent.getClass();
        return (efwo) (Build.VERSION.SDK_INT > 33 ? (Parcelable) intent.getParcelableExtra("EXTRA_ACCOUNT_ID_TO_SWITCH_TO", efwo.class) : intent.getParcelableExtra("EXTRA_ACCOUNT_ID_TO_SWITCH_TO"));
    }
}
