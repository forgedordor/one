package defpackage;

import com.android.vcard.VCardConstants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awmu {
    public static final awmu a;
    public static final awmu b;
    public static final awmu c;
    public static final awmu d;
    public static final awmu e;
    private static final /* synthetic */ awmu[] f;

    static {
        awmu awmuVar = new awmu("NOT_SYNCED", 0);
        a = awmuVar;
        awmu awmuVar2 = new awmu("CREATING", 1);
        b = awmuVar2;
        awmu awmuVar3 = new awmu(VCardConstants.PROPERTY_MEMBER, 2);
        c = awmuVar3;
        awmu awmuVar4 = new awmu("NOT_MEMBER", 3);
        d = awmuVar4;
        awmu awmuVar5 = new awmu("DOES_NOT_EXIST", 4);
        e = awmuVar5;
        awmu[] awmuVarArr = {awmuVar, awmuVar2, awmuVar3, awmuVar4, awmuVar5};
        f = awmuVarArr;
        fczb.a(awmuVarArr);
    }

    private awmu(String str, int i) {
    }

    public static awmu[] values() {
        return (awmu[]) f.clone();
    }
}
