package defpackage;

import com.android.vcard.VCardConstants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahsh {
    public static final ahsh a;
    public static final ahsh b;
    public static final ahsh c;
    public static final ahsh d;
    public static final ahsh e;
    public static final ahsh f;
    public static final ahsh g;
    public static final ahsh h;
    private static final /* synthetic */ ahsh[] i;

    static {
        ahsh ahshVar = new ahsh("UNKNOWN", 0);
        a = ahshVar;
        ahsh ahshVar2 = new ahsh("PLAIN_TEXT", 1);
        b = ahshVar2;
        ahsh ahshVar3 = new ahsh("LINK_PREVIEW", 2);
        c = ahshVar3;
        ahsh ahshVar4 = new ahsh("IMAGE", 3);
        d = ahshVar4;
        ahsh ahshVar5 = new ahsh("AUDIO", 4);
        e = ahshVar5;
        ahsh ahshVar6 = new ahsh(VCardConstants.PARAM_TYPE_VIDEO, 5);
        f = ahshVar6;
        ahsh ahshVar7 = new ahsh("FILE", 6);
        g = ahshVar7;
        ahsh ahshVar8 = new ahsh("VCARD", 7);
        h = ahshVar8;
        ahsh[] ahshVarArr = {ahshVar, ahshVar2, ahshVar3, ahshVar4, ahshVar5, ahshVar6, ahshVar7, ahshVar8};
        i = ahshVarArr;
        fczb.a(ahshVarArr);
    }

    private ahsh(String str, int i2) {
    }

    public static ahsh[] values() {
        return (ahsh[]) i.clone();
    }
}
