package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class jqc {
    public static final jqc a;
    public static final jqc b;
    public static final jqc c;
    public static final jqc d;
    public static final jqc e;
    private static final /* synthetic */ jqc[] h;
    public final int f;
    public final int g;

    static {
        jqc jqcVar = new jqc("Copy", 0, 0);
        a = jqcVar;
        jqc jqcVar2 = new jqc("Paste", 1, 1);
        b = jqcVar2;
        jqc jqcVar3 = new jqc("Cut", 2, 2);
        c = jqcVar3;
        jqc jqcVar4 = new jqc("SelectAll", 3, 3);
        d = jqcVar4;
        jqc jqcVar5 = new jqc("Autofill", 4, 4);
        e = jqcVar5;
        jqc[] jqcVarArr = {jqcVar, jqcVar2, jqcVar3, jqcVar4, jqcVar5};
        h = jqcVarArr;
        fczb.a(jqcVarArr);
    }

    private jqc(String str, int i, int i2) {
        this.f = i2;
        this.g = i2;
    }

    public static jqc[] values() {
        return (jqc[]) h.clone();
    }
}
