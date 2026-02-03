package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btts {
    public static final btts a;
    public static final btts b;
    public static final btts c;
    private static final /* synthetic */ btts[] d;

    static {
        btts bttsVar = new btts("TIMESTAMP_SECONDS_DUPLICATE_KEY", 0);
        a = bttsVar;
        btts bttsVar2 = new btts("TEXT_AND_TIMESTAMP_SECONDS_DUPLICATE_KEY", 1);
        b = bttsVar2;
        btts bttsVar3 = new btts("SENDER_AND_TIMESTAMP_SECONDS_DUPLICATE_KEY", 2);
        c = bttsVar3;
        btts[] bttsVarArr = {bttsVar, bttsVar2, bttsVar3};
        d = bttsVarArr;
        fczb.a(bttsVarArr);
    }

    private btts(String str, int i) {
    }

    public static btts[] values() {
        return (btts[]) d.clone();
    }
}
