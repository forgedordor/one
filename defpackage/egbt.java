package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egbt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ egbs a(egbr egbrVar) {
        MessageType messagetypeBuild = egbrVar.build();
        messagetypeBuild.getClass();
        return (egbs) messagetypeBuild;
    }

    public static final void b(String str, egbr egbrVar) {
        str.getClass();
        egbrVar.copyOnWrite();
        egbs egbsVar = (egbs) egbrVar.instance;
        egbs egbsVar2 = egbs.a;
        egbsVar.b |= 16;
        egbsVar.g = str;
    }

    public static final void c(String str, egbr egbrVar) {
        str.getClass();
        egbrVar.copyOnWrite();
        egbs egbsVar = (egbs) egbrVar.instance;
        egbs egbsVar2 = egbs.a;
        egbsVar.b |= 2;
        egbsVar.d = str;
    }

    public static final void d(String str, egbr egbrVar) {
        egbrVar.copyOnWrite();
        egbs egbsVar = (egbs) egbrVar.instance;
        egbs egbsVar2 = egbs.a;
        egbsVar.b |= 1;
        egbsVar.c = str;
    }

    public static final void e(egbr egbrVar) {
        egbrVar.copyOnWrite();
        egbs egbsVar = (egbs) egbrVar.instance;
        egbs egbsVar2 = egbs.a;
        egbsVar.b |= 256;
        egbsVar.k = "google";
    }
}
