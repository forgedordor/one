package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class qbo {
    public static final qbo a;
    public static final qbo b;
    public static final qbo c;
    public static final qbo d;
    public static final qbo e;
    public static final qbo f;
    private static final /* synthetic */ qbo[] g;

    static {
        qbo qboVar = new qbo("ENQUEUED", 0);
        a = qboVar;
        qbo qboVar2 = new qbo("RUNNING", 1);
        b = qboVar2;
        qbo qboVar3 = new qbo("SUCCEEDED", 2);
        c = qboVar3;
        qbo qboVar4 = new qbo("FAILED", 3);
        d = qboVar4;
        qbo qboVar5 = new qbo("BLOCKED", 4);
        e = qboVar5;
        qbo qboVar6 = new qbo("CANCELLED", 5);
        f = qboVar6;
        qbo[] qboVarArr = {qboVar, qboVar2, qboVar3, qboVar4, qboVar5, qboVar6};
        g = qboVarArr;
        fczb.a(qboVarArr);
    }

    private qbo(String str, int i) {
    }

    public static qbo[] values() {
        return (qbo[]) g.clone();
    }

    public final boolean a() {
        return this == c || this == d || this == f;
    }
}
