package defpackage;

import com.google.android.libraries.compose.ui.composable.HugoHostFragment;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpdu extends fcyz implements fdat {
    final /* synthetic */ jfw a;
    final /* synthetic */ fdat b;
    final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpdu(jfw jfwVar, fdat fdatVar, Object obj, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = jfwVar;
        this.b = fdatVar;
        this.c = obj;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpdu) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        HugoHostFragment hugoHostFragment = (HugoHostFragment) this.a.a;
        if (hugoHostFragment != null) {
            this.b.a(hugoHostFragment, this.c);
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dpdu(this.a, this.b, this.c, fcxyVar);
    }
}
