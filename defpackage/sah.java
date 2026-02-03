package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sah {
    public static final sah a = new sah();
    public final ArrayList b;
    public final List c;
    public saf d;

    public sah() {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        DesugarCollections.unmodifiableList(arrayList);
        this.c = new CopyOnWriteArrayList();
    }
}
