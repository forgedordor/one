package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ibn extends RuntimeException {
    private final List a;

    public ibn(List list) {
        this.a = list;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb = new StringBuilder("Composition stack when thrown:\n");
        fcww fcwwVar = new fcww((byte[]) null);
        List listD = fcva.D(this.a);
        if (((fcub) listD).a() > 0) {
            throw null;
        }
        List listD2 = fcva.D(fcva.a(fcwwVar));
        int iA = ((fcub) listD2).a();
        for (int i = 0; i < iA; i++) {
            sb.append("\tat ".concat(String.valueOf((String) listD2.get(i))));
            sb.append('\n');
        }
        return sb.toString();
    }
}
