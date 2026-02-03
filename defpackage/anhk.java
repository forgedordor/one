package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anhk {
    public static final anhk a;
    public static final anhk b;
    private static final /* synthetic */ anhk[] c;

    static {
        anhk anhkVar = new anhk("ADD", 0);
        a = anhkVar;
        anhk anhkVar2 = new anhk("REMOVE", 1);
        b = anhkVar2;
        anhk[] anhkVarArr = {anhkVar, anhkVar2};
        c = anhkVarArr;
        fczb.a(anhkVarArr);
    }

    private anhk(String str, int i) {
    }

    public static anhk[] values() {
        return (anhk[]) c.clone();
    }
}
