package defpackage;

import com.android.vcard.VCardConstants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djdi implements djdk {
    public static final djdi a;
    public static final djdi b;
    public static final djdi c;
    public static final djdi d;
    public static final djdi e;
    public static final djdi f;
    private static final /* synthetic */ djdi[] g;

    static {
        djdi djdiVar = new djdi("AI_REWRITE", 0);
        a = djdiVar;
        djdi djdiVar2 = new djdi("AI_SUGGEST", 1);
        b = djdiVar2;
        djdi djdiVar3 = new djdi("GALLERY", 2);
        c = djdiVar3;
        djdi djdiVar4 = new djdi("EMOTIVE", 3);
        d = djdiVar4;
        djdi djdiVar5 = new djdi("SHORTCUTS", 4);
        e = djdiVar5;
        djdi djdiVar6 = new djdi(VCardConstants.PARAM_TYPE_VOICE, 5);
        f = djdiVar6;
        djdi[] djdiVarArr = {djdiVar, djdiVar2, djdiVar3, djdiVar4, djdiVar5, djdiVar6};
        g = djdiVarArr;
        fczb.a(djdiVarArr);
    }

    private djdi(String str, int i) {
    }

    public static djdi[] values() {
        return (djdi[]) g.clone();
    }
}
