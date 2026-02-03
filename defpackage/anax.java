package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anax {
    public static final anax a;
    public static final anax b;
    private static final /* synthetic */ anax[] c;

    static {
        anax anaxVar = new anax("STAR", 0);
        a = anaxVar;
        anax anaxVar2 = new anax("UNSTAR", 1);
        b = anaxVar2;
        anax[] anaxVarArr = {anaxVar, anaxVar2};
        c = anaxVarArr;
        fczb.a(anaxVarArr);
    }

    private anax(String str, int i) {
    }

    public static anax[] values() {
        return (anax[]) c.clone();
    }
}
