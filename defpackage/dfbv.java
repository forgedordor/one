package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfbv extends dbhd {
    private final dbhd d;
    private final Object e;

    public dfbv(dbhd dbhdVar, String str, Object obj) {
        super(str, obj);
        this.d = dbhdVar;
        this.e = obj;
    }

    public static dbhd c(String str, Integer num) {
        return new dfbv(new dbha(str, num), str, num);
    }

    public static dbhd d(String str, String str2) {
        return new dfbv(new dbhb(str, str2), str, str2);
    }

    public static dbhd e(String str, boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        return new dfbv(new dbgz(str, boolValueOf), str, boolValueOf);
    }

    @Override // defpackage.dbhd
    public final Object a() {
        try {
            return this.d.a();
        } catch (Throwable unused) {
            return this.e;
        }
    }
}
