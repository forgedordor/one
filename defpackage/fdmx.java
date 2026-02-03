package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdmx extends CancellationException implements fdjj {
    public final transient fdlr a;

    public fdmx(String str) {
        this(str, null);
    }

    @Override // defpackage.fdjj
    public final /* bridge */ /* synthetic */ Throwable a() {
        String message = getMessage();
        if (message == null) {
            message = "";
        }
        fdmx fdmxVar = new fdmx(message, this.a);
        fdmxVar.initCause(this);
        return fdmxVar;
    }

    public fdmx(String str, fdlr fdlrVar) {
        super(str);
        this.a = fdlrVar;
    }
}
