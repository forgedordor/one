package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class lvb {
    public static final lvb a;
    public static final lvb b;
    public static final lvb c;
    public static final lvb d;
    public static final lvb e;
    private static final /* synthetic */ lvb[] f;

    static {
        lvb lvbVar = new lvb("DESTROYED", 0);
        a = lvbVar;
        lvb lvbVar2 = new lvb("INITIALIZED", 1);
        b = lvbVar2;
        lvb lvbVar3 = new lvb("CREATED", 2);
        c = lvbVar3;
        lvb lvbVar4 = new lvb("STARTED", 3);
        d = lvbVar4;
        lvb lvbVar5 = new lvb("RESUMED", 4);
        e = lvbVar5;
        lvb[] lvbVarArr = {lvbVar, lvbVar2, lvbVar3, lvbVar4, lvbVar5};
        f = lvbVarArr;
        fczb.a(lvbVarArr);
    }

    private lvb(String str, int i) {
    }

    public static lvb[] values() {
        return (lvb[]) f.clone();
    }

    public final boolean a(lvb lvbVar) {
        lvbVar.getClass();
        return compareTo(lvbVar) >= 0;
    }
}
