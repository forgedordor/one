package defpackage;

import com.android.vcard.VCardConstants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaab {
    public static final aaab a;
    public static final aaab b;
    public static final aaab c;
    private static final /* synthetic */ aaab[] d;

    static {
        aaab aaabVar = new aaab("TEXT", 0);
        a = aaabVar;
        aaab aaabVar2 = new aaab("AUDIO", 1);
        b = aaabVar2;
        aaab aaabVar3 = new aaab(VCardConstants.PARAM_TYPE_VIDEO, 2);
        c = aaabVar3;
        aaab[] aaabVarArr = {aaabVar, aaabVar2, aaabVar3};
        d = aaabVarArr;
        fczb.a(aaabVarArr);
    }

    private aaab(String str, int i) {
    }

    public static aaab[] values() {
        return (aaab[]) d.clone();
    }
}
