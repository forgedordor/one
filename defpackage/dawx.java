package defpackage;

import android.content.Intent;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dawx implements fdat {
    final /* synthetic */ daxa a;

    public dawx(daxa daxaVar) {
        this.a = daxaVar;
    }

    @Override // defpackage.fdat
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            hpt hptVar = lyx.a;
            lxq lxqVarA = (lxq) hmlVar.e(lyx.a);
            if (lxqVarA == null) {
                hmlVar.v(1260197609);
                lxqVarA = lxs.a((View) hmlVar.e(AndroidCompositionLocals_androidKt.f));
            } else {
                hmlVar.v(1260196493);
            }
            hmlVar.o();
            if (lxqVarA == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            boolean z = lxqVarA instanceof luv;
            lyp lypVarT = z ? ((luv) lxqVarA).T() : lyn.a;
            int i = fdcj.a;
            dbab dbabVar = (dbab) (z ? lxi.a(lxqVarA.S(), ((luv) lxqVarA).R(), lypVarT) : lxi.b(lxqVarA, null, 6)).b(new fdbi(dbab.class));
            Intent intent = this.a.a.getIntent();
            intent.getClass();
            ctcj ctcjVarA = daug.a(intent);
            ctcjVarA.getClass();
            dayz.c(((daym) dbabVar.a.b()).a(ctcjVarA), hmlVar, 0);
        }
        return fctx.a;
    }
}
