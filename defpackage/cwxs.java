package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwxs extends fcyz implements fdat {
    int a;
    final /* synthetic */ cwxu b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwxs(cwxu cwxuVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cwxuVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cwxs) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cwxu cwxuVar = this.b;
            final Instant instantF = ((cogw) cwxuVar.d.b()).f();
            ekrw ekrwVarG = cwxu.a.g();
            ekrwVarG.X(eksq.a, "Bugle");
            ((ekrd) ekrwVarG.h("com/google/android/apps/messaging/ui/conversationlist/popups/enterprisearchival/ArchivalPopupPresenter$hide$1", "invokeSuspend", 99, "ArchivalPopupPresenter.kt")).t("Setting Archival popup last dismissed time to %s", instantF.toString());
            cmfo cmfoVar = (cmfo) cwxuVar.c.b();
            fdap fdapVar = new fdap() { // from class: cwxr
                @Override // defpackage.fdap
                public final Object invoke(Object obj2) {
                    cnqf cnqfVar = (cnqf) ((cnqg) obj2).toBuilder();
                    evvp evvpVarC = evxc.c(instantF.toEpochMilli());
                    cnqfVar.copyOnWrite();
                    cnqg cnqgVar = (cnqg) cnqfVar.instance;
                    evvpVarC.getClass();
                    cnqgVar.c = evvpVarC;
                    cnqgVar.b |= 1;
                    evsn evsnVarBuild = cnqfVar.build();
                    evsnVarBuild.getClass();
                    return (cnqg) evsnVarBuild;
                }
            };
            this.a = 1;
            if (cmfoVar.d(fdapVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cwxs(this.b, fcxyVar);
    }
}
