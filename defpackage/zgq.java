package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zgq {
    public static final zgq a;
    public static final zgq b;
    public static final zgq c;
    public static final zgq d;
    public static final zgq e;
    private static final /* synthetic */ zgq[] f;

    static {
        zgq zgqVar = new zgq("PROCESSING_NO_CONTENT", 0);
        a = zgqVar;
        zgq zgqVar2 = new zgq("DOWNLOADABLE_NO_CONTENT", 1);
        b = zgqVar2;
        zgq zgqVar3 = new zgq("NO_CONNECTION_NO_CONTENT", 2);
        c = zgqVar3;
        zgq zgqVar4 = new zgq("MANUAL_DOWNLOADING_NO_CONTENT", 3);
        d = zgqVar4;
        zgq zgqVar5 = new zgq("NORMAL", 4);
        e = zgqVar5;
        zgq[] zgqVarArr = {zgqVar, zgqVar2, zgqVar3, zgqVar4, zgqVar5};
        f = zgqVarArr;
        fczb.a(zgqVarArr);
    }

    private zgq(String str, int i) {
    }

    public static zgq[] values() {
        return (zgq[]) f.clone();
    }
}
