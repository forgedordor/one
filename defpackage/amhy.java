package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amhy implements bajs {
    private final String a;
    private final String b;
    private final boolean c;

    public amhy(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    @Override // defpackage.bajs
    public final String a() {
        return this.b;
    }

    @Override // defpackage.bajs
    public final String b() {
        return this.a;
    }

    @Override // defpackage.bajs
    public final boolean c() {
        return this.c;
    }

    public final String toString() {
        return "id: " + this.a + ", displayName: " + this.b + ", isPenpalBot: " + this.c;
    }
}
