package j$.time.format;

import j$.time.temporal.WeekFields;
import java.util.Locale;

/* loaded from: classes9.dex */
public final class s extends j {
    public final char g;
    public final int h;

    public s(char c, int i, int i2, int i3, int i4) {
        super(null, i2, i3, D.NOT_NEGATIVE, i4);
        this.g = c;
        this.h = i;
    }

    @Override // j$.time.format.j
    public final j d() {
        if (this.e == -1) {
            return this;
        }
        return new s(this.g, this.h, this.b, this.c, -1);
    }

    @Override // j$.time.format.j
    public final j e(int i) {
        return new s(this.g, this.h, this.b, this.c, this.e + i);
    }

    @Override // j$.time.format.j, j$.time.format.InterfaceC0031e
    public final boolean f(x xVar, StringBuilder sb) {
        return g(xVar.b.b).f(xVar, sb);
    }

    public final j g(Locale locale) {
        j$.time.temporal.n nVar;
        WeekFields weekFieldsOf = WeekFields.of(locale);
        char c = this.g;
        if (c == 'W') {
            nVar = weekFieldsOf.d;
        } else {
            if (c == 'Y') {
                j$.time.temporal.n nVar2 = weekFieldsOf.f;
                int i = this.h;
                if (i == 2) {
                    return new p(nVar2, 2, 2, p.h, this.e);
                }
                return new j(nVar2, i, 19, i < 4 ? D.NORMAL : D.EXCEEDS_PAD, this.e);
            }
            if (c == 'c' || c == 'e') {
                nVar = weekFieldsOf.c;
            } else {
                if (c != 'w') {
                    throw new IllegalStateException("unreachable");
                }
                nVar = weekFieldsOf.e;
            }
        }
        return new j(nVar, this.b, this.c, D.NOT_NEGATIVE, this.e);
    }

    @Override // j$.time.format.j, j$.time.format.InterfaceC0031e
    public final int j(v vVar, CharSequence charSequence, int i) {
        return g(vVar.a.b).j(vVar, charSequence, i);
    }

    @Override // j$.time.format.j
    public final String toString() {
        StringBuilder sb = new StringBuilder(30);
        sb.append("Localized(");
        int i = this.h;
        char c = this.g;
        if (c != 'Y') {
            if (c == 'W') {
                sb.append("WeekOfMonth");
            } else if (c == 'c' || c == 'e') {
                sb.append("DayOfWeek");
            } else if (c == 'w') {
                sb.append("WeekOfWeekBasedYear");
            }
            sb.append(",");
            sb.append(i);
        } else if (i == 1) {
            sb.append("WeekBasedYear");
        } else if (i == 2) {
            sb.append("ReducedValue(WeekBasedYear,2,2,2000-01-01)");
        } else {
            sb.append("WeekBasedYear,");
            sb.append(i);
            sb.append(",19,");
            sb.append(i < 4 ? D.NORMAL : D.EXCEEDS_PAD);
        }
        sb.append(")");
        return sb.toString();
    }
}
