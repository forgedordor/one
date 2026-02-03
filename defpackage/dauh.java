package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dauh {
    public static final dauh a;
    public static final dauh b;
    public static final dauh c;
    private static final /* synthetic */ dauh[] d;

    static {
        dauh dauhVar = new dauh("NO_ACTIVITY", 0);
        a = dauhVar;
        dauh dauhVar2 = new dauh("WELCOME_FLOW_SIGNIN_USER", 1);
        b = dauhVar2;
        dauh dauhVar3 = new dauh("WELCOME_FLOW_SIGNOUT_USER", 2);
        c = dauhVar3;
        dauh[] dauhVarArr = {dauhVar, dauhVar2, dauhVar3};
        d = dauhVarArr;
        fczb.a(dauhVarArr);
    }

    private dauh(String str, int i) {
    }

    public static dauh[] values() {
        return (dauh[]) d.clone();
    }
}
