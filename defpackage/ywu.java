package defpackage;

import android.net.Uri;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ywu extends fcyz implements fdat {
    int a;
    final /* synthetic */ yww b;
    final /* synthetic */ ajlt c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ywu(yww ywwVar, ajlt ajltVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ywwVar;
        this.c = ajltVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ywu) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            yww ywwVar = this.b;
            ((cvpp) ywwVar.f.b()).a(2);
            this.a = 1;
            obj = ywwVar.a(this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        final yww ywwVar2 = this.b;
        final ajlt ajltVar = this.c;
        final String str = (String) obj;
        ywwVar2.e.b(new fdap() { // from class: ywt
            @Override // defpackage.fdap
            public final Object invoke(Object obj2) {
                String str2 = str;
                final yww ywwVar3 = ywwVar2;
                String str3 = ywwVar3.g;
                final ahat ahatVar = (ahat) obj2;
                List listB = fcva.b(new diio("https://support.google.com/messages/?p=premium_sms", fdgn.O(str2, str3, 0, false, 6), fdgn.O(str2, str3, 0, false, 6) + str3.length(), new fdap() { // from class: ywq
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj3) {
                        yww ywwVar4 = ywwVar3;
                        ((cvpp) ywwVar4.f.b()).a(5);
                        Uri uri = Uri.parse("https://support.google.com/messages/?p=premium_sms");
                        uri.getClass();
                        ywwVar4.d.h(new agdi(uri));
                        return true;
                    }
                }, 24));
                fdae fdaeVar = new fdae() { // from class: ywr
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        yww ywwVar4 = ywwVar3;
                        ((cvpp) ywwVar4.f.b()).a(4);
                        ywwVar4.d.h(new agem());
                        ahatVar.a();
                        return fctx.a;
                    }
                };
                final ajlt ajltVar2 = ajltVar;
                return new zzk(new fdae() { // from class: ywo
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        ((cvpp) ywwVar3.f.b()).a(3);
                        return fctx.a;
                    }
                }, str2, listB, fdaeVar, new fdae() { // from class: ywp
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        yww ywwVar4 = ywwVar3;
                        auvw.k(ywwVar4.a, ywwVar4.b, null, new ywv(ywwVar4, ajltVar2, null), 2);
                        ahatVar.a();
                        return fctx.a;
                    }
                });
            }
        });
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ywu(this.b, this.c, fcxyVar);
    }
}
