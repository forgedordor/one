package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvfe {
    public static final ezol a(String str) {
        ezok ezokVar = (ezok) ezol.a.createBuilder();
        felm felmVar = felm.DITTO;
        ezokVar.copyOnWrite();
        ((ezol) ezokVar.instance).b = felmVar.a();
        ezokVar.copyOnWrite();
        ezol ezolVar = (ezol) ezokVar.instance;
        str.getClass();
        ezolVar.c = str;
        ezokVar.copyOnWrite();
        ((ezol) ezokVar.instance).d = "Bugle";
        return (ezol) ezokVar.build();
    }

    public static final ezol b(String str, bvdu bvduVar) {
        felm felmVar = felm.DITTO;
        if (bvduVar.equals(bvdu.GAIA)) {
            felmVar = felm.EMAIL;
        }
        felm felmVar2 = felm.EMAIL;
        if (!felmVar.equals(felmVar2)) {
            return a(str);
        }
        ezok ezokVar = (ezok) ezol.a.createBuilder();
        ezokVar.copyOnWrite();
        ((ezol) ezokVar.instance).b = felmVar2.a();
        ezokVar.copyOnWrite();
        ezol ezolVar = (ezol) ezokVar.instance;
        str.getClass();
        ezolVar.c = str;
        ezokVar.copyOnWrite();
        ((ezol) ezokVar.instance).d = "GDitto";
        return (ezol) ezokVar.build();
    }
}
