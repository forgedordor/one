package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class davo {
    public static final davo a;
    public static final davo b;
    public static final davo c;
    public static final davo d;
    private static final /* synthetic */ davo[] e;

    static {
        davo davoVar = new davo("EXPRESS_SIGN_IN_EXISTING_USER", 0);
        a = davoVar;
        davo davoVar2 = new davo("EXPRESS_SIGN_IN_NEW_USER", 1);
        b = davoVar2;
        davo davoVar3 = new davo("ACCOUNT_SWITCH", 2);
        c = davoVar3;
        davo davoVar4 = new davo("ALREADY_SIGNED_IN", 3);
        d = davoVar4;
        davo[] davoVarArr = {davoVar, davoVar2, davoVar3, davoVar4};
        e = davoVarArr;
        fczb.a(davoVarArr);
    }

    private davo(String str, int i) {
    }

    public static davo[] values() {
        return (davo[]) e.clone();
    }

    public final String a() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "express_sign_in_existing_user";
        }
        if (iOrdinal == 1) {
            return "express_sign_in_new_user";
        }
        if (iOrdinal == 2) {
            return "account_switch";
        }
        if (iOrdinal == 3) {
            return "already_signed_in";
        }
        throw null;
    }
}
