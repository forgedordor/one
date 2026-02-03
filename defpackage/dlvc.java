package defpackage;

import android.os.Build;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlvc {
    public static final dlvc a;
    public static final dlvc b;
    public static final dlvc c;
    public static final dlvc d;
    public static final dlvc e;
    public static final dlvc f;
    public static final dlvc g;
    public static final dlvc h;
    public static final dlvc i;
    public static final dlvc j;
    private static final /* synthetic */ dlvc[] l;
    public final String k;
    private final int m;

    static {
        dlvc dlvcVar = new dlvc("ID", 0, "_id", 1);
        a = dlvcVar;
        dlvc dlvcVar2 = new dlvc("MIME_TYPE", 1, "mime_type", 1);
        b = dlvcVar2;
        dlvc dlvcVar3 = new dlvc("SIZE", 2, "_size", 1);
        c = dlvcVar3;
        dlvc dlvcVar4 = new dlvc("DISPLAY_NAME", 3, "_display_name", 1);
        d = dlvcVar4;
        dlvc dlvcVar5 = new dlvc("DATE_MODIFIED", 4, "date_modified", 1);
        e = dlvcVar5;
        dlvc dlvcVar6 = new dlvc("DATE_ADDED", 5, "date_added", 1);
        f = dlvcVar6;
        dlvc dlvcVar7 = new dlvc("WIDTH", 6, "width", 16);
        g = dlvcVar7;
        dlvc dlvcVar8 = new dlvc("HEIGHT", 7, "height", 16);
        h = dlvcVar8;
        dlvc dlvcVar9 = new dlvc("DURATION", 8, "duration", 29);
        i = dlvcVar9;
        dlvc dlvcVar10 = new dlvc("ORIENTATION", 9, "orientation", 29);
        j = dlvcVar10;
        dlvc[] dlvcVarArr = {dlvcVar, dlvcVar2, dlvcVar3, dlvcVar4, dlvcVar5, dlvcVar6, dlvcVar7, dlvcVar8, dlvcVar9, dlvcVar10};
        l = dlvcVarArr;
        fczb.a(dlvcVarArr);
    }

    private dlvc(String str, int i2, String str2, int i3) {
        this.m = i3;
        this.k = Build.VERSION.SDK_INT < i3 ? null : str2;
    }

    public static dlvc[] values() {
        return (dlvc[]) l.clone();
    }
}
