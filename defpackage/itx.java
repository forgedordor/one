package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class itx extends CancellationException {
    public itx(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(ity.a);
        return this;
    }

    public /* synthetic */ itx() {
        super(null);
    }
}
