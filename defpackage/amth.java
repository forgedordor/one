package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amth extends amum {
    public final String a;
    private final ekgb b;

    public amth(String str, ekgb ekgbVar) {
        this.a = str;
        this.b = ekgbVar;
    }

    @Override // defpackage.amum, defpackage.amwf
    public final ekgb a() {
        return this.b;
    }

    @Override // defpackage.amwf
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof amum) {
            amum amumVar = (amum) obj;
            if (this.a.equals(amumVar.c()) && ekjz.h(this.b, amumVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "BugleTextContent{text=" + this.a + ", annotations=" + this.b.toString() + "}";
    }
}
