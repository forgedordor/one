package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wgo {
    public static final wgo a;
    public static final wgo b;
    public static final wgo c;
    public static final wgo d;
    public static final wgo e;
    private static final /* synthetic */ wgo[] f;

    static {
        wgo wgoVar = new wgo("NONE", 0);
        a = wgoVar;
        wgo wgoVar2 = new wgo("SUBJECT_URGENT", 1);
        b = wgoVar2;
        wgo wgoVar3 = new wgo("REPLY", 2);
        c = wgoVar3;
        wgo wgoVar4 = new wgo("SCHEDULED_SEND", 3);
        d = wgoVar4;
        wgo wgoVar5 = new wgo("EDIT", 4);
        e = wgoVar5;
        wgo[] wgoVarArr = {wgoVar, wgoVar2, wgoVar3, wgoVar4, wgoVar5};
        f = wgoVarArr;
        fczb.a(wgoVarArr);
    }

    private wgo(String str, int i) {
    }

    public static wgo[] values() {
        return (wgo[]) f.clone();
    }
}
