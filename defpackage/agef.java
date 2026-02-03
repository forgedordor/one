package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agef {
    public static final agef a;
    public static final agef b;
    private static final /* synthetic */ agef[] c;

    static {
        agef agefVar = new agef("DIALOG_CLOSED", 0);
        a = agefVar;
        agef agefVar2 = new agef("DIALOG_NOT_SHOWN", 1);
        b = agefVar2;
        agef[] agefVarArr = {agefVar, agefVar2};
        c = agefVarArr;
        fczb.a(agefVarArr);
    }

    private agef(String str, int i) {
    }

    public static agef[] values() {
        return (agef[]) c.clone();
    }
}
