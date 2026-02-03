package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acqw implements ehay {
    final /* synthetic */ acrt a;

    public acqw(acrt acrtVar) {
        this.a = acrtVar;
    }

    @Override // defpackage.ehay
    public final void a(Throwable th) {
        ekrw ekrwVarJ = acrt.a.j();
        ekrwVarJ.X(eksq.a, "HomeFragmentFlogger");
        ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(th)).h("com/google/android/apps/messaging/home/HomeFragmentPeer$1", "onLoadError", (char) 1172, "HomeFragmentPeer.java")).q("Data-source error encountered while receiving information about a GAIA-related error.");
    }

    @Override // defpackage.ehay
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        cdjb cdjbVar = (cdjb) obj;
        if (abxb.a()) {
            acrt acrtVar = this.a;
            cdiw cdiwVar = (cdiw) acrtVar.ao.b();
            efwo efwoVar = acrtVar.am;
            efwoVar.getClass();
            if (!(cdjbVar instanceof cdja)) {
                ((ekrd) cdiw.a.h().h("com/google/android/apps/messaging/shared/gaia/dataservice/GaiaAuthCheckHelper", "showDialogOnAuthFailureForAccount", 96, "GaiaAuthCheckHelper.kt")).q("Gaia auth check found no UserRecoverableError");
                return;
            }
            cdja cdjaVar = (cdja) cdjbVar;
            efwo efwoVar2 = cdjaVar.a;
            if (fdbq.f(efwoVar, efwoVar2)) {
                fcsu fcsuVar = cdiwVar.c;
                if (!((cdji) fcsuVar.b()).a(efwoVar)) {
                    acom acomVar = acrtVar.b;
                    ((ekrd) cdiw.a.h().h("com/google/android/apps/messaging/shared/gaia/dataservice/GaiaAuthCheckHelper", "showDialogOnAuthFailureForAccount", 71, "GaiaAuthCheckHelper.kt")).q("Gaia auth check found UserRecoverableError, showing dialog");
                    ea eaVarH = acomVar.I().h("GaiaAuthFailureDialogFragment");
                    ((cdji) fcsuVar.b()).a.put(efwoVar.a(), true);
                    if (eaVarH == null) {
                        int i = cdjn.g;
                        cdjm.a(cdjaVar.b, 1).t(acomVar.I(), "GaiaAuthFailureDialogFragment");
                        return;
                    } else {
                        cg cgVar = new cg(acomVar.I());
                        cgVar.q(eaVarH);
                        cgVar.c();
                        return;
                    }
                }
            }
            ((ekrd) cdiw.a.h().h("com/google/android/apps/messaging/shared/gaia/dataservice/GaiaAuthCheckHelper", "showDialogOnAuthFailureForAccount", 91, "GaiaAuthCheckHelper.kt")).t("Gaia auth check found UserRecoverableError, but skipped showing dialog. Account match: [%b]", Boolean.valueOf(fdbq.f(efwoVar, efwoVar2)));
        }
    }
}
