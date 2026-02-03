package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eybp {
    public static final Duration a = Duration.ofHours(18);
    public static final eybm b;

    static {
        eybl eyblVar = (eybl) eybm.a.createBuilder();
        eyblVar.copyOnWrite();
        ((eybm) eyblVar.instance).b = 24;
        b = (eybm) eyblVar.build();
    }
}
