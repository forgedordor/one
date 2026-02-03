package defpackage;

import com.android.vcard.VCardConstants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnxu {
    public static final dnxu a;
    public static final dnxu b;
    public static final dnxu c;
    private static final /* synthetic */ dnxu[] d;

    static {
        dnxu dnxuVar = new dnxu("ALL", 0);
        a = dnxuVar;
        dnxu dnxuVar2 = new dnxu("YOURS", 1);
        b = dnxuVar2;
        dnxu dnxuVar3 = new dnxu(VCardConstants.PARAM_PHONE_EXTRA_TYPE_OTHER, 2);
        c = dnxuVar3;
        dnxu[] dnxuVarArr = {dnxuVar, dnxuVar2, dnxuVar3};
        d = dnxuVarArr;
        fczb.a(dnxuVarArr);
    }

    private dnxu(String str, int i) {
    }

    public static dnxu[] values() {
        return (dnxu[]) d.clone();
    }
}
