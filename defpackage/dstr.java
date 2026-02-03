package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dstr {
    public static final dstr a;
    public static final dstr b;
    private static final /* synthetic */ dstr[] c;

    static {
        dstr dstrVar = new dstr("CUSTOM_UI_TYPE_GROWTH_CATALOG_DIALOG", 0);
        a = dstrVar;
        dstr dstrVar2 = new dstr("CUSTOM_UI_TYPE_ANDROID_DESKTOP_GROWTH_NUDGE", 1);
        b = dstrVar2;
        dstr[] dstrVarArr = {dstrVar, dstrVar2};
        c = dstrVarArr;
        fczb.a(dstrVarArr);
    }

    private dstr(String str, int i) {
    }

    public static dstr[] values() {
        return (dstr[]) c.clone();
    }
}
