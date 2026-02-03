package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum etng implements evst {
    UITHEME_DEFAULT(0),
    UITHEME_GOOGLE_MATERIAL(1);

    public final int c;

    etng(int i) {
        this.c = i;
    }

    @Override // defpackage.evst
    public final int a() {
        return this.c;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.c);
    }
}
