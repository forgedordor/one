package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxlf {
    public static final dxlf a;
    public static final dxlf b;
    public static final dxlf c;
    public static final dxlf d;
    public static final dxlf e;
    public static final dxlf f;
    private static final /* synthetic */ dxlf[] g;

    static {
        dxlf dxlfVar = new dxlf("PRODUCTION", 0);
        a = dxlfVar;
        dxlf dxlfVar2 = new dxlf("AUTOPUSH", 1);
        b = dxlfVar2;
        dxlf dxlfVar3 = new dxlf("AUTOPUSH_QUAL_PLAYGROUND", 2);
        c = dxlfVar3;
        dxlf dxlfVar4 = new dxlf("STAGING", 3);
        d = dxlfVar4;
        dxlf dxlfVar5 = new dxlf("STAGING_QUAL_QA", 4);
        e = dxlfVar5;
        dxlf dxlfVar6 = new dxlf("DEV", 5);
        f = dxlfVar6;
        dxlf[] dxlfVarArr = {dxlfVar, dxlfVar2, dxlfVar3, dxlfVar4, dxlfVar5, dxlfVar6};
        g = dxlfVarArr;
        fczb.a(dxlfVarArr);
    }

    private dxlf(String str, int i) {
    }

    public static dxlf[] values() {
        return (dxlf[]) g.clone();
    }
}
