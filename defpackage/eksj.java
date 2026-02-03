package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eksj extends ekrq {
    private final StackTraceElement b;

    public eksj(StackTraceElement stackTraceElement) {
        this.b = stackTraceElement;
    }

    @Override // defpackage.ekrq
    public final int a() {
        return Math.max(this.b.getLineNumber(), 0);
    }

    @Override // defpackage.ekrq
    public final String b() {
        return this.b.getClassName();
    }

    @Override // defpackage.ekrq
    public final String c() {
        return this.b.getFileName();
    }

    @Override // defpackage.ekrq
    public final String d() {
        return this.b.getMethodName();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof eksj) && this.b.equals(((eksj) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
