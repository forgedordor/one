package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kpr {
    public final kps a;
    public final kps b;
    public final kps c;

    private kpr(kir kirVar, String str) {
        this.a = new kps(kirVar, str, "base");
        this.b = new kps(null, null, "min");
        this.c = new kps(null, null, "max");
    }

    public kpr(float f) {
        this(new kir(f), null);
    }

    public kpr(String str) {
        this(null, str);
    }
}
