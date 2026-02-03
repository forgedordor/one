package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dayg extends fcyz implements fdau {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    final /* synthetic */ daym c;
    final /* synthetic */ ctcj d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dayg(daym daymVar, ctcj ctcjVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.c = daymVar;
        this.d = ctcjVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        dayg daygVar = new dayg(this.c, this.d, (fcxy) obj3);
        daygVar.a = (dauz) obj;
        daygVar.b = (chnc) obj2;
        return daygVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        Object obj2 = this.a;
        boolean z = obj2 instanceof dauw;
        Object obj3 = this.b;
        if (z || (obj2 instanceof daux)) {
            return null;
        }
        if (!(obj2 instanceof dauy)) {
            throw new fctg();
        }
        final daym daymVar = this.c;
        final ctcj ctcjVar = this.d;
        int i = ctcjVar.ordinal() != 2 ? R.string.welcome_customization_title_v2 : R.string.welcome_new_user_title;
        Context context = daymVar.a;
        String string = context.getString(i);
        string.getClass();
        String string2 = ctcjVar.ordinal() == 2 ? context.getString(R.string.welcome_customization_title_v2) : null;
        String strC = daymVar.c((chnc) obj3);
        final fduf fdufVarA = fdvf.a(false);
        daxs daxsVar = new daxs(fcva.g(new daxn(daymVar.c(chnc.SHARE_TO_EVERYONE), new fdae() { // from class: daxx
            @Override // defpackage.fdae
            public final Object invoke() {
                daymVar.d(chnc.SHARE_TO_EVERYONE, ctcjVar);
                fdufVarA.f(false);
                return fctx.a;
            }
        }), new daxn(daymVar.c(chnc.SHARE_TO_CONTACTS_ONLY), new fdae() { // from class: daxy
            @Override // defpackage.fdae
            public final Object invoke() {
                daymVar.d(chnc.SHARE_TO_CONTACTS_ONLY, ctcjVar);
                fdufVarA.f(false);
                return fctx.a;
            }
        }), new daxn(daymVar.c(chnc.SHARE_TO_NO_ONE), new fdae() { // from class: daxz
            @Override // defpackage.fdae
            public final Object invoke() {
                daymVar.d(chnc.SHARE_TO_NO_ONE, ctcjVar);
                fdufVarA.f(false);
                return fctx.a;
            }
        })), fdufVarA, new fdap() { // from class: daya
            @Override // defpackage.fdap
            public final Object invoke(Object obj4) {
                Boolean bool = (Boolean) obj4;
                bool.booleanValue();
                fdufVarA.f(bool);
                return fctx.a;
            }
        });
        fcsu fcsuVar = daymVar.c;
        return new daxu(string, string2, strC, daxsVar, new daye(fcsuVar.b()), new dayf(fcsuVar.b()), new daxt(((askd) daymVar.m.b()).a()), ctcjVar);
    }
}
