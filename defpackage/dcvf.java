package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcvf implements dcvj {
    final /* synthetic */ FrameLayout a;
    final /* synthetic */ LayoutInflater b;
    final /* synthetic */ ViewGroup c;
    final /* synthetic */ Bundle d;
    final /* synthetic */ dcvk e;

    public dcvf(dcvk dcvkVar, FrameLayout frameLayout, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.a = frameLayout;
        this.b = layoutInflater;
        this.c = viewGroup;
        this.d = bundle;
        this.e = dcvkVar;
    }

    @Override // defpackage.dcvj
    public final int a() {
        return 2;
    }

    @Override // defpackage.dcvj
    public final void b() {
        FrameLayout frameLayout = this.a;
        frameLayout.removeAllViews();
        frameLayout.addView(this.e.a.a(this.b, this.c, this.d));
    }
}
