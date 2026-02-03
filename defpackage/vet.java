package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vet extends fcyz implements fdav {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    final /* synthetic */ vev d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vet(vev vevVar, fcxy fcxyVar) {
        super(4, fcxyVar);
        this.d = vevVar;
    }

    @Override // defpackage.fdav
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        vet vetVar = new vet(this.d, (fcxy) obj4);
        vetVar.a = (ekgb) obj;
        vetVar.b = (ajlk) obj2;
        vetVar.c = (ajlh) obj3;
        return vetVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [ajlk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [ajlh, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        Object obj2 = this.a;
        final ?? r2 = this.b;
        final ?? r3 = this.c;
        final vev vevVar = this.d;
        if (vevVar.d.e || r2.c() == ajlj.RBM || !r2.n()) {
            return null;
        }
        String string = vevVar.a.getString(R.string.contact_picker_title_add_people);
        string.getClass();
        final ekgb ekgbVar = (ekgb) obj2;
        return new dihq(string, djrr.bB, false, !r5.d, false, false, null, false, null, new fdae() { // from class: ves
            @Override // defpackage.fdae
            public final Object invoke() {
                vevVar.h.a(ekgbVar, r2, r3);
                return fctx.a;
            }
        }, 1012);
    }
}
