package defpackage;

import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bmi {
    public static bmh g(bjz bjzVar) {
        bhk bhkVar = new bhk();
        if (bjzVar == null) {
            throw new NullPointerException("Null surface");
        }
        bhkVar.a = bjzVar;
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            throw new NullPointerException("Null sharedSurfaces");
        }
        bhkVar.b = list;
        bhkVar.c(-1);
        bhkVar.c = -1;
        bhkVar.b(azv.b);
        return bhkVar;
    }

    public abstract int a();

    public abstract azv b();

    public abstract bjz c();

    public abstract List d();

    public abstract void e();

    public abstract void f();
}
