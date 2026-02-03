package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqdn {
    public static final eqdn a;
    public static final eqdn b;
    public static final eqdn c;
    public static final eqdn d;
    private static final /* synthetic */ eqdn[] e;

    static {
        eqdn eqdnVar = new eqdn("UNKNOWN_REMOVAL_POLICY", 0);
        a = eqdnVar;
        eqdn eqdnVar2 = new eqdn("NO_USER_REMOVAL_ALLOWED", 1);
        b = eqdnVar2;
        eqdn eqdnVar3 = new eqdn("REMOVAL_ALLOWED_FOR_ALL", 2);
        c = eqdnVar3;
        eqdn eqdnVar4 = new eqdn("REMOVAL_ALLOWED_FOR_ADMINS", 3);
        d = eqdnVar4;
        eqdn[] eqdnVarArr = {eqdnVar, eqdnVar2, eqdnVar3, eqdnVar4};
        e = eqdnVarArr;
        fczb.a(eqdnVarArr);
    }

    private eqdn(String str, int i) {
    }

    public static eqdn[] values() {
        return (eqdn[]) e.clone();
    }
}
