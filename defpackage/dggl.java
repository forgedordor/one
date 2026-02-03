package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dggl {
    private final crmx a;

    public dggl(crmx crmxVar) {
        crmxVar.getClass();
        this.a = crmxVar;
    }

    public final dggk a(String str) {
        str.getClass();
        if (str.length() <= 0) {
            throw new IllegalArgumentException("Input is an empty String.");
        }
        if (this.a.I(str)) {
            return new dggk(str);
        }
        throw new IllegalArgumentException("Input is not in E164 number format.");
    }
}
