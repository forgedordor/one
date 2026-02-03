package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class prq extends prp {
    private final Object a;
    private final String b;
    private final int c;

    public prq(Object obj, String str, int i) {
        this.a = obj;
        this.b = str;
        this.c = i;
    }

    @Override // defpackage.prp
    public final prp a(String str, fdap fdapVar) {
        Object obj = this.a;
        return ((Boolean) fdapVar.invoke(obj)).booleanValue() ? this : new pro(obj, this.b, str, this.c);
    }

    @Override // defpackage.prp
    public final Object b() {
        return this.a;
    }
}
