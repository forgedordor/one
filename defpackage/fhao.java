package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fhao extends IOException {
    public fhao() {
    }

    public fhao(String str) {
        super(str);
    }

    public fhao(Throwable th) {
        super("invalid address");
        initCause(th);
    }
}
