package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmtc implements dmix {
    private final dmts a;

    public dmtc(dmts dmtsVar) {
        this.a = dmtsVar;
    }

    @Override // defpackage.dmix
    public final dmiz a(ViewGroup viewGroup, dmiv dmivVar, fdap fdapVar) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mini_camera, viewGroup, false);
        dmts dmtsVar = this.a;
        Context context = (Context) dmtsVar.a.b();
        context.getClass();
        ea eaVar = (ea) ((eyig) dmtsVar.b).a;
        dmpx dmpxVar = (dmpx) dmtsVar.c.b();
        dngc dngcVar = (dngc) dmtsVar.d.b();
        dngcVar.getClass();
        fdjx fdjxVar = (fdjx) dmtsVar.e.b();
        fdjxVar.getClass();
        Optional optional = (Optional) dmtsVar.f.b();
        dnhb dnhbVar = (dnhb) dmtsVar.g.b();
        dnhbVar.getClass();
        viewInflate.getClass();
        return new dmtr(context, eaVar, dmpxVar, dngcVar, fdjxVar, optional, dnhbVar, viewInflate, dmivVar, fdapVar);
    }
}
