package j$.time.zone;

import j$.time.DayOfWeek;
import j$.time.LocalTime;
import j$.time.Month;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoField;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;

/* loaded from: classes9.dex */
public final class d implements Serializable {
    private static final long serialVersionUID = 6889046316657758795L;
    public final Month a;
    public final byte b;
    public final DayOfWeek c;
    public final LocalTime d;
    public final boolean e;
    public final c f;
    public final ZoneOffset g;
    public final ZoneOffset h;
    public final ZoneOffset i;

    public d(Month month, int i, DayOfWeek dayOfWeek, LocalTime localTime, boolean z, c cVar, ZoneOffset zoneOffset, ZoneOffset zoneOffset2, ZoneOffset zoneOffset3) {
        this.a = month;
        this.b = (byte) i;
        this.c = dayOfWeek;
        this.d = localTime;
        this.e = z;
        this.f = cVar;
        this.g = zoneOffset;
        this.h = zoneOffset2;
        this.i = zoneOffset3;
    }

    public static d a(ObjectInput objectInput) {
        c cVar;
        LocalTime localTimeOf;
        int i = objectInput.readInt();
        Month monthM = Month.M(i >>> 28);
        int i2 = ((264241152 & i) >>> 22) - 32;
        int i3 = (3670016 & i) >>> 19;
        DayOfWeek dayOfWeekOf = i3 == 0 ? null : DayOfWeek.of(i3);
        int i4 = (507904 & i) >>> 14;
        c cVar2 = c.values()[(i & 12288) >>> 12];
        int i5 = (i & 4080) >>> 4;
        int i6 = (i & 12) >>> 2;
        int i7 = i & 3;
        if (i4 == 31) {
            long j = objectInput.readInt();
            LocalTime localTime = LocalTime.e;
            ChronoField.SECOND_OF_DAY.I(j);
            int i8 = (int) (j / 3600);
            cVar = cVar2;
            long j2 = j - (i8 * 3600);
            localTimeOf = LocalTime.K(i8, (int) (j2 / 60), (int) (j2 - (r8 * 60)), 0);
        } else {
            cVar = cVar2;
            localTimeOf = LocalTime.of(i4 % 24, 0);
        }
        ZoneOffset zoneOffsetOfTotalSeconds = ZoneOffset.ofTotalSeconds(i5 == 255 ? objectInput.readInt() : (i5 - 128) * 900);
        ZoneOffset zoneOffsetOfTotalSeconds2 = ZoneOffset.ofTotalSeconds(i6 == 3 ? objectInput.readInt() : (i6 * 1800) + zoneOffsetOfTotalSeconds.getTotalSeconds());
        ZoneOffset zoneOffsetOfTotalSeconds3 = ZoneOffset.ofTotalSeconds(i7 == 3 ? objectInput.readInt() : (i7 * 1800) + zoneOffsetOfTotalSeconds.getTotalSeconds());
        boolean z = i4 == 24;
        Objects.a(monthM, "month");
        Objects.a(localTimeOf, "time");
        Objects.a(cVar, "timeDefnition");
        Objects.a(zoneOffsetOfTotalSeconds, "standardOffset");
        Objects.a(zoneOffsetOfTotalSeconds2, "offsetBefore");
        Objects.a(zoneOffsetOfTotalSeconds3, "offsetAfter");
        if (i2 < -28 || i2 > 31 || i2 == 0) {
            throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        }
        if (z && !localTimeOf.equals(LocalTime.MIDNIGHT)) {
            throw new IllegalArgumentException("Time must be midnight when end of day flag is true");
        }
        if (localTimeOf.d == 0) {
            return new d(monthM, i2, dayOfWeekOf, localTimeOf, z, cVar, zoneOffsetOfTotalSeconds, zoneOffsetOfTotalSeconds2, zoneOffsetOfTotalSeconds3);
        }
        throw new IllegalArgumentException("Time's nano-of-second must be zero");
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 3, this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.a == dVar.a && this.b == dVar.b && this.c == dVar.c && this.f == dVar.f && this.d.equals(dVar.d) && this.e == dVar.e && this.g.equals(dVar.g) && this.h.equals(dVar.h) && this.i.equals(dVar.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iW = ((this.d.W() + (this.e ? 1 : 0)) << 15) + (this.a.ordinal() << 11) + ((this.b + 32) << 5);
        DayOfWeek dayOfWeek = this.c;
        return ((this.g.b ^ (this.f.ordinal() + (iW + ((dayOfWeek == null ? 7 : dayOfWeek.ordinal()) << 2)))) ^ this.h.b) ^ this.i.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransitionRule[");
        ZoneOffset zoneOffset = this.i;
        int i = zoneOffset.b;
        ZoneOffset zoneOffset2 = this.h;
        sb.append(i - zoneOffset2.b > 0 ? "Gap " : "Overlap ");
        sb.append(zoneOffset2);
        sb.append(" to ");
        sb.append(zoneOffset);
        sb.append(", ");
        Month month = this.a;
        byte b = this.b;
        DayOfWeek dayOfWeek = this.c;
        if (dayOfWeek == null) {
            sb.append(month.name());
            sb.append(' ');
            sb.append((int) b);
        } else if (b == -1) {
            sb.append(dayOfWeek.name());
            sb.append(" on or before last day of ");
            sb.append(month.name());
        } else if (b < 0) {
            sb.append(dayOfWeek.name());
            sb.append(" on or before last day minus ");
            sb.append((-b) - 1);
            sb.append(" of ");
            sb.append(month.name());
        } else {
            sb.append(dayOfWeek.name());
            sb.append(" on or after ");
            sb.append(month.name());
            sb.append(' ');
            sb.append((int) b);
        }
        sb.append(" at ");
        sb.append(this.e ? "24:00" : this.d.toString());
        sb.append(" ");
        sb.append(this.f);
        sb.append(", standard offset ");
        sb.append(this.g);
        sb.append(']');
        return sb.toString();
    }

    public final void writeExternal(ObjectOutput objectOutput) {
        LocalTime localTime = this.d;
        boolean z = this.e;
        int iW = z ? 86400 : localTime.W();
        int totalSeconds = this.g.getTotalSeconds();
        ZoneOffset zoneOffset = this.h;
        int totalSeconds2 = zoneOffset.getTotalSeconds() - totalSeconds;
        ZoneOffset zoneOffset2 = this.i;
        int totalSeconds3 = zoneOffset2.getTotalSeconds() - totalSeconds;
        byte b = iW % 3600 == 0 ? z ? (byte) 24 : localTime.a : (byte) 31;
        int i = totalSeconds % 900 == 0 ? (totalSeconds / 900) + 128 : 255;
        int i2 = (totalSeconds2 == 0 || totalSeconds2 == 1800 || totalSeconds2 == 3600) ? totalSeconds2 / 1800 : 3;
        int i3 = (totalSeconds3 == 0 || totalSeconds3 == 1800 || totalSeconds3 == 3600) ? totalSeconds3 / 1800 : 3;
        DayOfWeek dayOfWeek = this.c;
        objectOutput.writeInt((this.a.getValue() << 28) + ((this.b + 32) << 22) + ((dayOfWeek == null ? 0 : dayOfWeek.getValue()) << 19) + (b << 14) + (this.f.ordinal() << 12) + (i << 4) + (i2 << 2) + i3);
        if (b == 31) {
            objectOutput.writeInt(iW);
        }
        if (i == 255) {
            objectOutput.writeInt(totalSeconds);
        }
        if (i2 == 3) {
            objectOutput.writeInt(zoneOffset.getTotalSeconds());
        }
        if (i3 == 3) {
            objectOutput.writeInt(zoneOffset2.getTotalSeconds());
        }
    }
}
