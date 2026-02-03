package defpackage;

import android.util.SparseArray;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eibs extends eiim {
    public final String a;
    public final UUID b;
    public final eiii c;
    public final SparseArray d;
    public final int e;

    public eibs(String str, UUID uuid, eiii eiiiVar, SparseArray sparseArray, int i) {
        this.a = str;
        this.b = uuid;
        this.c = eiiiVar;
        this.d = sparseArray;
        this.e = i;
    }

    @Override // defpackage.eiim
    public final int a() {
        return this.e;
    }

    @Override // defpackage.eiim
    public final SparseArray b() {
        return this.d;
    }

    @Override // defpackage.eiim
    public final eiii c() {
        return this.c;
    }

    @Override // defpackage.eiim
    public final String d() {
        return this.a;
    }

    @Override // defpackage.eiim
    public final UUID e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eiim) {
            eiim eiimVar = (eiim) obj;
            if (this.a.equals(eiimVar.d()) && this.b.equals(eiimVar.e()) && this.c.equals(eiimVar.c()) && this.d.equals(eiimVar.b()) && this.e == eiimVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e;
    }

    public final String toString() {
        SparseArray sparseArray = this.d;
        eiii eiiiVar = this.c;
        return "TraceSnapshot{name=" + this.a + ", rootTraceId=" + this.b.toString() + ", record=" + eiiiVar.toString() + ", spanExtrasSparseArray=" + sparseArray.toString() + ", numUnfinishedSpans=" + this.e + "}";
    }
}
