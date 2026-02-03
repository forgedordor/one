package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cpgm {
    public static final cpgm a;
    public static final cpgm b;
    public static final cpgm c;
    private static final /* synthetic */ cpgm[] e;
    public final String d;

    static {
        cpgm cpgmVar = new cpgm("FAKE", 0, "fake-security-domain");
        a = cpgmVar;
        cpgm cpgmVar2 = new cpgm("PAIRING", 1, "dialer-messages-pairing");
        b = cpgmVar2;
        cpgm cpgmVar3 = new cpgm("BACKUP_AND_RESTORE", 2, "messages-backup");
        c = cpgmVar3;
        cpgm[] cpgmVarArr = {cpgmVar, cpgmVar2, cpgmVar3};
        e = cpgmVarArr;
        fczb.a(cpgmVarArr);
    }

    private cpgm(String str, int i, String str2) {
        this.d = str2;
    }

    public static cpgm[] values() {
        return (cpgm[]) e.clone();
    }
}
