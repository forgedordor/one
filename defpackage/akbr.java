package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akbr {
    public static final akbr a;
    public static final akbr b;
    public static final akbr c;
    public static final akbr d;
    private static final /* synthetic */ akbr[] e;

    static {
        akbr akbrVar = new akbr("UNKNOWN", 0);
        a = akbrVar;
        akbr akbrVar2 = new akbr("POST_INCOMING_MESSAGE_NOTIFICATION", 1);
        b = akbrVar2;
        akbr akbrVar3 = new akbr("POST_UNAPPROVED_NOTIFICATION", 2);
        c = akbrVar3;
        akbr akbrVar4 = new akbr("HIDE_INCOMING_MESSAGE_NOTIFICATION", 3);
        d = akbrVar4;
        akbr[] akbrVarArr = {akbrVar, akbrVar2, akbrVar3, akbrVar4};
        e = akbrVarArr;
        fczb.a(akbrVarArr);
    }

    private akbr(String str, int i) {
    }

    public static akbr[] values() {
        return (akbr[]) e.clone();
    }
}
