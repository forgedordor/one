package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtov {
    public dtow a;
    public String b;
    public Throwable c;
    public int d;

    public final dtox a() {
        dtow dtowVar = this.a;
        dtowVar.getClass();
        if (this.b == null) {
            this.b = "Download result code: ".concat(String.valueOf(dtowVar.name()));
        }
        return new dtox(this);
    }
}
