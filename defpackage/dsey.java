package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsey extends dsfa {
    public final dsbm a;
    public final long b;

    public dsey(dsbm dsbmVar, long j) {
        if (dsbmVar == null) {
            throw new NullPointerException("Null event");
        }
        this.a = dsbmVar;
        this.b = j;
    }

    @Override // defpackage.dsfa
    public final long a() {
        return this.b;
    }

    @Override // defpackage.dsfa
    public final dsbm b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dsfa) {
            dsfa dsfaVar = (dsfa) obj;
            if (this.a.equals(dsfaVar.b())) {
                dsfaVar.c();
                if (this.b == dsfaVar.a()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        long j = this.b;
        return (iHashCode * (-721379959)) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "ProcessingContext{event=" + this.a.toString() + ", accountName=null, eventTimeMs=" + this.b + "}";
    }

    @Override // defpackage.dsfa
    public final void c() {
    }
}
