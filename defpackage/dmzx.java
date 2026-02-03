package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmzx {
    public static final dmzx a;
    public static final dmzx b;
    public static final dmzx c;
    private static final /* synthetic */ dmzx[] d;

    static {
        dmzx dmzxVar = new dmzx("NONE", 0);
        a = dmzxVar;
        dmzx dmzxVar2 = new dmzx("PARTIAL", 1);
        b = dmzxVar2;
        dmzx dmzxVar3 = new dmzx("FULL", 2);
        c = dmzxVar3;
        dmzx[] dmzxVarArr = {dmzxVar, dmzxVar2, dmzxVar3};
        d = dmzxVarArr;
        fczb.a(dmzxVarArr);
    }

    private dmzx(String str, int i) {
    }

    public static dmzx[] values() {
        return (dmzx[]) d.clone();
    }
}
