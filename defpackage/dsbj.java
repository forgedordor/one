package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dsbj {
    public abstract int a();

    public abstract etns b();

    public final evoc c() {
        evnx evnxVar = (evnx) evoc.a.createBuilder();
        int iA = a();
        evnz evnzVar = iA != 1 ? iA != 2 ? evnz.ORIENTATION_UNKNOWN : evnz.ORIENTATION_LANDSCAPE : evnz.ORIENTATION_PORTRAIT;
        evnxVar.copyOnWrite();
        evoc evocVar = (evoc) evnxVar.instance;
        evocVar.c = evnzVar.d;
        evocVar.b |= 1;
        int iOrdinal = b().ordinal();
        evob evobVar = iOrdinal != 1 ? iOrdinal != 2 ? evob.THEME_UNKNOWN : evob.THEME_DARK : evob.THEME_LIGHT;
        evnxVar.copyOnWrite();
        evoc evocVar2 = (evoc) evnxVar.instance;
        evocVar2.d = evobVar.d;
        evocVar2.b |= 2;
        return (evoc) evnxVar.build();
    }
}
