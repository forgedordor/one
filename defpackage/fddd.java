package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fddd implements Serializable {
    public static final fddd a = new fddd();
    private static final long serialVersionUID = 0;

    private fddd() {
    }

    private final Object readResolve() {
        return fddf.a;
    }
}
