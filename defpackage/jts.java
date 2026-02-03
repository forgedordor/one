package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jts extends fdbr implements fdat {
    public static final jts a = new jts();

    public jts() {
        super(2);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        jsc jscVar = ((jsl) obj).c;
        jtn jtnVar = jte.s;
        return Integer.valueOf(Float.compare(((Number) jscVar.c(jtnVar, jtq.a)).floatValue(), ((Number) ((jsl) obj2).c.c(jtnVar, jtr.a)).floatValue()));
    }
}
