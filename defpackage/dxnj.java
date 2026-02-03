package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxnj {
    public static final dxnj a;
    public static final dxnj b;
    public static final dxnj c;
    public static final dxnj d;
    public static final dxnj e;
    private static final /* synthetic */ dxnj[] g;
    public final int f;

    static {
        dxnj dxnjVar = new dxnj("UNKNOWN", 0, 0);
        a = dxnjVar;
        dxnj dxnjVar2 = new dxnj("SIGNED_IN", 1, 1);
        b = dxnjVar2;
        dxnj dxnjVar3 = new dxnj("SIGNED_OUT_ZWIEBACK", 2, 2);
        c = dxnjVar3;
        dxnj dxnjVar4 = new dxnj("SIGNED_OUT_YOUTUBE_VISITOR", 3, 3);
        d = dxnjVar4;
        dxnj dxnjVar5 = new dxnj("SIGNED_IN_FITBIT", 4, 4);
        e = dxnjVar5;
        dxnj[] dxnjVarArr = {dxnjVar, dxnjVar2, dxnjVar3, dxnjVar4, dxnjVar5};
        g = dxnjVarArr;
        fczb.a(dxnjVarArr);
    }

    private dxnj(String str, int i, int i2) {
        this.f = i2;
    }

    public static dxnj[] values() {
        return (dxnj[]) g.clone();
    }
}
