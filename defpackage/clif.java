package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clif {

    @fcsv
    public static final clif a;
    public static final clif b;
    public static final clif c;
    public static final clif d;
    public static final clif e;
    private static final /* synthetic */ clif[] f;

    static {
        clif clifVar = new clif("MANUAL_SATELLITE_CONNECT_ELIGIBLE", 0);
        a = clifVar;
        clif clifVar2 = new clif("SATELLITE_DATA", 1);
        b = clifVar2;
        clif clifVar3 = new clif("SATELLITE_SMS", 2);
        c = clifVar3;
        clif clifVar4 = new clif("TERRESTRIAL", 3);
        d = clifVar4;
        clif clifVar5 = new clif("NO_CONNECTION", 4);
        e = clifVar5;
        clif[] clifVarArr = {clifVar, clifVar2, clifVar3, clifVar4, clifVar5};
        f = clifVarArr;
        fczb.a(clifVarArr);
    }

    private clif(String str, int i) {
    }

    public static clif[] values() {
        return (clif[]) f.clone();
    }
}
