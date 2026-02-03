package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlwx {
    public static final dlwx a;
    public static final dlwx b;
    public static final dlwx c;
    public static final dlwx d;
    private static final /* synthetic */ dlwx[] e;

    static {
        dlwx dlwxVar = new dlwx("QUEUED_INPUT_BUFFER", 0);
        a = dlwxVar;
        dlwx dlwxVar2 = new dlwx("NO_AVAILABLE_INPUT_BUFFER", 1);
        b = dlwxVar2;
        dlwx dlwxVar3 = new dlwx("REACHED_END_OF_FILE", 2);
        c = dlwxVar3;
        dlwx dlwxVar4 = new dlwx("INPUT_BUFFER_NOT_QUEUED", 3);
        d = dlwxVar4;
        dlwx[] dlwxVarArr = {dlwxVar, dlwxVar2, dlwxVar3, dlwxVar4};
        e = dlwxVarArr;
        fczb.a(dlwxVarArr);
    }

    private dlwx(String str, int i) {
    }

    public static dlwx[] values() {
        return (dlwx[]) e.clone();
    }
}
