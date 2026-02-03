package defpackage;

import com.android.vcard.VCardConstants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clie {
    public static final clie a;
    public static final clie b;
    public static final clie c;
    public static final clie d;
    public static final clie e;
    public static final clie f;
    private static final /* synthetic */ clie[] g;

    static {
        clie clieVar = new clie("UNKNOWN", 0);
        a = clieVar;
        clie clieVar2 = new clie("SATELLITE", 1);
        b = clieVar2;
        clie clieVar3 = new clie("CELLULAR", 2);
        c = clieVar3;
        clie clieVar4 = new clie("WIFI", 3);
        d = clieVar4;
        clie clieVar5 = new clie("NO_CONNECTION", 4);
        e = clieVar5;
        clie clieVar6 = new clie(VCardConstants.PARAM_PHONE_EXTRA_TYPE_OTHER, 5);
        f = clieVar6;
        clie[] clieVarArr = {clieVar, clieVar2, clieVar3, clieVar4, clieVar5, clieVar6};
        g = clieVarArr;
        fczb.a(clieVarArr);
    }

    private clie(String str, int i) {
    }

    public static clie[] values() {
        return (clie[]) g.clone();
    }

    public final boolean a() {
        return this == c || this == d;
    }
}
