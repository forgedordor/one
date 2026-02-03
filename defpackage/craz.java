package defpackage;

import com.android.vcard.VCardConstants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class craz {
    public static final craz a;
    public static final craz b;
    public static final craz c;
    public static final craz d;
    public static final craz e;
    public static final craz f;
    private static final /* synthetic */ craz[] g;

    static {
        craz crazVar = new craz("NONE", 0);
        a = crazVar;
        craz crazVar2 = new craz("TEXT", 1);
        b = crazVar2;
        craz crazVar3 = new craz(VCardConstants.PARAM_PHONE_EXTRA_TYPE_ASSISTANT, 2);
        c = crazVar3;
        craz crazVar4 = new craz("REMINDER", 3);
        d = crazVar4;
        craz crazVar5 = new craz("STICKER", 4);
        e = crazVar5;
        craz crazVar6 = new craz("CALENDAR", 5);
        f = crazVar6;
        craz[] crazVarArr = {crazVar, crazVar2, crazVar3, crazVar4, crazVar5, crazVar6};
        g = crazVarArr;
        fczb.a(crazVarArr);
    }

    private craz(String str, int i) {
    }

    public static craz[] values() {
        return (craz[]) g.clone();
    }
}
