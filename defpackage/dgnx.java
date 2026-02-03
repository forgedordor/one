package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgnx {
    public static final dgnx a;
    public static final dgnx b;
    public static final dgnx c;
    private static final /* synthetic */ dgnx[] d;

    static {
        dgnx dgnxVar = new dgnx("FULL_LAUNCH", 0);
        a = dgnxVar;
        dgnx dgnxVar2 = new dgnx("DARK_LAUNCH", 1);
        b = dgnxVar2;
        dgnx dgnxVar3 = new dgnx("NOT_LAUNCHED", 2);
        c = dgnxVar3;
        dgnx[] dgnxVarArr = {dgnxVar, dgnxVar2, dgnxVar3};
        d = dgnxVarArr;
        fczb.a(dgnxVarArr);
    }

    private dgnx(String str, int i) {
    }

    public static dgnx[] values() {
        return (dgnx[]) d.clone();
    }
}
