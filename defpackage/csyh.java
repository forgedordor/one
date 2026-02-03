package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csyh {
    public static final csyh a;
    public static final csyh b;
    public static final csyh c;
    private static final /* synthetic */ csyh[] e;
    public final String d;

    static {
        csyh csyhVar = new csyh("CallButton", 0, "messages_callButton");
        a = csyhVar;
        csyh csyhVar2 = new csyh("InvitePrompt", 1, "messages_invitePrompt");
        b = csyhVar2;
        csyh csyhVar3 = new csyh("TombstoneInserter", 2, "messages.tombstoneInserter");
        c = csyhVar3;
        csyh[] csyhVarArr = {csyhVar, csyhVar2, csyhVar3};
        e = csyhVarArr;
        fczb.a(csyhVarArr);
    }

    private csyh(String str, int i, String str2) {
        this.d = str2;
    }

    public static csyh[] values() {
        return (csyh[]) e.clone();
    }
}
