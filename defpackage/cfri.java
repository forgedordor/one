package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final /* synthetic */ class cfri {
    public static void a(cfrj cfrjVar) {
        cqca.j("BugleNetwork", "Executing RPC: className=%s requestId=%s", cfrjVar.f(), cfrjVar.g());
    }

    public static void b(cfrj cfrjVar) {
        cqca.j("BugleNetwork", "Received result for RPC: className=%s requestId=%s, responseId=%d", cfrjVar.f(), cfrjVar.g(), Long.valueOf(cfrjVar.a()));
    }

    public static void c(cfrj cfrjVar) {
        cqca.o("BugleNetwork", "Failed to make RPC call: className=%s requestId=%s, responseId=%d", cfrjVar.f(), cfrjVar.g(), Long.valueOf(cfrjVar.a()));
    }
}
