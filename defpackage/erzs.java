package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class erzs extends Exception {
    @Deprecated
    protected erzs() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public erzs(String str) {
        super(str);
        dclh.l(str, "Detail message must not be empty");
    }
}
