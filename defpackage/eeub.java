package defpackage;

import android.view.View;
import com.google.android.material.snackbar.BaseTransientBottomBar;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eeub implements ldn {
    final /* synthetic */ BaseTransientBottomBar a;

    public eeub(BaseTransientBottomBar baseTransientBottomBar) {
        this.a = baseTransientBottomBar;
    }

    @Override // defpackage.ldn
    public final lgt ez(View view, lgt lgtVar) {
        BaseTransientBottomBar baseTransientBottomBar = this.a;
        baseTransientBottomBar.m = lgtVar.a();
        baseTransientBottomBar.n = lgtVar.b();
        baseTransientBottomBar.o = lgtVar.c();
        baseTransientBottomBar.k();
        return lgtVar;
    }
}
