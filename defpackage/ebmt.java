package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebmt extends ebnj {
    private final String a;
    private final String b;
    private final int c;
    private final ebmr d;

    public ebmt(String str, String str2, int i, ebmr ebmrVar) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = ebmrVar;
    }

    @Override // defpackage.ebnj
    public final int a() {
        return this.c;
    }

    @Override // defpackage.ebnj
    public final ebmr b() {
        return this.d;
    }

    @Override // defpackage.ebnj
    public final String c() {
        return this.b;
    }

    @Override // defpackage.ebnj
    public final String d() {
        return this.a;
    }
}
