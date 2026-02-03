package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awpy {
    public static final awpy a;
    public static final awpy b;
    private static final /* synthetic */ awpy[] c;

    static {
        awpy awpyVar = new awpy("RCS", 0);
        a = awpyVar;
        awpy awpyVar2 = new awpy("MMS", 1);
        b = awpyVar2;
        awpy[] awpyVarArr = {awpyVar, awpyVar2};
        c = awpyVarArr;
        fczb.a(awpyVarArr);
    }

    private awpy(String str, int i) {
    }

    public static awpy[] values() {
        return (awpy[]) c.clone();
    }
}
