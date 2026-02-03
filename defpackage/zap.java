package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zap {
    public final fdap a;
    public final String b;

    public zap() {
        this(new fdap() { // from class: zao
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ((dkkn) obj).getClass();
                return fctx.a;
            }
        }, "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zap)) {
            return false;
        }
        zap zapVar = (zap) obj;
        return fdbq.f(this.a, zapVar.a) && fdbq.f(this.b, zapVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "DoubleTapUiData(onDoubleTap=" + this.a + ", label=" + this.b + ")";
    }

    public zap(fdap fdapVar, String str) {
        fdapVar.getClass();
        str.getClass();
        this.a = fdapVar;
        this.b = str;
    }
}
