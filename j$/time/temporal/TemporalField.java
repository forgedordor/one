package j$.time.temporal;

import j$.time.format.B;
import j$.time.format.C;
import java.util.Map;

/* loaded from: classes9.dex */
public interface TemporalField {
    Temporal A(Temporal temporal, long j);

    boolean f(TemporalAccessor temporalAccessor);

    boolean isDateBased();

    m j(TemporalAccessor temporalAccessor);

    TemporalAccessor o(Map map, B b, C c);

    m range();

    long x(TemporalAccessor temporalAccessor);
}
