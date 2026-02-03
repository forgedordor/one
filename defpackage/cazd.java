package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final /* synthetic */ class cazd {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [evuh, java.lang.Object] */
    public static boolean a(cazg cazgVar, byte[] bArr) {
        try {
            return cazgVar.h(cazgVar.d().h(bArr));
        } catch (evtj e) {
            ekrw ekrwVarJ = cazf.a.j();
            ekrwVarJ.X(eksq.a, "BugleWorkQueue");
            ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(e)).h("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkItemHandler", "preflightRaw", 2805, "WorkItemHandler.java")).B("got InvalidProtocol %s for data %d", e, bArr.length);
            return false;
        }
    }

    public static caya b() {
        return caya.l().a();
    }
}
