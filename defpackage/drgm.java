package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drgm implements fbni {
    public static volatile drgm a;
    private static final drgl b = new drgl();
    private final drgt c;

    public drgm(drgt drgtVar) {
        drgtVar.getClass();
        this.c = drgtVar;
    }

    @Override // defpackage.fbni
    public final fbnh a(fbrk fbrkVar, fbnc fbncVar, fbnd fbndVar) {
        drgl drglVar = b;
        fbnb fbnbVar = fbxs.c;
        Collection collection = (Collection) fbncVar.h(fbnbVar);
        ArrayList arrayList = collection == null ? new ArrayList() : new ArrayList(collection);
        drgt drgtVar = this.c;
        arrayList.add(drglVar);
        return drgtVar.a(fbrkVar, fbncVar.f(fbnbVar, DesugarCollections.unmodifiableList(arrayList)), fbndVar);
    }
}
