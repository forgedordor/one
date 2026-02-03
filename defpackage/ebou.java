package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebou extends ebmd implements Cloneable {
    protected String a;

    public ebou() {
    }

    @Override // defpackage.ebmd
    public final String c() {
        return this.a;
    }

    @Override // defpackage.ebmd
    public final Object clone() {
        ebou ebouVar = new ebou();
        ebouVar.a = this.a;
        return ebouVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null) {
            return obj.getClass().equals(getClass()) && this.a.compareTo(((ebou) obj).a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public ebou(String str) {
        this.a = str;
    }
}
