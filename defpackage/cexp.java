package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final /* synthetic */ class cexp {
    public static epes a(int i) {
        epeq epeqVar = (epeq) epes.a.createBuilder();
        if (i == -2) {
            epeqVar.copyOnWrite();
            ((epes) epeqVar.instance).b = eper.a(3);
        } else if (i == -1) {
            epeqVar.copyOnWrite();
            ((epes) epeqVar.instance).b = eper.a(2);
        } else if (i < 0) {
            epeqVar.copyOnWrite();
            ((epes) epeqVar.instance).b = eper.a(2);
        } else {
            epeqVar.copyOnWrite();
            ((epes) epeqVar.instance).b = eper.a(4);
            epeqVar.copyOnWrite();
            ((epes) epeqVar.instance).c = i;
        }
        return (epes) epeqVar.build();
    }

    public static String b(int i) {
        return String.format("#%06X", Integer.valueOf(i & 16777215));
    }
}
