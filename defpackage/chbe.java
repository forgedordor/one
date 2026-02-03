package defpackage;

import j$.time.Instant;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chbe {
    public final cgzx a;
    public final cgxy b;
    public final byte[] c;
    public final String d;
    public final Instant e;
    public final int f;
    public final Instant g;
    private final String h;
    private final cgzv i;

    public chbe(cgzx cgzxVar, cgxy cgxyVar, byte[] bArr, String str, String str2, Instant instant, cgzv cgzvVar, int i, Instant instant2) {
        this.a = cgzxVar;
        this.b = cgxyVar;
        this.c = bArr;
        this.d = str;
        this.h = str2;
        this.e = instant;
        this.i = cgzvVar;
        this.f = i;
        this.g = instant2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof chbe)) {
            return false;
        }
        chbe chbeVar = (chbe) obj;
        return fdbq.f(this.a, chbeVar.a) && this.b == chbeVar.b && fdbq.f(this.c, chbeVar.c) && fdbq.f(this.d, chbeVar.d) && fdbq.f(this.h, chbeVar.h) && fdbq.f(this.e, chbeVar.e) && this.i == chbeVar.i && this.f == chbeVar.f && fdbq.f(this.g, chbeVar.g);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        byte[] bArr = this.c;
        int iHashCode2 = ((iHashCode * 31) + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
        String str = this.d;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.h;
        return ((((((((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.e.hashCode()) * 31) + this.i.hashCode()) * 31) + this.f) * 31) + this.g.hashCode();
    }

    public final String toString() {
        return "PipelineWorkItemData(workId=" + this.a + ", pipelineType=" + this.b + ", payload=" + Arrays.toString(this.c) + ", sequencingKey=" + this.d + ", clientSuppliedId=" + this.h + ", insertionTimestamp=" + this.e + ", executionState=" + this.i + ", executionAttemptCount=" + this.f + ", executeAfterTimestamp=" + this.g + ")";
    }
}
