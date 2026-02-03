package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
class erao {
    protected final String d;
    protected final int e;

    public erao(String str, int i) {
        this.d = str;
        this.e = i;
    }

    public final String toString() {
        return String.format("%s(0x%04x)", this.d, Integer.valueOf(this.e));
    }
}
