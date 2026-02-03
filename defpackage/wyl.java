package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wyl implements amwi {
    private final String a;
    private final String b;
    private final boolean c;
    private final ekgb d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wyl() {
        this(null, null, false, ekoe.a);
        int i = ekgb.d;
    }

    @Override // defpackage.amwf
    public final ekgb a() {
        return this.d;
    }

    @Override // defpackage.amwf, defpackage.amvr
    public final /* synthetic */ String b() {
        return "text/plain";
    }

    @Override // defpackage.amwf
    public final String c() {
        return this.a;
    }

    @Override // defpackage.amwi
    public final String d() {
        return this.b;
    }

    @Override // defpackage.amwi
    public final boolean e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wyl)) {
            return false;
        }
        wyl wylVar = (wyl) obj;
        return fdbq.f(this.a, wylVar.a) && fdbq.f(this.b, wylVar.b) && this.c == wylVar.c && fdbq.f(this.d, wylVar.d);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.b;
        return (((((iHashCode * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + (true != this.c ? 1237 : 1231)) * 31) + this.d.hashCode();
    }

    public final String toString() {
        String str = this.a;
        CharSequence charSequenceC = str != null ? cqcy.c(str) : null;
        String str2 = this.b;
        CharSequence charSequenceC2 = str2 != null ? cqcy.c(str2) : null;
        return "TextWithSubject(text=" + ((Object) charSequenceC) + ", subject=" + ((Object) charSequenceC2) + ", isUrgent=" + this.c + ")";
    }

    public wyl(String str, String str2, boolean z, ekgb ekgbVar) {
        ekgbVar.getClass();
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = ekgbVar;
        if (str != null && str.length() <= 0) {
            throw new IllegalStateException("Check failed.");
        }
        if (str2 != null && str2.length() <= 0) {
            throw new IllegalStateException("Check failed.");
        }
        if (str == null && str2 == null && !z) {
            throw new IllegalStateException("Check failed.");
        }
    }
}
