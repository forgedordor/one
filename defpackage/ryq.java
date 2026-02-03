package defpackage;

import android.graphics.Path;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ryq extends ryt {
    public float a;
    public final float b;
    public final Path c;
    final /* synthetic */ ryv d;

    public ryq(ryv ryvVar, float f, float f2, Path path) {
        this.d = ryvVar;
        this.a = f;
        this.b = f2;
        this.c = path;
    }

    @Override // defpackage.ryt
    public final void a(String str) {
        String str2;
        ryv ryvVar = this.d;
        if (ryvVar.i()) {
            Path path = new Path();
            str2 = str;
            ryvVar.d.d.getTextPath(str2, 0, str.length(), this.a, this.b, path);
            this.c.addPath(path);
        } else {
            str2 = str;
        }
        this.a += ryvVar.d.d.measureText(str2);
    }

    @Override // defpackage.ryt
    public final boolean b(ryd rydVar) {
        if (!(rydVar instanceof rye)) {
            return true;
        }
        ryv.h("Using <textPath> elements in a clip path is not supported.", new Object[0]);
        return false;
    }
}
