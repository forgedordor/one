package defpackage;

import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final /* synthetic */ class cfhb implements Runnable {
    public final /* synthetic */ cfhm a;

    /* JADX WARN: Type inference failed for: r2v9, types: [ejxr, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        ekhx ekhxVarO;
        final cfhm cfhmVar = this.a;
        eieh eiehVarC = cfhmVar.i.c("BindHandlerImpl#checkMessageIdsAndPull", "com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "checkMessageIdsAndPull", 276);
        try {
            synchronized (cfhmVar.n) {
                ekhxVarO = ekhx.o(cfhmVar.s);
                cfhmVar.s = new HashSet();
            }
            if (ekhxVarO.isEmpty()) {
                ekrw ekrwVarH = cfhm.c.h();
                ekrwVarH.X(eksq.a, "BugleNetwork");
                ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "checkMessageIdsAndPull", 289, "BindHandlerImpl.java")).q("checkMessageIdsAndPull called without any msg ID, potentially a bug");
                cfhmVar.f();
            } else {
                ekrg ekrgVar = cfhm.c;
                ekrw ekrwVarE = ekrgVar.e();
                ekrz ekrzVar = eksq.a;
                ekrwVarE.X(ekrzVar, "BugleNetwork");
                ekrd ekrdVar = (ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "checkMessageIdsAndPull", 294, "BindHandlerImpl.java");
                int i = cfhmVar.J;
                ekrdVar.B("%s BindHandler: Checking if %d tickled messages have all been received.", emjc.a(i), ekhxVarO.size());
                if (cfhmVar.z.b(ekhxVarO)) {
                    ekrw ekrwVarH2 = ekrgVar.h();
                    ekrwVarH2.X(ekrzVar, "BugleNetwork");
                    ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "checkMessageIdsAndPull", 299, "BindHandlerImpl.java")).t("%s BindHandler: All tickled message IDs have been received recently. Skip pulling.", emjc.a(i));
                    cfhmVar.f();
                    ((ains) cfhmVar.w.b()).e("Bugle.Ditto.Binding.TicklePulling.Counts", 2);
                } else {
                    ((ains) cfhmVar.w.b()).e("Bugle.Ditto.Binding.TicklePulling.Counts", 3);
                    ekrw ekrwVarH3 = ekrgVar.h();
                    ekrwVarH3.X(ekrzVar, "BugleNetwork");
                    ((ekrd) ((ekrd) ekrwVarH3).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "checkMessageIdsAndPull", 314, "BindHandlerImpl.java")).t("%s BindHandler: Initiate a pull because some tickled IDs haven't been seen", emjc.a(i));
                    eiju eijuVarA = ((cfpa) cfhmVar.C.get().get()).a();
                    ejvr ejvrVar = new ejvr() { // from class: cfhe
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj) {
                            ekrw ekrwVarH4 = cfhm.c.h();
                            ekrwVarH4.X(eksq.a, "BugleNetwork");
                            ((ekrd) ((ekrd) ((ekrd) ekrwVarH4).g((Exception) obj)).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "checkMessageIdsAndPull", 325, "BindHandlerImpl.java")).t("%s BindHandler: Pull message failed", emjc.a(cfhmVar.J));
                            return null;
                        }
                    };
                    eosd eosdVar = cfhmVar.x;
                    eijuVarA.e(Exception.class, ejvrVar, eosdVar).h(new ejvr() { // from class: cfhf
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj) {
                            cfhmVar.f();
                            return null;
                        }
                    }, eosdVar);
                }
            }
            eiehVarC.close();
        } catch (Throwable th) {
            try {
                eiehVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
