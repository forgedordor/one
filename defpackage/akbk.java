package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akbk {
    public static final akbk a;
    public static final akbk b;
    public static final akbk c;
    public static final akbk d;
    private static final /* synthetic */ akbk[] e;

    static {
        akbk akbkVar = new akbk("UNKNOWN", 0);
        a = akbkVar;
        akbk akbkVar2 = new akbk("TRUSTED", 1);
        b = akbkVar2;
        akbk akbkVar3 = new akbk("SEMI_TRUSTED", 2);
        c = akbkVar3;
        akbk akbkVar4 = new akbk("UNTRUSTED", 3);
        d = akbkVar4;
        akbk[] akbkVarArr = {akbkVar, akbkVar2, akbkVar3, akbkVar4};
        e = akbkVarArr;
        fczb.a(akbkVarArr);
    }

    private akbk(String str, int i) {
    }

    public static akbk[] values() {
        return (akbk[]) e.clone();
    }
}
