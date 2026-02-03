package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zqx {
    public static final zqx a;
    public static final zqx b;
    public static final zqx c;
    public static final zqx d;
    public static final zqx e;
    private static final /* synthetic */ zqx[] f;

    static {
        zqx zqxVar = new zqx("NONE", 0);
        a = zqxVar;
        zqx zqxVar2 = new zqx("SINGLE_SELECT", 1);
        b = zqxVar2;
        zqx zqxVar3 = new zqx("MULTI_SELECT", 2);
        c = zqxVar3;
        zqx zqxVar4 = new zqx("SENSITIVE_CONTENT_SINGLE_SELECT", 3);
        d = zqxVar4;
        zqx zqxVar5 = new zqx("SENSITIVE_CONTENT_MULTI_SELECT", 4);
        e = zqxVar5;
        zqx[] zqxVarArr = {zqxVar, zqxVar2, zqxVar3, zqxVar4, zqxVar5};
        f = zqxVarArr;
        fczb.a(zqxVarArr);
    }

    private zqx(String str, int i) {
    }

    public static zqx[] values() {
        return (zqx[]) f.clone();
    }
}
