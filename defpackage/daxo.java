package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class daxo {
    public static final daxo a;
    public static final daxo b;
    public static final daxo c;
    private static final /* synthetic */ daxo[] e;
    public final int d;

    static {
        daxo daxoVar = new daxo("EDIT_PICTURE", 0, etzq.PRIVACY_PROFILE_PICTURE_SCREEN.rz);
        a = daxoVar;
        daxo daxoVar2 = new daxo("EDIT_PICTURE_SETTINGS", 1, etzq.PRIVACY_PROFILE_PICTURE_SCREEN.rz);
        b = daxoVar2;
        daxo daxoVar3 = new daxo("EDIT_NAME", 2, etzq.PROFILE_NAME_EDIT_SCREEN.rz);
        c = daxoVar3;
        daxo[] daxoVarArr = {daxoVar, daxoVar2, daxoVar3};
        e = daxoVarArr;
        fczb.a(daxoVarArr);
    }

    private daxo(String str, int i, int i2) {
        this.d = i2;
    }

    public static daxo[] values() {
        return (daxo[]) e.clone();
    }
}
