package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dovh {
    public static final dovh a;
    public static final dovh b;
    private static final /* synthetic */ dovh[] c;

    static {
        dovh dovhVar = new dovh("SEARCH", 0);
        a = dovhVar;
        dovh dovhVar2 = new dovh("BACK", 1);
        b = dovhVar2;
        dovh[] dovhVarArr = {dovhVar, dovhVar2};
        c = dovhVarArr;
        fczb.a(dovhVarArr);
    }

    private dovh(String str, int i) {
    }

    public static dovh[] values() {
        return (dovh[]) c.clone();
    }
}
