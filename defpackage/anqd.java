package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anqd {
    public static final anqd a;
    public static final anqd b;
    public static final anqd c;
    public static final anqd d;
    public static final anqd e;
    private static final /* synthetic */ anqd[] f;

    static {
        anqd anqdVar = new anqd("UNKNOWN", 0);
        a = anqdVar;
        anqd anqdVar2 = new anqd("DO_NOT_SEND", 1);
        b = anqdVar2;
        anqd anqdVar3 = new anqd("NOT_SENT", 2);
        c = anqdVar3;
        anqd anqdVar4 = new anqd("SENT", 3);
        d = anqdVar4;
        anqd anqdVar5 = new anqd("SHOULD_SEND_NEW", 4);
        e = anqdVar5;
        anqd[] anqdVarArr = {anqdVar, anqdVar2, anqdVar3, anqdVar4, anqdVar5};
        f = anqdVarArr;
        fczb.a(anqdVarArr);
    }

    private anqd(String str, int i) {
    }

    public static anqd[] values() {
        return (anqd[]) f.clone();
    }
}
