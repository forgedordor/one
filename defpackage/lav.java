package defpackage;

import android.content.Context;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lav implements Callable {
    final /* synthetic */ String a;
    final /* synthetic */ Context b;
    final /* synthetic */ lat c;
    final /* synthetic */ int d;

    public lav(String str, Context context, lat latVar, int i) {
        this.a = str;
        this.b = context;
        this.c = latVar;
        this.d = i;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        Object[] objArr = {this.c};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        obj.getClass();
        arrayList.add(obj);
        return lba.a(this.a, this.b, DesugarCollections.unmodifiableList(arrayList), this.d);
    }
}
