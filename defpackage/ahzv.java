package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahzv {
    private final eksp a;
    private final String b;
    private final boolean c;

    public ahzv(eksp ekspVar, String str, boolean z) {
        this.a = ekspVar;
        this.b = str;
        this.c = z;
    }

    public final ahzu a(ekrg ekrgVar, String str, String str2) {
        ekrgVar.getClass();
        if (str == null) {
            str = this.b;
        }
        String str3 = str;
        if (str2 == null) {
            str2 = this.b;
        }
        return new ahzu(ekrgVar, this.a, str3, str2, this.c);
    }
}
