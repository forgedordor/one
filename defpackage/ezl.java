package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ezl {
    public static final ezl a;
    public static final ezl b;
    public static final ezl c;
    private static final /* synthetic */ ezl[] d;

    static {
        ezl ezlVar = new ezl("Cursor", 0);
        a = ezlVar;
        ezl ezlVar2 = new ezl("SelectionStart", 1);
        b = ezlVar2;
        ezl ezlVar3 = new ezl("SelectionEnd", 2);
        c = ezlVar3;
        ezl[] ezlVarArr = {ezlVar, ezlVar2, ezlVar3};
        d = ezlVarArr;
        fczb.a(ezlVarArr);
    }

    private ezl(String str, int i) {
    }

    public static ezl[] values() {
        return (ezl[]) d.clone();
    }
}
