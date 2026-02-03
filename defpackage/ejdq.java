package defpackage;

import android.R;
import android.content.Intent;
import android.net.Uri;
import com.google.chat.smartmessaging.penpal.ui.EmotifyActivity;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejdq extends fcyz implements fdat {
    int a;
    final /* synthetic */ ejdt b;
    final /* synthetic */ ejfj c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ejdq(ejdt ejdtVar, ejfj ejfjVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ejdtVar;
        this.c = ejfjVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ejdq) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            final ejdt ejdtVar = this.b;
            fcsu fcsuVar = ejdtVar.a;
            String stringExtra = ((EmotifyActivity) fcsuVar.b()).getIntent().getStringExtra("image_uri");
            fdci fdciVar = new fdci();
            if (stringExtra != null) {
                fdciVar.a = Uri.parse(stringExtra);
            }
            ejfn ejfnVar = new ejfn();
            eyhj.e(ejfnVar);
            cg cgVar = new cg(((EmotifyActivity) fcsuVar.b()).a());
            cgVar.s(R.id.content, ejfnVar);
            cgVar.c();
            ejfj ejfjVar = this.c;
            ejfjVar.v = new fdae() { // from class: ejdl
                @Override // defpackage.fdae
                public final Object invoke() {
                    ejdtVar.a(0, new Intent());
                    return fctx.a;
                }
            };
            Object objB = fcsuVar.b();
            objB.getClass();
            acy.a((abi) objB, new hxd(593959971, true, new ejdn(ejfjVar)));
            if (((EmotifyActivity) fcsuVar.b()).getIntent().getBooleanExtra("enable_edge_to_edge", false)) {
                Object objB2 = fcsuVar.b();
                objB2.getClass();
                abl.a((abi) objB2);
            }
            fdtj fdtjVar = new fdtj(ejfjVar.u);
            ejdp ejdpVar = new ejdp(ejfjVar, ejfnVar, fdciVar, ejdtVar);
            this.a = 1;
            if (fdtjVar.a(ejdpVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ejdq(this.b, this.c, fcxyVar);
    }
}
