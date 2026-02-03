package defpackage;

import android.os.Bundle;
import com.google.android.apps.messaging.gaia.signoutaccount.SignOutAccountArguments;
import com.google.android.apps.messaging.gaia.signoutaccount.SignOutAccountViewModel;
import com.google.android.apps.messaging.welcome.v1.viewmodel.AccountWelcomeViewModel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acec {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/gaia/signoutaccount/SignOutAccountFragmentPeer");
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    public final fcsu h;
    public final fcsu i;
    public final fdjx j;
    public final fctc k;
    public final fctc l;

    public acec(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fdjx fdjxVar) {
        fcsuVar8.getClass();
        fdjxVar.getClass();
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
        this.e = fcsuVar4;
        this.f = fcsuVar5;
        this.g = fcsuVar6;
        this.h = fcsuVar7;
        this.i = fcsuVar8;
        this.j = fdjxVar;
        Object objB = fcsuVar.b();
        objB.getClass();
        ea eaVar = (ea) objB;
        fctc fctcVarB = fctd.b(3, new acdu(new acdt(eaVar)));
        int i = fdcj.a;
        this.k = new lxf(new fdbi(SignOutAccountViewModel.class), new acdv(fctcVarB), new acdx(eaVar, fctcVarB), new acdw(fctcVarB));
        Object objB2 = fcsuVar.b();
        objB2.getClass();
        ea eaVar2 = (ea) objB2;
        fctc fctcVarB2 = fctd.b(3, new acdz(new acdy(eaVar2)));
        this.l = new lxf(new fdbi(AccountWelcomeViewModel.class), new acea(fctcVarB2), new acds(eaVar2, fctcVarB2), new aceb(fctcVarB2));
    }

    public final efwo a() {
        SignOutAccountArguments signOutAccountArguments;
        Bundle bundle = ((acdj) this.b.b()).m;
        if (bundle == null || (signOutAccountArguments = (SignOutAccountArguments) ih.a(bundle, "sign_out_account_arguments", SignOutAccountArguments.class)) == null) {
            return null;
        }
        return signOutAccountArguments.a;
    }
}
