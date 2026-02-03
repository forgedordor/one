package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kov {
    public static final /* synthetic */ fdeh[] a;
    public final kqt b;
    public final kot e;
    public final kos f;
    public final kot g;
    public final kos h;
    public final kow c = new kow("parent");
    private final kou i = new kou(this, new kpr("wrap"));
    public final kou d = new kou(this, new kpr("wrap"));

    static {
        fdbv fdbvVar = new fdbv(kov.class, "width", "getWidth()Landroidx/constraintlayout/compose/Dimension;", 0);
        int i = fdcj.a;
        a = new fdeh[]{fdbvVar, new fdbv(kov.class, "height", "getHeight()Landroidx/constraintlayout/compose/Dimension;", 0), new fdbv(kov.class, "visibility", "getVisibility()Landroidx/constraintlayout/compose/Visibility;", 0), new fdbv(kov.class, "scaleX", "getScaleX()F", 0), new fdbv(kov.class, "scaleY", "getScaleY()F", 0), new fdbv(kov.class, "rotationX", "getRotationX()F", 0), new fdbv(kov.class, "rotationY", "getRotationY()F", 0), new fdbv(kov.class, "rotationZ", "getRotationZ()F", 0), new fdbv(kov.class, "translationX", "getTranslationX-D9Ej5fM()F", 0), new fdbv(kov.class, "translationY", "getTranslationY-D9Ej5fM()F", 0), new fdbv(kov.class, "translationZ", "getTranslationZ-D9Ej5fM()F", 0), new fdbv(kov.class, "pivotX", "getPivotX()F", 0), new fdbv(kov.class, "pivotY", "getPivotY()F", 0), new fdbv(kov.class, "horizontalChainWeight", "getHorizontalChainWeight()F", 0), new fdbv(kov.class, "verticalChainWeight", "getVerticalChainWeight()F", 0)};
    }

    public kov(kqt kqtVar) {
        this.b = kqtVar;
        this.e = new kpp(-2, kqtVar);
        this.f = new kox(0, kqtVar);
        this.g = new kpp(-1, kqtVar);
        this.h = new kox(1, kqtVar);
    }

    public final void a(kpr kprVar) {
        this.i.d(a[0], kprVar);
    }
}
