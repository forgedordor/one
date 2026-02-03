package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class np implements op {
    protected final Context a;
    public Context b;
    public oc c;
    public final LayoutInflater d;
    public oo e;
    public or f;
    public int g;

    public np(Context context) {
        this.a = context;
        this.d = LayoutInflater.from(context);
    }

    @Override // defpackage.op
    public final int a() {
        return this.g;
    }

    public View b(of ofVar, View view, ViewGroup viewGroup) {
        throw null;
    }

    @Override // defpackage.op
    public void c(Context context, oc ocVar) {
        throw null;
    }

    @Override // defpackage.op
    public void d(oc ocVar, boolean z) {
        throw null;
    }

    @Override // defpackage.op
    public final void e(oo ooVar) {
        throw null;
    }

    @Override // defpackage.op
    public void f(boolean z) {
        throw null;
    }

    @Override // defpackage.op
    public boolean g() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [oc] */
    @Override // defpackage.op
    public boolean h(ox oxVar) {
        oo ooVar = this.e;
        ox oxVar2 = oxVar;
        if (ooVar == null) {
            return false;
        }
        if (oxVar == null) {
            oxVar2 = this.c;
        }
        return ooVar.b(oxVar2);
    }

    @Override // defpackage.op
    public final boolean i(of ofVar) {
        return false;
    }

    @Override // defpackage.op
    public final boolean j(of ofVar) {
        return false;
    }
}
