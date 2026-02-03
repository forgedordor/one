package defpackage;

import com.android.vcard.VCardConstants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amvv {
    public static final amvv a;
    public static final amvv b;
    public static final amvv c;
    public static final amvv d;
    private static final /* synthetic */ amvv[] e;

    static {
        amvv amvvVar = new amvv("IMAGE", 0);
        a = amvvVar;
        amvv amvvVar2 = new amvv("LINK", 1);
        b = amvvVar2;
        amvv amvvVar3 = new amvv("LOCATION", 2);
        c = amvvVar3;
        amvv amvvVar4 = new amvv(VCardConstants.PARAM_TYPE_VIDEO, 3);
        d = amvvVar4;
        amvv[] amvvVarArr = {amvvVar, amvvVar2, amvvVar3, amvvVar4};
        e = amvvVarArr;
        fczb.a(amvvVarArr);
    }

    private amvv(String str, int i) {
    }

    public static amvv[] values() {
        return (amvv[]) e.clone();
    }
}
