package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmbu {
    public static final dmbu a;
    public static final dmbu b;
    public static final dmbu c;
    private static final /* synthetic */ dmbu[] d;

    static {
        dmbu dmbuVar = new dmbu("MINI_CAMERA", 0);
        a = dmbuVar;
        dmbu dmbuVar2 = new dmbu("FULLSCREEN_CAMERA", 1);
        b = dmbuVar2;
        dmbu dmbuVar3 = new dmbu("POPUP_CAMERA", 2);
        c = dmbuVar3;
        dmbu[] dmbuVarArr = {dmbuVar, dmbuVar2, dmbuVar3};
        d = dmbuVarArr;
        fczb.a(dmbuVarArr);
    }

    private dmbu(String str, int i) {
    }

    public static dmbu[] values() {
        return (dmbu[]) d.clone();
    }
}
