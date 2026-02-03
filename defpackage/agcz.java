package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agcz implements afzv {
    public final String a;
    public final cdfg b;

    /* JADX WARN: Multi-variable type inference failed */
    public agcz() {
        this(null, 0 == true ? 1 : 0, 3);
    }

    public /* synthetic */ agcz(String str, cdfg cdfgVar, int i) {
        str = 1 == (i & 1) ? "Messenger_conversation" : str;
        str.getClass();
        this.a = str;
        this.b = (i & 2) != 0 ? null : cdfgVar;
    }
}
