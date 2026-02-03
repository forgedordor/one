package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ice extends fdbr implements fdat {
    public static final ice a = new ice();

    public ice() {
        super(2);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        String str = (String) obj;
        icq icqVar = (icq) obj2;
        if (str.length() == 0) {
            return icqVar.toString();
        }
        return str + ", " + icqVar;
    }
}
