package j$.time.format;

import j$.time.chrono.Chronology;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes9.dex */
public final class r implements InterfaceC0031e {
    public final TemporalField a;
    public final TextStyle b;
    public final A c;
    public volatile j d;

    public r(TemporalField temporalField, TextStyle textStyle, A a) {
        this.a = temporalField;
        this.b = textStyle;
        this.c = a;
    }

    @Override // j$.time.format.InterfaceC0031e
    public final boolean f(x xVar, StringBuilder sb) {
        Long lA = xVar.a(this.a);
        DateTimeFormatter dateTimeFormatter = xVar.b;
        if (lA == null) {
            return false;
        }
        Chronology chronology = (Chronology) xVar.a.I(j$.time.temporal.k.b);
        String strC = (chronology == null || chronology == j$.time.chrono.q.d) ? this.c.c(this.a, lA.longValue(), this.b, dateTimeFormatter.b) : this.c.b(chronology, this.a, lA.longValue(), this.b, dateTimeFormatter.b);
        if (strC != null) {
            sb.append(strC);
            return true;
        }
        if (this.d == null) {
            this.d = new j(this.a, 1, 19, D.NORMAL);
        }
        return this.d.f(xVar, sb);
    }

    @Override // j$.time.format.InterfaceC0031e
    public final int j(v vVar, CharSequence charSequence, int i) {
        A a = this.c;
        TemporalField temporalField = this.a;
        int length = charSequence.length();
        if (i < 0 || i > length) {
            throw new IndexOutOfBoundsException();
        }
        boolean z = vVar.c;
        DateTimeFormatter dateTimeFormatter = vVar.a;
        TextStyle textStyle = z ? this.b : null;
        Chronology chronologyD = vVar.d();
        Iterator itE = (chronologyD == null || chronologyD == j$.time.chrono.q.d) ? a.e(temporalField, textStyle, dateTimeFormatter.b) : a.d(chronologyD, temporalField, textStyle, dateTimeFormatter.b);
        if (itE != null) {
            while (itE.hasNext()) {
                Map.Entry entry = (Map.Entry) itE.next();
                String str = (String) entry.getKey();
                if (vVar.h(str, 0, charSequence, i, str.length())) {
                    return vVar.g(this.a, ((Long) entry.getValue()).longValue(), i, str.length() + i);
                }
            }
            if (temporalField == ChronoField.ERA && !vVar.c) {
                Iterator it = chronologyD.eras().iterator();
                while (it.hasNext()) {
                    String string = ((j$.time.chrono.k) it.next()).toString();
                    if (vVar.h(string, 0, charSequence, i, string.length())) {
                        return vVar.g(this.a, r7.getValue(), i, string.length() + i);
                    }
                }
            }
            if (vVar.c) {
                return ~i;
            }
        }
        if (this.d == null) {
            this.d = new j(this.a, 1, 19, D.NORMAL);
        }
        return this.d.j(vVar, charSequence, i);
    }

    public final String toString() {
        TextStyle textStyle = TextStyle.FULL;
        TemporalField temporalField = this.a;
        TextStyle textStyle2 = this.b;
        if (textStyle2 == textStyle) {
            return "Text(" + String.valueOf(temporalField) + ")";
        }
        return "Text(" + String.valueOf(temporalField) + "," + String.valueOf(textStyle2) + ")";
    }
}
