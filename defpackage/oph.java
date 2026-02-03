package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oph {
    public final fdpl a;
    private final fduf b;

    public oph() {
        this(null);
    }

    public final void a(Object obj) {
        fduf fdufVar = this.b;
        fdufVar.f(new fcti(Integer.valueOf(((Number) ((fcti) fdufVar.c()).a).intValue() + 1), obj));
    }

    public /* synthetic */ oph(byte[] bArr) {
        fduf fdufVarA = fdvf.a(new fcti(Integer.MIN_VALUE, null));
        this.b = fdufVarA;
        this.a = new opg(fdufVarA);
    }
}
