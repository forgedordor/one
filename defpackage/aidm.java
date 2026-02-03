package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aidm {
    public static final aidm a;
    public static final aidm b;
    private static final /* synthetic */ aidm[] c;

    static {
        aidm aidmVar = new aidm("SinglePane", 0);
        a = aidmVar;
        aidm aidmVar2 = new aidm("DualPane", 1);
        b = aidmVar2;
        aidm[] aidmVarArr = {aidmVar, aidmVar2};
        c = aidmVarArr;
        fczb.a(aidmVarArr);
    }

    private aidm(String str, int i) {
    }

    public static aidm[] values() {
        return (aidm[]) c.clone();
    }
}
