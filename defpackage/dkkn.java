package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkkn {
    public static final dkkn a;
    public static final dkkn b;
    private static final /* synthetic */ dkkn[] c;

    static {
        dkkn dkknVar = new dkkn("DOUBLE_TAP_ORIGIN_TOUCH_GESTURE", 0);
        a = dkknVar;
        dkkn dkknVar2 = new dkkn("DOUBLE_TAP_ORIGIN_ACCESSIBILITY_ACTION", 1);
        b = dkknVar2;
        dkkn[] dkknVarArr = {dkknVar, dkknVar2};
        c = dkknVarArr;
        fczb.a(dkknVarArr);
    }

    private dkkn(String str, int i) {
    }

    public static dkkn[] values() {
        return (dkkn[]) c.clone();
    }
}
