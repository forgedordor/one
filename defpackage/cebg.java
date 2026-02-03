package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public abstract class cebg {
    public static cebg c(String str, etsf etsfVar) {
        ejwl.f(!str.isEmpty(), "Invalid simId: %s", str);
        return new cebc(str, etsfVar);
    }

    public abstract etsf a();

    public abstract String b();

    public final String d() {
        return b() + "." + a().name();
    }
}
