package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fdbf implements Serializable {
    public static final fdbf a = new fdbf();

    private fdbf() {
    }

    private Object readResolve() {
        return a;
    }
}
