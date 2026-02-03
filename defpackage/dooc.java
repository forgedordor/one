package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class dooc extends Exception {
    public final String a;

    public dooc(String str) {
        super(str);
        this.a = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.a;
    }
}
