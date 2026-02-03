package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqia {
    public static final cqia a;
    public static final cqia b;
    private static final /* synthetic */ cqia[] c;

    static {
        cqia cqiaVar = new cqia("ELIGIBLE", 0);
        a = cqiaVar;
        cqia cqiaVar2 = new cqia("INELIGIBLE", 1);
        b = cqiaVar2;
        cqia[] cqiaVarArr = {cqiaVar, cqiaVar2};
        c = cqiaVarArr;
        fczb.a(cqiaVarArr);
    }

    private cqia(String str, int i) {
    }

    public static cqia[] values() {
        return (cqia[]) c.clone();
    }
}
