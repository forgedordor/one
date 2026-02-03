package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dasz implements bxhi {
    private static final eksp b = eksp.c("BugleJobs");
    private final fcsu c;
    private final fcsu d;
    private final fcsu e;

    public dasz(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        this.c = fcsuVar;
        this.e = fcsuVar3;
        this.d = fcsuVar2;
    }

    @Override // defpackage.bxhi
    public final void a(bxhk bxhkVar) {
        eieu eieuVarK = eiiy.k("SyncDataToWearableAppHandlerScheduler#queue");
        try {
            int i = bxhkVar.b;
            if (i == 2 || i == 1) {
                eieu eieuVarK2 = eiiy.k("SyncDataToWearableAppHandlerScheduler#checkSkipSync");
                try {
                    if (((ctap) this.e.b()).b()) {
                        eieuVarK2.close();
                        eksp ekspVar = b;
                        eksl ekslVar = (eksl) ekspVar.g();
                        ekslVar.X(cqnc.S, "SyncDataToWearableAppHandlerScheduler");
                        ((eksl) ekslVar.h("com/google/android/apps/messaging/wearable/workhandler/SyncDataToWearableAppHandlerScheduler", "queue", 69, "SyncDataToWearableAppHandlerScheduler.java")).q("Queue broadcast wear data work item.");
                        eieu eieuVarK3 = eiiy.k("SyncDataToWearableAppHandlerScheduler#queueWearSync");
                        try {
                            data dataVar = (data) this.c.b();
                            caxr caxrVar = new caxr();
                            caxrVar.b = "sync_data_to_wearable_app_dedupe";
                            dataVar.b(caxrVar.a());
                            eieuVarK3.close();
                            if (bxhkVar.b == 2) {
                                eieuVarK3 = eiiy.k("SyncDataToWearableAppHandlerScheduler#queueConversationSync");
                                try {
                                    ekrw ekrwVarO = ekspVar.o();
                                    ekrwVarO.X(cqnc.S, "SyncDataToWearableAppHandlerScheduler");
                                    ((eksl) ekrwVarO.h("com/google/android/apps/messaging/wearable/workhandler/SyncDataToWearableAppHandlerScheduler", "queue", 87, "SyncDataToWearableAppHandlerScheduler.java")).q("Queue sync conversation data to wearable work item.");
                                    for (String str : bxhkVar.c) {
                                        dasj dasjVar = (dasj) this.d.b();
                                        dask daskVar = (dask) dasl.a.createBuilder();
                                        daskVar.copyOnWrite();
                                        dasl daslVar = (dasl) daskVar.instance;
                                        str.getClass();
                                        daslVar.b = str;
                                        dasl daslVar2 = (dasl) daskVar.build();
                                        caxr caxrVar2 = new caxr();
                                        caxrVar2.b = str;
                                        ((cazj) dasjVar.a.b()).a(cbcu.g("sync_conversation_data_to_wearable", daslVar2, caxrVar2.a()));
                                    }
                                    eieuVarK3.close();
                                } finally {
                                }
                            }
                        } finally {
                        }
                    } else {
                        ekrw ekrwVarO2 = b.o();
                        ekrwVarO2.X(cqnc.S, "SyncDataToWearableAppHandlerScheduler");
                        ((eksl) ekrwVarO2.h("com/google/android/apps/messaging/wearable/workhandler/SyncDataToWearableAppHandlerScheduler", "queue", 61, "SyncDataToWearableAppHandlerScheduler.java")).q("Skipping scheduling sync to wear devices.");
                        eieuVarK2.close();
                    }
                } finally {
                    try {
                        eieuVarK2.close();
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                }
            }
            eieuVarK.close();
        } catch (Throwable th2) {
            try {
                eieuVarK.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
