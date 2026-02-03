package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecfw {
    public final String a;
    public final String b;

    public ecfw(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String toString() {
        String str = this.b;
        if (str == null) {
            return ecfx.a(this.a);
        }
        return ecfx.a(this.a) + "=" + ecfx.a(str);
    }
}
