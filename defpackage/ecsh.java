package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.GeneralPurposeRichCardLayoutInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecsh {
    public static final ecsh a;
    public static final ecsh b;
    public static final ecsh c;
    public static final ecsh d;
    private static final /* synthetic */ ecsh[] e;

    static {
        ecsh ecshVar = new ecsh(GeneralPurposeRichCardLayoutInfo.IMAGE_ALIGNMENT_LEFT, 0);
        a = ecshVar;
        ecsh ecshVar2 = new ecsh(GeneralPurposeRichCardLayoutInfo.IMAGE_ALIGNMENT_RIGHT, 1);
        b = ecshVar2;
        ecsh ecshVar3 = new ecsh("TOP", 2);
        c = ecshVar3;
        ecsh ecshVar4 = new ecsh("BOTTOM", 3);
        d = ecshVar4;
        ecsh[] ecshVarArr = {ecshVar, ecshVar2, ecshVar3, ecshVar4};
        e = ecshVarArr;
        fczb.a(ecshVarArr);
    }

    private ecsh(String str, int i) {
    }

    public static ecsh[] values() {
        return (ecsh[]) e.clone();
    }
}
