package defpackage;

import j$.time.Instant;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chbd {
    public final cgzx a;
    public final cgxy b;
    public final byte[] c;
    public final String d;
    public final Instant e;
    public final Instant f;
    public final int g;
    public final int h;

    public chbd(cgzx cgzxVar, cgxy cgxyVar, byte[] bArr, String str, Instant instant, Instant instant2, int i, int i2) {
        cgzxVar.getClass();
        cgxyVar.getClass();
        str.getClass();
        this.a = cgzxVar;
        this.b = cgxyVar;
        this.c = bArr;
        this.d = str;
        this.e = instant;
        this.f = instant2;
        this.g = i;
        this.h = i2;
    }

    public static /* synthetic */ chbd a(chbd chbdVar, Instant instant, int i, int i2, int i3) {
        cgzx cgzxVar = (i3 & 1) != 0 ? chbdVar.a : null;
        cgxy cgxyVar = (i3 & 2) != 0 ? chbdVar.b : null;
        byte[] bArr = (i3 & 4) != 0 ? chbdVar.c : null;
        String str = (i3 & 8) != 0 ? chbdVar.d : null;
        Instant instant2 = (i3 & 16) != 0 ? chbdVar.e : null;
        if ((i3 & 32) != 0) {
            instant = chbdVar.f;
        }
        Instant instant3 = instant;
        if ((i3 & 64) != 0) {
            i = chbdVar.g;
        }
        int i4 = i;
        if ((i3 & 128) != 0) {
            i2 = chbdVar.h;
        }
        int i5 = i2;
        cgzxVar.getClass();
        cgxyVar.getClass();
        str.getClass();
        instant2.getClass();
        instant3.getClass();
        if (i5 != 0) {
            return new chbd(cgzxVar, cgxyVar, bArr, str, instant2, instant3, i4, i5);
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof chbd)) {
            return false;
        }
        chbd chbdVar = (chbd) obj;
        return fdbq.f(this.a, chbdVar.a) && this.b == chbdVar.b && fdbq.f(this.c, chbdVar.c) && fdbq.f(this.d, chbdVar.d) && fdbq.f(this.e, chbdVar.e) && fdbq.f(this.f, chbdVar.f) && this.g == chbdVar.g && this.h == chbdVar.h;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        byte[] bArr = this.c;
        return (((((((((((iHashCode * 31) + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g) * 31) + this.h;
    }

    public final String toString() {
        String string = Arrays.toString(this.c);
        StringBuilder sb = new StringBuilder("PipelineWorkItem(workId=");
        sb.append(this.a);
        sb.append(", pipelineType=");
        sb.append(this.b);
        sb.append(", payload=");
        sb.append(string);
        sb.append(", sequencingKey=");
        sb.append(this.d);
        sb.append(", insertionTimestamp=");
        sb.append(this.e);
        sb.append(", executeAfterTimestamp=");
        sb.append(this.f);
        sb.append(", executionAttemptCount=");
        sb.append(this.g);
        sb.append(", executionStatus=");
        sb.append((Object) (this.h != 1 ? "EXECUTING" : "WAITING"));
        sb.append(")");
        return sb.toString();
    }
}
