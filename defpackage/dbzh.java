package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbzh {
    protected final int a;

    public dbzh() {
        dclh.c(true, "bad alias: %s", 1);
        this.a = 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dbzh)) {
            return false;
        }
        int i = ((dbzh) obj).a;
        return true;
    }
}
