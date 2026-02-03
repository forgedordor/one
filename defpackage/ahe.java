package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ahe extends ahv {
    public final String a;

    public ahe(String str, String str2, String str3) {
        super(str, str2);
        lcg.i(str3);
        boolean z = true;
        if (!akg.a("yyyy-MM-dd'T'HH:mm", str3) && !akg.a("yyyy-MM-dd'T'HH:mm:ss", str3)) {
            z = false;
        }
        lcg.b(z, "scheduledTime must be in the format: yyyy-MM-ddTHH:mm:ss");
        this.a = str3;
    }
}
