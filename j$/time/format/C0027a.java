package j$.time.format;

import j$.time.chrono.Chronology;
import j$.time.temporal.TemporalField;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: j$.time.format.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0027a extends A {
    public final /* synthetic */ z d;

    public C0027a(z zVar) {
        this.d = zVar;
    }

    @Override // j$.time.format.A
    public final String b(Chronology chronology, TemporalField temporalField, long j, TextStyle textStyle, Locale locale) {
        return this.d.a(j, textStyle);
    }

    @Override // j$.time.format.A
    public final String c(TemporalField temporalField, long j, TextStyle textStyle, Locale locale) {
        return this.d.a(j, textStyle);
    }

    @Override // j$.time.format.A
    public final Iterator d(Chronology chronology, TemporalField temporalField, TextStyle textStyle, Locale locale) {
        List list = (List) this.d.b.get(textStyle);
        if (list != null) {
            return list.iterator();
        }
        return null;
    }

    @Override // j$.time.format.A
    public final Iterator e(TemporalField temporalField, TextStyle textStyle, Locale locale) {
        List list = (List) this.d.b.get(textStyle);
        if (list != null) {
            return list.iterator();
        }
        return null;
    }
}
