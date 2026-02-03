package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bgb {
    public final int a;
    bgv b;
    public final bbb c;
    public final Rect d;
    public final int e;
    public final int f;
    public final Matrix g;
    public final String h;
    final ListenableFuture j;
    public final bge l;
    public int k = -1;
    public final List i = new ArrayList();

    public bgb(bji bjiVar, bgv bgvVar, bge bgeVar, ListenableFuture listenableFuture, int i) {
        this.a = i;
        this.b = bgvVar;
        this.c = bgvVar.g();
        this.f = bgvVar.b();
        this.e = bgvVar.c();
        this.d = bgvVar.e();
        this.g = bgvVar.d();
        this.l = bgeVar;
        this.h = String.valueOf(bjiVar.hashCode());
        List<bjm> listA = bjiVar.a();
        listA.getClass();
        for (bjm bjmVar : listA) {
            this.i.add(0);
        }
        this.j = listenableFuture;
    }

    final boolean a() {
        return this.l.f;
    }
}
