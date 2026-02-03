package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jx {
    final int a;
    int b;
    int c;
    int d;
    ViewGroup e;
    View f;
    View g;
    public oc h;
    ny i;
    Context j;
    boolean k;
    boolean l;
    boolean m;
    boolean n = false;
    boolean o;
    Bundle p;

    public jx(int i) {
        this.a = i;
    }

    final void a(oc ocVar) {
        ny nyVar;
        oc ocVar2 = this.h;
        if (ocVar == ocVar2) {
            return;
        }
        if (ocVar2 != null) {
            ocVar2.m(this.i);
        }
        this.h = ocVar;
        if (ocVar == null || (nyVar = this.i) == null) {
            return;
        }
        ocVar.g(nyVar);
    }
}
