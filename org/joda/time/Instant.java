package org.joda.time;

import defpackage.fgmq;
import defpackage.fgmw;
import defpackage.fgni;
import defpackage.fgnl;
import defpackage.fgoi;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class Instant extends fgnl implements Serializable, fgni {
    private static final long serialVersionUID = 3299096530934209741L;
    private final long a;

    public Instant(long j) {
        this.a = j;
    }

    @Override // defpackage.fgni
    public final fgmq a() {
        return fgoi.o;
    }

    @Override // defpackage.fgni
    public long getMillis() {
        return this.a;
    }

    public Instant() {
        this.a = fgmw.a();
    }
}
