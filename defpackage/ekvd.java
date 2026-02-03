package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekvd extends ektx {
    public static final ektx a = new ekvd();

    private ekvd() {
    }

    @Override // defpackage.ektx
    public final ekrq a(Class<?> cls, int i) {
        StackTraceElement stackTraceElementA = ekwq.a(cls, i + 1);
        return stackTraceElementA != null ? new eksj(stackTraceElementA) : ekrq.a;
    }

    @Override // defpackage.ektx
    public final String b(Class<? extends ekqs<?>> cls) {
        StackTraceElement stackTraceElementA = ekwq.a(cls, 1);
        if (stackTraceElementA != null) {
            return stackTraceElementA.getClassName();
        }
        throw new IllegalStateException("no caller found on the stack for: ".concat(String.valueOf(cls.getName())));
    }

    public final String toString() {
        return "Default stack-based caller finder";
    }
}
