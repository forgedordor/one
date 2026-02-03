package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jtn<T> {
    public final String a;
    public final fdat b;
    public boolean c;

    public jtn(String str, fdat fdatVar) {
        this.a = str;
        this.b = fdatVar;
    }

    public final void a(jto jtoVar, Object obj) {
        jtoVar.e(this, obj);
    }

    public final String toString() {
        return "AccessibilityKey: ".concat(this.a);
    }

    public /* synthetic */ jtn(String str) {
        this(str, jtm.a);
    }

    public jtn(String str, byte[] bArr) {
        this(str);
        this.c = true;
    }

    public jtn(String str, boolean z, fdat fdatVar) {
        this(str, fdatVar);
        this.c = z;
    }
}
