package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aoio {
    public static final aoio a;
    public static final aoio b;
    public static final aoio c;
    private static final /* synthetic */ aoio[] d;

    static {
        aoio aoioVar = new aoio("AVAILABLE", 0);
        a = aoioVar;
        aoio aoioVar2 = new aoio("NOT_AVAILABLE", 1);
        b = aoioVar2;
        aoio aoioVar3 = new aoio("UNSUPPORTED_BY_CARRIER", 2);
        c = aoioVar3;
        aoio[] aoioVarArr = {aoioVar, aoioVar2, aoioVar3};
        d = aoioVarArr;
        fczb.a(aoioVarArr);
    }

    private aoio(String str, int i) {
    }

    public static aoio[] values() {
        return (aoio[]) d.clone();
    }

    public final boolean a() {
        return this == a;
    }
}
