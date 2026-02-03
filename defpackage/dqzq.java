package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqzq implements Serializable, dqzr {
    private static final long serialVersionUID = -2512461138929551103L;
    private final ewut a;

    public dqzq(ewut ewutVar) {
        if (ewutVar == null) {
            throw new NullPointerException("Null value");
        }
        this.a = ewutVar;
    }

    @Override // defpackage.dqzr
    public final ewut a() {
        return this.a;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return dqzr.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dqzr) {
            return this.a.equals(((dqzr) obj).a());
        }
        return false;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return this.a.hashCode() ^ 1335633679;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.android.libraries.geller.annotations.GellerCorpusKey(" + this.a + ')';
    }
}
