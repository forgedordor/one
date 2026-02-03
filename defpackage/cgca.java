package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cgca implements eora {
    final /* synthetic */ cgcb a;

    public cgca(cgcb cgcbVar) {
        this.a = cgcbVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        cgbf cgbfVar = (cgbf) obj;
        if (cgbfVar == null) {
            ((eksl) ((eksl) cgcb.a.i()).h("com/google/android/apps/messaging/shared/notification/BugleNotificationManagerImpl$3", "onSuccess", 737, "BugleNotificationManagerImpl.java")).q("No notification created for Auto-moved spam");
            return;
        }
        cgcb cgcbVar = this.a;
        if (cgcbVar.Z(cgbfVar)) {
            ((crye) cgcbVar.d.b()).a(new fdap() { // from class: cryd
                @Override // defpackage.fdap
                public final Object invoke(Object obj2) {
                    eofh eofhVar = (eofh) obj2;
                    cczi ccziVar = crye.a;
                    eofhVar.getClass();
                    eoed eoedVar = (eoed) eoee.a.createBuilder();
                    eoedVar.getClass();
                    evsn evsnVarBuild = eoedVar.build();
                    evsnVarBuild.getClass();
                    eoef eoefVar = eofhVar.a;
                    eoefVar.copyOnWrite();
                    eoeg eoegVar = (eoeg) eoefVar.instance;
                    eoeg eoegVar2 = eoeg.a;
                    eoegVar.c = (eoee) evsnVarBuild;
                    eoegVar.b = 2;
                    return fctx.a;
                }
            });
        }
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        ((eksl) ((eksl) ((eksl) cgcb.a.i()).g(th)).h("com/google/android/apps/messaging/shared/notification/BugleNotificationManagerImpl$3", "onFailure", (char) 744, "BugleNotificationManagerImpl.java")).q("Auto-moved spam creation future failed");
    }
}
