package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jti extends fdbr implements fdat {
    public static final jti a = new jti();

    public jti() {
        super(2);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        String str;
        jrn jrnVar = (jrn) obj;
        jrn jrnVar2 = (jrn) obj2;
        if (jrnVar == null || (str = jrnVar.a) == null) {
            str = jrnVar2.a;
        }
        return new jrn(str, jrnVar != null ? jrnVar.b : jrnVar2.b);
    }
}
