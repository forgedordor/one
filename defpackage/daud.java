package defpackage;

import android.content.Context;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class daud implements dauc {
    private static final ekrg f = ekrg.c("com/google/android/apps/messaging/welcome/v1/WelcomeFlowV1ClickHandlerImpl");
    private static final ekrg g = ekrg.c("com/google/android/apps/messaging/welcome/v1/WelcomeFlowV1ClickHandlerImpl");
    public final Context a;
    public final fcsu b;
    public final fcsu c;
    public final Optional d;
    public final fcsu e;
    private final fdjx h;
    private final fcsu i;
    private final fcsu j;
    private final fcsu k;
    private final Optional l;
    private final fcsu m;

    /* compiled from: PG */
    public interface a {
        egrv gi();

        Optional gr();
    }

    public daud(Context context, fdjx fdjxVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, Optional optional, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, Optional optional2, fcsu fcsuVar7) {
        context.getClass();
        fdjxVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar5.getClass();
        fcsuVar6.getClass();
        optional2.getClass();
        fcsuVar7.getClass();
        this.a = context;
        this.h = fdjxVar;
        this.i = fcsuVar;
        this.j = fcsuVar2;
        this.k = fcsuVar3;
        this.l = optional;
        this.m = fcsuVar4;
        this.b = fcsuVar5;
        this.c = fcsuVar6;
        this.d = optional2;
        this.e = fcsuVar7;
    }

    @Override // defpackage.dauc
    public final void a(efwo efwoVar, String str, ctcj ctcjVar, chnc chncVar) {
        ctcjVar.getClass();
        chncVar.getClass();
        try {
            ekrw ekrwVarH = f.h();
            ekrwVarH.X(eksq.a, "BugleWelcome");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/welcome/v1/WelcomeFlowV1ClickHandlerImpl", "onContinueClickedInternal", 110, "WelcomeFlowV1ClickHandlerImpl.kt")).I("onContinueClicked. accountId: %s, tosMessageId: %s, flow: %s", efwoVar, str, ctcjVar);
            ((ctcm) this.i.b()).j(efwoVar, str, ctch.ACTION_ACCEPT_NOTICE, ctcjVar);
            davn davnVar = (davn) this.m.b();
            Object objB = davnVar.a.b();
            objB.getClass();
            auvw.k((fdjx) objB, null, null, new davl(davnVar, ctcjVar, null), 3);
            auvw.k(this.h, null, null, new daue(this, efwoVar, ctcjVar, chncVar, null), 3);
        } catch (Exception e) {
            ekrw ekrwVarI = f.i();
            ekrwVarI.X(eksq.a, "BugleWelcome");
            ((ekrd) ((ekrd) ekrwVarI).g(e).h("com/google/android/apps/messaging/welcome/v1/WelcomeFlowV1ClickHandlerImpl", "onContinueClicked", 74, "WelcomeFlowV1ClickHandlerImpl.kt")).q("Failed to successfully complete Welcome Flow onContinueClicked.");
        }
    }

    @Override // defpackage.dauc
    public final void b(efwo efwoVar, String str, ctcj ctcjVar) {
        ctcjVar.getClass();
        ekrw ekrwVarH = f.h();
        ekrwVarH.X(eksq.a, "BugleWelcome");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/welcome/v1/WelcomeFlowV1ClickHandlerImpl", "onUseWithoutAnAccountClicked", 85, "WelcomeFlowV1ClickHandlerImpl.kt")).I("onUseWithoutAnAccountClicked. accountId: %s, tosMessageId: %s, flow: %s", efwoVar, str, ctcjVar);
        ((ctcm) this.i.b()).j(efwoVar, str, ctch.ACTION_USE_WITHOUT_AN_ACCOUNT, ctcjVar);
        davn davnVar = (davn) this.m.b();
        Object objB = davnVar.a.b();
        objB.getClass();
        auvw.k((fdjx) objB, null, null, new davf(davnVar, null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x010b, code lost:
    
        if (r15 != r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0172, code lost:
    
        if (r15 != r1) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0172 -> B:48:0x0174). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.efwo r13, defpackage.ctcj r14, defpackage.fcxy r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.daud.c(efwo, ctcj, fcxy):java.lang.Object");
    }
}
