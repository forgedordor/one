package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vwo {
    public static final vwo a;
    public static final vwo b;
    public static final vwo c;
    private static final /* synthetic */ vwo[] d;

    static {
        vwo vwoVar = new vwo("CONVERSATION", 0);
        a = vwoVar;
        vwo vwoVar2 = new vwo("MULTI_SHARE", 1);
        b = vwoVar2;
        vwo vwoVar3 = new vwo("EMERGENCY", 2);
        c = vwoVar3;
        vwo[] vwoVarArr = {vwoVar, vwoVar2, vwoVar3};
        d = vwoVarArr;
        fczb.a(vwoVarArr);
    }

    private vwo(String str, int i) {
    }

    public static vwo[] values() {
        return (vwo[]) d.clone();
    }
}
