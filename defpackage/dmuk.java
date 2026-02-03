package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmuk {
    public static final dmuk a;
    public static final dmuk b;
    public static final dmuk c;
    private static final /* synthetic */ dmuk[] d;

    static {
        dmuk dmukVar = new dmuk("NONE", 0);
        a = dmukVar;
        dmuk dmukVar2 = new dmuk("PARTIAL", 1);
        b = dmukVar2;
        dmuk dmukVar3 = new dmuk("FULL", 2);
        c = dmukVar3;
        dmuk[] dmukVarArr = {dmukVar, dmukVar2, dmukVar3};
        d = dmukVarArr;
        fczb.a(dmukVarArr);
    }

    private dmuk(String str, int i) {
    }

    public static dmuk[] values() {
        return (dmuk[]) d.clone();
    }
}
