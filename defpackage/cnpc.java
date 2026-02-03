package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cnpc {
    public final cczi a;
    public final cczi b;

    public cnpc(String str, boolean z) {
        dzzf dzzfVar = cdag.b;
        this.a = cdag.h(dzzfVar, str.concat("_heuristric_enabled"), true);
        this.b = cdag.h(dzzfVar, str.concat("_heuristic_ignored"), z);
    }
}
