package defpackage;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class klc extends fdbr implements fdae {
    final /* synthetic */ Context a;
    final /* synthetic */ fdap b;
    final /* synthetic */ hnb c;
    final /* synthetic */ hyk d;
    final /* synthetic */ int e;
    final /* synthetic */ View f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public klc(Context context, fdap fdapVar, hnb hnbVar, hyk hykVar, int i, View view) {
        super(0);
        this.a = context;
        this.b = fdapVar;
        this.c = hnbVar;
        this.d = hykVar;
        this.e = i;
        this.f = view;
    }

    @Override // defpackage.fdae
    public final /* bridge */ /* synthetic */ Object invoke() {
        KeyEvent.Callback callback = this.f;
        callback.getClass();
        fdap fdapVar = this.b;
        Context context = this.a;
        View view = (View) fdapVar.invoke(context);
        iqt iqtVar = new iqt();
        hyk hykVar = this.d;
        return new klr(context, this.c, view, iqtVar, hykVar, this.e, (jfh) callback).w;
    }
}
