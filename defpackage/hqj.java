package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class hqj {
    public static final hqj a;
    public static final hqj b;
    public static final hqj c;
    public static final hqj d;
    public static final hqj e;
    public static final hqj f;
    private static final /* synthetic */ hqj[] g;

    static {
        hqj hqjVar = new hqj("ShutDown", 0);
        a = hqjVar;
        hqj hqjVar2 = new hqj("ShuttingDown", 1);
        b = hqjVar2;
        hqj hqjVar3 = new hqj("Inactive", 2);
        c = hqjVar3;
        hqj hqjVar4 = new hqj("InactivePendingWork", 3);
        d = hqjVar4;
        hqj hqjVar5 = new hqj("Idle", 4);
        e = hqjVar5;
        hqj hqjVar6 = new hqj("PendingWork", 5);
        f = hqjVar6;
        hqj[] hqjVarArr = {hqjVar, hqjVar2, hqjVar3, hqjVar4, hqjVar5, hqjVar6};
        g = hqjVarArr;
        fczb.a(hqjVarArr);
    }

    private hqj(String str, int i) {
    }

    public static hqj[] values() {
        return (hqj[]) g.clone();
    }
}
