package defpackage;

import com.android.vcard.VCardConstants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctht {
    public static final ctht a;
    public static final ctht b;
    public static final ctht c;
    public static final ctht d;
    public static final ctht e;
    public static final ctht f;
    public static final ctht g;
    public static final ctht h;
    public static final ctht i;
    private static final /* synthetic */ ctht[] k;
    public final int j;

    static {
        ctht cthtVar = new ctht("DATETIME", 0, 1);
        a = cthtVar;
        ctht cthtVar2 = new ctht("LINK", 1, 2);
        b = cthtVar2;
        ctht cthtVar3 = new ctht("PHONE_NUMBER", 2, 3);
        c = cthtVar3;
        ctht cthtVar4 = new ctht(VCardConstants.PROPERTY_EMAIL, 3, 4);
        d = cthtVar4;
        ctht cthtVar5 = new ctht("ADDRESS", 4, 5);
        e = cthtVar5;
        ctht cthtVar6 = new ctht("MAP_LINK", 5, 6);
        f = cthtVar6;
        ctht cthtVar7 = new ctht("IMAGE", 6, 7);
        g = cthtVar7;
        ctht cthtVar8 = new ctht(VCardConstants.PARAM_TYPE_VIDEO, 7, 8);
        h = cthtVar8;
        ctht cthtVar9 = new ctht("OTHERS", 8, 9);
        i = cthtVar9;
        ctht[] cthtVarArr = {cthtVar, cthtVar2, cthtVar3, cthtVar4, cthtVar5, cthtVar6, cthtVar7, cthtVar8, cthtVar9};
        k = cthtVarArr;
        fczb.a(cthtVarArr);
    }

    private ctht(String str, int i2, int i3) {
        this.j = i3;
    }

    public static ctht[] values() {
        return (ctht[]) k.clone();
    }
}
