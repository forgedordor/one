package defpackage;

import com.google.android.apps.messaging.R;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zlv extends fcyz implements fdat {
    int a;
    final /* synthetic */ zlz b;
    final /* synthetic */ Optional c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zlv(zlz zlzVar, Optional optional, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = zlzVar;
        this.c = optional;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zlv) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            zlz zlzVar = this.b;
            this.a = 1;
            obj = zlzVar.d(this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            zlz zlzVar2 = this.b;
            final Optional optional = this.c;
            zlzVar2.g.b(new fdap() { // from class: zlu
                @Override // defpackage.fdap
                public final Object invoke(Object obj2) {
                    return ((xre) optional.get()).a((ahat) obj2);
                }
            });
        } else {
            zlz zlzVar3 = this.b;
            ((dakl) zlzVar3.k.b()).j(zlzVar3.b.getString(R.string.custom_theme_tombstone_change_link_disabled_toast));
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new zlv(this.b, this.c, fcxyVar);
    }
}
