package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwmw {
    public static final cwmw a;
    public static final cwmw b;
    public static final cwmw c;
    private static final /* synthetic */ cwmw[] d;

    static {
        cwmw cwmwVar = new cwmw("NOT_QUALIFIED", 0);
        a = cwmwVar;
        cwmw cwmwVar2 = new cwmw("QUALIFIED_INCOMING", 1);
        b = cwmwVar2;
        cwmw cwmwVar3 = new cwmw("QUALIFIED_OUTGOING", 2);
        c = cwmwVar3;
        cwmw[] cwmwVarArr = {cwmwVar, cwmwVar2, cwmwVar3};
        d = cwmwVarArr;
        fczb.a(cwmwVarArr);
    }

    private cwmw(String str, int i) {
    }

    public static cwmw[] values() {
        return (cwmw[]) d.clone();
    }
}
